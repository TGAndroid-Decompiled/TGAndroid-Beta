package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
public final class o implements Handler.Callback {
    public final y2.d f13854a;
    public final ka.c f13855b;
    public m2.c f13857f;
    public boolean h;
    public boolean f13858n;
    public boolean f13859r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f13856c = new m3.b(1);

    public o(m2.c cVar, ka.c cVar2, y2.d dVar) {
        this.f13857f = cVar;
        this.f13855b = cVar2;
        this.f13854a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f13859r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f13849a;
            long j10 = mVar.f13850b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.e;
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
