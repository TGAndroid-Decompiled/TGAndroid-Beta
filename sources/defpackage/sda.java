package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sda implements rl3 {
    public final kea a;

    public sda(kea keaVar) {
        this.a = keaVar;
    }

    @Override
    public final void a(zh6 zh6Var, ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLObject tLObject = ((sl3) arrayList.get(i)).a;
            if ((tLObject instanceof TLRPC.Chat) && !xc2.B((TLRPC.Chat) tLObject)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        kea keaVar = this.a;
        keaVar.z2 = arrayList;
        for (int i2 = 0; i2 < keaVar.z2.size(); i2++) {
            sl3 sl3Var = (sl3) keaVar.z2.get(i2);
            TLObject tLObject2 = sl3Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                uc7.s1(keaVar.a).i4((TLRPC.User) sl3Var.a, true, false);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                uc7.s1(keaVar.a).a4((TLRPC.Chat) sl3Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                uc7.s1(keaVar.a).f4((TLRPC.EncryptedChat) sl3Var.a, true);
            }
        }
        keaVar.H1.f();
    }
}
