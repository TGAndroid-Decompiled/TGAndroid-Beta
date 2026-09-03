package o9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import cg.u0;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.h;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.by0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
import v2.g;
import vh.p3;
public final class b implements g, c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f16487a;
    public final boolean f16488b;
    public final Object f16489c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f16487a = i10;
        this.f16489c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16488b = z4;
    }

    @Override
    public void b(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: o9.b.b(java.lang.Exception):void");
    }

    @Override
    public void l(d2 d2Var, int i10) {
        nh.b bVar;
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f16487a) {
            case 1:
                zn znVar = (zn) this.f16489c;
                boolean z4 = this.f16488b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", znVar.getMessagesController().secretWebpagePreview).commit();
                znVar.E5 = null;
                znVar.Ya((CharSequence) this.e, z4);
                return;
            case 2:
                boolean z10 = this.f16488b;
                Context context = (Context) this.f16489c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (z10) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            case 3:
                by0 by0Var = (by0) this.f16489c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z11 = this.f16488b;
                String trim = by0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(by0Var);
                    if (z11) {
                        bVar = null;
                    } else {
                        bVar = new nh.b();
                    }
                    d2 d2Var2 = new d2(context2, 3, bVar);
                    d2Var2.q(250L);
                    callback2.run(trim, new h(d2Var2, d2Var, by0Var, 10));
                    return;
                }
                by0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(by0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(by0Var);
                return;
            default:
                boolean z12 = this.f16488b;
                u0 u0Var = (u0) this.f16489c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                p3 p3Var = (p3) this.e;
                int i11 = p3Var.f46137b;
                if (!z12) {
                    u0Var.run();
                    return;
                }
                String trim2 = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    TL_iv.pageBlockButtonRow d = p3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = p3Var.d();
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
                        p3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f16489c, (boolean[]) this.d, this.f16488b, (p2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f16487a = i10;
        this.f16489c = obj;
        this.d = obj2;
        this.f16488b = z4;
        this.e = obj3;
    }

    @Override
    public void run(long j10) {
        sh.g gVar = (sh.g) this.f16489c;
        String str = (String) this.e;
        gVar.getClass();
        ((d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        gVar.f44404a = -j10;
        gVar.f44405b = gVar.getMessagesController().getChat(Long.valueOf(j10));
        gVar.V(str, this.f16488b);
    }

    public b(boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.f16487a = i10;
        this.f16488b = z4;
        this.f16489c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
