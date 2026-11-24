package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
public final class c1 extends Handler {
    public final byte a;
    public final Object b;

    public c1(bs6 bs6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = bs6Var;
    }

    private final void a(Message message) {
        vi2 vi2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                aa3 aa3Var = (aa3) this.b;
                if (obj == aa3Var.x && aa3Var.k()) {
                    aa3Var.x = null;
                    synchronized (aa3Var.o) {
                        z24 z24Var = aa3Var.y;
                        z24Var.getClass();
                        vi2Var = new vi2((byte) 21);
                        ((jm5) z24Var.b).f();
                        aa3Var.y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] p = aa3Var.b.p(aa3Var.v, ((lq6) obj2).a);
                            if (aa3Var.w != null && p != null && p.length != 0) {
                                aa3Var.w = p;
                            }
                            aa3Var.p = (byte) 4;
                            aa3Var.i(new vu2(vi2Var, (byte) 17));
                            return;
                        } catch (Exception | NoSuchMethodError e) {
                            aa3Var.m(e, true);
                            return;
                        }
                    }
                    aa3Var.m((Throwable) obj2, false);
                    return;
                }
                return;
            }
            return;
        }
        aa3 aa3Var2 = (aa3) this.b;
        lv6 lv6Var = aa3Var2.c;
        if (obj == aa3Var2.z) {
            if (aa3Var2.p == 2 || aa3Var2.k()) {
                aa3Var2.z = null;
                if (obj2 instanceof Exception) {
                    lv6Var.D((Exception) obj2, false);
                    return;
                }
                try {
                    aa3Var2.b.s(((lq6) obj2).a);
                    lv6Var.c = null;
                    HashSet hashSet = (HashSet) lv6Var.b;
                    mm5 q = mm5.q(hashSet);
                    hashSet.clear();
                    km5 listIterator = q.listIterator(0);
                    while (listIterator.hasNext()) {
                        aa3 aa3Var3 = (aa3) listIterator.next();
                        if (aa3Var3.n()) {
                            aa3Var3.j(true);
                        }
                    }
                } catch (Exception e2) {
                    lv6Var.D(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        zu6 zu6Var;
        yu6 yu6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yu6) this.b).b) {
                zu6Var = (zu6) ((yu6) this.b).d.get();
                yu6Var = (yu6) this.b;
                c1Var = (c1) yu6Var.f;
            }
            if (zu6Var != null && yu6Var == zu6Var.b() && c1Var != null) {
                zu6Var.e((nw6) message.obj);
                ((yu6) this.b).a(zu6Var, c1Var);
                zu6Var.e(null);
            }
        }
    }

    private final void c(Message message) {
        bv6 bv6Var;
        yu6 yu6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yu6) this.b).b) {
                bv6Var = (bv6) ((yu6) this.b).d.get();
                yu6Var = (yu6) this.b;
                c1Var = (c1) yu6Var.f;
            }
            if (bv6Var != null && yu6Var == bv6Var.b() && c1Var != null) {
                bv6Var.d((mw6) message.obj);
                ((yu6) this.b).b(bv6Var, c1Var);
                bv6Var.d(null);
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

    public c1(Looper looper, mv6 mv6Var) {
        super(looper);
        this.a = (byte) 13;
        this.b = mv6Var;
    }
}
