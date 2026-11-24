package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class baa implements zk3 {
    public final taa a;

    public baa(taa taaVar) {
        this.a = taaVar;
    }

    @Override
    public final void a(vf6 vf6Var, ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLObject tLObject = ((al3) arrayList.get(i)).a;
            if ((tLObject instanceof TLRPC.Chat) && !hc2.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        taa taaVar = this.a;
        taaVar.z2 = arrayList;
        for (int i2 = 0; i2 < taaVar.z2.size(); i2++) {
            al3 al3Var = (al3) taaVar.z2.get(i2);
            TLObject tLObject2 = al3Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                na7.q1(taaVar.a).a4((TLRPC.User) al3Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                na7.q1(taaVar.a).T3((TLRPC.Chat) al3Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                na7.q1(taaVar.a).X3((TLRPC.EncryptedChat) al3Var.a, true);
            }
        }
        taaVar.H1.f();
    }
}
