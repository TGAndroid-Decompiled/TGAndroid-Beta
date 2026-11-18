package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.p6;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cx;
public abstract class g4 {
    public static EditTextBoldCursor a(Context context, i6 i6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        u6.U(editTextBoldCursor, n6.f29504j5, i6Var);
        editTextBoldCursor.setHintText(str);
        u6.l(editTextBoldCursor, 34, n6.H6, i6Var);
        u6.l(editTextBoldCursor, 35, n6.L6, i6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        u6.F(editTextBoldCursor, n6.f29525k6, n6.f29543l6, n6.f29617p7, i6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        u6.C(editTextBoldCursor, n6.f29552lg, i6Var);
        u6.l(editTextBoldCursor, 36, n6.f29569mg, i6Var);
        return editTextBoldCursor;
    }

    public static y60 b(y60 y60Var, org.telegram.ui.ActionBar.h2 h2Var, final r3 r3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22092a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(r3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(r3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    r3Var.f22292f.r3(true);
                    k(h2Var, z10, new d4(r3Var, 2));
                }
                return null;
            }
        }
        y60Var.c(2131231746, gd.M0(2131752215, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        g4.i(r3Var, z10);
                        return;
                    default:
                        g4.h(r3Var, z10);
                        return;
                }
            }
        }, false);
        y60Var.c(2131232105, gd.M0(2131751756, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        g4.i(r3Var, z10);
                        return;
                    default:
                        g4.h(r3Var, z10);
                        return;
                }
            }
        }, false);
        y60Var.c(2131231622, gd.M0(2131745804, null), new p6(h2Var, r3Var, z10, 9), false);
        y60Var.a0();
        return y60Var;
    }

    public static y60 c(y60 y60Var, org.telegram.ui.ActionBar.h2 h2Var, final Context context, final i6 i6Var, final p3 p3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = p3Var.f22242b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i7 >= 0 && i7 < d.buttons.size()) {
            pageButton = d.buttons.get(i7);
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
                e(context, i6Var, p3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, i6Var, p3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(h2Var, context, i6Var, p3Var, z10);
                }
                return null;
            }
        }
        y60Var.c(2131231746, gd.M0(2131752215, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        g4.e(context, i6Var, p3Var, z10);
                        return;
                    default:
                        g4.d(context, i6Var, p3Var, z10);
                        return;
                }
            }
        }, false);
        y60Var.c(2131232105, gd.M0(2131751756, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        g4.e(context, i6Var, p3Var, z10);
                        return;
                    default:
                        g4.d(context, i6Var, p3Var, z10);
                        return;
                }
            }
        }, false);
        y60Var.c(2131231622, gd.M0(2131745804, null), new ai.n(h2Var, context, i6Var, p3Var, z10, 4), false);
        y60Var.a0();
        return y60Var;
    }

    public static void d(Context context, i6 i6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = p3Var.c();
        int i10 = p3Var.f22242b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
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
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            str = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            str = "";
        }
        String str2 = str;
        if (c10) {
            i7 = 2131745807;
        } else {
            i7 = 2131745811;
        }
        g(context, i6Var, p3Var, z10, gd.M0(i7, null), gd.M0(2131745815, null), str2, new b4(p3Var, 3));
    }

    public static void e(Context context, i6 i6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = p3Var.c();
        int i10 = p3Var.f22242b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
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
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        if (c10) {
            i7 = 2131745806;
        } else {
            i7 = 2131745810;
        }
        g(context, i6Var, p3Var, z10, gd.M0(i7, null), gd.M0(2131745813, null), str2, new b4(p3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.h2 h2Var, Context context, i6 i6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = p3Var.c();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i10 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = gd.M0(2131745814, null);
        int i11 = p3Var.f22242b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = b6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, i6Var, M0, l10);
        g10.addView(a10, ma.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, h2Var, z10, p3Var, 7);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        }
        if (c10) {
            i7 = 2131745805;
        } else {
            i7 = 2131745809;
        }
        String M02 = gd.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M02;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.M0(2131747638, null), new a3.g(c10, c0Var, a10, p3Var, 4));
        if (c10) {
            alertDialog$Builder.i(gd.M0(2131745812, null), new ki.e(c0Var, 22));
            String M03 = gd.M0(2131751587, null);
            b4 b4Var = new b4(p3Var, 2);
            u1Var.f30057q0 = M03;
            u1Var.f30059r0 = b4Var;
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            u1Var.K0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        }
        j(alertDialog$Builder, a10, i10, i6Var);
    }

    public static void g(Context context, i6 i6Var, p3 p3Var, boolean z10, String str, String str2, String str3, b4 b4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i7 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = gd.M0(2131745814, null);
        int i10 = p3Var.f22242b;
        TL_iv.pageBlockButtonRow d = p3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = b6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, i6Var, M0, l10);
        EditTextBoldCursor a11 = a(context, i6Var, str2, str3);
        g10.addView(a10, ma.o(-1, 64));
        g10.addView(a11, ma.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        }
        alertDialog$Builder.f28746a.S = str;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.M0(2131747638, null), new a3.h(a10, a11, b4Var, 17));
        if (p3Var.c()) {
            alertDialog$Builder.i(gd.M0(2131751587, null), new b4(p3Var, 0));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        } else {
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (p3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, i6Var);
    }

    public static void h(r3 r3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22092a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = b6.l(r3Var.f22291e);
        }
        String str = l10;
        r3Var.f22292f.r3(false);
        if (z11) {
            i7 = 2131745807;
        } else {
            i7 = 2131745811;
        }
        r3Var.f22288a.I(gd.M0(i7, null), gd.M0(2131745815, null), str, false, !z10, new d4(r3Var, 1));
    }

    public static void i(r3 r3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22092a) != null) {
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
        r3Var.f22292f.r3(false);
        if (z11) {
            i7 = 2131745806;
        } else {
            i7 = 2131745810;
        }
        r3Var.f22288a.I(gd.M0(i7, null), gd.M0(2131745813, null), str2, true, !z10, new d4(r3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        u1Var.r(250L);
        if (i7 != 0 && (u1Var.d(i7) instanceof TextView)) {
            u6.U((TextView) u1Var.d(i7), n6.f29637q7, i6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, f4 f4Var) {
        if (h2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cx cxVar = new cx(bundle);
        cxVar.E2 = new ki.e(f4Var, 23);
        if (z10) {
            ?? obj = new Object();
            obj.f28923a = true;
            h2Var.showAsSheet(cxVar, obj);
            return;
        }
        h2Var.presentFragment(cxVar);
    }
}
