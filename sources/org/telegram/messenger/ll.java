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
import org.telegram.ui.Components.gr;
import org.telegram.ui.ThemeActivity;
public abstract class ll {
    public static int A(float f10, int i9, int i10) {
        return i10 - (AndroidUtilities.dp(f10) * i9);
    }

    public static int B(int i9, int i10, Drawable drawable) {
        return (drawable.getIntrinsicWidth() / i9) + i10;
    }

    public static int C(float f10, int i9, int i10) {
        return View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + i9, i10);
    }

    public static int D(float f10, int i9, int i10) {
        return (i9 - AndroidUtilities.dp(f10)) + i10;
    }

    public static boolean a(MessageObject messageObject) {
        if (messageObject != null && messageObject.getDialogId() == 1271266957) {
            return true;
        }
        return false;
    }

    public static int b(org.telegram.ui.h3 h3Var) {
        int boundLeft = h3Var.getBoundLeft();
        int boundRight = h3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
    }

    public static int d(float f10, int i9, int i10) {
        return View.MeasureSpec.makeMeasureSpec(i9 - AndroidUtilities.dp(f10), i10);
    }

    public static int e(int i9, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicHeight() / i9);
    }

    public static LinearLayout f(Context context, int i9) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i9);
        return linearLayout;
    }

    public static String g(StringBuilder sb2, String str, ne.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer h(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static kh.d i(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        kh.d dVar = new kh.d(context, b6Var, z10);
        dVar.setRoundRadius(i9);
        return dVar;
    }

    public static org.telegram.ui.ActionBar.f3 j(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, z10, z11);
        f3Var.fixNavigationBar();
        return f3Var;
    }

    public static void k(float f10, int i9, TextView textView) {
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(i9, f10);
    }

    public static void l(int i9, TextView textView, int i10) {
        textView.setText(LocaleController.getString(i9));
        textView.setGravity(i10);
    }

    public static void m(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new ThemeActivity(i9));
    }

    public static void n(int i9, org.telegram.ui.ActionBar.b6 b6Var, TextView textView, int i10, float f10) {
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTextSize(i10, f10);
    }

    public static void o(int i9, org.telegram.ui.Components.oc ocVar) {
        ocVar.i(LocaleController.getString(i9)).j();
    }

    public static void p(int i9, org.telegram.ui.Components.oc ocVar, org.telegram.ui.ActionBar.b6 b6Var) {
        ocVar.t(LocaleController.getString(i9), b6Var).j();
    }

    public static void q(int i9, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i9, objArr)));
    }

    public static void r(ViewPropertyAnimator viewPropertyAnimator, gr grVar, long j10) {
        viewPropertyAnimator.setInterpolator(grVar).setDuration(j10).start();
    }

    public static void s(TextView textView, int i9, int i10, float f10, int i11) {
        textView.setTextColor(i9);
        textView.setTextSize(i10, f10);
        textView.setLines(i11);
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

    public static float v(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 / f11)) * f13;
    }

    public static int w(float f10, int i9, int i10) {
        return i10 - (AndroidUtilities.dp(f10) + i9);
    }

    public static int x(int i9, int i10, Drawable drawable) {
        return i10 - (drawable.getIntrinsicWidth() / i9);
    }

    public static int y(float f10, int i9, int i10) {
        return (i9 - AndroidUtilities.dp(f10)) / i10;
    }

    public static int z(int i9, int i10, Drawable drawable) {
        return (drawable.getIntrinsicHeight() / i9) + i10;
    }
}
