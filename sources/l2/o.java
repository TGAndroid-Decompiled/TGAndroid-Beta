package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;
public final class o implements Handler.Callback {
    public final y2.d f14075a;
    public final u f14076b;
    public m2.c f14078f;
    public boolean h;
    public boolean f14079n;
    public boolean f14080r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14077c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f14078f = cVar;
        this.f14076b = uVar;
        this.f14075a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14080r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14070a;
            long j10 = mVar.f14071b;
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
