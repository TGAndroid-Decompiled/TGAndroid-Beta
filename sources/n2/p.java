package n2;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.a0;
import g2.n0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final a0 f20205a;
    public final f f20206b;
    public o2.c f20209f;
    public boolean h;
    public boolean f20210n;
    public boolean f20211r;
    public final TreeMap f20208e = new TreeMap();
    public final Handler d = n0.q(this);
    public final o3.b f20207c = new o3.b(1);

    public p(o2.c cVar, f fVar, a0 a0Var) {
        this.f20209f = cVar;
        this.f20206b = fVar;
        this.f20205a = a0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f20211r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j10 = nVar.f20199a;
            long j11 = nVar.f20200b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f20208e;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            } else if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
