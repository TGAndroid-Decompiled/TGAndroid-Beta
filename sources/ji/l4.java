package ji;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m80;
import org.telegram.ui.yy;
public abstract class l4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20028k6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20045l6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20224uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20242vf, c6Var));
        return editTextBoldCursor;
    }

    public static m80 b(m80 m80Var, org.telegram.ui.ActionBar.m2 m2Var, final w3 w3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f13407a) != null) {
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
                w3Var.f13590f.p3(true);
                k(m2Var, z10, new i4(w3Var, 2));
            }
            return null;
        }
        m80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
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
        m80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
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
        m80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new di.x0(m2Var, w3Var, z10, 6), false);
        m80Var.Z();
        return m80Var;
    }

    public static m80 c(m80 m80Var, org.telegram.ui.ActionBar.m2 m2Var, final Context context, final org.telegram.ui.ActionBar.c6 c6Var, final u3 u3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = u3Var.f13556b;
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
                e(context, c6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, c6Var, u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(m2Var, context, c6Var, u3Var, z10);
            }
            return null;
        }
        m80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        l4.e(context, c6Var, u3Var, z10);
                        return;
                    default:
                        l4.d(context, c6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        m80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        l4.e(context, c6Var, u3Var, z10);
                        return;
                    default:
                        l4.d(context, c6Var, u3Var, z10);
                        return;
                }
            }
        }, false);
        m80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new di.t1(m2Var, context, c6Var, u3Var, z10, 3), false);
        m80Var.Z();
        return m80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.c6 c6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f13556b;
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
        g(context, c6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new g4(u3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.c6 c6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = u3Var.c();
        int i11 = u3Var.f13556b;
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
        g(context, c6Var, u3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new g4(u3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, u3 u3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = u3Var.c();
        LinearLayout e = yh.e(context, 1);
        int i11 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = u3Var.f13556b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = k6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, c6Var, string, l4);
        e.addView(a2, w7.a6.n(-1, 64));
        bi.h4 h4Var = new bi.h4(a2, m2Var, z10, u3Var, 5);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string2;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new da.b(c10, h4Var, a2, u3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new f1.a(h4Var, 26));
            String string3 = LocaleController.getString(R.string.Delete);
            g4 g4Var = new g4(u3Var, 2);
            a2Var.f19578p0 = string3;
            a2Var.f19579q0 = g4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, c6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.c6 c6Var, u3 u3Var, boolean z10, String str, String str2, String str3, g4 g4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout e = yh.e(context, 1);
        int i10 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = u3Var.f13556b;
        TL_iv.pageBlockButtonRow d = u3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = k6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, c6Var, string, l4);
        EditTextBoldCursor a10 = a(context, c6Var, str2, str3);
        e.addView(a2, w7.a6.n(-1, 64));
        e.addView(a10, w7.a6.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        alertDialog$Builder.f19548a.R = str;
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(a2, a10, g4Var, 12));
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
        j(alertDialog$Builder, a2, i10, c6Var);
    }

    public static void h(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f13407a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = k6.l(w3Var.e);
        }
        String str = l4;
        w3Var.f13590f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        w3Var.f13587a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new i4(w3Var, 1));
    }

    public static void i(w3 w3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        m4 m4Var = w3Var.d;
        if (m4Var != null && (textbutton = m4Var.f13407a) != null) {
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
        w3Var.f13590f.p3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        w3Var.f13587a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new i4(w3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.setOnShowListener(new ig.r(1, editTextBoldCursor));
        a2Var.q(250L);
        if (i10 != 0 && (a2Var.d(i10) instanceof TextView)) {
            ((TextView) a2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, c6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, k4 k4Var) {
        if (m2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        yy yyVar = new yy(bundle);
        yyVar.C2 = new f1.a(k4Var, 27);
        if (z10) {
            ?? obj = new Object();
            obj.f20469a = true;
            m2Var.showAsSheet(yyVar, obj);
            return;
        }
        m2Var.presentFragment(yyVar);
    }
}
