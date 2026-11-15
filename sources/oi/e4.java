package oi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.m6;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m60;
import org.telegram.ui.yw;
public abstract class e4 {
    public static EditTextBoldCursor a(Context context, e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        q6.U(editTextBoldCursor, j6.f28957j5, e6Var);
        editTextBoldCursor.setHintText(str);
        q6.l(editTextBoldCursor, 34, j6.H6, e6Var);
        q6.l(editTextBoldCursor, 35, j6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        q6.F(editTextBoldCursor, j6.f28978k6, j6.f28996l6, j6.f29070p7, e6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        q6.C(editTextBoldCursor, j6.f29005lg, e6Var);
        q6.l(editTextBoldCursor, 36, j6.f29022mg, e6Var);
        return editTextBoldCursor;
    }

    public static m60 b(m60 m60Var, org.telegram.ui.ActionBar.e2 e2Var, final p3 p3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        if (f4Var != null && (textbutton = f4Var.f21697a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(p3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(p3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    p3Var.f21878f.r3(true);
                    k(e2Var, z10, new b4(p3Var, 2));
                }
                return null;
            }
        }
        m60Var.c(2131231745, hd.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e4.i(p3Var, z10);
                        return;
                    default:
                        e4.h(p3Var, z10);
                        return;
                }
            }
        }, false);
        m60Var.c(2131232104, hd.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e4.i(p3Var, z10);
                        return;
                    default:
                        e4.h(p3Var, z10);
                        return;
                }
            }
        }, false);
        m60Var.c(2131231621, hd.M0(2131745999, null), new m6(e2Var, p3Var, z10, 9), false);
        m60Var.Z();
        return m60Var;
    }

    public static m60 c(m60 m60Var, org.telegram.ui.ActionBar.e2 e2Var, final Context context, final e6 e6Var, final n3 n3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = n3Var.f21840b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
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
                e(context, e6Var, n3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, e6Var, n3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(e2Var, context, e6Var, n3Var, z10);
                }
                return null;
            }
        }
        m60Var.c(2131231745, hd.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        e4.e(context, e6Var, n3Var, z10);
                        return;
                    default:
                        e4.d(context, e6Var, n3Var, z10);
                        return;
                }
            }
        }, false);
        m60Var.c(2131232104, hd.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        e4.e(context, e6Var, n3Var, z10);
                        return;
                    default:
                        e4.d(context, e6Var, n3Var, z10);
                        return;
                }
            }
        }, false);
        m60Var.c(2131231621, hd.M0(2131745999, null), new ai.j(e2Var, context, e6Var, n3Var, z10, 4), false);
        m60Var.Z();
        return m60Var;
    }

    public static void d(Context context, e6 e6Var, n3 n3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = n3Var.c();
        int i10 = n3Var.f21840b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
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
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        g(context, e6Var, n3Var, z10, hd.M0(i7, null), hd.M0(2131746010, null), str2, new z3(n3Var, 3));
    }

    public static void e(Context context, e6 e6Var, n3 n3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = n3Var.c();
        int i10 = n3Var.f21840b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
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
            i7 = 2131746001;
        } else {
            i7 = 2131746005;
        }
        g(context, e6Var, n3Var, z10, hd.M0(i7, null), hd.M0(2131746008, null), str2, new z3(n3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.e2 e2Var, Context context, e6 e6Var, n3 n3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = n3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i10 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746009, null);
        int i11 = n3Var.f21840b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = a6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, e6Var, M0, l10);
        f10.addView(a10, ja.o(-1, 64));
        aa.c0 c0Var = new aa.c0(a10, e2Var, z10, n3Var, 7);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        if (c10) {
            i7 = 2131746000;
        } else {
            i7 = 2131746004;
        }
        String M02 = hd.M0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), new a3.g(c10, c0Var, a10, n3Var, 3));
        if (c10) {
            alertDialog$Builder.i(hd.M0(2131746007, null), new ki.e(c0Var, 21));
            String M03 = hd.M0(2131751598, null);
            z3 z3Var = new z3(n3Var, 2);
            t1Var.f29645q0 = M03;
            t1Var.f29647r0 = z3Var;
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            t1Var.K0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i10, e6Var);
    }

    public static void g(Context context, e6 e6Var, n3 n3Var, boolean z10, String str, String str2, String str3, z3 z3Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746009, null);
        int i10 = n3Var.f21840b;
        TL_iv.pageBlockButtonRow d = n3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = a6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, e6Var, M0, l10);
        EditTextBoldCursor a11 = a(context, e6Var, str2, str3);
        f10.addView(a10, ja.o(-1, 64));
        f10.addView(a11, ja.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        alertDialog$Builder.f28392a.S = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), new a3.h(a10, a11, z3Var, 17));
        if (n3Var.c()) {
            alertDialog$Builder.i(hd.M0(2131751598, null), new z3(n3Var, 0));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (n3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, e6Var);
    }

    public static void h(p3 p3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        if (f4Var != null && (textbutton = f4Var.f21697a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = a6.l(p3Var.f21877e);
        }
        String str = l10;
        p3Var.f21878f.r3(false);
        if (z11) {
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        p3Var.f21874a.I(hd.M0(i7, null), hd.M0(2131746010, null), str, false, !z10, new b4(p3Var, 1));
    }

    public static void i(p3 p3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        f4 f4Var = p3Var.d;
        if (f4Var != null && (textbutton = f4Var.f21697a) != null) {
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
        p3Var.f21878f.r3(false);
        if (z11) {
            i7 = 2131746001;
        } else {
            i7 = 2131746005;
        }
        p3Var.f21874a.I(hd.M0(i7, null), hd.M0(2131746008, null), str2, true, !z10, new b4(p3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, e6 e6Var) {
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.setOnShowListener(new bi.l(editTextBoldCursor, 3));
        t1Var.r(250L);
        if (i7 != 0 && (t1Var.d(i7) instanceof TextView)) {
            q6.U((TextView) t1Var.d(i7), j6.f29090q7, e6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, d4 d4Var) {
        if (e2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        yw ywVar = new yw(bundle);
        ywVar.E2 = new ki.e(d4Var, 22);
        if (z10) {
            ?? obj = new Object();
            obj.f28476a = true;
            e2Var.showAsSheet(ywVar, obj);
            return;
        }
        e2Var.presentFragment(ywVar);
    }
}
