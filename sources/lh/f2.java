package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ob1;
public final class f2 extends FrameLayout {
    public final ob1 f12735a;
    public int f12736b;
    public final org.telegram.ui.Components.z5 f12737c;
    public final ArrayList d;
    public final RectF f12738e;
    public final RectF f12739f;
    public final RectF h;
    public final Paint f12740n;
    public int f12741r;

    public f2(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f12738e = new RectF();
        this.f12739f = new RectF();
        this.h = new RectF();
        this.f12740n = new Paint(1);
        this.f12741r = Integer.MIN_VALUE;
        ob1 ob1Var = new ob1(this, context, 2);
        this.f12735a = ob1Var;
        ob1Var.setClipToPadding(false);
        ob1Var.setClipChildren(false);
        ob1Var.setOrientation(0);
        ob1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(ob1Var, k7.c6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f12737c = new org.telegram.ui.Components.z5(ob1Var, 0L, 320L, pr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
