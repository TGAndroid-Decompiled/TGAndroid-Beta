package b2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v7.r6;
public abstract class r0 {
    public static final ArrayList f1955a = new ArrayList();
    public static final Pattern f1956b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        q0 f7;
        int a2;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (f7 = f(str2)) == null || (a2 = f7.a()) == 0 || a2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] b02 = e2.d0.b0(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : b02) {
                if (str2.equals(d(str3))) {
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

    public static int c(String str, String str2) {
        q0 f7;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f7 = f(str2)) == null) {
                    return 0;
                }
                return f7.a();
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

    public static String d(String str) {
        q0 f7;
        String str2 = null;
        if (str != null) {
            String b10 = r6.b(str.trim());
            if (!b10.startsWith("avc1") && !b10.startsWith("avc3")) {
                if (!b10.startsWith("hev1") && !b10.startsWith("hvc1")) {
                    if (!b10.startsWith("dvav") && !b10.startsWith("dva1") && !b10.startsWith("dvhe") && !b10.startsWith("dvh1")) {
                        if (b10.startsWith("av01")) {
                            return "video/av01";
                        }
                        if (!b10.startsWith("vp9") && !b10.startsWith("vp09")) {
                            if (!b10.startsWith("vp8") && !b10.startsWith("vp08")) {
                                if (b10.startsWith("mp4a")) {
                                    if (b10.startsWith("mp4a.") && (f7 = f(b10)) != null) {
                                        str2 = e(f7.f1896a);
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
                                                        ArrayList arrayList = f1955a;
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

    public static String e(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 221) {
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
                                                case 108:
                                                    return "image/jpeg";
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
                                return "audio/vorbis";
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

    public static q0 f(String str) {
        int i10;
        Matcher matcher = f1956b.matcher(str);
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
                return new q0(parseInt, i10);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (i(str)) {
                return 1;
            }
            if (m(str)) {
                return 2;
            }
            if (l(str)) {
                return 3;
            }
            if (k(str)) {
                return 4;
            }
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = f1955a;
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

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        if ((!str2.startsWith("dvhe") || !str.startsWith("hev1")) && ((!str2.startsWith("dvh1") || !str.startsWith("hvc1")) && ((!str2.startsWith("dvav") || !str.startsWith("avc3")) && ((!str2.startsWith("dva1") || !str.startsWith("avc1")) && (!str2.startsWith("dav1") || !str.startsWith("av01")))))) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        if (!"image".equals(g(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        if (!"text".equals(g(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        return "video".equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String b10 = r6.b(str);
        b10.getClass();
        char c10 = 65535;
        switch (b10.hashCode()) {
            case -1833600100:
                if (b10.equals("video/x-mvhevc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1007807498:
                if (b10.equals("audio/x-flac")) {
                    c10 = 1;
                    break;
                }
                break;
            case -979095690:
                if (b10.equals("application/x-mpegurl")) {
                    c10 = 2;
                    break;
                }
                break;
            case -586683234:
                if (b10.equals("audio/x-wav")) {
                    c10 = 3;
                    break;
                }
                break;
            case -432836268:
                if (b10.equals("audio/mpeg-l1")) {
                    c10 = 4;
                    break;
                }
                break;
            case -432836267:
                if (b10.equals("audio/mpeg-l2")) {
                    c10 = 5;
                    break;
                }
                break;
            case 187090231:
                if (b10.equals("audio/mp3")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "application/x-mpegURL";
            case 3:
                return "audio/wav";
            case 4:
                return "audio/mpeg-L1";
            case 5:
                return "audio/mpeg-L2";
            case 6:
                return "audio/mpeg";
            default:
                return b10;
        }
    }
}
