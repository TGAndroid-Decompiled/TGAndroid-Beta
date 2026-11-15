package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.opengl.GLUtils;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.ui.ThemeActivity;
public abstract class i20 {
    public static int A(float f10, int i7, int i10) {
        return i10 - (g0.L(f10) * i7);
    }

    public static int B(float f10, int i7, int i10) {
        return View.MeasureSpec.makeMeasureSpec(g0.L(f10) + i7, i10);
    }

    public static int C(float f10, int i7, int i10) {
        return Math.min(i10, i7 - g0.L(f10));
    }

    public static int D(float f10, int i7, int i10) {
        return (i7 - g0.L(f10)) + i10;
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

    public static hi.d g(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        hi.d dVar = new hi.d(context, e6Var, z10);
        dVar.setRoundRadius(i7);
        return dVar;
    }

    public static FloatBuffer h(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.u2 i(Activity activity, boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(i7, activity, e6Var, z10);
        u2Var.O();
        return u2Var;
    }

    public static void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.translate(f13, f12 - (f10 / f11));
    }

    public static void k(float f10, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f10));
    }

    public static void l(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        e2Var.presentFragment(new ThemeActivity(i7));
    }

    public static void m(ViewPropertyAnimator viewPropertyAnimator, float f10, long j3) {
        viewPropertyAnimator.alpha(f10).setDuration(j3).start();
    }

    public static void n(ViewPropertyAnimator viewPropertyAnimator, org.telegram.ui.Components.er erVar, long j3) {
        viewPropertyAnimator.setInterpolator(erVar).setDuration(j3).start();
    }

    public static void o(TextView textView, int i7, float f10) {
        textView.setTypeface(g0.o());
        textView.setTextSize(i7, f10);
    }

    public static void p(TextView textView, int i7, float f10, int i10, int i11) {
        textView.setTextSize(i7, f10);
        textView.setLines(i10);
        textView.setMaxLines(i11);
    }

    public static void q(TextView textView, int i7, org.telegram.ui.ActionBar.e6 e6Var, String str, int i10) {
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setText(hd.M0(i10, str));
    }

    public static void r(fh.g gVar, float f10, float f11) {
        gVar.r(f10);
        gVar.q(g0.L(f11));
    }

    public static void s(String str, int i7, org.telegram.ui.Components.cc ccVar) {
        ccVar.i(hd.M0(i7, str)).j();
    }

    public static void t(String str, org.telegram.ui.Components.cc ccVar, int i7, int i10) {
        ccVar.Q(i7, i10, g0.X2(str)).j();
    }

    public static void u(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        a8.d(sb2.toString());
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
    }

    public static int w(float f10, int i7, int i10) {
        return i10 - (g0.L(f10) + i7);
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 / f11)) * f13;
    }

    public static int y(float f10, int i7, int i10) {
        return (i7 - g0.L(f10)) / i10;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return Math.max(f13, Math.min(f12, f10 + f11));
    }
}
