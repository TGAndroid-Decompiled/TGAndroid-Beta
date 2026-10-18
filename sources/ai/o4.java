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
public final class o4 implements Runnable {
    public final int f1933a = 0;
    public final Object f1934b;
    public final Object f1935c;
    public final long d;
    public final Object e;
    public final Object f1936f;
    public final Object h;
    public final Object f1937n;
    public final Object f1938r;

    public o4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f1936f = k7Var;
        this.h = cVar;
        this.f1934b = b2Var;
        this.f1935c = tLObject;
        this.f1937n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f1938r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f1933a) {
            case 0:
                k7.s1((k7) this.f1936f, (pf.c) this.h, (org.telegram.ui.ActionBar.b2) this.f1934b, (TLObject) this.f1935c, (TL_stars.TL_starGiftUnique) this.f1937n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f1938r);
                return;
            case 1:
                ey.m0((ey) this.f1936f, (org.telegram.ui.ActionBar.b2) this.f1934b, (TLObject) this.f1935c, (TLRPC.User) this.h, (TLRPC.Chat) this.f1937n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1938r);
                return;
            case 2:
                Context context = (Context) this.f1936f;
                ci.k0 k0Var = (ci.k0) this.h;
                byte[] bArr = (byte[]) this.f1934b;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f1938r;
                q21 q21Var = new q21(context, k0Var, this.d, bArr);
                q21Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f1935c));
                q21Var.f40265s = new j21((org.telegram.messenger.video.a) this.f1937n, xcVar, context, k0Var, dVar);
                q21Var.show();
                return;
            default:
                ((WalletEngine2) this.f1936f).lambda$prepareSend$50((byte[]) this.h, (String) this.f1934b, this.d, (byte[]) this.f1935c, (byte[]) this.f1937n, (String) this.e, (Utilities.Callback3) this.f1938r);
                return;
        }
    }

    public o4(TLObject tLObject, Context context, ci.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, org.telegram.messenger.video.d dVar) {
        this.f1935c = tLObject;
        this.f1936f = context;
        this.h = k0Var;
        this.d = j10;
        this.f1934b = bArr;
        this.f1937n = aVar;
        this.e = xcVar;
        this.f1938r = dVar;
    }

    public o4(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f1936f = eyVar;
        this.f1934b = b2Var;
        this.f1935c = tLObject;
        this.h = user;
        this.f1937n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f1938r = tL_messages_checkHistoryImportPeer;
    }

    public o4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f1936f = walletEngine2;
        this.h = bArr;
        this.f1934b = str;
        this.d = j10;
        this.f1935c = bArr2;
        this.f1937n = bArr3;
        this.e = str2;
        this.f1938r = callback3;
    }
}
