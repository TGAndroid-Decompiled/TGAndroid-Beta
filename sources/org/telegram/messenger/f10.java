package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.b01;
import org.telegram.ui.hp0;
import org.telegram.ui.vz0;
public final class f10 implements Runnable {
    public final int f15676a;
    public final long f15677b;
    public final Object f15678c;
    public final Object d;
    public final Object e;
    public final Object f15679f;
    public final Object h;
    public final Object f15680n;
    public final Object f15681r;

    public f10(Object obj, Object obj2, Object obj3, long j10, byte[] bArr, Object obj4, Object obj5, Object obj6, int i10) {
        this.f15676a = i10;
        this.f15678c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15677b = j10;
        this.f15679f = bArr;
        this.h = obj4;
        this.f15680n = obj5;
        this.f15681r = obj6;
    }

    @Override
    public final void run() {
        switch (this.f15676a) {
            case 0:
                u10 u10Var = (u10) this.f15678c;
                kj kjVar = (kj) this.d;
                c3.s sVar = (c3.s) this.f15680n;
                u10Var.getClass();
                TLRPC.Message message = kjVar.f16690k;
                message.translatedToLanguage = (String) this.e;
                message.translatedText = n31.P0((TLRPC.TL_textWithEntities) this.f15679f, (TLRPC.TL_textWithEntities) this.h);
                u10Var.getMessagesStorage().X1(sVar.f3687a, kjVar.f16690k);
                u10Var.L.remove(sVar);
                i0.h3((hp0) this.f15681r, Math.max(0L, 400 - (System.currentTimeMillis() - this.f15677b)));
                return;
            case 1:
                org.telegram.ui.zx.p0((org.telegram.ui.zx) this.f15678c, (org.telegram.ui.ActionBar.x1) this.d, (TLObject) this.e, (TLRPC.User) this.f15679f, (TLRPC.Chat) this.h, this.f15677b, (TLRPC.TL_error) this.f15680n, (TLRPC.TL_messages_checkHistoryImportPeer) this.f15681r);
                return;
            case 2:
                Context context = (Context) this.d;
                so0 so0Var = (so0) this.e;
                byte[] bArr = (byte[]) this.f15679f;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f15680n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f15681r;
                b01 b01Var = new b01(context, so0Var, this.f15677b, bArr);
                b01Var.N0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f15678c));
                b01Var.f35894r1 = new vz0((org.telegram.messenger.video.a) this.h, ccVar, context, so0Var, dVar);
                b01Var.show();
                return;
            case 3:
                ((WalletEngine2) this.f15678c).lambda$prepareSend$50((byte[]) this.d, (String) this.e, this.f15677b, (byte[]) this.f15679f, (byte[]) this.h, (String) this.f15680n, (m20) this.f15681r);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f15678c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15680n;
                CharSequence charSequence = (CharSequence) this.f15681r;
                boolean z10 = false;
                ((gf.e) this.d).c(false);
                ((org.telegram.ui.ActionBar.x1) this.e).dismiss();
                if (((TLObject) this.f15679f) instanceof TLRPC.TL_payments_paymentResult) {
                    int i10 = 0;
                    while (i10 < tL_starGiftUnique.attributes.size()) {
                        if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                            tL_starGiftUnique.attributes.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    TL_stars.SavedStarGift savedStarGift = e4Var.f46852x2;
                    if (savedStarGift != null) {
                        z10 = savedStarGift.refunded;
                    }
                    e4Var.k2(tL_starGiftUnique, z10, null, null);
                    i0.g3(new rh.n(10, e4Var, tL_starGiftUnique));
                    return;
                } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    new rh.x7(e4Var.getContext(), e4Var.I0, this.f15677b, 16, null, new rh.n(11, e4Var, charSequence), 0L).show();
                    return;
                } else if (tL_error != null) {
                    e4Var.k().f0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public f10(u10 u10Var, kj kjVar, String str, TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2, c3.s sVar, hp0 hp0Var, long j10) {
        this.f15676a = 0;
        this.f15678c = u10Var;
        this.d = kjVar;
        this.e = str;
        this.f15679f = tL_textWithEntities;
        this.h = tL_textWithEntities2;
        this.f15680n = sVar;
        this.f15681r = hp0Var;
        this.f15677b = j10;
    }

    public f10(org.telegram.ui.zx zxVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f15676a = 1;
        this.f15678c = zxVar;
        this.d = x1Var;
        this.e = tLObject;
        this.f15679f = user;
        this.h = chat;
        this.f15677b = j10;
        this.f15680n = tL_error;
        this.f15681r = tL_messages_checkHistoryImportPeer;
    }

    public f10(rh.e4 e4Var, gf.e eVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f15676a = 4;
        this.f15678c = e4Var;
        this.d = eVar;
        this.e = x1Var;
        this.f15679f = tLObject;
        this.h = tL_starGiftUnique;
        this.f15680n = tL_error;
        this.f15677b = j10;
        this.f15681r = charSequence;
    }
}
