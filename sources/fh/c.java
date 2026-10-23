package fh;

import android.graphics.Color;
import c3.m;
import eh.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import w7.r;
public abstract class c {
    public static e a(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(29);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new a(0, g6Var);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, g6 g6Var) {
        boolean q6;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = k6.I.q();
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

    public static e d(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new b(3);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(19);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(28);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(20);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(939524096, 0);
        eVar.f8669n = AndroidUtilities.dpf2(3.5f);
        eVar.f8670r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(g6 g6Var) {
        return g(g6Var);
    }

    public static e i(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new b(2);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new b(0);
        eVar.d(-1, 553648127);
        eVar.c(0, 553648127);
        eVar.b(1207959552, 83886079);
        eVar.f8669n = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8670r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(27);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(637534208, 0);
        eVar.f8669n = AndroidUtilities.dpf2(4.0f);
        eVar.f8670r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.d(0, 687865855);
        eVar.c(0, 352321535);
        eVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8668f = dpf23;
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

    public static e n(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new m(21);
        eVar.d(285212672, 117440511);
        eVar.c(536870912, 301989887);
        eVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f8669n = dpf2;
        eVar.f8670r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f8668f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e o(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new a(2, g6Var);
        eVar.d(-1, 553648127);
        eVar.c(-1, 352321535);
        eVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f8668f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e p(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new b(1);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f8669n = 0.0f;
        eVar.f8670r = 0.0f;
        eVar.f8668f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e q(g6 g6Var) {
        e eVar = new e(g6Var);
        eVar.e = new a(1, g6Var);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.f8669n = 0.0f;
        eVar.f8670r = 0.0f;
        eVar.f8668f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
