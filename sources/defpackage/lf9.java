package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class lf9 {
    public static EditTextBoldCursor a(Context context, wjb wjbVar, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        zkb.X(editTextBoldCursor, bkb.i5, wjbVar);
        editTextBoldCursor.setHintText(str);
        zkb.l(editTextBoldCursor, 34, bkb.G6, wjbVar);
        zkb.l(editTextBoldCursor, 35, bkb.K6, wjbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        zkb.F(editTextBoldCursor, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        zkb.C(editTextBoldCursor, bkb.kg, wjbVar);
        zkb.l(editTextBoldCursor, 36, bkb.lg, wjbVar);
        return editTextBoldCursor;
    }

    public static cs5 b(cs5 cs5Var, d dVar, final xe9 xe9Var, final boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        mf9 mf9Var = xe9Var.d;
        if (mf9Var != null && (textbutton = mf9Var.a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(xe9Var, z);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(xe9Var, z);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    xe9Var.f.k3(true);
                    k(dVar, z, new if9(xe9Var, (byte) 2));
                }
                return null;
            }
        }
        cs5Var.b(2131231749, k96.M0(2131752214, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                boolean z2 = z;
                xe9 xe9Var2 = xe9Var;
                switch (b) {
                    case 0:
                        lf9.i(xe9Var2, z2);
                        return;
                    default:
                        lf9.h(xe9Var2, z2);
                        return;
                }
            }
        }, false);
        cs5Var.b(2131232108, k96.M0(2131751755, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                boolean z2 = z;
                xe9 xe9Var2 = xe9Var;
                switch (b) {
                    case 0:
                        lf9.i(xe9Var2, z2);
                        return;
                    default:
                        lf9.h(xe9Var2, z2);
                        return;
                }
            }
        }, false);
        cs5Var.b(2131231625, k96.M0(2131745806, null), new vj6(dVar, xe9Var, z, (byte) 19), false);
        cs5Var.a0();
        return cs5Var;
    }

    public static cs5 c(cs5 cs5Var, d dVar, final Context context, final wjb wjbVar, final ve9 ve9Var, final boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i = ve9Var.b;
        TL_iv.pageBlockButtonRow d = ve9Var.d();
        if (d != null && i >= 0 && i < d.buttons.size()) {
            pageButton = d.buttons.get(i);
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
                e(context, wjbVar, ve9Var, z);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, wjbVar, ve9Var, z);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(dVar, context, wjbVar, ve9Var, z);
                }
                return null;
            }
        }
        cs5Var.b(2131231749, k96.M0(2131752214, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r5;
                boolean z2 = z;
                ve9 ve9Var2 = ve9Var;
                wjb wjbVar2 = wjbVar;
                Context context2 = context;
                switch (b) {
                    case 0:
                        lf9.e(context2, wjbVar2, ve9Var2, z2);
                        return;
                    default:
                        lf9.d(context2, wjbVar2, ve9Var2, z2);
                        return;
                }
            }
        }, false);
        cs5Var.b(2131232108, k96.M0(2131751755, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r5;
                boolean z2 = z;
                ve9 ve9Var2 = ve9Var;
                wjb wjbVar2 = wjbVar;
                Context context2 = context;
                switch (b) {
                    case 0:
                        lf9.e(context2, wjbVar2, ve9Var2, z2);
                        return;
                    default:
                        lf9.d(context2, wjbVar2, ve9Var2, z2);
                        return;
                }
            }
        }, false);
        cs5Var.b(2131231625, k96.M0(2131745806, null), new z77(dVar, (Object) context, (Object) wjbVar, (Object) ve9Var, z, (byte) 17), false);
        cs5Var.a0();
        return cs5Var;
    }

    public static void d(Context context, wjb wjbVar, ve9 ve9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        boolean c = ve9Var.c();
        int i2 = ve9Var.b;
        TL_iv.pageBlockButtonRow d = ve9Var.d();
        if (d != null && i2 >= 0 && i2 < d.buttons.size()) {
            pageButton = d.buttons.get(i2);
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
        if (c) {
            i = 2131745809;
        } else {
            i = 2131745813;
        }
        g(context, wjbVar, ve9Var, z, k96.M0(i, null), k96.M0(2131745817, null), str2, new gf9(ve9Var, (byte) 3));
    }

    public static void e(Context context, wjb wjbVar, ve9 ve9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        boolean c = ve9Var.c();
        int i2 = ve9Var.b;
        TL_iv.pageBlockButtonRow d = ve9Var.d();
        if (d != null && i2 >= 0 && i2 < d.buttons.size()) {
            pageButton = d.buttons.get(i2);
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
        if (c) {
            i = 2131745808;
        } else {
            i = 2131745812;
        }
        g(context, wjbVar, ve9Var, z, k96.M0(i, null), k96.M0(2131745815, null), str2, new gf9(ve9Var, (byte) 1));
    }

    public static void f(d dVar, Context context, wjb wjbVar, ve9 ve9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        String l;
        AlertDialog$Builder alertDialog$Builder;
        int i;
        boolean c = ve9Var.c();
        LinearLayout j = de9.j(context, 1);
        int i2 = 0;
        j.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
        String M0 = k96.M0(2131745816, null);
        int i3 = ve9Var.b;
        TL_iv.pageBlockButtonRow d = ve9Var.d();
        if (d != null && i3 >= 0 && i3 < d.buttons.size()) {
            pageButton = d.buttons.get(i3);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l = "";
        } else {
            l = yi9.l(pageButton.text);
        }
        EditTextBoldCursor a = a(context, wjbVar, M0, l);
        j.addView(a, nme.o(-1, 64));
        d97 d97Var = new d97(a, dVar, z, ve9Var, (byte) 10);
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        }
        if (c) {
            i = 2131745807;
        } else {
            i = 2131745811;
        }
        String M02 = k96.M0(i, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M02;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131747638, null), new wf(c, d97Var, a, ve9Var, (byte) 7));
        if (c) {
            alertDialog$Builder.h(k96.M0(2131745814, null), new k88(d97Var, (byte) 27));
            String M03 = k96.M0(2131751586, null);
            gf9 gf9Var = new gf9(ve9Var, (byte) 2);
            hdVar.q0 = M03;
            hdVar.r0 = gf9Var;
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.K0 = true;
            i2 = -4;
        } else {
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        }
        j(alertDialog$Builder, a, i2, wjbVar);
    }

    public static void g(Context context, wjb wjbVar, ve9 ve9Var, boolean z, String str, String str2, String str3, gf9 gf9Var) {
        TL_keyboard.PageButton pageButton;
        String l;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout j = de9.j(context, 1);
        int i = 0;
        j.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
        String M0 = k96.M0(2131745816, null);
        int i2 = ve9Var.b;
        TL_iv.pageBlockButtonRow d = ve9Var.d();
        if (d != null && i2 >= 0 && i2 < d.buttons.size()) {
            pageButton = d.buttons.get(i2);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l = "";
        } else {
            l = yi9.l(pageButton.text);
        }
        EditTextBoldCursor a = a(context, wjbVar, M0, l);
        EditTextBoldCursor a2 = a(context, wjbVar, str2, str3);
        j.addView(a, nme.o(-1, 64));
        j.addView(a2, nme.o(-1, 64));
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        }
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131747638, null), new lt2(a, a2, gf9Var));
        if (ve9Var.c()) {
            alertDialog$Builder.h(k96.M0(2131751586, null), new gf9(ve9Var, (byte) 0));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        } else {
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        }
        if (!TextUtils.isEmpty(a.getText())) {
            a = a2;
        }
        if (ve9Var.c()) {
            i = -3;
        }
        j(alertDialog$Builder, a, i, wjbVar);
    }

    public static void h(xe9 xe9Var, boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l;
        int i;
        TL_iv.textButton textbutton;
        mf9 mf9Var = xe9Var.d;
        if (mf9Var != null && (textbutton = mf9Var.a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z2) {
            l = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l = yi9.l(xe9Var.e);
        }
        String str = l;
        xe9Var.f.k3(false);
        if (z2) {
            i = 2131745809;
        } else {
            i = 2131745813;
        }
        xe9Var.a.I(k96.M0(i, null), k96.M0(2131745817, null), str, false, !z, new if9(xe9Var, (byte) 1));
    }

    public static void i(xe9 xe9Var, boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        TL_iv.textButton textbutton;
        mf9 mf9Var = xe9Var.d;
        if (mf9Var != null && (textbutton = mf9Var.a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        if (z2) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        xe9Var.f.k3(false);
        if (z2) {
            i = 2131745808;
        } else {
            i = 2131745812;
        }
        xe9Var.a.I(k96.M0(i, null), k96.M0(2131745815, null), str2, true, !z, new if9(xe9Var, (byte) 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i, wjb wjbVar) {
        hd hdVar = alertDialog$Builder.a;
        hdVar.setOnShowListener(new hc4(editTextBoldCursor, (byte) 1));
        hdVar.q(250L);
        if (i != 0 && (hdVar.c(i) instanceof TextView)) {
            zkb.X((TextView) hdVar.c(i), bkb.p7, wjbVar);
        }
    }

    public static void k(d dVar, boolean z, kf9 kf9Var) {
        if (dVar == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cj3 cj3Var = new cj3(bundle);
        cj3Var.E2 = new k88(kf9Var, (byte) 28);
        if (z) {
            ?? obj = new Object();
            obj.a = true;
            dVar.showAsSheet(cj3Var, obj);
            return;
        }
        dVar.presentFragment(cj3Var);
    }
}
