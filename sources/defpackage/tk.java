package defpackage;

import j$.util.Objects;
public final class tk {
    public final long a;
    public final bqb b;
    public final int c;
    public final rz6 d;
    public final long e;
    public final bqb f;
    public final int g;
    public final rz6 h;
    public final long i;
    public final long j;

    public tk(long j, bqb bqbVar, int i, rz6 rz6Var, long j2, bqb bqbVar2, int i2, rz6 rz6Var2, long j3, long j4) {
        this.a = j;
        this.b = bqbVar;
        this.c = i;
        this.d = rz6Var;
        this.e = j2;
        this.f = bqbVar2;
        this.g = i2;
        this.h = rz6Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tk.class == obj.getClass()) {
                tk tkVar = (tk) obj;
                if (this.a == tkVar.a && this.c == tkVar.c && this.e == tkVar.e && this.g == tkVar.g && this.i == tkVar.i && this.j == tkVar.j && this.b.equals(tkVar.b) && Objects.equals(this.d, tkVar.d) && Objects.equals(this.f, tkVar.f) && Objects.equals(this.h, tkVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
