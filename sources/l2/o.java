package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import k2.u;
public final class o implements Handler.Callback {
    public final y2.d f14090a;
    public final u f14091b;
    public m2.c f14093f;
    public boolean h;
    public boolean f14094n;
    public boolean f14095r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14092c = new m3.b(1);

    public o(m2.c cVar, u uVar, y2.d dVar) {
        this.f14093f = cVar;
        this.f14091b = uVar;
        this.f14090a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14095r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14085a;
            long j10 = mVar.f14086b;
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
