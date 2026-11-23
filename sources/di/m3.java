package di;

import android.content.Context;
import org.telegram.messenger.fj;
import org.telegram.messenger.r10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bx;
import org.telegram.ui.jy0;
import org.telegram.ui.py0;
import org.telegram.ui.zn0;
public final class m3 implements Runnable {
    public final int f9294a = 0;
    public final long f9295b;
    public final Object f9296c;
    public final Object d;
    public final Object f9297e;
    public final Object f9298f;
    public final Object h;
    public final Object f9299n;
    public final Object f9300r;

    public m3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.f9296c = f6Var;
        this.d = bVar;
        this.f9297e = t1Var;
        this.f9298f = tLObject;
        this.h = tL_starGiftUnique;
        this.f9299n = tL_error;
        this.f9295b = j3;
        this.f9300r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f9294a) {
            case 0:
                f6 f6Var = (f6) this.f9296c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9299n;
                CharSequence charSequence = (CharSequence) this.f9300r;
                boolean z10 = false;
                ((vf.b) this.d).c(false);
                ((org.telegram.ui.ActionBar.t1) this.f9297e).dismiss();
                if (((TLObject) this.f9298f) instanceof TLRPC.TL_payments_paymentResult) {
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
                    new fb(f6Var.getContext(), f6Var.J0, this.f9295b, 16, null, new f2(8, f6Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    f6Var.k().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                y00 y00Var = (y00) this.f9296c;
                fj fjVar = (fj) this.d;
                f3.s sVar = (f3.s) this.f9299n;
                y00Var.getClass();
                TLRPC.Message message = fjVar.f24073k;
                message.translatedToLanguage = (String) this.f9297e;
                message.translatedText = a31.R0((TLRPC.TL_textWithEntities) this.f9298f, (TLRPC.TL_textWithEntities) this.h);
                y00Var.getMessagesStorage().X1(sVar.f11195a, fjVar.f24073k);
                y00Var.M.remove(sVar);
                org.telegram.messenger.g0.h3((zn0) this.f9300r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f9295b)));
                return;
            case 2:
                bx.F0((bx) this.f9296c, (org.telegram.ui.ActionBar.t1) this.f9297e, (TLObject) this.f9298f, (TLRPC.User) this.d, (TLRPC.Chat) this.h, this.f9295b, (TLRPC.TL_error) this.f9299n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9300r);
                return;
            case 3:
                Context context = (Context) this.f9296c;
                fi.h0 h0Var = (fi.h0) this.d;
                byte[] bArr = (byte[]) this.f9297e;
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) this.f9299n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f9300r;
                py0 py0Var = new py0(context, h0Var, this.f9295b, bArr);
                py0Var.O0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f9298f));
                py0Var.f51196v1 = new jy0((org.telegram.messenger.video.a) this.h, kcVar, context, h0Var, dVar);
                py0Var.show();
                return;
            default:
                ((WalletEngine2) this.f9296c).lambda$prepareSend$53((byte[]) this.d, (String) this.f9297e, this.f9295b, (byte[]) this.f9298f, (byte[]) this.h, (String) this.f9299n, (r10) this.f9300r);
                return;
        }
    }

    public m3(y00 y00Var, fj fjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, f3.s sVar, zn0 zn0Var, long j3) {
        this.f9296c = y00Var;
        this.d = fjVar;
        this.f9297e = str;
        this.f9298f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f9299n = sVar;
        this.f9300r = zn0Var;
        this.f9295b = j3;
    }

    public m3(TLObject tLObject, Context context, fi.h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.kc kcVar, org.telegram.messenger.video.d dVar) {
        this.f9298f = tLObject;
        this.f9296c = context;
        this.d = h0Var;
        this.f9295b = j3;
        this.f9297e = bArr;
        this.h = aVar;
        this.f9299n = kcVar;
        this.f9300r = dVar;
    }

    public m3(bx bxVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9296c = bxVar;
        this.f9297e = t1Var;
        this.f9298f = tLObject;
        this.d = user;
        this.h = chat;
        this.f9295b = j3;
        this.f9299n = tL_error;
        this.f9300r = tL_messages_checkHistoryImportPeer;
    }

    public m3(WalletEngine2 walletEngine2, byte[] bArr, String str, long j3, byte[] bArr2, byte[] bArr3, String str2, r10 r10Var) {
        this.f9296c = walletEngine2;
        this.d = bArr;
        this.f9297e = str;
        this.f9295b = j3;
        this.f9298f = bArr2;
        this.h = bArr3;
        this.f9299n = str2;
        this.f9300r = r10Var;
    }
}
