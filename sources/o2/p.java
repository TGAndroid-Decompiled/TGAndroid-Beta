package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f21671a;
    public final f f21672b;
    public p2.c f21675f;
    public boolean h;
    public boolean f21676n;
    public boolean f21677r;
    public final TreeMap f21674e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b f21673c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f21675f = cVar;
        this.f21672b = fVar;
        this.f21671a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f21677r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f21665a;
            long j10 = nVar.f21666b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f21674e;
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
