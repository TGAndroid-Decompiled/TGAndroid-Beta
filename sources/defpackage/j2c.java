package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class j2c extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    public static b8c i(TL_wallet.walletTransaction wallettransaction, k2c k2cVar) {
        String a;
        b8c K = b8c.K(j2c.class);
        i2c i2cVar = new i2c(wallettransaction);
        i2cVar.set(wallettransaction);
        i2cVar.id = wallettransaction.id;
        i2cVar.random_id = wallettransaction.random_id;
        i2cVar.gasless = wallettransaction.gasless;
        i2cVar.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        i2cVar.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        i2cVar.nft = wallettransaction.nft;
        K.H = i2cVar;
        K.I = k2cVar;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (walletTransactionPeer == null) {
            a = null;
        } else {
            a = k2cVar.a(walletTransactionPeer.address);
        }
        K.m = a;
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof i2c) {
            wallettransaction3 = ((i2c) wallettransaction).a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof i2c) {
            wallettransaction4 = ((i2c) wallettransaction2).a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !c.w0(wallettransaction, wallettransaction2) && !c.w0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((l2c) view).h((TL_wallet.walletTransaction) b8cVar.H, (k2c) b8cVar.I, z);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b8cVar2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new l2c(i, vnbVar, context);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = b8cVar2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return j((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
