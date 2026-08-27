package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class n0 extends androidx.emoji2.text.g {
    public final int d;

    public n0(k0 k0Var, int i10) {
        super(k0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int iY;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                iY = x0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                iY = x0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin;
                break;
        }
        return iY + i10;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                Rect rect = ((y0) view.getLayoutParams()).f5865b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                Rect rect2 = ((y0) view.getLayoutParams()).f5865b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) y0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                Rect rect = ((y0) view.getLayoutParams()).f5865b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) y0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                Rect rect2 = ((y0) view.getLayoutParams()).f5865b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) y0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int d(View view) {
        int iX;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                iX = x0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.f1352b).getClass();
                iX = x0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).topMargin;
                break;
        }
        return iX - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((k0) this.f1352b).f5862m;
            default:
                return ((k0) this.f1352b).f5863n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int iE;
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.f1352b;
                i10 = k0Var.f5862m;
                iE = k0Var.E();
                break;
            default:
                k0 k0Var2 = (k0) this.f1352b;
                i10 = k0Var2.f5863n;
                iE = k0Var2.C();
                break;
        }
        return i10 - iE;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((k0) this.f1352b).E();
            default:
                return ((k0) this.f1352b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((k0) this.f1352b).f5860k;
            default:
                return ((k0) this.f1352b).f5861l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((k0) this.f1352b).f5861l;
            default:
                return ((k0) this.f1352b).f5860k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((k0) this.f1352b).D();
            default:
                return ((k0) this.f1352b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.f1352b;
                return (k0Var.f5862m - k0Var.D()) - k0Var.E();
            default:
                return ((k0) this.f1352b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.f1352b;
                Rect rect = (Rect) this.f1353c;
                k0Var.L(view, rect);
                return rect.right;
            default:
                k0 k0Var2 = (k0) this.f1352b;
                Rect rect2 = (Rect) this.f1353c;
                k0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.f1352b;
                Rect rect = (Rect) this.f1353c;
                k0Var.L(view, rect);
                return rect.left;
            default:
                k0 k0Var2 = (k0) this.f1352b;
                Rect rect2 = (Rect) this.f1353c;
                k0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((k0) this.f1352b).f5853b;
                if (recyclerView != null) {
                    int iO = recyclerView.f1840e.o();
                    for (int i11 = 0; i11 < iO; i11++) {
                        recyclerView.f1840e.n(i11).offsetLeftAndRight(i10);
                    }
                }
                break;
            default:
                RecyclerView recyclerView2 = ((k0) this.f1352b).f5853b;
                if (recyclerView2 != null) {
                    int iO2 = recyclerView2.f1840e.o();
                    for (int i12 = 0; i12 < iO2; i12++) {
                        recyclerView2.f1840e.n(i12).offsetTopAndBottom(i10);
                    }
                }
                break;
        }
    }
}
