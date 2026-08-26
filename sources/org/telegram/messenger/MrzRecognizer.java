package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.Frame$Metadata;
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

    private static String capitalize(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            if (z || !Character.isLetter(charArray[i])) {
                z = charArray[i] == ' ';
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
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

    private static native int[] findCornerPoints(Bitmap bitmap);

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

    private static void parseBirthDate(String str, Result result) {
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
                return;
            }
            result.expiryYear = Integer.parseInt(str.substring(0, 2)) + 2000;
            result.expiryMonth = Integer.parseInt(str.substring(2, 4));
            result.expiryDay = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static int parseGender(char c) {
        if (c != 'F') {
            return c != 'M' ? 0 : 1;
        }
        return 2;
    }

    private static native String performRecognition(Bitmap bitmap, int i, int i2, AssetManager assetManager);

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
        BarcodeDetector barcodeDetector = new BarcodeDetector(new zzm(ApplicationLoader.applicationContext, new zzk()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float fMax = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMax), Math.round(bitmap.getHeight() * fMax), true);
        }
        com.google.zxing.Result result = new com.google.zxing.Result();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        result.resultMetadata = bitmap;
        Frame$Metadata frame$Metadata = (Frame$Metadata) result.text;
        frame$Metadata.zza = width;
        frame$Metadata.zzb = height;
        SparseArray sparseArrayDetect = barcodeDetector.detect(result);
        int i = 0;
        for (int i2 = 0; i2 < sparseArrayDetect.size(); i2++) {
            Barcode barcode = (Barcode) sparseArrayDetect.valueAt(i2);
            int i3 = barcode.valueFormat;
            int i4 = 4;
            int i5 = 2;
            if (i3 == 12 && barcode.driverLicense != null) {
                Result result2 = new Result();
                result2.type = "ID".equals(barcode.driverLicense.documentType) ? 2 : 4;
                String str = barcode.driverLicense.issuingCountry;
                str.getClass();
                if (str.equals("CAN")) {
                    result2.issuingCountry = "CA";
                    result2.nationality = "CA";
                } else if (str.equals("USA")) {
                    result2.issuingCountry = "US";
                    result2.nationality = "US";
                }
                result2.firstName = capitalize(barcode.driverLicense.firstName);
                result2.lastName = capitalize(barcode.driverLicense.lastName);
                result2.middleName = capitalize(barcode.driverLicense.middleName);
                Barcode.DriverLicense driverLicense = barcode.driverLicense;
                result2.number = driverLicense.licenseNumber;
                String str2 = driverLicense.gender;
                if (str2 != null) {
                    if (str2.equals("1")) {
                        result2.gender = 1;
                    } else if (str2.equals("2")) {
                        result2.gender = 2;
                    }
                }
                if ("USA".equals(result2.issuingCountry)) {
                    i = 4;
                    i4 = 0;
                } else {
                    i5 = 6;
                }
                try {
                    String str3 = barcode.driverLicense.birthDate;
                    if (str3 != null && str3.length() == 8) {
                        result2.birthYear = Integer.parseInt(barcode.driverLicense.birthDate.substring(i, i + 4));
                        result2.birthMonth = Integer.parseInt(barcode.driverLicense.birthDate.substring(i4, i4 + 2));
                        result2.birthDay = Integer.parseInt(barcode.driverLicense.birthDate.substring(i5, i5 + 2));
                    }
                    String str4 = barcode.driverLicense.expiryDate;
                    if (str4 != null && str4.length() == 8) {
                        result2.expiryYear = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i, i + 4));
                        result2.expiryMonth = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i4, i4 + 2));
                        result2.expiryDay = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i5, i5 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return result2;
            }
            if (i3 == 7 && barcode.format == 2048 && barcode.rawValue.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] strArrSplit = new String(Base64.decode(barcode.rawValue, 0), "windows-1251").split("\\|");
                    if (strArrSplit.length >= 10) {
                        Result result3 = new Result();
                        result3.type = 4;
                        result3.issuingCountry = "RU";
                        result3.nationality = "RU";
                        result3.number = strArrSplit[0];
                        result3.expiryYear = Integer.parseInt(strArrSplit[2].substring(0, 4));
                        result3.expiryMonth = Integer.parseInt(strArrSplit[2].substring(4, 6));
                        result3.expiryDay = Integer.parseInt(strArrSplit[2].substring(6));
                        result3.lastName = capitalize(cyrillicToLatin(strArrSplit[3]));
                        result3.firstName = capitalize(cyrillicToLatin(strArrSplit[4]));
                        result3.middleName = capitalize(cyrillicToLatin(strArrSplit[5]));
                        result3.birthYear = Integer.parseInt(strArrSplit[6].substring(0, 4));
                        result3.birthMonth = Integer.parseInt(strArrSplit[6].substring(4, 6));
                        result3.birthDay = Integer.parseInt(strArrSplit[6].substring(6));
                        return result3;
                    }
                    continue;
                } catch (Exception unused2) {
                    continue;
                }
            }
        }
        return null;
    }

    private static Result recognizeMRZ(Bitmap bitmap) {
        float fMax;
        char c;
        Bitmap bitmapCreateScaledBitmap;
        char c2;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2;
        Rect[][] rectArr;
        int i;
        int iMax;
        int i2;
        int i3;
        Canvas canvas;
        Paint paint;
        Rect rect;
        int i4;
        int i5;
        String strPerformRecognition;
        String[] strArrSplit;
        int i6;
        int length;
        int i7;
        int i8;
        Matrix matrix;
        Bitmap bitmapCreateBitmap2;
        Bitmap bitmapCreateBitmap3;
        Rect[][] rectArrBinarizeAndFindCharacters;
        int i9;
        Bitmap bitmapCreateScaledBitmap2 = bitmap;
        if (bitmapCreateScaledBitmap2.getWidth() > 512 || bitmapCreateScaledBitmap2.getHeight() > 512) {
            fMax = 512.0f / Math.max(bitmapCreateScaledBitmap2.getWidth(), bitmapCreateScaledBitmap2.getHeight());
            c = 4;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap2, Math.round(bitmapCreateScaledBitmap2.getWidth() * fMax), Math.round(bitmapCreateScaledBitmap2.getHeight() * fMax), true);
        } else {
            bitmapCreateScaledBitmap = bitmapCreateScaledBitmap2;
            fMax = 1.0f;
            c = 4;
        }
        int[] iArrFindCornerPoints = findCornerPoints(bitmapCreateScaledBitmap);
        float f = 1.0f / fMax;
        if (iArrFindCornerPoints != null) {
            Point point = new Point(iArrFindCornerPoints[0], iArrFindCornerPoints[1]);
            Point point2 = new Point(iArrFindCornerPoints[2], iArrFindCornerPoints[3]);
            Point point3 = new Point(iArrFindCornerPoints[c], iArrFindCornerPoints[5]);
            Point point4 = new Point(iArrFindCornerPoints[6], iArrFindCornerPoints[7]);
            if (point2.x < point.x) {
                point3 = point4;
                point4 = point3;
            } else {
                point = point2;
                point2 = point;
            }
            c2 = 0;
            double dHypot = Math.hypot(point.x - point2.x, point.y - point2.y);
            Point point5 = point;
            double dHypot2 = Math.hypot(point4.x - point3.x, point4.y - point3.y);
            Point point6 = point3;
            double dHypot3 = Math.hypot(point3.x - point2.x, point3.y - point2.y);
            double dHypot4 = Math.hypot(point4.x - point5.x, point4.y - point5.y);
            double d = dHypot / dHypot3;
            double d2 = dHypot / dHypot4;
            double d3 = dHypot2 / dHypot3;
            double d4 = dHypot2 / dHypot4;
            if (d >= 1.35d && d <= 1.75d && d3 >= 1.35d && d3 <= 1.75d && d2 >= 1.35d && d2 <= 1.75d && d4 >= 1.35d && d4 <= 1.75d) {
                bitmapCreateBitmap = Bitmap.createBitmap(1024, (int) Math.round(1024.0d / ((((d + d2) + d3) + d4) / 4.0d)), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float width = bitmapCreateBitmap.getWidth();
                float width2 = bitmapCreateBitmap.getWidth();
                float height = bitmapCreateBitmap.getHeight();
                float height2 = bitmapCreateBitmap.getHeight();
                float[] fArr = new float[8];
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = width;
                fArr[3] = 0.0f;
                fArr[c] = width2;
                fArr[5] = height;
                fArr[6] = 0.0f;
                fArr[7] = height2;
                float f2 = point2.x * f;
                float f3 = point2.y * f;
                float f4 = point5.x * f;
                float f5 = point5.y * f;
                float f6 = point4.x * f;
                float f7 = point4.y * f;
                float f8 = point6.x * f;
                float f9 = point6.y * f;
                float[] fArr2 = new float[8];
                fArr2[0] = f2;
                fArr2[1] = f3;
                fArr2[2] = f4;
                fArr2[3] = f5;
                fArr2[c] = f6;
                fArr2[5] = f7;
                fArr2[6] = f8;
                fArr2[7] = f9;
                Matrix matrix2 = new Matrix();
                matrix2.setPolyToPoly(fArr2, 0, fArr, 0, 4);
                canvas2.drawBitmap(bitmapCreateScaledBitmap2, matrix2, new Paint(2));
            }
            bitmap2 = null;
            rectArr = null;
            i = 0;
            iMax = 0;
            i2 = 0;
            while (true) {
                if (i < 3) {
                    i3 = 2;
                    break;
                }
                if (i != 1) {
                    Matrix matrix3 = new Matrix();
                    matrix3.setRotate(1.0f, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                    matrix = matrix3;
                } else if (i != 2) {
                    matrix = null;
                } else {
                    Matrix matrix4 = new Matrix();
                    matrix4.setRotate(-1.0f, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                    matrix = matrix4;
                }
                if (matrix != null) {
                    bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                } else {
                    bitmapCreateBitmap2 = bitmapCreateBitmap;
                }
                bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), Bitmap.Config.ALPHA_8);
                rectArrBinarizeAndFindCharacters = binarizeAndFindCharacters(bitmapCreateBitmap2, bitmapCreateBitmap3);
                if (rectArrBinarizeAndFindCharacters == null) {
                    for (Rect[] rectArr2 : rectArrBinarizeAndFindCharacters) {
                        iMax = Math.max(rectArr2.length, iMax);
                        if (rectArr2.length > 0) {
                            i2++;
                        }
                    }
                    i3 = 2;
                    if (i2 < 2 && iMax >= 30) {
                        rectArr = rectArrBinarizeAndFindCharacters;
                        bitmap2 = bitmapCreateBitmap3;
                        break;
                    }
                    i++;
                    rectArr = rectArrBinarizeAndFindCharacters;
                    bitmap2 = bitmapCreateBitmap3;
                }
                return null;
            }
            if (iMax >= 30 && i2 >= i3) {
                Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(rectArr[c2].length * 10, rectArr.length * 15, Bitmap.Config.ALPHA_8);
                canvas = new Canvas(bitmapCreateBitmap4);
                paint = new Paint(2);
                rect = new Rect(0, 0, 10, 15);
                i5 = 0;
                for (Rect[] rectArr3 : rectArr) {
                    i7 = 0;
                    i8 = 0;
                    for (length = rectArr3.length; i7 < length; length = length) {
                        Rect rect2 = rectArr3[i7];
                        int i10 = i8 * 10;
                        int i11 = i5 * 15;
                        rect.set(i10, i11, i10 + 10, i11 + 15);
                        canvas.drawBitmap(bitmap2, rect2, rect, paint);
                        i8++;
                        i7++;
                    }
                    i5++;
                }
                strPerformRecognition = performRecognition(bitmapCreateBitmap4, rectArr.length, rectArr[0].length, ApplicationLoader.applicationContext.getAssets());
                if (strPerformRecognition == null) {
                    return null;
                }
                strArrSplit = TextUtils.split(strPerformRecognition, "\n");
                Result result = new Result();
                if (strArrSplit.length >= 2 || strArrSplit[0].length() < 30 || strArrSplit[1].length() != strArrSplit[0].length()) {
                    return null;
                }
                result.rawMRZ = TextUtils.join("\n", strArrSplit);
                HashMap<String, String> countriesMap = getCountriesMap();
                char cCharAt = strArrSplit[0].charAt(0);
                if (cCharAt == 'P') {
                    result.type = 1;
                    if (strArrSplit[0].length() == 44) {
                        result.issuingCountry = strArrSplit[0].substring(2, 5);
                        int iIndexOf = strArrSplit[0].indexOf("<<", 6);
                        if (iIndexOf != -1) {
                            result.lastName = strArrSplit[0].substring(5, iIndexOf).replace('<', ' ').replace('0', 'O').trim();
                            String strTrim = strArrSplit[0].substring(iIndexOf + 2).replace('<', ' ').replace('0', 'O').trim();
                            result.firstName = strTrim;
                            if (strTrim.contains("   ")) {
                                String str = result.firstName;
                                i6 = 0;
                                result.firstName = str.substring(0, str.indexOf("   "));
                            } else {
                                i6 = 0;
                            }
                        } else {
                            i6 = 0;
                        }
                        String strTrim2 = strArrSplit[1].substring(i6, 9).replace('<', ' ').replace('O', '0').trim();
                        if (checksum(strTrim2) == getNumber(strArrSplit[1].charAt(9))) {
                            result.number = strTrim2;
                        }
                        result.nationality = strArrSplit[1].substring(10, 13);
                        String strReplace = strArrSplit[1].substring(13, 19).replace('O', '0').replace('I', '1');
                        if (checksum(strReplace) == getNumber(strArrSplit[1].charAt(19))) {
                            parseBirthDate(strReplace, result);
                        }
                        result.gender = parseGender(strArrSplit[1].charAt(20));
                        String strReplace2 = strArrSplit[1].substring(21, 27).replace('O', '0').replace('I', '1');
                        if (checksum(strReplace2) == getNumber(strArrSplit[1].charAt(27)) || strArrSplit[1].charAt(27) == '<') {
                            parseExpiryDate(strReplace2, result);
                        }
                        if ("RUS".equals(result.issuingCountry) && strArrSplit[0].charAt(1) == 'N') {
                            result.type = 3;
                            String[] strArrSplit2 = result.firstName.split(" ");
                            result.firstName = cyrillicToLatin(russianPassportTranslit(strArrSplit2[0]));
                            if (strArrSplit2.length > 1) {
                                result.middleName = cyrillicToLatin(russianPassportTranslit(strArrSplit2[1]));
                            }
                            result.lastName = cyrillicToLatin(russianPassportTranslit(result.lastName));
                            if (result.number != null) {
                                result.number = result.number.substring(0, 3) + strArrSplit[1].charAt(28) + result.number.substring(3);
                            }
                        } else {
                            result.firstName = result.firstName.replace('8', 'B');
                            result.lastName = result.lastName.replace('8', 'B');
                        }
                        result.lastName = capitalize(result.lastName);
                        result.firstName = capitalize(result.firstName);
                        result.middleName = capitalize(result.middleName);
                    }
                } else {
                    if (cCharAt != 'I' && cCharAt != 'A' && cCharAt != 'C') {
                        return null;
                    }
                    result.type = 2;
                    if (strArrSplit.length == 3 && strArrSplit[0].length() == 30 && strArrSplit[2].length() == 30) {
                        result.issuingCountry = strArrSplit[0].substring(2, 5);
                        String strTrim3 = strArrSplit[0].substring(5, 14).replace('<', ' ').replace('O', '0').trim();
                        if (checksum(strTrim3) == strArrSplit[0].charAt(14) - '0') {
                            result.number = strTrim3;
                        }
                        String strReplace3 = strArrSplit[1].substring(0, 6).replace('O', '0').replace('I', '1');
                        if (checksum(strReplace3) == getNumber(strArrSplit[1].charAt(6))) {
                            parseBirthDate(strReplace3, result);
                        }
                        result.gender = parseGender(strArrSplit[1].charAt(7));
                        String strReplace4 = strArrSplit[1].substring(8, 14).replace('O', '0').replace('I', '1');
                        if (checksum(strReplace4) == getNumber(strArrSplit[1].charAt(14)) || strArrSplit[1].charAt(14) == '<') {
                            parseExpiryDate(strReplace4, result);
                        }
                        result.nationality = strArrSplit[1].substring(15, 18);
                        int iIndexOf2 = strArrSplit[2].indexOf("<<");
                        if (iIndexOf2 != -1) {
                            result.lastName = strArrSplit[2].substring(0, iIndexOf2).replace('<', ' ').trim();
                            result.firstName = strArrSplit[2].substring(iIndexOf2 + 2).replace('<', ' ').trim();
                        }
                    } else if (strArrSplit.length == 2 && strArrSplit[0].length() == 36) {
                        String strSubstring = strArrSplit[0].substring(2, 5);
                        result.issuingCountry = strSubstring;
                        if ("FRA".equals(strSubstring) && cCharAt == 'I' && strArrSplit[0].charAt(1) == 'D') {
                            result.nationality = "FRA";
                            result.lastName = strArrSplit[0].substring(5, 30).replace('<', ' ').trim();
                            result.firstName = strArrSplit[1].substring(13, 27).replace("<<", ", ").replace('<', ' ').trim();
                            String strReplace5 = strArrSplit[1].substring(0, 12).replace('O', '0');
                            if (checksum(strReplace5) == getNumber(strArrSplit[1].charAt(12))) {
                                result.number = strReplace5;
                            }
                            String strReplace6 = strArrSplit[1].substring(27, 33).replace('O', '0').replace('I', '1');
                            if (checksum(strReplace6) == getNumber(strArrSplit[1].charAt(33))) {
                                parseBirthDate(strReplace6, result);
                            }
                            result.gender = parseGender(strArrSplit[1].charAt(34));
                            result.doesNotExpire = true;
                        } else {
                            int iIndexOf3 = strArrSplit[0].indexOf("<<");
                            if (iIndexOf3 != -1) {
                                result.lastName = strArrSplit[0].substring(5, iIndexOf3).replace('<', ' ').trim();
                                result.firstName = strArrSplit[0].substring(iIndexOf3 + 2).replace('<', ' ').trim();
                            }
                            String strTrim4 = strArrSplit[1].substring(0, 9).replace('<', ' ').replace('O', '0').trim();
                            if (checksum(strTrim4) == getNumber(strArrSplit[1].charAt(9))) {
                                result.number = strTrim4;
                            }
                            result.nationality = strArrSplit[1].substring(10, 13);
                            String strReplace7 = strArrSplit[1].substring(13, 19).replace('O', '0').replace('I', '1');
                            if (checksum(strReplace7) == getNumber(strArrSplit[1].charAt(19))) {
                                parseBirthDate(strReplace7, result);
                            }
                            result.gender = parseGender(strArrSplit[1].charAt(20));
                            String strReplace8 = strArrSplit[1].substring(21, 27).replace('O', '0').replace('I', '1');
                            if (checksum(strReplace8) == getNumber(strArrSplit[1].charAt(27)) || strArrSplit[1].charAt(27) == '<') {
                                parseExpiryDate(strReplace8, result);
                            }
                        }
                    }
                    result.firstName = capitalize(result.firstName.replace('0', 'O').replace('8', 'B'));
                    result.lastName = capitalize(result.lastName.replace('0', 'O').replace('8', 'B'));
                }
                if (TextUtils.isEmpty(result.firstName) && TextUtils.isEmpty(result.lastName)) {
                    return null;
                }
                result.issuingCountry = countriesMap.get(result.issuingCountry);
                result.nationality = countriesMap.get(result.nationality);
                return result;
            }
            return null;
        }
        c2 = 0;
        if (bitmapCreateScaledBitmap2.getWidth() > 1500 || bitmapCreateScaledBitmap2.getHeight() > 1500) {
            float fMax2 = 1500.0f / Math.max(bitmapCreateScaledBitmap2.getWidth(), bitmapCreateScaledBitmap2.getHeight());
            bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap2, Math.round(bitmapCreateScaledBitmap2.getWidth() * fMax2), Math.round(bitmapCreateScaledBitmap2.getHeight() * fMax2), true);
        }
        bitmapCreateBitmap = bitmapCreateScaledBitmap2;
        bitmap2 = null;
        rectArr = null;
        i = 0;
        iMax = 0;
        i2 = 0;
        while (true) {
            if (i < 3) {
                i3 = 2;
                break;
            }
            if (i != 1) {
                Matrix matrix5 = new Matrix();
                matrix5.setRotate(1.0f, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                matrix = matrix5;
            } else if (i != 2) {
                matrix = null;
            } else {
                Matrix matrix6 = new Matrix();
                matrix6.setRotate(-1.0f, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                matrix = matrix6;
            }
            if (matrix != null) {
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            } else {
                bitmapCreateBitmap2 = bitmapCreateBitmap;
            }
            bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), Bitmap.Config.ALPHA_8);
            rectArrBinarizeAndFindCharacters = binarizeAndFindCharacters(bitmapCreateBitmap2, bitmapCreateBitmap3);
            if (rectArrBinarizeAndFindCharacters == null) {
                while (i9 < r4) {
                    iMax = Math.max(rectArr2.length, iMax);
                    if (rectArr2.length > 0) {
                        i2++;
                    }
                }
                i3 = 2;
                if (i2 < 2) {
                }
                i++;
                rectArr = rectArrBinarizeAndFindCharacters;
                bitmap2 = bitmapCreateBitmap3;
            }
            return null;
        }
        if (iMax >= 30) {
            Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(rectArr[c2].length * 10, rectArr.length * 15, Bitmap.Config.ALPHA_8);
            canvas = new Canvas(bitmapCreateBitmap5);
            paint = new Paint(2);
            rect = new Rect(0, 0, 10, 15);
            i5 = 0;
            while (i4 < r7) {
                i7 = 0;
                i8 = 0;
                while (i7 < length) {
                    Rect rect3 = rectArr3[i7];
                    int i12 = i8 * 10;
                    int i13 = i5 * 15;
                    rect.set(i12, i13, i12 + 10, i13 + 15);
                    canvas.drawBitmap(bitmap2, rect3, rect, paint);
                    i8++;
                    i7++;
                }
                i5++;
            }
            strPerformRecognition = performRecognition(bitmapCreateBitmap5, rectArr.length, rectArr[0].length, ApplicationLoader.applicationContext.getAssets());
            if (strPerformRecognition == null) {
                return null;
            }
            strArrSplit = TextUtils.split(strPerformRecognition, "\n");
            Result result2 = new Result();
            return strArrSplit.length >= 2 ? null : null;
        }
        return null;
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

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);

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
}
