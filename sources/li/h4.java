package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u7;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k60;
import org.telegram.ui.zw;
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, h6 h6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        t6.U(editTextBoldCursor, m6.f27998j5, h6Var);
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
        t6.F(editTextBoldCursor, m6.f28019k6, m6.f28037l6, m6.f28111p7, h6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        t6.C(editTextBoldCursor, m6.f27990ig, h6Var);
        t6.l(editTextBoldCursor, 36, m6.f28009jg, h6Var);
        return editTextBoldCursor;
    }

    public static k60 b(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final s3 s3Var, final boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18644a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(s3Var, z9);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(s3Var, z9);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    s3Var.f18843f.r3(true);
                    k(f2Var, z9, new e4(s3Var, 2));
                }
                return null;
            }
        }
        k60Var.c(2131231745, id.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h4.i(s3Var, z9);
                        return;
                    default:
                        h4.h(s3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131232103, id.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h4.i(s3Var, z9);
                        return;
                    default:
                        h4.h(s3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131231621, id.M0(2131745999, null), new u7(f2Var, s3Var, z9, 9), false);
        k60Var.Z();
        return k60Var;
    }

    public static k60 c(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final Context context, final h6 h6Var, final q3 q3Var, final boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = q3Var.f18792b;
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
                e(context, h6Var, q3Var, z9);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, h6Var, q3Var, z9);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(f2Var, context, h6Var, q3Var, z9);
                }
                return null;
            }
        }
        k60Var.c(2131231745, id.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, h6Var, q3Var, z9);
                        return;
                    default:
                        h4.d(context, h6Var, q3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131232103, id.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, h6Var, q3Var, z9);
                        return;
                    default:
                        h4.d(context, h6Var, q3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131231621, id.M0(2131745999, null), new fi.q1(f2Var, context, h6Var, q3Var, z9, 3), false);
        k60Var.Z();
        return k60Var;
    }

    public static void d(Context context, h6 h6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f18792b;
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
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        g(context, h6Var, q3Var, z9, id.M0(i7, null), id.M0(2131746010, null), str2, new c4(q3Var, 3));
    }

    public static void e(Context context, h6 h6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f18792b;
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
            i7 = 2131746001;
        } else {
            i7 = 2131746005;
        }
        g(context, h6Var, q3Var, z9, id.M0(i7, null), id.M0(2131746008, null), str2, new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, Context context, h6 h6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i10 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = id.M0(2131746009, null);
        int i11 = q3Var.f18792b;
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
        EditTextBoldCursor a10 = a(context, h6Var, M0, l10);
        f10.addView(a10, ha.o(-1, 64));
        aa.d0 d0Var = new aa.d0(a10, f2Var, z9, q3Var, 7);
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        }
        if (c10) {
            i7 = 2131746000;
        } else {
            i7 = 2131746004;
        }
        String M02 = id.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(id.M0(2131747831, null), new a3.g(c10, d0Var, a10, q3Var, 3));
        if (c10) {
            alertDialog$Builder.i(id.M0(2131746007, null), new l2.x(d0Var, 8));
            String M03 = id.M0(2131751598, null);
            c4 c4Var = new c4(q3Var, 2);
            u1Var.f28566p0 = M03;
            u1Var.f28567q0 = c4Var;
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            u1Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i10, h6Var);
    }

    public static void g(Context context, h6 h6Var, q3 q3Var, boolean z9, String str, String str2, String str3, c4 c4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = id.M0(2131746009, null);
        int i10 = q3Var.f18792b;
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
        EditTextBoldCursor a10 = a(context, h6Var, M0, l10);
        EditTextBoldCursor a11 = a(context, h6Var, str2, str3);
        f10.addView(a10, ha.o(-1, 64));
        f10.addView(a11, ha.o(-1, 64));
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        }
        alertDialog$Builder.f27300a.R = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(id.M0(2131747831, null), new a3.h(a10, a11, c4Var, 16));
        if (q3Var.c()) {
            alertDialog$Builder.i(id.M0(2131751598, null), new c4(q3Var, 0));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(id.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (q3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, h6Var);
    }

    public static void h(s3 s3Var, boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18644a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z10) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = c6.l(s3Var.f18842e);
        }
        String str = l10;
        s3Var.f18843f.r3(false);
        if (z10) {
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        s3Var.f18839a.H(id.M0(i7, null), id.M0(2131746010, null), str, false, !z9, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18644a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl;
        if (z10) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        s3Var.f18843f.r3(false);
        if (z10) {
            i7 = 2131746001;
        } else {
            i7 = 2131746005;
        }
        s3Var.f18839a.H(id.M0(i7, null), id.M0(2131746008, null), str2, true, !z9, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.setOnShowListener(new kg.r(editTextBoldCursor, 1));
        u1Var.r(250L);
        if (i7 != 0 && (u1Var.d(i7) instanceof TextView)) {
            t6.U((TextView) u1Var.d(i7), m6.f28131q7, h6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, g4 g4Var) {
        if (f2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        zw zwVar = new zw(bundle);
        zwVar.D2 = new l2.x(g4Var, 9);
        if (z9) {
            ?? obj = new Object();
            obj.f27388a = true;
            f2Var.showAsSheet(zwVar, obj);
            return;
        }
        f2Var.presentFragment(zwVar);
    }
}
