package ci;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.messenger.x00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ey0;
import org.telegram.ui.qn0;
import org.telegram.ui.uw;
import org.telegram.ui.yx0;
public final class w3 implements Runnable {
    public final int f6235a = 0;
    public final long f6236b;
    public final Object f6237c;
    public final Object d;
    public final Object f6238e;
    public final Object f6239f;
    public final Object h;
    public final Object f6240n;
    public final Object f6241r;

    public w3(l6 l6Var, sf.b bVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f6237c = l6Var;
        this.d = bVar;
        this.f6238e = s1Var;
        this.f6239f = tLObject;
        this.h = tL_starGiftUnique;
        this.f6240n = tL_error;
        this.f6236b = j10;
        this.f6241r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f6235a) {
            case 0:
                l6 l6Var = (l6) this.f6237c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6240n;
                CharSequence charSequence = (CharSequence) this.f6241r;
                boolean z10 = false;
                ((sf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.s1) this.f6238e).dismiss();
                if (((TLObject) this.f6239f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i3 = 0;
                    while (i3 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i3) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i3);
                            i3--;
                        }
                        i3++;
                    }
                    TL_stars.SavedStarGift savedStarGift = l6Var.f5487y2;
                    if (savedStarGift != null) {
                        z10 = savedStarGift.refunded;
                    }
                    l6Var.k2(tL_starGiftUnique, z10, null, null);
                    org.telegram.messenger.g0.h3(new e0(10, l6Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new mb(l6Var.getContext(), l6Var.J0, this.f6236b, 16, null, new e0(11, l6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    l6Var.k().f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                x00 x00Var = (x00) this.f6237c;
                zi ziVar = (zi) this.d;
                e3.s sVar = (e3.s) this.f6240n;
                x00Var.getClass();
                TLRPC.Message message = ziVar.f26868k;
                message.translatedToLanguage = (String) this.f6238e;
                message.translatedText = f21.P0((TLRPC.TL_textWithEntities) this.f6239f, (TLRPC.TL_textWithEntities) this.h);
                x00Var.getMessagesStorage().X1(sVar.f9506a, ziVar.f26868k);
                x00Var.M.remove(sVar);
                org.telegram.messenger.g0.i3((qn0) this.f6241r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f6236b)));
                return;
            case 2:
                uw.p0((uw) this.f6237c, (org.telegram.ui.ActionBar.s1) this.f6238e, (TLObject) this.f6239f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f6236b, (TLRPC.TL_error) this.f6240n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f6241r);
                return;
            case 3:
                Context context = (Context) this.f6237c;
                ei.k0 k0Var = (ei.k0) this.d;
                byte[] bArr = (byte[]) this.f6238e;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.f6240n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f6241r;
                ey0 ey0Var = new ey0(context, k0Var, this.f6236b, bArr);
                ey0Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f6239f));
                ey0Var.f45100s1 = new yx0((org.telegram.messenger.video.a) this.h, fcVar, context, k0Var, dVar);
                ey0Var.show();
                return;
            default:
                ((WalletEngine2) this.f6237c).lambda$prepareSend$50((byte[]) this.d, (String) this.f6238e, this.f6236b, (byte[]) this.f6239f, (byte[]) this.h, (String) this.f6240n, (p10) this.f6241r);
                return;
        }
    }

    public w3(x00 x00Var, zi ziVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, e3.s sVar, qn0 qn0Var, long j10) {
        this.f6237c = x00Var;
        this.d = ziVar;
        this.f6238e = str;
        this.f6239f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f6240n = sVar;
        this.f6241r = qn0Var;
        this.f6236b = j10;
    }

    public w3(TLObject tLObject, Context context, ei.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.fc fcVar, org.telegram.messenger.video.d dVar) {
        this.f6239f = tLObject;
        this.f6237c = context;
        this.d = k0Var;
        this.f6236b = j10;
        this.f6238e = bArr;
        this.h = aVar;
        this.f6240n = fcVar;
        this.f6241r = dVar;
    }

    public w3(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f6237c = uwVar;
        this.f6238e = s1Var;
        this.f6239f = tLObject;
        this.d = user;
        this.h = chat;
        this.f6236b = j10;
        this.f6240n = tL_error;
        this.f6241r = tL_messages_checkHistoryImportPeer;
    }

    public w3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, p10 p10Var) {
        this.f6237c = walletEngine2;
        this.d = bArr;
        this.f6238e = str;
        this.f6236b = j10;
        this.f6239f = bArr2;
        this.h = bArr3;
        this.f6240n = str2;
        this.f6241r = p10Var;
    }
}
