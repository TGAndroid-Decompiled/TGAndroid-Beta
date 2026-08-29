package kg;

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
import org.telegram.ui.Components.fk0;
public final class c0 extends FrameLayout {
    public final Drawable f13661a;
    public final Rect f13662b;
    public final Paint f13663c;
    public final int[] d;
    public final HashMap f13664e;
    public float f13665f;
    public float h;
    public float f13666n;
    public float f13667r;
    public float f13668s;
    public final Path v;
    public final d0 f13669w;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f13669w = d0Var;
        Rect rect = new Rect();
        this.f13662b = rect;
        Paint paint = new Paint(1);
        this.f13663c = paint;
        this.d = new int[4];
        this.f13664e = new HashMap();
        this.f13665f = 0.0f;
        this.h = 0.0f;
        this.f13666n = 1.0f;
        this.f13667r = 0.0f;
        this.f13668s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f13661a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = g6.Td;
        c6 c6Var = d0Var.f13697s;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.f13702y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(g6.v0(g6.G8, c6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: kg.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d0 d0Var = this.f13669w;
        fk0 fk0Var = d0Var.f13692n;
        if (d0Var.f13702y != 1 && (fk0Var == null || fk0Var.getDelegate() == null || !fk0Var.getDelegate().O())) {
            return;
        }
        d0Var.f13691m.f37321b0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: kg.c0.onMeasure(int, int):void");
    }
}
