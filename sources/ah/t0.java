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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fk0;
public final class t0 extends FrameLayout {
    public final Drawable f685a;
    public final Rect f686b;
    public final Paint f687c;
    public final int[] d;
    public final HashMap f688e;
    public float f689f;
    public float h;
    public float f690n;
    public float f691r;
    public float f692s;
    public final Path v;
    public final u0 f693w;

    public t0(u0 u0Var, Context context) {
        super(context);
        this.f693w = u0Var;
        Rect rect = new Rect();
        this.f686b = rect;
        Paint paint = new Paint(1);
        this.f687c = paint;
        this.d = new int[4];
        this.f688e = new HashMap();
        this.f689f = 0.0f;
        this.h = 0.0f;
        this.f690n = 1.0f;
        this.f691r = 0.0f;
        this.f692s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f685a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = u0Var.f713s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (u0Var.f718y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.t0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u0 u0Var = this.f693w;
        fk0 fk0Var = u0Var.f708n;
        if (u0Var.f718y != 1 && (fk0Var == null || fk0Var.getDelegate() == null || !fk0Var.getDelegate().S())) {
            return;
        }
        u0Var.f707m.f37669f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ah.t0.onMeasure(int, int):void");
    }
}
