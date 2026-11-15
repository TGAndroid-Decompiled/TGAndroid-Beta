package ch;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.mi0;
public final class a0 extends FrameLayout implements z5 {
    public final Drawable f4993a;
    public final Rect f4994b;
    public final Paint f4995c;
    public final int[] d;
    public final HashMap f4996e;
    public float f4997f;
    public float h;
    public float f4998n;
    public float f4999r;
    public float f5000s;
    public final Path f5001w;
    public final b0 f5002x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5002x = b0Var;
        Rect rect = new Rect();
        this.f4994b = rect;
        Paint paint = new Paint(1);
        this.f4995c = paint;
        this.d = new int[4];
        this.f4996e = new HashMap();
        this.f4997f = 0.0f;
        this.h = 0.0f;
        this.f4998n = 1.0f;
        this.f4999r = 0.0f;
        this.f5000s = 0.0f;
        this.f5001w = new Path();
        Drawable mutate = context.getDrawable(2131232674).mutate();
        this.f4993a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = j6.Ke;
        e6 e6Var = b0Var.f5024s;
        q6.x(this, mutate, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5029y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.w0(j6.G8, e6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f5002x;
        mi0 mi0Var = b0Var.f5019n;
        if (b0Var.f5029y != 1 && (mi0Var == null || mi0Var.getDelegate() == null || !mi0Var.getDelegate().L())) {
            return;
        }
        b0Var.f5018m.f49382g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5002x;
            if (b0Var.f5029y != 2 && (paint = this.f4995c) != null) {
                paint.setColor(j6.w0(j6.G8, b0Var.f5024s));
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
