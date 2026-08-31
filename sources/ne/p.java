package ne;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import k7.h0;
public abstract class p {
    public final int f15973a;
    public Object f15974b;
    public Object f15975c;
    public Object d;
    public Object f15976e;
    public Object f15977f;

    public p() {
        this.f15973a = 0;
        this.f15974b = null;
        this.f15975c = null;
        this.d = null;
        this.f15976e = null;
        this.f15977f = null;
    }

    public abstract void a(h0 h0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f15977f = pVar;
            pVar.f15976e = pVar2;
            this.d = pVar;
            return;
        }
        this.f15975c = pVar;
        this.d = pVar;
    }

    public xe.b c() {
        ze.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f15974b;
        DataInputStream dataInputStream = (DataInputStream) this.f15976e;
        xe.b bVar = (xe.b) this.f15977f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ze.a) ((com.google.firebase.messaging.d) bVar.f15974b)).skip(bVar.i()) == 0) {
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
        this.f15977f = bVar2;
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
        this.f15974b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f15976e;
        if (pVar != null) {
            pVar.f15977f = (p) this.f15977f;
        } else {
            p pVar2 = (p) this.f15974b;
            if (pVar2 != null) {
                pVar2.f15975c = (p) this.f15977f;
            }
        }
        p pVar3 = (p) this.f15977f;
        if (pVar3 != null) {
            pVar3.f15976e = pVar;
        } else {
            p pVar4 = (p) this.f15974b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f15974b = null;
        this.f15977f = null;
        this.f15976e = null;
    }

    public String toString() {
        switch (this.f15973a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f15973a = 1;
        this.f15974b = dVar;
        this.f15975c = pVar;
        this.d = str;
        this.f15976e = new DataInputStream(dVar);
    }
}
