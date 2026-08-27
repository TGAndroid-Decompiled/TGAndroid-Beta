package ng;

import android.graphics.Color;
import h7.n;
import ia.l;
import mg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public abstract class c {
    public static d a(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(8);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(285212672, 83886079);
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static d b(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new b(0, c6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float fDpf2 = AndroidUtilities.dpf2(0.5f);
        float fDpf3 = AndroidUtilities.dpf2(0.5f);
        dVar.f18051f = fDpf2;
        dVar.h = fDpf3;
        return dVar;
    }

    public static boolean c(int i10, c6 c6Var) {
        boolean zA = c6Var != null ? c6Var.a() : g6.I.q();
        boolean zChatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (zChatBlurEnabled && !zA && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            zChatBlurEnabled = false;
        }
        if (zChatBlurEnabled && zA && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return zChatBlurEnabled;
    }

    public static d d(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(12);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(1073741824, 0);
        float fDpf2 = AndroidUtilities.dpf2(3.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.5f);
        float fDpf5 = AndroidUtilities.dpf2(0.5f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static d e(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new l(29);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        dVar.b(536870912, 0);
        float fDpf2 = AndroidUtilities.dpf2(3.3333333f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static d f(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(7);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float fDpf2 = AndroidUtilities.dpf2(2.667f);
        float fDpf3 = AndroidUtilities.dpf2(0.85f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static d g(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(0);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(939524096, 0);
        dVar.f18052n = AndroidUtilities.dpf2(3.5f);
        dVar.f18053r = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18051f = fDpf2;
        dVar.h = fDpf3;
        return dVar;
    }

    public static d h(c6 c6Var) {
        return g(c6Var);
    }

    public static d i(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(11);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18051f = fDpf2;
        dVar.h = fDpf3;
        return dVar;
    }

    public static d j(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(6);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(637534208, 0);
        dVar.f18052n = AndroidUtilities.dpf2(4.0f);
        dVar.f18053r = 0.0f;
        float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f18051f = fDpf2;
        dVar.h = fDpf3;
        return dVar;
    }

    public static d k(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.d(0, 687865855);
        dVar.c(0, 352321535);
        dVar.b(805306368, 83886079);
        float fDpf2 = AndroidUtilities.dpf2(4.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33333334f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static int l(float f10, int i10, int i11) {
        float fA = n.a(f10, 0.0f, 1.0f);
        if (fA <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (fA >= 1.0f) {
            return Color.argb(255, Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        float f11 = 1.0f - fA;
        return Color.argb(n.b(Math.round(fA * 255.0f), 0, 255), n.b(Math.round((Color.red(i11) - (iRed * f11)) / fA), 0, 255), n.b(Math.round((Color.green(i11) - (iGreen * f11)) / fA), 0, 255), n.b(Math.round((Color.blue(i11) - (iBlue * f11)) / fA), 0, 255));
    }

    public static d m(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(1);
        dVar.d(285212672, 117440511);
        dVar.c(536870912, 301989887);
        dVar.b(536870912, 83886079);
        float fDpf2 = AndroidUtilities.dpf2(2.667f);
        float fDpf3 = AndroidUtilities.dpf2(0.85f);
        dVar.f18052n = fDpf2;
        dVar.f18053r = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(0.4f);
        float fDpf5 = AndroidUtilities.dpf2(0.4f);
        dVar.f18051f = fDpf4;
        dVar.h = fDpf5;
        return dVar;
    }

    public static d n(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new b(2, c6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(536870912, 0);
        float fDpf2 = AndroidUtilities.dpf2(0.55f);
        float fDpf3 = AndroidUtilities.dpf2(0.55f);
        dVar.f18051f = fDpf2;
        dVar.h = fDpf3;
        return dVar;
    }

    public static d o(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new a(10);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f18052n = 0.0f;
        dVar.f18053r = 0.0f;
        dVar.f18051f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d p(c6 c6Var) {
        d dVar = new d(c6Var);
        dVar.f18050e = new b(1, c6Var);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.f18052n = 0.0f;
        dVar.f18053r = 0.0f;
        dVar.f18051f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }
}
