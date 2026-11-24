package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w49 implements h49 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final v49 k;
    public int b = -1;
    public final int j = gl.L(80.0f);
    public final bg7 l = new bg7(this, (byte) 14);

    public w49(v49 v49Var) {
        this.k = v49Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i;
        int i2;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i = RecyclerView.R(E);
        } else {
            i = -1;
        }
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        v49 v49Var = this.k;
        bg7 bg7Var = this.l;
        if (action != 1) {
            if (action == 2) {
                if (this.j > -1) {
                    if (y >= 0.0f && y <= this.d) {
                        this.h = false;
                        if (!this.g) {
                            this.g = true;
                            gl.r(bg7Var);
                            gl.c3(bg7Var);
                        }
                        this.i = ((int) (this.d - (y - 0.0f))) / 2;
                    } else if (y >= this.e && y <= this.f) {
                        this.g = false;
                        if (!this.h) {
                            this.h = true;
                            gl.r(bg7Var);
                            gl.c3(bg7Var);
                        }
                        this.i = ((int) ((y + this.f) - (this.e + i2))) / 2;
                    } else if (this.g || this.h) {
                        gl.r(bg7Var);
                        this.g = false;
                        this.h = false;
                    }
                }
                if (i != -1 && this.b != i) {
                    this.b = i;
                    v49Var.H1(E, !v49Var.n2(i));
                    return;
                }
                return;
            }
            return;
        }
        this.c = false;
        this.g = false;
        this.h = false;
        gl.r(bg7Var);
        v49Var.v(false);
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
            gl.r(this.l);
            this.k.v(false);
        }
        return z2;
    }

    public final void d(int i, View view, boolean z) {
        if (this.c) {
            return;
        }
        this.b = -1;
        gl.r(this.l);
        this.g = false;
        this.h = false;
        v49 v49Var = this.k;
        if (!v49Var.K(i)) {
            this.c = false;
            return;
        }
        v49Var.v(true);
        v49Var.H1(view, z);
        this.c = true;
        this.b = i;
    }

    @Override
    public final void c(boolean z) {
    }
}
