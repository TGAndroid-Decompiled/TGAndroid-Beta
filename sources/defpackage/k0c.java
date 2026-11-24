package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class k0c extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    public static c6c i(TL_wallet.walletTransaction wallettransaction, l0c l0cVar) {
        String a;
        c6c K = c6c.K(k0c.class);
        j0c j0cVar = new j0c(wallettransaction);
        j0cVar.set(wallettransaction);
        j0cVar.id = wallettransaction.id;
        j0cVar.random_id = wallettransaction.random_id;
        j0cVar.gasless = wallettransaction.gasless;
        j0cVar.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        j0cVar.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        j0cVar.nft = wallettransaction.nft;
        K.H = j0cVar;
        K.I = l0cVar;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (walletTransactionPeer == null) {
            a = null;
        } else {
            a = l0cVar.a(walletTransactionPeer.address);
        }
        K.m = a;
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof j0c) {
            wallettransaction3 = ((j0c) wallettransaction).a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof j0c) {
            wallettransaction4 = ((j0c) wallettransaction2).a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !c.t0(wallettransaction, wallettransaction2) && !c.t0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((m0c) view).h((TL_wallet.walletTransaction) c6cVar.H, (l0c) c6cVar.I, z);
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        Object obj = c6cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = c6cVar2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new m0c(i, ylbVar, context);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        Object obj = c6cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = c6cVar2.H;
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
