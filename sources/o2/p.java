package o2;

import android.os.Handler;
import android.os.Message;
import h2.m0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final h6.m f20783a;
    public final f f20784b;
    public p2.c f20787f;
    public boolean h;
    public boolean f20788n;
    public boolean f20789r;
    public final TreeMap f20786e = new TreeMap();
    public final Handler d = m0.q(this);
    public final p3.b f20785c = new p3.b(1);

    public p(p2.c cVar, f fVar, h6.m mVar) {
        this.f20787f = cVar;
        this.f20784b = fVar;
        this.f20783a = mVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f20789r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j3 = nVar.f20777a;
            long j10 = nVar.f20778b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.f20786e;
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
