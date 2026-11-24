package defpackage;

import j$.util.Objects;
public final class qm7 extends ja {
    public int c;
    public int d;
    public String e;
    public String f;
    public vm7 g;
    public int h;
    public boolean i;

    public static qm7 b(int i, String str, boolean z) {
        ?? jaVar = new ja(1, true);
        jaVar.c = i;
        jaVar.e = str;
        jaVar.i = z;
        return jaVar;
    }

    public static qm7 c(int i, String str, String str2) {
        ?? jaVar = new ja(5, true);
        jaVar.c = i;
        jaVar.e = str;
        jaVar.f = str2;
        return jaVar;
    }

    public static qm7 d(int i, String str) {
        ?? jaVar = new ja(4, true);
        jaVar.c = i;
        jaVar.e = str;
        return jaVar;
    }

    @Override
    public final boolean a(ja jaVar) {
        if (this != jaVar) {
            if (qm7.class == jaVar.getClass()) {
                qm7 qm7Var = (qm7) jaVar;
                if (this.c == qm7Var.c && this.d == qm7Var.d && this.h == qm7Var.h && this.i == qm7Var.i && Objects.equals(this.e, qm7Var.e) && Objects.equals(this.f, qm7Var.f) && this.g == qm7Var.g) {
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
            if (obj != null && qm7.class == obj.getClass()) {
                qm7 qm7Var = (qm7) obj;
                if (this.c == qm7Var.c && this.h == qm7Var.h) {
                    if (this.a != 8) {
                        if (this.d == qm7Var.d && Objects.equals(this.e, qm7Var.e)) {
                            if (this.a != 6 && !Objects.equals(this.f, qm7Var.f)) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (this.g == qm7Var.g) {
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
