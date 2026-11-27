package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class lo6 {
    public final int a;
    public TLRPC.TL_inputDocument b;
    public long c = -9223372036854775807L;
    public final ArrayList d = new ArrayList();
    public final z96 e = new z96(this, (byte) 15);

    public lo6(int i) {
        this.a = i;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        d();
        this.b = null;
    }

    public final long b() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            j += ((Long) pair.second).longValue() - ((Long) pair.first).longValue();
        }
        return j;
    }

    public final void c(long j, long j2) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.d;
            if (i >= arrayList.size() || ((Long) ((Pair) arrayList.get(i)).first).longValue() > j) {
                break;
            }
            i++;
        }
        arrayList.add(i, new Pair(Long.valueOf(j), Long.valueOf(j2)));
        int max = Math.max(0, i - 1);
        while (max < arrayList.size() - 1) {
            Pair pair = (Pair) arrayList.get(max);
            int i2 = max + 1;
            Pair pair2 = (Pair) arrayList.get(i2);
            if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                arrayList.set(max, new Pair((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                arrayList.remove(i2);
            } else {
                max = i2;
            }
        }
    }

    public final void d() {
        hl.r(this.e);
        if (this.b == null || b() < 3000) {
            return;
        }
        TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
        tL_messages_reportMusicListen.id = this.b;
        tL_messages_reportMusicListen.listened_duration = (int) Math.round(b() / 1000.0d);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportMusicListen, null);
        this.c = -9223372036854775807L;
        this.d.clear();
    }
}
