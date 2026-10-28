package l2;

import a8.h0;
import android.os.Handler;
import android.os.Message;
import e2.n0;
import java.util.TreeMap;
public final class o implements Handler.Callback {
    public final h0 f16850a;
    public final a4.l f16851b;
    public m2.c f16853f;
    public boolean h;
    public boolean f16854n;
    public boolean f16855r;
    public final TreeMap e = new TreeMap();
    public final Handler d = n0.q(this);
    public final m3.b f16852c = new m3.b(1);

    public o(m2.c cVar, a4.l lVar, h0 h0Var) {
        this.f16853f = cVar;
        this.f16851b = lVar;
        this.f16850a = h0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f16855r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f16845a;
            long j11 = mVar.f16846b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            } else if (l4.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
