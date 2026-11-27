package defpackage;

import j$.util.Objects;
public final class qp7 extends ka {
    public int c;
    public int d;
    public String e;
    public String f;
    public vp7 g;
    public int h;
    public boolean i;

    public static qp7 b(int i, String str, boolean z) {
        ?? kaVar = new ka(1, true);
        kaVar.c = i;
        kaVar.e = str;
        kaVar.i = z;
        return kaVar;
    }

    public static qp7 c(int i, String str, String str2) {
        ?? kaVar = new ka(5, true);
        kaVar.c = i;
        kaVar.e = str;
        kaVar.f = str2;
        return kaVar;
    }

    public static qp7 d(int i, String str) {
        ?? kaVar = new ka(4, true);
        kaVar.c = i;
        kaVar.e = str;
        return kaVar;
    }

    @Override
    public final boolean a(ka kaVar) {
        if (this != kaVar) {
            if (qp7.class == kaVar.getClass()) {
                qp7 qp7Var = (qp7) kaVar;
                if (this.c == qp7Var.c && this.d == qp7Var.d && this.h == qp7Var.h && this.i == qp7Var.i && Objects.equals(this.e, qp7Var.e) && Objects.equals(this.f, qp7Var.f) && this.g == qp7Var.g) {
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
            if (obj != null && qp7.class == obj.getClass()) {
                qp7 qp7Var = (qp7) obj;
                if (this.c == qp7Var.c && this.h == qp7Var.h) {
                    if (this.a != 8) {
                        if (this.d == qp7Var.d && Objects.equals(this.e, qp7Var.e)) {
                            if (this.a != 6 && !Objects.equals(this.f, qp7Var.f)) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (this.g == qp7Var.g) {
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
