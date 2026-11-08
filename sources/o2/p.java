package o2;

import android.os.Handler;
import android.os.Message;
import h2.m0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f20786a;
    public final f f20787b;
    public p2.c f20790f;
    public boolean h;
    public boolean f20791n;
    public boolean f20792r;
    public final TreeMap f20789e = new TreeMap();
    public final Handler d = m0.q(this);
    public final p3.b f20788c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f20790f = cVar;
        this.f20787b = fVar;
        this.f20786a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f20792r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f20780a;
            long j10 = nVar.f20781b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f20789e;
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
