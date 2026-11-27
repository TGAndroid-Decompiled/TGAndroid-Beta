package defpackage;

import android.content.Context;
import android.view.View;
public final class rca extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public rca(Context context, uh9 uh9Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i = this.b;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }

    private int getBackgroundResId() {
        boolean z = this.c;
        boolean z2 = this.d;
        if (z) {
            if (z2) {
                return 2131231232;
            }
            return 2131231233;
        } else if (z2) {
            return 2131231234;
        } else {
            return 2131232812;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(this.a), 1073741824));
    }

    public void setSize(int i) {
        this.a = i;
    }

    public rca(Context context, Object obj) {
        this(context, (uh9) null);
    }

    public rca(Context context) {
        this(context, (uh9) null);
    }

    public rca(Context context, int i, int i2) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i;
        this.a = 12;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }
}
