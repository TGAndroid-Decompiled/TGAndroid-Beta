package org.telegram.messenger;

import android.content.Context;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.ThemeActivity;
public abstract class vh {
    public static float A(float f7, float f10, float f11, float f12) {
        return Math.max(f12, Math.min(f11, f7 + f10));
    }

    public static int B(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) / i11;
    }

    public static int C(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) * i10);
    }

    public static int D(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + i10, i11);
    }

    public static float a(float f7, float f10, float f11, float f12) {
        return ((f7 + f10) * f11) + f12;
    }

    public static int b(float f7, int i10, int i11) {
        return (AndroidUtilities.dp(f7) * i10) + i11;
    }

    public static Bundle c(int i10, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i10);
        return bundle;
    }

    public static LinearLayout d(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static TextView e(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static fi.d f(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        fi.d dVar = new fi.d(context, u6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static String g(StringBuilder sb2, String str, kf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer h(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.k3 i(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(i10, context, u6Var, z10);
        k3Var.fixNavigationBar();
        return k3Var;
    }

    public static void j(float f7, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f7);
    }

    public static void k(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void l(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        r2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void m(int i10, org.telegram.ui.Components.wc wcVar) {
        wcVar.i(LocaleController.getString(i10)).j();
    }

    public static void n(int i10, org.telegram.ui.Components.wc wcVar, org.telegram.ui.ActionBar.u6 u6Var) {
        wcVar.t(LocaleController.getString(i10), u6Var).j();
    }

    public static void o(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void p(ViewPropertyAnimator viewPropertyAnimator, float f7, long j10) {
        viewPropertyAnimator.alpha(f7).setDuration(j10).start();
    }

    public static void q(ViewPropertyAnimator viewPropertyAnimator, ds dsVar, long j10) {
        viewPropertyAnimator.setInterpolator(dsVar).setDuration(j10).start();
    }

    public static void r(TextView textView, int i10, float f7, int i11, int i12) {
        textView.setTextSize(i10, f7);
        textView.setLines(i11);
        textView.setMaxLines(i12);
    }

    public static void s(eh.d dVar, float f7, float f10) {
        dVar.x(f7);
        dVar.w(AndroidUtilities.dp(f10));
    }

    public static void t(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean u(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static boolean v(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float w(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 / f10) * f11);
    }

    public static int x(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f7), i11);
    }

    public static float y(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }

    public static int z(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) + i10);
    }
}
