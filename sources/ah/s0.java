package ah;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.gl0;
public final class s0 extends FrameLayout implements b6 {
    public final Drawable f858a;
    public final Rect f859b;
    public final Paint f860c;
    public final int[] d;
    public final HashMap e;
    public float f861f;
    public float h;
    public float f862n;
    public float f863r;
    public float f864s;
    public final Path v;
    public final t0 f865w;

    public s0(t0 t0Var, Context context) {
        super(context);
        this.f865w = t0Var;
        Rect rect = new Rect();
        this.f859b = rect;
        Paint paint = new Paint(1);
        this.f860c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f861f = 0.0f;
        this.h = 0.0f;
        this.f862n = 1.0f;
        this.f863r = 0.0f;
        this.f864s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f858a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = k6.Td;
        g6 g6Var = t0Var.f884s;
        r6.z(this, mutate, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        if (t0Var.f889y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.w0(k6.G8, g6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t0 t0Var = this.f865w;
        gl0 gl0Var = t0Var.f879n;
        if (t0Var.f889y != 1 && (gl0Var == null || gl0Var.getDelegate() == null || !gl0Var.getDelegate().w())) {
            return;
        }
        t0Var.f878m.f35901f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.s0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            t0 t0Var = this.f865w;
            if (t0Var.f889y != 2 && (paint = this.f860c) != null) {
                paint.setColor(k6.w0(k6.G8, t0Var.f884s));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
