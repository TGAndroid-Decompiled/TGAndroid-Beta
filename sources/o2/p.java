package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f21696a;
    public final f f21697b;
    public p2.c f21700f;
    public boolean h;
    public boolean f21701n;
    public boolean f21702r;
    public final TreeMap f21699e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b f21698c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f21700f = cVar;
        this.f21697b = fVar;
        this.f21696a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f21702r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f21690a;
            long j10 = nVar.f21691b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f21699e;
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
