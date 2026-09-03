package kh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.pb1;
public final class f2 extends FrameLayout {
    public final pb1 f10711a;
    public int f10712b;
    public final org.telegram.ui.Components.z5 f10713c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f10714f;
    public final RectF h;
    public final Paint f10715n;
    public int f10716r;

    public f2(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f10714f = new RectF();
        this.h = new RectF();
        this.f10715n = new Paint(1);
        this.f10716r = Integer.MIN_VALUE;
        pb1 pb1Var = new pb1(this, context, 2);
        this.f10711a = pb1Var;
        pb1Var.setClipToPadding(false);
        pb1Var.setClipChildren(false);
        pb1Var.setOrientation(0);
        pb1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(pb1Var, k7.b6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f10713c = new org.telegram.ui.Components.z5(pb1Var, 0L, 320L, mr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
