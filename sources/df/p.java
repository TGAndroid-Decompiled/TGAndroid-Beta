package df;

import com.google.android.gms.internal.play_billing.k3;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.x6;
public abstract class p {
    public final int f7985a;
    public Object f7986b;
    public Object f7987c;
    public Object d;
    public Object e;
    public Object f7988f;

    public p() {
        this.f7985a = 0;
        this.f7986b = null;
        this.f7987c = null;
        this.d = null;
        this.e = null;
        this.f7988f = null;
    }

    public abstract void a(x6 x6Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f7988f = pVar;
            pVar.e = pVar2;
            this.d = pVar;
            return;
        }
        this.f7987c = pVar;
        this.d = pVar;
    }

    public mf.b c() {
        of.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f7986b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        mf.b bVar = (mf.b) this.f7988f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((of.a) ((com.google.firebase.messaging.d) bVar.f7986b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            aVar = new of.a(dVar, 16L, dataInputStream.readLong() - 16);
        } else {
            aVar = new of.a(dVar, 8L, readInt - 8);
        }
        mf.b bVar2 = new mf.b(aVar, this, str, 0);
        this.f7988f = bVar2;
        return bVar2;
    }

    public mf.b d(String str) {
        mf.b c10 = c();
        String str2 = (String) c10.d;
        if (str2.matches(str)) {
            return c10;
        }
        throw new IOException(k3.k("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f7986b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.e;
        if (pVar != null) {
            pVar.f7988f = (p) this.f7988f;
        } else {
            p pVar2 = (p) this.f7986b;
            if (pVar2 != null) {
                pVar2.f7987c = (p) this.f7988f;
            }
        }
        p pVar3 = (p) this.f7988f;
        if (pVar3 != null) {
            pVar3.e = pVar;
        } else {
            p pVar4 = (p) this.f7986b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f7986b = null;
        this.f7988f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f7985a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f7985a = 1;
        this.f7986b = dVar;
        this.f7987c = pVar;
        this.d = str;
        this.e = new DataInputStream(dVar);
    }
}
