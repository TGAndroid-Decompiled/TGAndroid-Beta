package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Base64;
import android.util.SparseArray;
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
        boolean z4 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (!z4 && Character.isLetter(charArray[i10])) {
                charArray[i10] = Character.toLowerCase(charArray[i10]);
            } else if (charArray[i10] == ' ') {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return new String(charArray);
    }

    private static int checksum(String str) {
        int i10;
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i11 = 0;
        for (int i12 = 0; i12 < charArray.length; i12++) {
            char c3 = charArray[i12];
            if (c3 >= '0' && c3 <= '9') {
                i10 = c3 - '0';
            } else if (c3 >= 'A' && c3 <= 'Z') {
                i10 = c3 - '7';
            } else {
                i10 = 0;
            }
            i11 += i10 * iArr[i12 % 3];
        }
        return i11 % 10;
    }

    private static String cyrillicToLatin(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        String str2 = str;
        int i10 = 0;
        while (i10 < 33) {
            int i11 = i10 + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i10, i11), strArr[i10]);
            i10 = i11;
        }
        return str2;
    }

    private static native int[] findCornerPoints(Bitmap bitmap);

    private static HashMap<String, String> getCountriesMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("AFG", "AF");
        hashMap.put("ALA", "AX");
        hashMap.put("ALB", "AL");
        hashMap.put("DZA", "DZ");
        hashMap.put("ASM", "AS");
        hashMap.put("AND", "AD");
        hashMap.put("AGO", "AO");
        hashMap.put("AIA", "AI");
        hashMap.put("ATA", "AQ");
        hashMap.put("ATG", "AG");
        hashMap.put("ARG", "AR");
        hashMap.put("ARM", "AM");
        hashMap.put("ABW", "AW");
        hashMap.put("AUS", "AU");
        hashMap.put("AUT", "AT");
        hashMap.put("AZE", "AZ");
        hashMap.put("BHS", "BS");
        hashMap.put("BHR", "BH");
        hashMap.put("BGD", "BD");
        hashMap.put("BRB", "BB");
        hashMap.put("BLR", "BY");
        hashMap.put("BEL", "BE");
        hashMap.put("BLZ", "BZ");
        hashMap.put("BEN", "BJ");
        hashMap.put("BMU", "BM");
        hashMap.put("BTN", "BT");
        hashMap.put("BOL", "BO");
        hashMap.put("BES", "BQ");
        hashMap.put("BIH", "BA");
        hashMap.put("BWA", "BW");
        hashMap.put("BVT", "BV");
        hashMap.put("BRA", "BR");
        hashMap.put("IOT", "IO");
        hashMap.put("BRN", "BN");
        hashMap.put("BGR", "BG");
        hashMap.put("BFA", "BF");
        hashMap.put("BDI", "BI");
        hashMap.put("CPV", "CV");
        hashMap.put("KHM", "KH");
        hashMap.put("CMR", "CM");
        hashMap.put("CAN", "CA");
        hashMap.put("CYM", "KY");
        hashMap.put("CAF", "CF");
        hashMap.put("TCD", "TD");
        hashMap.put("CHL", "CL");
        hashMap.put("CHN", "CN");
        hashMap.put("CXR", "CX");
        hashMap.put("CCK", "CC");
        hashMap.put("COL", "CO");
        hashMap.put("COM", "KM");
        hashMap.put("COG", "CG");
        hashMap.put("COD", "CD");
        hashMap.put("COK", "CK");
        hashMap.put("CRI", "CR");
        hashMap.put("CIV", "CI");
        hashMap.put("HRV", "HR");
        hashMap.put("CUB", "CU");
        hashMap.put("CUW", "CW");
        hashMap.put("CYP", "CY");
        hashMap.put("CZE", "CZ");
        hashMap.put("DNK", "DK");
        hashMap.put("DJI", "DJ");
        hashMap.put("DMA", "DM");
        hashMap.put("DOM", "DO");
        hashMap.put("ECU", "EC");
        hashMap.put("EGY", "EG");
        hashMap.put("SLV", "SV");
        hashMap.put("GNQ", "GQ");
        hashMap.put("ERI", "ER");
        hashMap.put("EST", "EE");
        hashMap.put("ETH", "ET");
        hashMap.put("FLK", "FK");
        hashMap.put("FRO", "FO");
        hashMap.put("FJI", "FJ");
        hashMap.put("FIN", "FI");
        hashMap.put("FRA", "FR");
        hashMap.put("GUF", "GF");
        hashMap.put("PYF", "PF");
        hashMap.put("ATF", "TF");
        hashMap.put("GAB", "GA");
        hashMap.put("GMB", "GM");
        hashMap.put("GEO", "GE");
        hashMap.put("D<<", "DE");
        hashMap.put("GHA", "GH");
        hashMap.put("GIB", "GI");
        hashMap.put("GRC", "GR");
        hashMap.put("GRL", "GL");
        hashMap.put("GRD", "GD");
        hashMap.put("GLP", "GP");
        hashMap.put("GUM", "GU");
        hashMap.put("GTM", "GT");
        hashMap.put("GGY", "GG");
        hashMap.put("GIN", "GN");
        hashMap.put("GNB", "GW");
        hashMap.put("GUY", "GY");
        hashMap.put("HTI", "HT");
        hashMap.put("HMD", "HM");
        hashMap.put("VAT", "VA");
        hashMap.put("HND", "HN");
        hashMap.put("HKG", "HK");
        hashMap.put("HUN", "HU");
        hashMap.put("ISL", "IS");
        hashMap.put("IND", "IN");
        hashMap.put("IDN", "ID");
        hashMap.put("IRN", "IR");
        hashMap.put("IRQ", "IQ");
        hashMap.put("IRL", "IE");
        hashMap.put("IMN", "IM");
        hashMap.put("ISR", "IL");
        hashMap.put("ITA", "IT");
        hashMap.put("JAM", "JM");
        hashMap.put("JPN", "JP");
        hashMap.put("JEY", "JE");
        hashMap.put("JOR", "JO");
        hashMap.put("KAZ", "KZ");
        hashMap.put("KEN", "KE");
        hashMap.put("KIR", "KI");
        hashMap.put("PRK", "KP");
        hashMap.put("KOR", "KR");
        hashMap.put("KWT", "KW");
        hashMap.put("KGZ", "KG");
        hashMap.put("LAO", "LA");
        hashMap.put("LVA", "LV");
        hashMap.put("LBN", "LB");
        hashMap.put("LSO", "LS");
        hashMap.put("LBR", "LR");
        hashMap.put("LBY", "LY");
        hashMap.put("LIE", "LI");
        hashMap.put("LTU", "LT");
        hashMap.put("LUX", "LU");
        hashMap.put("MAC", "MO");
        hashMap.put("MKD", "MK");
        hashMap.put("MDG", "MG");
        hashMap.put("MWI", "MW");
        hashMap.put("MYS", "MY");
        hashMap.put("MDV", "MV");
        hashMap.put("MLI", "ML");
        hashMap.put("MLT", "MT");
        hashMap.put("MHL", "MH");
        hashMap.put("MTQ", "MQ");
        hashMap.put("MRT", "MR");
        hashMap.put("MUS", "MU");
        hashMap.put("MYT", "YT");
        hashMap.put("MEX", "MX");
        hashMap.put("FSM", "FM");
        hashMap.put("MDA", "MD");
        hashMap.put("MCO", "MC");
        hashMap.put("MNG", "MN");
        hashMap.put("MNE", "ME");
        hashMap.put("MSR", "MS");
        hashMap.put("MAR", "MA");
        hashMap.put("MOZ", "MZ");
        hashMap.put("MMR", "MM");
        hashMap.put("NAM", "NA");
        hashMap.put("NRU", "NR");
        hashMap.put("NPL", "NP");
        hashMap.put("NLD", "NL");
        hashMap.put("NCL", "NC");
        hashMap.put("NZL", "NZ");
        hashMap.put("NIC", "NI");
        hashMap.put("NER", "NE");
        hashMap.put("NGA", "NG");
        hashMap.put("NIU", "NU");
        hashMap.put("NFK", "NF");
        hashMap.put("MNP", "MP");
        hashMap.put("NOR", "NO");
        hashMap.put("OMN", "OM");
        hashMap.put("PAK", "PK");
        hashMap.put("PLW", "PW");
        hashMap.put("PSE", "PS");
        hashMap.put("PAN", "PA");
        hashMap.put("PNG", "PG");
        hashMap.put("PRY", "PY");
        hashMap.put("PER", "PE");
        hashMap.put("PHL", "PH");
        hashMap.put("PCN", "PN");
        hashMap.put("POL", "PL");
        hashMap.put("PRT", "PT");
        hashMap.put("PRI", "PR");
        hashMap.put("QAT", "QA");
        hashMap.put("REU", "RE");
        hashMap.put("ROU", "RO");
        hashMap.put("RUS", "RU");
        hashMap.put("RWA", "RW");
        hashMap.put("BLM", "BL");
        hashMap.put("SHN", "SH");
        hashMap.put("KNA", "KN");
        hashMap.put("LCA", "LC");
        hashMap.put("MAF", "MF");
        hashMap.put("SPM", "PM");
        hashMap.put("VCT", "VC");
        hashMap.put("WSM", "WS");
        hashMap.put("SMR", "SM");
        hashMap.put("STP", "ST");
        hashMap.put("SAU", "SA");
        hashMap.put("SEN", "SN");
        hashMap.put("SRB", "RS");
        hashMap.put("SYC", "SC");
        hashMap.put("SLE", "SL");
        hashMap.put("SGP", "SG");
        hashMap.put("SXM", "SX");
        hashMap.put("SVK", "SK");
        hashMap.put("SVN", "SI");
        hashMap.put("SLB", "SB");
        hashMap.put("SOM", "SO");
        hashMap.put("ZAF", "ZA");
        hashMap.put("SGS", "GS");
        hashMap.put("SSD", "SS");
        hashMap.put("ESP", "ES");
        hashMap.put("LKA", "LK");
        hashMap.put("SDN", "SD");
        hashMap.put("SUR", "SR");
        hashMap.put("SJM", "SJ");
        hashMap.put("SWZ", "SZ");
        hashMap.put("SWE", "SE");
        hashMap.put("CHE", "CH");
        hashMap.put("SYR", "SY");
        hashMap.put("TWN", "TW");
        hashMap.put("TJK", "TJ");
        hashMap.put("TZA", "TZ");
        hashMap.put("THA", "TH");
        hashMap.put("TLS", "TL");
        hashMap.put("TGO", "TG");
        hashMap.put("TKL", "TK");
        hashMap.put("TON", "TO");
        hashMap.put("TTO", "TT");
        hashMap.put("TUN", "TN");
        hashMap.put("TUR", "TR");
        hashMap.put("TKM", "TM");
        hashMap.put("TCA", "TC");
        hashMap.put("TUV", "TV");
        hashMap.put("UGA", "UG");
        hashMap.put("UKR", "UA");
        hashMap.put("ARE", "AE");
        hashMap.put("GBR", "GB");
        hashMap.put("USA", "US");
        hashMap.put("UMI", "UM");
        hashMap.put("URY", "UY");
        hashMap.put("UZB", "UZ");
        hashMap.put("VUT", "VU");
        hashMap.put("VEN", "VE");
        hashMap.put("VNM", "VN");
        hashMap.put("VGB", "VG");
        hashMap.put("VIR", "VI");
        hashMap.put("WLF", "WF");
        hashMap.put("ESH", "EH");
        hashMap.put("YEM", "YE");
        hashMap.put("ZMB", "ZM");
        hashMap.put("ZWE", "ZW");
        return hashMap;
    }

    private static int getNumber(char c3) {
        if (c3 == 'O') {
            return 0;
        }
        if (c3 == 'I') {
            return 1;
        }
        if (c3 == 'B') {
            return 8;
        }
        return c3 - '0';
    }

    private static void parseBirthDate(String str, Result result) {
        int i10;
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            result.birthYear = parseInt;
            if (parseInt < (Calendar.getInstance().get(1) % 100) - 5) {
                i10 = result.birthYear + 2000;
            } else {
                i10 = result.birthYear + 1900;
            }
            result.birthYear = i10;
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

    private static int parseGender(char c3) {
        if (c3 != 'F') {
            if (c3 != 'M') {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static native String performRecognition(Bitmap bitmap, int i10, int i11, AssetManager assetManager);

    public static Result recognize(Bitmap bitmap, boolean z4) {
        Result recognizeBarcode;
        Result recognizeBarcode2;
        if (!z4 || (recognizeBarcode2 = recognizeBarcode(bitmap)) == null) {
            try {
                Result recognizeMRZ = recognizeMRZ(bitmap);
                if (recognizeMRZ != null) {
                    return recognizeMRZ;
                }
            } catch (Exception unused) {
            }
            if (z4 || (recognizeBarcode = recognizeBarcode(bitmap)) == null) {
                return null;
            }
            return recognizeBarcode;
        }
        return recognizeBarcode2;
    }

    private static Result recognizeBarcode(Bitmap bitmap) {
        int i10;
        f8.n nVar = new f8.n(new com.google.android.gms.internal.vision.t2(ApplicationLoader.applicationContext, (com.google.android.gms.internal.vision.x1) new Object()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        af.d dVar = new af.d(15);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        dVar.d = bitmap;
        e8.a aVar = (e8.a) dVar.f159b;
        aVar.f5162a = width;
        aVar.f5163b = height;
        SparseArray L = nVar.L(dVar);
        int i11 = 0;
        for (int i12 = 0; i12 < L.size(); i12++) {
            f8.m mVar = (f8.m) L.valueAt(i12);
            int i13 = mVar.d;
            int i14 = 6;
            int i15 = 4;
            if (i13 == 12 && mVar.f6089y != null) {
                Result result = new Result();
                if ("ID".equals(mVar.f6089y.f6052a)) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
                result.type = i10;
                String str = mVar.f6089y.f6061y;
                str.getClass();
                if (!str.equals("CAN")) {
                    if (str.equals("USA")) {
                        result.issuingCountry = "US";
                        result.nationality = "US";
                    }
                } else {
                    result.issuingCountry = "CA";
                    result.nationality = "CA";
                }
                result.firstName = capitalize(mVar.f6089y.f6053b);
                result.lastName = capitalize(mVar.f6089y.d);
                result.middleName = capitalize(mVar.f6089y.f6054c);
                f8.e eVar = mVar.f6089y;
                result.number = eVar.f6058s;
                String str2 = eVar.e;
                if (str2 != null) {
                    if (!str2.equals("1")) {
                        if (str2.equals("2")) {
                            result.gender = 2;
                        }
                    } else {
                        result.gender = 1;
                    }
                }
                if ("USA".equals(result.issuingCountry)) {
                    i11 = 4;
                    i14 = 2;
                    i15 = 0;
                }
                try {
                    String str3 = mVar.f6089y.f6060x;
                    if (str3 != null && str3.length() == 8) {
                        result.birthYear = Integer.parseInt(mVar.f6089y.f6060x.substring(i11, i11 + 4));
                        result.birthMonth = Integer.parseInt(mVar.f6089y.f6060x.substring(i15, i15 + 2));
                        result.birthDay = Integer.parseInt(mVar.f6089y.f6060x.substring(i14, i14 + 2));
                    }
                    String str4 = mVar.f6089y.f6059w;
                    if (str4 != null && str4.length() == 8) {
                        result.expiryYear = Integer.parseInt(mVar.f6089y.f6059w.substring(i11, i11 + 4));
                        result.expiryMonth = Integer.parseInt(mVar.f6089y.f6059w.substring(i15, i15 + 2));
                        result.expiryDay = Integer.parseInt(mVar.f6089y.f6059w.substring(i14, i14 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return result;
            }
            if (i13 == 7 && mVar.f6080a == 2048 && mVar.f6081b.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(mVar.f6081b, 0), "windows-1251").split("\\|");
                    if (split.length >= 10) {
                        Result result2 = new Result();
                        result2.type = 4;
                        result2.issuingCountry = "RU";
                        result2.nationality = "RU";
                        result2.number = split[0];
                        result2.expiryYear = Integer.parseInt(split[2].substring(0, 4));
                        result2.expiryMonth = Integer.parseInt(split[2].substring(4, 6));
                        result2.expiryDay = Integer.parseInt(split[2].substring(6));
                        result2.lastName = capitalize(cyrillicToLatin(split[3]));
                        result2.firstName = capitalize(cyrillicToLatin(split[4]));
                        result2.middleName = capitalize(cyrillicToLatin(split[5]));
                        result2.birthYear = Integer.parseInt(split[6].substring(0, 4));
                        result2.birthMonth = Integer.parseInt(split[6].substring(4, 6));
                        result2.birthDay = Integer.parseInt(split[6].substring(6));
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

    private static org.telegram.messenger.MrzRecognizer.Result recognizeMRZ(android.graphics.Bitmap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MrzRecognizer.recognizeMRZ(android.graphics.Bitmap):org.telegram.messenger.MrzRecognizer$Result");
    }

    private static String russianPassportTranslit(String str) {
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i10]);
            if (indexOf != -1) {
                charArray[i10] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);

    public static Result recognize(byte[] bArr, int i10, int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        setYuvBitmapPixels(createBitmap, bArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(i12);
        int min = Math.min(i10, i11);
        int round = Math.round(min * 0.704f);
        boolean z4 = i12 == 90 || i12 == 270;
        return recognize(Bitmap.createBitmap(createBitmap, z4 ? (i10 / 2) - (round / 2) : 0, z4 ? 0 : (i11 / 2) - (round / 2), z4 ? round : min, z4 ? min : round, matrix, false), false);
    }
}
