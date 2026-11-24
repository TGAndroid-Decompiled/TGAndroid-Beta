package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class xh3 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public xh3(nk3 nk3Var, he heVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.a = (byte) 0;
        this.c = nk3Var;
        this.d = heVar;
        this.e = tLObject;
        this.f = user;
        this.h = chat;
        this.b = j;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                ((nk3) obj7).S3((he) obj6, (TLObject) obj5, (TLRPC.User) obj4, (TLRPC.Chat) obj3, this.b, (TLRPC.TL_error) obj2, (TLRPC.TL_messages_checkHistoryImportPeer) obj);
                return;
            case 1:
                Context context = (Context) obj6;
                q63 q63Var = (q63) obj5;
                da9 da9Var = new da9(context, q63Var, this.b, (byte[]) obj4);
                da9Var.I0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj7);
                da9Var.u1 = new y99((bo1) obj3, (c41) obj2, context, q63Var, (ecc) obj);
                da9Var.show();
                return;
            case 2:
                wsa wsaVar = (wsa) obj7;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CharSequence charSequence = (CharSequence) obj;
                wsaVar.getClass();
                boolean z = false;
                ((k11) obj4).c(false);
                ((he) obj6).dismiss();
                if (((TLObject) obj5) instanceof TLRPC.TL_payments_paymentResult) {
                    int i = 0;
                    while (i < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i);
                            i--;
                        }
                        i++;
                    }
                    TL_stars.SavedStarGift savedStarGift = wsaVar.A2;
                    if (savedStarGift != null) {
                        z = savedStarGift.refunded;
                    }
                    wsaVar.o2(tL_starGiftUnique, z, null, null);
                    gm.c3(new e6a(wsaVar, tL_starGiftUnique, (byte) 22));
                    return;
                } else if (tL_error != null) {
                    if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new dxa(wsaVar.getContext(), wsaVar.J0, this.b, 16, null, new e6a(wsaVar, charSequence, (byte) 23), 0L).show();
                        return;
                    }
                    wsaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 3:
                b3c b3cVar = (b3c) obj7;
                k47 k47Var = (k47) obj6;
                u21 u21Var = (u21) obj2;
                b3cVar.getClass();
                TLRPC.Message message = k47Var.k;
                message.translatedToLanguage = (String) obj5;
                message.translatedText = s1c.L0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                b3cVar.getMessagesStorage().U1(u21Var.a, k47Var.k);
                b3cVar.M.remove(u21Var);
                gm.d3((b98) obj, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                return;
            default:
                ((WalletEngine2) obj7).lambda$prepareSend$53((byte[]) obj6, (String) obj5, this.b, (byte[]) obj4, (byte[]) obj3, (String) obj2, (lac) obj);
                return;
        }
    }

    public xh3(wsa wsaVar, k11 k11Var, he heVar, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        this.a = (byte) 2;
        this.c = wsaVar;
        this.f = k11Var;
        this.d = heVar;
        this.e = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j;
        this.r = charSequence;
    }

    public xh3(b3c b3cVar, k47 k47Var, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, u21 u21Var, b98 b98Var, long j) {
        this.a = (byte) 3;
        this.c = b3cVar;
        this.d = k47Var;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = u21Var;
        this.r = b98Var;
        this.b = j;
    }

    public xh3(Object obj, Object obj2, Object obj3, long j, byte[] bArr, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
        this.f = bArr;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
    }
}
