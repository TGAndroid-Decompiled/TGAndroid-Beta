package defpackage;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class gn5 implements aka, k6a {
    public static final gn5 c = new gn5((byte) 0, true);
    public static final gn5 d = new gn5((byte) 0, false);
    public final byte a;
    public boolean b;

    public gn5(fo7 fo7Var, eo7 eo7Var) {
        boolean z;
        boolean z2;
        int i;
        this.a = (byte) 3;
        byte b = eo7Var.a;
        ByteBuffer byteBuffer = eo7Var.b;
        if (b != 6 && b != 3) {
            z = false;
        } else {
            z = true;
        }
        gre.f(z);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        qd1 qd1Var = new qd1(min, bArr);
        if (!fo7Var.a) {
            if (qd1Var.e()) {
                this.b = false;
                return;
            }
            int f = qd1Var.f(2);
            boolean e = qd1Var.e();
            if (!fo7Var.b) {
                if (!e) {
                    this.b = true;
                    return;
                }
                if (f != 3 && f != 0) {
                    z2 = qd1Var.e();
                } else {
                    z2 = true;
                }
                qd1Var.m();
                if (fo7Var.d) {
                    if (qd1Var.e()) {
                        if (fo7Var.e) {
                            qd1Var.m();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!fo7Var.c) {
                        if (f != 3) {
                            qd1Var.m();
                        }
                        qd1Var.n(fo7Var.f);
                        if (f != 2 && f != 0 && !z2) {
                            qd1Var.n(3);
                        }
                        if (f != 3 && f != 0) {
                            i = qd1Var.f(8);
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
    public final void E(d5a d5aVar, boolean z) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void F(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void L(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void R(d5a d5aVar, String str) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void T(d5a d5aVar, String str) {
        MediaController w;
        k27 k27Var;
        ed1 ed1Var = (ed1) d5aVar;
        if (ed1Var != null) {
            fre.e("Must be called from the main thread.");
            i69 i69Var = ed1Var.j;
            if (i69Var == 0) {
                return;
            }
            AtomicInteger atomicInteger = fo.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            i69Var.p(new Object());
            fre.e("Must be called from the main thread.");
            if (!i69Var.w()) {
                i69.t();
            } else {
                i69.x(new x5d(i69Var, (byte) 3));
            }
            boolean z = this.b;
            long j = -1;
            if (!z) {
                lbc lbcVar = PhotoViewer.r0().G2;
                if (lbcVar != null) {
                    j = lbcVar.S();
                }
            } else if (z && (k27Var = (w = MediaController.w()).v0) != null) {
                j = w.y(k27Var);
            }
            if (j >= 0) {
                fo.x(j);
            }
            fo.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override
    public final void n(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
        fo.d(false);
        fo.E();
    }

    @Override
    public final void p(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void q(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
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
    public final void y(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
        fo.d(false);
        fo.E();
    }

    public gn5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public gn5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public gn5(Context context, Looper looper, adb adbVar) {
        this.a = (byte) 5;
        new ize(context.getApplicationContext());
        adbVar.a(looper, null);
        adbVar.a(Looper.getMainLooper(), null);
    }

    public gn5() {
        this.a = (byte) 1;
    }
}
