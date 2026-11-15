package kf;

import c8.d1;
import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public abstract class p {
    public final int f17839a;
    public Object f17840b;
    public Object f17841c;
    public Object d;
    public Object f17842e;
    public Object f17843f;

    public p() {
        this.f17839a = 0;
        this.f17840b = null;
        this.f17841c = null;
        this.d = null;
        this.f17842e = null;
        this.f17843f = null;
    }

    public abstract void a(d1 d1Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f17843f = pVar;
            pVar.f17842e = pVar2;
            this.d = pVar;
            return;
        }
        this.f17841c = pVar;
        this.d = pVar;
    }

    public sf.b c() {
        uf.a aVar;
        ab.d dVar = (ab.d) this.f17840b;
        DataInputStream dataInputStream = (DataInputStream) this.f17842e;
        sf.b bVar = (sf.b) this.f17843f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((uf.a) ((ab.d) bVar.f17840b)).skip(bVar.i()) == 0) {
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
        this.f17843f = bVar2;
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
        this.f17840b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f17842e;
        if (pVar != null) {
            pVar.f17843f = (p) this.f17843f;
        } else {
            p pVar2 = (p) this.f17840b;
            if (pVar2 != null) {
                pVar2.f17841c = (p) this.f17843f;
            }
        }
        p pVar3 = (p) this.f17843f;
        if (pVar3 != null) {
            pVar3.f17842e = pVar;
        } else {
            p pVar4 = (p) this.f17840b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f17840b = null;
        this.f17843f = null;
        this.f17842e = null;
    }

    public String toString() {
        switch (this.f17839a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(ab.d dVar, p pVar, String str) {
        this.f17839a = 1;
        this.f17840b = dVar;
        this.f17841c = pVar;
        this.d = str;
        this.f17842e = new DataInputStream(dVar);
    }
}
