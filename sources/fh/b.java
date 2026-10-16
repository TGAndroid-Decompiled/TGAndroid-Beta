package fh;

import android.graphics.Color;
import bi.w2;
import eh.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.r;
public abstract class b {
    public static e a(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(25);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new a(0, c6Var);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, c6 c6Var) {
        boolean q6;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
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

    public static e d(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(29);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(15);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(24);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(16);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(939524096, 0);
        eVar.f8783n = AndroidUtilities.dpf2(3.5f);
        eVar.f8784r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(c6 c6Var) {
        return g(c6Var);
    }

    public static e i(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(28);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(26);
        eVar.d(-1, 553648127);
        eVar.c(0, 553648127);
        eVar.b(1207959552, 83886079);
        eVar.f8783n = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8784r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(23);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(637534208, 0);
        eVar.f8783n = AndroidUtilities.dpf2(4.0f);
        eVar.f8784r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.d(0, 687865855);
        eVar.c(0, 352321535);
        eVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static int m(float f7, int i10, int i11) {
        float a2 = r.a(f7, 0.0f, 1.0f);
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
        return Color.argb(r.b(Math.round(a2 * 255.0f), 0, 255), r.b(Math.round((red2 - (red * f10)) / a2), 0, 255), r.b(Math.round((green2 - (green * f10)) / a2), 0, 255), r.b(Math.round((blue2 - (blue * f10)) / a2), 0, 255));
    }

    public static e n(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(17);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f8783n = dpf2;
        eVar.f8784r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8782f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e o(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new a(2, c6Var);
        eVar.d(-1, 553648127);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f8782f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e p(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new w2(27);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f8783n = 0.0f;
        eVar.f8784r = 0.0f;
        eVar.f8782f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e q(c6 c6Var) {
        e eVar = new e(c6Var);
        eVar.e = new a(1, c6Var);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f8783n = 0.0f;
        eVar.f8784r = 0.0f;
        eVar.f8782f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
