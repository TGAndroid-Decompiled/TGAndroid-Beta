package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class qd4 {
    public static float A(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static String B(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
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

    public static void a(eu5 eu5Var, boolean z) {
        int i;
        View view = (View) eu5Var;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static int b(int i) {
        int[] G = ik8.G(126);
        if (i >= 0 && i < G.length) {
            return G[i];
        }
        return 0;
    }

    public static final boolean c(int i) {
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public static String d(int i) {
        switch (i) {
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

    public static float e(float f, float f2, float f3, float f4) {
        return ((f + f2) / f3) + f4;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i - i2) - i3) - i4;
    }

    public static int g(int i, int i2, int i3, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static int h(tk4 tk4Var, int i) {
        return tk4Var.c(tk4Var.getMeasuredWidth()) + i;
    }

    public static int i(Float f, float f2) {
        return hl.L(f.floatValue() * f2);
    }

    public static Bundle j(int i, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        bundle.putInt(str2, i);
        return bundle;
    }

    public static ImageView k(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        return imageView;
    }

    public static Object l(int i, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i);
    }

    public static String m(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String n(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static ArrayList s(zh6 zh6Var, long j) {
        ArrayList arrayList = new ArrayList();
        zh6Var.k(j, arrayList);
        return arrayList;
    }

    public static ArrayList t(r47 r47Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r47Var);
        return arrayList;
    }

    public static void u(float f, int i, int i2, TextView textView, String str) {
        textView.setText(ob6.M0(i, str));
        textView.setTextSize(i2, f);
    }

    public static void v(int i, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i);
    }

    public static void w(TextView textView, int i, vnb vnbVar, int i2, float f) {
        yob.X(textView, i, vnbVar);
        textView.setTextSize(i2, f);
        textView.setTypeface(hl.o());
    }

    public static float x(float f, float f2, float f3, float f4) {
        return f4 - ((f - f2) / f3);
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static float z(float f, float f2, float f3, float f4) {
        return (f - f2) * f3 * f4;
    }
}
