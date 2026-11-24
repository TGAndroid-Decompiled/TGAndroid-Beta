package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
public final class ue8 implements Handler.Callback {
    public final mx6 a;
    public final sz4 b;
    public t63 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = hac.q(this);
    public final qs c = new qs((byte) 1);

    public ue8(t63 t63Var, sz4 sz4Var, mx6 mx6Var) {
        this.f = t63Var;
        this.b = sz4Var;
        this.a = mx6Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            se8 se8Var = (se8) message.obj;
            long j = se8Var.a;
            long j2 = se8Var.b;
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
