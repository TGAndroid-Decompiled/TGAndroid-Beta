package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class j89 implements u79 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final i89 k;
    public int b = -1;
    public final int j = hl.L(80.0f);
    public final li7 l = new li7(this, (byte) 14);

    public j89(i89 i89Var) {
        this.k = i89Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i;
        int i2;
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        if (F != null) {
            i = RecyclerView.S(F);
        } else {
            i = -1;
        }
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        i89 i89Var = this.k;
        li7 li7Var = this.l;
        if (action != 1) {
            if (action == 2) {
                if (this.j > -1) {
                    if (y >= 0.0f && y <= this.d) {
                        this.h = false;
                        if (!this.g) {
                            this.g = true;
                            hl.r(li7Var);
                            hl.c3(li7Var);
                        }
                        this.i = ((int) (this.d - (y - 0.0f))) / 2;
                    } else if (y >= this.e && y <= this.f) {
                        this.g = false;
                        if (!this.h) {
                            this.h = true;
                            hl.r(li7Var);
                            hl.c3(li7Var);
                        }
                        this.i = ((int) ((y + this.f) - (this.e + i2))) / 2;
                    } else if (this.g || this.h) {
                        hl.r(li7Var);
                        this.g = false;
                        this.h = false;
                    }
                }
                if (i != -1 && this.b != i) {
                    this.b = i;
                    i89Var.n0(F, !i89Var.s0(i));
                    return;
                }
                return;
            }
            return;
        }
        this.c = false;
        this.g = false;
        this.h = false;
        hl.r(li7Var);
        i89Var.r(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().b() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.c && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.a = recyclerView;
            int i = this.j;
            if (i > -1) {
                this.d = i;
                this.e = recyclerView.getMeasuredHeight() - i;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z2 && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            hl.r(this.l);
            this.k.r(false);
        }
        return z2;
    }

    public final void d(int i, View view, boolean z) {
        if (this.c) {
            return;
        }
        this.b = -1;
        hl.r(this.l);
        this.g = false;
        this.h = false;
        i89 i89Var = this.k;
        if (!i89Var.w(i)) {
            this.c = false;
            return;
        }
        i89Var.r(true);
        i89Var.n0(view, z);
        this.c = true;
        this.b = i;
    }

    @Override
    public final void c(boolean z) {
    }
}
