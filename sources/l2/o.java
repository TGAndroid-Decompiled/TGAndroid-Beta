package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
import ki.e0;
public final class o implements Handler.Callback {
    public final y2.d f14078a;
    public final e0 f14079b;
    public m2.c f14081f;
    public boolean h;
    public boolean f14082n;
    public boolean f14083r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f14080c = new m3.b(1);

    public o(m2.c cVar, e0 e0Var, y2.d dVar) {
        this.f14081f = cVar;
        this.f14079b = e0Var;
        this.f14078a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14083r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j3 = mVar.f14073a;
            long j10 = mVar.f14074b;
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
