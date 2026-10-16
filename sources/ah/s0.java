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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gl0;
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
        int i10 = g6.Td;
        c6 c6Var = t0Var.f883s;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (t0Var.f888y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(g6.w0(g6.G8, c6Var));
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
        gl0 gl0Var = t0Var.f878n;
        if (t0Var.f888y != 1 && (gl0Var == null || gl0Var.getDelegate() == null || !gl0Var.getDelegate().z())) {
            return;
        }
        t0Var.f877m.f39326f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.onMeasure(int, int):void");
    }
}
