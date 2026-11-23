package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f21665a;
    public final f f21666b;
    public p2.c f21669f;
    public boolean h;
    public boolean f21670n;
    public boolean f21671r;
    public final TreeMap f21668e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b f21667c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f21669f = cVar;
        this.f21666b = fVar;
        this.f21665a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f21671r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f21659a;
            long j10 = nVar.f21660b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f21668e;
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
