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
    public final Drawable f13942a;
    public final Rect f13943b;
    public final Paint f13944c;
    public final int[] d;
    public final HashMap e;
    public float f13945f;
    public float h;
    public float f13946n;
    public float f13947r;
    public float f13948s;
    public final Path v;
    public final d0 f13949w;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f13949w = d0Var;
        Rect rect = new Rect();
        this.f13943b = rect;
        Paint paint = new Paint(1);
        this.f13944c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f13945f = 0.0f;
        this.h = 0.0f;
        this.f13946n = 1.0f;
        this.f13947r = 0.0f;
        this.f13948s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f13942a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = d0Var.f13975s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.f13980y == 2) {
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
        d0 d0Var = this.f13949w;
        pk0 pk0Var = d0Var.f13970n;
        if (d0Var.f13980y != 1 && (pk0Var == null || pk0Var.getDelegate() == null || !pk0Var.getDelegate().o())) {
            return;
        }
        d0Var.f13969m.f39858c0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.onMeasure(int, int):void");
    }
}
