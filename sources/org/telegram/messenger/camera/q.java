package org.telegram.messenger.camera;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.c3;
public abstract class q {
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

    public static int a(c3 c3Var) {
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

    public static FloatBuffer g(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static v2 h(Activity activity, boolean z9, int i7, g6 g6Var) {
        v2 v2Var = new v2(i7, activity, g6Var, z9);
        v2Var.N();
        return v2Var;
    }

    public static void i(float f10, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f10));
    }

    public static void j(int i7, f2 f2Var) {
        f2Var.presentFragment(new ThemeActivity(i7));
    }

    public static void k(ViewPropertyAnimator viewPropertyAnimator, float f10, long j3) {
        viewPropertyAnimator.alpha(f10).setDuration(j3).start();
    }

    public static void l(ViewPropertyAnimator viewPropertyAnimator, xq xqVar, long j3) {
        viewPropertyAnimator.setInterpolator(xqVar).setDuration(j3).start();
    }

    public static void m(TextView textView, int i7, float f10) {
        textView.setTypeface(g0.o());
        textView.setTextSize(i7, f10);
    }

    public static void n(TextView textView, int i7, float f10, int i10, int i11) {
        textView.setTextSize(i7, f10);
        textView.setLines(i10);
        textView.setMaxLines(i11);
    }

    public static void o(TextView textView, int i7, g6 g6Var, String str, int i10) {
        s6.U(textView, i7, g6Var);
        textView.setText(id.M0(i10, str));
    }

    public static void p(fh.g gVar, float f10, float f11) {
        gVar.r(f10);
        gVar.q(g0.L(f11));
    }

    public static void q(String str, int i7, StringBuilder sb2, String str2) {
        sb2.append(id.M0(i7, str));
        sb2.append(str2);
    }

    public static void r(String str, int i7, hc hcVar) {
        hcVar.i(id.M0(i7, str)).j();
    }

    public static void s(String str, hc hcVar, int i7, int i10) {
        hcVar.Q(i7, i10, g0.X2(str)).j();
    }

    public static void t(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        a8.d(sb2.toString());
    }

    public static boolean u(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
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
