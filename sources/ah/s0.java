package ah;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cl0;
public final class s0 extends FrameLayout {
    public final Drawable f859a;
    public final Rect f860b;
    public final Paint f861c;
    public final int[] d;
    public final HashMap e;
    public float f862f;
    public float h;
    public float f863n;
    public float f864r;
    public float f865s;
    public final Path v;
    public final t0 f866w;

    public s0(t0 t0Var, Context context) {
        super(context);
        this.f866w = t0Var;
        Rect rect = new Rect();
        this.f860b = rect;
        Paint paint = new Paint(1);
        this.f861c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f862f = 0.0f;
        this.h = 0.0f;
        this.f863n = 1.0f;
        this.f864r = 0.0f;
        this.f865s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f859a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = t0Var.f885s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (t0Var.f890y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.w0(h6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t0 t0Var = this.f866w;
        cl0 cl0Var = t0Var.f880n;
        if (t0Var.f890y != 1 && (cl0Var == null || cl0Var.getDelegate() == null || !cl0Var.getDelegate().r())) {
            return;
        }
        t0Var.f879m.f43618f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.onMeasure(int, int):void");
    }
}
