package ef;

import a8.bc;
import c3.h0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f9936a;
    public Object f9937b;
    public Object f9938c;
    public Object d;
    public Object e;
    public Object f9939f;

    public p() {
        this.f9936a = 0;
        this.f9937b = null;
        this.f9938c = null;
        this.d = null;
        this.e = null;
        this.f9939f = null;
    }

    public abstract void a(bc bcVar);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f9939f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
            return;
        }
        this.f9938c = pVar;
        this.d = pVar;
    }

    public nf.b c() {
        pf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f9937b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        nf.b bVar = (nf.b) this.f9939f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((pf.a) ((com.google.firebase.messaging.d) bVar.f9937b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new pf.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new pf.a(dVar, 8L, readInt - 8);
        }
        nf.b bVar2 = new nf.b(aVar, this, str, 0);
        this.f9939f = bVar2;
        return bVar2;
    }

    public nf.b d(String str) {
        nf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(h0.m("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f9937b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f9939f = (p) this.f9939f;
        } else {
            p pVar2 = (p) this.f9937b;
            if (pVar2 != null) {
                pVar2.f9938c = (p) this.f9939f;
            }
        }
        p pVar3 = (p) this.f9939f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.f9937b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f9937b = null;
        this.f9939f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f9936a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f9936a = 1;
        this.f9937b = dVar;
        this.f9938c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
