package l2;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.a0;
import e2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final a0 f11632a;
    public final f f11633b;
    public m2.c f11635f;
    public boolean h;
    public boolean f11636n;
    public boolean f11637r;
    public final TreeMap e = new TreeMap();
    public final Handler d = l0.q(this);
    public final m3.b f11634c = new m3.b(1);

    public p(m2.c cVar, f fVar, a0 a0Var) {
        this.f11635f = cVar;
        this.f11633b = fVar;
        this.f11632a = a0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f11637r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j10 = nVar.f11627a;
            long j11 = nVar.f11628b;
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
