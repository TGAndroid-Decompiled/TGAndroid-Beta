package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.er;
import org.telegram.ui.z51;
public final class r2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final z51 f3822a;
    public int f3823b;
    public final org.telegram.ui.Components.u5 f3824c;
    public final ArrayList d;
    public final RectF f3825e;
    public final RectF f3826f;
    public final RectF h;
    public final Paint f3827n;
    public int f3828r;

    public r2(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f3825e = new RectF();
        this.f3826f = new RectF();
        this.h = new RectF();
        this.f3827n = new Paint(1);
        this.f3828r = Integer.MIN_VALUE;
        z51 z51Var = new z51(1, context, this);
        this.f3822a = z51Var;
        z51Var.setClipToPadding(false);
        z51Var.setClipChildren(false);
        z51Var.setOrientation(0);
        z51Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(z51Var, ja.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f3824c = new org.telegram.ui.Components.u5(z51Var, 0L, 320L, er.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((TextView) arrayList.get(i7)).setTextColor(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28812b6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28831c6, false)));
                i7++;
            } else {
                this.f3822a.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
