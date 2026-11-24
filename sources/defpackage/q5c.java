package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public class q5c extends o39 {
    public t26 f3;
    public final l5c g3;
    public is5 h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public s49 l3;
    public boolean m3;

    public q5c(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, int i3, int i4) {
        super(context, wjbVar);
        this.m3 = true;
        if (i3 == -1) {
            xe2 xe2Var = new xe2(this, i4);
            this.f3 = xe2Var;
            setLayoutManager(xe2Var);
        } else {
            o5c o5cVar = new o5c(this, i3, (byte) 0);
            o5cVar.O = new ida(this, o5cVar, (byte) 1);
            this.f3 = o5cVar;
            setLayoutManager(o5cVar);
        }
        l5c l5cVar = new l5c(this, context, i, i2, z, i8cVar, wjbVar);
        this.g3 = l5cVar;
        setAdapter(l5cVar);
        if (n8cVar != null) {
            setOnItemClickListener(new cwb(this, n8cVar, (byte) 2));
        }
        if (o8cVar != null) {
            setOnItemLongClickListener(new cwb(this, o8cVar, (byte) 3));
        }
        p5c p5cVar = new p5c(this);
        p5cVar.m = false;
        p5cVar.C = false;
        p5cVar.o(s33.h);
        p5cVar.n(350L);
        setItemAnimator(p5cVar);
    }

    public final int A1(int i) {
        int i2 = 0;
        while (true) {
            l5c l5cVar = this.g3;
            if (i2 < l5cVar.E.size()) {
                c4c G = l5cVar.G(i2);
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
            l5c l5cVar = this.g3;
            if (i2 < l5cVar.E.size()) {
                c4c G = l5cVar.G(i2);
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
            l5c l5cVar = this.g3;
            if (i < l5cVar.E.size()) {
                c4c G = l5cVar.G(i);
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

    public final void E1(i8c i8cVar, boolean z) {
        this.j3 = z;
        is5 is5Var = new is5(new r10(this, (byte) 8));
        this.h3 = is5Var;
        is5Var.h(this);
        this.g3.N = i8cVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i;
        if (!c1()) {
            l5c l5cVar = this.g3;
            ArrayList arrayList = l5cVar.H;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i5c i5cVar = (i5c) arrayList.get(i2);
                int i3 = i5cVar.b;
                if (i3 >= 0) {
                    int i4 = i5cVar.a;
                    if (l5cVar.n) {
                        i = bkb.g5;
                    } else {
                        i = bkb.c6;
                    }
                    int v0 = bkb.v0(i, l5cVar.x);
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
        t26 t26Var = this.f3;
        if (t26Var instanceof w64) {
            return ((w64) t26Var).J;
        }
        return -1;
    }

    @Override
    public final void s1(int i, float f, boolean z) {
        t1(new z02(this, (byte) 11), new pb((byte) 13), i, f, z);
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.m3 = z;
    }

    public void setSpanCount(int i) {
        t26 t26Var = this.f3;
        if (t26Var instanceof w64) {
            ((w64) t26Var).x1(i);
        } else if (t26Var != null && i != -1) {
            getContext();
            o5c o5cVar = new o5c(this, i, (byte) 1);
            o5cVar.O = new ida(this, o5cVar, (byte) 2);
            this.f3 = o5cVar;
            setLayoutManager(o5cVar);
        }
    }

    public final void z1(boolean z) {
        if (this.k3 == z) {
            return;
        }
        this.k3 = z;
        this.g3.O = z;
        gl.d0(this, new ae9(this, (byte) 23));
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }

    public void H1(s49 s49Var) {
    }

    public void I1(s49 s49Var) {
    }

    public void J1(s49 s49Var) {
    }

    public q5c(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar) {
        this(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar, -1, 1);
    }

    public q5c(d dVar, i8c i8cVar, n8c n8cVar, o8c o8cVar) {
        this(dVar.getContext(), dVar.getCurrentAccount(), dVar.getClassGuid(), false, i8cVar, n8cVar, o8cVar, dVar.getResourceProvider());
    }
}
