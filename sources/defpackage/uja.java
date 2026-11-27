package defpackage;

import android.util.Log;
public final class uja extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public final yja c;

    public uja(yja yjaVar, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = yjaVar;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        yja yjaVar = this.c;
        switch (b) {
            case 0:
                return new uja(yjaVar, zw2Var, (byte) 0);
            default:
                return new uja(yjaVar, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((uja) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
            default:
                return ((uja) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj2 = vx2.a;
        yja yjaVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                        return f9cVar;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                um4 um4Var = new um4(yjaVar.e.getData(), new tja(yjaVar, null), (byte) 0);
                z73 z73Var = new z73(yjaVar, (byte) 2);
                this.b = true;
                if (um4Var.k(z73Var, this) == obj2) {
                    return obj2;
                }
                return f9cVar;
            default:
                boolean z2 = this.b;
                try {
                    if (z2) {
                        if (z2) {
                            ixe.b(obj);
                        } else {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ixe.b(obj);
                        o73 o73Var = yjaVar.e;
                        wja wjaVar = new wja(yjaVar, null, (byte) 0);
                        this.b = true;
                        if (o73Var.a(wjaVar, this) == obj2) {
                            f9cVar = obj2;
                        }
                    }
                    return f9cVar;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    o9a o9aVar = yjaVar.h;
                    if (o9aVar != null) {
                        yjaVar.d.getClass();
                        yjaVar.h = o9a.a(o9aVar, null, srb.a(), null, 5);
                        return f9cVar;
                    }
                    ur5.e("localSessionData");
                    throw null;
                }
        }
    }
}
