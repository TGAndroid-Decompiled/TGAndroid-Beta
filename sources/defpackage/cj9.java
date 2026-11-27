package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class cj9 {
    public static EditTextBoldCursor a(Context context, vnb vnbVar, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        yob.X(editTextBoldCursor, aob.j5, vnbVar);
        editTextBoldCursor.setHintText(str);
        yob.l(editTextBoldCursor, 34, aob.H6, vnbVar);
        yob.l(editTextBoldCursor, 35, aob.L6, vnbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        yob.F(editTextBoldCursor, aob.k6, aob.l6, aob.p7, vnbVar);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        yob.C(editTextBoldCursor, aob.lg, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        return editTextBoldCursor;
    }

    public static fu5 b(fu5 fu5Var, e eVar, final oi9 oi9Var, final boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        if (dj9Var != null && (textbutton = dj9Var.a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(oi9Var, z);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(oi9Var, z);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    oi9Var.f.l3(true);
                    k(eVar, z, new zi9(oi9Var, (byte) 2));
                }
                return null;
            }
        }
        fu5Var.b(2131231749, ob6.M0(2131752191, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                boolean z2 = z;
                oi9 oi9Var2 = oi9Var;
                switch (b) {
                    case 0:
                        cj9.i(oi9Var2, z2);
                        return;
                    default:
                        cj9.h(oi9Var2, z2);
                        return;
                }
            }
        }, false);
        fu5Var.b(2131232108, ob6.M0(2131751732, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                boolean z2 = z;
                oi9 oi9Var2 = oi9Var;
                switch (b) {
                    case 0:
                        cj9.i(oi9Var2, z2);
                        return;
                    default:
                        cj9.h(oi9Var2, z2);
                        return;
                }
            }
        }, false);
        fu5Var.b(2131231625, ob6.M0(2131745726, null), new yn6(eVar, oi9Var, z, (byte) 18), false);
        fu5Var.a0();
        return fu5Var;
    }

    public static fu5 c(fu5 fu5Var, e eVar, final Context context, final vnb vnbVar, final mi9 mi9Var, final boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
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
                e(context, vnbVar, mi9Var, z);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, vnbVar, mi9Var, z);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(eVar, context, vnbVar, mi9Var, z);
                }
                return null;
            }
        }
        fu5Var.b(2131231749, ob6.M0(2131752191, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r5;
                boolean z2 = z;
                mi9 mi9Var2 = mi9Var;
                vnb vnbVar2 = vnbVar;
                Context context2 = context;
                switch (b) {
                    case 0:
                        cj9.e(context2, vnbVar2, mi9Var2, z2);
                        return;
                    default:
                        cj9.d(context2, vnbVar2, mi9Var2, z2);
                        return;
                }
            }
        }, false);
        fu5Var.b(2131232108, ob6.M0(2131751732, null), new Runnable() {
            @Override
            public final void run() {
                byte b = r5;
                boolean z2 = z;
                mi9 mi9Var2 = mi9Var;
                vnb vnbVar2 = vnbVar;
                Context context2 = context;
                switch (b) {
                    case 0:
                        cj9.e(context2, vnbVar2, mi9Var2, z2);
                        return;
                    default:
                        cj9.d(context2, vnbVar2, mi9Var2, z2);
                        return;
                }
            }
        }, false);
        fu5Var.b(2131231625, ob6.M0(2131745726, null), new va7(eVar, (Object) context, (Object) vnbVar, (Object) mi9Var, z, (byte) 17), false);
        fu5Var.a0();
        return fu5Var;
    }

    public static void d(Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        boolean c = mi9Var.c();
        int i2 = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
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
            i = 2131745729;
        } else {
            i = 2131745733;
        }
        g(context, vnbVar, mi9Var, z, ob6.M0(i, null), ob6.M0(2131745737, null), str2, new xi9(mi9Var, (byte) 2));
    }

    public static void e(Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        boolean c = mi9Var.c();
        int i2 = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
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
            i = 2131745728;
        } else {
            i = 2131745732;
        }
        g(context, vnbVar, mi9Var, z, ob6.M0(i, null), ob6.M0(2131745735, null), str2, new xi9(mi9Var, (byte) 0));
    }

    public static void f(e eVar, Context context, vnb vnbVar, mi9 mi9Var, boolean z) {
        TL_keyboard.PageButton pageButton;
        String l;
        AlertDialog$Builder alertDialog$Builder;
        int i;
        boolean c = mi9Var.c();
        LinearLayout j = uh9.j(context, 1);
        int i2 = 0;
        j.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        String M0 = ob6.M0(2131745736, null);
        int i3 = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        if (d != null && i3 >= 0 && i3 < d.buttons.size()) {
            pageButton = d.buttons.get(i3);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l = "";
        } else {
            l = mm9.l(pageButton.text);
        }
        EditTextBoldCursor a = a(context, vnbVar, M0, l);
        j.addView(a, tre.o(-1, 64));
        lb7 lb7Var = new lb7(a, eVar, z, mi9Var, (byte) 10);
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        }
        if (c) {
            i = 2131745727;
        } else {
            i = 2131745731;
        }
        String M02 = ob6.M0(i, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M02;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new ag(c, lb7Var, a, mi9Var, (byte) 7));
        if (c) {
            alertDialog$Builder.h(ob6.M0(2131745734, null), new ye9(lb7Var, (byte) 5));
            String M03 = ob6.M0(2131751563, null);
            xi9 xi9Var = new xi9(mi9Var, (byte) 1);
            idVar.q0 = M03;
            idVar.r0 = xi9Var;
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.K0 = true;
            i2 = -4;
        } else {
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        }
        j(alertDialog$Builder, a, i2, vnbVar);
    }

    public static void g(Context context, vnb vnbVar, mi9 mi9Var, boolean z, String str, String str2, String str3, xi9 xi9Var) {
        TL_keyboard.PageButton pageButton;
        String l;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout j = uh9.j(context, 1);
        int i = 0;
        j.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
        String M0 = ob6.M0(2131745736, null);
        int i2 = mi9Var.b;
        TL_iv.pageBlockButtonRow d = mi9Var.d();
        if (d != null && i2 >= 0 && i2 < d.buttons.size()) {
            pageButton = d.buttons.get(i2);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l = "";
        } else {
            l = mm9.l(pageButton.text);
        }
        EditTextBoldCursor a = a(context, vnbVar, M0, l);
        EditTextBoldCursor a2 = a(context, vnbVar, str2, str3);
        j.addView(a, tre.o(-1, 64));
        j.addView(a2, tre.o(-1, 64));
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        }
        alertDialog$Builder.a.S = str;
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), new o48(a, a2, xi9Var, (byte) 7));
        if (mi9Var.c()) {
            alertDialog$Builder.h(ob6.M0(2131751563, null), new xi9(mi9Var, (byte) 3));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        } else {
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        }
        if (!TextUtils.isEmpty(a.getText())) {
            a = a2;
        }
        if (mi9Var.c()) {
            i = -3;
        }
        j(alertDialog$Builder, a, i, vnbVar);
    }

    public static void h(oi9 oi9Var, boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l;
        int i;
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        if (dj9Var != null && (textbutton = dj9Var.a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z2) {
            l = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l = mm9.l(oi9Var.e);
        }
        String str = l;
        oi9Var.f.l3(false);
        if (z2) {
            i = 2131745729;
        } else {
            i = 2131745733;
        }
        oi9Var.a.I(ob6.M0(i, null), ob6.M0(2131745737, null), str, false, !z, new zi9(oi9Var, (byte) 1));
    }

    public static void i(oi9 oi9Var, boolean z) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i;
        TL_iv.textButton textbutton;
        dj9 dj9Var = oi9Var.d;
        if (dj9Var != null && (textbutton = dj9Var.a) != null) {
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
        oi9Var.f.l3(false);
        if (z2) {
            i = 2131745728;
        } else {
            i = 2131745732;
        }
        oi9Var.a.I(ob6.M0(i, null), ob6.M0(2131745735, null), str2, true, !z, new zi9(oi9Var, (byte) 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i, vnb vnbVar) {
        id idVar = alertDialog$Builder.a;
        idVar.setOnShowListener(new ee4(editTextBoldCursor, (byte) 1));
        idVar.q(250L);
        if (i != 0 && (idVar.c(i) instanceof TextView)) {
            yob.X((TextView) idVar.c(i), aob.q7, vnbVar);
        }
    }

    public static void k(e eVar, boolean z, bj9 bj9Var) {
        if (eVar == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        uj3 uj3Var = new uj3(bundle);
        uj3Var.E2 = new ye9(bj9Var, (byte) 4);
        if (z) {
            ?? obj = new Object();
            obj.a = true;
            eVar.showAsSheet(uj3Var, obj);
            return;
        }
        eVar.presentFragment(uj3Var);
    }
}
