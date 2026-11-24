package defpackage;

import android.util.Log;
public final class c73 extends ccb implements eq4 {
    public final byte a;
    public Object b;

    public c73(t5a t5aVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.a = (byte) 2;
        this.b = t5aVar;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        switch (this.a) {
            case 0:
                c73 c73Var = new c73(2, fw2Var, (byte) 0);
                c73Var.b = obj;
                return c73Var;
            case 1:
                c73 c73Var2 = new c73(2, fw2Var, (byte) 1);
                c73Var2.b = obj;
                return c73Var2;
            default:
                return new c73((t5a) this.b, fw2Var);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((c73) create((fwa) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 1:
                ((c73) create((String) obj, (fw2) obj2)).invokeSuspend(g5cVar);
                return g5cVar;
            default:
                return ((c73) create((t5a) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                qse.b(obj);
                return Boolean.valueOf(!(((fwa) this.b) instanceof uf4));
            case 1:
                qse.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return g5c.a;
            default:
                qse.b(obj);
                return (t5a) this.b;
        }
    }

    public c73(int i, fw2 fw2Var, byte b) {
        super(i, fw2Var);
        this.a = b;
    }
}
