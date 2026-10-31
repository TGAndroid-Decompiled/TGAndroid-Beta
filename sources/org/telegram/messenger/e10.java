package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c01;
import org.telegram.ui.jp0;
import org.telegram.ui.wz0;
public final class e10 implements Runnable {
    public final int f15348a;
    public final long f15349b;
    public final Object f15350c;
    public final Object d;
    public final Object e;
    public final Object f15351f;
    public final Object h;
    public final Object f15352n;
    public final Object f15353r;

    public e10(Object obj, Object obj2, Object obj3, long j10, byte[] bArr, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15348a = i10;
        this.f15350c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15349b = j10;
        this.f15351f = bArr;
        this.h = obj4;
        this.f15352n = obj5;
        this.f15353r = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15348a) {
            case 0:
                t10 t10Var = (t10) this.f15350c;
                jj jjVar = (jj) this.d;
                c3.s sVar = (c3.s) this.f15352n;
                t10Var.getClass();
                TLRPC.Message message = jjVar.f16337k;
                message.translatedToLanguage = (String) this.e;
                message.translatedText = m31.P0((TLRPC.TL_textWithEntities) this.f15351f, (TLRPC.TL_textWithEntities) this.h);
                t10Var.getMessagesStorage().X1(sVar.f3687a, jjVar.f16337k);
                t10Var.L.remove(sVar);
                i0.h3((jp0) this.f15353r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f15349b)));
                return;
            case 1:
                org.telegram.ui.ay.o0((org.telegram.ui.ay) this.f15350c, (org.telegram.ui.ActionBar.x1) this.d, (TLObject) this.e, (TLRPC.User) this.f15351f, (TLRPC.Chat) this.h, this.f15349b, (TLRPC.TL_error) this.f15352n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f15353r);
                return;
            case 2:
                Context context = (Context) this.d;
                ro0 ro0Var = (ro0) this.e;
                byte[] bArr = (byte[]) this.f15351f;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f15352n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f15353r;
                c01 c01Var = new c01(context, ro0Var, this.f15349b, bArr);
                c01Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f15350c));
                c01Var.f36359r1 = new wz0((org.telegram.messenger.video.a) this.h, ccVar, context, ro0Var, dVar);
                c01Var.show();
                return;
            case 3:
                ((WalletEngine2) this.f15350c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.f15349b, (byte[]) this.f15351f, (byte[]) this.h, (String) this.f15352n, (l20) this.f15353r);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f15350c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15352n;
                CharSequence charSequence = (CharSequence) this.f15353r;
                boolean z10 = false;
                ((gf.e) this.d).c(false);
                ((org.telegram.ui.ActionBar.x1) this.e).dismiss();
                if (((TLObject) this.f15351f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i10 = 0;
                    while (i10 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    TL_stars.SavedStarGift savedStarGift = e4Var.f46838x2;
                    if (savedStarGift != null) {
                        z10 = savedStarGift.refunded;
                    }
                    e4Var.k2(tL_starGiftUnique, z10, null, null);
                    i0.g3(new rh.o(9, e4Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new rh.x7(e4Var.getContext(), e4Var.I0, this.f15349b, 16, null, new rh.o(10, e4Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    e4Var.k().f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public e10(t10 t10Var, jj jjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, c3.s sVar, jp0 jp0Var, long j10) {
        this.f15348a = 0;
        this.f15350c = t10Var;
        this.d = jjVar;
        this.e = str;
        this.f15351f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f15352n = sVar;
        this.f15353r = jp0Var;
        this.f15349b = j10;
    }

    public e10(org.telegram.ui.ay ayVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f15348a = 1;
        this.f15350c = ayVar;
        this.d = x1Var;
        this.e = tLObject;
        this.f15351f = user;
        this.h = chat;
        this.f15349b = j10;
        this.f15352n = tL_error;
        this.f15353r = tL_messages_checkHistoryImportPeer;
    }

    public e10(rh.e4 e4Var, gf.e eVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f15348a = 4;
        this.f15350c = e4Var;
        this.d = eVar;
        this.e = x1Var;
        this.f15351f = tLObject;
        this.h = tL_starGiftUnique;
        this.f15352n = tL_error;
        this.f15349b = j10;
        this.f15353r = charSequence;
    }
}
