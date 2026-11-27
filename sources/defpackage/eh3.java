package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
public final class eh3 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public eh3(uj3 uj3Var, id idVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.a = (byte) 0;
        this.c = uj3Var;
        this.d = idVar;
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
                ((uj3) obj7).S3((id) obj6, (TLObject) obj5, (TLRPC.User) obj4, (TLRPC.Chat) obj3, this.b, (TLRPC.TL_error) obj2, (TLRPC.TL_messages_checkHistoryImportPeer) obj);
                return;
            case 1:
                Context context = (Context) obj6;
                w53 w53Var = (w53) obj5;
                nb9 nb9Var = new nb9(context, w53Var, this.b, (byte[]) obj4);
                nb9Var.J0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj7);
                nb9Var.u1 = new ib9((vn1) obj3, (d31) obj2, context, w53Var, (dec) obj);
                nb9Var.show();
                return;
            case 2:
                wua wuaVar = (wua) obj7;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                CharSequence charSequence = (CharSequence) obj;
                wuaVar.getClass();
                boolean z = false;
                ((l01) obj4).c(false);
                ((id) obj6).dismiss();
                if (((TLObject) obj5) instanceof TLRPC.TL_payments_paymentResult) {
                    int i = 0;
                    while (i < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i);
                            i--;
                        }
                        i++;
                    }
                    TL_stars.SavedStarGift savedStarGift = wuaVar.A2;
                    if (savedStarGift != null) {
                        z = savedStarGift.refunded;
                    }
                    wuaVar.p2(tL_starGiftUnique, z, null, null);
                    hl.c3(new ida(wuaVar, tL_starGiftUnique, (byte) 17));
                    return;
                } else if (tL_error != null) {
                    if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                        new dza(wuaVar.getContext(), wuaVar.J0, this.b, 16, null, new ida(wuaVar, charSequence, (byte) 18), 0L).show();
                        return;
                    }
                    wuaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 3:
                a5c a5cVar = (a5c) obj7;
                r47 r47Var = (r47) obj6;
                v11 v11Var = (v11) obj2;
                a5cVar.getClass();
                TLRPC.Message message = r47Var.k;
                message.translatedToLanguage = (String) obj5;
                message.translatedText = r3c.M0((TLRPC.TL_textWithEntities) obj4, (TLRPC.TL_textWithEntities) obj3);
                a5cVar.getMessagesStorage().U1(v11Var.a, r47Var.k);
                a5cVar.M.remove(v11Var);
                hl.d3((na8) obj, Math.max(0L, 400 - (System.currentTimeMillis() - this.b)));
                return;
            default:
                ((WalletEngine2) obj7).lambda$prepareSend$53((byte[]) obj6, (String) obj5, this.b, (byte[]) obj4, (byte[]) obj3, (String) obj2, (kcc) obj);
                return;
        }
    }

    public eh3(wua wuaVar, l01 l01Var, id idVar, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j, CharSequence charSequence) {
        this.a = (byte) 2;
        this.c = wuaVar;
        this.f = l01Var;
        this.d = idVar;
        this.e = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.b = j;
        this.r = charSequence;
    }

    public eh3(a5c a5cVar, r47 r47Var, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, v11 v11Var, na8 na8Var, long j) {
        this.a = (byte) 3;
        this.c = a5cVar;
        this.d = r47Var;
        this.e = str;
        this.f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.n = v11Var;
        this.r = na8Var;
        this.b = j;
    }

    public eh3(Object obj, Object obj2, Object obj3, long j, byte[] bArr, Object obj4, Object obj5, Object obj6, byte b) {
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
