package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final y2.d f15383a;
    public final f f15384b;
    public m2.c f15387f;
    public boolean h;
    public boolean f15388n;
    public boolean f15389r;
    public final TreeMap f15386e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f15385c = new m3.b(1);

    public p(m2.c cVar, f fVar, y2.d dVar) {
        this.f15387f = cVar;
        this.f15384b = fVar;
        this.f15383a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15389r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f15377a;
            long j10 = nVar.f15378b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f15386e;
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
