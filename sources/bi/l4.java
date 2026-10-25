package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cy;
import org.telegram.ui.o21;
import org.telegram.ui.v21;
public final class l4 implements Runnable {
    public final int f5016a = 0;
    public final Object f5017b;
    public final Object f5018c;
    public final long d;
    public final Object e;
    public final Object f5019f;
    public final Object h;
    public final Object f5020n;
    public final Object f5021r;

    public l4(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f5019f = h7Var;
        this.h = cVar;
        this.f5017b = e2Var;
        this.f5018c = tLObject;
        this.f5020n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.f5021r = charSequence;
    }

    @Override
    public final void run() {
        switch (this.f5016a) {
            case 0:
                h7.u1((h7) this.f5019f, (qf.c) this.h, (org.telegram.ui.ActionBar.e2) this.f5017b, (TLObject) this.f5018c, (TL_stars.TL_starGiftUnique) this.f5020n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.f5021r);
                return;
            case 1:
                cy.l0((cy) this.f5019f, (org.telegram.ui.ActionBar.e2) this.f5017b, (TLObject) this.f5018c, (TLRPC.User) this.h, (TLRPC.Chat) this.f5020n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.f5021r);
                return;
            case 2:
                Context context = (Context) this.f5019f;
                di.k0 k0Var = (di.k0) this.h;
                byte[] bArr = (byte[]) this.f5017b;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f5021r;
                v21 v21Var = new v21(context, k0Var, this.d, bArr);
                v21Var.R((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f5018c));
                v21Var.v = new o21((org.telegram.messenger.video.a) this.f5020n, wcVar, context, k0Var, dVar);
                v21Var.show();
                return;
            default:
                ((WalletEngine2) this.f5019f).lambda$prepareSend$50((byte[]) this.h, (String) this.f5017b, this.d, (byte[]) this.f5018c, (byte[]) this.f5020n, (String) this.e, (Utilities.Callback3) this.f5021r);
                return;
        }
    }

    public l4(TLObject tLObject, Context context, di.k0 k0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, org.telegram.messenger.video.d dVar) {
        this.f5018c = tLObject;
        this.f5019f = context;
        this.h = k0Var;
        this.d = j10;
        this.f5017b = bArr;
        this.f5020n = aVar;
        this.e = wcVar;
        this.f5021r = dVar;
    }

    public l4(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f5019f = cyVar;
        this.f5017b = e2Var;
        this.f5018c = tLObject;
        this.h = user;
        this.f5020n = chat;
        this.d = j10;
        this.e = tL_error;
        this.f5021r = tL_messages_checkHistoryImportPeer;
    }

    public l4(WalletEngine2 walletEngine2, byte[] bArr, String str, long j10, byte[] bArr2, byte[] bArr3, String str2, Utilities.Callback3 callback3) {
        this.f5019f = walletEngine2;
        this.h = bArr;
        this.f5017b = str;
        this.d = j10;
        this.f5018c = bArr2;
        this.f5020n = bArr3;
        this.e = str2;
        this.f5021r = callback3;
    }
}
