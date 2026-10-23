package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.ThemeActivity;
public abstract class sl {
    public static int A(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) / i11;
    }

    public static int B(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) * i10);
    }

    public static int C(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + i10, i11);
    }

    public static int D(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) + i11;
    }

    public static int a(org.telegram.ui.f3 f3Var) {
        int boundLeft = f3Var.getBoundLeft();
        int boundRight = f3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return ((f7 + f10) * f11) + f12;
    }

    public static int c(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f7), i11);
    }

    public static int d(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static LinearLayout e(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static TextView f(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static ei.d g(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        ei.d dVar = new ei.d(context, g6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static String h(StringBuilder sb2, String str, jf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer i(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.h3 j(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(i10, context, g6Var, z10);
        h3Var.fixNavigationBar();
        return h3Var;
    }

    public static void k(float f7, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f7);
    }

    public static void l(float f7, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f7));
    }

    public static void m(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void n(int i10, TextView textView, int i11, float f7) {
        textView.setText(LocaleController.getString(i10));
        textView.setTextSize(i11, f7);
    }

    public static void o(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void p(int i10, org.telegram.ui.Components.xc xcVar) {
        xcVar.i(LocaleController.getString(i10)).j();
    }

    public static void q(int i10, org.telegram.ui.Components.xc xcVar, org.telegram.ui.ActionBar.g6 g6Var) {
        xcVar.t(LocaleController.getString(i10), g6Var).j();
    }

    public static void r(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void s(ViewPropertyAnimator viewPropertyAnimator, float f7, long j10) {
        viewPropertyAnimator.alpha(f7).setDuration(j10).start();
    }

    public static void t(ViewPropertyAnimator viewPropertyAnimator, bs bsVar, long j10) {
        viewPropertyAnimator.setInterpolator(bsVar).setDuration(j10).start();
    }

    public static void u(TextView textView, int i10, float f7, int i11, int i12) {
        textView.setTextSize(i10, f7);
        textView.setLines(i11);
        textView.setMaxLines(i12);
    }

    public static void v(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean w(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 / f10) * f11);
    }

    public static int y(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) + i10);
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }
}
