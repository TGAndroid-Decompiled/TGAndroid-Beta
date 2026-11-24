package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.p;
public final class snb implements View.OnClickListener {
    public final byte a;
    public int b = 0;
    public final rob c;

    public snb(rob robVar, byte b) {
        this.a = b;
        this.c = robVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rob robVar = this.c;
        switch (b) {
            case 0:
                robVar.H0.setRotation(this.b);
                this.b -= 45;
                robVar.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(d53.g).start();
                hob[] hobVarArr = robVar.y0;
                hob hobVar = hobVarArr[0];
                if (hobVar != null) {
                    Drawable background = hobVar.getBackground();
                    if (background instanceof ah7) {
                        ((ah7) background).v(false);
                    } else {
                        amb ambVar = robVar.w;
                        if (robVar.b == 2) {
                            robVar.j1 += 45;
                            while (true) {
                                int i = robVar.j1;
                                if (i >= 360) {
                                    robVar.j1 = i - 360;
                                } else {
                                    robVar.f1(robVar.b1, 0, true);
                                }
                            }
                        } else if (ambVar != null) {
                            ambVar.n += 45;
                            while (true) {
                                int i2 = ambVar.n;
                                if (i2 >= 360) {
                                    ambVar.n = i2 - 360;
                                } else {
                                    cmb.r1(false, false);
                                }
                            }
                        }
                    }
                }
                hob hobVar2 = hobVarArr[1];
                if (hobVar2 != null) {
                    Drawable background2 = hobVar2.getBackground();
                    if (background2 instanceof ah7) {
                        ((ah7) background2).v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                plb plbVar = robVar.T;
                robVar.I0.setRotation(this.b);
                this.b -= 45;
                robVar.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(d53.g).start();
                amb ambVar2 = robVar.w;
                if (ambVar2.i) {
                    if (plbVar.j() != null) {
                        plbVar.j().v(false);
                        return;
                    }
                    return;
                }
                int i3 = ambVar2.h;
                int i4 = ambVar2.e;
                if (i3 != 0) {
                    if (i4 == 0) {
                        i4 = ambVar2.c;
                    }
                    ambVar2.e = ambVar2.f;
                    ambVar2.f = ambVar2.g;
                    ambVar2.g = i3;
                    ambVar2.h = i4;
                    i3 = i4;
                } else {
                    if (i4 == 0) {
                        i4 = ambVar2.c;
                    }
                    ambVar2.e = ambVar2.f;
                    ambVar2.f = ambVar2.g;
                    ambVar2.g = i4;
                }
                robVar.X.e(i3, 3);
                robVar.X.e(ambVar2.g, 2);
                robVar.X.e(ambVar2.f, 1);
                p pVar = robVar.X;
                int i5 = ambVar2.e;
                if (i5 == 0) {
                    i5 = ambVar2.c;
                }
                pVar.e(i5, 0);
                robVar.M0[1].b(0, ambVar2.e);
                robVar.M0[1].b(1, ambVar2.f);
                robVar.M0[1].b(2, ambVar2.g);
                robVar.M0[1].b(3, ambVar2.h);
                cmb.r1(true, true);
                robVar.w0.h1();
                return;
        }
    }
}
