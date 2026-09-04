package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import ji.u4;
public final class o implements Handler.Callback {
    public final y2.d f15252a;
    public final u4 f15253b;
    public m2.c f15256f;
    public boolean h;
    public boolean f15257n;
    public boolean f15258r;
    public final TreeMap f15255e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15254c = new m3.b(1);

    public o(m2.c cVar, u4 u4Var, y2.d dVar) {
        this.f15256f = cVar;
        this.f15253b = u4Var;
        this.f15252a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15258r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f15246a;
            long j10 = mVar.f15247b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15255e;
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
