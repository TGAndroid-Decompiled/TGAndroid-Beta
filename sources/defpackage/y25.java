package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.a;
import org.telegram.ui.Wallet.c;
public final class y25 implements icc {
    public final byte a;
    public final a b;

    public y25(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "NULL_ERROR";
        a aVar = this.b;
        switch (b) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str2 = (String) obj2;
                c cVar = aVar.d;
                if (importedWalletProof == null) {
                    if (str2 != null) {
                        str = str2;
                    }
                    c.m("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = aVar.c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(cVar.a).sendRequestTyped(disablebackup, new ic((byte) 0), new y25(aVar, (byte) 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                ?? r5 = (TLRPC.TL_error) obj2;
                c cVar2 = aVar.d;
                if (walletState == null) {
                    StringBuilder sb = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (r5 != 0) {
                        str = r5;
                    }
                    sb.append((Object) str);
                    c.m(sb.toString());
                    return;
                }
                cVar2.z0(walletState);
                cVar2.Z();
                hl.d3(new jm3((byte) 10), 1000L);
                return;
        }
    }
}
