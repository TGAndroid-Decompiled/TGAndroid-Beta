package di;

import android.content.Context;
import org.telegram.messenger.a10;
import org.telegram.messenger.gj;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ao0;
import org.telegram.ui.cx;
import org.telegram.ui.ky0;
import org.telegram.ui.qy0;
public final class m3 implements Runnable {
    public final int f9298a = 0;
    public final long f9299b;
    public final Object f9300c;
    public final Object d;
    public final Object f9301e;
    public final Object f9302f;
    public final Object h;
    public final Object f9303n;
    public final Object f9304r;

    public m3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f9300c = f6Var;
        this.d = bVar;
        this.f9301e = t1Var;
        this.f9302f = tLObject;
        this.h = tL_starGiftUnique;
        this.f9303n = tL_error;
        this.f9299b = j3;
        this.f9304r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f9298a) {
            case 0:
                f6 f6Var = (f6) this.f9300c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9303n;
                CharSequence charSequence = (CharSequence) this.f9304r;
                boolean z10 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.t1) this.f9301e).dismiss();
                if (((TLObject) this.f9302f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i7 = 0;
                    while (i7 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i7) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                    if (savedStarGift != null) {
                        z10 = savedStarGift.refunded;
                    }
                    f6Var.x2(tL_starGiftUnique, z10, null, null);
                    org.telegram.messenger.g0.g3(new w2(5, f6Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new fb(f6Var.getContext(), f6Var.J0, this.f9299b, 16, null, new w2(6, f6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    f6Var.k().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                a10 a10Var = (a10) this.f9300c;
                gj gjVar = (gj) this.d;
                f3.s sVar = (f3.s) this.f9303n;
                a10Var.getClass();
                TLRPC.Message message = gjVar.f24177k;
                message.translatedToLanguage = (String) this.f9301e;
                message.translatedText = b31.R0((TLRPC.TL_textWithEntities) this.f9302f, (TLRPC.TL_textWithEntities) this.h);
                a10Var.getMessagesStorage().X1(sVar.f11191a, gjVar.f24177k);
                a10Var.M.remove(sVar);
                org.telegram.messenger.g0.h3((ao0) this.f9304r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f9299b)));
                return;
            case 2:
                cx.F0((cx) this.f9300c, (org.telegram.ui.ActionBar.t1) this.f9301e, (TLObject) this.f9302f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f9299b, (TLRPC.TL_error) this.f9303n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9304r);
                return;
            case 3:
                Context context = (Context) this.f9300c;
                fi.h0 h0Var = (fi.h0) this.d;
                byte[] bArr = (byte[]) this.f9301e;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f9303n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f9304r;
                qy0 qy0Var = new qy0(context, h0Var, this.f9299b, bArr);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f9302f));
                qy0Var.f51369v1 = new ky0((org.telegram.messenger.video.a) this.h, lcVar, context, h0Var, dVar);
                qy0Var.show();
                return;
            default:
                ((WalletEngine2) this.f9300c).lambda$prepareSend$53((byte[]) this.d, (String) this.f9301e, this.f9299b, (byte[]) this.f9302f, (byte[]) this.h, (String) this.f9303n, (t10) this.f9304r);
                return;
        }
    }

    public m3(a10 a10Var, gj gjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, ao0 ao0Var, long j3) {
        this.f9300c = a10Var;
        this.d = gjVar;
        this.f9301e = str;
        this.f9302f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f9303n = sVar;
        this.f9304r = ao0Var;
        this.f9299b = j3;
    }

    public m3(TLObject tLObject, Context context, fi.h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, org.telegram.messenger.video.d dVar) {
        this.f9302f = tLObject;
        this.f9300c = context;
        this.d = h0Var;
        this.f9299b = j3;
        this.f9301e = bArr;
        this.h = aVar;
        this.f9303n = lcVar;
        this.f9304r = dVar;
    }

    public m3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9300c = cxVar;
        this.f9301e = t1Var;
        this.f9302f = tLObject;
        this.d = user;
        this.h = chat;
        this.f9299b = j3;
        this.f9303n = tL_error;
        this.f9304r = tL_messages_checkHistoryImportPeer;
    }

    public m3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, t10 t10Var) {
        this.f9300c = walletEngine2;
        this.d = bArr;
        this.f9301e = str;
        this.f9299b = j3;
        this.f9302f = bArr2;
        this.h = bArr3;
        this.f9303n = str2;
        this.f9304r = t10Var;
    }
}
