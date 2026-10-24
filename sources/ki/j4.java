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
import org.telegram.messenger.tl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h80;
import org.telegram.ui.ey;
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        r6.W(editTextBoldCursor, k6.f21290j5, g6Var);
        editTextBoldCursor.setHintText(str);
        r6.m(editTextBoldCursor, 34, k6.H6, g6Var);
        r6.m(editTextBoldCursor, 35, k6.L6, g6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        r6.H(editTextBoldCursor, k6.f21311k6, k6.f21328l6, k6.f21405p7, g6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        r6.E(editTextBoldCursor, k6.f21508uf, g6Var);
        r6.m(editTextBoldCursor, 36, k6.f21526vf, g6Var);
        return editTextBoldCursor;
    }

    public static h80 b(h80 h80Var, org.telegram.ui.ActionBar.o2 o2Var, final v3 v3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15422a) != null) {
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
                v3Var.f15639f.u3(true);
                k(o2Var, z10, new g4(v3Var, 2));
            }
            return null;
        }
        h80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
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
        h80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
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
        h80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new y7(o2Var, v3Var, z10, 9), false);
        h80Var.Z();
        return h80Var;
    }

    public static h80 c(h80 h80Var, org.telegram.ui.ActionBar.o2 o2Var, final Context context, final org.telegram.ui.ActionBar.g6 g6Var, final t3 t3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = t3Var.f15588b;
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
                e(context, g6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, g6Var, t3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(o2Var, context, g6Var, t3Var, z10);
            }
            return null;
        }
        h80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, g6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, g6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        h80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, g6Var, t3Var, z10);
                        return;
                    default:
                        j4.d(context, g6Var, t3Var, z10);
                        return;
                }
            }
        }, false);
        h80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new ei.s1(o2Var, context, g6Var, t3Var, z10, 3), false);
        h80Var.Z();
        return h80Var;
    }

    public static void d(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f15588b;
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
        g(context, g6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new e4(t3Var, 3));
    }

    public static void e(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = t3Var.c();
        int i11 = t3Var.f15588b;
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
        g(context, g6Var, t3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new e4(t3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = t3Var.c();
        LinearLayout e = tl.e(context, 1);
        int i11 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = t3Var.f15588b;
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
        EditTextBoldCursor a2 = a(context, g6Var, string, l4);
        e.addView(a2, w7.z5.n(-1, 64));
        x9 x9Var = new x9(a2, o2Var, z10, t3Var, 6);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string2;
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new da.b(c10, x9Var, a2, t3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new j5.b(x9Var, 6));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(t3Var, 2);
            c2Var.f20776r0 = string3;
            c2Var.f20778s0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.L0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, g6Var);
    }

    public static void g(Context context, org.telegram.ui.ActionBar.g6 g6Var, t3 t3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout e = tl.e(context, 1);
        int i10 = 0;
        e.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = t3Var.f15588b;
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
        EditTextBoldCursor a2 = a(context, g6Var, string, l4);
        EditTextBoldCursor a10 = a(context, g6Var, str2, str3);
        e.addView(a2, w7.z5.n(-1, 64));
        e.addView(a10, w7.z5.n(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        alertDialog$Builder.f20679a.R = str;
        alertDialog$Builder.o(e);
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
        j(alertDialog$Builder, a2, i10, g6Var);
    }

    public static void h(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15422a) != null) {
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
        v3Var.f15639f.u3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        v3Var.f15636a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new g4(v3Var, 1));
    }

    public static void i(v3 v3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = v3Var.d;
        if (k4Var != null && (textbutton = k4Var.f15422a) != null) {
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
        v3Var.f15639f.u3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        v3Var.f15636a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new g4(v3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.setOnShowListener(new ig.r(editTextBoldCursor, 1));
        c2Var.r(250L);
        if (i10 != 0 && (c2Var.d(i10) instanceof TextView)) {
            r6.W((TextView) c2Var.d(i10), k6.f21422q7, g6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, i4 i4Var) {
        if (o2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ey eyVar = new ey(bundle);
        eyVar.C2 = new j5.b(i4Var, 7);
        if (z10) {
            ?? obj = new Object();
            obj.f21637a = true;
            o2Var.showAsSheet(eyVar, obj);
            return;
        }
        o2Var.presentFragment(eyVar);
    }
}
