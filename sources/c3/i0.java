package c3;

import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.cast.w4;
import com.google.android.gms.internal.vision.r0;
import com.google.android.recaptcha.internal.zzqv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
public abstract class i0 {
    public static int A(int i10, int i11, int i12) {
        return zzqv.zzA(i10) + i11 + i12;
    }

    public static float B(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) / f11) + f12;
    }

    public static float C(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) * f12;
    }

    public static float D(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 * f10)) * f12;
    }

    public static float E(float f7, float f10, float f11, float f12) {
        return f7 * f10 * f11 * f12;
    }

    public static String F(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "FROSTED_FILTERED";
                }
                return "FROSTED_GLASS";
            }
            return "GLASS";
        }
        return "BLURRED";
    }

    public static void a(k0 k0Var, e2.x xVar, int i10) {
        k0Var.g(xVar, i10, 0);
    }

    public static boolean b(int i10) {
        if (i10 != 0) {
            if (i10 != 3 && i10 != 4) {
                return false;
            }
            return true;
        }
        throw null;
    }

    public static int c(int i10) {
        int[] d = m1.j.d(126);
        if (i10 >= 0 && i10 < d.length) {
            return d[i10];
        }
        return 0;
    }

    public static int d(int i10) {
        if (i10 != 90) {
            if (i10 != 91) {
                if (i10 != 93) {
                    if (i10 != 94) {
                        switch (i10) {
                            case 0:
                                return 1;
                            case 1:
                                return 2;
                            case 2:
                                return 3;
                            case 3:
                                return 4;
                            case 4:
                                return 5;
                            case 5:
                                return 6;
                            case 6:
                                return 7;
                            case 7:
                                return 8;
                            case 8:
                                return 9;
                            case 9:
                                return 10;
                            case 10:
                                return 11;
                            case 11:
                                return 12;
                            case 12:
                                return 13;
                            case 13:
                                return 14;
                            case 14:
                                return 15;
                            case 15:
                                return 16;
                            case 16:
                                return 17;
                            case 17:
                                return 18;
                            case 18:
                                return 19;
                            case 19:
                                return 20;
                            case 20:
                                return 21;
                            case 21:
                                return 22;
                            case 22:
                                return 23;
                            case 23:
                                return 24;
                            case 24:
                                return 25;
                            case 25:
                                return 26;
                            case 26:
                                return 27;
                            case 27:
                                return 28;
                            case 28:
                                return 29;
                            case 29:
                                return 30;
                            case 30:
                                return 31;
                            case 31:
                                return 32;
                            case 32:
                                return 33;
                            case 33:
                                return 34;
                            case 34:
                                return 35;
                            case 35:
                                return 36;
                            case 36:
                                return 37;
                            case 37:
                                return 38;
                            case 38:
                                return 39;
                            case 39:
                                return 40;
                            case 40:
                                return 41;
                            case 41:
                                return 42;
                            case 42:
                                return 43;
                            case 43:
                                return 44;
                            case 44:
                                return 45;
                            case 45:
                                return 46;
                            case 46:
                                return 47;
                            case 47:
                                return 48;
                            case 48:
                                return 49;
                            case 49:
                                return 50;
                            case 50:
                                return 51;
                            case 51:
                                return 52;
                            case 52:
                                return 53;
                            case 53:
                                return 54;
                            case 54:
                                return 55;
                            case 55:
                                return 56;
                            case 56:
                                return 57;
                            case 57:
                                return 58;
                            case 58:
                                return 59;
                            case 59:
                                return 60;
                            case 60:
                                return 61;
                            case 61:
                                return 62;
                            case 62:
                                return 63;
                            case 63:
                                return 64;
                            case 64:
                                return 65;
                            case 65:
                                return 66;
                            case 66:
                                return 67;
                            case 67:
                                return 68;
                            case 68:
                                return 69;
                            case 69:
                                return 70;
                            case 70:
                                return 71;
                            case 71:
                                return 72;
                            case 72:
                                return 73;
                            case 73:
                                return 74;
                            case 74:
                                return 75;
                            case 75:
                                return 76;
                            case 76:
                                return 77;
                            case 77:
                                return 78;
                            case 78:
                                return 79;
                            case 79:
                                return 80;
                            default:
                                switch (i10) {
                                    case 96:
                                        return 87;
                                    case 97:
                                        return 88;
                                    case 98:
                                        return 89;
                                    case 99:
                                        return 90;
                                    case 100:
                                        return 91;
                                    case 101:
                                        return 92;
                                    case 102:
                                        return 83;
                                    case 103:
                                        return 86;
                                    case 104:
                                        return 93;
                                    case 105:
                                        return 94;
                                    case 106:
                                        return 95;
                                    case 107:
                                        return 96;
                                    case 108:
                                        return 97;
                                    case 109:
                                        return 98;
                                    case 110:
                                        return 99;
                                    case 111:
                                        return 100;
                                    case 112:
                                        return 101;
                                    case 113:
                                        return 102;
                                    case 114:
                                        return 103;
                                    case 115:
                                        return 104;
                                    case 116:
                                        return 105;
                                    case 117:
                                        return 106;
                                    case 118:
                                        return 107;
                                    case 119:
                                        return 108;
                                    case 120:
                                        return 109;
                                    case 121:
                                        return 110;
                                    case 122:
                                        return 111;
                                    case 123:
                                        return 112;
                                    case 124:
                                        return 113;
                                    case 125:
                                        return 114;
                                    case 126:
                                        return 117;
                                    case 127:
                                        return 119;
                                    case 128:
                                        return 120;
                                    case 129:
                                        return 121;
                                    case 130:
                                        return 122;
                                    case 131:
                                        return 123;
                                    case 132:
                                        return 124;
                                    case 133:
                                        return 125;
                                    case 134:
                                        return 126;
                                    case 135:
                                        return 127;
                                    case 136:
                                        return 128;
                                    case 137:
                                        return 129;
                                    case 138:
                                        return 130;
                                    case 139:
                                        return 131;
                                    case 140:
                                        return 132;
                                    case 141:
                                        return 133;
                                    case 142:
                                        return 134;
                                    case 143:
                                        return 135;
                                    case 144:
                                        return 136;
                                    case 145:
                                        return 115;
                                    case 146:
                                        return 116;
                                    case 147:
                                        return 118;
                                    case 148:
                                        return 137;
                                    case 149:
                                        return 138;
                                    default:
                                        return 0;
                                }
                        }
                    }
                    return 85;
                }
                return 84;
            }
            return 82;
        }
        return 81;
    }

    public static String e(int i10) {
        switch (i10) {
            case 1:
                return "Blues";
            case 2:
                return "Classic Rock";
            case 3:
                return "Country";
            case 4:
                return "Dance";
            case 5:
                return "Disco";
            case 6:
                return "Funk";
            case 7:
                return "Grunge";
            case 8:
                return "Hip-Hop";
            case 9:
                return "Jazz";
            case 10:
                return "Metal";
            case 11:
                return "New Age";
            case 12:
                return "Oldies";
            case 13:
                return "Other";
            case 14:
                return "Pop";
            case 15:
                return "R&B";
            case 16:
                return "Rap";
            case 17:
                return "Reggae";
            case 18:
                return "Rock";
            case 19:
                return "Techno";
            case 20:
                return "Industrial";
            case 21:
                return "Alternative";
            case 22:
                return "Ska";
            case 23:
                return "Death Metal";
            case 24:
                return "Pranks";
            case 25:
                return "Soundtrack";
            case 26:
                return "Euro-Techno";
            case 27:
                return "Ambient";
            case 28:
                return "Trip-Hop";
            case 29:
                return "Vocal";
            case 30:
                return "Jazz+Funk";
            case 31:
                return "Fusion";
            case 32:
                return "Trance";
            case 33:
                return "Classical";
            case 34:
                return "Instrumental";
            case 35:
                return "Acid";
            case 36:
                return "House";
            case 37:
                return "Game";
            case 38:
                return "Sound Clip";
            case 39:
                return "Gospel";
            case 40:
                return "Noise";
            case 41:
                return "AlternRock";
            case 42:
                return "Bass";
            case 43:
                return "Soul";
            case 44:
                return "Punk";
            case 45:
                return "Space";
            case 46:
                return "Meditative";
            case 47:
                return "Instrumental Pop";
            case 48:
                return "Instrumental Rock";
            case 49:
                return "Ethnic";
            case 50:
                return "Gothic";
            case 51:
                return "Darkwave";
            case 52:
                return "Techno-Industrial";
            case 53:
                return "Electronic";
            case 54:
                return "Pop-Folk";
            case 55:
                return "Eurodance";
            case 56:
                return "Dream";
            case 57:
                return "Southern Rock";
            case 58:
                return "Comedy";
            case 59:
                return "Cult";
            case 60:
                return "Gangsta";
            case 61:
                return "Top 40";
            case 62:
                return "Christian Rap";
            case 63:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case 66:
                return "Cabaret";
            case 67:
                return "New Wave";
            case 68:
                return "Psychadelic";
            case 69:
                return "Rave";
            case 70:
                return "Showtunes";
            case 71:
                return "Trailer";
            case 72:
                return "Lo-Fi";
            case 73:
                return "Tribal";
            case 74:
                return "Acid Punk";
            case 75:
                return "Acid Jazz";
            case 76:
                return "Polka";
            case 77:
                return "Retro";
            case 78:
                return "Musical";
            case 79:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case 81:
                return "Folk";
            case 82:
                return "Folk-Rock";
            case 83:
                return "National Folk";
            case 84:
                return "Swing";
            case 85:
                return "Fast Fusion";
            case 86:
                return "Bebop";
            case 87:
                return "Latin";
            case 88:
                return "Revival";
            case 89:
                return "Celtic";
            case 90:
                return "Bluegrass";
            case 91:
                return "Avantgarde";
            case 92:
                return "Gothic Rock";
            case 93:
                return "Progressive Rock";
            case 94:
                return "Psychedelic Rock";
            case 95:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case 97:
                return "Big Band";
            case 98:
                return "Chorus";
            case 99:
                return "Easy Listening";
            case 100:
                return "Acoustic";
            case 101:
                return "Humour";
            case 102:
                return "Speech";
            case 103:
                return "Chanson";
            case 104:
                return "Opera";
            case 105:
                return "Chamber Music";
            case 106:
                return "Sonata";
            case 107:
                return "Symphony";
            case 108:
                return "Booty Bass";
            case 109:
                return "Primus";
            case 110:
                return "Porn Groove";
            case 111:
                return "Satire";
            case 112:
                return "Slow Jam";
            case 113:
                return "Club";
            case 114:
                return "Tango";
            case 115:
                return "Samba";
            case 116:
                return "Folklore";
            case 117:
                return "Ballad";
            case 118:
                return "Power Ballad";
            case 119:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case 121:
                return "Duet";
            case 122:
                return "Punk Rock";
            case 123:
                return "Drum Solo";
            case 124:
                return "A capella";
            case 125:
                return "Euro-House";
            case 126:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static int f(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            default:
                throw null;
        }
    }

    public static float g(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 * f10)) / f12;
    }

    public static int h(int i10, int i11, int i12) {
        return w4.o(i10) + i11 + i12;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return r0.T(i10) + i11 + i12 + i13;
    }

    public static int j(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int k(int i10, int i11, long j10, ArrayList arrayList) {
        arrayList.add(Long.valueOf(j10));
        return i10 + i11;
    }

    public static ClassCastException l(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String m(int i10, int i11, String str) {
        return str.substring(i11, str.length() - i10);
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void o(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
    }

    public static void p(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            cf.b.b();
        } else if (t(mediaMetadataRetriever)) {
            mediaMetadataRetriever.release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void q(String str, String str2, String str3) {
        e2.a.l(str3, str + str2);
    }

    public static void r(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void s(ji.f fVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(fVar);
    }

    public static boolean t(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static float u(float f7, float f10, float f11, float f12) {
        return (f7 * f10 * f11) + f12;
    }

    public static int v(int i10, int i11, int i12) {
        return r0.T(i10) + i11 + i12;
    }

    public static void w(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(Integer.valueOf(i10), str);
        hashMap.put(Integer.valueOf(i11), str2);
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) / f12;
    }

    public static int y(int i10, int i11, int i12) {
        return (r0.y(i10) * i11) + i12;
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) * f11) + f12;
    }
}
