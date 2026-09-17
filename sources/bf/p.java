package bf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.i0;
public abstract class p {
    public final int f3551a;
    public Object f3552b;
    public Object f3553c;
    public Object d;
    public Object e;
    public Object f3554f;

    public p() {
        this.f3551a = 0;
        this.f3552b = null;
        this.f3553c = null;
        this.d = null;
        this.e = null;
        this.f3554f = null;
    }

    public abstract void a(i0 i0Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f3554f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
            return;
        }
        this.f3553c = pVar;
        this.d = pVar;
    }

    public kf.b c() {
        mf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f3552b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        kf.b bVar = (kf.b) this.f3554f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((mf.a) ((com.google.firebase.messaging.d) bVar.f3552b)).skip(bVar.i()) == 0) {
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
        this.f3554f = bVar2;
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
        this.f3552b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f3554f = (p) this.f3554f;
        } else {
            p pVar2 = (p) this.f3552b;
            if (pVar2 != null) {
                pVar2.f3553c = (p) this.f3554f;
            }
        }
        p pVar3 = (p) this.f3554f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.f3552b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f3552b = null;
        this.f3554f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f3551a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f3551a = 1;
        this.f3552b = dVar;
        this.f3553c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
