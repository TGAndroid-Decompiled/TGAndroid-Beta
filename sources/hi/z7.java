package hi;

import android.view.View;
public final class z7 implements View.OnClickListener {
    public final int f15920a;
    public final f8 f15921b;

    public z7(f8 f8Var, int i7) {
        this.f15920a = i7;
        this.f15921b = f8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15920a) {
            case 0:
                this.f15921b.f1();
                return;
            default:
                this.f15921b.i1();
                return;
        }
    }
}
