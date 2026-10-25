package bh;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.fl0;
public final class h0 extends FrameLayout implements p6 {
    public final Drawable f4037a;
    public final Rect f4038b;
    public final Paint f4039c;
    public final int[] d;
    public final HashMap e;
    public float f4040f;
    public float h;
    public float f4041n;
    public float f4042r;
    public float f4043s;
    public final Path v;
    public final i0 f4044w;

    public h0(i0 i0Var, Context context) {
        super(context);
        this.f4044w = i0Var;
        Rect rect = new Rect();
        this.f4038b = rect;
        Paint paint = new Paint(1);
        this.f4039c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f4040f = 0.0f;
        this.h = 0.0f;
        this.f4041n = 1.0f;
        this.f4042r = 0.0f;
        this.f4043s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f4037a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = y6.Td;
        u6 u6Var = i0Var.f4062s;
        f7.y(this, mutate, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        if (i0Var.f4067y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(y6.w0(y6.G8, u6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: bh.h0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        i0 i0Var = this.f4044w;
        fl0 fl0Var = i0Var.f4057n;
        if (i0Var.f4067y != 1 && (fl0Var == null || fl0Var.getDelegate() == null || !fl0Var.getDelegate().o())) {
            return;
        }
        i0Var.f4056m.f38292f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: bh.h0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            i0 i0Var = this.f4044w;
            if (i0Var.f4067y != 2 && (paint = this.f4039c) != null) {
                paint.setColor(y6.w0(y6.G8, i0Var.f4062s));
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
