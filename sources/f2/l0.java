package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class l0 extends androidx.emoji2.text.g {
    public final int d;

    public l0(i0 i0Var, int i10) {
        super(i0Var);
        this.d = i10;
    }

    @Override
    public final int a(View view) {
        int y10;
        int i10;
        switch (this.d) {
            case 0:
                ((i0) this.f761b).getClass();
                y10 = v0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((i0) this.f761b).getClass();
                y10 = v0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y10 + i10;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.f761b).getClass();
                Rect rect = ((w0) view.getLayoutParams()).f5859b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.f761b).getClass();
                Rect rect2 = ((w0) view.getLayoutParams()).f5859b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
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
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.f761b).getClass();
                Rect rect = ((w0) view.getLayoutParams()).f5859b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) w0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.f761b).getClass();
                Rect rect2 = ((w0) view.getLayoutParams()).f5859b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) w0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override
    public final int d(View view) {
        int x10;
        int i10;
        switch (this.d) {
            case 0:
                ((i0) this.f761b).getClass();
                x10 = v0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((i0) this.f761b).getClass();
                x10 = v0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((i0) this.f761b).f5856m;
            default:
                return ((i0) this.f761b).f5857n;
        }
    }

    @Override
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.f761b;
                i10 = i0Var.f5856m;
                E = i0Var.E();
                break;
            default:
                i0 i0Var2 = (i0) this.f761b;
                i10 = i0Var2.f5857n;
                E = i0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((i0) this.f761b).E();
            default:
                return ((i0) this.f761b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((i0) this.f761b).f5854k;
            default:
                return ((i0) this.f761b).f5855l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((i0) this.f761b).f5855l;
            default:
                return ((i0) this.f761b).f5854k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((i0) this.f761b).D();
            default:
                return ((i0) this.f761b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.f761b;
                return (i0Var.f5856m - i0Var.D()) - i0Var.E();
            default:
                return ((i0) this.f761b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f762c;
                ((i0) this.f761b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f762c;
                ((i0) this.f761b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f762c;
                ((i0) this.f761b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f762c;
                ((i0) this.f761b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((i0) this.f761b).f5848b;
                if (recyclerView != null) {
                    int r10 = recyclerView.e.r();
                    for (int i11 = 0; i11 < r10; i11++) {
                        recyclerView.e.q(i11).offsetLeftAndRight(i10);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((i0) this.f761b).f5848b;
                if (recyclerView2 != null) {
                    int r11 = recyclerView2.e.r();
                    for (int i12 = 0; i12 < r11; i12++) {
                        recyclerView2.e.q(i12).offsetTopAndBottom(i10);
                    }
                    return;
                }
                return;
        }
    }
}
