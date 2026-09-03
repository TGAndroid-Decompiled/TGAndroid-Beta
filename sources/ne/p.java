package ne;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import k7.g0;
public abstract class p {
    public final int f14939a;
    public Object f14940b;
    public Object f14941c;
    public Object d;
    public Object e;
    public Object f14942f;

    public p() {
        this.f14939a = 0;
        this.f14940b = null;
        this.f14941c = null;
        this.d = null;
        this.e = null;
        this.f14942f = null;
    }

    public abstract void a(g0 g0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f14942f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
            return;
        }
        this.f14941c = pVar;
        this.d = pVar;
    }

    public we.b c() {
        ye.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f14940b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        we.b bVar = (we.b) this.f14942f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ye.a) ((com.google.firebase.messaging.d) bVar.f14940b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new ye.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new ye.a(dVar, 8L, readInt - 8);
        }
        we.b bVar2 = new we.b(aVar, this, str, 0);
        this.f14942f = bVar2;
        return bVar2;
    }

    public we.b d(String str) {
        we.b c3 = c();
        String str2 = (String) c3.d;
        if (str2.matches(str)) {
            return c3;
        }
        throw new IOException(e2.c.k("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f14940b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f14942f = (p) this.f14942f;
        } else {
            p pVar2 = (p) this.f14940b;
            if (pVar2 != null) {
                pVar2.f14941c = (p) this.f14942f;
            }
        }
        p pVar3 = (p) this.f14942f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.f14940b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f14940b = null;
        this.f14942f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f14939a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f14939a = 1;
        this.f14940b = dVar;
        this.f14941c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
