package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public class q7c extends r59 {
    public u46 f3;
    public final l7c g3;
    public hu5 h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public u69 l3;
    public boolean m3;

    public q7c(Context context, int i, int i2, boolean z, jac jacVar, oac oacVar, pac pacVar, ylb ylbVar, int i3, int i4) {
        super(context, ylbVar);
        this.m3 = true;
        if (i3 == -1) {
            jg2 jg2Var = new jg2(this, i4);
            this.f3 = jg2Var;
            setLayoutManager(jg2Var);
        } else {
            o7c o7cVar = new o7c(this, i3, (byte) 0);
            o7cVar.O = new ifa(this, o7cVar, (byte) 1);
            this.f3 = o7cVar;
            setLayoutManager(o7cVar);
        }
        l7c l7cVar = new l7c(this, context, i, i2, z, jacVar, ylbVar);
        this.g3 = l7cVar;
        setAdapter(l7cVar);
        if (oacVar != null) {
            setOnItemClickListener(new uxb(this, oacVar, (byte) 3));
        }
        if (pacVar != null) {
            setOnItemLongClickListener(new uxb(this, pacVar, (byte) 4));
        }
        p7c p7cVar = new p7c(this);
        p7cVar.m = false;
        p7cVar.C = false;
        p7cVar.o(d53.h);
        p7cVar.n(350L);
        setItemAnimator(p7cVar);
    }

    public final int A1(int i) {
        int i2 = 0;
        while (true) {
            l7c l7cVar = this.g3;
            if (i2 < l7cVar.E.size()) {
                c6c G = l7cVar.G(i2);
                if (G != null && G.d == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final View B1(int i) {
        int i2 = 0;
        while (true) {
            l7c l7cVar = this.g3;
            if (i2 < l7cVar.E.size()) {
                c6c G = l7cVar.G(i2);
                if (G != null && G.d == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        return U0(i2);
    }

    public final View C1(Object obj) {
        int i = 0;
        while (true) {
            l7c l7cVar = this.g3;
            if (i < l7cVar.E.size()) {
                c6c G = l7cVar.G(i);
                if (G != null && G.H == obj) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return U0(i);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(jac jacVar, boolean z) {
        this.j3 = z;
        hu5 hu5Var = new hu5(new r20(this, (byte) 8));
        this.h3 = hu5Var;
        hu5Var.h(this);
        this.g3.N = jacVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i;
        if (!c1()) {
            l7c l7cVar = this.g3;
            ArrayList arrayList = l7cVar.H;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i7c i7cVar = (i7c) arrayList.get(i2);
                int i3 = i7cVar.b;
                if (i3 >= 0) {
                    int i4 = i7cVar.a;
                    if (l7cVar.n) {
                        i = cmb.g5;
                    } else {
                        i = cmb.c6;
                    }
                    int v0 = cmb.v0(i, l7cVar.x);
                    if (i3 >= i4 && i4 >= 0 && i3 >= 0) {
                        int i5 = Integer.MAX_VALUE;
                        int i6 = Integer.MIN_VALUE;
                        for (int i7 = 0; i7 < getChildCount(); i7++) {
                            View childAt = getChildAt(i7);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i4 && R <= i3) {
                                    i5 = Math.min(top, i5);
                                    i6 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i6);
                                }
                            }
                        }
                        if (i5 < i6) {
                            Paint paint = this.t2;
                            if (paint == null) {
                                paint = new Paint(1);
                                this.t2 = paint;
                            }
                            paint.setColor(v0);
                            canvas.drawRect(0.0f, i5, getWidth(), i6, this.t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        u46 u46Var = this.f3;
        if (u46Var instanceof f84) {
            return ((f84) u46Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i, float f, boolean z) {
        t1(new k22(this, (byte) 11), new pb((byte) 13), i, f, z);
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.m3 = z;
    }

    public void setSpanCount(int i) {
        u46 u46Var = this.f3;
        if (u46Var instanceof f84) {
            ((f84) u46Var).x1(i);
        } else if (u46Var != null && i != -1) {
            getContext();
            o7c o7cVar = new o7c(this, i, (byte) 1);
            o7cVar.O = new ifa(this, o7cVar, (byte) 2);
            this.f3 = o7cVar;
            setLayoutManager(o7cVar);
        }
    }

    public final void z1(boolean z) {
        if (this.k3 == z) {
            return;
        }
        this.k3 = z;
        this.g3.O = z;
        gm.d0(this, new eg9(this, (byte) 23));
    }

    public void F1() {
    }

    public void G1() {
    }

    public void H1(u69 u69Var) {
    }

    public void I1(u69 u69Var) {
    }

    public void J1(u69 u69Var) {
    }

    public void K1() {
    }

    public q7c(Context context, int i, int i2, boolean z, jac jacVar, oac oacVar, pac pacVar, ylb ylbVar) {
        this(context, i, i2, z, jacVar, oacVar, pacVar, ylbVar, -1, 1);
    }

    public q7c(d dVar, jac jacVar, oac oacVar, pac pacVar) {
        this(dVar.getContext(), dVar.getCurrentAccount(), dVar.getClassGuid(), false, jacVar, oacVar, pacVar, dVar.getResourceProvider());
    }
}
