package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bca implements km3 {
    public final tca a;

    public bca(tca tcaVar) {
        this.a = tcaVar;
    }

    @Override
    public final void a(vh6 vh6Var, ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLObject tLObject = ((lm3) arrayList.get(i)).a;
            if ((tLObject instanceof TLRPC.Chat) && !sd2.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        tca tcaVar = this.a;
        tcaVar.z2 = arrayList;
        for (int i2 = 0; i2 < tcaVar.z2.size(); i2++) {
            lm3 lm3Var = (lm3) tcaVar.z2.get(i2);
            TLObject tLObject2 = lm3Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                oc7.r1(tcaVar.a).c4((TLRPC.User) lm3Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                oc7.r1(tcaVar.a).V3((TLRPC.Chat) lm3Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                oc7.r1(tcaVar.a).Z3((TLRPC.EncryptedChat) lm3Var.a, true);
            }
        }
        tcaVar.H1.f();
    }
}
