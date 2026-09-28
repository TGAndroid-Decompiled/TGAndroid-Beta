package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;
public final class o implements Handler.Callback {
    public final y2.d f14091a;
    public final u f14092b;
    public m2.c f14094f;
    public boolean h;
    public boolean f14095n;
    public boolean f14096r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14093c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f14094f = cVar;
        this.f14092b = uVar;
        this.f14091a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14096r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14086a;
            long j10 = mVar.f14087b;
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
