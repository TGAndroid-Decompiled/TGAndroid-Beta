package gh;

import a8.ee;
import android.graphics.Color;
import c2.i;
import fh.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public abstract class c {
    public static e a(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(7);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new b(0, u6Var);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, u6 u6Var) {
        boolean q5;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = y6.I.q();
        }
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !q5 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && q5 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static e d(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new i(27);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new i(26);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(6);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new i(28);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(939524096, 0);
        eVar.f10485n = AndroidUtilities.dpf2(3.5f);
        eVar.f10486r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(u6 u6Var) {
        return g(u6Var);
    }

    public static e i(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(11);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(9);
        eVar.d(-1, 553648127);
        eVar.c(0, 553648127);
        eVar.b(1207959552, 83886079);
        eVar.f10485n = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10486r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(5);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(637534208, 0);
        eVar.f10485n = AndroidUtilities.dpf2(4.0f);
        eVar.f10486r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.d(0, 687865855);
        eVar.c(0, 352321535);
        eVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e m(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(8);
        eVar.d(-1, 553648127);
        eVar.c(-1, 352321535);
        eVar.b(372454195, 0);
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(2.3333333f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.55f);
        float dpf24 = AndroidUtilities.dpf2(0.55f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static int n(float f7, int i10, int i11) {
        float a2 = ee.a(f7, 0.0f, 1.0f);
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
        return Color.argb(ee.b(Math.round(a2 * 255.0f), 0, 255), ee.b(Math.round((red2 - (red * f10)) / a2), 0, 255), ee.b(Math.round((green2 - (green * f10)) / a2), 0, 255), ee.b(Math.round((blue2 - (blue * f10)) / a2), 0, 255));
    }

    public static e o(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new i(29);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f10485n = dpf2;
        eVar.f10486r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f10484f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e p(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new b(2, u6Var);
        eVar.d(-1, 553648127);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f10484f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e q(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new a(10);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f10485n = 0.0f;
        eVar.f10486r = 0.0f;
        eVar.f10484f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e r(u6 u6Var) {
        e eVar = new e(u6Var);
        eVar.e = new b(1, u6Var);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f10485n = 0.0f;
        eVar.f10486r = 0.0f;
        eVar.f10484f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
