package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class t61 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public t61() {
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

    public final void c(int i, Object obj, p8c p8cVar) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i), obj);
        HashMap hashMap = this.c;
        if (hashMap != null && hashMap.get(pair) != null) {
            gl.d3(new fv0(this, pair, p8cVar, (byte) 9));
            return;
        }
        HashMap hashMap2 = this.b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            p8cVar.a(obj2);
            return;
        }
        gl.d3(new fv0(this, pair, p8cVar, (byte) 9));
        e(i, obj, new e(this, pair, obj, i, (byte) 4));
    }

    public final void d(int i, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i), num);
            this.d.remove(pair);
            if (this instanceof n97) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i, Object obj, i8c i8cVar) {
        ((e) i8cVar).a(0L, null);
    }

    public void f(int i, Object obj, long j, s61 s61Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new k97(s61Var, (byte) 3));
    }

    public final boolean i(Pair pair) {
        Long l;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            l = (Long) hashMap.get(pair);
        } else {
            l = null;
        }
        if ((this instanceof n97) && l == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((n97) this).e.X3;
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

    public t61(int i) {
        this.a = i;
    }

    public void h(int i, long j) {
    }

    public void g(int i, Object obj, Object obj2) {
    }
}
