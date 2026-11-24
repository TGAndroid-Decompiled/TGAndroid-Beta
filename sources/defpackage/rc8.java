package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
public final class rc8 implements Handler.Callback {
    public final mv6 a;
    public final lj9 b;
    public h53 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = g8c.q(this);
    public final qr c = new qr((byte) 1);

    public rc8(h53 h53Var, lj9 lj9Var, mv6 mv6Var) {
        this.f = h53Var;
        this.b = lj9Var;
        this.a = mv6Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            pc8 pc8Var = (pc8) message.obj;
            long j = pc8Var.a;
            long j2 = pc8Var.b;
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
