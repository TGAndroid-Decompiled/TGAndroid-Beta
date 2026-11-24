package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class q25 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final String c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final jac f;
    public final c h;

    public q25(c cVar, String str, TL_wallet.nftItem nftitem, String str2, jac jacVar) {
        this.h = cVar;
        this.c = str;
        this.d = nftitem;
        this.e = str2;
        this.f = jacVar;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.b;
                String str = this.c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.b = walletEngine2.emulateSendNFT(str, str2, str3, new nv0(this, nftitem, str3, this.f, (byte) 6));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
