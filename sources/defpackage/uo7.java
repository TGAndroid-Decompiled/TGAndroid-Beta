package defpackage;

import j$.util.Objects;
public final class uo7 extends ja {
    public int c;
    public int d;
    public String e;
    public String f;
    public zo7 g;
    public int h;
    public boolean i;

    public static uo7 b(int i, String str, boolean z) {
        ?? jaVar = new ja(1, true);
        jaVar.c = i;
        jaVar.e = str;
        jaVar.i = z;
        return jaVar;
    }

    public static uo7 c(int i, String str, String str2) {
        ?? jaVar = new ja(5, true);
        jaVar.c = i;
        jaVar.e = str;
        jaVar.f = str2;
        return jaVar;
    }

    public static uo7 d(int i, String str) {
        ?? jaVar = new ja(4, true);
        jaVar.c = i;
        jaVar.e = str;
        return jaVar;
    }

    @Override
    public final boolean a(ja jaVar) {
        if (this != jaVar) {
            if (uo7.class == jaVar.getClass()) {
                uo7 uo7Var = (uo7) jaVar;
                if (this.c == uo7Var.c && this.d == uo7Var.d && this.h == uo7Var.h && this.i == uo7Var.i && Objects.equals(this.e, uo7Var.e) && Objects.equals(this.f, uo7Var.f) && this.g == uo7Var.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && uo7.class == obj.getClass()) {
                uo7 uo7Var = (uo7) obj;
                if (this.c == uo7Var.c && this.h == uo7Var.h) {
                    if (this.a != 8) {
                        if (this.d == uo7Var.d && Objects.equals(this.e, uo7Var.e)) {
                            if (this.a != 6 && !Objects.equals(this.f, uo7Var.f)) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (this.g == uo7Var.g) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
