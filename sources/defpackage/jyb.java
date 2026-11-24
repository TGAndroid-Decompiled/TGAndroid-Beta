package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class jyb extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    public static c4c i(TL_wallet.walletTransaction wallettransaction, kyb kybVar) {
        String a;
        c4c K = c4c.K(jyb.class);
        iyb iybVar = new iyb(wallettransaction);
        iybVar.set(wallettransaction);
        iybVar.id = wallettransaction.id;
        iybVar.random_id = wallettransaction.random_id;
        iybVar.gasless = wallettransaction.gasless;
        iybVar.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        iybVar.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        iybVar.nft = wallettransaction.nft;
        K.H = iybVar;
        K.I = kybVar;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (walletTransactionPeer == null) {
            a = null;
        } else {
            a = kybVar.a(walletTransactionPeer.address);
        }
        K.m = a;
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3;
        TL_wallet.walletTransaction wallettransaction4;
        if (wallettransaction instanceof iyb) {
            wallettransaction3 = ((iyb) wallettransaction).a;
        } else {
            wallettransaction3 = wallettransaction;
        }
        if (wallettransaction2 instanceof iyb) {
            wallettransaction4 = ((iyb) wallettransaction2).a;
        } else {
            wallettransaction4 = wallettransaction2;
        }
        if (wallettransaction3 != wallettransaction4 && !c.t0(wallettransaction, wallettransaction2) && !c.t0(wallettransaction3, wallettransaction4)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((lyb) view).h((TL_wallet.walletTransaction) c4cVar.H, (kyb) c4cVar.I, z);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        Object obj = c4cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = c4cVar2.H;
            if (obj2 instanceof TL_wallet.walletTransaction) {
                return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
            }
            return false;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new lyb(i, wjbVar, context);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        Object obj = c4cVar.H;
        if (obj instanceof TL_wallet.walletTransaction) {
            Object obj2 = c4cVar2.H;
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
