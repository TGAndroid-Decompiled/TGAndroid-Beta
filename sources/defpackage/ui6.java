package defpackage;

import java.io.DataInputStream;
import java.io.EOFException;
public abstract class ui6 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ui6(h61 h61Var, ui6 ui6Var, String str) {
        this.a = (byte) 0;
        this.b = h61Var;
        this.c = ui6Var;
        this.d = str;
        this.e = new DataInputStream(h61Var);
    }

    public void a(knd kndVar) {
        kndVar.v(this);
    }

    public final void b(ui6 ui6Var) {
        ui6Var.g();
        ui6Var.e(this);
        ui6 ui6Var2 = (ui6) this.d;
        if (ui6Var2 != null) {
            ui6Var2.f = ui6Var;
            ui6Var.e = ui6Var2;
            this.d = ui6Var;
            return;
        }
        this.c = ui6Var;
        this.d = ui6Var;
    }

    public final ti6 c() {
        a19 a19Var;
        h61 h61Var = (h61) this.b;
        DataInputStream dataInputStream = (DataInputStream) this.e;
        ti6 ti6Var = (ti6) this.f;
        if (ti6Var != null) {
            while (ti6Var.i() > 0) {
                if (((a19) ((h61) ti6Var.b)).skip(ti6Var.i()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            a19Var = new a19(h61Var, 16L, dataInputStream.readLong() - 16);
        } else {
            a19Var = new a19(h61Var, 8L, readInt - 8);
        }
        ti6 ti6Var2 = new ti6(a19Var, this, str, (byte) 0);
        this.f = ti6Var2;
        return ti6Var2;
    }

    public final ti6 d(String str) {
        ti6 c = c();
        String str2 = (String) c.d;
        if (str2.matches(str)) {
            return c;
        }
        wa3.d(td4.r("atom type mismatch, expected ", str, ", got ", str2));
        return null;
    }

    public void e(ui6 ui6Var) {
        this.b = ui6Var;
    }

    public String f() {
        return "";
    }

    public final void g() {
        ui6 ui6Var = (ui6) this.e;
        if (ui6Var != null) {
            ui6Var.f = (ui6) this.f;
        } else {
            ui6 ui6Var2 = (ui6) this.b;
            if (ui6Var2 != null) {
                ui6Var2.c = (ui6) this.f;
            }
        }
        ui6 ui6Var3 = (ui6) this.f;
        if (ui6Var3 != null) {
            ui6Var3.e = ui6Var;
        } else {
            ui6 ui6Var4 = (ui6) this.b;
            if (ui6Var4 != null) {
                ui6Var4.d = ui6Var;
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

    public ui6() {
        this.a = (byte) 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
