package defpackage;
public abstract class tte {
    public static jo a(ey7 ey7Var) {
        String str;
        int m = ey7Var.m();
        if (ey7Var.m() == 1684108385) {
            int m2 = ey7Var.m();
            byte[] bArr = zy0.a;
            int i = m2 & 16777215;
            if (i == 13) {
                str = "image/jpeg";
            } else if (i == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                c00.p(i, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            ey7Var.O(4);
            int i2 = m - 16;
            byte[] bArr2 = new byte[i2];
            ey7Var.k(0, i2, bArr2);
            return new jo(3, str, null, bArr2);
        }
        efd.f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static jlb b(int i, ey7 ey7Var, String str) {
        int m = ey7Var.m();
        if (ey7Var.m() == 1684108385 && m >= 22) {
            ey7Var.O(10);
            int H = ey7Var.H();
            if (H > 0) {
                String valueOf = String.valueOf(H);
                int H2 = ey7Var.H();
                if (H2 > 0) {
                    valueOf = valueOf + "/" + H2;
                }
                return new jlb(str, null, po5.u(valueOf));
            }
        }
        efd.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(iu5.e(i)));
        return null;
    }

    public static int c(ey7 ey7Var) {
        int m = ey7Var.m();
        if (ey7Var.m() == 1684108385) {
            ey7Var.O(8);
            int i = m - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (ey7Var.j() & 128) == 0) {
                            return ey7Var.E();
                        }
                    } else {
                        return ey7Var.D();
                    }
                } else {
                    return ey7Var.H();
                }
            } else {
                return ey7Var.A();
            }
        }
        efd.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static wl5 d(int i, String str, ey7 ey7Var, boolean z, boolean z2) {
        int c = c(ey7Var);
        if (z2) {
            c = Math.min(1, c);
        }
        if (c >= 0) {
            if (z) {
                return new jlb(str, null, po5.u(Integer.toString(c)));
            }
            return new en2("und", str, Integer.toString(c));
        }
        efd.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(iu5.e(i)));
        return null;
    }

    public static jlb e(int i, ey7 ey7Var, String str) {
        int m = ey7Var.m();
        if (ey7Var.m() == 1684108385) {
            ey7Var.O(8);
            return new jlb(str, null, po5.u(ey7Var.w(m - 16)));
        }
        efd.f("MetadataUtil", "Failed to parse text attribute: ".concat(iu5.e(i)));
        return null;
    }

    public static void f(int i, vf7 vf7Var, jo4 jo4Var, vf7 vf7Var2, vf7... vf7VarArr) {
        tf7[] tf7VarArr;
        if (vf7Var2 == null) {
            vf7Var2 = new vf7(new tf7[0]);
        }
        if (vf7Var != null) {
            mo5 p = po5.p();
            for (tf7 tf7Var : vf7Var.a) {
                if (xl6.class.isAssignableFrom(tf7Var.getClass())) {
                    p.c((tf7) xl6.class.cast(tf7Var));
                }
            }
            no5 listIterator = p.f().listIterator(0);
            while (listIterator.hasNext()) {
                xl6 xl6Var = (xl6) listIterator.next();
                if (!xl6Var.a.equals("com.android.capture.fps") || i == 2) {
                    vf7Var2 = vf7Var2.a(xl6Var);
                }
            }
        }
        for (vf7 vf7Var3 : vf7VarArr) {
            vf7Var2 = vf7Var2.b(vf7Var3);
        }
        if (vf7Var2.a.length > 0) {
            jo4Var.l = vf7Var2;
        }
    }
}
