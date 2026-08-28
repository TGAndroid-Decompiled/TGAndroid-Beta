package hg;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.uj0;
public final class d0 extends FrameLayout {
    public final Drawable f10563a;
    public final Rect f10564b;
    public final Paint f10565c;
    public final int[] d;
    public final HashMap f10566e;
    public float f10567f;
    public float h;
    public float f10568n;
    public float f10569r;
    public float f10570s;
    public final Path v;
    public final e0 f10571w;

    public d0(e0 e0Var, Context context) {
        super(context);
        this.f10571w = e0Var;
        Rect rect = new Rect();
        this.f10564b = rect;
        Paint paint = new Paint(1);
        this.f10565c = paint;
        this.d = new int[4];
        this.f10566e = new HashMap();
        this.f10567f = 0.0f;
        this.h = 0.0f;
        this.f10568n = 1.0f;
        this.f10569r = 0.0f;
        this.f10570s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f10563a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i9 = f6.Td;
        b6 b6Var = e0Var.f10590s;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        if (e0Var.f10595y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(f6.v0(f6.G8, b6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: hg.d0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e0 e0Var = this.f10571w;
        uj0 uj0Var = e0Var.f10585n;
        if (e0Var.f10595y != 1 && (uj0Var == null || uj0Var.getDelegate() == null || !uj0Var.getDelegate().u())) {
            return;
        }
        e0Var.f10584m.f36664b0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: hg.d0.onMeasure(int, int):void");
    }
}
