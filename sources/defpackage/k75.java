package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k75 extends zde {
    public final ArrayList a;
    public final ArrayList b;
    public final n75 c;

    public k75(n75 n75Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = n75Var;
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override
    public final boolean a(int i, int i2) {
        return true;
    }

    @Override
    public final boolean b(int i, int i2) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        n75 n75Var = this.c;
        if (i < size && i2 < n75Var.e.size()) {
            return ((gc2) arrayList.get(i)).equals(n75Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = n75Var.e;
        ArrayList arrayList3 = n75Var.e;
        ArrayList arrayList4 = n75Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 >= 0 && size3 < arrayList4.size() && size2 >= 0 && size2 < arrayList5.size()) {
            if (k27.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k27.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer)) {
                return true;
            }
            return false;
        }
        if (i < arrayList.size()) {
            groupCallParticipant = ((gc2) arrayList.get(i)).a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList5.get(size2);
        }
        if (i2 < arrayList3.size()) {
            groupCallParticipant2 = ((gc2) arrayList3.get(i2)).a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList4.get(size3);
        }
        if (k27.B1(groupCallParticipant.peer) == k27.B1(groupCallParticipant2.peer)) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        n75 n75Var = this.c;
        return n75Var.f.size() + n75Var.e.size();
    }

    @Override
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
