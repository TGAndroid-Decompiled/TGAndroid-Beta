package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import java.util.Calendar;
import java.util.HashMap;

public class MrzRecognizer {

    public static class Result {
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_UNKNOWN = 0;
        public static final int TYPE_DRIVER_LICENSE = 4;
        public static final int TYPE_ID = 2;
        public static final int TYPE_INTERNAL_PASSPORT = 3;
        public static final int TYPE_PASSPORT = 1;
        public int birthDay;
        public int birthMonth;
        public int birthYear;
        public boolean doesNotExpire;
        public int expiryDay;
        public int expiryMonth;
        public int expiryYear;
        public String firstName;
        public int gender;
        public String issuingCountry;
        public String lastName;
        public boolean mainCheckDigitIsValid;
        public String middleName;
        public String nationality;
        public String number;
        public String rawMRZ;
        public int type;
    }

    private static native Rect[][] binarizeAndFindCharacters(Bitmap bitmap, Bitmap bitmap2);

    private static native int[] findCornerPoints(Bitmap bitmap);

    private static int getNumber(char c) {
        if (c == 'O') {
            return 0;
        }
        if (c == 'I') {
            return 1;
        }
        if (c == 'B') {
            return 8;
        }
        return c - '0';
    }

    private static int parseGender(char c) {
        if (c != 'F') {
            return c != 'M' ? 0 : 1;
        }
        return 2;
    }

    private static native String performRecognition(Bitmap bitmap, int i, int i2, AssetManager assetManager);

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);

    public static Result recognize(Bitmap bitmap, boolean z) {
        Result resultRecognizeBarcode;
        Result resultRecognizeBarcode2;
        if (z && (resultRecognizeBarcode2 = recognizeBarcode(bitmap)) != null) {
            return resultRecognizeBarcode2;
        }
        try {
            Result resultRecognizeMRZ = recognizeMRZ(bitmap);
            if (resultRecognizeMRZ != null) {
                return resultRecognizeMRZ;
            }
        } catch (Exception unused) {
        }
        if (z || (resultRecognizeBarcode = recognizeBarcode(bitmap)) == null) {
            return null;
        }
        return resultRecognizeBarcode;
    }

    private static Result recognizeBarcode(Bitmap bitmap) {
        BarcodeDetector barcodeDetectorBuild = new BarcodeDetector.Builder(ApplicationLoader.applicationContext).build();
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float fMax = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMax), Math.round(bitmap.getHeight() * fMax), true);
        }
        SparseArray sparseArrayDetect = barcodeDetectorBuild.detect(new Frame.Builder().setBitmap(bitmap).build());
        int i = 0;
        for (int i2 = 0; i2 < sparseArrayDetect.size(); i2++) {
            Barcode barcode = (Barcode) sparseArrayDetect.valueAt(i2);
            int i3 = barcode.valueFormat;
            int i4 = 6;
            int i5 = 4;
            if (i3 == 12 && barcode.driverLicense != null) {
                Result result = new Result();
                result.type = "ID".equals(barcode.driverLicense.documentType) ? 2 : 4;
                String str = barcode.driverLicense.issuingCountry;
                str.hashCode();
                if (str.equals("CAN")) {
                    result.issuingCountry = "CA";
                    result.nationality = "CA";
                } else if (str.equals("USA")) {
                    result.issuingCountry = "US";
                    result.nationality = "US";
                }
                result.firstName = capitalize(barcode.driverLicense.firstName);
                result.lastName = capitalize(barcode.driverLicense.lastName);
                result.middleName = capitalize(barcode.driverLicense.middleName);
                Barcode.DriverLicense driverLicense = barcode.driverLicense;
                result.number = driverLicense.licenseNumber;
                String str2 = driverLicense.gender;
                if (str2 != null) {
                    if (str2.equals("1")) {
                        result.gender = 1;
                    } else if (str2.equals("2")) {
                        result.gender = 2;
                    }
                }
                if ("USA".equals(result.issuingCountry)) {
                    i = 4;
                    i4 = 2;
                    i5 = 0;
                }
                try {
                    String str3 = barcode.driverLicense.birthDate;
                    if (str3 != null && str3.length() == 8) {
                        result.birthYear = Integer.parseInt(barcode.driverLicense.birthDate.substring(i, i + 4));
                        result.birthMonth = Integer.parseInt(barcode.driverLicense.birthDate.substring(i5, i5 + 2));
                        result.birthDay = Integer.parseInt(barcode.driverLicense.birthDate.substring(i4, i4 + 2));
                    }
                    String str4 = barcode.driverLicense.expiryDate;
                    if (str4 != null && str4.length() == 8) {
                        result.expiryYear = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i, i + 4));
                        result.expiryMonth = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i5, i5 + 2));
                        result.expiryDay = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i4, i4 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return result;
            }
            if (i3 == 7 && barcode.format == 2048 && barcode.rawValue.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] strArrSplit = new String(Base64.decode(barcode.rawValue, 0), "windows-1251").split("\\|");
                    if (strArrSplit.length >= 10) {
                        Result result2 = new Result();
                        result2.type = 4;
                        result2.issuingCountry = "RU";
                        result2.nationality = "RU";
                        result2.number = strArrSplit[0];
                        result2.expiryYear = Integer.parseInt(strArrSplit[2].substring(0, 4));
                        result2.expiryMonth = Integer.parseInt(strArrSplit[2].substring(4, 6));
                        result2.expiryDay = Integer.parseInt(strArrSplit[2].substring(6));
                        result2.lastName = capitalize(cyrillicToLatin(strArrSplit[3]));
                        result2.firstName = capitalize(cyrillicToLatin(strArrSplit[4]));
                        result2.middleName = capitalize(cyrillicToLatin(strArrSplit[5]));
                        result2.birthYear = Integer.parseInt(strArrSplit[6].substring(0, 4));
                        result2.birthMonth = Integer.parseInt(strArrSplit[6].substring(4, 6));
                        result2.birthDay = Integer.parseInt(strArrSplit[6].substring(6));
                        return result2;
                    }
                    continue;
                } catch (Exception unused2) {
                    continue;
                }
            }
        }
        return null;
    }

    private static org.telegram.messenger.MrzRecognizer.Result recognizeMRZ(android.graphics.Bitmap r28) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MrzRecognizer.recognizeMRZ(android.graphics.Bitmap):org.telegram.messenger.MrzRecognizer$Result");
    }

    public static Result recognize(byte[] bArr, int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        setYuvBitmapPixels(bitmapCreateBitmap, bArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(i3);
        int iMin = Math.min(i, i2);
        int iRound = Math.round(iMin * 0.704f);
        boolean z = i3 == 90 || i3 == 270;
        return recognize(Bitmap.createBitmap(bitmapCreateBitmap, z ? (i / 2) - (iRound / 2) : 0, z ? 0 : (i2 / 2) - (iRound / 2), z ? iRound : iMin, z ? iMin : iRound, matrix, false), false);
    }

    private static String capitalize(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            if (!z && Character.isLetter(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else {
                z = charArray[i] == ' ';
            }
        }
        return new String(charArray);
    }

    private static int checksum(String str) {
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i = 0;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            i += ((c < '0' || c > '9') ? (c < 'A' || c > 'Z') ? 0 : c - '7' : c - '0') * iArr[i2 % 3];
        }
        return i % 10;
    }

    private static void parseBirthDate(String str, Result result) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str.substring(0, 2));
            result.birthYear = i;
            result.birthYear += i < (Calendar.getInstance().get(1) % 100) + (-5) ? 2000 : 1900;
            result.birthMonth = Integer.parseInt(str.substring(2, 4));
            result.birthDay = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static void parseExpiryDate(String str, Result result) {
        try {
            if ("<<<<<<".equals(str)) {
                result.doesNotExpire = true;
            } else {
                result.expiryYear = Integer.parseInt(str.substring(0, 2)) + 2000;
                result.expiryMonth = Integer.parseInt(str.substring(2, 4));
                result.expiryDay = Integer.parseInt(str.substring(4));
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static String russianPassportTranslit(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int iIndexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i]);
            if (iIndexOf != -1) {
                charArray[i] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(iIndexOf);
            }
        }
        return new String(charArray);
    }

    private static String cyrillicToLatin(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        String strReplace = str;
        int i = 0;
        while (i < 33) {
            int i2 = i + 1;
            strReplace = strReplace.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i, i2), strArr[i]);
            i = i2;
        }
        return strReplace;
    }

    private static HashMap<String, String> getCountriesMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("AFG", "AF");
        map.put("ALA", "AX");
        map.put("ALB", "AL");
        map.put("DZA", "DZ");
        map.put("ASM", "AS");
        map.put("AND", "AD");
        map.put("AGO", "AO");
        map.put("AIA", "AI");
        map.put("ATA", "AQ");
        map.put("ATG", "AG");
        map.put("ARG", "AR");
        map.put("ARM", "AM");
        map.put("ABW", "AW");
        map.put("AUS", "AU");
        map.put("AUT", "AT");
        map.put("AZE", "AZ");
        map.put("BHS", "BS");
        map.put("BHR", "BH");
        map.put("BGD", "BD");
        map.put("BRB", "BB");
        map.put("BLR", "BY");
        map.put("BEL", "BE");
        map.put("BLZ", "BZ");
        map.put("BEN", "BJ");
        map.put("BMU", "BM");
        map.put("BTN", "BT");
        map.put("BOL", "BO");
        map.put("BES", "BQ");
        map.put("BIH", "BA");
        map.put("BWA", "BW");
        map.put("BVT", "BV");
        map.put("BRA", "BR");
        map.put("IOT", "IO");
        map.put("BRN", "BN");
        map.put("BGR", "BG");
        map.put("BFA", "BF");
        map.put("BDI", "BI");
        map.put("CPV", "CV");
        map.put("KHM", "KH");
        map.put("CMR", "CM");
        map.put("CAN", "CA");
        map.put("CYM", "KY");
        map.put("CAF", "CF");
        map.put("TCD", "TD");
        map.put("CHL", "CL");
        map.put("CHN", "CN");
        map.put("CXR", "CX");
        map.put("CCK", "CC");
        map.put("COL", "CO");
        map.put("COM", "KM");
        map.put("COG", "CG");
        map.put("COD", "CD");
        map.put("COK", "CK");
        map.put("CRI", "CR");
        map.put("CIV", "CI");
        map.put("HRV", "HR");
        map.put("CUB", "CU");
        map.put("CUW", "CW");
        map.put("CYP", "CY");
        map.put("CZE", "CZ");
        map.put("DNK", "DK");
        map.put("DJI", "DJ");
        map.put("DMA", "DM");
        map.put("DOM", "DO");
        map.put("ECU", "EC");
        map.put("EGY", "EG");
        map.put("SLV", "SV");
        map.put("GNQ", "GQ");
        map.put("ERI", "ER");
        map.put("EST", "EE");
        map.put("ETH", "ET");
        map.put("FLK", "FK");
        map.put("FRO", "FO");
        map.put("FJI", "FJ");
        map.put("FIN", "FI");
        map.put("FRA", "FR");
        map.put("GUF", "GF");
        map.put("PYF", "PF");
        map.put("ATF", "TF");
        map.put("GAB", "GA");
        map.put("GMB", "GM");
        map.put("GEO", "GE");
        map.put("D<<", "DE");
        map.put("GHA", "GH");
        map.put("GIB", "GI");
        map.put("GRC", "GR");
        map.put("GRL", "GL");
        map.put("GRD", "GD");
        map.put("GLP", "GP");
        map.put("GUM", "GU");
        map.put("GTM", "GT");
        map.put("GGY", "GG");
        map.put("GIN", "GN");
        map.put("GNB", "GW");
        map.put("GUY", "GY");
        map.put("HTI", "HT");
        map.put("HMD", "HM");
        map.put("VAT", "VA");
        map.put("HND", "HN");
        map.put("HKG", "HK");
        map.put("HUN", "HU");
        map.put("ISL", "IS");
        map.put("IND", "IN");
        map.put("IDN", "ID");
        map.put("IRN", "IR");
        map.put("IRQ", "IQ");
        map.put("IRL", "IE");
        map.put("IMN", "IM");
        map.put("ISR", "IL");
        map.put("ITA", "IT");
        map.put("JAM", "JM");
        map.put("JPN", "JP");
        map.put("JEY", "JE");
        map.put("JOR", "JO");
        map.put("KAZ", "KZ");
        map.put("KEN", "KE");
        map.put("KIR", "KI");
        map.put("PRK", "KP");
        map.put("KOR", "KR");
        map.put("KWT", "KW");
        map.put("KGZ", "KG");
        map.put("LAO", "LA");
        map.put("LVA", "LV");
        map.put("LBN", "LB");
        map.put("LSO", "LS");
        map.put("LBR", "LR");
        map.put("LBY", "LY");
        map.put("LIE", "LI");
        map.put("LTU", "LT");
        map.put("LUX", "LU");
        map.put("MAC", "MO");
        map.put("MKD", "MK");
        map.put("MDG", "MG");
        map.put("MWI", "MW");
        map.put("MYS", "MY");
        map.put("MDV", "MV");
        map.put("MLI", "ML");
        map.put("MLT", "MT");
        map.put("MHL", "MH");
        map.put("MTQ", "MQ");
        map.put("MRT", "MR");
        map.put("MUS", "MU");
        map.put("MYT", "YT");
        map.put("MEX", "MX");
        map.put("FSM", "FM");
        map.put("MDA", "MD");
        map.put("MCO", "MC");
        map.put("MNG", "MN");
        map.put("MNE", "ME");
        map.put("MSR", "MS");
        map.put("MAR", "MA");
        map.put("MOZ", "MZ");
        map.put("MMR", "MM");
        map.put("NAM", "NA");
        map.put("NRU", "NR");
        map.put("NPL", "NP");
        map.put("NLD", "NL");
        map.put("NCL", "NC");
        map.put("NZL", "NZ");
        map.put("NIC", "NI");
        map.put("NER", "NE");
        map.put("NGA", "NG");
        map.put("NIU", "NU");
        map.put("NFK", "NF");
        map.put("MNP", "MP");
        map.put("NOR", "NO");
        map.put("OMN", "OM");
        map.put("PAK", "PK");
        map.put("PLW", "PW");
        map.put("PSE", "PS");
        map.put("PAN", "PA");
        map.put("PNG", "PG");
        map.put("PRY", "PY");
        map.put("PER", "PE");
        map.put("PHL", "PH");
        map.put("PCN", "PN");
        map.put("POL", "PL");
        map.put("PRT", "PT");
        map.put("PRI", "PR");
        map.put("QAT", "QA");
        map.put("REU", "RE");
        map.put("ROU", "RO");
        map.put("RUS", "RU");
        map.put("RWA", "RW");
        map.put("BLM", "BL");
        map.put("SHN", "SH");
        map.put("KNA", "KN");
        map.put("LCA", "LC");
        map.put("MAF", "MF");
        map.put("SPM", "PM");
        map.put("VCT", "VC");
        map.put("WSM", "WS");
        map.put("SMR", "SM");
        map.put("STP", "ST");
        map.put("SAU", "SA");
        map.put("SEN", "SN");
        map.put("SRB", "RS");
        map.put("SYC", "SC");
        map.put("SLE", "SL");
        map.put("SGP", "SG");
        map.put("SXM", "SX");
        map.put("SVK", "SK");
        map.put("SVN", "SI");
        map.put("SLB", "SB");
        map.put("SOM", "SO");
        map.put("ZAF", "ZA");
        map.put("SGS", "GS");
        map.put("SSD", "SS");
        map.put("ESP", "ES");
        map.put("LKA", "LK");
        map.put("SDN", "SD");
        map.put("SUR", "SR");
        map.put("SJM", "SJ");
        map.put("SWZ", "SZ");
        map.put("SWE", "SE");
        map.put("CHE", "CH");
        map.put("SYR", "SY");
        map.put("TWN", "TW");
        map.put("TJK", "TJ");
        map.put("TZA", "TZ");
        map.put("THA", "TH");
        map.put("TLS", "TL");
        map.put("TGO", "TG");
        map.put("TKL", "TK");
        map.put("TON", "TO");
        map.put("TTO", "TT");
        map.put("TUN", "TN");
        map.put("TUR", "TR");
        map.put("TKM", "TM");
        map.put("TCA", "TC");
        map.put("TUV", "TV");
        map.put("UGA", "UG");
        map.put("UKR", "UA");
        map.put("ARE", "AE");
        map.put("GBR", "GB");
        map.put("USA", "US");
        map.put("UMI", "UM");
        map.put("URY", "UY");
        map.put("UZB", "UZ");
        map.put("VUT", "VU");
        map.put("VEN", "VE");
        map.put("VNM", "VN");
        map.put("VGB", "VG");
        map.put("VIR", "VI");
        map.put("WLF", "WF");
        map.put("ESH", "EH");
        map.put("YEM", "YE");
        map.put("ZMB", "ZM");
        map.put("ZWE", "ZW");
        return map;
    }
}
