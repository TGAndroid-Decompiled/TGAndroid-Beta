package l2;

import android.os.Handler;
import android.os.Message;
import e2.m0;
import java.util.TreeMap;
public final class o implements Handler.Callback {
    public final androidx.biometric.e f14547a;
    public final a6.m f14548b;
    public m2.c f14550f;
    public boolean h;
    public boolean f14551n;
    public boolean f14552r;
    public final TreeMap e = new TreeMap();
    public final Handler d = m0.q(this);
    public final m3.b f14549c = new m3.b(1);

    public o(m2.c cVar, a6.m mVar, androidx.biometric.e eVar) {
        this.f14550f = cVar;
        this.f14548b = mVar;
        this.f14547a = eVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f14552r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f14542a;
            long j11 = mVar.f14543b;
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
