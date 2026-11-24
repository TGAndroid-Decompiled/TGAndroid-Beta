package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j95 extends age {
    public final ArrayList a;
    public final ArrayList b;
    public final m95 c;

    public j95(m95 m95Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = m95Var;
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
        m95 m95Var = this.c;
        if (i < size && i2 < m95Var.e.size()) {
            return ((rd2) arrayList.get(i)).equals(m95Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = m95Var.e;
        ArrayList arrayList3 = m95Var.e;
        ArrayList arrayList4 = m95Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 >= 0 && size3 < arrayList4.size() && size2 >= 0 && size2 < arrayList5.size()) {
            if (k47.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k47.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer)) {
                return true;
            }
            return false;
        }
        if (i < arrayList.size()) {
            groupCallParticipant = ((rd2) arrayList.get(i)).a;
        } else {
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList5.get(size2);
        }
        if (i2 < arrayList3.size()) {
            groupCallParticipant2 = ((rd2) arrayList3.get(i2)).a;
        } else {
            groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList4.get(size3);
        }
        if (k47.B1(groupCallParticipant.peer) == k47.B1(groupCallParticipant2.peer)) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        m95 m95Var = this.c;
        return m95Var.f.size() + m95Var.e.size();
    }

    @Override
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
