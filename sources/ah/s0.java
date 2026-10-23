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
import org.telegram.ui.Components.dl0;
public final class s0 extends FrameLayout {
    public final Drawable f857a;
    public final Rect f858b;
    public final Paint f859c;
    public final int[] d;
    public final HashMap e;
    public float f860f;
    public float h;
    public float f861n;
    public float f862r;
    public float f863s;
    public final Path v;
    public final t0 f864w;

    public s0(t0 t0Var, Context context) {
        super(context);
        this.f864w = t0Var;
        Rect rect = new Rect();
        this.f858b = rect;
        Paint paint = new Paint(1);
        this.f859c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f860f = 0.0f;
        this.h = 0.0f;
        this.f861n = 1.0f;
        this.f862r = 0.0f;
        this.f863s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f857a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = t0Var.f883s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (t0Var.f888y == 2) {
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
        t0 t0Var = this.f864w;
        dl0 dl0Var = t0Var.f878n;
        if (t0Var.f888y != 1 && (dl0Var == null || dl0Var.getDelegate() == null || !dl0Var.getDelegate().w())) {
            return;
        }
        t0Var.f877m.f43061f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.onMeasure(int, int):void");
    }
}
