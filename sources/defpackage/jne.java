package defpackage;

import java.io.IOException;
public abstract class jne implements Cloneable {
    public final nne a;
    public nne b;
    public boolean c = false;

    public jne(nne nneVar) {
        this.a = nneVar;
        this.b = (nne) nneVar.d(4);
    }

    public static void b(nne nneVar, nne nneVar2) {
        fwe fweVar = fwe.c;
        fweVar.getClass();
        fweVar.a(nneVar.getClass()).e(nneVar, nneVar2);
    }

    public final void a(nne nneVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        b(this.b, nneVar);
    }

    public final void c(byte[] bArr, int i, rke rkeVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        try {
            fwe fweVar = fwe.c;
            nne nneVar = this.b;
            fweVar.getClass();
            xwe a = fweVar.a(nneVar.getClass());
            nne nneVar2 = this.b;
            ?? obj = new Object();
            rkeVar.getClass();
            a.c(nneVar2, bArr, 0, i, obj);
        } catch (fpe e) {
            throw e;
        } catch (IOException e2) {
            fyb.j("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw fpe.a();
        }
    }

    public final Object clone() {
        jne jneVar = (jne) this.a.d(5);
        jneVar.a(e());
        return jneVar;
    }

    public final void d() {
        nne nneVar = (nne) this.b.d(4);
        b(nneVar, this.b);
        this.b = nneVar;
    }

    public final nne e() {
        boolean z = this.c;
        nne nneVar = this.b;
        if (z) {
            return nneVar;
        }
        fwe fweVar = fwe.c;
        fweVar.getClass();
        fweVar.a(nneVar.getClass()).b(nneVar);
        this.c = true;
        return this.b;
    }

    public final nne f() {
        nne e = e();
        boolean z = true;
        byte byteValue = ((Byte) e.d(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                fwe fweVar = fwe.c;
                fweVar.getClass();
                z = fweVar.a(e.getClass()).a(e);
                e.d(2);
            }
        }
        if (z) {
            return e;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
