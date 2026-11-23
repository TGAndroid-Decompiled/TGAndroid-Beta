package kf;

import c8.g1;
import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f18228a;
    public Object f18229b;
    public Object f18230c;
    public Object d;
    public Object f18231e;
    public Object f18232f;

    public p() {
        this.f18228a = 0;
        this.f18229b = null;
        this.f18230c = null;
        this.d = null;
        this.f18231e = null;
        this.f18232f = null;
    }

    public abstract void a(g1 g1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f18232f = pVar;
            pVar.f18231e = pVar2;
            this.d = pVar;
            return;
        }
        this.f18230c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f18229b;
        DataInputStream dataInputStream = (DataInputStream) this.f18231e;
        sf.b bVar = (sf.b) this.f18232f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f18229b)).skip(bVar.i()) == 0) {
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
        this.f18232f = bVar2;
        return bVar2;
    }

    public sf.b d(String str) {
        sf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(e2.l("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f18229b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f18231e;
        if (pVar != null) {
            pVar.f18232f = (p) this.f18232f;
        } else {
            p pVar2 = (p) this.f18229b;
            if (pVar2 != null) {
                pVar2.f18230c = (p) this.f18232f;
            }
        }
        p pVar3 = (p) this.f18232f;
        if (pVar3 != null) {
            pVar3.f18231e = pVar;
        } else {
            p pVar4 = (p) this.f18229b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f18229b = null;
        this.f18232f = null;
        this.f18231e = null;
    }

    public String toString() {
        switch (this.f18228a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f18228a = 1;
        this.f18229b = dVar;
        this.f18230c = pVar;
        this.d = str;
        this.f18231e = new DataInputStream(dVar);
    }
}
