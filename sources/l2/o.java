package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;
public final class o implements Handler.Callback {
    public final y2.d f14064a;
    public final u f14065b;
    public m2.c f14067f;
    public boolean h;
    public boolean f14068n;
    public boolean f14069r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14066c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f14067f = cVar;
        this.f14065b = uVar;
        this.f14064a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14069r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14059a;
            long j10 = mVar.f14060b;
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
