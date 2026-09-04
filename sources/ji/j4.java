package ji;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n70;
import org.telegram.ui.uy;
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        editTextBoldCursor.setHintText(str);
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        editTextBoldCursor.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20791k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20981uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20998vf, f6Var));
        return editTextBoldCursor;
    }

    public static n70 b(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, final u3 u3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f14017a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(u3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                u3Var.f14219f.n3(true);
                k(n2Var, z10, new g4(u3Var, 2));
            }
            return null;
        }
        n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        j4.i(u3Var, z10);
                        return;
                    default:
                        j4.h(u3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        j4.i(u3Var, z10);
                        return;
                    default:
                        j4.h(u3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new di.y0(n2Var, u3Var, z10, 6), false);
        n70Var.Z();
        return n70Var;
    }

    public static n70 c(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, final Context context, final org.telegram.ui.ActionBar.f6 f6Var, final s3 s3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = s3Var.f14162b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
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
                e(context, f6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(n2Var, context, f6Var, s3Var, z10);
            }
            return null;
        }
        n70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, f6Var, s3Var, z10);
                        return;
                    default:
                        j4.d(context, f6Var, s3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, f6Var, s3Var, z10);
                        return;
                    default:
                        j4.d(context, f6Var, s3Var, z10);
                        return;
                }
            }
        }, false);
        n70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new di.u1(n2Var, context, f6Var, s3Var, z10, 3), false);
        n70Var.Z();
        return n70Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.f6 f6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = s3Var.c();
        int i11 = s3Var.f14162b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
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
        g(context, f6Var, s3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new e4(s3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.f6 f6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = s3Var.c();
        int i11 = s3Var.f14162b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
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
        g(context, f6Var, s3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new e4(s3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = s3Var.c();
        LinearLayout f7 = wl.f(context, 1);
        int i11 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = s3Var.f14162b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
        if (d != null && i12 >= 0 && i12 < d.buttons.size()) {
            pageButton = d.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = i6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, f6Var, string, l4);
        f7.addView(a2, w7.x5.n(-1, 64));
        bi.e4 e4Var = new bi.e4(a2, n2Var, z10, s3Var, 5);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, e4Var, a2, s3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new fi.f(e4Var, 26));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var2 = new e4(s3Var, 2);
            b2Var.f20246p0 = string3;
            b2Var.f20247q0 = e4Var2;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, f6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.f6 f6Var, s3 s3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f7 = wl.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = s3Var.f14162b;
        TL_iv.pageBlockButtonRow d = s3Var.d();
        if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
            pageButton = d.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = i6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, f6Var, string, l4);
        EditTextBoldCursor a10 = a(context, f6Var, str2, str3);
        f7.addView(a2, w7.x5.n(-1, 64));
        f7.addView(a10, w7.x5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        alertDialog$Builder.f20198a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(a2, a10, e4Var, 12));
        if (s3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new e4(s3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (s3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void h(u3 u3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f14017a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = i6.l(u3Var.f14218e);
        }
        String str = l4;
        u3Var.f14219f.n3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        u3Var.f14215a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new g4(u3Var, 1));
    }

    public static void i(u3 u3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f14017a) != null) {
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
        u3Var.f14219f.n3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        u3Var.f14215a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new g4(u3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.setOnShowListener(new ig.r(1, editTextBoldCursor));
        b2Var.q(250L);
        if (i10 != 0 && (b2Var.d(i10) instanceof TextView)) {
            ((TextView) b2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var));
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
        uyVar.C2 = new fi.f(i4Var, 27);
        if (z10) {
            ?? obj = new Object();
            obj.f21142a = true;
            n2Var.showAsSheet(uyVar, obj);
            return;
        }
        n2Var.presentFragment(uyVar);
    }
}
