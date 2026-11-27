package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Set;
public final class z6d extends q5d implements k05, l05 {
    public static final rr5 l = e7d.a;
    public final Context c;
    public final b99 d;
    public final rr5 e;
    public final Set f;
    public final oxb i;
    public xka j;
    public n6d k;

    public z6d(Context context, b99 b99Var, oxb oxbVar) {
        super((byte) 1);
        this.c = context;
        this.d = b99Var;
        this.i = oxbVar;
        this.f = (Set) oxbVar.a;
        this.e = l;
    }

    @Override
    public final void U(t7d t7dVar) {
        this.d.post(new iqd((Object) this, (Object) t7dVar, false, (byte) 13));
    }

    @Override
    public final void onConnected(Bundle bundle) {
        this.j.B(this);
    }

    @Override
    public final void onConnectionFailed(ws2 ws2Var) {
        this.k.b(ws2Var);
    }

    @Override
    public final void onConnectionSuspended(int i) {
        n6d n6dVar = this.k;
        l6d l6dVar = (l6d) n6dVar.f.s.get(n6dVar.b);
        if (l6dVar != null) {
            if (l6dVar.k) {
                l6dVar.k(new ws2(17, null, null));
            } else {
                l6dVar.onConnectionSuspended(i);
            }
        }
    }
}
