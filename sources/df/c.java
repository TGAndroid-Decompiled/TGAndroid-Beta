package df;

import c3.i0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import w7.j8;
public abstract class c {
    public final int f5876a;
    public Object f5877b;
    public Object f5878c;
    public Object d;
    public Object e;
    public Object f5879f;

    public c() {
        this.f5876a = 1;
        this.f5877b = null;
        this.f5878c = null;
        this.d = null;
        this.e = null;
        this.f5879f = null;
    }

    public abstract void a(j8 j8Var);

    public void b(c cVar) {
        cVar.g();
        cVar.e(this);
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            cVar2.f5879f = cVar;
            cVar.e = cVar2;
            this.d = cVar;
            return;
        }
        this.f5878c = cVar;
        this.d = cVar;
    }

    public b c() {
        ff.b bVar;
        ff.a aVar = (ff.a) this.f5877b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        b bVar2 = (b) this.f5879f;
        if (bVar2 != null) {
            while (bVar2.i() > 0) {
                if (((ff.b) ((ff.a) bVar2.f5877b)).skip(bVar2.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            bVar = new ff.b(aVar, 16L, dataInputStream.readLong() - 16);
        } else {
            bVar = new ff.b(aVar, 8L, readInt - 8);
        }
        b bVar3 = new b(bVar, this, str, 0);
        this.f5879f = bVar3;
        return bVar3;
    }

    public b d(String str) {
        b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(i0.n("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(c cVar) {
        this.f5877b = cVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        c cVar = (c) this.e;
        if (cVar != null) {
            cVar.f5879f = (c) this.f5879f;
        } else {
            c cVar2 = (c) this.f5877b;
            if (cVar2 != null) {
                cVar2.f5878c = (c) this.f5879f;
            }
        }
        c cVar3 = (c) this.f5879f;
        if (cVar3 != null) {
            cVar3.e = cVar;
        } else {
            c cVar4 = (c) this.f5877b;
            if (cVar4 != null) {
                cVar4.d = cVar;
            }
        }
        this.f5877b = null;
        this.f5879f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f5876a) {
            case 1:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public c(ff.a aVar, c cVar, String str) {
        this.f5876a = 0;
        this.f5877b = aVar;
        this.f5878c = cVar;
        this.d = str;
        this.e = new DataInputStream(aVar);
    }
}
