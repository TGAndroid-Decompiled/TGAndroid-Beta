package ii;

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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.uy;
public abstract class k4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20925j5, d6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, d6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20946k6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20964l6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21039p7, d6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21143uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21160vf, d6Var));
        return editTextBoldCursor;
    }

    public static b80 b(b80 b80Var, org.telegram.ui.ActionBar.n2 n2Var, final w3 w3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        if (l4Var != null && (textbutton = l4Var.f12508a) != null) {
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
                w3Var.f12722f.q3(true);
                k(n2Var, z10, new h4(w3Var, 2));
            }
            return null;
        }
        b80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        k4.i(w3Var, z10);
                        return;
                    default:
                        k4.h(w3Var, z10);
                        return;
                }
            }
        }, false);
        b80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        k4.i(w3Var, z10);
                        return;
                    default:
                        k4.h(w3Var, z10);
                        return;
                }
            }
        }, false);
        b80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.y0(n2Var, w3Var, z10, 6), false);
        b80Var.Z();
        return b80Var;
    }

    public static b80 c(b80 b80Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.d6 d6Var, final u3 u3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = u3Var.f12684b;
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
                e(context, d6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, d6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, d6Var, u3Var, z10);
            }
            return null;
        }
        b80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        k4.e(context, d6Var, u3Var, z10);
                        return;
                    default:
                        k4.d(context, d6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        b80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        k4.e(context, d6Var, u3Var, z10);
                        return;
                    default:
                        k4.d(context, d6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        b80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ci.u1(n2Var, context, d6Var, u3Var, z10, 3), false);
        b80Var.Z();
        return b80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f12684b;
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
        g(context, d6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new f4(u3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f12684b;
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
        g(context, d6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new f4(u3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = u3Var.c();
        LinearLayout f7 = ok.f(context, 1);
        int i11 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = u3Var.f12684b;
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
        EditTextBoldCursor a2 = a(context, d6Var, string, l4);
        f7.addView(a2, w7.z5.n(-1, 64));
        ai.s4 s4Var = new ai.s4(a2, n2Var, z10, u3Var, 5);
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
        b2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, s4Var, a2, u3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new ei.f(s4Var, 18));
            String string3 = LocaleController.getString(R.string.Delete);
            f4 f4Var = new f4(u3Var, 2);
            b2Var.f20431p0 = string3;
            b2Var.f20432q0 = f4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, d6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var, boolean z10, String str, String str2, String str3, f4 f4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f7 = ok.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = u3Var.f12684b;
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
        EditTextBoldCursor a2 = a(context, d6Var, string, l4);
        EditTextBoldCursor a10 = a(context, d6Var, str2, str3);
        f7.addView(a2, w7.z5.n(-1, 64));
        f7.addView(a10, w7.z5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        }
        alertDialog$Builder.f20367a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.q5(a2, a10, f4Var, 12));
        if (u3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new f4(u3Var, 0));
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
        j(alertDialog$Builder, a2, i10, d6Var);
    }

    public static void h(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        if (l4Var != null && (textbutton = l4Var.f12508a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = h6.l(w3Var.f12721e);
        }
        String str = l4;
        w3Var.f12722f.q3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        w3Var.f12718a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new h4(w3Var, 1));
    }

    public static void i(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        l4 l4Var = w3Var.d;
        if (l4Var != null && (textbutton = l4Var.f12508a) != null) {
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
        w3Var.f12722f.q3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        w3Var.f12718a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new h4(w3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
        b2Var.setOnShowListener(new hg.r(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 != 0 && (b2Var.d(i10) instanceof TextView)) {
            ((TextView) b2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q7, d6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, j4 j4Var) {
        if (n2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        uy uyVar = new uy(bundle);
        uyVar.C2 = new ei.f(j4Var, 19);
        if (z10) {
            ?? obj = new Object();
            obj.f21349a = true;
            n2Var.showAsSheet(uyVar, obj);
            return;
        }
        n2Var.presentFragment(uyVar);
    }
}
