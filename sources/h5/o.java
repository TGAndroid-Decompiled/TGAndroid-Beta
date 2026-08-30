package h5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.z6;
public abstract class o {
    public static final ArrayList f6966a = new ArrayList();
    public static final Pattern f6967b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] P = d0.P(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : P) {
                if (str2.equals(c(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int b(String str, String str2) {
        c5.e e;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c3 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c3 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c3 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c3 = 11;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (e = e(str2)) == null) {
                    return 0;
                }
                return e.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        c5.e e;
        String str2 = null;
        if (str != null) {
            String b10 = z6.b(str.trim());
            if (!b10.startsWith("avc1") && !b10.startsWith("avc3")) {
                if (!b10.startsWith("hev1") && !b10.startsWith("hvc1")) {
                    if (!b10.startsWith("dvav") && !b10.startsWith("dva1") && !b10.startsWith("dvhe") && !b10.startsWith("dvh1")) {
                        if (b10.startsWith("av01")) {
                            return "video/av01";
                        }
                        if (!b10.startsWith("vp9") && !b10.startsWith("vp09")) {
                            if (!b10.startsWith("vp8") && !b10.startsWith("vp08")) {
                                if (b10.startsWith("mp4a")) {
                                    if (b10.startsWith("mp4a.") && (e = e(b10)) != null) {
                                        str2 = d(e.f2085a);
                                    }
                                    if (str2 == null) {
                                        return "audio/mp4a-latm";
                                    }
                                    return str2;
                                } else if (b10.startsWith("mha1")) {
                                    return "audio/mha1";
                                } else {
                                    if (b10.startsWith("mhm1")) {
                                        return "audio/mhm1";
                                    }
                                    if (!b10.startsWith("ac-3") && !b10.startsWith("dac3")) {
                                        if (!b10.startsWith("ec-3") && !b10.startsWith("dec3")) {
                                            if (b10.startsWith("ec+3")) {
                                                return "audio/eac3-joc";
                                            }
                                            if (!b10.startsWith("ac-4") && !b10.startsWith("dac4")) {
                                                if (b10.startsWith("dtsc")) {
                                                    return "audio/vnd.dts";
                                                }
                                                if (b10.startsWith("dtse")) {
                                                    return "audio/vnd.dts.hd;profile=lbr";
                                                }
                                                if (!b10.startsWith("dtsh") && !b10.startsWith("dtsl")) {
                                                    if (b10.startsWith("dtsx")) {
                                                        return "audio/vnd.dts.uhd;profile=p2";
                                                    }
                                                    if (b10.startsWith("opus")) {
                                                        return "audio/opus";
                                                    }
                                                    if (b10.startsWith("vorbis")) {
                                                        return "audio/vorbis";
                                                    }
                                                    if (b10.startsWith("flac")) {
                                                        return "audio/flac";
                                                    }
                                                    if (b10.startsWith("stpp")) {
                                                        return "application/ttml+xml";
                                                    }
                                                    if (b10.startsWith("wvtt")) {
                                                        return "text/vtt";
                                                    }
                                                    if (b10.contains("cea708")) {
                                                        return "application/cea-708";
                                                    }
                                                    if (!b10.contains("eia608") && !b10.contains("cea608")) {
                                                        ArrayList arrayList = f6966a;
                                                        if (arrayList.size() > 0) {
                                                            arrayList.get(0).getClass();
                                                            throw new ClassCastException();
                                                        }
                                                    } else {
                                                        return "application/cea-608";
                                                    }
                                                } else {
                                                    return "audio/vnd.dts.hd";
                                                }
                                            } else {
                                                return "audio/ac4";
                                            }
                                        } else {
                                            return "audio/eac3";
                                        }
                                    } else {
                                        return "audio/ac3";
                                    }
                                }
                            } else {
                                return "video/x-vnd.on2.vp8";
                            }
                        } else {
                            return "video/x-vnd.on2.vp9";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String d(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
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
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static c5.e e(String str) {
        int i10;
        Matcher matcher = f6967b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i10 = Integer.parseInt(group2);
                } else {
                    i10 = 0;
                }
                return new c5.e(parseInt, i10);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (!TextUtils.isEmpty(str)) {
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
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = f6966a;
                if (arrayList.size() <= 0) {
                    return -1;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            return 5;
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        if (!"text".equals(f(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        return "video".equals(f(str));
    }
}
