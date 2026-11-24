package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class ge8 extends n39 {
    public final Context c;
    public final ie8 d;

    public ge8(ie8 ie8Var, Context context) {
        this.d = ie8Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i;
        int b = s49Var.b();
        ie8 ie8Var = this.d;
        if (b != ie8Var.j0 && b != ie8Var.v0 && b != ie8Var.w0) {
            if (ie8Var.J && b >= (i = ie8Var.o0) && b < ie8Var.E + i) {
                if (b - i < ie8Var.y) {
                    return false;
                }
            } else if (b != ie8Var.p0 && b != ie8Var.s0 && b != ie8Var.t0 && (ie8Var.O != 0 || b != ie8Var.u0)) {
                return false;
            }
            return true;
        }
        return !ie8Var.J;
    }

    @Override
    public final int b() {
        return this.d.y0;
    }

    @Override
    public final int d(int i) {
        ie8 ie8Var = this.d;
        if (i != ie8Var.i0 && i != ie8Var.n0 && i != ie8Var.r0) {
            if (i == ie8Var.m0) {
                return 1;
            }
            if (i != ie8Var.q0 && i != ie8Var.x0 && i != ie8Var.l0) {
                if (i == ie8Var.p0) {
                    return 3;
                }
                if (i == ie8Var.j0) {
                    return 4;
                }
                if (i == ie8Var.k0) {
                    return 7;
                }
                if (i != ie8Var.s0 && i != ie8Var.t0 && i != ie8Var.u0 && i != ie8Var.v0 && i != ie8Var.w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        ie8 ie8Var = this.d;
        byte b = ie8Var.O;
        boolean z = ie8Var.e0;
        int i6 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = true;
        if (i6 != 0) {
            boolean z3 = false;
            if (i6 != 6) {
                Context context = this.c;
                if (i6 != 2) {
                    if (i6 == 3) {
                        wgb wgbVar = (wgb) view;
                        wgbVar.g(-1, bkb.p6);
                        Drawable drawable = context.getResources().getDrawable(2131232564);
                        Drawable drawable2 = context.getResources().getDrawable(2131232565);
                        int i7 = bkb.M6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        zkb.x(wgbVar, drawable, i7, null, mode);
                        zkb.x(wgbVar, drawable2, bkb.j7, null, mode);
                        fm2 fm2Var = new fm2(drawable, drawable2);
                        if (z) {
                            i5 = 2131743827;
                        } else {
                            i5 = 2131754468;
                        }
                        wgbVar.p(k96.M0(i5, null), fm2Var, false);
                        return;
                    }
                    return;
                }
                mhb mhbVar = (mhb) view;
                mhbVar.setFixedSize(0);
                zkb.Z(mhbVar, context, 2131231233, bkb.a7);
                if (i == ie8Var.l0) {
                    mhbVar.setText(k96.M0(2131754469, null));
                    return;
                } else if (i == ie8Var.x0) {
                    mhbVar.setFixedSize(12);
                    mhbVar.setText(null);
                    return;
                } else {
                    int i8 = ie8Var.n - ie8Var.E;
                    if (i8 <= 0) {
                        if (z) {
                            i4 = 2131743867;
                        } else {
                            i4 = 2131754466;
                        }
                        mhbVar.setText(k96.M0(i4, null));
                        return;
                    } else if (z) {
                        mhbVar.setText(k96.H(',', "TodoNewTaskInfo", i8));
                        return;
                    } else {
                        mhbVar.setText(k96.a0("AddAnOptionInfo", null, 2131754467, k96.G(i8, "Option", new Object[0])));
                        return;
                    }
                }
            }
            ahb ahbVar = (ahb) view;
            ahbVar.setEnabled(!ie8Var.J);
            Switch checkBox = ahbVar.getCheckBox();
            if (!ie8Var.J) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            checkBox.setAlpha(f);
            if (i == ie8Var.v0) {
                ahbVar.f(k96.M0(2131743852, null), ie8Var.I, true);
                ahbVar.e(null, true);
                return;
            } else if (i == ie8Var.w0) {
                ahbVar.f(k96.M0(2131743851, null), ie8Var.K, false);
                ahbVar.e(null, true);
                return;
            } else if (i == ie8Var.s0) {
                String M0 = k96.M0(2131746985, null);
                boolean z4 = ie8Var.H;
                if (ie8Var.t0 != -1 || ie8Var.u0 != -1) {
                    z3 = true;
                }
                ahbVar.f(M0, z4, z3);
                ahbVar.e(null, true);
                return;
            } else if (i == ie8Var.t0) {
                String M02 = k96.M0(2131746973, null);
                boolean z5 = ie8Var.L;
                if (ie8Var.u0 != -1) {
                    z3 = true;
                }
                ahbVar.f(M02, z5, z3);
                ahbVar.e(null, true);
                return;
            } else if (i == ie8Var.u0) {
                ahbVar.f(k96.M0(2131746971, null), ie8Var.M, false);
                if (b != 0) {
                    z2 = false;
                }
                ahbVar.e(null, z2);
                return;
            } else {
                return;
            }
        }
        ld5 ld5Var = (ld5) view;
        if (i == ie8Var.i0) {
            if (z) {
                if (ie8Var.A0 != null) {
                    i3 = 2131743833;
                } else {
                    i3 = 2131743813;
                }
            } else {
                i3 = 2131746972;
            }
            ld5Var.setText(k96.M0(i3, null));
        } else if (i == ie8Var.n0) {
            if (b == 1) {
                ld5Var.setText(k96.M0(2131746254, null));
                return;
            }
            if (z) {
                i2 = 2131743831;
            } else {
                i2 = 2131754243;
            }
            ld5Var.setText(k96.M0(i2, null));
        } else if (i == ie8Var.r0) {
            ld5Var.setText(k96.M0(2131745303, null));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        fe8 fe8Var;
        ie8 ie8Var = this.d;
        boolean z = ie8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    fe8 fe8Var2 = new fe8(this, context, z ? 1 : 0, new fr7(ie8Var, (byte) 19));
                                    zkb.h(bkb.c6, null, fe8Var2);
                                    fe8Var2.c(new qy(this, fe8Var2, (byte) 9));
                                    fe8Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = fe8Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new df(this, fe8Var2, (byte) 3));
                                    textView.setOnKeyListener(new w6(fe8Var2, (byte) 5));
                                    fe8Var = fe8Var2;
                                } else {
                                    ee8 ee8Var = new ee8(this, context, z ? 1 : 0);
                                    ee8Var.e();
                                    zkb.h(bkb.c6, null, ee8Var);
                                    ee8Var.c(new qy(this, ee8Var, (byte) 8));
                                    fe8Var = ee8Var;
                                }
                            } else {
                                View ahbVar = new ahb(context);
                                zkb.h(bkb.c6, null, ahbVar);
                                fe8Var = ahbVar;
                            }
                        } else {
                            de8 de8Var = new de8(this, context, z ? 1 : 0);
                            de8Var.e();
                            zkb.h(bkb.c6, null, de8Var);
                            de8Var.c(new qy(this, de8Var, (byte) 7));
                            fe8Var = de8Var;
                        }
                    } else {
                        View wgbVar = new wgb(context);
                        zkb.h(bkb.c6, null, wgbVar);
                        fe8Var = wgbVar;
                    }
                } else {
                    fe8Var = new mhb(context);
                }
            } else {
                fe8Var = new b9a(context, (de9) null);
            }
        } else {
            View ld5Var = new ld5(this.c, bkb.K6, 21, 15, false, null);
            zkb.h(bkb.c6, null, ld5Var);
            fe8Var = ld5Var;
        }
        return ls6.h(fe8Var, fe8Var, -1, -2);
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        ie8 ie8Var = this.d;
        boolean z2 = ie8Var.e0;
        int i4 = s49Var.f;
        View view = s49Var.a;
        float f = 0.6f;
        CharSequence charSequence = "";
        float f2 = 1.0f;
        if (i4 == 4) {
            le8 le8Var = (le8) view;
            le8Var.setTag(1);
            py pyVar = le8Var.d;
            CharSequence charSequence2 = ie8Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z2) {
                i3 = 2131743812;
            } else {
                i3 = 2131746255;
            }
            le8Var.o(charSequence, k96.M0(i3, null), false);
            le8Var.setTag(null);
            le8Var.setEnabled(!ie8Var.J);
            pyVar.setEnabled(!ie8Var.J);
            int i5 = bkb.F6;
            if (!ie8Var.J) {
                f = 1.0f;
            }
            zkb.Y(pyVar, zkb.K(f, i5), ie8Var.getResourceProvider());
            ie8Var.s0(s49Var.b(), view);
        } else if (i4 == 5) {
            int b = s49Var.b();
            le8 le8Var2 = (le8) view;
            le8Var2.setTag(1);
            py pyVar2 = le8Var2.d;
            int i6 = b - ie8Var.o0;
            if (ie8Var.J && i6 < ie8Var.y) {
                z = false;
            } else {
                z = true;
            }
            pyVar2.setEnabled(z);
            int i7 = bkb.F6;
            if (z) {
                f = 1.0f;
            }
            zkb.Y(pyVar2, zkb.K(f, i7), ie8Var.getResourceProvider());
            CharSequence charSequence3 = ie8Var.w[i6];
            if (z2) {
                i = 2131743814;
            } else {
                i = 2131747581;
            }
            le8Var2.o(charSequence3, k96.M0(i, null), true);
            le8Var2.setTag(null);
            ImageView imageView = le8Var2.f;
            if (imageView != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            ImageView imageView2 = le8Var2.h;
            if (imageView2 != null) {
                if (!z) {
                    f2 = 0.45f;
                }
                imageView2.setAlpha(f2);
            }
            if (!ie8Var.g0 && ie8Var.h0 == b) {
                EditTextBoldCursor textView = le8Var2.getTextView();
                textView.requestFocus();
                gl.E3(textView);
                ie8Var.g0 = false;
                ie8Var.h0 = -1;
            }
            ie8Var.s0(b, view);
        } else if (i4 == 7) {
            le8 le8Var3 = (le8) view;
            le8Var3.setTag(1);
            CharSequence charSequence4 = ie8Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            le8Var3.o(charSequence, k96.M0(2131754471, null), false);
            le8Var3.setTag(null);
            ie8Var.s0(s49Var.b(), view);
        }
    }

    @Override
    public final void z(s49 s49Var) {
        int i = s49Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((le8) s49Var.a).getTextView();
            if (textView.isFocused()) {
                ie8 ie8Var = this.d;
                if (ie8Var.d0) {
                    dbb dbbVar = ie8Var.R;
                    if (dbbVar != null) {
                        dbbVar.e();
                    }
                    ie8Var.l0(true);
                }
                ie8Var.c0 = null;
                textView.clearFocus();
                gl.t1(textView);
            }
        }
    }
}
