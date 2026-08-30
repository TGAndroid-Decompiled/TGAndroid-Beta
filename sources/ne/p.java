package ne;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import k7.g0;
public abstract class p {
    public final int f14954a;
    public Object f14955b;
    public Object f14956c;
    public Object d;
    public Object e;
    public Object f14957f;

    public p() {
        this.f14954a = 0;
        this.f14955b = null;
        this.f14956c = null;
        this.d = null;
        this.e = null;
        this.f14957f = null;
    }

    public abstract void a(g0 g0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f14957f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
            return;
        }
        this.f14956c = pVar;
        this.d = pVar;
    }

    public xe.b c() {
        ze.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f14955b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        xe.b bVar = (xe.b) this.f14957f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ze.a) ((com.google.firebase.messaging.d) bVar.f14955b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new ze.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new ze.a(dVar, 8L, readInt - 8);
        }
        xe.b bVar2 = new xe.b(aVar, this, str, 0);
        this.f14957f = bVar2;
        return bVar2;
    }

    public xe.b d(String str) {
        xe.b c3 = c();
        String str2 = (String) c3.d;
        if (str2.matches(str)) {
            return c3;
        }
        throw new IOException(e2.c.k("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f14955b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f14957f = (p) this.f14957f;
        } else {
            p pVar2 = (p) this.f14955b;
            if (pVar2 != null) {
                pVar2.f14956c = (p) this.f14957f;
            }
        }
        p pVar3 = (p) this.f14957f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.f14955b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f14955b = null;
        this.f14957f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f14954a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f14954a = 1;
        this.f14955b = dVar;
        this.f14956c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
