package defpackage;
public final class lz3 implements eec {
    public final boolean a;
    public final t14 b;

    public lz3(t14 t14Var, boolean z) {
        this.b = t14Var;
        this.a = z;
    }

    @Override
    public final void a(int i) {
        boolean z;
        int i2;
        t14 t14Var = this.b;
        iz3 iz3Var = t14Var.h;
        boolean z2 = false;
        if (iz3Var != null) {
            int currentItem = iz3Var.getCurrentItem();
            if (currentItem == 2) {
                i2 = 1;
            } else if (currentItem == 1) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (t14Var.B1 != i2) {
                t14Var.B1 = i2;
                na7.b1().edit().putInt("selected_page", i2).commit();
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        t14Var.L(z, true);
        if (i == 2 && (this.a || t14Var.w0)) {
            z2 = true;
        }
        t14Var.Q(z2, true);
        if (t14Var.u1.z()) {
            if (i == 0) {
                ty3 ty3Var = t14Var.W;
                if (ty3Var != null) {
                    ty3Var.d.requestFocus();
                }
            } else if (i == 1) {
                yy3 yy3Var = t14Var.p0;
                if (yy3Var != null) {
                    yy3Var.d.requestFocus();
                }
            } else {
                fz3 fz3Var = t14Var.H0;
                if (fz3Var != null) {
                    fz3Var.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        h14 h14Var;
        h14 h14Var2;
        int i3;
        int i4;
        int i5;
        t14 t14Var = this.b;
        h14 h14Var3 = t14Var.H0;
        h14 h14Var4 = t14Var.p0;
        h14 h14Var5 = t14Var.W;
        hz3 hz3Var = t14Var.D0;
        bz3 bz3Var = t14Var.E0;
        b04 b04Var = t14Var.q0;
        wy3 wy3Var = t14Var.i0;
        g04 g04Var = t14Var.Q;
        int i6 = 2;
        boolean z = true;
        if (t14Var.y0 != null && t14Var.h0 != null) {
            int i7 = 8;
            if (i == 0) {
                g04Var.setVisibility(0);
                int i8 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i8 == 0) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                wy3Var.setVisibility(i4);
                if (i8 == 0) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                b04Var.setVisibility(i5);
                bz3Var.setVisibility(8);
                if (hz3Var != null) {
                    hz3Var.setVisibility(8);
                }
            } else if (i == 1) {
                g04Var.setVisibility(8);
                wy3Var.setVisibility(0);
                b04Var.setVisibility(0);
                int i9 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i9 == 0) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                bz3Var.setVisibility(i3);
                if (hz3Var != null) {
                    if (i9 != 0) {
                        i7 = 0;
                    }
                    hz3Var.setVisibility(i7);
                }
            } else if (i == 2) {
                g04Var.setVisibility(8);
                wy3Var.setVisibility(8);
                b04Var.setVisibility(8);
                bz3Var.setVisibility(0);
                if (hz3Var != null) {
                    hz3Var.setVisibility(0);
                }
            }
        }
        t14Var.getMeasuredWidth();
        t14Var.getPaddingLeft();
        t14Var.getPaddingRight();
        u04 u04Var = t14Var.u1;
        if (u04Var != null) {
            if (i == 1) {
                if (i2 == 0) {
                    i6 = 0;
                }
                u04Var.r(i6);
            } else if (i == 2) {
                u04Var.r(3);
            } else {
                u04Var.r(0);
            }
        }
        t14Var.M(true);
        int currentItem = t14Var.h.getCurrentItem();
        if (currentItem == 0) {
            h14Var = h14Var5;
        } else if (currentItem == 1) {
            h14Var = h14Var4;
        } else {
            h14Var = h14Var3;
        }
        String obj = h14Var.d.getText().toString();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                h14Var2 = h14Var5;
            } else if (i10 == 1) {
                h14Var2 = h14Var4;
            } else {
                h14Var2 = h14Var3;
            }
            if (h14Var2 != null) {
                f14 f14Var = h14Var2.d;
                if (h14Var2 != h14Var && f14Var != null && !f14Var.getText().toString().equals(obj)) {
                    f14Var.setText(obj);
                    f14Var.setSelection(obj.length());
                }
            }
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        t14Var.R(z);
        t14Var.Z();
    }

    @Override
    public final void c(int i) {
    }
}
