package ii;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ty;
public abstract class l4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, e6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20925k6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20943l6, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21018p7, e6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21119uf, e6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21136vf, e6Var));
        return editTextBoldCursor;
    }

    public static p80 b(p80 p80Var, org.telegram.ui.ActionBar.n2 n2Var, final w3 w3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f12570a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(w3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(w3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                w3Var.f12770f.p3(true);
                k(n2Var, z10, new i4(w3Var, 2));
            }
            return null;
        }
        p80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        l4.i(w3Var, z10);
                        return;
                    default:
                        l4.h(w3Var, z10);
                        return;
                }
            }
        }, false);
        p80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        l4.i(w3Var, z10);
                        return;
                    default:
                        l4.h(w3Var, z10);
                        return;
                }
            }
        }, false);
        p80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.x0(n2Var, w3Var, z10, 6), false);
        p80Var.Z();
        return p80Var;
    }

    public static p80 c(p80 p80Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.e6 e6Var, final u3 u3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = u3Var.f12732b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
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
                e(context, e6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, e6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, e6Var, u3Var, z10);
            }
            return null;
        }
        p80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        l4.e(context, e6Var, u3Var, z10);
                        return;
                    default:
                        l4.d(context, e6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        p80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        l4.e(context, e6Var, u3Var, z10);
                        return;
                    default:
                        l4.d(context, e6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        p80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.t1(n2Var, context, e6Var, u3Var, z10, 3), false);
        p80Var.Z();
        return p80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f12732b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
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
        g(context, e6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new g4(u3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f12732b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
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
        g(context, e6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new g4(u3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = u3Var.c();
        LinearLayout e7 = bi.e(context, 1);
        int i11 = 0;
        e7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = u3Var.f12732b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = h6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, e6Var, string, l4);
        e7.addView(a2, w7.x5.n(-1, 64));
        ai.t4 t4Var = new ai.t4(a2, n2Var, z10, u3Var, 5);
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = string2;
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, t4Var, a2, u3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.c5(t4Var, 17));
            String string3 = LocaleController.getString(R.string.Delete);
            g4 g4Var = new g4(u3Var, 2);
            b2Var.f20429p0 = string3;
            b2Var.f20430q0 = g4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, e6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.e6 e6Var, u3 u3Var, boolean z10, String str, String str2, String str3, g4 g4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout e7 = bi.e(context, 1);
        int i10 = 0;
        e7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = u3Var.f12732b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = h6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, e6Var, string, l4);
        EditTextBoldCursor a10 = a(context, e6Var, str2, str3);
        e7.addView(a2, w7.x5.n(-1, 64));
        e7.addView(a10, w7.x5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        }
        alertDialog$Builder.f20374a.R = str;
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r5(a2, a10, g4Var, 12));
        if (u3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new g4(u3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (u3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, e6Var);
    }

    public static void h(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f12570a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = h6.l(w3Var.f12769e);
        }
        String str = l4;
        w3Var.f12770f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        w3Var.f12766a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new i4(w3Var, 1));
    }

    public static void i(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f12570a) != null) {
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
        w3Var.f12770f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        w3Var.f12766a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new i4(w3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.setOnShowListener(new hg.s(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 != 0 && (b2Var.d(i10) instanceof TextView)) {
            ((TextView) b2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, k4 k4Var) {
        if (n2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ty tyVar = new ty(bundle);
        tyVar.C2 = new ei.c5(k4Var, 18);
        if (z10) {
            ?? obj = new Object();
            obj.f21357a = true;
            n2Var.showAsSheet(tyVar, obj);
            return;
        }
        n2Var.presentFragment(tyVar);
    }
}
