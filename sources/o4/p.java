package o4;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.upstream.r;
import f5.d0;
import java.util.TreeMap;
import nh.d6;
public final class p implements Handler.Callback {
    public final r f19205a;
    public final d6 f19206b;
    public p4.c f19209f;
    public boolean h;
    public boolean f19210n;
    public boolean f19211r;
    public final TreeMap f19208e = new TreeMap();
    public final Handler d = d0.k(this);
    public final c4.b f19207c = new c4.b(1);

    public p(p4.c cVar, d6 d6Var, r rVar) {
        this.f19209f = cVar;
        this.f19206b = d6Var;
        this.f19205a = rVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f19211r) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j10 = nVar.f19199a;
            long j11 = nVar.f19200b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f19208e;
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
