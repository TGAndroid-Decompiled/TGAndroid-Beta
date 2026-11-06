package kf;

import c8.b1;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f17277a;
    public Object f17278b;
    public Object f17279c;
    public Object d;
    public Object f17280e;
    public Object f17281f;

    public p() {
        this.f17277a = 0;
        this.f17278b = null;
        this.f17279c = null;
        this.d = null;
        this.f17280e = null;
        this.f17281f = null;
    }

    public abstract void a(b1 b1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f17281f = pVar;
            pVar.f17280e = pVar2;
            this.d = pVar;
            return;
        }
        this.f17279c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f17278b;
        DataInputStream dataInputStream = (DataInputStream) this.f17280e;
        sf.b bVar = (sf.b) this.f17281f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f17278b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new uf.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new uf.a(dVar, 8L, readInt - 8);
        }
        sf.b bVar2 = new sf.b(aVar, this, str, 0);
        this.f17281f = bVar2;
        return bVar2;
    }

    public sf.b d(String str) {
        sf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(com.google.android.recaptcha.internal.a.l("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f17278b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f17280e;
        if (pVar != null) {
            pVar.f17281f = (p) this.f17281f;
        } else {
            p pVar2 = (p) this.f17278b;
            if (pVar2 != null) {
                pVar2.f17279c = (p) this.f17281f;
            }
        }
        p pVar3 = (p) this.f17281f;
        if (pVar3 != null) {
            pVar3.f17280e = pVar;
        } else {
            p pVar4 = (p) this.f17278b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f17278b = null;
        this.f17281f = null;
        this.f17280e = null;
    }

    public String toString() {
        switch (this.f17277a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f17277a = 1;
        this.f17278b = dVar;
        this.f17279c = pVar;
        this.d = str;
        this.f17280e = new DataInputStream(dVar);
    }
}
