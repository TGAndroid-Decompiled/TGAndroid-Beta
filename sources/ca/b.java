package ca;

import ai.d5;
import ai.s4;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.l1;
import e9.a1;
import e9.f0;
import e9.i0;
import fi.f;
import i5.g;
import ii.t3;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.my0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
import x2.d;
import x2.e;
import x2.j;
import x2.n;
import x2.q;
public final class b implements g, MessagesStorage.LongCallback, a2, MessagesController.ErrorDelegate, n {
    public final int f4184a;
    public final boolean f4185b;
    public final Object f4186c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4184a = i10;
        this.f4186c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4185b = z10;
    }

    @Override
    public void a(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: ca.b.a(java.lang.Exception):void");
    }

    @Override
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        q qVar = (q) this.f4186c;
        j jVar = (j) this.d;
        qVar.getClass();
        d dVar = new d(qVar, jVar);
        int i11 = ((int[]) this.e)[i10];
        f0 u10 = i0.u();
        for (int i12 = 0; i12 < l1Var.f3090a; i12++) {
            u10.b(new e(i10, l1Var, i12, jVar, iArr[i12], this.f4185b, dVar, i11));
        }
        return u10.i();
    }

    @Override
    public void k(b2 b2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        ai.d dVar;
        switch (this.f4184a) {
            case 2:
                boolean z10 = this.f4185b;
                s4 s4Var = (s4) this.f4186c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                t3 t3Var = (t3) this.e;
                int i11 = t3Var.f11634b;
                if (!z10) {
                    s4Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = t3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = t3Var.d();
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
                        t3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zn znVar = (zn) this.f4186c;
                boolean z11 = this.f4185b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", znVar.getMessagesController().secretWebpagePreview).commit();
                znVar.H5 = null;
                znVar.Ya((CharSequence) this.e, z11);
                return;
            case 4:
                boolean z12 = this.f4185b;
                Context context = (Context) this.f4186c;
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
                my0 my0Var = (my0) this.f4186c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.f4185b;
                String trim2 = my0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(my0Var);
                    if (z13) {
                        dVar = null;
                    } else {
                        dVar = new ai.d();
                    }
                    b2 b2Var2 = new b2(context2, 3, dVar);
                    b2Var2.q(250L);
                    callback2.run(trim2, new d5(b2Var2, b2Var, my0Var, 6));
                    return;
                }
                my0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(my0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(my0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f4186c, (boolean[]) this.d, this.f4185b, (n2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4184a = i10;
        this.f4186c = obj;
        this.d = obj2;
        this.f4185b = z10;
        this.e = obj3;
    }

    @Override
    public void run(long j3) {
        f fVar = (f) this.f4186c;
        String str = (String) this.e;
        fVar.getClass();
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f9098a = -j3;
        fVar.f9099b = fVar.getMessagesController().getChat(Long.valueOf(j3));
        fVar.V(str, this.f4185b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f4184a = i10;
        this.f4185b = z10;
        this.f4186c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
