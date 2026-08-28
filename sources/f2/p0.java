package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class p0 extends androidx.emoji2.text.f {
    public final int d;

    public p0(m0 m0Var, int i9) {
        super(m0Var);
        this.d = i9;
    }

    @Override
    public final int a(View view) {
        int y10;
        int i9;
        switch (this.d) {
            case 0:
                ((m0) this.f850b).getClass();
                y10 = z0.y(view);
                i9 = ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((m0) this.f850b).getClass();
                y10 = z0.v(view);
                i9 = ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).bottomMargin;
                break;
        }
        return y10 + i9;
    }

    @Override
    public final int b(View view) {
        int measuredWidth;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.f850b).getClass();
                Rect rect = ((a1) view.getLayoutParams()).f5312b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.f850b).getClass();
                Rect rect2 = ((a1) view.getLayoutParams()).f5312b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                break;
        }
        return measuredWidth + i9;
    }

    @Override
    public final int c(View view) {
        int measuredHeight;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.f850b).getClass();
                Rect rect = ((a1) view.getLayoutParams()).f5312b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.f850b).getClass();
                Rect rect2 = ((a1) view.getLayoutParams()).f5312b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) a1Var2).leftMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).rightMargin;
                break;
        }
        return measuredHeight + i9;
    }

    @Override
    public final int d(View view) {
        int x10;
        int i9;
        switch (this.d) {
            case 0:
                ((m0) this.f850b).getClass();
                x10 = z0.x(view);
                i9 = ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((m0) this.f850b).getClass();
                x10 = z0.z(view);
                i9 = ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).topMargin;
                break;
        }
        return x10 - i9;
    }

    @Override
    public final int e() {
        switch (this.d) {
            case 0:
                return ((m0) this.f850b).f5572m;
            default:
                return ((m0) this.f850b).f5573n;
        }
    }

    @Override
    public final int f() {
        int i9;
        int E;
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f850b;
                i9 = m0Var.f5572m;
                E = m0Var.E();
                break;
            default:
                m0 m0Var2 = (m0) this.f850b;
                i9 = m0Var2.f5573n;
                E = m0Var2.C();
                break;
        }
        return i9 - E;
    }

    @Override
    public final int g() {
        switch (this.d) {
            case 0:
                return ((m0) this.f850b).E();
            default:
                return ((m0) this.f850b).C();
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((m0) this.f850b).f5570k;
            default:
                return ((m0) this.f850b).f5571l;
        }
    }

    @Override
    public final int i() {
        switch (this.d) {
            case 0:
                return ((m0) this.f850b).f5571l;
            default:
                return ((m0) this.f850b).f5570k;
        }
    }

    @Override
    public final int j() {
        switch (this.d) {
            case 0:
                return ((m0) this.f850b).D();
            default:
                return ((m0) this.f850b).J();
        }
    }

    @Override
    public final int k() {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f850b;
                return (m0Var.f5572m - m0Var.D()) - m0Var.E();
            default:
                return ((m0) this.f850b).K();
        }
    }

    @Override
    public final int l(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f851c;
                ((m0) this.f850b).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f851c;
                ((m0) this.f850b).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int m(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f851c;
                ((m0) this.f850b).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f851c;
                ((m0) this.f850b).L(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void n(int i9) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((m0) this.f850b).f5563b;
                if (recyclerView != null) {
                    int q10 = recyclerView.f1344e.q();
                    for (int i10 = 0; i10 < q10; i10++) {
                        recyclerView.f1344e.p(i10).offsetLeftAndRight(i9);
                    }
                    return;
                }
                return;
            default:
                RecyclerView recyclerView2 = ((m0) this.f850b).f5563b;
                if (recyclerView2 != null) {
                    int q11 = recyclerView2.f1344e.q();
                    for (int i11 = 0; i11 < q11; i11++) {
                        recyclerView2.f1344e.p(i11).offsetTopAndBottom(i9);
                    }
                    return;
                }
                return;
        }
    }
}
