package defpackage;

import java.io.IOException;
public abstract class ase implements Cloneable {
    public final ese a;
    public ese b;
    public boolean c = false;

    public ase(ese eseVar) {
        this.a = eseVar;
        this.b = (ese) eseVar.d(4);
    }

    public static void b(ese eseVar, ese eseVar2) {
        w0f w0fVar = w0f.c;
        w0fVar.getClass();
        w0fVar.a(eseVar.getClass()).d(eseVar, eseVar2);
    }

    public final void a(ese eseVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        b(this.b, eseVar);
    }

    public final void c(byte[] bArr, int i, ipe ipeVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        try {
            w0f w0fVar = w0f.c;
            ese eseVar = this.b;
            w0fVar.getClass();
            o1f a = w0fVar.a(eseVar.getClass());
            ese eseVar2 = this.b;
            ?? obj = new Object();
            ipeVar.getClass();
            a.c(eseVar2, bArr, 0, i, obj);
        } catch (wte e) {
            throw e;
        } catch (IOException e2) {
            grb.j("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw wte.a();
        }
    }

    public final Object clone() {
        ase aseVar = (ase) this.a.d(5);
        aseVar.a(e());
        return aseVar;
    }

    public final void d() {
        ese eseVar = (ese) this.b.d(4);
        b(eseVar, this.b);
        this.b = eseVar;
    }

    public final ese e() {
        boolean z = this.c;
        ese eseVar = this.b;
        if (z) {
            return eseVar;
        }
        w0f w0fVar = w0f.c;
        w0fVar.getClass();
        w0fVar.a(eseVar.getClass()).b(eseVar);
        this.c = true;
        return this.b;
    }

    public final ese f() {
        ese e = e();
        boolean z = true;
        byte byteValue = ((Byte) e.d(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                w0f w0fVar = w0f.c;
                w0fVar.getClass();
                z = w0fVar.a(e.getClass()).a(e);
                e.d(2);
            }
        }
        if (z) {
            return e;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
