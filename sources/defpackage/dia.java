package defpackage;

import android.util.Log;
public final class dia extends eeb implements fs4 {
    public final byte a;
    public boolean b;
    public final hia c;

    public dia(hia hiaVar, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = hiaVar;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        hia hiaVar = this.c;
        switch (b) {
            case 0:
                return new dia(hiaVar, px2Var, (byte) 0);
            default:
                return new dia(hiaVar, px2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
            case 0:
                return ((dia) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((dia) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = ly2.a;
        hia hiaVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        tue.b(obj);
                        return g7cVar;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                lx6 lx6Var = new lx6(hiaVar.e.getData(), new cia(hiaVar, null), (byte) 29);
                s83 s83Var = new s83(hiaVar, (byte) 2);
                this.b = true;
                if (lx6Var.g(s83Var, this) == obj2) {
                    return obj2;
                }
                return g7cVar;
            default:
                boolean z2 = this.b;
                try {
                    if (z2) {
                        if (z2) {
                            tue.b(obj);
                        } else {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        tue.b(obj);
                        h83 h83Var = hiaVar.e;
                        fia fiaVar = new fia(hiaVar, null, (byte) 0);
                        this.b = true;
                        if (h83Var.a(fiaVar, this) == obj2) {
                            g7cVar = obj2;
                        }
                    }
                    return g7cVar;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    y7a y7aVar = hiaVar.h;
                    if (y7aVar != null) {
                        hiaVar.d.getClass();
                        hiaVar.h = y7a.a(y7aVar, null, tpb.a(), null, 5);
                        return g7cVar;
                    }
                    rr5.e("localSessionData");
                    throw null;
                }
        }
    }
}
