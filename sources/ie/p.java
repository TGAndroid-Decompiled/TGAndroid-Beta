package ie;

import f7.p8;
import j3.r0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f11121a;
    public Object f11122b;
    public Object f11123c;
    public Object d;
    public Object f11124e;
    public Object f11125f;

    public p() {
        this.f11121a = 0;
        this.f11122b = null;
        this.f11123c = null;
        this.d = null;
        this.f11124e = null;
        this.f11125f = null;
    }

    public abstract void a(p8 p8Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f11125f = pVar;
            pVar.f11124e = pVar2;
            this.d = pVar;
            return;
        }
        this.f11123c = pVar;
        this.d = pVar;
    }

    public se.b c() {
        ue.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f11122b;
        DataInputStream dataInputStream = (DataInputStream) this.f11124e;
        se.b bVar = (se.b) this.f11125f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ue.a) ((com.google.firebase.messaging.d) bVar.f11122b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new ue.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new ue.a(dVar, 8L, readInt - 8);
        }
        se.b bVar2 = new se.b(aVar, this, str, 0);
        this.f11125f = bVar2;
        return bVar2;
    }

    public se.b d(String str) {
        se.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(r0.o("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f11122b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f11124e;
        if (pVar != null) {
            pVar.f11125f = (p) this.f11125f;
        } else {
            p pVar2 = (p) this.f11122b;
            if (pVar2 != null) {
                pVar2.f11123c = (p) this.f11125f;
            }
        }
        p pVar3 = (p) this.f11125f;
        if (pVar3 != null) {
            pVar3.f11124e = pVar;
        } else {
            p pVar4 = (p) this.f11122b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f11122b = null;
        this.f11125f = null;
        this.f11124e = null;
    }

    public String toString() {
        switch (this.f11121a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f11121a = 1;
        this.f11122b = dVar;
        this.f11123c = pVar;
        this.d = str;
        this.f11124e = new DataInputStream(dVar);
    }
}
