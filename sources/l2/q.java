package l2;

import android.os.Handler;
import android.os.Message;
import e2.d0;
import java.util.TreeMap;
public final class q implements Handler.Callback {
    public final y2.d f12764a;
    public final a4.m f12765b;
    public m2.c f12767f;
    public boolean h;
    public boolean f12768n;
    public boolean f12769r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.o(this);
    public final m3.b f12766c = new m3.b(1);

    public q(m2.c cVar, a4.m mVar, y2.d dVar) {
        this.f12767f = cVar;
        this.f12765b = mVar;
        this.f12764a = dVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f12769r) {
            if (message.what != 1) {
                return false;
            }
            o oVar = (o) message.obj;
            long j3 = oVar.f12759a;
            long j10 = oVar.f12760b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
                return true;
            } else if (l4.longValue() > j3) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j3));
            }
        }
        return true;
    }
}
