package le;

import j7.l1;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f15204a;
    public Object f15205b;
    public Object f15206c;
    public Object d;
    public Object f15207e;
    public Object f15208f;

    public p() {
        this.f15204a = 0;
        this.f15205b = null;
        this.f15206c = null;
        this.d = null;
        this.f15207e = null;
        this.f15208f = null;
    }

    public abstract void a(i7.t tVar);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f15208f = pVar;
            pVar.f15207e = pVar2;
            this.d = pVar;
            return;
        }
        this.f15206c = pVar;
        this.d = pVar;
    }

    public ve.b c() {
        xe.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f15205b;
        DataInputStream dataInputStream = (DataInputStream) this.f15207e;
        ve.b bVar = (ve.b) this.f15208f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((xe.a) ((com.google.firebase.messaging.d) bVar.f15205b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new xe.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new xe.a(dVar, 8L, readInt - 8);
        }
        ve.b bVar2 = new ve.b(aVar, this, str, 0);
        this.f15208f = bVar2;
        return bVar2;
    }

    public ve.b d(String str) {
        ve.b c3 = c();
        String str2 = (String) c3.d;
        if (str2.matches(str)) {
            return c3;
        }
        throw new IOException(l1.n("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f15205b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f15207e;
        if (pVar != null) {
            pVar.f15208f = (p) this.f15208f;
        } else {
            p pVar2 = (p) this.f15205b;
            if (pVar2 != null) {
                pVar2.f15206c = (p) this.f15208f;
            }
        }
        p pVar3 = (p) this.f15208f;
        if (pVar3 != null) {
            pVar3.f15207e = pVar;
        } else {
            p pVar4 = (p) this.f15205b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f15205b = null;
        this.f15208f = null;
        this.f15207e = null;
    }

    public String toString() {
        switch (this.f15204a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f15204a = 1;
        this.f15205b = dVar;
        this.f15206c = pVar;
        this.d = str;
        this.f15207e = new DataInputStream(dVar);
    }
}
