package kf;

import c8.g1;
import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f18327a;
    public Object f18328b;
    public Object f18329c;
    public Object d;
    public Object f18330e;
    public Object f18331f;

    public p() {
        this.f18327a = 0;
        this.f18328b = null;
        this.f18329c = null;
        this.d = null;
        this.f18330e = null;
        this.f18331f = null;
    }

    public abstract void a(g1 g1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f18331f = pVar;
            pVar.f18330e = pVar2;
            this.d = pVar;
            return;
        }
        this.f18329c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f18328b;
        DataInputStream dataInputStream = (DataInputStream) this.f18330e;
        sf.b bVar = (sf.b) this.f18331f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f18328b)).skip(bVar.i()) == 0) {
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
        this.f18331f = bVar2;
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
        this.f18328b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f18330e;
        if (pVar != null) {
            pVar.f18331f = (p) this.f18331f;
        } else {
            p pVar2 = (p) this.f18328b;
            if (pVar2 != null) {
                pVar2.f18329c = (p) this.f18331f;
            }
        }
        p pVar3 = (p) this.f18331f;
        if (pVar3 != null) {
            pVar3.f18330e = pVar;
        } else {
            p pVar4 = (p) this.f18328b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f18328b = null;
        this.f18331f = null;
        this.f18330e = null;
    }

    public String toString() {
        switch (this.f18327a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f18327a = 1;
        this.f18328b = dVar;
        this.f18329c = pVar;
        this.d = str;
        this.f18330e = new DataInputStream(dVar);
    }
}
