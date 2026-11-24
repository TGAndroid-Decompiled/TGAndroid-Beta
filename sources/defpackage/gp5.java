package defpackage;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class gp5 implements bma, m8a {
    public static final gp5 c = new gp5((byte) 0, true);
    public static final gp5 d = new gp5((byte) 0, false);
    public final byte a;
    public boolean b;

    public gp5(iq7 iq7Var, hq7 hq7Var) {
        boolean z;
        boolean z2;
        int i;
        this.a = (byte) 3;
        byte b = hq7Var.a;
        ByteBuffer byteBuffer = hq7Var.b;
        if (b != 6 && b != 3) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ye1 ye1Var = new ye1(min, bArr);
        if (!iq7Var.a) {
            if (ye1Var.e()) {
                this.b = false;
                return;
            }
            int f = ye1Var.f(2);
            boolean e = ye1Var.e();
            if (!iq7Var.b) {
                if (!e) {
                    this.b = true;
                    return;
                }
                if (f != 3 && f != 0) {
                    z2 = ye1Var.e();
                } else {
                    z2 = true;
                }
                ye1Var.m();
                if (iq7Var.d) {
                    if (ye1Var.e()) {
                        if (iq7Var.e) {
                            ye1Var.m();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!iq7Var.c) {
                        if (f != 3) {
                            ye1Var.m();
                        }
                        ye1Var.n(iq7Var.f);
                        if (f != 2 && f != 0 && !z2) {
                            ye1Var.n(3);
                        }
                        if (f != 3 && f != 0) {
                            i = ye1Var.f(8);
                        } else {
                            i = 255;
                        }
                        this.b = i != 0;
                        return;
                    }
                    throw new Exception();
                }
                throw new Exception();
            }
            throw new Exception();
        }
        throw new Exception();
    }

    @Override
    public final void B(f7a f7aVar, boolean z) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void C(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void L(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void P(f7a f7aVar, String str) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void R(f7a f7aVar, String str) {
        MediaController w;
        k47 k47Var;
        me1 me1Var = (me1) f7aVar;
        if (me1Var != null) {
            ite.e("Must be called from the main thread.");
            k89 k89Var = me1Var.j;
            if (k89Var == 0) {
                return;
            }
            AtomicInteger atomicInteger = fp.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            k89Var.p(new Object());
            ite.e("Must be called from the main thread.");
            if (!k89Var.w()) {
                k89.t();
            } else {
                k89.x(new z7d(k89Var, (byte) 3));
            }
            boolean z = this.b;
            long j = -1;
            if (!z) {
                ndc ndcVar = PhotoViewer.r0().G2;
                if (ndcVar != null) {
                    j = ndcVar.S();
                }
            } else if (z && (k47Var = (w = MediaController.w()).v0) != null) {
                j = w.y(k47Var);
            }
            if (j >= 0) {
                fp.x(j);
            }
            fp.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override
    public final void l(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
        fp.d(false);
        fp.E();
    }

    @Override
    public final void o(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void q(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
                sb.append(!this.b);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public final void z(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
        fp.d(false);
        fp.E();
    }

    public gp5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public gp5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public gp5(Context context, Looper looper, bfb bfbVar) {
        this.a = (byte) 5;
        new k1f(context.getApplicationContext());
        bfbVar.a(looper, null);
        bfbVar.a(Looper.getMainLooper(), null);
    }

    public gp5() {
        this.a = (byte) 1;
    }
}
