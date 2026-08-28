package mg;

import android.graphics.Color;
import g7.n;
import i3.i;
import lg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public abstract class c {
    public static d a(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new b(1);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d b(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new a(0, b6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        dVar.f16867f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static boolean c(int i9, b6 b6Var) {
        boolean q10;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = f6.I.q();
        }
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !q10 && MessagesController.getInstance(i9).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && q10 && MessagesController.getInstance(i9).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static d d(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new b(5);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d e(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new i(22);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d f(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new b(0);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d g(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new i(23);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(939524096, 0);
        dVar.f16868n = AndroidUtilities.dpf2(3.5f);
        dVar.f16869r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16867f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d h(b6 b6Var) {
        return g(b6Var);
    }

    public static d i(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new b(4);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16867f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d j(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new i(29);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(637534208, 0);
        dVar.f16868n = AndroidUtilities.dpf2(4.0f);
        dVar.f16869r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f16867f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d k(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.d(0, 687865855);
        dVar.c(0, 352321535);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static int l(float f10, int i9, int i10) {
        float a2 = n.a(f10, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        int red2 = Color.red(i10);
        int green2 = Color.green(i10);
        int blue2 = Color.blue(i10);
        float f11 = 1.0f - a2;
        return Color.argb(n.b(Math.round(a2 * 255.0f), 0, 255), n.b(Math.round((red2 - (red * f11)) / a2), 0, 255), n.b(Math.round((green2 - (green * f11)) / a2), 0, 255), n.b(Math.round((blue2 - (blue * f11)) / a2), 0, 255));
    }

    public static d m(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new i(24);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.f16868n = dpf2;
        dVar.f16869r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f16867f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d n(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new a(2, b6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        dVar.f16867f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d o(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new b(3);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f16868n = 0.0f;
        dVar.f16869r = 0.0f;
        dVar.f16867f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d p(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.f16866e = new a(1, b6Var);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f16868n = 0.0f;
        dVar.f16869r = 0.0f;
        dVar.f16867f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }
}
