package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class m0 extends androidx.emoji2.text.g {
    public final int d;

    public m0(j0 j0Var, int i10) {
        super(j0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int y8;
        int i10;
        switch (this.d) {
            case 0:
                ((j0) this.f1347b).getClass();
                y8 = w0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((j0) this.f1347b).getClass();
                y8 = w0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y8 + i10;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.f1347b).getClass();
                Rect rect = ((x0) view.getLayoutParams()).f6509b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).rightMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.f1347b).getClass();
                Rect rect2 = ((x0) view.getLayoutParams()).f6509b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) x0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin;
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
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.f1347b).getClass();
                Rect rect = ((x0) view.getLayoutParams()).f6509b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) x0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.f1347b).getClass();
                Rect rect2 = ((x0) view.getLayoutParams()).f6509b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) x0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int d(View view) {
        int x4;
        int i10;
        switch (this.d) {
            case 0:
                ((j0) this.f1347b).getClass();
                x4 = w0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((j0) this.f1347b).getClass();
                x4 = w0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((x0) view.getLayoutParams())).topMargin;
                break;
        }
        return x4 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((j0) this.f1347b).f6506m;
            default:
                return ((j0) this.f1347b).f6507n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.f1347b;
                i10 = j0Var.f6506m;
                E = j0Var.E();
                break;
            default:
                j0 j0Var2 = (j0) this.f1347b;
                i10 = j0Var2.f6507n;
                E = j0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((j0) this.f1347b).E();
            default:
                return ((j0) this.f1347b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((j0) this.f1347b).f6504k;
            default:
                return ((j0) this.f1347b).f6505l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((j0) this.f1347b).f6505l;
            default:
                return ((j0) this.f1347b).f6504k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((j0) this.f1347b).D();
            default:
                return ((j0) this.f1347b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.f1347b;
                return (j0Var.f6506m - j0Var.D()) - j0Var.E();
            default:
                return ((j0) this.f1347b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1348c;
                ((j0) this.f1347b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f1348c;
                ((j0) this.f1347b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f1348c;
                ((j0) this.f1347b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f1348c;
                ((j0) this.f1347b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((j0) this.f1347b).f6497b;
                if (recyclerView != null) {
                    int p10 = recyclerView.f1834e.p();
                    for (int i11 = 0; i11 < p10; i11++) {
                        recyclerView.f1834e.o(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((j0) this.f1347b).f6497b;
                if (recyclerView2 != null) {
                    int p11 = recyclerView2.f1834e.p();
                    for (int i12 = 0; i12 < p11; i12++) {
                        recyclerView2.f1834e.o(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
