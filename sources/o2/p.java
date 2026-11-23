package o2;

import android.os.Handler;
import android.os.Message;
import h2.l0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f21764a;
    public final f f21765b;
    public p2.c f21768f;
    public boolean h;
    public boolean f21769n;
    public boolean f21770r;
    public final TreeMap f21767e = new TreeMap();
    public final Handler d = l0.q(this);
    public final p3.b f21766c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f21768f = cVar;
        this.f21765b = fVar;
        this.f21764a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f21770r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f21758a;
            long j10 = nVar.f21759b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f21767e;
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
