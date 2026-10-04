package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import ii.n4;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final y2.d f15314a;
    public final n4 f15315b;
    public m2.c f15318f;
    public boolean h;
    public boolean f15319n;
    public boolean f15320r;
    public final TreeMap f15317e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15316c = new m3.b(1);

    public p(m2.c cVar, n4 n4Var, y2.d dVar) {
        this.f15318f = cVar;
        this.f15315b = n4Var;
        this.f15314a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15320r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f15308a;
            long j10 = nVar.f15309b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15317e;
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
