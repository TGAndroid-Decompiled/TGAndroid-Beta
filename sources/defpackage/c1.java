package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
public final class c1 extends Handler {
    public final byte a;
    public final Object b;

    public c1(cu6 cu6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = cu6Var;
    }

    private final void a(Message message) {
        jk2 jk2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                mb3 mb3Var = (mb3) this.b;
                if (obj == mb3Var.x && mb3Var.k()) {
                    mb3Var.x = null;
                    synchronized (mb3Var.o) {
                        ai4 ai4Var = mb3Var.y;
                        ai4Var.getClass();
                        jk2Var = new jk2((byte) 21);
                        ((jo5) ai4Var.b).f();
                        mb3Var.y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] l = mb3Var.b.l(mb3Var.v, ((ls6) obj2).a);
                            if (mb3Var.w != null && l != null && l.length != 0) {
                                mb3Var.w = l;
                            }
                            mb3Var.p = (byte) 4;
                            mb3Var.i(new wm2(jk2Var, (byte) 20));
                            return;
                        } catch (Exception | NoSuchMethodError e) {
                            mb3Var.m(e, true);
                            return;
                        }
                    }
                    mb3Var.m((Throwable) obj2, false);
                    return;
                }
                return;
            }
            return;
        }
        mb3 mb3Var2 = (mb3) this.b;
        hi2 hi2Var = mb3Var2.c;
        if (obj == mb3Var2.z) {
            if (mb3Var2.p == 2 || mb3Var2.k()) {
                mb3Var2.z = null;
                if (obj2 instanceof Exception) {
                    hi2Var.K((Exception) obj2, false);
                    return;
                }
                try {
                    mb3Var2.b.o(((ls6) obj2).a);
                    hi2Var.c = null;
                    HashSet hashSet = (HashSet) hi2Var.b;
                    mo5 q = mo5.q(hashSet);
                    hashSet.clear();
                    ko5 listIterator = q.listIterator(0);
                    while (listIterator.hasNext()) {
                        mb3 mb3Var3 = (mb3) listIterator.next();
                        if (mb3Var3.n()) {
                            mb3Var3.j(true);
                        }
                    }
                } catch (Exception e2) {
                    hi2Var.K(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        zw6 zw6Var;
        yw6 yw6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yw6) this.b).b) {
                zw6Var = (zw6) ((yw6) this.b).d.get();
                yw6Var = (yw6) this.b;
                c1Var = (c1) yw6Var.f;
            }
            if (zw6Var != null && yw6Var == zw6Var.b() && c1Var != null) {
                zw6Var.e((ny6) message.obj);
                ((yw6) this.b).a(zw6Var, c1Var);
                zw6Var.e(null);
            }
        }
    }

    private final void c(Message message) {
        bx6 bx6Var;
        yw6 yw6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yw6) this.b).b) {
                bx6Var = (bx6) ((yw6) this.b).d.get();
                yw6Var = (yw6) this.b;
                c1Var = (c1) yw6Var.f;
            }
            if (bx6Var != null && yw6Var == bx6Var.b() && c1Var != null) {
                bx6Var.d((my6) message.obj);
                ((yw6) this.b).b(bx6Var, c1Var);
                bx6Var.d(null);
            }
        }
    }

    @Override
    public final void handleMessage(android.os.Message r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1.handleMessage(android.os.Message):void");
    }

    public c1(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    public c1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public c1(Looper looper, mx6 mx6Var) {
        super(looper);
        this.a = (byte) 13;
        this.b = mx6Var;
    }
}
