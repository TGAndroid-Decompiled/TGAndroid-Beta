package m4;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.upstream.r;
import d5.f0;
import java.util.TreeMap;
public final class o implements Handler.Callback {
    public final r f17344a;
    public final android.support.v4.media.c f17345b;
    public n4.c f17348f;
    public boolean h;
    public boolean f17349n;
    public boolean f17350r;
    public final TreeMap f17347e = new TreeMap();
    public final Handler d = f0.k(this);
    public final a4.b f17346c = new a4.b(1);

    public o(n4.c cVar, android.support.v4.media.c cVar2, r rVar) {
        this.f17348f = cVar;
        this.f17345b = cVar2;
        this.f17344a = rVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f17350r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f17338a;
            long j11 = mVar.f17339b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f17347e;
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
