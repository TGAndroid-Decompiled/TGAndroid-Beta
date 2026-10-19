package l2;

import android.os.Handler;
import android.os.Message;
import e2.m0;
import java.util.TreeMap;
public final class p implements Handler.Callback {
    public final androidx.biometric.e f15887a;
    public final f f15888b;
    public m2.c f15890f;
    public boolean h;
    public boolean f15891n;
    public boolean f15892r;
    public final TreeMap e = new TreeMap();
    public final Handler d = m0.q(this);
    public final m3.b f15889c = new m3.b(1);

    public p(m2.c cVar, f fVar, androidx.biometric.e eVar) {
        this.f15890f = cVar;
        this.f15888b = fVar;
        this.f15887a = eVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f15892r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j10 = nVar.f15882a;
            long j11 = nVar.f15883b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.e;
            Long l4 = (Long) treeMap.get(valueOf);
            if (l4 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            } else if (l4.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
