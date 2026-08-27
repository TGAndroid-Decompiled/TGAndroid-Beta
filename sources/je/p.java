package je;

import g7.r8;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public abstract class p {

    public final int f12923a;

    public Object f12924b;

    public Object f12925c;
    public Object d;

    public Object f12926e;

    public Object f12927f;

    public p() {
        this.f12923a = 0;
        this.f12924b = null;
        this.f12925c = null;
        this.d = null;
        this.f12926e = null;
        this.f12927f = null;
    }

    public abstract void a(r8 r8Var);

    public void b(p pVar) {
        pVar.g();
        pVar.e(this);
        p pVar2 = (p) this.d;
        if (pVar2 == null) {
            this.f12925c = pVar;
            this.d = pVar;
        } else {
            pVar2.f12927f = pVar;
            pVar.f12926e = pVar2;
            this.d = pVar;
        }
    }

    public te.b c() throws IOException {
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) this.f12924b;
        DataInputStream dataInputStream = (DataInputStream) this.f12926e;
        te.b bVar = (te.b) this.f12927f;
        if (bVar != null) {
            while (bVar.i() > 0) {
                if (((ve.a) ((com.google.firebase.messaging.d) bVar.f12924b)).skip(bVar.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int i10 = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        te.b bVar2 = new te.b(i10 == 1 ? new ve.a(dVar, 16L, dataInputStream.readLong() - 16) : new ve.a(dVar, 8L, i10 - 8), this, new String(bArr, "ISO8859_1"), 0);
        this.f12927f = bVar2;
        return bVar2;
    }

    public te.b d(String str) throws IOException {
        te.b bVarC = c();
        String str2 = (String) bVarC.d;
        if (str2.matches(str)) {
            return bVarC;
        }
        throw new IOException(i0.a.n("atom type mismatch, expected ", str, ", got ", str2));
    }

    public void e(p pVar) {
        this.f12924b = pVar;
    }

    public String f() {
        return "";
    }

    public void g() {
        p pVar = (p) this.f12926e;
        if (pVar != null) {
            pVar.f12927f = (p) this.f12927f;
        } else {
            p pVar2 = (p) this.f12924b;
            if (pVar2 != null) {
                pVar2.f12925c = (p) this.f12927f;
            }
        }
        p pVar3 = (p) this.f12927f;
        if (pVar3 != null) {
            pVar3.f12926e = pVar;
        } else {
            p pVar4 = (p) this.f12924b;
            if (pVar4 != null) {
                pVar4.d = pVar;
            }
        }
        this.f12924b = null;
        this.f12927f = null;
        this.f12926e = null;
    }

    public String toString() {
        switch (this.f12923a) {
            case 0:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public p(com.google.firebase.messaging.d dVar, p pVar, String str) {
        this.f12923a = 1;
        this.f12924b = dVar;
        this.f12925c = pVar;
        this.d = str;
        this.f12926e = new DataInputStream(dVar);
    }
}
