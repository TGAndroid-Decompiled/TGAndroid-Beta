package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sr;
import org.telegram.ui.ThemeActivity;
public abstract class ok {
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

    public static int a(org.telegram.ui.e3 e3Var) {
        int boundLeft = e3Var.getBoundLeft();
        int boundRight = e3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 / f10) * f11);
    }

    public static int c(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f7), i11);
    }

    public static int d(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static Bundle e(int i10, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i10);
        return bundle;
    }

    public static LinearLayout f(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static ci.d g(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        ci.d dVar = new ci.d(context, d6Var, z10);
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

    public static org.telegram.ui.ActionBar.e3 j(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(i10, context, d6Var, z10);
        e3Var.fixNavigationBar();
        return e3Var;
    }

    public static void k(float f7, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f7);
    }

    public static void l(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void m(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        m2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void n(int i10, org.telegram.ui.ActionBar.d6 d6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        textView.setTextSize(i11, f7);
    }

    public static void o(int i10, org.telegram.ui.Components.xc xcVar) {
        xcVar.i(LocaleController.getString(i10)).j();
    }

    public static void p(int i10, org.telegram.ui.Components.xc xcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        xcVar.t(LocaleController.getString(i10), d6Var).j();
    }

    public static void q(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void r(ViewPropertyAnimator viewPropertyAnimator, float f7, long j3) {
        viewPropertyAnimator.alpha(f7).setDuration(j3).start();
    }

    public static void s(ViewPropertyAnimator viewPropertyAnimator, sr srVar, long j3) {
        viewPropertyAnimator.setInterpolator(srVar).setDuration(j3).start();
    }

    public static void t(TextView textView, int i10, int i11, float f7, int i12) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f7);
        textView.setLines(i12);
    }

    public static void u(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean v(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static boolean w(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }

    public static int y(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) + i10);
    }

    public static int z(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }
}
