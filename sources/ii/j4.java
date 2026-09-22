package ii;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n70;
import org.telegram.ui.uy;
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(i6.v0(i6.f18940j5, e6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(i6.v0(i6.H6, e6Var));
        editTextBoldCursor.setHeaderHintColor(i6.v0(i6.L6, e6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(i6.v0(i6.f18961k6, e6Var), i6.v0(i6.f18979l6, e6Var), i6.v0(i6.f19053p7, e6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(i6.v0(i6.f19154uf, e6Var));
        editTextBoldCursor.setHandlesColor(i6.v0(i6.f19171vf, e6Var));
        return editTextBoldCursor;
    }

    public static n70 b(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, final v3 v3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f11475a) != null) {
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
                v3Var.f11693f.o3(true);
                k(n2Var, z10, new g4(v3Var, 2));
            }
            return null;
        }
        n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
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
        n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
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
        n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.y0(n2Var, v3Var, z10, 6), false);
        n70Var.Z();
        return n70Var;
    }

    public static n70 c(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.e6 e6Var, final t3 t3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = t3Var.f11632b;
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
                e(context, e6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, e6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, e6Var, t3Var, z10);
            }
            return null;
        }
        n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, e6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, e6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, e6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, e6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.u1(n2Var, context, e6Var, t3Var, z10, 3), false);
        n70Var.Z();
        return n70Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.e6 e6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f11632b;
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
        g(context, e6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.e6 e6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f11632b;
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
        g(context, e6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = t3Var.c();
        LinearLayout f7 = vl.f(context, 1);
        int i11 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = t3Var.f11632b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = f6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, e6Var, string, l4);
        f7.addView(a2, w7.x5.n(-1, 64));
        ai.s4 s4Var = new ai.s4(a2, n2Var, z10, t3Var, 5);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
        b2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, s4Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.d5(s4Var, 18));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            b2Var.f18480p0 = string3;
            b2Var.f18481q0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, e6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.e6 e6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f7 = vl.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.f11632b;
        TL_iv.pageBlockButtonRow d = t3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = f6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, e6Var, string, l4);
        EditTextBoldCursor a10 = a(context, e6Var, str2, str3);
        f7.addView(a2, w7.x5.n(-1, 64));
        f7.addView(a10, w7.x5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        }
        alertDialog$Builder.f18435a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r5(a2, a10, e4Var, 12));
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
        j(alertDialog$Builder, a2, i10, e6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f11475a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = f6.l(v3Var.e);
        }
        String str = l4;
        v3Var.f11693f.o3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        v3Var.f11690a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new g4(v3Var, 1));
    }

    public static void i(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f11475a) != null) {
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
        v3Var.f11693f.o3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        v3Var.f11690a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new g4(v3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
        b2Var.setOnShowListener(new hg.t(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 != 0 && (b2Var.d(i10) instanceof TextView)) {
            ((TextView) b2Var.d(i10)).setTextColor(i6.v0(i6.f19071q7, e6Var));
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
        uy uyVar = new uy(bundle);
        uyVar.C2 = new ei.d5(i4Var, 19);
        if (z10) {
            ?? obj = new Object();
            obj.f19364a = true;
            n2Var.showAsSheet(uyVar, obj);
            return;
        }
        n2Var.presentFragment(uyVar);
    }
}
