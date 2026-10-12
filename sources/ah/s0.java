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
    public final Drawable f853a;
    public final Rect f854b;
    public final Paint f855c;
    public final int[] d;
    public final HashMap e;
    public float f856f;
    public float h;
    public float f857n;
    public float f858r;
    public float f859s;
    public final Path v;
    public final t0 f860w;

    public s0(t0 t0Var, Context context) {
        super(context);
        this.f860w = t0Var;
        Rect rect = new Rect();
        this.f854b = rect;
        Paint paint = new Paint(1);
        this.f855c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f856f = 0.0f;
        this.h = 0.0f;
        this.f857n = 1.0f;
        this.f858r = 0.0f;
        this.f859s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f853a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = g6.Td;
        c6 c6Var = t0Var.f879s;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (t0Var.f884y == 2) {
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
        t0 t0Var = this.f860w;
        gl0 gl0Var = t0Var.f874n;
        if (t0Var.f884y != 1 && (gl0Var == null || gl0Var.getDelegate() == null || !gl0Var.getDelegate().D())) {
            return;
        }
        t0Var.f873m.f39633f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.onMeasure(int, int):void");
    }
}
