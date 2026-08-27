package d5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class q {

    public static final ArrayList f4823a = new ArrayList();

    public static final Pattern f4824b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrQ = g0.Q(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrQ) {
                if (str2.equals(c(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int b(String str, String str2) {
        p pVarE;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (pVarE = e(str2)) == null) {
                    return 0;
                }
                return pVarE.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        p pVarE;
        String strD = null;
        if (str != null) {
            String strB = h7.d0.b(str.trim());
            if (strB.startsWith("avc1") || strB.startsWith("avc3")) {
                return "video/avc";
            }
            if (strB.startsWith("hev1") || strB.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strB.startsWith("dvav") || strB.startsWith("dva1") || strB.startsWith("dvhe") || strB.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strB.startsWith("av01")) {
                return "video/av01";
            }
            if (strB.startsWith("vp9") || strB.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strB.startsWith("vp8") || strB.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strB.startsWith("mp4a")) {
                if (strB.startsWith("mp4a.") && (pVarE = e(strB)) != null) {
                    strD = d(pVarE.f4821a);
                }
                return strD == null ? "audio/mp4a-latm" : strD;
            }
            if (strB.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strB.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strB.startsWith("ac-3") || strB.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strB.startsWith("ec-3") || strB.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strB.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strB.startsWith("ac-4") || strB.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strB.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strB.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strB.startsWith("dtsh") || strB.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strB.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strB.startsWith("opus")) {
                return "audio/opus";
            }
            if (strB.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strB.startsWith("flac")) {
                return "audio/flac";
            }
            if (strB.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strB.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strB.contains("cea708")) {
                return "application/cea-708";
            }
            if (strB.contains("eia608") || strB.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f4823a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String d(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static p e(String str) {
        Matcher matcher = f4824b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new p(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f4823a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return "video".equals(f(str));
    }
}
