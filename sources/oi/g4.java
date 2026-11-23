package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.p6;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.cx;
public abstract class g4 {
    public static EditTextBoldCursor a(Context context, h6 h6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        t6.U(editTextBoldCursor, m6.f29455j5, h6Var);
        editTextBoldCursor.setHintText(str);
        t6.l(editTextBoldCursor, 34, m6.H6, h6Var);
        t6.l(editTextBoldCursor, 35, m6.L6, h6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        t6.F(editTextBoldCursor, m6.f29476k6, m6.f29494l6, m6.f29568p7, h6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        t6.C(editTextBoldCursor, m6.f29503lg, h6Var);
        t6.l(editTextBoldCursor, 36, m6.f29520mg, h6Var);
        return editTextBoldCursor;
    }

    public static a70 b(a70 a70Var, org.telegram.ui.ActionBar.g2 g2Var, final r3 r3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22119a) != null) {
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
                    r3Var.f22317f.r3(true);
                    k(g2Var, z10, new d4(r3Var, 2));
                }
                return null;
            }
        }
        a70Var.c(2131231746, hd.N0(2131752214, null), new Runnable() {
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
        a70Var.c(2131232105, hd.N0(2131751755, null), new Runnable() {
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
        a70Var.c(2131231622, hd.N0(2131745803, null), new p6(g2Var, r3Var, z10, 9), false);
        a70Var.a0();
        return a70Var;
    }

    public static a70 c(a70 a70Var, org.telegram.ui.ActionBar.g2 g2Var, final Context context, final h6 h6Var, final p3 p3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = p3Var.f22269b;
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
                e(context, h6Var, p3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, h6Var, p3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(g2Var, context, h6Var, p3Var, z10);
                }
                return null;
            }
        }
        a70Var.c(2131231746, hd.N0(2131752214, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        g4.e(context, h6Var, p3Var, z10);
                        return;
                    default:
                        g4.d(context, h6Var, p3Var, z10);
                        return;
                }
            }
        }, false);
        a70Var.c(2131232105, hd.N0(2131751755, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        g4.e(context, h6Var, p3Var, z10);
                        return;
                    default:
                        g4.d(context, h6Var, p3Var, z10);
                        return;
                }
            }
        }, false);
        a70Var.c(2131231622, hd.N0(2131745803, null), new ai.e(g2Var, context, h6Var, p3Var, z10, 4), false);
        a70Var.a0();
        return a70Var;
    }

    public static void d(Context context, h6 h6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = p3Var.c();
        int i10 = p3Var.f22269b;
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
            i7 = 2131745806;
        } else {
            i7 = 2131745810;
        }
        g(context, h6Var, p3Var, z10, hd.N0(i7, null), hd.N0(2131745814, null), str2, new b4(p3Var, 3));
    }

    public static void e(Context context, h6 h6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = p3Var.c();
        int i10 = p3Var.f22269b;
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
            i7 = 2131745805;
        } else {
            i7 = 2131745809;
        }
        g(context, h6Var, p3Var, z10, hd.N0(i7, null), hd.N0(2131745812, null), str2, new b4(p3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.g2 g2Var, Context context, h6 h6Var, p3 p3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = p3Var.c();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i10 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = hd.N0(2131745813, null);
        int i11 = p3Var.f22269b;
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
        EditTextBoldCursor a10 = a(context, h6Var, N0, l10);
        g10.addView(a10, na.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, g2Var, z10, p3Var, 7);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        }
        if (c10) {
            i7 = 2131745804;
        } else {
            i7 = 2131745808;
        }
        String N02 = hd.N0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N02;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(hd.N0(2131747637, null), new a3.g(c10, c0Var, a10, p3Var, 4));
        if (c10) {
            alertDialog$Builder.i(hd.N0(2131745811, null), new kg.y1(c0Var, 23));
            String N03 = hd.N0(2131751586, null);
            b4 b4Var = new b4(p3Var, 2);
            t1Var.f30007q0 = N03;
            t1Var.f30009r0 = b4Var;
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            t1Var.K0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
        }
        j(alertDialog$Builder, a10, i10, h6Var);
    }

    public static void g(Context context, h6 h6Var, p3 p3Var, boolean z10, String str, String str2, String str3, b4 b4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i7 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = hd.N0(2131745813, null);
        int i10 = p3Var.f22269b;
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
        EditTextBoldCursor a10 = a(context, h6Var, N0, l10);
        EditTextBoldCursor a11 = a(context, h6Var, str2, str3);
        g10.addView(a10, na.o(-1, 64));
        g10.addView(a11, na.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        }
        alertDialog$Builder.f28743a.S = str;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(hd.N0(2131747637, null), new a3.h(a10, a11, b4Var, 17));
        if (p3Var.c()) {
            alertDialog$Builder.i(hd.N0(2131751586, null), new b4(p3Var, 0));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
        } else {
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (p3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, h6Var);
    }

    public static void h(r3 r3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22119a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = b6.l(r3Var.f22316e);
        }
        String str = l10;
        r3Var.f22317f.r3(false);
        if (z11) {
            i7 = 2131745806;
        } else {
            i7 = 2131745810;
        }
        r3Var.f22313a.I(hd.N0(i7, null), hd.N0(2131745814, null), str, false, !z10, new d4(r3Var, 1));
    }

    public static void i(r3 r3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        h4 h4Var = r3Var.d;
        if (h4Var != null && (textbutton = h4Var.f22119a) != null) {
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
        r3Var.f22317f.r3(false);
        if (z11) {
            i7 = 2131745805;
        } else {
            i7 = 2131745809;
        }
        r3Var.f22313a.I(hd.N0(i7, null), hd.N0(2131745812, null), str2, true, !z10, new d4(r3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        t1Var.r(250L);
        if (i7 != 0 && (t1Var.d(i7) instanceof TextView)) {
            t6.U((TextView) t1Var.d(i7), m6.f29588q7, h6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, f4 f4Var) {
        if (g2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cx cxVar = new cx(bundle);
        cxVar.E2 = new kg.y1(f4Var, 24);
        if (z10) {
            ?? obj = new Object();
            obj.f28871a = true;
            g2Var.showAsSheet(cxVar, obj);
            return;
        }
        g2Var.presentFragment(cxVar);
    }
}
