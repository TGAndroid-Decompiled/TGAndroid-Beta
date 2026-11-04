package d2;

import android.text.TextUtils;
import b8.xb;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class u0 {
    public static final ArrayList f8439a = new ArrayList();
    public static final Pattern f8440b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        t0 f10;
        int a10;
        if (str == null) {
            return false;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    c2 = 4;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c2 = 5;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c2 = 6;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 7;
                    break;
                }
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c2 = 14;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 15;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c2 = 16;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c2 = 17;
                    break;
                }
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c2 = 18;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c2 = 19;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c2 = 20;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            case 7:
                if (str2 == null || (f10 = f(str2)) == null || (a10 = f10.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] d02 = g2.n0.d0(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : d02) {
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
        t0 f10;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c2 = 5;
                    break;
                }
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c2 = 6;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f10 = f(str2)) == null) {
                    return 0;
                }
                return f10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 31;
            case 7:
                return 30;
            case '\b':
                return 6;
            case '\t':
                return 9;
            case '\n':
                return 20;
            case 11:
                return 8;
            case '\f':
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        t0 f10;
        String str2 = null;
        if (str != null) {
            String c2 = xb.c(str.trim());
            if (!c2.startsWith("avc1") && !c2.startsWith("avc3")) {
                if (!c2.startsWith("hev1") && !c2.startsWith("hvc1")) {
                    if (!c2.startsWith("vvc1") && !c2.startsWith("vvi1")) {
                        if (!c2.startsWith("dvav") && !c2.startsWith("dva1") && !c2.startsWith("dvhe") && !c2.startsWith("dvh1") && !c2.startsWith("dav1")) {
                            if (c2.startsWith("av01")) {
                                return "video/av01";
                            }
                            if (!c2.startsWith("vp9") && !c2.startsWith("vp09")) {
                                if (!c2.startsWith("vp8") && !c2.startsWith("vp08")) {
                                    if (c2.startsWith("mp4a")) {
                                        if (c2.startsWith("mp4a.") && (f10 = f(c2)) != null) {
                                            str2 = e(f10.f8413a);
                                        }
                                        if (str2 == null) {
                                            return "audio/mp4a-latm";
                                        }
                                        return str2;
                                    } else if (c2.startsWith("mha1")) {
                                        return "audio/mha1";
                                    } else {
                                        if (c2.startsWith("mhm1")) {
                                            return "audio/mhm1";
                                        }
                                        if (!c2.startsWith("ac-3") && !c2.startsWith("dac3")) {
                                            if (!c2.startsWith("ec-3") && !c2.startsWith("dec3")) {
                                                if (c2.startsWith("ec+3")) {
                                                    return "audio/eac3-joc";
                                                }
                                                if (!c2.startsWith("ac-4") && !c2.startsWith("dac4")) {
                                                    if (c2.startsWith("dtsc")) {
                                                        return "audio/vnd.dts";
                                                    }
                                                    if (c2.startsWith("dtse")) {
                                                        return "audio/vnd.dts.hd;profile=lbr";
                                                    }
                                                    if (!c2.startsWith("dtsh") && !c2.startsWith("dtsl")) {
                                                        if (c2.startsWith("dtsx")) {
                                                            return "audio/vnd.dts.uhd;profile=p2";
                                                        }
                                                        if (c2.startsWith("opus")) {
                                                            return "audio/opus";
                                                        }
                                                        if (c2.startsWith("vorbis")) {
                                                            return "audio/vorbis";
                                                        }
                                                        if (c2.startsWith("flac")) {
                                                            return "audio/flac";
                                                        }
                                                        if (c2.startsWith("stpp")) {
                                                            return "application/ttml+xml";
                                                        }
                                                        if (c2.startsWith("wvtt")) {
                                                            return "text/vtt";
                                                        }
                                                        if (c2.contains("cea708")) {
                                                            return "application/cea-708";
                                                        }
                                                        if (!c2.contains("eia608") && !c2.contains("cea608")) {
                                                            ArrayList arrayList = f8439a;
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
                        return "video/vvc";
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

    public static String e(int i3) {
        if (i3 != 32) {
            if (i3 != 33) {
                if (i3 != 35) {
                    if (i3 != 64) {
                        if (i3 != 163) {
                            if (i3 != 177) {
                                if (i3 != 221) {
                                    if (i3 != 165) {
                                        if (i3 != 166) {
                                            switch (i3) {
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
                                                    switch (i3) {
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

    public static t0 f(String str) {
        int i3;
        Matcher matcher = f8440b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i3 = Integer.parseInt(group2);
                } else {
                    i3 = 0;
                }
                return new t0(parseInt, i3);
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
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str) && !"application/meta".equals(str) && !"application/x-itut-t35".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = f8439a;
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
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
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
        String c2 = xb.c(str);
        c2.getClass();
        char c10 = 65535;
        switch (c2.hashCode()) {
            case -1833600100:
                if (c2.equals("video/x-mvhevc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1007807498:
                if (c2.equals("audio/x-flac")) {
                    c10 = 1;
                    break;
                }
                break;
            case -979095690:
                if (c2.equals("application/x-mpegurl")) {
                    c10 = 2;
                    break;
                }
                break;
            case -586683234:
                if (c2.equals("audio/x-wav")) {
                    c10 = 3;
                    break;
                }
                break;
            case -432836268:
                if (c2.equals("audio/mpeg-l1")) {
                    c10 = 4;
                    break;
                }
                break;
            case -432836267:
                if (c2.equals("audio/mpeg-l2")) {
                    c10 = 5;
                    break;
                }
                break;
            case 187090231:
                if (c2.equals("audio/mp3")) {
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
                return c2;
        }
    }
}
