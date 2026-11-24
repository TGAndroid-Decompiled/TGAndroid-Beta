package defpackage;

import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
public abstract class kt6 {
    public static float A(float f, float f2, float f3, float f4) {
        return Math.min(f4, (f / f2) + f3);
    }

    public static float B(float f, float f2, float f3, float f4) {
        return f4 - ((f - f2) * f3);
    }

    public static String C(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "FAILED";
                    }
                    throw null;
                }
                return "PENDING";
            }
            return "CANCELLED";
        }
        return "PAID";
    }

    public static int D(String str) {
        if (str != null) {
            if (str.equals("GET")) {
                return 1;
            }
            if (str.equals("PUT")) {
                return 2;
            }
            if (str.equals("POST")) {
                return 3;
            }
            if (str.equals("DELETE")) {
                return 4;
            }
            if (str.equals("HEAD")) {
                return 5;
            }
            if (str.equals("OPTIONS")) {
                return 6;
            }
            if (str.equals("TRACE")) {
                return 7;
            }
            if (str.equals("CONNECT")) {
                return 8;
            }
            if (str.equals("PATCH")) {
                return 9;
            }
            if (str.equals("PROPFIND")) {
                return 10;
            }
            if (str.equals("PROPPATCH")) {
                return 11;
            }
            if (str.equals("MKCOL")) {
                return 12;
            }
            if (str.equals("MOVE")) {
                return 13;
            }
            if (str.equals("COPY")) {
                return 14;
            }
            if (str.equals("LOCK")) {
                return 15;
            }
            if (str.equals("UNLOCK")) {
                return 16;
            }
            u36.j("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
            return 0;
        }
        gxc.d("Name is null");
        return 0;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return "Switching Protocols";
            case 2:
                return "OK";
            case 3:
                return "Created";
            case 4:
                return "Accepted";
            case 5:
                return "No Content";
            case 6:
                return "Partial Content";
            case 7:
                return "Multi-Status";
            case 8:
                return "Moved Permanently";
            case 9:
                return "Found";
            case 10:
                return "See Other";
            case 11:
                return "Not Modified";
            case 12:
                return "Temporary Redirect";
            case 13:
                return "Bad Request";
            case 14:
                return "Unauthorized";
            case 15:
                return "Forbidden";
            case 16:
                return "Not Found";
            case 17:
                return "Method Not Allowed";
            case 18:
                return "Not Acceptable";
            case 19:
                return "Request Timeout";
            case 20:
                return "Conflict";
            case 21:
                return "Gone";
            case 22:
                return "Length Required";
            case 23:
                return "Precondition Failed";
            case 24:
                return "Payload Too Large";
            case 25:
                return "Unsupported Media Type";
            case 26:
                return "Requested Range Not Satisfiable";
            case 27:
                return "Expectation Failed";
            case 28:
                return "Too Many Requests";
            case 29:
                return "Internal Server Error";
            case 30:
                return "Not Implemented";
            case 31:
                return "Service Unavailable";
            case 32:
                return "HTTP Version Not Supported";
            default:
                throw null;
        }
    }

    public static boolean c(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            if (!z || i2 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static float d(float f, float f2, float f3, float f4) {
        return ((f * f2) / f3) + f4;
    }

    public static int e(float f, int i, int i2) {
        return Math.max(i2, gm.L(f) + i);
    }

    public static int f(int i, int i2, int i3, int i4) {
        return pl2.h(i) + i2 + i3 + i4;
    }

    public static int g(String str, String str2, SharedPreferences sharedPreferences, int i) {
        return sharedPreferences.getInt(str + str2, i);
    }

    public static b59 h(View view, View view2, int i, int i2) {
        view.setLayoutParams(new g69(i, i2));
        return new u69(view2);
    }

    public static SharedPreferences.Editor i(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static Bundle j(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static Bundle k(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j);
        return bundle;
    }

    public static ClassCastException l(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String m(long j, char c, StringBuilder sb) {
        sb.append(jb6.E(j, c));
        return sb.toString();
    }

    public static String n(long j, String str) {
        return str + j;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static void r(int i, String str, ArrayList arrayList) {
        arrayList.add(new oa9(i, str));
    }

    public static void s(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            if (wi8.A(mediaMetadataRetriever)) {
                mediaMetadataRetriever.release();
            } else {
                i98.g();
            }
        } else {
            throw null;
        }
    }

    public static void t(String str, String str2, int i, Object[] objArr, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) gm.S2(jb6.a0(str, str2, i, objArr)));
    }

    public static void u(StringBuilder sb, char c, char c2, int i) {
        sb.append(c);
        sb.append(c2);
        sb.append(jb6.M0(i, null));
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean w(String str, long j, SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.getBoolean(str + j, z);
    }

    public static float x(float f, float f2, float f3, float f4) {
        return Math.max(f4, Math.min(f3, f / f2));
    }

    public static int y(float f, int i, int i2) {
        return (i - gm.L(f)) - i2;
    }

    public static int z(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }
}
