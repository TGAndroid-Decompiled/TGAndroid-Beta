package eh;

import android.graphics.Color;
import d2.c;
import dh.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.p;
public abstract class b {
    public static e a(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new a(0, e6Var);
        eVar.f(-1, 687865855);
        eVar.e(-1, 352321535);
        eVar.d(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, e6 e6Var) {
        boolean q6;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = i6.I.q();
        }
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !q6 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && q6 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static e d(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(16);
        eVar.f(-1, 687865855);
        eVar.e(-1, 352321535);
        eVar.d(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(1);
        eVar.f(687865855, 687865855);
        eVar.e(352321535, 352321535);
        eVar.d(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(11);
        eVar.f(285212672, 117440511);
        eVar.e(536870912, 301989887);
        eVar.d(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(2);
        eVar.f(1157627903, 0);
        eVar.e(587202559, 0);
        eVar.d(939524096, 0);
        eVar.f7738n = AndroidUtilities.dpf2(3.5f);
        eVar.f7739r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(e6 e6Var) {
        return g(e6Var);
    }

    public static e i(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(15);
        eVar.f(687865855, 687865855);
        eVar.e(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(13);
        eVar.f(-1, 553648127);
        eVar.e(0, 553648127);
        eVar.d(1207959552, 83886079);
        eVar.f7738n = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7739r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(10);
        eVar.f(1157627903, 0);
        eVar.e(587202559, 0);
        eVar.d(637534208, 0);
        eVar.f7738n = AndroidUtilities.dpf2(4.0f);
        eVar.f7739r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.f(0, 687865855);
        eVar.e(0, 352321535);
        eVar.d(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static int m(float f7, int i10, int i11) {
        float a2 = p.a(f7, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int red2 = Color.red(i11);
        int green2 = Color.green(i11);
        int blue2 = Color.blue(i11);
        float f10 = 1.0f - a2;
        return Color.argb(p.b(Math.round(a2 * 255.0f), 0, 255), p.b(Math.round((red2 - (red * f10)) / a2), 0, 255), p.b(Math.round((green2 - (green * f10)) / a2), 0, 255), p.b(Math.round((blue2 - (blue * f10)) / a2), 0, 255));
    }

    public static e n(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(3);
        eVar.f(285212672, 117440511);
        eVar.e(536870912, 301989887);
        eVar.d(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e o(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new a(2, e6Var);
        eVar.f(-1, 553648127);
        eVar.e(-1, 352321535);
        eVar.d(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f7737f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e p(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new c(14);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        eVar.f7738n = 0.0f;
        eVar.f7739r = 0.0f;
        eVar.f7737f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e q(e6 e6Var) {
        e eVar = new e(e6Var);
        eVar.e = new a(1, e6Var);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        eVar.f7738n = 0.0f;
        eVar.f7739r = 0.0f;
        eVar.f7737f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
