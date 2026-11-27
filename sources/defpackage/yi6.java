package defpackage;

import java.io.DataInputStream;
import java.io.EOFException;
public abstract class yi6 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yi6(i51 i51Var, yi6 yi6Var, String str) {
        this.a = (byte) 0;
        this.b = i51Var;
        this.c = yi6Var;
        this.d = str;
        this.e = new DataInputStream(i51Var);
    }

    public void a(zpd zpdVar) {
        zpdVar.v(this);
    }

    public final void b(yi6 yi6Var) {
        yi6Var.g();
        yi6Var.e(this);
        yi6 yi6Var2 = (yi6) this.d;
        if (yi6Var2 != null) {
            yi6Var2.f = yi6Var;
            yi6Var.e = yi6Var2;
            this.d = yi6Var;
            return;
        }
        this.c = yi6Var;
        this.d = yi6Var;
    }

    public final xi6 c() {
        m29 m29Var;
        i51 i51Var = (i51) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        xi6 xi6Var = (xi6) this.f;
        if (xi6Var != null) {
            while (xi6Var.i() > 0) {
                if (((m29) ((i51) xi6Var.b)).skip(xi6Var.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            m29Var = new m29(i51Var, 16L, dataInputStream.readLong() - 16);
        } else {
            m29Var = new m29(i51Var, 8L, readInt - 8);
        }
        xi6 xi6Var2 = new xi6(m29Var, this, str, (byte) 0);
        this.f = xi6Var2;
        return xi6Var2;
    }

    public final xi6 d(String str) {
        xi6 c = c();
        String str2 = (String) c.d;
        if (str2.matches(str)) {
            return c;
        }
        su3.e(qd4.q("atom type mismatch, expected ", str, ", got ", str2));
        return null;
    }

    public void e(yi6 yi6Var) {
        this.b = yi6Var;
    }

    public String f() {
        return "";
    }

    public final void g() {
        yi6 yi6Var = (yi6) this.e;
        if (yi6Var != null) {
            yi6Var.f = (yi6) this.f;
        } else {
            yi6 yi6Var2 = (yi6) this.b;
            if (yi6Var2 != null) {
                yi6Var2.c = (yi6) this.f;
            }
        }
        yi6 yi6Var3 = (yi6) this.f;
        if (yi6Var3 != null) {
            yi6Var3.e = yi6Var;
        } else {
            yi6 yi6Var4 = (yi6) this.b;
            if (yi6Var4 != null) {
                yi6Var4.d = yi6Var;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + "{" + f() + "}";
            default:
                return super.toString();
        }
    }

    public yi6() {
        this.a = (byte) 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
