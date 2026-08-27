package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.ThemeActivity;

public abstract class rl {
    public static int A(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i10) + i11;
    }

    public static int B(float f10, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + i10, i11);
    }

    public static int C(float f10, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f10)) + i11;
    }

    public static boolean a(MessageObject messageObject) {
        return messageObject != null && messageObject.getDialogId() == 1271266957;
    }

    public static int b(org.telegram.ui.i3 i3Var) {
        int boundLeft = i3Var.getBoundLeft();
        int boundRight = i3Var.getBoundRight();
        if (boundLeft < 0 || boundRight < 0 || boundRight < boundLeft) {
            return -1;
        }
        return boundRight - boundLeft;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
    }

    public static int d(float f10, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - AndroidUtilities.dp(f10), i11);
    }

    public static int e(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicHeight() / i10);
    }

    public static FloatBuffer f(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static lh.d g(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        lh.d dVar = new lh.d(context, c6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static void h(float f10, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f10);
    }

    public static void i(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void j(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void k(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void l(int i10, org.telegram.ui.ActionBar.c6 c6Var, TextView textView, int i11, float f10) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTextSize(i11, f10);
    }

    public static void m(int i10, org.telegram.ui.Components.mc mcVar) {
        mcVar.i(LocaleController.getString(i10)).j();
    }

    public static void n(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void o(ViewPropertyAnimator viewPropertyAnimator, er erVar, long j10) {
        viewPropertyAnimator.setInterpolator(erVar).setDuration(j10).start();
    }

    public static void p(TextView textView, int i10, int i11, float f10, int i12) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f10);
        textView.setLines(i12);
    }

    public static void q(String str, int i10, ArrayList arrayList) {
        arrayList.add(new org.telegram.ui.Cells.o6(str, i10));
    }

    public static void r(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean s(TLRPC.TL_game tL_game) {
        return tL_game != null;
    }

    public static float t(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 / f11)) * f13;
    }

    public static int u(float f10, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f10) + i10);
    }

    public static int v(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static void w(int i10, org.telegram.ui.ActionBar.c6 c6Var, TextView textView, int i11, float f10) {
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setTextSize(i11, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static int x(float f10, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f10)) / i11;
    }

    public static int y(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }

    public static int z(float f10, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f10) * i10);
    }
}
