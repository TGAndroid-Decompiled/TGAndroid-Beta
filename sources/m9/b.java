package m9;

import ag.w0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import ih.i;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
import th.m3;
import v2.g;
public final class b implements g, b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f16933a;
    public final boolean f16934b;
    public final Object f16935c;
    public final Object d;
    public final Object f16936e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f16933a = i10;
        this.f16935c = obj;
        this.d = obj2;
        this.f16936e = obj3;
        this.f16934b = z10;
    }

    @Override
    public void d(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: m9.b.d(java.lang.Exception):void");
    }

    @Override
    public void g(c2 c2Var, int i10) {
        lh.b bVar;
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f16933a) {
            case 1:
                tn tnVar = (tn) this.f16935c;
                boolean z10 = this.f16934b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", tnVar.getMessagesController().secretWebpagePreview).commit();
                tnVar.D5 = null;
                tnVar.Ya((CharSequence) this.f16936e, z10);
                return;
            case 2:
                boolean z11 = this.f16934b;
                Context context = (Context) this.f16935c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f16936e;
                if (z11) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            case 3:
                rx0 rx0Var = (rx0) this.f16935c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f16936e;
                boolean z12 = this.f16934b;
                String trim = rx0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(rx0Var);
                    if (z12) {
                        bVar = null;
                    } else {
                        bVar = new lh.b();
                    }
                    c2 c2Var2 = new c2(context2, 3, bVar);
                    c2Var2.q(250L);
                    callback2.run(trim, new i(c2Var2, c2Var, rx0Var, 10));
                    return;
                }
                rx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(rx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(rx0Var);
                return;
            default:
                boolean z13 = this.f16934b;
                w0 w0Var = (w0) this.f16935c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                m3 m3Var = (m3) this.f16936e;
                int i11 = m3Var.f48570b;
                if (!z13) {
                    w0Var.run();
                    return;
                }
                String trim2 = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    TL_iv.pageBlockButtonRow d = m3Var.d();
                    TL_keyboard.InlineButtonType inlineButtonType2 = null;
                    if (d != null && i11 >= 0 && i11 < d.buttons.size()) {
                        pageButton = d.buttons.get(i11);
                    } else {
                        pageButton = null;
                    }
                    if (pageButton == null) {
                        inlineButtonType = null;
                    } else {
                        inlineButtonType = pageButton.type;
                    }
                    long j11 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d10 = m3Var.d();
                        if (d10 != null && i11 >= 0 && i11 < d10.buttons.size()) {
                            pageButton2 = d10.buttons.get(i11);
                        } else {
                            pageButton2 = null;
                        }
                        if (pageButton2 != null) {
                            inlineButtonType2 = pageButton2.type;
                        }
                        if (inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                            j11 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id;
                        }
                        tL_inlineButtonTypeUserProfile.user_id = j11;
                        m3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f16935c, (boolean[]) this.d, this.f16934b, (o2) this.f16936e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f16933a = i10;
        this.f16935c = obj;
        this.d = obj2;
        this.f16934b = z10;
        this.f16936e = obj3;
    }

    @Override
    public void run(long j10) {
        qh.g gVar = (qh.g) this.f16935c;
        String str = (String) this.f16936e;
        gVar.getClass();
        ((c2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        gVar.f46700a = -j10;
        gVar.f46701b = gVar.getMessagesController().getChat(Long.valueOf(j10));
        gVar.V(str, this.f16934b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f16933a = i10;
        this.f16934b = z10;
        this.f16935c = obj;
        this.d = obj2;
        this.f16936e = obj3;
    }
}
