package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class uh8 extends c79 {
    public final Context c;
    public final wh8 d;

    public uh8(wh8 wh8Var, Context context) {
        this.d = wh8Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i;
        int b = f89Var.b();
        wh8 wh8Var = this.d;
        if (b != wh8Var.j0 && b != wh8Var.v0 && b != wh8Var.w0) {
            if (wh8Var.J && b >= (i = wh8Var.o0) && b < wh8Var.E + i) {
                if (b - i < wh8Var.y) {
                    return false;
                }
            } else if (b != wh8Var.p0 && b != wh8Var.s0 && b != wh8Var.t0 && (wh8Var.O != 0 || b != wh8Var.u0)) {
                return false;
            }
            return true;
        }
        return !wh8Var.J;
    }

    @Override
    public final int b() {
        return this.d.y0;
    }

    @Override
    public final int d(int i) {
        wh8 wh8Var = this.d;
        if (i != wh8Var.i0 && i != wh8Var.n0 && i != wh8Var.r0) {
            if (i == wh8Var.m0) {
                return 1;
            }
            if (i != wh8Var.q0 && i != wh8Var.x0 && i != wh8Var.l0) {
                if (i == wh8Var.p0) {
                    return 3;
                }
                if (i == wh8Var.j0) {
                    return 4;
                }
                if (i == wh8Var.k0) {
                    return 7;
                }
                if (i != wh8Var.s0 && i != wh8Var.t0 && i != wh8Var.u0 && i != wh8Var.v0 && i != wh8Var.w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        wh8 wh8Var = this.d;
        byte b = wh8Var.O;
        boolean z = wh8Var.e0;
        int i6 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = true;
        if (i6 != 0) {
            boolean z3 = false;
            if (i6 != 6) {
                Context context = this.c;
                if (i6 != 2) {
                    if (i6 == 3) {
                        skb skbVar = (skb) view;
                        skbVar.g(-1, aob.q6);
                        Drawable drawable = context.getResources().getDrawable(2131232575);
                        Drawable drawable2 = context.getResources().getDrawable(2131232576);
                        int i7 = aob.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        yob.x(skbVar, drawable, i7, null, mode);
                        yob.x(skbVar, drawable2, aob.k7, null, mode);
                        zm2 zm2Var = new zm2(drawable, drawable2);
                        if (z) {
                            i5 = 2131743721;
                        } else {
                            i5 = 2131754464;
                        }
                        skbVar.p(ob6.M0(i5, null), zm2Var, false);
                        return;
                    }
                    return;
                }
                ilb ilbVar = (ilb) view;
                ilbVar.setFixedSize(0);
                yob.Z(ilbVar, context, 2131231233, aob.b7);
                if (i == wh8Var.l0) {
                    ilbVar.setText(ob6.M0(2131754465, null));
                    return;
                } else if (i == wh8Var.x0) {
                    ilbVar.setFixedSize(12);
                    ilbVar.setText(null);
                    return;
                } else {
                    int i8 = wh8Var.n - wh8Var.E;
                    if (i8 <= 0) {
                        if (z) {
                            i4 = 2131743761;
                        } else {
                            i4 = 2131754462;
                        }
                        ilbVar.setText(ob6.M0(i4, null));
                        return;
                    } else if (z) {
                        ilbVar.setText(ob6.H(',', "TodoNewTaskInfo", i8));
                        return;
                    } else {
                        ilbVar.setText(ob6.a0("AddAnOptionInfo", null, 2131754463, ob6.G(i8, "Option", new Object[0])));
                        return;
                    }
                }
            }
            wkb wkbVar = (wkb) view;
            wkbVar.setEnabled(!wh8Var.J);
            Switch checkBox = wkbVar.getCheckBox();
            if (!wh8Var.J) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            checkBox.setAlpha(f);
            if (i == wh8Var.v0) {
                wkbVar.f(ob6.M0(2131743746, null), wh8Var.I, true);
                wkbVar.e(null, true);
                return;
            } else if (i == wh8Var.w0) {
                wkbVar.f(ob6.M0(2131743745, null), wh8Var.K, false);
                wkbVar.e(null, true);
                return;
            } else if (i == wh8Var.s0) {
                String M0 = ob6.M0(2131746905, null);
                boolean z4 = wh8Var.H;
                if (wh8Var.t0 != -1 || wh8Var.u0 != -1) {
                    z3 = true;
                }
                wkbVar.f(M0, z4, z3);
                wkbVar.e(null, true);
                return;
            } else if (i == wh8Var.t0) {
                String M02 = ob6.M0(2131746893, null);
                boolean z5 = wh8Var.L;
                if (wh8Var.u0 != -1) {
                    z3 = true;
                }
                wkbVar.f(M02, z5, z3);
                wkbVar.e(null, true);
                return;
            } else if (i == wh8Var.u0) {
                wkbVar.f(ob6.M0(2131746891, null), wh8Var.M, false);
                if (b != 0) {
                    z2 = false;
                }
                wkbVar.e(null, z2);
                return;
            } else {
                return;
            }
        }
        mf5 mf5Var = (mf5) view;
        if (i == wh8Var.i0) {
            if (z) {
                if (wh8Var.A0 != null) {
                    i3 = 2131743727;
                } else {
                    i3 = 2131743707;
                }
            } else {
                i3 = 2131746892;
            }
            mf5Var.setText(ob6.M0(i3, null));
        } else if (i == wh8Var.n0) {
            if (b == 1) {
                mf5Var.setText(ob6.M0(2131746174, null));
                return;
            }
            if (z) {
                i2 = 2131743725;
            } else {
                i2 = 2131754239;
            }
            mf5Var.setText(ob6.M0(i2, null));
        } else if (i == wh8Var.r0) {
            mf5Var.setText(ob6.M0(2131745223, null));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        th8 th8Var;
        wh8 wh8Var = this.d;
        boolean z = wh8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    th8 th8Var2 = new th8(this, context, z ? 1 : 0, new am7(wh8Var, (byte) 21));
                                    yob.h(aob.d6, null, th8Var2);
                                    th8Var2.c(new ry(this, th8Var2, (byte) 9));
                                    th8Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = th8Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new hf(this, th8Var2, (byte) 3));
                                    textView.setOnKeyListener(new x6(th8Var2, (byte) 5));
                                    th8Var = th8Var2;
                                } else {
                                    sh8 sh8Var = new sh8(this, context, z ? 1 : 0);
                                    sh8Var.e();
                                    yob.h(aob.d6, null, sh8Var);
                                    sh8Var.c(new ry(this, sh8Var, (byte) 8));
                                    th8Var = sh8Var;
                                }
                            } else {
                                View wkbVar = new wkb(context);
                                yob.h(aob.d6, null, wkbVar);
                                th8Var = wkbVar;
                            }
                        } else {
                            rh8 rh8Var = new rh8(this, context, z ? 1 : 0);
                            rh8Var.e();
                            yob.h(aob.d6, null, rh8Var);
                            rh8Var.c(new ry(this, rh8Var, (byte) 7));
                            th8Var = rh8Var;
                        }
                    } else {
                        View skbVar = new skb(context);
                        yob.h(aob.d6, null, skbVar);
                        th8Var = skbVar;
                    }
                } else {
                    th8Var = new ilb(context);
                }
            } else {
                th8Var = new sca(context, (uh9) null);
            }
        } else {
            View mf5Var = new mf5(this.c, aob.L6, 21, 15, false, null);
            yob.h(aob.d6, null, mf5Var);
            th8Var = mf5Var;
        }
        return qu6.h(th8Var, th8Var, -1, -2);
    }

    @Override
    public final void y(f89 f89Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        wh8 wh8Var = this.d;
        boolean z2 = wh8Var.e0;
        int i4 = f89Var.f;
        View view = f89Var.a;
        float f = 0.6f;
        CharSequence charSequence = "";
        float f2 = 1.0f;
        if (i4 == 4) {
            zh8 zh8Var = (zh8) view;
            zh8Var.setTag(1);
            qy qyVar = zh8Var.d;
            CharSequence charSequence2 = wh8Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z2) {
                i3 = 2131743706;
            } else {
                i3 = 2131746175;
            }
            zh8Var.o(charSequence, ob6.M0(i3, null), false);
            zh8Var.setTag(null);
            zh8Var.setEnabled(!wh8Var.J);
            qyVar.setEnabled(!wh8Var.J);
            int i5 = aob.G6;
            if (!wh8Var.J) {
                f = 1.0f;
            }
            yob.Y(qyVar, yob.K(f, i5), wh8Var.getResourceProvider());
            wh8Var.s0(f89Var.b(), view);
        } else if (i4 == 5) {
            int b = f89Var.b();
            zh8 zh8Var2 = (zh8) view;
            zh8Var2.setTag(1);
            qy qyVar2 = zh8Var2.d;
            int i6 = b - wh8Var.o0;
            if (wh8Var.J && i6 < wh8Var.y) {
                z = false;
            } else {
                z = true;
            }
            qyVar2.setEnabled(z);
            int i7 = aob.G6;
            if (z) {
                f = 1.0f;
            }
            yob.Y(qyVar2, yob.K(f, i7), wh8Var.getResourceProvider());
            CharSequence charSequence3 = wh8Var.w[i6];
            if (z2) {
                i = 2131743708;
            } else {
                i = 2131747501;
            }
            zh8Var2.o(charSequence3, ob6.M0(i, null), true);
            zh8Var2.setTag(null);
            ImageView imageView = zh8Var2.f;
            if (imageView != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            ImageView imageView2 = zh8Var2.h;
            if (imageView2 != null) {
                if (!z) {
                    f2 = 0.45f;
                }
                imageView2.setAlpha(f2);
            }
            if (!wh8Var.g0 && wh8Var.h0 == b) {
                EditTextBoldCursor textView = zh8Var2.getTextView();
                textView.requestFocus();
                hl.E3(textView);
                wh8Var.g0 = false;
                wh8Var.h0 = -1;
            }
            wh8Var.s0(b, view);
        } else if (i4 == 7) {
            zh8 zh8Var3 = (zh8) view;
            zh8Var3.setTag(1);
            CharSequence charSequence4 = wh8Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            zh8Var3.o(charSequence, ob6.M0(2131754467, null), false);
            zh8Var3.setTag(null);
            wh8Var.s0(f89Var.b(), view);
        }
    }

    @Override
    public final void z(f89 f89Var) {
        int i = f89Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((zh8) f89Var.a).getTextView();
            if (textView.isFocused()) {
                wh8 wh8Var = this.d;
                if (wh8Var.d0) {
                    zeb zebVar = wh8Var.R;
                    if (zebVar != null) {
                        zebVar.e();
                    }
                    wh8Var.l0(true);
                }
                wh8Var.c0 = null;
                textView.clearFocus();
                hl.t1(textView);
            }
        }
    }
}
