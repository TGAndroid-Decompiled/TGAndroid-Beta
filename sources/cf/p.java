package cf;

import com.google.android.gms.internal.vision.e2;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import v7.e5;
public abstract class p {
    public final int f4649a;
    public Object f4650b;
    public Object f4651c;
    public Object d;
    public Object f4652e;
    public Object f4653f;

    public p() {
        this.f4649a = 0;
        this.f4650b = null;
        this.f4651c = null;
        this.d = null;
        this.f4652e = null;
        this.f4653f = null;
    }

    public abstract void a(e5 e5Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 != null) {
            pVar2.f4653f = pVar;
            pVar.f4652e = pVar2;
            this.d = pVar;
            return;
        }
        this.f4651c = pVar;
        this.d = pVar;
    }

    public lf.b c() {
        nf.a aVar;
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f4650b;
        DataInputStream dataInputStream = (DataInputStream) this.f4652e;
        lf.b bVar = (lf.b) this.f4653f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((nf.a) ((com.google.firebase.messaging.d) bVar.f4650b)).skip(bVar.i()) == 0) {
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
        this.f4653f = bVar2;
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
        this.f4650b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f4652e;
        if (pVar != null) {
            pVar.f4653f = (p) this.f4653f;
        } else {
            p pVar2 = (p) this.f4650b;
            if (pVar2 != null) {
                pVar2.f4651c = (p) this.f4653f;
            }
        }
        p pVar3 = (p) this.f4653f;
        if (pVar3 != null) {
            pVar3.f4652e = pVar;
        } else {
            p pVar4 = (p) this.f4650b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f4650b = null;
        this.f4653f = null;
        this.f4652e = null;
    }

    public String toString() {
        switch (this.f4649a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f4649a = 1;
        this.f4650b = dVar;
        this.f4651c = pVar;
        this.d = str;
        this.f4652e = new DataInputStream(dVar);
    }
}
