package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.opengl.GLUtils;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.ui.ThemeActivity;
public abstract class n10 {
    public static float A(float f10, float f11, float f12, float f13) {
        return Math.max(f13, Math.min(f12, f10 + f11));
    }

    public static int B(float f10, int i7, int i10) {
        return i10 - (g0.L(f10) * i7);
    }

    public static int C(float f10, int i7, int i10) {
        return View.MeasureSpec.makeMeasureSpec(g0.L(f10) + i7, i10);
    }

    public static int D(float f10, int i7, int i10) {
        return Math.min(i10, i7 - g0.L(f10));
    }

    public static int a(org.telegram.ui.c3 c3Var) {
        int boundLeft = c3Var.getBoundLeft();
        int boundRight = c3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) * f12) + f13;
    }

    public static int c(float f10, int i7, int i10) {
        return View.MeasureSpec.makeMeasureSpec(i7 - g0.L(f10), i10);
    }

    public static TextPaint d(TextPaint textPaint, int i7) {
        textPaint.setTypeface(g0.o());
        return new TextPaint(i7);
    }

    public static ImageView e(Context context, int i7) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i7);
        return imageView;
    }

    public static TextView f(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static hi.e g(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        hi.e eVar = new hi.e(context, h6Var, z10);
        eVar.setRoundRadius(i7);
        return eVar;
    }

    public static String h(StringBuilder sb2, String str, pf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer i(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.w2 j(Activity activity, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(i7, activity, h6Var, z10);
        w2Var.O();
        return w2Var;
    }

    public static void k(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.translate(f13, f12 - (f10 / f11));
    }

    public static void l(float f10, int i7, int i10, TextView textView, String str) {
        textView.setText(gd.N0(i7, str));
        textView.setTextSize(i10, f10);
    }

    public static void m(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        g2Var.presentFragment(new ThemeActivity(i7));
    }

    public static void n(ViewPropertyAnimator viewPropertyAnimator, float f10, long j3) {
        viewPropertyAnimator.alpha(f10).setDuration(j3).start();
    }

    public static void o(ViewPropertyAnimator viewPropertyAnimator, org.telegram.ui.Components.nr nrVar, long j3) {
        viewPropertyAnimator.setInterpolator(nrVar).setDuration(j3).start();
    }

    public static void p(TextView textView, int i7, float f10) {
        textView.setTypeface(g0.o());
        textView.setTextSize(i7, f10);
    }

    public static void q(TextView textView, int i7, float f10, int i10, int i11) {
        textView.setTextSize(i7, f10);
        textView.setLines(i10);
        textView.setMaxLines(i11);
    }

    public static void r(TextView textView, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, int i10) {
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setText(gd.N0(i10, str));
    }

    public static void s(fh.g gVar, float f10, float f11) {
        gVar.r(f10);
        gVar.q(g0.L(f11));
    }

    public static void t(String str, int i7, org.telegram.ui.Components.lc lcVar) {
        lcVar.i(gd.N0(i7, str)).j();
    }

    public static void u(String str, org.telegram.ui.Components.lc lcVar, int i7, int i10) {
        lcVar.Q(i7, i10, g0.W2(str)).j();
    }

    public static void v(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        a8.d(sb2.toString());
    }

    public static float w(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
    }

    public static int x(float f10, int i7, int i10) {
        return i10 - (g0.L(f10) + i7);
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 / f11)) * f13;
    }

    public static int z(float f10, int i7, int i10) {
        return (i7 - g0.L(f10)) / i10;
    }
}
