package defpackage;
public final class v04 implements egc {
    public final boolean a;
    public final e34 b;

    public v04(e34 e34Var, boolean z) {
        this.b = e34Var;
        this.a = z;
    }

    @Override
    public final void a(int i) {
        boolean z;
        int i2;
        e34 e34Var = this.b;
        s04 s04Var = e34Var.h;
        boolean z2 = false;
        if (s04Var != null) {
            int currentItem = s04Var.getCurrentItem();
            if (currentItem == 2) {
                i2 = 1;
            } else if (currentItem == 1) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (e34Var.B1 != i2) {
                e34Var.B1 = i2;
                oc7.c1().edit().putInt("selected_page", i2).commit();
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        e34Var.K(z, true);
        if (i == 2 && (this.a || e34Var.w0)) {
            z2 = true;
        }
        e34Var.P(z2, true);
        if (e34Var.u1.z()) {
            if (i == 0) {
                d04 d04Var = e34Var.W;
                if (d04Var != null) {
                    d04Var.d.requestFocus();
                }
            } else if (i == 1) {
                i04 i04Var = e34Var.p0;
                if (i04Var != null) {
                    i04Var.d.requestFocus();
                }
            } else {
                p04 p04Var = e34Var.H0;
                if (p04Var != null) {
                    p04Var.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        s24 s24Var;
        s24 s24Var2;
        int i3;
        int i4;
        int i5;
        e34 e34Var = this.b;
        s24 s24Var3 = e34Var.H0;
        s24 s24Var4 = e34Var.p0;
        s24 s24Var5 = e34Var.W;
        r04 r04Var = e34Var.D0;
        l04 l04Var = e34Var.E0;
        m14 m14Var = e34Var.q0;
        g04 g04Var = e34Var.i0;
        r14 r14Var = e34Var.Q;
        int i6 = 2;
        boolean z = true;
        if (e34Var.y0 != null && e34Var.h0 != null) {
            int i7 = 8;
            if (i == 0) {
                r14Var.setVisibility(0);
                int i8 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i8 == 0) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                g04Var.setVisibility(i4);
                if (i8 == 0) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                m14Var.setVisibility(i5);
                l04Var.setVisibility(8);
                if (r04Var != null) {
                    r04Var.setVisibility(8);
                }
            } else if (i == 1) {
                r14Var.setVisibility(8);
                g04Var.setVisibility(0);
                m14Var.setVisibility(0);
                int i9 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i9 == 0) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                l04Var.setVisibility(i3);
                if (r04Var != null) {
                    if (i9 != 0) {
                        i7 = 0;
                    }
                    r04Var.setVisibility(i7);
                }
            } else if (i == 2) {
                r14Var.setVisibility(8);
                g04Var.setVisibility(8);
                m14Var.setVisibility(8);
                l04Var.setVisibility(0);
                if (r04Var != null) {
                    r04Var.setVisibility(0);
                }
            }
        }
        e34Var.getMeasuredWidth();
        e34Var.getPaddingLeft();
        e34Var.getPaddingRight();
        f24 f24Var = e34Var.u1;
        if (f24Var != null) {
            if (i == 1) {
                if (i2 == 0) {
                    i6 = 0;
                }
                f24Var.r(i6);
            } else if (i == 2) {
                f24Var.r(3);
            } else {
                f24Var.r(0);
            }
        }
        e34Var.L(true);
        int currentItem = e34Var.h.getCurrentItem();
        if (currentItem == 0) {
            s24Var = s24Var5;
        } else if (currentItem == 1) {
            s24Var = s24Var4;
        } else {
            s24Var = s24Var3;
        }
        String obj = s24Var.d.getText().toString();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                s24Var2 = s24Var5;
            } else if (i10 == 1) {
                s24Var2 = s24Var4;
            } else {
                s24Var2 = s24Var3;
            }
            if (s24Var2 != null) {
                q24 q24Var = s24Var2.d;
                if (s24Var2 != s24Var && q24Var != null && !q24Var.getText().toString().equals(obj)) {
                    q24Var.setText(obj);
                    q24Var.setSelection(obj.length());
                }
            }
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        e34Var.Q(z);
        e34Var.Z();
    }

    @Override
    public final void c(int i) {
    }
}
