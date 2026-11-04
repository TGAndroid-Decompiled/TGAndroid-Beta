package gf;

import b8.lc;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f12265a;
    public Object f12266b;
    public Object f12267c;
    public Object d;
    public Object f12268e;
    public Object f12269f;

    public p() {
        this.f12265a = 0;
        this.f12266b = null;
        this.f12267c = null;
        this.d = null;
        this.f12268e = null;
        this.f12269f = null;
    }

    public abstract void a(lc lcVar);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f12269f = pVar;
            pVar.f12268e = pVar2;
            this.d = pVar;
            return;
        }
        this.f12267c = pVar;
        this.d = pVar;
    }

    public pf.b c() {
        rf.b bVar;
        rf.a aVar = (rf.a) this.f12266b;
        DataInputStream dataInputStream = (DataInputStream) this.f12268e;
        pf.b bVar2 = (pf.b) this.f12269f;
        if (bVar2 != null) {
            while (bVar2.i() > 0) {
                if (((rf.b) ((rf.a) bVar2.f12266b)).skip(bVar2.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            bVar = new rf.b(aVar, 16L, dataInputStream.readLong() - 16);
        } else {
            bVar = new rf.b(aVar, 8L, readInt - 8);
        }
        pf.b bVar3 = new pf.b(bVar, this, str, 0);
        this.f12269f = bVar3;
        return bVar3;
    }

    public pf.b d(String str) {
        pf.b c2 = c();
        String str2 = (String) c2.d;
        if (str2.matches(str)) {
            return c2;
        }
        throw new IOException(com.google.android.recaptcha.internal.a.k("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f12266b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f12268e;
        if (pVar != null) {
            pVar.f12269f = (p) this.f12269f;
        } else {
            p pVar2 = (p) this.f12266b;
            if (pVar2 != null) {
                pVar2.f12267c = (p) this.f12269f;
            }
        }
        p pVar3 = (p) this.f12269f;
        if (pVar3 != null) {
            pVar3.f12268e = pVar;
        } else {
            p pVar4 = (p) this.f12266b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f12266b = null;
        this.f12269f = null;
        this.f12268e = null;
    }

    public String toString() {
        switch (this.f12265a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(rf.a aVar, p pVar, String str) {
        this.f12265a = 1;
        this.f12266b = aVar;
        this.f12267c = pVar;
        this.d = str;
        this.f12268e = new DataInputStream(aVar);
    }
}
