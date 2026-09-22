package eh;

import android.graphics.Color;
import d2.c;
import dh.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.q;
public abstract class b {
    public static e a(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(12);
        eVar.e(385875968, 402653183);
        eVar.d(385875968, 402653183);
        eVar.c(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(0, f6Var);
        eVar.e(-1, 687865855);
        eVar.d(-1, 352321535);
        eVar.c(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, f6 f6Var) {
        boolean q6;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = j6.I.q();
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

    public static e d(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(16);
        eVar.e(-1, 687865855);
        eVar.d(-1, 352321535);
        eVar.c(1073741824, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(1);
        eVar.e(687865855, 687865855);
        eVar.d(352321535, 352321535);
        eVar.c(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(11);
        eVar.e(285212672, 117440511);
        eVar.d(536870912, 301989887);
        eVar.c(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(2);
        eVar.e(1157627903, 0);
        eVar.d(587202559, 0);
        eVar.c(939524096, 0);
        eVar.f7742n = AndroidUtilities.dpf2(3.5f);
        eVar.f7743r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(f6 f6Var) {
        return g(f6Var);
    }

    public static e i(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(15);
        eVar.e(687865855, 687865855);
        eVar.d(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(13);
        eVar.e(-1, 553648127);
        eVar.d(0, 553648127);
        eVar.c(1207959552, 83886079);
        eVar.f7742n = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7743r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(10);
        eVar.e(1157627903, 0);
        eVar.d(587202559, 0);
        eVar.c(637534208, 0);
        eVar.f7742n = AndroidUtilities.dpf2(4.0f);
        eVar.f7743r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e(0, 687865855);
        eVar.d(0, 352321535);
        eVar.c(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e m(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(6);
        eVar.e(-1, 553648127);
        eVar.d(-1, 352321535);
        eVar.c(372454195, 0);
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(2.3333333f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.55f);
        float dpf24 = AndroidUtilities.dpf2(0.55f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static int n(float f7, int i10, int i11) {
        float a2 = q.a(f7, 0.0f, 1.0f);
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
        return Color.argb(q.b(Math.round(a2 * 255.0f), 0, 255), q.b(Math.round((red2 - (red * f10)) / a2), 0, 255), q.b(Math.round((green2 - (green * f10)) / a2), 0, 255), q.b(Math.round((blue2 - (blue * f10)) / a2), 0, 255));
    }

    public static e o(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(3);
        eVar.e(285212672, 117440511);
        eVar.d(536870912, 301989887);
        eVar.c(536870912, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.f7742n = dpf2;
        eVar.f7743r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f7741f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e p(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(2, f6Var);
        eVar.e(-1, 553648127);
        eVar.d(-1, 352321535);
        eVar.c(536870912, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f7741f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e q(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new c(14);
        eVar.e(0, 0);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.f7742n = 0.0f;
        eVar.f7743r = 0.0f;
        eVar.f7741f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e r(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(1, f6Var);
        eVar.e(0, 0);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.f7742n = 0.0f;
        eVar.f7743r = 0.0f;
        eVar.f7741f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
