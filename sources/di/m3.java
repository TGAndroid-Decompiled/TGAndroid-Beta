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
import org.telegram.ui.cx;
import org.telegram.ui.ky0;
import org.telegram.ui.qy0;
import org.telegram.ui.zn0;
public final class m3 implements Runnable {
    public final int f9333a = 0;
    public final long f9334b;
    public final Object f9335c;
    public final Object d;
    public final Object f9336e;
    public final Object f9337f;
    public final Object h;
    public final Object f9338n;
    public final Object f9339r;

    public m3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f9335c = f6Var;
        this.d = bVar;
        this.f9336e = t1Var;
        this.f9337f = tLObject;
        this.h = tL_starGiftUnique;
        this.f9338n = tL_error;
        this.f9334b = j3;
        this.f9339r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f9333a) {
            case 0:
                f6 f6Var = (f6) this.f9335c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9338n;
                CharSequence charSequence = (CharSequence) this.f9339r;
                boolean z10 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.t1) this.f9336e).dismiss();
                if (((TLObject) this.f9337f) instanceof TLRPC.TL_payments_paymentResult) {
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
                    org.telegram.messenger.g0.g3(new f2(7, f6Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new fb(f6Var.getContext(), f6Var.J0, this.f9334b, 16, null, new f2(8, f6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    f6Var.k().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                a10 a10Var = (a10) this.f9335c;
                gj gjVar = (gj) this.d;
                f3.s sVar = (f3.s) this.f9338n;
                a10Var.getClass();
                TLRPC.Message message = gjVar.f24213k;
                message.translatedToLanguage = (String) this.f9336e;
                message.translatedText = b31.R0((TLRPC.TL_textWithEntities) this.f9337f, (TLRPC.TL_textWithEntities) this.h);
                a10Var.getMessagesStorage().X1(sVar.f11228a, gjVar.f24213k);
                a10Var.M.remove(sVar);
                org.telegram.messenger.g0.h3((zn0) this.f9339r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f9334b)));
                return;
            case 2:
                cx.F0((cx) this.f9335c, (org.telegram.ui.ActionBar.t1) this.f9336e, (TLObject) this.f9337f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f9334b, (TLRPC.TL_error) this.f9338n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9339r);
                return;
            case 3:
                Context context = (Context) this.f9335c;
                fi.h0 h0Var = (fi.h0) this.d;
                byte[] bArr = (byte[]) this.f9336e;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f9338n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f9339r;
                qy0 qy0Var = new qy0(context, h0Var, this.f9334b, bArr);
                qy0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f9337f));
                qy0Var.f51403v1 = new ky0((org.telegram.messenger.video.a) this.h, lcVar, context, h0Var, dVar);
                qy0Var.show();
                return;
            default:
                ((WalletEngine2) this.f9335c).lambda$prepareSend$53((byte[]) this.d, (String) this.f9336e, this.f9334b, (byte[]) this.f9337f, (byte[]) this.h, (String) this.f9338n, (t10) this.f9339r);
                return;
        }
    }

    public m3(a10 a10Var, gj gjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, zn0 zn0Var, long j3) {
        this.f9335c = a10Var;
        this.d = gjVar;
        this.f9336e = str;
        this.f9337f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f9338n = sVar;
        this.f9339r = zn0Var;
        this.f9334b = j3;
    }

    public m3(TLObject tLObject, Context context, fi.h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, org.telegram.messenger.video.d dVar) {
        this.f9337f = tLObject;
        this.f9335c = context;
        this.d = h0Var;
        this.f9334b = j3;
        this.f9336e = bArr;
        this.h = aVar;
        this.f9338n = lcVar;
        this.f9339r = dVar;
    }

    public m3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9335c = cxVar;
        this.f9336e = t1Var;
        this.f9337f = tLObject;
        this.d = user;
        this.h = chat;
        this.f9334b = j3;
        this.f9338n = tL_error;
        this.f9339r = tL_messages_checkHistoryImportPeer;
    }

    public m3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, t10 t10Var) {
        this.f9335c = walletEngine2;
        this.d = bArr;
        this.f9336e = str;
        this.f9334b = j3;
        this.f9337f = bArr2;
        this.h = bArr3;
        this.f9338n = str2;
        this.f9339r = t10Var;
    }
}
