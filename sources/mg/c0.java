package mg;

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
import org.telegram.ui.Components.pk0;
public final class c0 extends FrameLayout {
    public final Drawable f13954a;
    public final Rect f13955b;
    public final Paint f13956c;
    public final int[] d;
    public final HashMap e;
    public float f13957f;
    public float h;
    public float f13958n;
    public float f13959r;
    public float f13960s;
    public final Path v;
    public final d0 f13961w;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f13961w = d0Var;
        Rect rect = new Rect();
        this.f13955b = rect;
        Paint paint = new Paint(1);
        this.f13956c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f13957f = 0.0f;
        this.h = 0.0f;
        this.f13958n = 1.0f;
        this.f13959r = 0.0f;
        this.f13960s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f13954a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = d0Var.f13987s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.f13992y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d0 d0Var = this.f13961w;
        pk0 pk0Var = d0Var.f13982n;
        if (d0Var.f13992y != 1 && (pk0Var == null || pk0Var.getDelegate() == null || !pk0Var.getDelegate().s())) {
            return;
        }
        d0Var.f13981m.f37601c0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.onMeasure(int, int):void");
    }
}
