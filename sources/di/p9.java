package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p9 implements Utilities.Callback {
    public final int f7835a;
    public final ba f7836b;

    public p9(ba baVar, int i10) {
        this.f7835a = i10;
        this.f7836b = baVar;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f7835a) {
            case 0:
                ba baVar = this.f7836b;
                ia iaVar = baVar.W;
                iaVar.f7392c = (TLRPC.InputPeer) obj;
                HashSet hashSet = iaVar.v;
                hashSet.clear();
                if (iaVar.K && iaVar.G) {
                    iaVar.G = false;
                }
                Utilities.Callback callback = iaVar.W;
                if (callback != null) {
                    callback.run(iaVar.f7392c);
                }
                la laVar = iaVar.X;
                if (laVar != null) {
                    laVar.run(new HashSet(hashSet));
                }
                baVar.g(true);
                return;
            case 1:
                ia iaVar2 = this.f7836b.W;
                i10 = ((org.telegram.ui.ActionBar.f3) iaVar2).currentAccount;
                iaVar2.g1(new ga(5, i10, (ArrayList) obj), new bi.b5(iaVar2, 1), false);
                return;
            case 2:
                ba baVar2 = this.f7836b;
                ia iaVar3 = baVar2.W;
                HashSet hashSet2 = iaVar3.v;
                hashSet2.add(Integer.valueOf(((bi.m8) obj).f3321a));
                baVar2.g(true);
                la laVar2 = iaVar3.X;
                if (laVar2 != null) {
                    laVar2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                ba baVar3 = this.f7836b;
                if (str != null) {
                    baVar3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                baVar3.I = str;
                baVar3.g(false);
                return;
        }
    }
}
