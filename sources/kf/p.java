package kf;

import c8.f1;
import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f18234a;
    public Object f18235b;
    public Object f18236c;
    public Object d;
    public Object f18237e;
    public Object f18238f;

    public p() {
        this.f18234a = 0;
        this.f18235b = null;
        this.f18236c = null;
        this.d = null;
        this.f18237e = null;
        this.f18238f = null;
    }

    public abstract void a(f1 f1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f18238f = pVar;
            pVar.f18237e = pVar2;
            this.d = pVar;
            return;
        }
        this.f18236c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f18235b;
        DataInputStream dataInputStream = (DataInputStream) this.f18237e;
        sf.b bVar = (sf.b) this.f18238f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f18235b)).skip(bVar.i()) == 0) {
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
        this.f18238f = bVar2;
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
        this.f18235b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f18237e;
        if (pVar != null) {
            pVar.f18238f = (p) this.f18238f;
        } else {
            p pVar2 = (p) this.f18235b;
            if (pVar2 != null) {
                pVar2.f18236c = (p) this.f18238f;
            }
        }
        p pVar3 = (p) this.f18238f;
        if (pVar3 != null) {
            pVar3.f18237e = pVar;
        } else {
            p pVar4 = (p) this.f18235b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f18235b = null;
        this.f18238f = null;
        this.f18237e = null;
    }

    public String toString() {
        switch (this.f18234a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f18234a = 1;
        this.f18235b = dVar;
        this.f18236c = pVar;
        this.d = str;
        this.f18237e = new DataInputStream(dVar);
    }
}
