package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
public final class wja extends yfb implements is4 {
    public final byte a;
    public Object b;
    public final yja c;

    public wja(yja yjaVar, zw2 zw2Var, byte b) {
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
                wja wjaVar = new wja(yjaVar, zw2Var, (byte) 0);
                wjaVar.b = obj;
                return wjaVar;
            default:
                wja wjaVar2 = new wja(yjaVar, zw2Var, (byte) 1);
                wjaVar2.b = obj;
                return wjaVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        o9a o9aVar = (o9a) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((wja) create(o9aVar, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((wja) create(o9aVar, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z;
        s9a s9aVar;
        rx7 rx7Var;
        byte b = this.a;
        yja yjaVar = this.c;
        switch (b) {
            case 0:
                ixe.b(obj);
                yjaVar.d.getClass();
                return o9a.a((o9a) this.b, null, srb.a(), null, 5);
            default:
                ixe.b(obj);
                o9a o9aVar = (o9a) this.b;
                ko8 ko8Var = yjaVar.f;
                boolean d = yjaVar.d(o9aVar);
                Map map = o9aVar.c;
                if (map != null) {
                    ko8Var.getClass();
                    z = false;
                    if (!ko8Var.f) {
                        ArrayList c = t4.c(ko8Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = c.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = c.get(i);
                            i++;
                            mo8 mo8Var = (mo8) obj2;
                            io8 io8Var = (io8) map.get(mo8Var.a);
                            if (io8Var != null) {
                                rx7Var = new rx7(mo8Var, io8Var);
                            } else {
                                rx7Var = null;
                            }
                            if (rx7Var != null) {
                                arrayList.add(rx7Var);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                rx7 rx7Var2 = (rx7) obj3;
                                mo8 mo8Var2 = (mo8) rx7Var2.a;
                                io8 io8Var2 = (io8) rx7Var2.b;
                                boolean a = ur5.a(ko8Var.a(), mo8Var2.a);
                                int i3 = mo8Var2.b;
                                if (a) {
                                    if (i3 == io8Var2.a && ur5.a((String) ko8Var.d.getValue(), io8Var2.b)) {
                                    }
                                } else if (i3 != io8Var2.a) {
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean c2 = yjaVar.c(o9aVar);
                if (z) {
                    map = ko8Var.b(y24.a);
                } else if (c2) {
                    map = ko8Var.b(map);
                }
                if (z) {
                    s9aVar = null;
                } else {
                    s9aVar = o9aVar.a;
                }
                if (!d && !z) {
                    if (c2) {
                        return o9a.a(o9aVar, null, null, ko8Var.b(map), 3);
                    }
                    return o9aVar;
                }
                s9a a2 = yjaVar.b.a(s9aVar);
                y9a y9aVar = yjaVar.c;
                fud.b(xde.a(y9aVar.e), new w9a(y9aVar, a2, null));
                ko8Var.f = true;
                return new o9a(a2, null, map);
        }
    }
}
