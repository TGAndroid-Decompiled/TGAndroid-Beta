package kf;

import c8.b1;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f17280a;
    public Object f17281b;
    public Object f17282c;
    public Object d;
    public Object f17283e;
    public Object f17284f;

    public p() {
        this.f17280a = 0;
        this.f17281b = null;
        this.f17282c = null;
        this.d = null;
        this.f17283e = null;
        this.f17284f = null;
    }

    public abstract void a(b1 b1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f17284f = pVar;
            pVar.f17283e = pVar2;
            this.d = pVar;
            return;
        }
        this.f17282c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f17281b;
        DataInputStream dataInputStream = (DataInputStream) this.f17283e;
        sf.b bVar = (sf.b) this.f17284f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f17281b)).skip(bVar.i()) == 0) {
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
        this.f17284f = bVar2;
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
        this.f17281b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f17283e;
        if (pVar != null) {
            pVar.f17284f = (p) this.f17284f;
        } else {
            p pVar2 = (p) this.f17281b;
            if (pVar2 != null) {
                pVar2.f17282c = (p) this.f17284f;
            }
        }
        p pVar3 = (p) this.f17284f;
        if (pVar3 != null) {
            pVar3.f17283e = pVar;
        } else {
            p pVar4 = (p) this.f17281b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f17281b = null;
        this.f17284f = null;
        this.f17283e = null;
    }

    public String toString() {
        switch (this.f17280a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f17280a = 1;
        this.f17281b = dVar;
        this.f17282c = pVar;
        this.d = str;
        this.f17283e = new DataInputStream(dVar);
    }
}
