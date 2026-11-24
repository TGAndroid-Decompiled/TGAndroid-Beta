package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ThemeActivity;
public abstract class de9 {
    public static String A(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static byte[] a(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (type instanceof TL_keyboard.TL_inlineButtonTypeCallback) {
            return ((TL_keyboard.TL_inlineButtonTypeCallback) type).data;
        }
        return null;
    }

    public static String b(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (type instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            return ((TL_keyboard.TL_inlineButtonTypeUrl) type).url;
        }
        if (type instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth) {
            return ((TL_keyboard.TL_inlineButtonTypeUrlAuth) type).url;
        }
        if (type instanceof TL_keyboard.TL_inlineButtonTypeWebView) {
            return ((TL_keyboard.TL_inlineButtonTypeWebView) type).url;
        }
        if (type instanceof TL_keyboard.TL_buttonTypeSimpleWebView) {
            return ((TL_keyboard.TL_buttonTypeSimpleWebView) type).url;
        }
        return null;
    }

    public static y33 c(uab uabVar, byte[] bArr, int i) {
        jm5 p = mm5.p();
        uabVar.l(bArr, 0, i, tab.c, new hza(p, (byte) 9));
        return new y33(p.f());
    }

    public static void d(RecyclerView recyclerView) {
        recyclerView.D0();
        d49 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof t26) {
            ((t26) layoutManager).g1(0, 0);
        } else {
            recyclerView.w0(0);
        }
    }

    public static float e(float f, float f2, float f3, float f4) {
        return (f3 - (f / f2)) * f4;
    }

    public static int f(float f, int i, int i2) {
        return i2 - (i - gl.L(f));
    }

    public static int g(int i, int i2, int i3, int i4) {
        return Math.max(i4, Math.min(Math.min(i, i2), i3));
    }

    public static fx0 h(int i, wjb wjbVar, Context context, boolean z) {
        fx0 fx0Var = new fx0(i, wjbVar, context, z);
        fx0Var.K();
        return fx0Var;
    }

    public static TextPaint i(TextPaint textPaint, int i) {
        textPaint.setTypeface(gl.o());
        return new TextPaint(i);
    }

    public static LinearLayout j(Context context, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static String k(int i, String str) {
        return str + i;
    }

    public static String l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void n(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.translate(f4, f3 - (f / f2));
    }

    public static void o(int i, d dVar) {
        dVar.presentFragment(new ThemeActivity(i));
    }

    public static void p(TextPaint textPaint, float f) {
        textPaint.setTextSize(f);
        textPaint.setTypeface(gl.o());
    }

    public static void q(TextView textView, int i, String str, int i2) {
        textView.setGravity(i);
        textView.setText(k96.M0(i2, str));
    }

    public static void r(String str, String str2, int i, Object[] objArr, TextView textView) {
        textView.setText(gl.S2(k96.a0(str, str2, i, objArr)));
    }

    public static void s(String str, StringBuilder sb) {
        sb.append(str);
        fa4.b(sb.toString());
    }

    public static boolean t(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static boolean u(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float v(float f, float f2, float f3, float f4) {
        return ((f + f2) * f3) + f4;
    }

    public static int w(float f, int i, int i2) {
        return gl.L(f) + i + i2;
    }

    public static float x(float f, float f2, float f3, float f4) {
        return f4 - ((f / f2) * f3);
    }

    public static int y(float f, int i, int i2) {
        return (gl.L(f) * i) + i2;
    }

    public static String z(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "ERROR";
                }
                return "CANCELLED";
            }
            return "AUDIO_REMOVED";
        }
        return "TRIMMED";
    }
}
