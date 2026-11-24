package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class ar7 extends cr2 {
    public final byte d;

    public ar7(t26 t26Var, byte b) {
        this.d = b;
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = t26Var;
    }

    @Override
    public final int a(View view) {
        int x;
        int i;
        switch (this.d) {
            case 0:
                x = d49.x(view);
                i = ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).rightMargin;
                break;
            default:
                x = d49.v(view);
                i = ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).bottomMargin;
                break;
        }
        return x + i;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                Rect rect = ((e49) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var).rightMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                Rect rect2 = ((e49) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) e49Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                Rect rect = ((e49) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) e49Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                Rect rect2 = ((e49) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) e49Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override
    public final int d(View view) {
        int w;
        int i;
        switch (this.d) {
            case 0:
                w = d49.w(view);
                i = ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).leftMargin;
                break;
            default:
                w = d49.y(view);
                i = ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).topMargin;
                break;
        }
        return w - i;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).m;
            default:
                return ((t26) this.b).n;
        }
    }

    @Override
    public final int f() {
        int i;
        int D;
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                i = t26Var.m;
                D = t26Var.D();
                break;
            default:
                t26 t26Var2 = (t26) this.b;
                i = t26Var2.n;
                D = t26Var2.B();
                break;
        }
        return i - D;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).D();
            default:
                return ((t26) this.b).B();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).k;
            default:
                return ((t26) this.b).l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).l;
            default:
                return ((t26) this.b).k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).C();
            default:
                return ((t26) this.b).I();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                return (t26Var.m - t26Var.C()) - t26Var.D();
            default:
                return ((t26) this.b).J();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((t26) this.b).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.c;
                ((t26) this.b).K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((t26) this.b).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.c;
                ((t26) this.b).K(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void p(int i) {
        int i2 = 0;
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((t26) this.b).b;
                if (recyclerView != null) {
                    int J = recyclerView.e.J();
                    while (i2 < J) {
                        recyclerView.e.I(i2).offsetLeftAndRight(i);
                        i2++;
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((t26) this.b).b;
                if (recyclerView2 != null) {
                    int J2 = recyclerView2.e.J();
                    while (i2 < J2) {
                        recyclerView2.e.I(i2).offsetTopAndBottom(i);
                        i2++;
                    }
                    return;
                }
                return;
        }
    }
}
