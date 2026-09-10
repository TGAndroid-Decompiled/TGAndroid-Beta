package ca;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.l1;
import bi.g2;
import e9.a1;
import e9.f0;
import e9.i0;
import ei.f;
import hi.w3;
import i5.g;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h7;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import x2.d;
import x2.e;
import x2.i;
import x2.m;
import x2.p;
public final class b implements g, MessagesStorage.LongCallback, c2, MessagesController.ErrorDelegate, m {
    public final int f4599a;
    public final boolean f4600b;
    public final Object f4601c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4599a = i10;
        this.f4601c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4600b = z10;
    }

    @Override
    public void b(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: ca.b.b(java.lang.Exception):void");
    }

    @Override
    public a1 e(int i10, l1 l1Var, int[] iArr) {
        p pVar = (p) this.f4601c;
        i iVar = (i) this.d;
        pVar.getClass();
        d dVar = new d(pVar, iVar);
        int i11 = ((int[]) this.e)[i10];
        f0 u10 = i0.u();
        for (int i12 = 0; i12 < l1Var.f1784a; i12++) {
            u10.b(new e(i10, l1Var, i12, iVar, iArr[i12], this.f4600b, dVar, i11));
        }
        return u10.i();
    }

    @Override
    public void f(d2 d2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        zh.b bVar;
        switch (this.f4599a) {
            case 2:
                boolean z10 = this.f4600b;
                g2 g2Var = (g2) this.f4601c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                w3 w3Var = (w3) this.e;
                int i11 = w3Var.f9926b;
                if (!z10) {
                    g2Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = w3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = w3Var.d();
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
                        w3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                eo eoVar = (eo) this.f4601c;
                boolean z11 = this.f4600b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", eoVar.getMessagesController().secretWebpagePreview).commit();
                eoVar.H5 = null;
                eoVar.Ya((CharSequence) this.e, z11);
                return;
            case 4:
                boolean z12 = this.f4600b;
                Context context = (Context) this.f4601c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (z12) {
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
            default:
                ly0 ly0Var = (ly0) this.f4601c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.f4600b;
                String trim2 = ly0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(ly0Var);
                    if (z13) {
                        bVar = null;
                    } else {
                        bVar = new zh.b();
                    }
                    d2 d2Var2 = new d2(context2, 3, bVar);
                    d2Var2.q(250L);
                    callback2.run(trim2, new h7(d2Var2, d2Var, ly0Var));
                    return;
                }
                ly0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(ly0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(ly0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f4601c, (boolean[]) this.d, this.f4600b, (p2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4599a = i10;
        this.f4601c = obj;
        this.d = obj2;
        this.f4600b = z10;
        this.e = obj3;
    }

    @Override
    public void run(long j3) {
        f fVar = (f) this.f4601c;
        String str = (String) this.e;
        fVar.getClass();
        ((d2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f7542a = -j3;
        fVar.f7543b = fVar.getMessagesController().getChat(Long.valueOf(j3));
        fVar.V(str, this.f4600b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f4599a = i10;
        this.f4600b = z10;
        this.f4601c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
