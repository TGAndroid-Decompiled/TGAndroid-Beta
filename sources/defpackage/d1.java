package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
import org.webrtc.Logging;
public final class d1 extends Handler {
    public final byte a;
    public final Object b;

    public d1(gu6 gu6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = gu6Var;
    }

    private final void a(Message message) {
        rj2 rj2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ta3 ta3Var = (ta3) this.b;
                if (obj == ta3Var.x && ta3Var.k()) {
                    ta3Var.x = null;
                    synchronized (ta3Var.o) {
                        xh4 xh4Var = ta3Var.y;
                        xh4Var.getClass();
                        rj2Var = new rj2((byte) 21);
                        ((mo5) xh4Var.b).f();
                        ta3Var.y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] l = ta3Var.b.l(ta3Var.v, ((ps6) obj2).a);
                            if (ta3Var.w != null && l != null && l.length != 0) {
                                ta3Var.w = l;
                            }
                            ta3Var.p = (byte) 4;
                            ta3Var.i(new ht2(rj2Var, (byte) 19));
                            return;
                        } catch (Exception | NoSuchMethodError e) {
                            ta3Var.m(e, true);
                            return;
                        }
                    }
                    ta3Var.m((Throwable) obj2, false);
                    return;
                }
                return;
            }
            return;
        }
        ta3 ta3Var2 = (ta3) this.b;
        qx6 qx6Var = ta3Var2.c;
        if (obj == ta3Var2.z) {
            if (ta3Var2.p == 2 || ta3Var2.k()) {
                ta3Var2.z = null;
                if (obj2 instanceof Exception) {
                    qx6Var.E((Exception) obj2, false);
                    return;
                }
                try {
                    ta3Var2.b.r(((ps6) obj2).a);
                    qx6Var.c = null;
                    HashSet hashSet = (HashSet) qx6Var.b;
                    po5 q = po5.q(hashSet);
                    hashSet.clear();
                    no5 listIterator = q.listIterator(0);
                    while (listIterator.hasNext()) {
                        ta3 ta3Var3 = (ta3) listIterator.next();
                        if (ta3Var3.n()) {
                            ta3Var3.j(true);
                        }
                    }
                } catch (Exception e2) {
                    qx6Var.E(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        ex6 ex6Var;
        dx6 dx6Var;
        d1 d1Var;
        if (message.what == 1) {
            synchronized (((dx6) this.b).b) {
                ex6Var = (ex6) ((dx6) this.b).d.get();
                dx6Var = (dx6) this.b;
                d1Var = (d1) dx6Var.f;
            }
            if (ex6Var != null && dx6Var == ex6Var.b() && d1Var != null) {
                ex6Var.e((sy6) message.obj);
                ((dx6) this.b).a(ex6Var, d1Var);
                ex6Var.e(null);
            }
        }
    }

    private final void c(Message message) {
        gx6 gx6Var;
        dx6 dx6Var;
        d1 d1Var;
        if (message.what == 1) {
            synchronized (((dx6) this.b).b) {
                gx6Var = (gx6) ((dx6) this.b).d.get();
                dx6Var = (dx6) this.b;
                d1Var = (d1) dx6Var.f;
            }
            if (gx6Var != null && dx6Var == gx6Var.b() && d1Var != null) {
                gx6Var.d((ry6) message.obj);
                ((dx6) this.b).b(gx6Var, d1Var);
                gx6Var.d(null);
            }
        }
    }

    @Override
    public final void dispatchMessage(Message message) {
        switch (this.a) {
            case 14:
                try {
                    super.dispatchMessage(message);
                    return;
                } catch (Exception e) {
                    Logging.e("VoIPEglRenderer", "Exception on VoIPEglRenderer thread", e);
                    ((pjc) this.b).run();
                    throw e;
                }
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    @Override
    public final void handleMessage(android.os.Message r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1.handleMessage(android.os.Message):void");
    }

    public d1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public d1(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    public d1(Looper looper, Object obj, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }
}
