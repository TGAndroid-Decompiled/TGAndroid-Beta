package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qr;
import org.telegram.ui.ThemeActivity;
public abstract class vl {
    public static int A(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) * i10);
    }

    public static int B(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static int C(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + i10, i11);
    }

    public static int D(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) + i11;
    }

    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static int b(org.telegram.ui.d3 d3Var) {
        int boundLeft = d3Var.getBoundLeft();
        int boundRight = d3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float c(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 / f10) * f11);
    }

    public static int d(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f7), i11);
    }

    public static int e(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static LinearLayout f(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static ci.d g(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        ci.d dVar = new ci.d(context, e6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static String h(StringBuilder sb2, String str, gf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer i(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.f3 j(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(i10, context, e6Var, z10);
        f3Var.fixNavigationBar();
        return f3Var;
    }

    public static void k(float f7, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f7);
    }

    public static void l(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void m(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void n(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void o(int i10, org.telegram.ui.ActionBar.e6 e6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        textView.setTextSize(i11, f7);
    }

    public static void p(int i10, org.telegram.ui.Components.vc vcVar) {
        vcVar.i(LocaleController.getString(i10)).j();
    }

    public static void q(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void r(ViewPropertyAnimator viewPropertyAnimator, qr qrVar, long j3) {
        viewPropertyAnimator.setInterpolator(qrVar).setDuration(j3).start();
    }

    public static void s(TextView textView, int i10, int i11, float f7, int i12) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f7);
        textView.setLines(i12);
    }

    public static void t(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean u(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float v(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }

    public static int w(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) + i10);
    }

    public static int x(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static int y(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) / i11;
    }

    public static int z(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }
}
