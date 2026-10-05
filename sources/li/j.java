package li;

import org.telegram.ui.Components.so0;
public final class j implements Runnable {
    public int f15658a;
    public int f15659b;
    public final so0 f15660c;
    public final p d;

    public j(p pVar, so0 so0Var) {
        this.d = pVar;
        this.f15660c = so0Var;
    }

    @Override
    public final void run() {
        so0 so0Var = this.f15660c;
        int scrollX = so0Var.getScrollX();
        int scrollY = so0Var.getScrollY();
        p pVar = this.d;
        pVar.f15677i += scrollX - this.f15658a;
        pVar.f15678j += scrollY - this.f15659b;
        this.f15658a = scrollX;
        this.f15659b = scrollY;
        pVar.f15674e++;
    }
}
