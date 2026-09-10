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
import org.telegram.ui.Components.wr;
import org.telegram.ui.ThemeActivity;
public abstract class em {
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

    public static int b(org.telegram.ui.f3 f3Var) {
        int boundLeft = f3Var.getBoundLeft();
        int boundRight = f3Var.getBoundRight();
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

    public static bi.d g(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        bi.d dVar = new bi.d(context, f6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static FloatBuffer h(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.h3 i(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(i10, context, f6Var, z10);
        h3Var.fixNavigationBar();
        return h3Var;
    }

    public static void j(float f7, int i10, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i10, f7);
    }

    public static void k(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void l(int i10, String str, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        sb2.append(str);
    }

    public static void m(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void n(int i10, org.telegram.ui.ActionBar.f6 f6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextSize(i11, f7);
    }

    public static void o(int i10, org.telegram.ui.Components.wc wcVar) {
        wcVar.i(LocaleController.getString(i10)).j();
    }

    public static void p(int i10, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, objArr)));
    }

    public static void q(ViewPropertyAnimator viewPropertyAnimator, wr wrVar, long j3) {
        viewPropertyAnimator.setInterpolator(wrVar).setDuration(j3).start();
    }

    public static void r(TextView textView, int i10, int i11, float f7, int i12) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f7);
        textView.setLines(i12);
    }

    public static void s(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
    }

    public static boolean t(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float u(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }

    public static int v(float f7, int i10, int i11) {
        return i11 - (AndroidUtilities.dp(f7) + i10);
    }

    public static int w(int i10, int i11, Drawable drawable) {
        return i11 - (drawable.getIntrinsicWidth() / i10);
    }

    public static void x(int i10, org.telegram.ui.ActionBar.f6 f6Var, TextView textView, int i11, float f7) {
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextSize(i11, f7);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static int y(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) / i11;
    }

    public static int z(int i10, int i11, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i10) + i11;
    }
}
