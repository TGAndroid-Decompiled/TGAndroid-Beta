package bf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.j0;
public abstract class p {
    public final int f3830a;
    public Object f3831b;
    public Object f3832c;
    public Object d;
    public Object f3833e;
    public Object f3834f;

    public p() {
        this.f3830a = 0;
        this.f3831b = null;
        this.f3832c = null;
        this.d = null;
        this.f3833e = null;
        this.f3834f = null;
    }

    public abstract void a(j0 j0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f3834f = pVar;
            pVar.f3833e = pVar2;
            this.d = pVar;
            return;
        }
        this.f3832c = pVar;
        this.d = pVar;
    }

    public kf.b c() {
        mf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f3831b;
        DataInputStream dataInputStream = (DataInputStream) this.f3833e;
        kf.b bVar = (kf.b) this.f3834f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((mf.a) ((com.google.firebase.messaging.d) bVar.f3831b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new mf.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new mf.a(dVar, 8L, readInt - 8);
        }
        kf.b bVar2 = new kf.b(aVar, this, str, 0);
        this.f3834f = bVar2;
        return bVar2;
    }

    public kf.b d(String str) {
        kf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(e2.j("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f3831b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f3833e;
        if (pVar != null) {
            pVar.f3834f = (p) this.f3834f;
        } else {
            p pVar2 = (p) this.f3831b;
            if (pVar2 != null) {
                pVar2.f3832c = (p) this.f3834f;
            }
        }
        p pVar3 = (p) this.f3834f;
        if (pVar3 != null) {
            pVar3.f3833e = pVar;
        } else {
            p pVar4 = (p) this.f3831b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f3831b = null;
        this.f3834f = null;
        this.f3833e = null;
    }

    public String toString() {
        switch (this.f3830a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f3830a = 1;
        this.f3831b = dVar;
        this.f3832c = pVar;
        this.d = str;
        this.f3833e = new DataInputStream(dVar);
    }
}
