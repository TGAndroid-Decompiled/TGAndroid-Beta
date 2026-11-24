package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class kg3 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public kg3(cj3 cj3Var, hd hdVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.a = (byte) 0;
        this.c = cj3Var;
        this.d = hdVar;
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
                ((cj3) obj7).P3((hd) obj6, (TLObject) obj5, (TLRPC.User) obj4, (TLRPC.Chat) obj3, this.b, (TLRPC.TL_error) obj2, (TLRPC.TL_messages_checkHistoryImportPeer) obj);
                return;
            case 1:
                Context context = (Context) obj6;
                e53 e53Var = (e53) obj5;
                b89 b89Var = new b89(context, e53Var, this.b, (byte[]) obj4);
                b89Var.H0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj7);
                b89Var.u1 = new w79((en1) obj3, (u21) obj2, context, e53Var, (dac) obj);
                b89Var.show();
                return;
            case 2:
                vqa vqaVar = (vqa) obj7;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CharSequence charSequence = (CharSequence) obj;
                vqaVar.getClass();
                boolean z = false;
                ((c01) obj4).c(false);
                ((hd) obj6).dismiss();
                if (((TLObject) obj5) instanceof TLRPC.TL_payments_paymentResult) {
                    int i = 0;
                    while (i < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i);
                            i--;
                        }
                        i++;
                    }
                    TL_stars.SavedStarGift savedStarGift = vqaVar.A2;
                    if (savedStarGift != null) {
                        z = savedStarGift.refunded;
                    }
                    vqaVar.o2(tL_starGiftUnique, z, null, null);
                    gl.d3(new t7a(vqaVar, tL_starGiftUnique, (byte) 20));
                    return;
                } else if (tL_error != null) {
                    if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new zua(vqaVar.getContext(), vqaVar.J0, this.b, 16, null, new t7a(vqaVar, charSequence, (byte) 21), 0L).show();
                        return;
                    }
                    vqaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 3:
                b1c b1cVar = (b1c) obj7;
                k27 k27Var = (k27) obj6;
                m11 m11Var = (m11) obj2;
                b1cVar.getClass();
                TLRPC.Message message = k27Var.k;
                message.translatedToLanguage = (String) obj5;
                message.translatedText = rzb.L0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                b1cVar.getMessagesStorage().U1(m11Var.a, k27Var.k);
                b1cVar.M.remove(m11Var);
                gl.e3((y68) obj, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                return;
            default:
                ((WalletEngine2) obj7).lambda$prepareSend$53((byte[]) obj6, (String) obj5, this.b, (byte[]) obj4, (byte[]) obj3, (String) obj2, (k8c) obj);
                return;
        }
    }

    public kg3(vqa vqaVar, c01 c01Var, hd hdVar, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        this.a = (byte) 2;
        this.c = vqaVar;
        this.f = c01Var;
        this.d = hdVar;
        this.e = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j;
        this.r = charSequence;
    }

    public kg3(b1c b1cVar, k27 k27Var, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, m11 m11Var, y68 y68Var, long j) {
        this.a = (byte) 3;
        this.c = b1cVar;
        this.d = k27Var;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = m11Var;
        this.r = y68Var;
        this.b = j;
    }

    public kg3(Object obj, Object obj2, Object obj3, long j, byte[] bArr, Object obj4, Object obj5, Object obj6, byte b) {
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
