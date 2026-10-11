package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final y2.d f15382a;
    public final f f15383b;
    public m2.c f15386f;
    public boolean h;
    public boolean f15387n;
    public boolean f15388r;
    public final TreeMap f15385e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15384c = new m3.b(1);

    public p(m2.c cVar, f fVar, y2.d dVar) {
        this.f15386f = cVar;
        this.f15383b = fVar;
        this.f15382a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15388r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f15376a;
            long j10 = nVar.f15377b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15385e;
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
