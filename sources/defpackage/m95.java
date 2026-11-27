package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m95 extends qie {
    public final ArrayList a;
    public final ArrayList b;
    public final p95 c;

    public m95(p95 p95Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = p95Var;
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
        p95 p95Var = this.c;
        if (i < size && i2 < p95Var.e.size()) {
            return ((wc2) arrayList.get(i)).equals(p95Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = p95Var.e;
        ArrayList arrayList3 = p95Var.e;
        ArrayList arrayList4 = p95Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 >= 0 && size3 < arrayList4.size() && size2 >= 0 && size2 < arrayList5.size()) {
            if (r47.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == r47.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer)) {
                return true;
            }
            return false;
        }
        if (i < arrayList.size()) {
            groupCallParticipant = ((wc2) arrayList.get(i)).a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList5.get(size2);
        }
        if (i2 < arrayList3.size()) {
            groupCallParticipant2 = ((wc2) arrayList3.get(i2)).a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList4.get(size3);
        }
        if (r47.B1(groupCallParticipant.peer) == r47.B1(groupCallParticipant2.peer)) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        p95 p95Var = this.c;
        return p95Var.f.size() + p95Var.e.size();
    }

    @Override
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
