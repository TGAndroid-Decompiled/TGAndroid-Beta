package cf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.e5;
public abstract class p {
    public final int f4651a;
    public Object f4652b;
    public Object f4653c;
    public Object d;
    public Object f4654e;
    public Object f4655f;

    public p() {
        this.f4651a = 0;
        this.f4652b = null;
        this.f4653c = null;
        this.d = null;
        this.f4654e = null;
        this.f4655f = null;
    }

    public abstract void a(e5 e5Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f4655f = pVar;
            pVar.f4654e = pVar2;
            this.d = pVar;
            return;
        }
        this.f4653c = pVar;
        this.d = pVar;
    }

    public lf.b c() {
        nf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f4652b;
        DataInputStream dataInputStream = (DataInputStream) this.f4654e;
        lf.b bVar = (lf.b) this.f4655f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((nf.a) ((com.google.firebase.messaging.d) bVar.f4652b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new nf.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new nf.a(dVar, 8L, readInt - 8);
        }
        lf.b bVar2 = new lf.b(aVar, this, str, 0);
        this.f4655f = bVar2;
        return bVar2;
    }

    public lf.b d(String str) {
        lf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(e2.j("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f4652b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f4654e;
        if (pVar != null) {
            pVar.f4655f = (p) this.f4655f;
        } else {
            p pVar2 = (p) this.f4652b;
            if (pVar2 != null) {
                pVar2.f4653c = (p) this.f4655f;
            }
        }
        p pVar3 = (p) this.f4655f;
        if (pVar3 != null) {
            pVar3.f4654e = pVar;
        } else {
            p pVar4 = (p) this.f4652b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f4652b = null;
        this.f4655f = null;
        this.f4654e = null;
    }

    public String toString() {
        switch (this.f4651a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f4651a = 1;
        this.f4652b = dVar;
        this.f4653c = pVar;
        this.d = str;
        this.f4654e = new DataInputStream(dVar);
    }
}
