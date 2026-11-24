package defpackage;

import android.net.Uri;
public abstract class ege {
    public static int a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String n = ud7.n(str);
        n.getClass();
        switch (n.hashCode()) {
            case -2123537834:
                if (n.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (n.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (n.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (n.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (n.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487656890:
                if (n.equals("image/avif")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                if (n.equals("image/heic")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                if (n.equals("image/heif")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (n.equals("image/jpeg")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                if (n.equals("image/webp")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (n.equals("application/mp4")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (n.equals("video/x-msvideo")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (n.equals("text/vtt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                if (n.equals("image/bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                if (n.equals("image/png")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (n.equals("audio/x-matroska")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (n.equals("application/webm")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (n.equals("video/x-flv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (n.equals("audio/ac3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (n.equals("audio/ac4")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (n.equals("audio/amr")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (n.equals("audio/mp4")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (n.equals("audio/ogg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (n.equals("audio/wav")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (n.equals("video/mp4")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (n.equals("audio/3gpp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (n.equals("audio/eac3")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (n.equals("audio/flac")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (n.equals("audio/midi")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (n.equals("audio/mpeg")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (n.equals("audio/webm")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (n.equals("video/x-matroska")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
