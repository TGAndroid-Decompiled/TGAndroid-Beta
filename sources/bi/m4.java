package bi;

import android.content.Context;
import org.telegram.messenger.f10;
import org.telegram.messenger.ij;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.iy0;
import org.telegram.ui.oy0;
import org.telegram.ui.wn0;
import org.telegram.ui.ww;
public final class m4 implements Runnable {
    public final int f4317a = 0;
    public final long f4318b;
    public final Object f4319c;
    public final Object d;
    public final Object f4320e;
    public final Object f4321f;
    public final Object h;
    public final Object f4322n;
    public final Object f4323r;

    public m4(k7 k7Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f4319c = k7Var;
        this.d = bVar;
        this.f4320e = u1Var;
        this.f4321f = tLObject;
        this.h = tL_starGiftUnique;
        this.f4322n = tL_error;
        this.f4318b = j3;
        this.f4323r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f4317a) {
            case 0:
                k7 k7Var = (k7) this.f4319c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4322n;
                CharSequence charSequence = (CharSequence) this.f4323r;
                boolean z9 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.u1) this.f4320e).dismiss();
                if (((TLObject) this.f4321f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i7 = 0;
                    while (i7 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i7) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    TL_stars.SavedStarGift savedStarGift = k7Var.f4203x2;
                    if (savedStarGift != null) {
                        z9 = savedStarGift.refunded;
                    }
                    k7Var.k2(tL_starGiftUnique, z9, null, null);
                    org.telegram.messenger.g0.h3(new a4(3, k7Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new tc(k7Var.getContext(), k7Var.I0, this.f4318b, 16, null, new a4(4, k7Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    k7Var.k().f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                f10 f10Var = (f10) this.f4319c;
                ij ijVar = (ij) this.d;
                f3.s sVar = (f3.s) this.f4322n;
                f10Var.getClass();
                TLRPC.Message message = ijVar.f23262k;
                message.translatedToLanguage = (String) this.f4320e;
                message.translatedText = k21.P0((TLRPC.TL_textWithEntities) this.f4321f, (TLRPC.TL_textWithEntities) this.h);
                f10Var.getMessagesStorage().X1(sVar.f11070a, ijVar.f23262k);
                f10Var.L.remove(sVar);
                org.telegram.messenger.g0.i3((wn0) this.f4323r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f4318b)));
                return;
            case 2:
                ww.p0((ww) this.f4319c, (org.telegram.ui.ActionBar.u1) this.f4320e, (TLObject) this.f4321f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f4318b, (TLRPC.TL_error) this.f4322n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f4323r);
                return;
            case 3:
                Context context = (Context) this.f4319c;
                di.i0 i0Var = (di.i0) this.d;
                byte[] bArr = (byte[]) this.f4320e;
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) this.f4322n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f4323r;
                oy0 oy0Var = new oy0(context, i0Var, this.f4318b, bArr);
                oy0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f4321f));
                oy0Var.f48568r1 = new iy0((org.telegram.messenger.video.a) this.h, hcVar, context, i0Var, dVar);
                oy0Var.show();
                return;
            default:
                ((WalletEngine2) this.f4319c).lambda$prepareSend$50((byte[]) this.d, (String) this.f4320e, this.f4318b, (byte[]) this.f4321f, (byte[]) this.h, (String) this.f4322n, (x10) this.f4323r);
                return;
        }
    }

    public m4(f10 f10Var, ij ijVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, wn0 wn0Var, long j3) {
        this.f4319c = f10Var;
        this.d = ijVar;
        this.f4320e = str;
        this.f4321f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f4322n = sVar;
        this.f4323r = wn0Var;
        this.f4318b = j3;
    }

    public m4(TLObject tLObject, Context context, di.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, org.telegram.messenger.video.d dVar) {
        this.f4321f = tLObject;
        this.f4319c = context;
        this.d = i0Var;
        this.f4318b = j3;
        this.f4320e = bArr;
        this.h = aVar;
        this.f4322n = hcVar;
        this.f4323r = dVar;
    }

    public m4(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f4319c = wwVar;
        this.f4320e = u1Var;
        this.f4321f = tLObject;
        this.d = user;
        this.h = chat;
        this.f4318b = j3;
        this.f4322n = tL_error;
        this.f4323r = tL_messages_checkHistoryImportPeer;
    }

    public m4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, x10 x10Var) {
        this.f4319c = walletEngine2;
        this.d = bArr;
        this.f4320e = str;
        this.f4318b = j3;
        this.f4321f = bArr2;
        this.h = bArr3;
        this.f4322n = str2;
        this.f4323r = x10Var;
    }
}
