package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
public final class gg8 implements Handler.Callback {
    public final rx6 a;
    public final wz4 b;
    public z53 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = gcc.q(this);
    public final rr c = new rr((byte) 1);

    public gg8(z53 z53Var, wz4 wz4Var, rx6 rx6Var) {
        this.f = z53Var;
        this.b = wz4Var;
        this.a = rx6Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            eg8 eg8Var = (eg8) message.obj;
            long j = eg8Var.a;
            long j2 = eg8Var.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            } else if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
