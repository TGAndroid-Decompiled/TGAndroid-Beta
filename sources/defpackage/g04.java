package defpackage;
public final class g04 implements dic {
    public final boolean a;
    public final o24 b;

    public g04(o24 o24Var, boolean z) {
        this.b = o24Var;
        this.a = z;
    }

    @Override
    public final void a(int i) {
        boolean z;
        int i2;
        o24 o24Var = this.b;
        d04 d04Var = o24Var.h;
        boolean z2 = false;
        if (d04Var != null) {
            int currentItem = d04Var.getCurrentItem();
            if (currentItem == 2) {
                i2 = 1;
            } else if (currentItem == 1) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (o24Var.B1 != i2) {
                o24Var.B1 = i2;
                uc7.d1().edit().putInt("selected_page", i2).commit();
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        o24Var.K(z, true);
        if (i == 2 && (this.a || o24Var.w0)) {
            z2 = true;
        }
        o24Var.P(z2, true);
        if (o24Var.u1.z()) {
            if (i == 0) {
                oz3 oz3Var = o24Var.W;
                if (oz3Var != null) {
                    oz3Var.d.requestFocus();
                }
            } else if (i == 1) {
                tz3 tz3Var = o24Var.p0;
                if (tz3Var != null) {
                    tz3Var.d.requestFocus();
                }
            } else {
                a04 a04Var = o24Var.H0;
                if (a04Var != null) {
                    a04Var.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        c24 c24Var;
        c24 c24Var2;
        int i3;
        int i4;
        int i5;
        o24 o24Var = this.b;
        c24 c24Var3 = o24Var.H0;
        c24 c24Var4 = o24Var.p0;
        c24 c24Var5 = o24Var.W;
        c04 c04Var = o24Var.D0;
        wz3 wz3Var = o24Var.E0;
        w04 w04Var = o24Var.q0;
        rz3 rz3Var = o24Var.i0;
        b14 b14Var = o24Var.Q;
        int i6 = 2;
        boolean z = true;
        if (o24Var.y0 != null && o24Var.h0 != null) {
            int i7 = 8;
            if (i == 0) {
                b14Var.setVisibility(0);
                int i8 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i8 == 0) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                rz3Var.setVisibility(i4);
                if (i8 == 0) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                w04Var.setVisibility(i5);
                wz3Var.setVisibility(8);
                if (c04Var != null) {
                    c04Var.setVisibility(8);
                }
            } else if (i == 1) {
                b14Var.setVisibility(8);
                rz3Var.setVisibility(0);
                w04Var.setVisibility(0);
                int i9 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i9 == 0) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                wz3Var.setVisibility(i3);
                if (c04Var != null) {
                    if (i9 != 0) {
                        i7 = 0;
                    }
                    c04Var.setVisibility(i7);
                }
            } else if (i == 2) {
                b14Var.setVisibility(8);
                rz3Var.setVisibility(8);
                w04Var.setVisibility(8);
                wz3Var.setVisibility(0);
                if (c04Var != null) {
                    c04Var.setVisibility(0);
                }
            }
        }
        o24Var.getMeasuredWidth();
        o24Var.getPaddingLeft();
        o24Var.getPaddingRight();
        p14 p14Var = o24Var.u1;
        if (p14Var != null) {
            if (i == 1) {
                if (i2 == 0) {
                    i6 = 0;
                }
                p14Var.r(i6);
            } else if (i == 2) {
                p14Var.r(3);
            } else {
                p14Var.r(0);
            }
        }
        o24Var.L(true);
        int currentItem = o24Var.h.getCurrentItem();
        if (currentItem == 0) {
            c24Var = c24Var5;
        } else if (currentItem == 1) {
            c24Var = c24Var4;
        } else {
            c24Var = c24Var3;
        }
        String obj = c24Var.d.getText().toString();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                c24Var2 = c24Var5;
            } else if (i10 == 1) {
                c24Var2 = c24Var4;
            } else {
                c24Var2 = c24Var3;
            }
            if (c24Var2 != null) {
                a24 a24Var = c24Var2.d;
                if (c24Var2 != c24Var && a24Var != null && !a24Var.getText().toString().equals(obj)) {
                    a24Var.setText(obj);
                    a24Var.setSelection(obj.length());
                }
            }
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        o24Var.Q(z);
        o24Var.Y();
    }

    @Override
    public final void c(int i) {
    }
}
