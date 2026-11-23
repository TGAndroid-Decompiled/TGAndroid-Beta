package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.p6;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bx;
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, i6 i6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        u6.U(editTextBoldCursor, n6.f29559j5, i6Var);
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
        u6.F(editTextBoldCursor, n6.f29580k6, n6.f29598l6, n6.f29672p7, i6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        u6.C(editTextBoldCursor, n6.f29607lg, i6Var);
        u6.l(editTextBoldCursor, 36, n6.f29624mg, i6Var);
        return editTextBoldCursor;
    }

    public static x60 b(x60 x60Var, org.telegram.ui.ActionBar.g2 g2Var, final s3 s3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f22250a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(s3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(s3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    s3Var.f22442f.r3(true);
                    k(g2Var, z10, new e4(s3Var, 2));
                }
                return null;
            }
        }
        x60Var.c(2131231749, gd.N0(2131752214, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h4.i(s3Var, z10);
                        return;
                    default:
                        h4.h(s3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(2131232108, gd.N0(2131751755, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h4.i(s3Var, z10);
                        return;
                    default:
                        h4.h(s3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(2131231625, gd.N0(2131745803, null), new p6(g2Var, s3Var, z10, 9), false);
        x60Var.a0();
        return x60Var;
    }

    public static x60 c(x60 x60Var, org.telegram.ui.ActionBar.g2 g2Var, final Context context, final i6 i6Var, final q3 q3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = q3Var.f22401b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
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
                e(context, i6Var, q3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, i6Var, q3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(g2Var, context, i6Var, q3Var, z10);
                }
                return null;
            }
        }
        x60Var.c(2131231749, gd.N0(2131752214, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, i6Var, q3Var, z10);
                        return;
                    default:
                        h4.d(context, i6Var, q3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(2131232108, gd.N0(2131751755, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, i6Var, q3Var, z10);
                        return;
                    default:
                        h4.d(context, i6Var, q3Var, z10);
                        return;
                }
            }
        }, false);
        x60Var.c(2131231625, gd.N0(2131745803, null), new ai.e(g2Var, context, i6Var, q3Var, z10, 4), false);
        x60Var.a0();
        return x60Var;
    }

    public static void d(Context context, i6 i6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f22401b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
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
        g(context, i6Var, q3Var, z10, gd.N0(i7, null), gd.N0(2131745814, null), str2, new c4(q3Var, 3));
    }

    public static void e(Context context, i6 i6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f22401b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
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
        g(context, i6Var, q3Var, z10, gd.N0(i7, null), gd.N0(2131745812, null), str2, new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.g2 g2Var, Context context, i6 i6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = q3Var.c();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i10 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = gd.N0(2131745813, null);
        int i11 = q3Var.f22401b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = c6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, i6Var, N0, l10);
        g10.addView(a10, na.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, g2Var, z10, q3Var, 7);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        }
        if (c10) {
            i7 = 2131745804;
        } else {
            i7 = 2131745808;
        }
        String N02 = gd.N0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N02;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), new a3.g(c10, c0Var, a10, q3Var, 4));
        if (c10) {
            alertDialog$Builder.i(gd.N0(2131745811, null), new kg.f1(c0Var, 25));
            String N03 = gd.N0(2131751586, null);
            c4 c4Var = new c4(q3Var, 2);
            t1Var.f30099q0 = N03;
            t1Var.f30101r0 = c4Var;
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            t1Var.K0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        }
        j(alertDialog$Builder, a10, i10, i6Var);
    }

    public static void g(Context context, i6 i6Var, q3 q3Var, boolean z10, String str, String str2, String str3, c4 c4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i7 = 0;
        g10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String N0 = gd.N0(2131745813, null);
        int i10 = q3Var.f22401b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = c6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, i6Var, N0, l10);
        EditTextBoldCursor a11 = a(context, i6Var, str2, str3);
        g10.addView(a10, na.o(-1, 64));
        g10.addView(a11, na.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        }
        alertDialog$Builder.f28835a.S = str;
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), new a3.h(a10, a11, c4Var, 17));
        if (q3Var.c()) {
            alertDialog$Builder.i(gd.N0(2131751586, null), new c4(q3Var, 0));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        } else {
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (q3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, i6Var);
    }

    public static void h(s3 s3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f22250a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = c6.l(s3Var.f22441e);
        }
        String str = l10;
        s3Var.f22442f.r3(false);
        if (z11) {
            i7 = 2131745806;
        } else {
            i7 = 2131745810;
        }
        s3Var.f22438a.I(gd.N0(i7, null), gd.N0(2131745814, null), str, false, !z10, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f22250a) != null) {
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
        s3Var.f22442f.r3(false);
        if (z11) {
            i7 = 2131745805;
        } else {
            i7 = 2131745809;
        }
        s3Var.f22438a.I(gd.N0(i7, null), gd.N0(2131745812, null), str2, true, !z10, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        t1Var.r(250L);
        if (i7 != 0 && (t1Var.d(i7) instanceof TextView)) {
            u6.U((TextView) t1Var.d(i7), n6.f29692q7, i6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, g4 g4Var) {
        if (g2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        bx bxVar = new bx(bundle);
        bxVar.E2 = new kg.f1(g4Var, 26);
        if (z10) {
            ?? obj = new Object();
            obj.f28948a = true;
            g2Var.showAsSheet(bxVar, obj);
            return;
        }
        g2Var.presentFragment(bxVar);
    }
}
