package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s51;
public final class a3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final s51 f483a;
    public int f484b;
    public final org.telegram.ui.Components.u5 f485c;
    public final ArrayList d;
    public final RectF f486e;
    public final RectF f487f;
    public final RectF h;
    public final Paint f488n;
    public int f489r;

    public a3(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f486e = new RectF();
        this.f487f = new RectF();
        this.h = new RectF();
        this.f488n = new Paint(1);
        this.f489r = Integer.MIN_VALUE;
        s51 s51Var = new s51(1, context, this);
        this.f483a = s51Var;
        s51Var.setClipToPadding(false);
        s51Var.setClipChildren(false);
        s51Var.setOrientation(0);
        s51Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(s51Var, mf.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f485c = new org.telegram.ui.Components.u5(s51Var, 0L, 320L, xq.h);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                ((TextView) arrayList.get(i3)).setTextColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27842b6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27861c6, false)));
                i3++;
            } else {
                this.f483a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
