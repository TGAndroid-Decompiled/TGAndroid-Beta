package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.util.SparseArray;
import java.util.Calendar;
import java.util.HashMap;
public class MrzRecognizer {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            if (!z && Character.isLetter(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (charArray[i] == ' ') {
                z = true;
            } else {
                z = false;
            }
        }
        return new String(charArray);
    }

    public static int b(String str) {
        int i;
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c = charArray[i3];
            if (c >= '0' && c <= '9') {
                i = c - '0';
            } else if (c >= 'A' && c <= 'Z') {
                i = c - '7';
            } else {
                i = 0;
            }
            i2 += i * iArr[i3 % 3];
        }
        return i2 % 10;
    }

    private static native Rect[][] binarizeAndFindCharacters(Bitmap bitmap, Bitmap bitmap2);

    public static String c(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        int i = 0;
        String str2 = str;
        while (i < 33) {
            int i2 = i + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i, i2), strArr[i]);
            i = i2;
        }
        return str2;
    }

    public static HashMap d() {
        HashMap hashMap = new HashMap();
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

    public static int e(char c) {
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

    public static void f(String str, ei7 ei7Var) {
        int i;
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            ei7Var.i = parseInt;
            int i2 = (Calendar.getInstance().get(1) % 100) - 5;
            int i3 = ei7Var.i;
            if (parseInt < i2) {
                i = i3 + 2000;
            } else {
                i = i3 + 1900;
            }
            ei7Var.i = i;
            ei7Var.j = Integer.parseInt(str.substring(2, 4));
            ei7Var.k = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static native int[] findCornerPoints(Bitmap bitmap);

    public static void g(String str, ei7 ei7Var) {
        try {
            if ("<<<<<<".equals(str)) {
                ei7Var.o = true;
                return;
            }
            ei7Var.f = Integer.parseInt(str.substring(0, 2)) + 2000;
            ei7Var.g = Integer.parseInt(str.substring(2, 4));
            ei7Var.h = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    public static int h(char c) {
        if (c != 'F') {
            if (c != 'M') {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public static ei7 i(Bitmap bitmap) {
        re0 re0Var;
        byte b;
        af0 af0Var = new af0(new cgd(a.b, (qwe) new Object()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        int i = 4;
        pm3 pm3Var = new pm3((byte) 4);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        pm3Var.d = bitmap;
        rc0 rc0Var = (rc0) pm3Var.b;
        rc0Var.a = width;
        rc0Var.b = height;
        SparseArray h = af0Var.h(pm3Var);
        int i2 = 0;
        for (int i3 = 0; i3 < h.size(); i3++) {
            ze0 ze0Var = (ze0) h.valueAt(i3);
            int i4 = ze0Var.d;
            int i5 = 6;
            if (i4 == 12 && (re0Var = ze0Var.E) != null) {
                ?? obj = new Object();
                if ("ID".equals(re0Var.a)) {
                    b = 2;
                } else {
                    b = 4;
                }
                obj.a = b;
                String str = ze0Var.E.E;
                str.getClass();
                if (!str.equals("CAN")) {
                    if (str.equals("USA")) {
                        obj.l = "US";
                        obj.m = "US";
                    }
                } else {
                    obj.l = "CA";
                    obj.m = "CA";
                }
                obj.b = a(ze0Var.E.b);
                obj.c = a(ze0Var.E.d);
                obj.d = a(ze0Var.E.c);
                re0 re0Var2 = ze0Var.E;
                obj.e = re0Var2.s;
                String str2 = re0Var2.e;
                if (str2 != null) {
                    if (!str2.equals("1")) {
                        if (str2.equals("2")) {
                            obj.n = 2;
                        }
                    } else {
                        obj.n = 1;
                    }
                }
                if ("USA".equals(obj.l)) {
                    i5 = 2;
                } else {
                    i = 0;
                    i2 = 4;
                }
                try {
                    String str3 = ze0Var.E.y;
                    if (str3 != null && str3.length() == 8) {
                        obj.i = Integer.parseInt(ze0Var.E.y.substring(i, i + 4));
                        obj.j = Integer.parseInt(ze0Var.E.y.substring(i2, i2 + 2));
                        obj.k = Integer.parseInt(ze0Var.E.y.substring(i5, i5 + 2));
                    }
                    String str4 = ze0Var.E.x;
                    if (str4 != null && str4.length() == 8) {
                        obj.f = Integer.parseInt(ze0Var.E.x.substring(i, i + 4));
                        obj.g = Integer.parseInt(ze0Var.E.x.substring(i2, i2 + 2));
                        obj.h = Integer.parseInt(ze0Var.E.x.substring(i5, i5 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return obj;
            }
            if (i4 == 7 && ze0Var.a == 2048 && ze0Var.b.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(ze0Var.b, 0), "windows-1251").split("\\|");
                    if (split.length >= 10) {
                        ?? obj2 = new Object();
                        obj2.a = (byte) 4;
                        obj2.l = "RU";
                        obj2.m = "RU";
                        obj2.e = split[0];
                        obj2.f = Integer.parseInt(split[2].substring(0, 4));
                        obj2.g = Integer.parseInt(split[2].substring(4, 6));
                        obj2.h = Integer.parseInt(split[2].substring(6));
                        obj2.c = a(c(split[3]));
                        obj2.b = a(c(split[4]));
                        obj2.d = a(c(split[5]));
                        obj2.i = Integer.parseInt(split[6].substring(0, 4));
                        obj2.j = Integer.parseInt(split[6].substring(4, 6));
                        obj2.k = Integer.parseInt(split[6].substring(6));
                        return obj2;
                    }
                    continue;
                } catch (Exception unused2) {
                    continue;
                }
            }
        }
        return null;
    }

    public static defpackage.ei7 j(android.graphics.Bitmap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MrzRecognizer.j(android.graphics.Bitmap):ei7");
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i]);
            if (indexOf != -1) {
                charArray[i] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static native String performRecognition(Bitmap bitmap, int i, int i2, AssetManager assetManager);

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);
}
