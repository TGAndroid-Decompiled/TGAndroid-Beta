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
public final class p4 implements Runnable {
    public final int f2001a = 0;
    public final Object f2002b;
    public final Object f2003c;
    public final long d;
    public final Object e;
    public final Object f2004f;
    public final Object h;
    public final Object f2005n;
    public final Object f2006r;

    public p4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f2004f = k7Var;
        this.h = cVar;
        this.f2002b = b2Var;
        this.f2003c = tLObject;
        this.f2005n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f2006r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f2001a) {
            case 0:
                k7.v1((k7) this.f2004f, (pf.c) this.h, (org.telegram.ui.ActionBar.b2) this.f2002b, (TLObject) this.f2003c, (TL_stars.TL_starGiftUnique) this.f2005n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f2006r);
                return;
            case 1:
                cy.m0((cy) this.f2004f, (org.telegram.ui.ActionBar.b2) this.f2002b, (TLObject) this.f2003c, (TLRPC.User) this.h, (TLRPC.Chat) this.f2005n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f2006r);
                return;
            case 2:
                Context context = (Context) this.f2004f;
                ci.k0 k0Var = (ci.k0) this.h;
                byte[] bArr = (byte[]) this.f2002b;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f2006r;
                o21 o21Var = new o21(context, k0Var, this.d, bArr);
                o21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f2003c));
                o21Var.f39746s = new h21((org.telegram.messenger.video.a) this.f2005n, xcVar, context, k0Var, dVar);
                o21Var.show();
                return;
            default:
                ((WalletEngine2) this.f2004f).lambda$prepareSend$50((byte[]) this.h, (String) this.f2002b, this.d, (byte[]) this.f2003c, (byte[]) this.f2005n, (String) this.e, (Utilities.Callback3) this.f2006r);
                return;
        }
    }

    public p4(TLObject tLObject, Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f2003c = tLObject;
        this.f2004f = context;
        this.h = k0Var;
        this.d = j10;
        this.f2002b = bArr;
        this.f2005n = aVar;
        this.e = xcVar;
        this.f2006r = dVar;
    }

    public p4(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f2004f = cyVar;
        this.f2002b = b2Var;
        this.f2003c = tLObject;
        this.h = user;
        this.f2005n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f2006r = tL_messages_checkHistoryImportPeer;
    }

    public p4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f2004f = walletEngine2;
        this.h = bArr;
        this.f2002b = str;
        this.d = j10;
        this.f2003c = bArr2;
        this.f2005n = bArr3;
        this.e = str2;
        this.f2006r = callback3;
    }
}
