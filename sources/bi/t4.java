package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ay;
public abstract class t4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.p6 p6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        editTextBoldCursor.setHintText(str);
        a7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.t6.H6, p6Var);
        a7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, p6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        a7.D(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21028ig, p6Var);
        a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.f21048jg, p6Var);
        return editTextBoldCursor;
    }

    public static z60 b(z60 z60Var, org.telegram.ui.ActionBar.k2 k2Var, final c4 c4Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        if (u4Var != null && (textbutton = u4Var.f3385a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(c4Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(c4Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    c4Var.f2901f.r3(true);
                    k(k2Var, z10, new q4(c4Var, 2));
                }
                return null;
            }
        }
        z60Var.c(2131231744, cd.L0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t4.i(c4Var, z10);
                        return;
                    default:
                        t4.h(c4Var, z10);
                        return;
                }
            }
        }, false);
        z60Var.c(2131232102, cd.L0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t4.i(c4Var, z10);
                        return;
                    default:
                        t4.h(c4Var, z10);
                        return;
                }
            }
        }, false);
        z60Var.c(2131231622, cd.L0(2131746016, null), new ag.j0(k2Var, c4Var, z10, 4), false);
        z60Var.Z();
        return z60Var;
    }

    public static z60 c(z60 z60Var, org.telegram.ui.ActionBar.k2 k2Var, final Context context, final org.telegram.ui.ActionBar.p6 p6Var, final a4 a4Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = a4Var.f2841b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            inlineButtonType = null;
        } else {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                e(context, p6Var, a4Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, p6Var, a4Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(k2Var, context, p6Var, a4Var, z10);
                }
                return null;
            }
        }
        z60Var.c(2131231744, cd.L0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        t4.e(context, p6Var, a4Var, z10);
                        return;
                    default:
                        t4.d(context, p6Var, a4Var, z10);
                        return;
                }
            }
        }, false);
        z60Var.c(2131232102, cd.L0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        t4.e(context, p6Var, a4Var, z10);
                        return;
                    default:
                        t4.d(context, p6Var, a4Var, z10);
                        return;
                }
            }
        }, false);
        z60Var.c(2131231622, cd.L0(2131746016, null), new ag.n0(k2Var, context, p6Var, a4Var, z10, 1), false);
        z60Var.Z();
        return z60Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        boolean c10 = a4Var.c();
        int i11 = a4Var.f2841b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            inlineButtonType = null;
        } else {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            str = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            str = "";
        }
        String str2 = str;
        if (c10) {
            i10 = 2131746019;
        } else {
            i10 = 2131746023;
        }
        g(context, p6Var, a4Var, z10, cd.L0(i10, null), cd.L0(2131746027, null), str2, new m4(a4Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        boolean c10 = a4Var.c();
        int i11 = a4Var.f2841b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            inlineButtonType = null;
        } else {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        if (c10) {
            i10 = 2131746018;
        } else {
            i10 = 2131746022;
        }
        g(context, p6Var, a4Var, z10, cd.L0(i10, null), cd.L0(2131746025, null), str2, new m4(a4Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = a4Var.c();
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int i11 = 0;
        f7.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        String L0 = cd.L0(2131746026, null);
        int i12 = a4Var.f2841b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = s6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, p6Var, L0, l4);
        f7.addView(a2, w7.b6.o(-1, 64));
        n4 n4Var = new n4(a2, k2Var, z10, a4Var, 0);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        }
        if (c10) {
            i10 = 2131746017;
        } else {
            i10 = 2131746021;
        }
        String L02 = cd.L0(i10, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L02;
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131747847, null), new o4(c10, n4Var, a2, a4Var, 0));
        if (c10) {
            alertDialog$Builder.i(cd.L0(2131746024, null), new a1.c(n4Var, 11));
            String L03 = cd.L0(2131751599, null);
            m4 m4Var = new m4(a4Var, 2);
            x1Var.f21501r0 = L03;
            x1Var.f21503s0 = m4Var;
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            x1Var.L0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        }
        j(alertDialog$Builder, a2, i11, p6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.p6 p6Var, a4 a4Var, boolean z10, String str, String str2, String str3, m4 m4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int i10 = 0;
        f7.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        String L0 = cd.L0(2131746026, null);
        int i11 = a4Var.f2841b;
        TL_iv.pageBlockButtonRow d = a4Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = s6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, p6Var, L0, l4);
        EditTextBoldCursor a10 = a(context, p6Var, str2, str3);
        f7.addView(a2, w7.b6.o(-1, 64));
        f7.addView(a10, w7.b6.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        }
        alertDialog$Builder.f20134a.R = str;
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(cd.L0(2131747847, null), new androidx.car.app.utils.a(a2, a10, m4Var, 4));
        if (a4Var.c()) {
            alertDialog$Builder.i(cd.L0(2131751599, null), new m4(a4Var, 0));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (a4Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, p6Var);
    }

    public static void h(c4 c4Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        if (u4Var != null && (textbutton = u4Var.f3385a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = s6.l(c4Var.e);
        }
        String str = l4;
        c4Var.f2901f.r3(false);
        if (z11) {
            i10 = 2131746019;
        } else {
            i10 = 2131746023;
        }
        c4Var.f2898a.H(cd.L0(i10, null), cd.L0(2131746027, null), str, false, !z10, new q4(c4Var, 1));
    }

    public static void i(c4 c4Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        u4 u4Var = c4Var.d;
        if (u4Var != null && (textbutton = u4Var.f3385a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        if (z11) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        c4Var.f2901f.r3(false);
        if (z11) {
            i10 = 2131746018;
        } else {
            i10 = 2131746022;
        }
        c4Var.f2898a.H(cd.L0(i10, null), cd.L0(2131746025, null), str2, true, !z10, new q4(c4Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.setOnShowListener(new ag.d0(editTextBoldCursor, 1));
        x1Var.r(250L);
        if (i10 != 0 && (x1Var.d(i10) instanceof TextView)) {
            a7.V((TextView) x1Var.d(i10), org.telegram.ui.ActionBar.t6.f21170q7, p6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, s4 s4Var) {
        if (k2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ay ayVar = new ay(bundle);
        ayVar.C2 = new a1.c(s4Var, 12);
        if (z10) {
            ?? obj = new Object();
            obj.f20389a = true;
            k2Var.showAsSheet(ayVar, obj);
            return;
        }
        k2Var.presentFragment(ayVar);
    }
}
