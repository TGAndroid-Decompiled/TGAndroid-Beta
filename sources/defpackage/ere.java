package defpackage;
public abstract class ere {
    public static ip a(yw7 yw7Var) {
        String str;
        int m = yw7Var.m();
        if (yw7Var.m() == 1684108385) {
            int m2 = yw7Var.m();
            byte[] bArr = yz0.a;
            int i = m2 & 16777215;
            if (i == 13) {
                str = "image/jpeg";
            } else if (i == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                b10.o(i, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            yw7Var.O(4);
            int i2 = m - 16;
            byte[] bArr2 = new byte[i2];
            yw7Var.k(0, i2, bArr2);
            return new ip(3, str, null, bArr2);
        }
        ncd.f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static ojb b(int i, yw7 yw7Var, String str) {
        int m = yw7Var.m();
        if (yw7Var.m() == 1684108385 && m >= 22) {
            yw7Var.O(10);
            int H = yw7Var.H();
            if (H > 0) {
                String valueOf = String.valueOf(H);
                int H2 = yw7Var.H();
                if (H2 > 0) {
                    valueOf = valueOf + "/" + H2;
                }
                return new ojb(str, null, mo5.u(valueOf));
            }
        }
        ncd.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(eu5.e(i)));
        return null;
    }

    public static int c(yw7 yw7Var) {
        int m = yw7Var.m();
        if (yw7Var.m() == 1684108385) {
            yw7Var.O(8);
            int i = m - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (yw7Var.j() & 128) == 0) {
                            return yw7Var.E();
                        }
                    } else {
                        return yw7Var.D();
                    }
                } else {
                    return yw7Var.H();
                }
            } else {
                return yw7Var.A();
            }
        }
        ncd.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static tl5 d(int i, String str, yw7 yw7Var, boolean z, boolean z2) {
        int c = c(yw7Var);
        if (z2) {
            c = Math.min(1, c);
        }
        if (c >= 0) {
            if (z) {
                return new ojb(str, null, mo5.u(Integer.toString(c)));
            }
            return new wn2("und", str, Integer.toString(c));
        }
        ncd.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(eu5.e(i)));
        return null;
    }

    public static ojb e(int i, yw7 yw7Var, String str) {
        int m = yw7Var.m();
        if (yw7Var.m() == 1684108385) {
            yw7Var.O(8);
            return new ojb(str, null, mo5.u(yw7Var.w(m - 16)));
        }
        ncd.f("MetadataUtil", "Failed to parse text attribute: ".concat(eu5.e(i)));
        return null;
    }

    public static void f(int i, nf7 nf7Var, fo4 fo4Var, nf7 nf7Var2, nf7... nf7VarArr) {
        lf7[] lf7VarArr;
        if (nf7Var2 == null) {
            nf7Var2 = new nf7(new lf7[0]);
        }
        if (nf7Var != null) {
            jo5 p = mo5.p();
            for (lf7 lf7Var : nf7Var.a) {
                if (vl6.class.isAssignableFrom(lf7Var.getClass())) {
                    p.c((lf7) vl6.class.cast(lf7Var));
                }
            }
            ko5 listIterator = p.f().listIterator(0);
            while (listIterator.hasNext()) {
                vl6 vl6Var = (vl6) listIterator.next();
                if (!vl6Var.a.equals("com.android.capture.fps") || i == 2) {
                    nf7Var2 = nf7Var2.a(vl6Var);
                }
            }
        }
        for (nf7 nf7Var3 : nf7VarArr) {
            nf7Var2 = nf7Var2.b(nf7Var3);
        }
        if (nf7Var2.a.length > 0) {
            fo4Var.l = nf7Var2;
        }
    }
}
