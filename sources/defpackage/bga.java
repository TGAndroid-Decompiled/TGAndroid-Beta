package defpackage;

import android.util.Log;
public final class bga extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public final fga c;

    public bga(fga fgaVar, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = fgaVar;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        fga fgaVar = this.c;
        switch (b) {
            case 0:
                return new bga(fgaVar, fw2Var, (byte) 0);
            default:
                return new bga(fgaVar, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((bga) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((bga) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj2 = bx2.a;
        fga fgaVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        qse.b(obj);
                        return g5cVar;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                lv6 lv6Var = new lv6(fgaVar.e.getData(), new aga(fgaVar, null), false, (byte) 29);
                g73 g73Var = new g73(fgaVar, (byte) 2);
                this.b = true;
                if (lv6Var.h(g73Var, this) == obj2) {
                    return obj2;
                }
                return g5cVar;
            default:
                boolean z2 = this.b;
                try {
                    if (z2) {
                        if (z2) {
                            qse.b(obj);
                        } else {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        qse.b(obj);
                        v63 v63Var = fgaVar.e;
                        dga dgaVar = new dga(fgaVar, null, (byte) 0);
                        this.b = true;
                        if (v63Var.a(dgaVar, this) == obj2) {
                            g5cVar = obj2;
                        }
                    }
                    return g5cVar;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    w5a w5aVar = fgaVar.h;
                    if (w5aVar != null) {
                        fgaVar.d.getClass();
                        fgaVar.h = w5a.a(w5aVar, null, snb.a(), null, 5);
                        return g5cVar;
                    }
                    rp5.e("localSessionData");
                    throw null;
                }
        }
    }
}
