package ai;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ey;
import org.telegram.ui.j21;
import org.telegram.ui.q21;
public final class p4 implements Runnable {
    public final int f2002a = 0;
    public final Object f2003b;
    public final Object f2004c;
    public final long d;
    public final Object e;
    public final Object f2005f;
    public final Object h;
    public final Object f2006n;
    public final Object f2007r;

    public p4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f2005f = k7Var;
        this.h = cVar;
        this.f2003b = b2Var;
        this.f2004c = tLObject;
        this.f2006n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f2007r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f2002a) {
            case 0:
                k7.s1((k7) this.f2005f, (pf.c) this.h, (org.telegram.ui.ActionBar.b2) this.f2003b, (TLObject) this.f2004c, (TL_stars.TL_starGiftUnique) this.f2006n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f2007r);
                return;
            case 1:
                ey.m0((ey) this.f2005f, (org.telegram.ui.ActionBar.b2) this.f2003b, (TLObject) this.f2004c, (TLRPC.User) this.h, (TLRPC.Chat) this.f2006n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f2007r);
                return;
            case 2:
                Context context = (Context) this.f2005f;
                ci.k0 k0Var = (ci.k0) this.h;
                byte[] bArr = (byte[]) this.f2003b;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f2007r;
                q21 q21Var = new q21(context, k0Var, this.d, bArr);
                q21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f2004c));
                q21Var.f40307s = new j21((org.telegram.messenger.video.a) this.f2006n, xcVar, context, k0Var, dVar);
                q21Var.show();
                return;
            default:
                ((WalletEngine2) this.f2005f).lambda$prepareSend$50((byte[]) this.h, (String) this.f2003b, this.d, (byte[]) this.f2004c, (byte[]) this.f2006n, (String) this.e, (Utilities.Callback3) this.f2007r);
                return;
        }
    }

    public p4(TLObject tLObject, Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f2004c = tLObject;
        this.f2005f = context;
        this.h = k0Var;
        this.d = j10;
        this.f2003b = bArr;
        this.f2006n = aVar;
        this.e = xcVar;
        this.f2007r = dVar;
    }

    public p4(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f2005f = eyVar;
        this.f2003b = b2Var;
        this.f2004c = tLObject;
        this.h = user;
        this.f2006n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f2007r = tL_messages_checkHistoryImportPeer;
    }

    public p4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f2005f = walletEngine2;
        this.h = bArr;
        this.f2003b = str;
        this.d = j10;
        this.f2004c = bArr2;
        this.f2006n = bArr3;
        this.e = str2;
        this.f2007r = callback3;
    }
}
