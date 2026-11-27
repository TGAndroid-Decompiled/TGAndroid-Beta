package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class b71 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public b71() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.b = hashMap;
        }
        hashMap.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i, Object obj, pcc pccVar) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i), obj);
        HashMap hashMap = this.c;
        if (hashMap != null && hashMap.get(pair) != null) {
            hl.c3(new tu0(this, pair, pccVar, (byte) 10));
            return;
        }
        HashMap hashMap2 = this.b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            pccVar.a(obj2);
            return;
        }
        hl.c3(new tu0(this, pair, pccVar, (byte) 10));
        e(i, obj, new f(this, pair, obj, i, (byte) 4));
    }

    public final void d(int i, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i), num);
            this.d.remove(pair);
            if (this instanceof ub7) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i, Object obj, icc iccVar) {
        ((f) iccVar).a(0L, null);
    }

    public void f(int i, Object obj, long j, a71 a71Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new rb7(a71Var, (byte) 3));
    }

    public final boolean i(Pair pair) {
        Long l;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            l = (Long) hashMap.get(pair);
        } else {
            l = null;
        }
        if ((this instanceof ub7) && l == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((ub7) this).e.X3;
            l = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l != null && System.currentTimeMillis() - l.longValue() < this.a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public b71(int i) {
        this.a = i;
    }

    public void h(int i, long j) {
    }

    public void g(int i, Object obj, Object obj2) {
    }
}
