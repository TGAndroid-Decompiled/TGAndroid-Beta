package ca;

import ai.c5;
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
import ii.u3;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
import x2.d;
import x2.e;
import x2.i;
import x2.m;
import x2.p;
public final class b implements g, MessagesStorage.LongCallback, z1, MessagesController.ErrorDelegate, m {
    public final int f4177a;
    public final boolean f4178b;
    public final Object f4179c;
    public final Object d;
    public final Object e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4177a = i10;
        this.f4179c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4178b = z10;
    }

    @Override
    public void a(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: ca.b.a(java.lang.Exception):void");
    }

    @Override
    public a1 b(int i10, l1 l1Var, int[] iArr) {
        p pVar = (p) this.f4179c;
        i iVar = (i) this.d;
        pVar.getClass();
        d dVar = new d(pVar, iVar);
        int i11 = ((int[]) this.e)[i10];
        f0 u10 = i0.u();
        for (int i12 = 0; i12 < l1Var.f3083a; i12++) {
            u10.b(new e(i10, l1Var, i12, iVar, iArr[i12], this.f4178b, dVar, i11));
        }
        return u10.i();
    }

    @Override
    public void f(a2 a2Var, int i10) {
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j3;
        TL_keyboard.PageButton pageButton2;
        ai.d dVar;
        switch (this.f4177a) {
            case 2:
                boolean z10 = this.f4178b;
                s4 s4Var = (s4) this.f4179c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                u3 u3Var = (u3) this.e;
                int i11 = u3Var.f11653b;
                if (!z10) {
                    s4Var.run();
                    return;
                }
                String trim = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    TL_iv.pageBlockButtonRow d = u3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = u3Var.d();
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
                        u3Var.a(trim, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wn wnVar = (wn) this.f4179c;
                boolean z11 = this.f4178b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", wnVar.getMessagesController().secretWebpagePreview).commit();
                wnVar.H5 = null;
                wnVar.Ya((CharSequence) this.e, z11);
                return;
            case 4:
                boolean z12 = this.f4178b;
                Context context = (Context) this.f4179c;
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
                jy0 jy0Var = (jy0) this.f4179c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.f4178b;
                String trim2 = jy0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(jy0Var);
                    if (z13) {
                        dVar = null;
                    } else {
                        dVar = new ai.d();
                    }
                    a2 a2Var2 = new a2(context2, 3, dVar);
                    a2Var2.q(250L);
                    callback2.run(trim2, new c5(a2Var2, a2Var, jy0Var, 8));
                    return;
                }
                jy0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(jy0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(jy0Var);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f4179c, (boolean[]) this.d, this.f4178b, (m2) this.e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4177a = i10;
        this.f4179c = obj;
        this.d = obj2;
        this.f4178b = z10;
        this.e = obj3;
    }

    @Override
    public void run(long j3) {
        f fVar = (f) this.f4179c;
        String str = (String) this.e;
        fVar.getClass();
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.f9080a = -j3;
        fVar.f9081b = fVar.getMessagesController().getChat(Long.valueOf(j3));
        fVar.V(str, this.f4178b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f4177a = i10;
        this.f4178b = z10;
        this.f4179c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
