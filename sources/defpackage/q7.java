package defpackage;

import android.view.View;
import android.widget.TextView;
public final class q7 {
    public final byte a;
    public byte b;
    public int c;
    public b29 d;
    public CharSequence e;
    public boolean f;
    public View g;
    public vo1 h;
    public byte i;
    public View j;
    public po1 k;
    public byte l = 0;
    public byte m = 0;
    public Integer n;
    public Integer o;

    public q7(int i) {
        this.a = i;
    }

    public final void a(int i, int i2) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i || this.o.intValue() != i2) {
            this.n = Integer.valueOf(i);
            this.o = Integer.valueOf(i2);
            View view = this.j;
            if (view instanceof b8) {
                ((b8) view).d(i, i2);
            }
        }
    }

    public final void b(int i) {
        if (i != this.c) {
            this.c = i;
            View view = this.j;
            if (view instanceof b8) {
                ((b8) view).setIcon(i);
            }
        }
    }

    public final void c(po1 po1Var) {
        this.k = po1Var;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(po1Var);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof b8) {
            ((b8) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i) {
        this.l = i;
        View view = this.j;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
