package m4;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.upstream.r;
import d5.g0;
import java.util.TreeMap;

public final class o implements Handler.Callback {

    public final r f17720a;

    public final k5.i f17721b;

    public n4.c f17724f;
    public boolean h;

    public boolean f17725n;

    public boolean f17726r;

    public final TreeMap f17723e = new TreeMap();
    public final Handler d = g0.k(this);

    public final a4.b f17722c = new a4.b(1);

    public o(n4.c cVar, k5.i iVar, r rVar) {
        this.f17724f = cVar;
        this.f17721b = iVar;
        this.f17720a = rVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f17726r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f17714a;
            long j11 = mVar.f17715b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f17723e;
            Long l10 = (Long) treeMap.get(lValueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
