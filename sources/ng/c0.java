package ng;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.qk0;
public final class c0 extends FrameLayout {
    public final Drawable f16015a;
    public final Rect f16016b;
    public final Paint f16017c;
    public final int[] d;
    public final HashMap f16018e;
    public float f16019f;
    public float h;
    public float f16020n;
    public float f16021r;
    public float f16022s;
    public final Path v;
    public final d0 f16023w;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f16023w = d0Var;
        Rect rect = new Rect();
        this.f16016b = rect;
        Paint paint = new Paint(1);
        this.f16017c = paint;
        this.d = new int[4];
        this.f16018e = new HashMap();
        this.f16019f = 0.0f;
        this.h = 0.0f;
        this.f16020n = 1.0f;
        this.f16021r = 0.0f;
        this.f16022s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f16015a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = k6.Td;
        g6 g6Var = d0Var.f16051s;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.f16056y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.v0(k6.G8, g6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ng.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d0 d0Var = this.f16023w;
        qk0 qk0Var = d0Var.f16046n;
        if (d0Var.f16056y != 1 && (qk0Var == null || qk0Var.getDelegate() == null || !qk0Var.getDelegate().t())) {
            return;
        }
        d0Var.f16045m.f42309c0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ng.c0.onMeasure(int, int):void");
    }
}
