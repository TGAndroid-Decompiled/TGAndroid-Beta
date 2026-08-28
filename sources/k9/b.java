package k9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bg.d;
import fh.i;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.f;
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
import org.telegram.ui.Components.gx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
import qh.l3;
import t2.g;
public final class b implements g, MessagesStorage.LongCallback, b2, MessagesController.ErrorDelegate {
    public final int f14712a;
    public final boolean f14713b;
    public final Object f14714c;
    public final Object d;
    public final Object f14715e;

    public b(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f14712a = i9;
        this.f14714c = obj;
        this.d = obj2;
        this.f14715e = obj3;
        this.f14713b = z10;
    }

    @Override
    public void c(java.lang.Exception r10) {
        throw new UnsupportedOperationException("Method not decompiled: k9.b.c(java.lang.Exception):void");
    }

    @Override
    public void f(c2 c2Var, int i9) {
        ih.b bVar;
        TL_keyboard.PageButton pageButton;
        TL_keyboard.InlineButtonType inlineButtonType;
        long j10;
        TL_keyboard.PageButton pageButton2;
        switch (this.f14712a) {
            case 2:
                qn qnVar = (qn) this.f14714c;
                boolean z10 = this.f14713b;
                ((MessagesController) this.d).secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", qnVar.getMessagesController().secretWebpagePreview).commit();
                qnVar.D5 = null;
                qnVar.Ya((CharSequence) this.f14715e, z10);
                return;
            case 3:
                boolean z11 = this.f14713b;
                Context context = (Context) this.f14714c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.f14715e;
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
            case 4:
                gx0 gx0Var = (gx0) this.f14714c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.f14715e;
                boolean z12 = this.f14713b;
                String trim = gx0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(gx0Var);
                    if (z12) {
                        bVar = null;
                    } else {
                        bVar = new ih.b();
                    }
                    c2 c2Var2 = new c2(context2, 3, bVar);
                    c2Var2.q(250L);
                    callback2.run(trim, new i(c2Var2, c2Var, gx0Var, 10));
                    return;
                }
                gx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(gx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(gx0Var);
                return;
            default:
                boolean z13 = this.f14713b;
                d dVar = (d) this.f14714c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                l3 l3Var = (l3) this.f14715e;
                int i10 = l3Var.f46500b;
                if (!z13) {
                    dVar.run();
                    return;
                }
                String trim2 = editTextBoldCursor.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    TL_iv.pageBlockButtonRow d = l3Var.d();
                    TL_keyboard.InlineButtonType inlineButtonType2 = null;
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
                    long j11 = 0;
                    if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                        j10 = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 0) {
                        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                        TL_iv.pageBlockButtonRow d9 = l3Var.d();
                        if (d9 != null && i10 >= 0 && i10 < d9.buttons.size()) {
                            pageButton2 = d9.buttons.get(i10);
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
                        l3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Y((ProfileActivity) this.f14714c, (boolean[]) this.d, this.f14713b, (o2) this.f14715e, tL_error);
    }

    public b(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.f14712a = i9;
        this.f14714c = obj;
        this.d = obj2;
        this.f14713b = z10;
        this.f14715e = obj3;
    }

    @Override
    public void run(long j10) {
        f fVar = (f) this.f14714c;
        String str = (String) this.f14715e;
        fVar.getClass();
        ((c2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.f18628a = -j10;
        fVar.f18629b = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.U(str, this.f14713b);
    }

    public b(boolean z10, Object obj, Object obj2, Object obj3, int i9) {
        this.f14712a = i9;
        this.f14713b = z10;
        this.f14714c = obj;
        this.d = obj2;
        this.f14715e = obj3;
    }
}
