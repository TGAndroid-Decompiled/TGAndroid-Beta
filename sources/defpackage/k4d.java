package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Set;
public final class k4d extends b3d implements f05, g05 {
    public static final or5 l = p4d.a;
    public final Context c;
    public final q79 d;
    public final or5 e;
    public final Set f;
    public final ovb i;
    public gja j;
    public y3d k;

    public k4d(Context context, q79 q79Var, ovb ovbVar) {
        super((byte) 1);
        this.c = context;
        this.d = q79Var;
        this.i = ovbVar;
        this.f = (Set) ovbVar.a;
        this.e = l;
    }

    @Override
    public final void U(e5d e5dVar) {
        this.d.post(new tnd((Object) this, (Object) e5dVar, false, (byte) 13));
    }

    @Override
    public final void onConnected(Bundle bundle) {
        this.j.B(this);
    }

    @Override
    public final void onConnectionFailed(ot2 ot2Var) {
        this.k.b(ot2Var);
    }

    @Override
    public final void onConnectionSuspended(int i) {
        y3d y3dVar = this.k;
        w3d w3dVar = (w3d) y3dVar.f.s.get(y3dVar.b);
        if (w3dVar != null) {
            if (w3dVar.k) {
                w3dVar.k(new ot2(17, null, null));
            } else {
                w3dVar.onConnectionSuspended(i);
            }
        }
    }
}
