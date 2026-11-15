package di;

import android.content.Context;
import org.telegram.messenger.c10;
import org.telegram.messenger.gj;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.gy0;
import org.telegram.ui.my0;
import org.telegram.ui.wn0;
import org.telegram.ui.yw;
public final class n3 implements Runnable {
    public final int f9095a = 0;
    public final long f9096b;
    public final Object f9097c;
    public final Object d;
    public final Object f9098e;
    public final Object f9099f;
    public final Object h;
    public final Object f9100n;
    public final Object f9101r;

    public n3(c6 c6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f9097c = c6Var;
        this.d = bVar;
        this.f9098e = t1Var;
        this.f9099f = tLObject;
        this.h = tL_starGiftUnique;
        this.f9100n = tL_error;
        this.f9096b = j3;
        this.f9101r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f9095a) {
            case 0:
                c6 c6Var = (c6) this.f9097c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9100n;
                CharSequence charSequence = (CharSequence) this.f9101r;
                boolean z10 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.t1) this.f9098e).dismiss();
                if (((TLObject) this.f9099f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i7 = 0;
                    while (i7 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i7) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    TL_stars.SavedStarGift savedStarGift = c6Var.B2;
                    if (savedStarGift != null) {
                        z10 = savedStarGift.refunded;
                    }
                    c6Var.l2(tL_starGiftUnique, z10, null, null);
                    org.telegram.messenger.g0.h3(new s2(5, c6Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new cb(c6Var.getContext(), c6Var.J0, this.f9096b, 16, null, new s2(6, c6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    c6Var.k().f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                c10 c10Var = (c10) this.f9097c;
                gj gjVar = (gj) this.d;
                f3.s sVar = (f3.s) this.f9100n;
                c10Var.getClass();
                TLRPC.Message message = gjVar.f23817k;
                message.translatedToLanguage = (String) this.f9098e;
                message.translatedText = p21.Q0((TLRPC.TL_textWithEntities) this.f9099f, (TLRPC.TL_textWithEntities) this.h);
                c10Var.getMessagesStorage().X1(sVar.f10877a, gjVar.f23817k);
                c10Var.M.remove(sVar);
                org.telegram.messenger.g0.i3((wn0) this.f9101r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f9096b)));
                return;
            case 2:
                yw.p0((yw) this.f9097c, (org.telegram.ui.ActionBar.t1) this.f9098e, (TLObject) this.f9099f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f9096b, (TLRPC.TL_error) this.f9100n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9101r);
                return;
            case 3:
                Context context = (Context) this.f9097c;
                fi.i0 i0Var = (fi.i0) this.d;
                byte[] bArr = (byte[]) this.f9098e;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f9100n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f9101r;
                my0 my0Var = new my0(context, i0Var, this.f9096b, bArr);
                my0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f9099f));
                my0Var.f49349v1 = new gy0((org.telegram.messenger.video.a) this.h, ccVar, context, i0Var, dVar);
                my0Var.show();
                return;
            default:
                ((WalletEngine2) this.f9097c).lambda$prepareSend$50((byte[]) this.d, (String) this.f9098e, this.f9096b, (byte[]) this.f9099f, (byte[]) this.h, (String) this.f9100n, (u10) this.f9101r);
                return;
        }
    }

    public n3(c10 c10Var, gj gjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, wn0 wn0Var, long j3) {
        this.f9097c = c10Var;
        this.d = gjVar;
        this.f9098e = str;
        this.f9099f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f9100n = sVar;
        this.f9101r = wn0Var;
        this.f9096b = j3;
    }

    public n3(TLObject tLObject, Context context, fi.i0 i0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, org.telegram.messenger.video.d dVar) {
        this.f9099f = tLObject;
        this.f9097c = context;
        this.d = i0Var;
        this.f9096b = j3;
        this.f9098e = bArr;
        this.h = aVar;
        this.f9100n = ccVar;
        this.f9101r = dVar;
    }

    public n3(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9097c = ywVar;
        this.f9098e = t1Var;
        this.f9099f = tLObject;
        this.d = user;
        this.h = chat;
        this.f9096b = j3;
        this.f9100n = tL_error;
        this.f9101r = tL_messages_checkHistoryImportPeer;
    }

    public n3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, u10 u10Var) {
        this.f9097c = walletEngine2;
        this.d = bArr;
        this.f9098e = str;
        this.f9096b = j3;
        this.f9099f = bArr2;
        this.h = bArr3;
        this.f9100n = str2;
        this.f9101r = u10Var;
    }
}
