package defpackage;

import android.util.Log;
public final class o83 extends eeb implements fs4 {
    public final byte a;
    public Object b;

    public o83(v7a v7aVar, px2 px2Var) {
        super(2, px2Var);
        this.a = (byte) 2;
        this.b = v7aVar;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        switch (this.a) {
            case 0:
                o83 o83Var = new o83(2, px2Var, (byte) 0);
                o83Var.b = obj;
                return o83Var;
            case 1:
                o83 o83Var2 = new o83(2, px2Var, (byte) 1);
                o83Var2.b = obj;
                return o83Var2;
            default:
                return new o83((v7a) this.b, px2Var);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((o83) create((iya) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                ((o83) create((String) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            default:
                return ((o83) create((v7a) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                tue.b(obj);
                return Boolean.valueOf(!(((iya) this.b) instanceof vh4));
            case 1:
                tue.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return g7c.a;
            default:
                tue.b(obj);
                return (v7a) this.b;
        }
    }

    public o83(int i, px2 px2Var, byte b) {
        super(i, px2Var);
        this.a = b;
    }
}
