package ne;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import k7.h0;
public abstract class p {
    public final int f15975a;
    public Object f15976b;
    public Object f15977c;
    public Object d;
    public Object f15978e;
    public Object f15979f;

    public p() {
        this.f15975a = 0;
        this.f15976b = null;
        this.f15977c = null;
        this.d = null;
        this.f15978e = null;
        this.f15979f = null;
    }

    public abstract void a(h0 h0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f15979f = pVar;
            pVar.f15978e = pVar2;
            this.d = pVar;
            return;
        }
        this.f15977c = pVar;
        this.d = pVar;
    }

    public xe.b c() {
        ze.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f15976b;
        DataInputStream dataInputStream = (DataInputStream) this.f15978e;
        xe.b bVar = (xe.b) this.f15979f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ze.a) ((com.google.firebase.messaging.d) bVar.f15976b)).skip(bVar.i()) == 0) {
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
        this.f15979f = bVar2;
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
        this.f15976b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f15978e;
        if (pVar != null) {
            pVar.f15979f = (p) this.f15979f;
        } else {
            p pVar2 = (p) this.f15976b;
            if (pVar2 != null) {
                pVar2.f15977c = (p) this.f15979f;
            }
        }
        p pVar3 = (p) this.f15979f;
        if (pVar3 != null) {
            pVar3.f15978e = pVar;
        } else {
            p pVar4 = (p) this.f15976b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f15976b = null;
        this.f15979f = null;
        this.f15978e = null;
    }

    public String toString() {
        switch (this.f15975a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f15975a = 1;
        this.f15976b = dVar;
        this.f15977c = pVar;
        this.d = str;
        this.f15978e = new DataInputStream(dVar);
    }
}
