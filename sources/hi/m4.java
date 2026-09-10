package hi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.w70;
import org.telegram.ui.wy;
public abstract class m4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
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
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var));
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        return editTextBoldCursor;
    }

    public static w70 b(w70 w70Var, org.telegram.ui.ActionBar.p2 p2Var, final y3 y3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        n4 n4Var = y3Var.d;
        if (n4Var != null && (textbutton = n4Var.f9758a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        if (inlineButtonType != null) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                i(y3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                h(y3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                y3Var.f9983f.n3(true);
                k(p2Var, z10, new j4(y3Var, 2));
            }
            return null;
        }
        w70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m4.i(y3Var, z10);
                        return;
                    default:
                        m4.h(y3Var, z10);
                        return;
                }
            }
        }, false);
        w70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m4.i(y3Var, z10);
                        return;
                    default:
                        m4.h(y3Var, z10);
                        return;
                }
            }
        }, false);
        w70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new bi.c1(p2Var, y3Var, z10, 6), false);
        w70Var.Z();
        return w70Var;
    }

    public static w70 c(w70 w70Var, org.telegram.ui.ActionBar.p2 p2Var, final Context context, final org.telegram.ui.ActionBar.f6 f6Var, final w3 w3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = w3Var.f9926b;
        TL_iv.pageBlockButtonRow d = w3Var.d();
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
                e(context, f6Var, w3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, f6Var, w3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(p2Var, context, f6Var, w3Var, z10);
            }
            return null;
        }
        w70Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        m4.e(context, f6Var, w3Var, z10);
                        return;
                    default:
                        m4.d(context, f6Var, w3Var, z10);
                        return;
                }
            }
        }, false);
        w70Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        m4.e(context, f6Var, w3Var, z10);
                        return;
                    default:
                        m4.d(context, f6Var, w3Var, z10);
                        return;
                }
            }
        }, false);
        w70Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new bi.e2(p2Var, context, f6Var, w3Var, z10, 3), false);
        w70Var.Z();
        return w70Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.f6 f6Var, w3 w3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = w3Var.c();
        int i11 = w3Var.f9926b;
        TL_iv.pageBlockButtonRow d = w3Var.d();
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
        g(context, f6Var, w3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new h4(w3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.f6 f6Var, w3 w3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = w3Var.c();
        int i11 = w3Var.f9926b;
        TL_iv.pageBlockButtonRow d = w3Var.d();
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
        g(context, f6Var, w3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new h4(w3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, w3 w3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = w3Var.c();
        LinearLayout f7 = em.f(context, 1);
        int i11 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = w3Var.f9926b;
        TL_iv.pageBlockButtonRow d = w3Var.d();
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
        f7.addView(a2, w7.a6.n(-1, 64));
        bi.g2 g2Var = new bi.g2(a2, p2Var, z10, w3Var, 3);
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string2;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ca.b(c10, g2Var, a2, w3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new y1(g2Var, 2));
            String string3 = LocaleController.getString(R.string.Delete);
            h4 h4Var = new h4(w3Var, 2);
            d2Var.f17630p0 = string3;
            d2Var.f17631q0 = h4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.J0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, f6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.f6 f6Var, w3 w3Var, boolean z10, String str, String str2, String str3, h4 h4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout f7 = em.f(context, 1);
        int i10 = 0;
        f7.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = w3Var.f9926b;
        TL_iv.pageBlockButtonRow d = w3Var.d();
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
        f7.addView(a2, w7.a6.n(-1, 64));
        f7.addView(a10, w7.a6.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        alertDialog$Builder.f17528a.R = str;
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(a2, a10, h4Var, 10));
        if (w3Var.c()) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new h4(w3Var, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        if (!TextUtils.isEmpty(a2.getText())) {
            a2 = a10;
        }
        if (w3Var.c()) {
            i10 = -3;
        }
        j(alertDialog$Builder, a2, i10, f6Var);
    }

    public static void h(y3 y3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        n4 n4Var = y3Var.d;
        if (n4Var != null && (textbutton = n4Var.f9758a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = i6.l(y3Var.e);
        }
        String str = l4;
        y3Var.f9983f.n3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        y3Var.f9980a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new j4(y3Var, 1));
    }

    public static void i(y3 y3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        n4 n4Var = y3Var.d;
        if (n4Var != null && (textbutton = n4Var.f9758a) != null) {
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
        y3Var.f9983f.n3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        y3Var.f9980a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new j4(y3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.setOnShowListener(new gg.t(1, editTextBoldCursor));
        d2Var.q(250L);
        if (i10 != 0 && (d2Var.d(i10) instanceof TextView)) {
            ((TextView) d2Var.d(i10)).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var));
        }
    }

    public static void k(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, l4 l4Var) {
        if (p2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        wy wyVar = new wy(bundle);
        wyVar.C2 = new y1(l4Var, 3);
        if (z10) {
            ?? obj = new Object();
            obj.f18485a = true;
            p2Var.showAsSheet(wyVar, obj);
            return;
        }
        p2Var.presentFragment(wyVar);
    }
}
