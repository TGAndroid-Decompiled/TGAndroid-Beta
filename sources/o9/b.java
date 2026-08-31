package o9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import dg.t0;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.h;
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
import org.telegram.ui.Components.cy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
import v2.g;
import wh.o3;
public final class b implements g, c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f16667a;
    public final boolean f16668b;
    public final Object f16669c;
    public final Object d;
    public final Object f16670e;

    public b(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f16667a = i10;
        this.f16669c = obj;
        this.d = obj2;
        this.f16670e = obj3;
        this.f16668b = z4;
    }

    @Override
    public void e(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: o9.b.e(java.lang.Exception):void");
    }

    @Override
    public void j(d2 d2Var, int i10) {
        oh.b bVar;
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f16667a) {
            case 1:
                xn xnVar = (xn) this.f16669c;
                boolean z4 = this.f16668b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", xnVar.getMessagesController().secretWebpagePreview).commit();
                xnVar.E5 = null;
                xnVar.Ya((CharSequence) this.f16670e, z4);
                return;
            case 2:
                boolean z10 = this.f16668b;
                Context context = (Context) this.f16669c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f16670e;
                if (z10) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                atomicBoolean.set(true);
                aVar.accept(Boolean.TRUE);
                return;
            case 3:
                cy0 cy0Var = (cy0) this.f16669c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f16670e;
                boolean z11 = this.f16668b;
                String trim = cy0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(cy0Var);
                    if (z11) {
                        bVar = null;
                    } else {
                        bVar = new oh.b();
                    }
                    d2 d2Var2 = new d2(context2, 3, bVar);
                    d2Var2.q(250L);
                    callback2.run(trim, new h(d2Var2, d2Var, cy0Var, 10));
                    return;
                }
                cy0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(cy0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(cy0Var);
                return;
            default:
                boolean z12 = this.f16668b;
                t0 t0Var = (t0) this.f16669c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                o3 o3Var = (o3) this.f16670e;
                int i11 = o3Var.f49899b;
                if (!z12) {
                    t0Var.run();
                    return;
                }
                String trim2 = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    TL_iv.pageBlockButtonRow d = o3Var.d();
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
                        TL_iv.pageBlockButtonRow d10 = o3Var.d();
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
                        o3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.f16669c, (boolean[]) this.d, this.f16668b, (p2) this.f16670e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f16667a = i10;
        this.f16669c = obj;
        this.d = obj2;
        this.f16668b = z4;
        this.f16670e = obj3;
    }

    @Override
    public void run(long j10) {
        th.g gVar = (th.g) this.f16669c;
        String str = (String) this.f16670e;
        gVar.getClass();
        ((d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        gVar.f48119a = -j10;
        gVar.f48120b = gVar.getMessagesController().getChat(Long.valueOf(j10));
        gVar.V(str, this.f16668b);
    }

    public b(boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.f16667a = i10;
        this.f16668b = z4;
        this.f16669c = obj;
        this.d = obj2;
        this.f16670e = obj3;
    }
}
