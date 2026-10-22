package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cy;
import org.telegram.ui.h21;
import org.telegram.ui.o21;
public final class q4 implements Runnable {
    public final int f2052a = 0;
    public final Object f2053b;
    public final Object f2054c;
    public final long d;
    public final Object e;
    public final Object f2055f;
    public final Object h;
    public final Object f2056n;
    public final Object f2057r;

    public q4(l7 l7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f2055f = l7Var;
        this.h = cVar;
        this.f2053b = b2Var;
        this.f2054c = tLObject;
        this.f2056n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f2057r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f2052a) {
            case 0:
                l7.v1((l7) this.f2055f, (pf.c) this.h, (org.telegram.ui.ActionBar.b2) this.f2053b, (TLObject) this.f2054c, (TL_stars.TL_starGiftUnique) this.f2056n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f2057r);
                return;
            case 1:
                cy.m0((cy) this.f2055f, (org.telegram.ui.ActionBar.b2) this.f2053b, (TLObject) this.f2054c, (TLRPC.User) this.h, (TLRPC.Chat) this.f2056n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f2057r);
                return;
            case 2:
                Context context = (Context) this.f2055f;
                ci.k0 k0Var = (ci.k0) this.h;
                byte[] bArr = (byte[]) this.f2053b;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f2057r;
                o21 o21Var = new o21(context, k0Var, this.d, bArr);
                o21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f2054c));
                o21Var.f39754s = new h21((org.telegram.messenger.video.a) this.f2056n, xcVar, context, k0Var, dVar);
                o21Var.show();
                return;
            default:
                ((WalletEngine2) this.f2055f).lambda$prepareSend$50((byte[]) this.h, (String) this.f2053b, this.d, (byte[]) this.f2054c, (byte[]) this.f2056n, (String) this.e, (Utilities.Callback3) this.f2057r);
                return;
        }
    }

    public q4(TLObject tLObject, Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f2054c = tLObject;
        this.f2055f = context;
        this.h = k0Var;
        this.d = j10;
        this.f2053b = bArr;
        this.f2056n = aVar;
        this.e = xcVar;
        this.f2057r = dVar;
    }

    public q4(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f2055f = cyVar;
        this.f2053b = b2Var;
        this.f2054c = tLObject;
        this.h = user;
        this.f2056n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f2057r = tL_messages_checkHistoryImportPeer;
    }

    public q4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f2055f = walletEngine2;
        this.h = bArr;
        this.f2053b = str;
        this.d = j10;
        this.f2054c = bArr2;
        this.f2056n = bArr3;
        this.e = str2;
        this.f2057r = callback3;
    }
}
