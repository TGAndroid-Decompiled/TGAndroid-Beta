package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.util.SparseArray;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.ui.ky0;
public class MrzRecognizer {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z9 = true;
        for (int i7 = 0; i7 < charArray.length; i7++) {
            if (!z9 && Character.isLetter(charArray[i7])) {
                charArray[i7] = Character.toLowerCase(charArray[i7]);
            } else if (charArray[i7] == ' ') {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return new String(charArray);
    }

    public static int b(String str) {
        int i7;
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i10 = 0;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 >= '0' && c10 <= '9') {
                i7 = c10 - '0';
            } else if (c10 >= 'A' && c10 <= 'Z') {
                i7 = c10 - '7';
            } else {
                i7 = 0;
            }
            i10 += i7 * iArr[i11 % 3];
        }
        return i10 % 10;
    }

    private static native Rect[][] binarizeAndFindCharacters(Bitmap bitmap, Bitmap bitmap2);

    public static String c(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        int i7 = 0;
        String str2 = str;
        while (i7 < 33) {
            int i10 = i7 + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i7, i10), strArr[i7]);
            i7 = i10;
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

    public static int e(char c10) {
        if (c10 == 'O') {
            return 0;
        }
        if (c10 == 'I') {
            return 1;
        }
        if (c10 == 'B') {
            return 8;
        }
        return c10 - '0';
    }

    public static void f(String str, zr zrVar) {
        int i7;
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            zrVar.f26915i = parseInt;
            if (parseInt < (Calendar.getInstance().get(1) % 100) - 5) {
                i7 = zrVar.f26915i + 2000;
            } else {
                i7 = zrVar.f26915i + 1900;
            }
            zrVar.f26915i = i7;
            zrVar.f26916j = Integer.parseInt(str.substring(2, 4));
            zrVar.f26917k = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static native int[] findCornerPoints(Bitmap bitmap);

    public static void g(String str, zr zrVar) {
        try {
            if ("<<<<<<".equals(str)) {
                zrVar.f26921o = true;
                return;
            }
            zrVar.f26913f = Integer.parseInt(str.substring(0, 2)) + 2000;
            zrVar.f26914g = Integer.parseInt(str.substring(2, 4));
            zrVar.h = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    public static int h(char c10) {
        if (c10 != 'F') {
            if (c10 != 'M') {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public static zr i(Bitmap bitmap) {
        u8.e eVar;
        int i7;
        u8.n nVar = new u8.n(new com.google.android.gms.internal.vision.t2(t0.f25566b, (com.google.android.gms.internal.vision.x1) new Object()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        ky0 ky0Var = new ky0(17);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ky0Var.d = bitmap;
        b7.d dVar = (b7.d) ky0Var.f47422b;
        dVar.f2991a = width;
        dVar.f2992b = height;
        SparseArray e12 = nVar.e1(ky0Var);
        int i10 = 0;
        for (int i11 = 0; i11 < e12.size(); i11++) {
            u8.m mVar = (u8.m) e12.valueAt(i11);
            int i12 = mVar.d;
            int i13 = 6;
            int i14 = 4;
            if (i12 == 12 && (eVar = mVar.D) != null) {
                ?? obj = new Object();
                if ("ID".equals(eVar.f56421a)) {
                    i7 = 2;
                } else {
                    i7 = 4;
                }
                obj.f26909a = i7;
                String str = mVar.D.D;
                str.getClass();
                if (!str.equals("CAN")) {
                    if (str.equals("USA")) {
                        obj.f26918l = "US";
                        obj.f26919m = "US";
                    }
                } else {
                    obj.f26918l = "CA";
                    obj.f26919m = "CA";
                }
                obj.f26910b = a(mVar.D.f56422b);
                obj.f26911c = a(mVar.D.d);
                obj.d = a(mVar.D.f56423c);
                u8.e eVar2 = mVar.D;
                obj.f26912e = eVar2.f56428s;
                String str2 = eVar2.f56424e;
                if (str2 != null) {
                    if (!str2.equals("1")) {
                        if (str2.equals("2")) {
                            obj.f26920n = 2;
                        }
                    } else {
                        obj.f26920n = 1;
                    }
                }
                if ("USA".equals(obj.f26918l)) {
                    i14 = 0;
                    i10 = 4;
                    i13 = 2;
                }
                try {
                    String str3 = mVar.D.f56431y;
                    if (str3 != null && str3.length() == 8) {
                        obj.f26915i = Integer.parseInt(mVar.D.f56431y.substring(i10, i10 + 4));
                        obj.f26916j = Integer.parseInt(mVar.D.f56431y.substring(i14, i14 + 2));
                        obj.f26917k = Integer.parseInt(mVar.D.f56431y.substring(i13, i13 + 2));
                    }
                    String str4 = mVar.D.f56430x;
                    if (str4 != null && str4.length() == 8) {
                        obj.f26913f = Integer.parseInt(mVar.D.f56430x.substring(i10, i10 + 4));
                        obj.f26914g = Integer.parseInt(mVar.D.f56430x.substring(i14, i14 + 2));
                        obj.h = Integer.parseInt(mVar.D.f56430x.substring(i13, i13 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return obj;
            }
            if (i12 == 7 && mVar.f56451a == 2048 && mVar.f56452b.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(mVar.f56452b, 0), "windows-1251").split("\\|");
                    if (split.length >= 10) {
                        ?? obj2 = new Object();
                        obj2.f26909a = 4;
                        obj2.f26918l = "RU";
                        obj2.f26919m = "RU";
                        obj2.f26912e = split[0];
                        obj2.f26913f = Integer.parseInt(split[2].substring(0, 4));
                        obj2.f26914g = Integer.parseInt(split[2].substring(4, 6));
                        obj2.h = Integer.parseInt(split[2].substring(6));
                        obj2.f26911c = a(c(split[3]));
                        obj2.f26910b = a(c(split[4]));
                        obj2.d = a(c(split[5]));
                        obj2.f26915i = Integer.parseInt(split[6].substring(0, 4));
                        obj2.f26916j = Integer.parseInt(split[6].substring(4, 6));
                        obj2.f26917k = Integer.parseInt(split[6].substring(6));
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

    public static org.telegram.messenger.zr j(android.graphics.Bitmap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MrzRecognizer.j(android.graphics.Bitmap):org.telegram.messenger.zr");
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i7]);
            if (indexOf != -1) {
                charArray[i7] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static native String performRecognition(Bitmap bitmap, int i7, int i10, AssetManager assetManager);

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);
}
