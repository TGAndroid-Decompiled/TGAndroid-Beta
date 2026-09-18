package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;
public final class o implements Handler.Callback {
    public final y2.d f14025a;
    public final u f14026b;
    public m2.c f14028f;
    public boolean h;
    public boolean f14029n;
    public boolean f14030r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14027c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f14028f = cVar;
        this.f14026b = uVar;
        this.f14025a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14030r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14020a;
            long j10 = mVar.f14021b;
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
