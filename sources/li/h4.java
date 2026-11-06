package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u7;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k60;
import org.telegram.ui.ww;
public abstract class h4 {
    public static EditTextBoldCursor a(Context context, f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.V(editTextBoldCursor, k6.f27957j5, f6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, f6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, f6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.G(editTextBoldCursor, k6.f27978k6, k6.f27996l6, k6.f28070p7, f6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.D(editTextBoldCursor, k6.f27949ig, f6Var);
        r6.m(editTextBoldCursor, 36, k6.f27968jg, f6Var);
        return editTextBoldCursor;
    }

    public static k60 b(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final s3 s3Var, final boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18638a) != null) {
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
                    s3Var.f18837f.r3(true);
                    k(f2Var, z9, new e4(s3Var, 2));
                }
                return null;
            }
        }
        k60Var.c(2131231745, hd.M0(2131752226, null), new Runnable() {
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
        k60Var.c(2131232103, hd.M0(2131751767, null), new Runnable() {
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
        k60Var.c(2131231621, hd.M0(2131746000, null), new u7(f2Var, s3Var, z9, 9), false);
        k60Var.Z();
        return k60Var;
    }

    public static k60 c(k60 k60Var, org.telegram.ui.ActionBar.f2 f2Var, final Context context, final f6 f6Var, final q3 q3Var, final boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i7 = q3Var.f18786b;
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
                e(context, f6Var, q3Var, z9);
                return null;
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, q3Var, z9);
                return null;
            } else {
                if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                    f(f2Var, context, f6Var, q3Var, z9);
                }
                return null;
            }
        }
        k60Var.c(2131231745, hd.M0(2131752226, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, f6Var, q3Var, z9);
                        return;
                    default:
                        h4.d(context, f6Var, q3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131232103, hd.M0(2131751767, null), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        h4.e(context, f6Var, q3Var, z9);
                        return;
                    default:
                        h4.d(context, f6Var, q3Var, z9);
                        return;
                }
            }
        }, false);
        k60Var.c(2131231621, hd.M0(2131746000, null), new fi.q1(f2Var, context, f6Var, q3Var, z9, 3), false);
        k60Var.Z();
        return k60Var;
    }

    public static void d(Context context, f6 f6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f18786b;
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
            i7 = 2131746003;
        } else {
            i7 = 2131746007;
        }
        g(context, f6Var, q3Var, z9, hd.M0(i7, null), hd.M0(2131746011, null), str2, new c4(q3Var, 3));
    }

    public static void e(Context context, f6 f6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        boolean c10 = q3Var.c();
        int i10 = q3Var.f18786b;
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
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        g(context, f6Var, q3Var, z9, hd.M0(i7, null), hd.M0(2131746009, null), str2, new c4(q3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, Context context, f6 f6Var, q3 q3Var, boolean z9) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        boolean c10 = q3Var.c();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i10 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746010, null);
        int i11 = q3Var.f18786b;
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
        EditTextBoldCursor a10 = a(context, f6Var, M0, l10);
        f10.addView(a10, ha.o(-1, 64));
        aa.d0 d0Var = new aa.d0(a10, f2Var, z9, q3Var, 7);
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        }
        if (c10) {
            i7 = 2131746001;
        } else {
            i7 = 2131746005;
        }
        String M02 = hd.M0(i7, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M02;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747830, null), new a3.g(c10, d0Var, a10, q3Var, 3));
        if (c10) {
            alertDialog$Builder.i(hd.M0(2131746008, null), new l2.y(d0Var, 8));
            String M03 = hd.M0(2131751599, null);
            c4 c4Var = new c4(q3Var, 2);
            u1Var.f28577p0 = M03;
            u1Var.f28578q0 = c4Var;
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            u1Var.J0 = true;
            i10 = -4;
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        j(alertDialog$Builder, a10, i10, f6Var);
    }

    public static void g(Context context, f6 f6Var, q3 q3Var, boolean z9, String str, String str2, String str3, c4 c4Var) {
        TL_keyboard.PageButton pageButton;
        String l10;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        int i7 = 0;
        f10.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        String M0 = hd.M0(2131746010, null);
        int i10 = q3Var.f18786b;
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
        EditTextBoldCursor a10 = a(context, f6Var, M0, l10);
        EditTextBoldCursor a11 = a(context, f6Var, str2, str3);
        f10.addView(a10, ha.o(-1, 64));
        f10.addView(a11, ha.o(-1, 64));
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        }
        alertDialog$Builder.f27293a.R = str;
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747830, null), new a3.h(a10, a11, c4Var, 16));
        if (q3Var.c()) {
            alertDialog$Builder.i(hd.M0(2131751599, null), new c4(q3Var, 0));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        }
        if (!TextUtils.isEmpty(a10.getText())) {
            a10 = a11;
        }
        if (q3Var.c()) {
            i7 = -3;
        }
        j(alertDialog$Builder, a10, i7, f6Var);
    }

    public static void h(s3 s3Var, boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l10;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18638a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z10) {
            l10 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l10 = c6.l(s3Var.f18836e);
        }
        String str = l10;
        s3Var.f18837f.r3(false);
        if (z10) {
            i7 = 2131746003;
        } else {
            i7 = 2131746007;
        }
        s3Var.f18833a.H(hd.M0(i7, null), hd.M0(2131746011, null), str, false, !z9, new e4(s3Var, 1));
    }

    public static void i(s3 s3Var, boolean z9) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i7;
        TL_iv.textButton textbutton;
        i4 i4Var = s3Var.d;
        if (i4Var != null && (textbutton = i4Var.f18638a) != null) {
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
        s3Var.f18837f.r3(false);
        if (z10) {
            i7 = 2131746002;
        } else {
            i7 = 2131746006;
        }
        s3Var.f18833a.H(hd.M0(i7, null), hd.M0(2131746009, null), str2, true, !z9, new e4(s3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.setOnShowListener(new kg.r(editTextBoldCursor, 1));
        u1Var.r(250L);
        if (i7 != 0 && (u1Var.d(i7) instanceof TextView)) {
            r6.V((TextView) u1Var.d(i7), k6.f28090q7, f6Var);
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
        ww wwVar = new ww(bundle);
        wwVar.C2 = new l2.y(g4Var, 9);
        if (z9) {
            ?? obj = new Object();
            obj.f27421a = true;
            f2Var.showAsSheet(wwVar, obj);
            return;
        }
        f2Var.presentFragment(wwVar);
    }
}
