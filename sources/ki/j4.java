package ki;

import ai.x9;
import ai.y7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i80;
import org.telegram.ui.cy;
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(h6.w0(h6.f21099j5, d6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(h6.w0(h6.H6, d6Var));
        editTextBoldCursor.setHeaderHintColor(h6.w0(h6.L6, d6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(h6.w0(h6.f21120k6, d6Var), h6.w0(h6.f21137l6, d6Var), h6.w0(h6.f21214p7, d6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(h6.w0(h6.f21317uf, d6Var));
        editTextBoldCursor.setHandlesColor(h6.w0(h6.f21335vf, d6Var));
        return editTextBoldCursor;
    }

    public static i80 b(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, final v3 v3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15362a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(v3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(v3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                v3Var.f15578f.p3(true);
                k(n2Var, z10, new g4(v3Var, 2));
            }
            return null;
        }
        i80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        j4.i(v3Var, z10);
                        return;
                    default:
                        j4.h(v3Var, z10);
                        return;
                }
            }
        }, false);
        i80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        j4.i(v3Var, z10);
                        return;
                    default:
                        j4.h(v3Var, z10);
                        return;
                }
            }
        }, false);
        i80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new y7(n2Var, v3Var, z10, 9), false);
        i80Var.Z();
        return i80Var;
    }

    public static i80 c(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.d6 d6Var, final t3 t3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = t3Var.f15528b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
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
                e(context, d6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, d6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, d6Var, t3Var, z10);
            }
            return null;
        }
        i80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, d6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, d6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        i80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, d6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, d6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        i80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ei.s1(n2Var, context, d6Var, t3Var, z10, 3), false);
        i80Var.Z();
        return i80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f15528b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton != null) {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
            str = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            str = "";
        }
        String str2 = str;
        if (c10) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        g(context, d6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f15528b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        TL_keyboard.InlineButtonType inlineButtonType = null;
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton != null) {
            inlineButtonType = pageButton.type;
        }
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            str = ((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url;
        } else {
            str = "http://";
        }
        String str2 = str;
        if (c10) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        g(context, d6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = t3Var.c();
        LinearLayout e = ok.e(context, 1);
        int i11 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = t3Var.f15528b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = e6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, d6Var, string, l4);
        e.addView(a2, w7.z5.n(-1, 64));
        x9 x9Var = new x9(a2, n2Var, z10, t3Var, 6);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        b2Var.R = string2;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new da.b(c10, x9Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new j5.b(x9Var, 6));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            b2Var.f20677p0 = string3;
            b2Var.f20678q0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, d6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.d6 d6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout e = ok.e(context, 1);
        int i10 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.f15528b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = e6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, d6Var, string, l4);
        EditTextBoldCursor a10 = a(context, d6Var, str2, str3);
        e.addView(a2, w7.z5.n(-1, 64));
        e.addView(a10, w7.z5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        }
        alertDialog$Builder.f20608a.R = str;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.u2(a2, a10, e4Var, 13));
        if (t3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(t3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (t3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, d6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15362a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = e6.l(v3Var.e);
        }
        String str = l4;
        v3Var.f15578f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        v3Var.f15575a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new g4(v3Var, 1));
    }

    public static void i(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15362a) != null) {
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
        v3Var.f15578f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        v3Var.f15575a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new g4(v3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        b2Var.setOnShowListener(new ig.r(1, editTextBoldCursor));
        b2Var.r(250L);
        if (i10 != 0 && (b2Var.d(i10) instanceof TextView)) {
            ((TextView) b2Var.d(i10)).setTextColor(h6.w0(h6.f21231q7, d6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, i4 i4Var) {
        if (n2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        cy cyVar = new cy(bundle);
        cyVar.C2 = new j5.b(i4Var, 7);
        if (z10) {
            ?? obj = new Object();
            obj.f21559a = true;
            n2Var.showAsSheet(cyVar, obj);
            return;
        }
        n2Var.presentFragment(cyVar);
    }
}
