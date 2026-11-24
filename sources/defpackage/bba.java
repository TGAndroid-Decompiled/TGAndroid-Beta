package defpackage;

import android.content.Context;
import android.view.View;
public final class bba extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public bba(Context context, hg9 hg9Var) {
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
                return 2131231233;
            }
            return 2131231234;
        } else if (z2) {
            return 2131231235;
        } else {
            return 2131232806;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(this.a), 1073741824));
    }

    public void setSize(int i) {
        this.a = i;
    }

    public bba(Context context, Object obj) {
        this(context, (hg9) null);
    }

    public bba(Context context) {
        this(context, (hg9) null);
    }

    public bba(Context context, int i, int i2) {
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
