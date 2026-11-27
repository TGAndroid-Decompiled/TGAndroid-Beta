package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public class q9c extends d79 {
    public x46 f3;
    public final l9c g3;
    public lu5 h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public f89 l3;
    public boolean m3;

    public q9c(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, int i3, int i4) {
        super(context, vnbVar);
        this.m3 = true;
        if (i3 == -1) {
            of2 of2Var = new of2(this, i4);
            this.f3 = of2Var;
            setLayoutManager(of2Var);
        } else {
            o9c o9cVar = new o9c(this, i3, (byte) 0);
            o9cVar.O = new zga(this, o9cVar, (byte) 1);
            this.f3 = o9cVar;
            setLayoutManager(o9cVar);
        }
        l9c l9cVar = new l9c(this, context, i, i2, z, iccVar, vnbVar);
        this.g3 = l9cVar;
        setAdapter(l9cVar);
        if (nccVar != null) {
            setOnItemClickListener(new yw9(this, nccVar, (byte) 18));
        }
        if (occVar != null) {
            setOnItemLongClickListener(new yw9(this, occVar, (byte) 19));
        }
        p9c p9cVar = new p9c(this);
        p9cVar.m = false;
        p9cVar.C = false;
        p9cVar.o(k43.h);
        p9cVar.n(350L);
        setItemAnimator(p9cVar);
    }

    public final void A1(boolean z) {
        if (this.k3 == z) {
            return;
        }
        this.k3 = z;
        this.g3.O = z;
        hl.d0(this, new sh9(this, (byte) 23));
    }

    public final int B1(int i) {
        int i2 = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i2 < l9cVar.E.size()) {
                b8c G = l9cVar.G(i2);
                if (G != null && G.d == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final View C1(int i) {
        int i2 = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i2 < l9cVar.E.size()) {
                b8c G = l9cVar.G(i2);
                if (G != null && G.d == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        return V0(i2);
    }

    public final View D1(Object obj) {
        int i = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i < l9cVar.E.size()) {
                b8c G = l9cVar.G(i);
                if (G != null && G.H == obj) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return V0(i);
    }

    public boolean E1() {
        return false;
    }

    public final void F1(icc iccVar, boolean z) {
        this.j3 = z;
        lu5 lu5Var = new lu5(new s10(this, (byte) 8));
        this.h3 = lu5Var;
        lu5Var.h(this);
        this.g3.N = iccVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i;
        if (!d1()) {
            l9c l9cVar = this.g3;
            ArrayList arrayList = l9cVar.H;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i9c i9cVar = (i9c) arrayList.get(i2);
                int i3 = i9cVar.b;
                if (i3 >= 0) {
                    int i4 = i9cVar.a;
                    if (l9cVar.n) {
                        i = aob.h5;
                    } else {
                        i = aob.d6;
                    }
                    int v0 = aob.v0(i, l9cVar.x);
                    if (i3 >= i4 && i4 >= 0 && i3 >= 0) {
                        int i5 = Integer.MAX_VALUE;
                        int i6 = Integer.MIN_VALUE;
                        for (int i7 = 0; i7 < getChildCount(); i7++) {
                            View childAt = getChildAt(i7);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= i4 && S <= i3) {
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
        x46 x46Var = this.f3;
        if (x46Var instanceof q74) {
            return ((q74) x46Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.m3 = z;
    }

    public void setSpanCount(int i) {
        x46 x46Var = this.f3;
        if (x46Var instanceof q74) {
            ((q74) x46Var).x1(i);
        } else if (x46Var != null && i != -1) {
            getContext();
            o9c o9cVar = new o9c(this, i, (byte) 1);
            o9cVar.O = new zga(this, o9cVar, (byte) 2);
            this.f3 = o9cVar;
            setLayoutManager(o9cVar);
        }
    }

    @Override
    public final void t1(int i, float f, boolean z) {
        u1(new p12(this, (byte) 11), new sb((byte) 13), i, f, z);
    }

    public void G1() {
    }

    public void H1() {
    }

    public void L1() {
    }

    public void I1(f89 f89Var) {
    }

    public void J1(f89 f89Var) {
    }

    public void K1(f89 f89Var) {
    }

    public q9c(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar) {
        this(context, i, i2, z, iccVar, nccVar, occVar, vnbVar, -1, 1);
    }

    public q9c(e eVar, icc iccVar, ncc nccVar, occ occVar) {
        this(eVar.getContext(), eVar.getCurrentAccount(), eVar.getClassGuid(), false, iccVar, nccVar, occVar, eVar.getResourceProvider());
    }
}
