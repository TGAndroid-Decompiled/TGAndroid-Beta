package kf;

import c8.f1;
import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f18265a;
    public Object f18266b;
    public Object f18267c;
    public Object d;
    public Object f18268e;
    public Object f18269f;

    public p() {
        this.f18265a = 0;
        this.f18266b = null;
        this.f18267c = null;
        this.d = null;
        this.f18268e = null;
        this.f18269f = null;
    }

    public abstract void a(f1 f1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f18269f = pVar;
            pVar.f18268e = pVar2;
            this.d = pVar;
            return;
        }
        this.f18267c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f18266b;
        DataInputStream dataInputStream = (DataInputStream) this.f18268e;
        sf.b bVar = (sf.b) this.f18269f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f18266b)).skip(bVar.i()) == 0) {
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
        this.f18269f = bVar2;
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
        this.f18266b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f18268e;
        if (pVar != null) {
            pVar.f18269f = (p) this.f18269f;
        } else {
            p pVar2 = (p) this.f18266b;
            if (pVar2 != null) {
                pVar2.f18267c = (p) this.f18269f;
            }
        }
        p pVar3 = (p) this.f18269f;
        if (pVar3 != null) {
            pVar3.f18268e = pVar;
        } else {
            p pVar4 = (p) this.f18266b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f18266b = null;
        this.f18269f = null;
        this.f18268e = null;
    }

    public String toString() {
        switch (this.f18265a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f18265a = 1;
        this.f18266b = dVar;
        this.f18267c = pVar;
        this.d = str;
        this.f18268e = new DataInputStream(dVar);
    }
}
