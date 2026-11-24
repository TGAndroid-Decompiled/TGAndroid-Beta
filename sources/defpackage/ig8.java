package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class ig8 extends q59 {
    public final Context c;
    public final kg8 d;

    public ig8(kg8 kg8Var, Context context) {
        this.d = kg8Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i;
        int b = u69Var.b();
        kg8 kg8Var = this.d;
        if (b != kg8Var.j0 && b != kg8Var.v0 && b != kg8Var.w0) {
            if (kg8Var.J && b >= (i = kg8Var.o0) && b < kg8Var.E + i) {
                if (b - i < kg8Var.y) {
                    return false;
                }
            } else if (b != kg8Var.p0 && b != kg8Var.s0 && b != kg8Var.t0 && (kg8Var.O != 0 || b != kg8Var.u0)) {
                return false;
            }
            return true;
        }
        return !kg8Var.J;
    }

    @Override
    public final int b() {
        return this.d.y0;
    }

    @Override
    public final int d(int i) {
        kg8 kg8Var = this.d;
        if (i != kg8Var.i0 && i != kg8Var.n0 && i != kg8Var.r0) {
            if (i == kg8Var.m0) {
                return 1;
            }
            if (i != kg8Var.q0 && i != kg8Var.x0 && i != kg8Var.l0) {
                if (i == kg8Var.p0) {
                    return 3;
                }
                if (i == kg8Var.j0) {
                    return 4;
                }
                if (i == kg8Var.k0) {
                    return 7;
                }
                if (i != kg8Var.s0 && i != kg8Var.t0 && i != kg8Var.u0 && i != kg8Var.v0 && i != kg8Var.w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        kg8 kg8Var = this.d;
        byte b = kg8Var.O;
        boolean z = kg8Var.e0;
        int i6 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = true;
        if (i6 != 0) {
            boolean z3 = false;
            if (i6 != 6) {
                Context context = this.c;
                if (i6 != 2) {
                    if (i6 == 3) {
                        xib xibVar = (xib) view;
                        xibVar.g(-1, cmb.p6);
                        Drawable drawable = context.getResources().getDrawable(2131232576);
                        Drawable drawable2 = context.getResources().getDrawable(2131232577);
                        int i7 = cmb.M6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        anb.x(xibVar, drawable, i7, null, mode);
                        anb.x(xibVar, drawable2, cmb.j7, null, mode);
                        sn2 sn2Var = new sn2(drawable, drawable2);
                        if (z) {
                            i5 = 2131743753;
                        } else {
                            i5 = 2131754468;
                        }
                        xibVar.p(jb6.M0(i5, null), sn2Var, false);
                        return;
                    }
                    return;
                }
                njb njbVar = (njb) view;
                njbVar.setFixedSize(0);
                anb.Z(njbVar, context, 2131231234, cmb.a7);
                if (i == kg8Var.l0) {
                    njbVar.setText(jb6.M0(2131754469, null));
                    return;
                } else if (i == kg8Var.x0) {
                    njbVar.setFixedSize(12);
                    njbVar.setText(null);
                    return;
                } else {
                    int i8 = kg8Var.n - kg8Var.E;
                    if (i8 <= 0) {
                        if (z) {
                            i4 = 2131743793;
                        } else {
                            i4 = 2131754466;
                        }
                        njbVar.setText(jb6.M0(i4, null));
                        return;
                    } else if (z) {
                        njbVar.setText(jb6.H(',', "TodoNewTaskInfo", i8));
                        return;
                    } else {
                        njbVar.setText(jb6.a0("AddAnOptionInfo", null, 2131754467, jb6.G(i8, "Option", new Object[0])));
                        return;
                    }
                }
            }
            bjb bjbVar = (bjb) view;
            bjbVar.setEnabled(!kg8Var.J);
            Switch checkBox = bjbVar.getCheckBox();
            if (!kg8Var.J) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            checkBox.setAlpha(f);
            if (i == kg8Var.v0) {
                bjbVar.f(jb6.M0(2131743778, null), kg8Var.I, true);
                bjbVar.e(null, true);
                return;
            } else if (i == kg8Var.w0) {
                bjbVar.f(jb6.M0(2131743777, null), kg8Var.K, false);
                bjbVar.e(null, true);
                return;
            } else if (i == kg8Var.s0) {
                String M0 = jb6.M0(2131746911, null);
                boolean z4 = kg8Var.H;
                if (kg8Var.t0 != -1 || kg8Var.u0 != -1) {
                    z3 = true;
                }
                bjbVar.f(M0, z4, z3);
                bjbVar.e(null, true);
                return;
            } else if (i == kg8Var.t0) {
                String M02 = jb6.M0(2131746899, null);
                boolean z5 = kg8Var.L;
                if (kg8Var.u0 != -1) {
                    z3 = true;
                }
                bjbVar.f(M02, z5, z3);
                bjbVar.e(null, true);
                return;
            } else if (i == kg8Var.u0) {
                bjbVar.f(jb6.M0(2131746897, null), kg8Var.M, false);
                if (b != 0) {
                    z2 = false;
                }
                bjbVar.e(null, z2);
                return;
            } else {
                return;
            }
        }
        jf5 jf5Var = (jf5) view;
        if (i == kg8Var.i0) {
            if (z) {
                if (kg8Var.A0 != null) {
                    i3 = 2131743759;
                } else {
                    i3 = 2131743739;
                }
            } else {
                i3 = 2131746898;
            }
            jf5Var.setText(jb6.M0(i3, null));
        } else if (i == kg8Var.n0) {
            if (b == 1) {
                jf5Var.setText(jb6.M0(2131746180, null));
                return;
            }
            if (z) {
                i2 = 2131743757;
            } else {
                i2 = 2131754211;
            }
            jf5Var.setText(jb6.M0(i2, null));
        } else if (i == kg8Var.r0) {
            jf5Var.setText(jb6.M0(2131745229, null));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        hg8 hg8Var;
        kg8 kg8Var = this.d;
        boolean z = kg8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    hg8 hg8Var2 = new hg8(this, context, z ? 1 : 0, new m67(kg8Var, (byte) 22));
                                    anb.h(cmb.c6, null, hg8Var2);
                                    hg8Var2.c(new qz(this, hg8Var2, (byte) 9));
                                    hg8Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = hg8Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new eg(this, hg8Var2, (byte) 3));
                                    textView.setOnKeyListener(new w6(hg8Var2, (byte) 5));
                                    hg8Var = hg8Var2;
                                } else {
                                    gg8 gg8Var = new gg8(this, context, z ? 1 : 0);
                                    gg8Var.e();
                                    anb.h(cmb.c6, null, gg8Var);
                                    gg8Var.c(new qz(this, gg8Var, (byte) 8));
                                    hg8Var = gg8Var;
                                }
                            } else {
                                View bjbVar = new bjb(context);
                                anb.h(cmb.c6, null, bjbVar);
                                hg8Var = bjbVar;
                            }
                        } else {
                            fg8 fg8Var = new fg8(this, context, z ? 1 : 0);
                            fg8Var.e();
                            anb.h(cmb.c6, null, fg8Var);
                            fg8Var.c(new qz(this, fg8Var, (byte) 7));
                            hg8Var = fg8Var;
                        }
                    } else {
                        View xibVar = new xib(context);
                        anb.h(cmb.c6, null, xibVar);
                        hg8Var = xibVar;
                    }
                } else {
                    hg8Var = new njb(context);
                }
            } else {
                hg8Var = new bba(context, (hg9) null);
            }
        } else {
            View jf5Var = new jf5(this.c, cmb.K6, 21, 15, false, null);
            anb.h(cmb.c6, null, jf5Var);
            hg8Var = jf5Var;
        }
        return kt6.h(hg8Var, hg8Var, -1, -2);
    }

    @Override
    public final void y(u69 u69Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        kg8 kg8Var = this.d;
        boolean z2 = kg8Var.e0;
        int i4 = u69Var.f;
        View view = u69Var.a;
        float f = 0.6f;
        CharSequence charSequence = "";
        float f2 = 1.0f;
        if (i4 == 4) {
            ng8 ng8Var = (ng8) view;
            ng8Var.setTag(1);
            pz pzVar = ng8Var.d;
            CharSequence charSequence2 = kg8Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z2) {
                i3 = 2131743738;
            } else {
                i3 = 2131746181;
            }
            ng8Var.o(charSequence, jb6.M0(i3, null), false);
            ng8Var.setTag(null);
            ng8Var.setEnabled(!kg8Var.J);
            pzVar.setEnabled(!kg8Var.J);
            int i5 = cmb.F6;
            if (!kg8Var.J) {
                f = 1.0f;
            }
            anb.Y(pzVar, anb.K(f, i5), kg8Var.getResourceProvider());
            kg8Var.t0(u69Var.b(), view);
        } else if (i4 == 5) {
            int b = u69Var.b();
            ng8 ng8Var2 = (ng8) view;
            ng8Var2.setTag(1);
            pz pzVar2 = ng8Var2.d;
            int i6 = b - kg8Var.o0;
            if (kg8Var.J && i6 < kg8Var.y) {
                z = false;
            } else {
                z = true;
            }
            pzVar2.setEnabled(z);
            int i7 = cmb.F6;
            if (z) {
                f = 1.0f;
            }
            anb.Y(pzVar2, anb.K(f, i7), kg8Var.getResourceProvider());
            CharSequence charSequence3 = kg8Var.w[i6];
            if (z2) {
                i = 2131743740;
            } else {
                i = 2131747507;
            }
            ng8Var2.o(charSequence3, jb6.M0(i, null), true);
            ng8Var2.setTag(null);
            ImageView imageView = ng8Var2.f;
            if (imageView != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            ImageView imageView2 = ng8Var2.h;
            if (imageView2 != null) {
                if (!z) {
                    f2 = 0.45f;
                }
                imageView2.setAlpha(f2);
            }
            if (!kg8Var.g0 && kg8Var.h0 == b) {
                EditTextBoldCursor textView = ng8Var2.getTextView();
                textView.requestFocus();
                gm.E3(textView);
                kg8Var.g0 = false;
                kg8Var.h0 = -1;
            }
            kg8Var.t0(b, view);
        } else if (i4 == 7) {
            ng8 ng8Var3 = (ng8) view;
            ng8Var3.setTag(1);
            CharSequence charSequence4 = kg8Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            ng8Var3.o(charSequence, jb6.M0(2131754471, null), false);
            ng8Var3.setTag(null);
            kg8Var.t0(u69Var.b(), view);
        }
    }

    @Override
    public final void z(u69 u69Var) {
        int i = u69Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((ng8) u69Var.a).getTextView();
            if (textView.isFocused()) {
                kg8 kg8Var = this.d;
                if (kg8Var.d0) {
                    fdb fdbVar = kg8Var.R;
                    if (fdbVar != null) {
                        fdbVar.e();
                    }
                    kg8Var.m0(true);
                }
                kg8Var.c0 = null;
                textView.clearFocus();
                gm.t1(textView);
            }
        }
    }
}
