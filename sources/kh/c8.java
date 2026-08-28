package kh;

import android.view.View;
public final class c8 implements View.OnClickListener {
    public final int f15045a;
    public final k8 f15046b;

    public c8(k8 k8Var, int i9) {
        this.f15045a = i9;
        this.f15046b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15045a) {
            case 0:
                this.f15046b.T();
                return;
            default:
                this.f15046b.W();
                return;
        }
    }
}
