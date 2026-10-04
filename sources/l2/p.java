package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import ii.n4;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final y2.d f15315a;
    public final n4 f15316b;
    public m2.c f15319f;
    public boolean h;
    public boolean f15320n;
    public boolean f15321r;
    public final TreeMap f15318e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15317c = new m3.b(1);

    public p(m2.c cVar, n4 n4Var, y2.d dVar) {
        this.f15319f = cVar;
        this.f15316b = n4Var;
        this.f15315a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15321r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f15309a;
            long j10 = nVar.f15310b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15318e;
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
