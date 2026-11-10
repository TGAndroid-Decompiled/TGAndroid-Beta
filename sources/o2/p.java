package o2;

import android.os.Handler;
import android.os.Message;
import h2.m0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f20791a;
    public final f f20792b;
    public p2.c f20795f;
    public boolean h;
    public boolean f20796n;
    public boolean f20797r;
    public final TreeMap f20794e = new TreeMap();
    public final Handler d = m0.q(this);
    public final p3.b f20793c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f20795f = cVar;
        this.f20792b = fVar;
        this.f20791a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f20797r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f20785a;
            long j10 = nVar.f20786b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f20794e;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
                return true;
            } else if (l10.longValue() > j3) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
            }
        }
        return true;
    }
}
