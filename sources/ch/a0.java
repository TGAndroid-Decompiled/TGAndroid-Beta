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
    public final Drawable f4996a;
    public final Rect f4997b;
    public final Paint f4998c;
    public final int[] d;
    public final HashMap f4999e;
    public float f5000f;
    public float h;
    public float f5001n;
    public float f5002r;
    public float f5003s;
    public final Path f5004w;
    public final b0 f5005x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5005x = b0Var;
        Rect rect = new Rect();
        this.f4997b = rect;
        Paint paint = new Paint(1);
        this.f4998c = paint;
        this.d = new int[4];
        this.f4999e = new HashMap();
        this.f5000f = 0.0f;
        this.h = 0.0f;
        this.f5001n = 1.0f;
        this.f5002r = 0.0f;
        this.f5003s = 0.0f;
        this.f5004w = new Path();
        Drawable mutate = context.getDrawable(2131232674).mutate();
        this.f4996a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = j6.Ke;
        e6 e6Var = b0Var.f5027s;
        q6.x(this, mutate, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5032y == 2) {
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
        b0 b0Var = this.f5005x;
        mi0 mi0Var = b0Var.f5022n;
        if (b0Var.f5032y != 1 && (mi0Var == null || mi0Var.getDelegate() == null || !mi0Var.getDelegate().L())) {
            return;
        }
        b0Var.f5021m.f49381g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5005x;
            if (b0Var.f5032y != 2 && (paint = this.f4998c) != null) {
                paint.setColor(j6.w0(j6.G8, b0Var.f5027s));
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
