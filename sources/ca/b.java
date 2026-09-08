package ca;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.l1;
import bi.e4;
import bi.o4;
import e9.a1;
import e9.f0;
import e9.i0;
import gi.f;
import i5.g;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.s3;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import x2.d;
import x2.e;
import x2.i;
import x2.m;
import x2.p;
public final class b implements g, MessagesStorage.LongCallback, a2, MessagesController.ErrorDelegate, m {
    public final int f4738a;
    public final boolean f4739b;
    public final Object f4740c;
    public final Object d;
    public final Object f4741e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4738a = i10;
        this.f4740c = obj;
        this.d = obj2;
        this.f4741e = obj3;
        this.f4739b = z10;
    }

    @Override
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        p pVar = (p) this.f4740c;
        i iVar = (i) this.d;
        pVar.getClass();
        d dVar = new d(pVar, iVar);
        int i11 = ((int[]) this.f4741e)[i10];
        f0 u10 = i0.u();
        for (int i12 = 0; i12 < l1Var.f2169a; i12++) {
            u10.b(new e(i10, l1Var, i12, iVar, iArr[i12], this.f4739b, dVar, i11));
        }
        return u10.i();
    }

    @Override
    public void c(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: ca.b.c(java.lang.Exception):void");
    }

    @Override
    public void g(b2 b2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        bi.b bVar;
        switch (this.f4738a) {
            case 2:
                boolean z10 = this.f4739b;
                e4 e4Var = (e4) this.f4740c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                s3 s3Var = (s3) this.f4741e;
                int i11 = s3Var.f14188b;
                if (!z10) {
                    e4Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = s3Var.d();
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
                    long j10 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j3 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d10 = s3Var.d();
                        if (d10 != null && i11 >= 0 && i11 < d10.buttons.size()) {
                            pageButton2 = d10.buttons.get(i11);
                        } else {
                            pageButton2 = null;
                        }
                        if (pageButton2 != null) {
                            inlineButtonType2 = pageButton2.type;
                        }
                        if (inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                            j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id;
                        }
                        tL_inlineButtonTypeUserProfile.user_id = j10;
                        s3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                co coVar = (co) this.f4740c;
                boolean z11 = this.f4739b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", coVar.getMessagesController().secretWebpagePreview).commit();
                coVar.H5 = null;
                coVar.Ya((CharSequence) this.f4741e, z11);
                return;
            case 4:
                boolean z12 = this.f4739b;
                Context context = (Context) this.f4740c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f4741e;
                if (z12) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            default:
                yx0 yx0Var = (yx0) this.f4740c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f4741e;
                boolean z13 = this.f4739b;
                String trim2 = yx0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(yx0Var);
                    if (z13) {
                        bVar = null;
                    } else {
                        bVar = new bi.b();
                    }
                    b2 b2Var2 = new b2(context2, 3, bVar);
                    b2Var2.q(250L);
                    callback2.run(trim2, new o4(b2Var2, b2Var, yx0Var, 6));
                    return;
                }
                yx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(yx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(yx0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f4740c, (boolean[]) this.d, this.f4739b, (n2) this.f4741e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4738a = i10;
        this.f4740c = obj;
        this.d = obj2;
        this.f4739b = z10;
        this.f4741e = obj3;
    }

    @Override
    public void run(long j3) {
        f fVar = (f) this.f4740c;
        String str = (String) this.f4741e;
        fVar.getClass();
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f10707a = -j3;
        fVar.f10708b = fVar.getMessagesController().getChat(Long.valueOf(j3));
        fVar.V(str, this.f4739b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f4738a = i10;
        this.f4739b = z10;
        this.f4740c = obj;
        this.d = obj2;
        this.f4741e = obj3;
    }
}
