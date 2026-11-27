package defpackage;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class jp5 implements una, caa {
    public static final jp5 c = new jp5((byte) 0, true);
    public static final jp5 d = new jp5((byte) 0, false);
    public final byte a;
    public boolean b;

    public jp5(fr7 fr7Var, er7 er7Var) {
        boolean z;
        boolean z2;
        int i;
        this.a = (byte) 3;
        byte b = er7Var.a;
        ByteBuffer byteBuffer = er7Var.b;
        if (b != 6 && b != 3) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zd1 zd1Var = new zd1(min, bArr);
        if (!fr7Var.a) {
            if (zd1Var.e()) {
                this.b = false;
                return;
            }
            int f = zd1Var.f(2);
            boolean e = zd1Var.e();
            if (!fr7Var.b) {
                if (!e) {
                    this.b = true;
                    return;
                }
                if (f != 3 && f != 0) {
                    z2 = zd1Var.e();
                } else {
                    z2 = true;
                }
                zd1Var.m();
                if (fr7Var.d) {
                    if (zd1Var.e()) {
                        if (fr7Var.e) {
                            zd1Var.m();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!fr7Var.c) {
                        if (f != 3) {
                            zd1Var.m();
                        }
                        zd1Var.n(fr7Var.f);
                        if (f != 2 && f != 0 && !z2) {
                            zd1Var.n(3);
                        }
                        if (f != 3 && f != 0) {
                            i = zd1Var.f(8);
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
    public final void B(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
        go.d(false);
        go.E();
    }

    @Override
    public final void C(v8a v8aVar, boolean z) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void D(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void J(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void N(v8a v8aVar, String str) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void P(v8a v8aVar, String str) {
        MediaController z;
        r47 r47Var;
        md1 md1Var = (md1) v8aVar;
        if (md1Var != null) {
            xve.e("Must be called from the main thread.");
            v99 v99Var = md1Var.j;
            if (v99Var == 0) {
                return;
            }
            AtomicInteger atomicInteger = go.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            v99Var.p(new Object());
            xve.e("Must be called from the main thread.");
            if (!v99Var.w()) {
                v99.t();
            } else {
                v99.x(new qad(v99Var, (byte) 3));
            }
            boolean z2 = this.b;
            long j = -1;
            if (!z2) {
                kfc kfcVar = PhotoViewer.q0().G2;
                if (kfcVar != null) {
                    j = kfcVar.S();
                }
            } else if (z2 && (r47Var = (z = MediaController.z()).v0) != null) {
                j = z.B(r47Var);
            }
            if (j >= 0) {
                go.x(j);
            }
            go.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override
    public final void m(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
        go.d(false);
        go.E();
    }

    @Override
    public final void n(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void p(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
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

    public jp5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public jp5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public jp5(Context context, Looper looper, vgb vgbVar) {
        this.a = (byte) 5;
        new z6f(context.getApplicationContext());
        vgbVar.a(looper, null);
        vgbVar.a(Looper.getMainLooper(), null);
    }

    public jp5() {
        this.a = (byte) 1;
    }
}
