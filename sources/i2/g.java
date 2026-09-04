package i2;

import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.yc;
public abstract class g {
    public static void A(int i10, ArrayList arrayList) {
        arrayList.add(h51.B(LocaleController.getString(i10)));
    }

    public static void B(int i10, AlertDialog$Builder alertDialog$Builder, a2 a2Var) {
        alertDialog$Builder.k(LocaleController.getString(i10), a2Var);
        alertDialog$Builder.o();
    }

    public static int C(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static void D(n2.g gVar, n2.g gVar2) {
        if (gVar != gVar2) {
            if (gVar2 != null) {
                gVar2.b(null);
            }
            if (gVar != null) {
                gVar.a(null);
            }
        }
    }

    public static String E(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static int a(int i10) {
        int[] d = m1.j.d(126);
        if (i10 >= 0 && i10 < d.length) {
            return d[i10];
        }
        return 0;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    public static String c(int i10) {
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

    public static boolean d(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            if (!z10 || i11 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static double e(double d, double d10, double d11) {
        return (Math.cos(d) * d10) + d11;
    }

    public static int f(float f7, int i10, int i11) {
        return Math.max(i11, i10 - AndroidUtilities.dp(f7));
    }

    public static int g(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.max(i10, i11), i12));
    }

    public static Object h(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String i(int i10, String str) {
        return str + i10;
    }

    public static String j(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String k(long j3, char c10, StringBuilder sb2) {
        sb2.append(LocaleController.formatNumber(j3, c10));
        return sb2.toString();
    }

    public static StringBuilder l(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap m(Class cls, la.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map n(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void o(int i10, StringBuilder sb2) {
        sb2.append(i10);
        FileLog.d(sb2.toString());
    }

    public static void p(int i10, ArrayList arrayList) {
        arrayList.add(h51.t(LocaleController.getString(i10)));
    }

    public static void q(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(Integer.valueOf(i10), str);
        hashMap.put(Integer.valueOf(i11), str2);
    }

    public static void r(int i10, AlertDialog$Builder alertDialog$Builder, a2 a2Var) {
        alertDialog$Builder.h(LocaleController.getString(i10), a2Var);
        alertDialog$Builder.o();
    }

    public static void s(int i10, Object[] objArr, yc ycVar, int i11, int i12) {
        ycVar.Q(i11, i12, LocaleController.formatString(i10, objArr)).j();
    }

    public static void t(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            k4.b();
        } else if (e2.u(mediaMetadataRetriever)) {
            mediaMetadataRetriever.release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void u(b2.r rVar, c3.h0 h0Var) {
        h0Var.b(new b2.s(rVar));
    }

    public static void v(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void w(StringBuilder sb2, long j3) {
        sb2.append(j3);
        FileLog.d(sb2.toString());
    }

    public static void x(boolean z10, org.telegram.ui.ActionBar.k kVar) {
        kVar.setBackButtonDrawable(new g2(z10));
    }

    public static int y(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.min(i10, i11), i12));
    }

    public static Object z(int i10, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i10);
    }
}
