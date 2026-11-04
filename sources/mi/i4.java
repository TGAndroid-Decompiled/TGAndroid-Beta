package mi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.u8;
import ci.v6;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f60;
import org.telegram.ui.uw;
public abstract class i4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.V(editTextBoldCursor, k6.f27988j5, e6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, e6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, e6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.G(editTextBoldCursor, k6.f28007k6, k6.f28026l6, k6.f28102p7, e6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.D(editTextBoldCursor, k6.ig, e6Var);
        r6.m(editTextBoldCursor, 36, k6.f27998jg, e6Var);
        return editTextBoldCursor;
    }

    public static f60 b(f60 f60Var, org.telegram.ui.ActionBar.d2 d2Var, final s3 s3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        if (j4Var != null && (textbutton = j4Var.f19703a) != null) {
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
                    s3Var.f19884f.r3(true);
                    k(d2Var, z10, new f4(s3Var, 2));
                }
                return null;
            }
        }
        f60Var.c(2131231745, bd.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        i4.i(s3Var, z10);
                        return;
                    default:
                        i4.h(s3Var, z10);
                        return;
                }
            }
        }, false);
        f60Var.c(2131232103, bd.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        i4.i(s3Var, z10);
                        return;
                    default:
                        i4.h(s3Var, z10);
                        return;
                }
            }
        }, false);
        f60Var.c(2131231621, bd.M0(2131746009, null), new v6(d2Var, s3Var, z10, 9), false);
        f60Var.Z();
        return f60Var;
    }

    public static f60 c(f60 f60Var, org.telegram.ui.ActionBar.d2 d2Var, final Context context, final org.telegram.ui.ActionBar.e6 e6Var, final q3 q3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i3 = q3Var.f19838b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        if (d != null && i3 >= 0 && i3 < d.buttons.size()) {
            pageButton = d.buttons.get(i3);
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
                e(context, e6Var, q3Var, z10);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, e6Var, q3Var, z10);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(d2Var, context, e6Var, q3Var, z10);
                }
                return null;
            }
        }
        f60Var.c(2131231745, bd.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        i4.e(context, e6Var, q3Var, z10);
                        return;
                    default:
                        i4.d(context, e6Var, q3Var, z10);
                        return;
                }
            }
        }, false);
        f60Var.c(2131232103, bd.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        i4.e(context, e6Var, q3Var, z10);
                        return;
                    default:
                        i4.d(context, e6Var, q3Var, z10);
                        return;
                }
            }
        }, false);
        f60Var.c(2131231621, bd.M0(2131746009, null), new gi.q1(d2Var, context, e6Var, q3Var, z10, 3), false);
        f60Var.Z();
        return f60Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i3;
        boolean c2 = q3Var.c();
        int i10 = q3Var.f19838b;
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
        if (c2) {
            i3 = 2131746012;
        } else {
            i3 = 2131746016;
        }
        g(context, e6Var, q3Var, z10, bd.M0(i3, null), bd.M0(2131746020, null), str2, new c4(q3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i3;
        boolean c2 = q3Var.c();
        int i10 = q3Var.f19838b;
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
        if (c2) {
            i3 = 2131746011;
        } else {
            i3 = 2131746015;
        }
        g(context, e6Var, q3Var, z10, bd.M0(i3, null), bd.M0(2131746018, null), str2, new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i3;
        boolean c2 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i10 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = bd.M0(2131746019, null);
        int i11 = q3Var.f19838b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = d6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, e6Var, M0, l10);
        f10.addView(a10, mf.o(-1, 64));
        u8 u8Var = new u8(a10, d2Var, z10, q3Var, 6);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        if (c2) {
            i3 = 2131746010;
        } else {
            i3 = 2131746014;
        }
        String M02 = bd.M0(i3, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), new ga.b(c2, u8Var, a10, q3Var, 2));
        if (c2) {
            alertDialog$Builder.i(bd.M0(2131746017, null), new l5.b(u8Var, 10));
            String M03 = bd.M0(2131751599, null);
            c4 c4Var = new c4(q3Var, 2);
            s1Var.f28559s0 = M03;
            s1Var.f28560t0 = c4Var;
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            s1Var.M0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i10, e6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.e6 e6Var, q3 q3Var, boolean z10, String str, String str2, String str3, c4 c4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i3 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = bd.M0(2131746019, null);
        int i10 = q3Var.f19838b;
        TL_iv.pageBlockButtonRow d = q3Var.d();
        if (d != null && i10 >= 0 && i10 < d.buttons.size()) {
            pageButton = d.buttons.get(i10);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l10 = "";
        } else {
            l10 = d6.l(pageButton.text);
        }
        EditTextBoldCursor a10 = a(context, e6Var, M0, l10);
        EditTextBoldCursor a11 = a(context, e6Var, str2, str3);
        f10.addView(a10, mf.o(-1, 64));
        f10.addView(a11, mf.o(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        alertDialog$Builder.f27343a.S = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), new aa.a(a10, a11, c4Var, 13));
        if (q3Var.c()) {
            alertDialog$Builder.i(bd.M0(2131751599, null), new c4(q3Var, 0));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (q3Var.c()) {
            i3 = -3;
        }
        j(alertDialog$Builder, a10, i3, e6Var);
    }

    public static void h(s3 s3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i3;
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        if (j4Var != null && (textbutton = j4Var.f19703a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = d6.l(s3Var.f19883e);
        }
        String str = l10;
        s3Var.f19884f.r3(false);
        if (z11) {
            i3 = 2131746012;
        } else {
            i3 = 2131746016;
        }
        s3Var.f19880a.H(bd.M0(i3, null), bd.M0(2131746020, null), str, false, !z10, new f4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i3;
        TL_iv.textButton textbutton;
        j4 j4Var = s3Var.d;
        if (j4Var != null && (textbutton = j4Var.f19703a) != null) {
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
        s3Var.f19884f.r3(false);
        if (z11) {
            i3 = 2131746011;
        } else {
            i3 = 2131746015;
        }
        s3Var.f19880a.H(bd.M0(i3, null), bd.M0(2131746018, null), str2, true, !z10, new f4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.setOnShowListener(new ai.p(editTextBoldCursor, 3));
        s1Var.r(250L);
        if (i3 != 0 && (s1Var.d(i3) instanceof TextView)) {
            r6.V((TextView) s1Var.d(i3), k6.f28122q7, e6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, h4 h4Var) {
        if (d2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        uw uwVar = new uw(bundle);
        uwVar.D2 = new l5.b(h4Var, 11);
        if (z10) {
            ?? obj = new Object();
            obj.f27395a = true;
            d2Var.showAsSheet(uwVar, obj);
            return;
        }
        d2Var.presentFragment(uwVar);
    }
}
