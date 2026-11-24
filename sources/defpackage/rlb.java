package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.p;
public final class rlb implements View.OnClickListener {
    public final byte a;
    public int b = 0;
    public final qmb c;

    public rlb(qmb qmbVar, byte b) {
        this.a = b;
        this.c = qmbVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        qmb qmbVar = this.c;
        switch (b) {
            case 0:
                qmbVar.H0.setRotation(this.b);
                this.b -= 45;
                qmbVar.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(s33.g).start();
                gmb[] gmbVarArr = qmbVar.y0;
                gmb gmbVar = gmbVarArr[0];
                if (gmbVar != null) {
                    Drawable background = gmbVar.getBackground();
                    if (background instanceof ye7) {
                        ((ye7) background).v(false);
                    } else {
                        zjb zjbVar = qmbVar.w;
                        if (qmbVar.b == 2) {
                            qmbVar.j1 += 45;
                            while (true) {
                                int i = qmbVar.j1;
                                if (i >= 360) {
                                    qmbVar.j1 = i - 360;
                                } else {
                                    qmbVar.e1(qmbVar.b1, 0, true);
                                }
                            }
                        } else if (zjbVar != null) {
                            zjbVar.n += 45;
                            while (true) {
                                int i2 = zjbVar.n;
                                if (i2 >= 360) {
                                    zjbVar.n = i2 - 360;
                                } else {
                                    bkb.r1(false, false);
                                }
                            }
                        }
                    }
                }
                gmb gmbVar2 = gmbVarArr[1];
                if (gmbVar2 != null) {
                    Drawable background2 = gmbVar2.getBackground();
                    if (background2 instanceof ye7) {
                        ((ye7) background2).v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                njb njbVar = qmbVar.T;
                qmbVar.I0.setRotation(this.b);
                this.b -= 45;
                qmbVar.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(s33.g).start();
                zjb zjbVar2 = qmbVar.w;
                if (zjbVar2.i) {
                    if (njbVar.j() != null) {
                        njbVar.j().v(false);
                        return;
                    }
                    return;
                }
                int i3 = zjbVar2.h;
                int i4 = zjbVar2.e;
                if (i3 != 0) {
                    if (i4 == 0) {
                        i4 = zjbVar2.c;
                    }
                    zjbVar2.e = zjbVar2.f;
                    zjbVar2.f = zjbVar2.g;
                    zjbVar2.g = i3;
                    zjbVar2.h = i4;
                    i3 = i4;
                } else {
                    if (i4 == 0) {
                        i4 = zjbVar2.c;
                    }
                    zjbVar2.e = zjbVar2.f;
                    zjbVar2.f = zjbVar2.g;
                    zjbVar2.g = i4;
                }
                qmbVar.X.e(i3, 3);
                qmbVar.X.e(zjbVar2.g, 2);
                qmbVar.X.e(zjbVar2.f, 1);
                p pVar = qmbVar.X;
                int i5 = zjbVar2.e;
                if (i5 == 0) {
                    i5 = zjbVar2.c;
                }
                pVar.e(i5, 0);
                qmbVar.M0[1].b(0, zjbVar2.e);
                qmbVar.M0[1].b(1, zjbVar2.f);
                qmbVar.M0[1].b(2, zjbVar2.g);
                qmbVar.M0[1].b(3, zjbVar2.h);
                bkb.r1(true, true);
                qmbVar.w0.h1();
                return;
        }
    }
}
