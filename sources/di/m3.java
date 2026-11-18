package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.s10;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cx;
import org.telegram.ui.ky0;
import org.telegram.ui.qy0;
import org.telegram.ui.zn0;
public final class m3 implements Runnable {
    public final int f9300a = 0;
    public final long f9301b;
    public final Object f9302c;
    public final Object d;
    public final Object f9303e;
    public final Object f9304f;
    public final Object h;
    public final Object f9305n;
    public final Object f9306r;

    public m3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f9302c = f6Var;
        this.d = bVar;
        this.f9303e = u1Var;
        this.f9304f = tLObject;
        this.h = tL_starGiftUnique;
        this.f9305n = tL_error;
        this.f9301b = j3;
        this.f9306r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f9300a) {
            case 0:
                f6 f6Var = (f6) this.f9302c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9305n;
                CharSequence charSequence = (CharSequence) this.f9306r;
                boolean z10 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.u1) this.f9303e).dismiss();
                if (((TLObject) this.f9304f) instanceof TLRPC.TL_payments_paymentResult) {
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
                    new fb(f6Var.getContext(), f6Var.J0, this.f9301b, 16, null, new w2(6, f6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    f6Var.k().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                z00 z00Var = (z00) this.f9302c;
                fj fjVar = (fj) this.d;
                f3.s sVar = (f3.s) this.f9305n;
                z00Var.getClass();
                TLRPC.Message message = fjVar.f23965k;
                message.translatedToLanguage = (String) this.f9303e;
                message.translatedText = y21.R0((TLRPC.TL_textWithEntities) this.f9304f, (TLRPC.TL_textWithEntities) this.h);
                z00Var.getMessagesStorage().X1(sVar.f11196a, fjVar.f23965k);
                z00Var.M.remove(sVar);
                org.telegram.messenger.g0.h3((zn0) this.f9306r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f9301b)));
                return;
            case 2:
                cx.F0((cx) this.f9302c, (org.telegram.ui.ActionBar.u1) this.f9303e, (TLObject) this.f9304f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f9301b, (TLRPC.TL_error) this.f9305n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9306r);
                return;
            case 3:
                Context context = (Context) this.f9302c;
                fi.h0 h0Var = (fi.h0) this.d;
                byte[] bArr = (byte[]) this.f9303e;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f9305n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f9306r;
                qy0 qy0Var = new qy0(context, h0Var, this.f9301b, bArr);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f9304f));
                qy0Var.f51345v1 = new ky0((org.telegram.messenger.video.a) this.h, lcVar, context, h0Var, dVar);
                qy0Var.show();
                return;
            default:
                ((WalletEngine2) this.f9302c).lambda$prepareSend$53((byte[]) this.d, (String) this.f9303e, this.f9301b, (byte[]) this.f9304f, (byte[]) this.h, (String) this.f9305n, (s10) this.f9306r);
                return;
        }
    }

    public m3(z00 z00Var, fj fjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, zn0 zn0Var, long j3) {
        this.f9302c = z00Var;
        this.d = fjVar;
        this.f9303e = str;
        this.f9304f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f9305n = sVar;
        this.f9306r = zn0Var;
        this.f9301b = j3;
    }

    public m3(TLObject tLObject, Context context, fi.h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, org.telegram.messenger.video.d dVar) {
        this.f9304f = tLObject;
        this.f9302c = context;
        this.d = h0Var;
        this.f9301b = j3;
        this.f9303e = bArr;
        this.h = aVar;
        this.f9305n = lcVar;
        this.f9306r = dVar;
    }

    public m3(cx cxVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9302c = cxVar;
        this.f9303e = u1Var;
        this.f9304f = tLObject;
        this.d = user;
        this.h = chat;
        this.f9301b = j3;
        this.f9305n = tL_error;
        this.f9306r = tL_messages_checkHistoryImportPeer;
    }

    public m3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, s10 s10Var) {
        this.f9302c = walletEngine2;
        this.d = bArr;
        this.f9303e = str;
        this.f9301b = j3;
        this.f9304f = bArr2;
        this.h = bArr3;
        this.f9305n = str2;
        this.f9306r = s10Var;
    }
}
