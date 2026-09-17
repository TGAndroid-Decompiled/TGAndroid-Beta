package bf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.i0;
public abstract class p {
    public final int f2664a;
    public Object f2665b;
    public Object f2666c;
    public Object d;
    public Object f2667e;
    public Object f2668f;

    public p() {
        this.f2664a = 0;
        this.f2665b = null;
        this.f2666c = null;
        this.d = null;
        this.f2667e = null;
        this.f2668f = null;
    }

    public abstract void a(i0 i0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f2668f = pVar;
            pVar.f2667e = pVar2;
            this.d = pVar;
            return;
        }
        this.f2666c = pVar;
        this.d = pVar;
    }

    public lf.b c() {
        nf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f2665b;
        DataInputStream dataInputStream = (DataInputStream) this.f2667e;
        lf.b bVar = (lf.b) this.f2668f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((nf.a) ((com.google.firebase.messaging.d) bVar.f2665b)).skip(bVar.i()) == 0) {
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
        this.f2668f = bVar2;
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
        this.f2665b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f2667e;
        if (pVar != null) {
            pVar.f2668f = (p) this.f2668f;
        } else {
            p pVar2 = (p) this.f2665b;
            if (pVar2 != null) {
                pVar2.f2666c = (p) this.f2668f;
            }
        }
        p pVar3 = (p) this.f2668f;
        if (pVar3 != null) {
            pVar3.f2667e = pVar;
        } else {
            p pVar4 = (p) this.f2665b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f2665b = null;
        this.f2668f = null;
        this.f2667e = null;
    }

    public String toString() {
        switch (this.f2664a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f2664a = 1;
        this.f2665b = dVar;
        this.f2666c = pVar;
        this.d = str;
        this.f2667e = new DataInputStream(dVar);
    }
}
