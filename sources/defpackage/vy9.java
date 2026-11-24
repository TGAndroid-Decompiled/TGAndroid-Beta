package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class vy9 extends q59 {
    public final vz9 c;

    public vy9(vz9 vz9Var) {
        this.c = vz9Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 2 || i == 1 || i == 3 || i == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.v0;
    }

    @Override
    public final long c(int i) {
        return Math.abs(((Long) this.c.w0.get(i)).longValue());
    }

    @Override
    public final int d(int i) {
        vz9 vz9Var = this.c;
        if (i == vz9Var.a) {
            return 7;
        }
        if (i < vz9Var.b || i >= vz9Var.c) {
            if (i < vz9Var.d || i >= vz9Var.e) {
                if (i >= vz9Var.F && i < vz9Var.G) {
                    return 1;
                }
                if (i < vz9Var.r || i >= vz9Var.s) {
                    if (vz9Var.z0.indexOfKey(i) >= 0) {
                        return 4;
                    }
                    if (vz9Var.A0.indexOfKey(i) >= 0) {
                        return 5;
                    }
                    if (i == vz9Var.w) {
                        return 6;
                    }
                    if (vz9Var.x0.indexOfKey(i) < 0 && i != vz9Var.f && i != vz9Var.E && i != vz9Var.n && i != vz9Var.h && i != vz9Var.y) {
                        if (i == vz9Var.x) {
                            return 8;
                        }
                        return 3;
                    }
                    return 0;
                }
                return 3;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.u69 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy9.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        qz8 qz8Var;
        int p;
        vz9 vz9Var = this.c;
        int i2 = vz9Var.a0;
        ylb ylbVar = vz9Var.a1;
        boolean z = false;
        if (i == 0) {
            Context context = vz9Var.getContext();
            if (i2 == 6) {
                z = true;
            }
            qz8Var = new bz9(vz9Var, context, z);
        } else if (i == 2) {
            qz8Var = new ImageView(vz9Var.getContext());
        } else if (i != 3 && i != 1 && i != 8) {
            if (i == 4) {
                Context context2 = vz9Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (vz9Var.h1) {
                    p = cmb.v(vz9Var.g1, cmb.p1(0.4f, cmb.w0(null, cmb.c6, false)));
                } else {
                    p = on2.p(cmb.w0(null, cmb.Kf, false), 99);
                }
                if (vz9Var.h1) {
                    textView.setBackground(cmb.b0(gm.L(11.0f), p));
                } else {
                    ShapeDrawable b0 = cmb.b0(gm.L(11.0f), p);
                    wmb g = anb.g(cmb.Kf, 99);
                    textView.setBackground(b0);
                    anb.j(textView, b0, g, null, null);
                }
                textView.setTypeface(gm.o());
                textView.setPadding(gm.L(4.0f), gm.L(1.66f), gm.L(4.0f), gm.L(2.0f));
                frameLayout.addView(textView, qoe.e(-2, -2, 17));
                qz8Var = frameLayout;
            } else if (i == 5) {
                ?? frameLayout2 = new FrameLayout(vz9Var.getContext());
                rj rjVar = new rj(frameLayout2.getContext(), false, false, false, (byte) 3);
                frameLayout2.b = rjVar;
                rjVar.b(0.3f, 250L, d53.h);
                rjVar.setTextSize(gm.L(14.0f));
                rjVar.setTypeface(gm.o());
                anb.U(rjVar, cmb.Ii, ylbVar);
                rjVar.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.a = frameLayout3;
                int i3 = cmb.Ei;
                fg0 e = ulb.e(cmb.v0(i3, ylbVar), 8.0f);
                wmb M = anb.M(i3);
                wmb e2 = anb.e(i3);
                frameLayout3.setBackground(e);
                anb.j(frameLayout3, e, M, e2, ylbVar);
                frameLayout3.addView(rjVar, qoe.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, qoe.c(-1.0f, -1));
                cj8 cj8Var = new cj8(ylbVar, frameLayout2.getContext(), false);
                frameLayout2.c = cj8Var;
                cj8Var.setIcon(2131624310);
                frameLayout2.addView(cj8Var, qoe.c(-1.0f, -1));
                qz8Var = frameLayout2;
            } else if (i == 6) {
                qz8 qz8Var2 = new qz8(vz9Var.getContext(), (byte) 1);
                qz8Var2.setTextSize(1, 13.0f);
                if (i2 == 3) {
                    qz8Var2.setText(jb6.M0(2131745382, null));
                } else if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10) {
                    qz8Var2.setText(jb6.M0(2131746113, null));
                } else {
                    qz8Var2.setText(jb6.M0(2131751113, null));
                }
                qz8Var2.setGravity(17);
                anb.X(qz8Var2, cmb.x6, ylbVar);
                qz8Var = qz8Var2;
            } else if (i == 7) {
                View ak4Var = new ak4(vz9Var.getContext(), 52, (byte) 0);
                ak4Var.setTag("searchbox");
                qz8Var = ak4Var;
            } else {
                qz8Var = new fz9(vz9Var, vz9Var.getContext());
            }
        } else {
            fz9 fz9Var = new fz9(vz9Var, vz9Var.getContext());
            if (i == 8) {
                fz9Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(fz9Var);
                fz9Var.h = imageReceiver;
                fz9Var.r = imageReceiver;
                imageReceiver.g0(vz9Var.O);
                vz9Var.P = fz9Var;
                fz9Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            }
            qz8Var = fz9Var;
        }
        if (vz9Var.g()) {
            qz8Var.setScaleX(0.0f);
            qz8Var.setScaleY(0.0f);
        }
        return new u69(qz8Var);
    }
}
