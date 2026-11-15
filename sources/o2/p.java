package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f21307a;
    public final f f21308b;
    public p2.c f21311f;
    public boolean h;
    public boolean f21312n;
    public boolean f21313r;
    public final TreeMap f21310e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b f21309c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f21311f = cVar;
        this.f21308b = fVar;
        this.f21307a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f21313r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f21301a;
            long j10 = nVar.f21302b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f21310e;
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
