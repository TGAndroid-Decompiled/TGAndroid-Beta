package li;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s9;
import bi.u7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.ey;
public abstract class j4 {
    public static EditTextBoldCursor a(Context context, u6 u6Var, String str, String str2) {
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 18.0f);
        f7.V(editTextBoldCursor, y6.f23465j5, u6Var);
        editTextBoldCursor.setHintText(str);
        f7.m(editTextBoldCursor, 34, y6.H6, u6Var);
        f7.m(editTextBoldCursor, 35, y6.L6, u6Var);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setTransformHintToHeaderOnFocus(false);
        editTextBoldCursor.setTransformHintToHeader(true);
        if (str2 == null) {
            str2 = "";
        }
        editTextBoldCursor.setText(str2);
        f7.G(editTextBoldCursor, y6.f23485k6, y6.f23503l6, y6.f23582p7, u6Var);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        f7.D(editTextBoldCursor, y6.f23683uf, u6Var);
        f7.m(editTextBoldCursor, 36, y6.f23701vf, u6Var);
        return editTextBoldCursor;
    }

    public static l80 b(l80 l80Var, org.telegram.ui.ActionBar.r2 r2Var, final u3 u3Var, final boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f17329a) != null) {
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
                u3Var.f17514f.u3(true);
                k(r2Var, z10, new g4(u3Var, 2));
            }
            return null;
        }
        l80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
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
        l80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
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
        l80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new u7(r2Var, u3Var, z10, 9), false);
        l80Var.Z();
        return l80Var;
    }

    public static l80 c(l80 l80Var, org.telegram.ui.ActionBar.r2 r2Var, final Context context, final u6 u6Var, final s3 s3Var, final boolean z10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        int i10 = s3Var.f17469b;
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
                e(context, u6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                d(context, u6Var, s3Var, z10);
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                f(r2Var, context, u6Var, s3Var, z10);
            }
            return null;
        }
        l80Var.c(R.drawable.media_link_24, LocaleController.getString(R.string.ChatLink), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, u6Var, s3Var, z10);
                        return;
                    default:
                        j4.d(context, u6Var, s3Var, z10);
                        return;
                }
            }
        }, false);
        l80Var.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                switch (r5) {
                    case 0:
                        j4.e(context, u6Var, s3Var, z10);
                        return;
                    default:
                        j4.d(context, u6Var, s3Var, z10);
                        return;
                }
            }
        }, false);
        l80Var.c(R.drawable.left_status_profile, LocaleController.getString(R.string.RichEditorUserProfile), new fi.r1(r2Var, context, u6Var, s3Var, z10, 3), false);
        l80Var.Z();
        return l80Var;
    }

    public static void d(Context context, u6 u6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = s3Var.c();
        int i11 = s3Var.f17469b;
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
        g(context, u6Var, s3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str2, new e4(s3Var, 3));
    }

    public static void e(Context context, u6 u6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String str;
        int i10;
        boolean c10 = s3Var.c();
        int i11 = s3Var.f17469b;
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
        g(context, u6Var, s3Var, z10, LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, new e4(s3Var, 1));
    }

    public static void f(org.telegram.ui.ActionBar.r2 r2Var, Context context, u6 u6Var, s3 s3Var, boolean z10) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        boolean c10 = s3Var.c();
        LinearLayout d = wh.d(context, 1);
        int i11 = 0;
        d.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i12 = s3Var.f17469b;
        TL_iv.pageBlockButtonRow d10 = s3Var.d();
        if (d10 != null && i12 >= 0 && i12 < d10.buttons.size()) {
            pageButton = d10.buttons.get(i12);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = f6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, u6Var, string, l4);
        d.addView(a2, kb1.r(-1, 64));
        s9 s9Var = new s9(a2, r2Var, z10, s3Var, 6);
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        }
        if (c10) {
            i10 = R.string.RichEditorEditProfileButton;
        } else {
            i10 = R.string.RichEditorCreateProfileButton;
        }
        String string2 = LocaleController.getString(i10);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string2;
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ea.b(c10, s9Var, a2, s3Var, 2));
        if (c10) {
            alertDialog$Builder.i(LocaleController.getString(R.string.RichEditorChangeUser), new jg.e1(s9Var, 10));
            String string3 = LocaleController.getString(R.string.Delete);
            e4 e4Var = new e4(s3Var, 2);
            e2Var.f22589r0 = string3;
            e2Var.f22591s0 = e4Var;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.L0 = true;
            i11 = -4;
        } else {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        j(alertDialog$Builder, a2, i11, u6Var);
    }

    public static void g(Context context, u6 u6Var, s3 s3Var, boolean z10, String str, String str2, String str3, e4 e4Var) {
        TL_keyboard.PageButton pageButton;
        String l4;
        AlertDialog$Builder alertDialog$Builder;
        LinearLayout d = wh.d(context, 1);
        int i10 = 0;
        d.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        String string = LocaleController.getString(R.string.RichEditorButtonText);
        int i11 = s3Var.f17469b;
        TL_iv.pageBlockButtonRow d10 = s3Var.d();
        if (d10 != null && i11 >= 0 && i11 < d10.buttons.size()) {
            pageButton = d10.buttons.get(i11);
        } else {
            pageButton = null;
        }
        if (pageButton == null) {
            l4 = "";
        } else {
            l4 = f6.l(pageButton.text);
        }
        EditTextBoldCursor a2 = a(context, u6Var, string, l4);
        EditTextBoldCursor a10 = a(context, u6Var, str2, str3);
        d.addView(a2, kb1.r(-1, 64));
        d.addView(a10, kb1.r(-1, 64));
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        }
        alertDialog$Builder.f22369a.R = str;
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(a2, a10, e4Var, 13));
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
        j(alertDialog$Builder, a2, i10, u6Var);
    }

    public static void h(u3 u3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String l4;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f17329a) != null) {
            inlineButtonType = textbutton.type;
        } else {
            inlineButtonType = null;
        }
        boolean z11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy;
        if (z11) {
            l4 = ((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text;
        } else {
            l4 = f6.l(u3Var.e);
        }
        String str = l4;
        u3Var.f17514f.u3(false);
        if (z11) {
            i10 = R.string.RichEditorEditCopyButton;
        } else {
            i10 = R.string.RichEditorCreateCopyButton;
        }
        u3Var.f17511a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonCopyText), str, false, !z10, new g4(u3Var, 1));
    }

    public static void i(u3 u3Var, boolean z10) {
        TL_keyboard.InlineButtonType inlineButtonType;
        String str;
        int i10;
        TL_iv.textButton textbutton;
        k4 k4Var = u3Var.d;
        if (k4Var != null && (textbutton = k4Var.f17329a) != null) {
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
        u3Var.f17514f.u3(false);
        if (z11) {
            i10 = R.string.RichEditorEditLinkButton;
        } else {
            i10 = R.string.RichEditorCreateLinkButton;
        }
        u3Var.f17511a.showInputDialog(LocaleController.getString(i10), LocaleController.getString(R.string.RichEditorButtonURL), str2, true, !z10, new g4(u3Var, 0));
    }

    public static void j(AlertDialog$Builder alertDialog$Builder, EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.setOnShowListener(new jg.s(editTextBoldCursor, 1));
        e2Var.r(250L);
        if (i10 != 0 && (e2Var.d(i10) instanceof TextView)) {
            f7.V((TextView) e2Var.d(i10), y6.f23599q7, u6Var);
        }
    }

    public static void k(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, i4 i4Var) {
        if (r2Var == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putInt("dialogsType", 4);
        ey eyVar = new ey(bundle);
        eyVar.C2 = new jg.e1(i4Var, 11);
        if (z10) {
            ?? obj = new Object();
            obj.f22929a = true;
            r2Var.showAsSheet(eyVar, obj);
            return;
        }
        r2Var.presentFragment(eyVar);
    }
}
