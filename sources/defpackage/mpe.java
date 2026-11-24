package defpackage;

import java.io.IOException;
public abstract class mpe implements Cloneable {
    public final qpe a;
    public qpe b;
    public boolean c = false;

    public mpe(qpe qpeVar) {
        this.a = qpeVar;
        this.b = (qpe) qpeVar.d(4);
    }

    public static void b(qpe qpeVar, qpe qpeVar2) {
        hye hyeVar = hye.c;
        hyeVar.getClass();
        hyeVar.a(qpeVar.getClass()).e(qpeVar, qpeVar2);
    }

    public final void a(qpe qpeVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        b(this.b, qpeVar);
    }

    public final void c(byte[] bArr, int i, tme tmeVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        try {
            hye hyeVar = hye.c;
            qpe qpeVar = this.b;
            hyeVar.getClass();
            zye a = hyeVar.a(qpeVar.getClass());
            qpe qpeVar2 = this.b;
            ?? obj = new Object();
            tmeVar.getClass();
            a.c(qpeVar2, bArr, 0, i, obj);
        } catch (ire e) {
            throw e;
        } catch (IOException e2) {
            rjb.k("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw ire.a();
        }
    }

    public final Object clone() {
        mpe mpeVar = (mpe) this.a.d(5);
        mpeVar.a(e());
        return mpeVar;
    }

    public final void d() {
        qpe qpeVar = (qpe) this.b.d(4);
        b(qpeVar, this.b);
        this.b = qpeVar;
    }

    public final qpe e() {
        boolean z = this.c;
        qpe qpeVar = this.b;
        if (z) {
            return qpeVar;
        }
        hye hyeVar = hye.c;
        hyeVar.getClass();
        hyeVar.a(qpeVar.getClass()).b(qpeVar);
        this.c = true;
        return this.b;
    }

    public final qpe f() {
        qpe e = e();
        boolean z = true;
        byte byteValue = ((Byte) e.d(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                hye hyeVar = hye.c;
                hyeVar.getClass();
                z = hyeVar.a(e.getClass()).a(e);
                e.d(2);
            }
        }
        if (z) {
            return e;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
