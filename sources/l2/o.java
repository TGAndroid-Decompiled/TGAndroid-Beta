package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import ji.u4;
public final class o implements Handler.Callback {
    public final y2.d f15278a;
    public final u4 f15279b;
    public m2.c f15282f;
    public boolean h;
    public boolean f15283n;
    public boolean f15284r;
    public final TreeMap f15281e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15280c = new m3.b(1);

    public o(m2.c cVar, u4 u4Var, y2.d dVar) {
        this.f15282f = cVar;
        this.f15279b = u4Var;
        this.f15278a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15284r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f15272a;
            long j10 = mVar.f15273b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15281e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
                return true;
            } else if (l4.longValue() > j3) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
            }
        }
        return true;
    }
}
