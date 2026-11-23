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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.xi0;
public final class a0 extends FrameLayout implements b6 {
    public final Drawable f5311a;
    public final Rect f5312b;
    public final Paint f5313c;
    public final int[] d;
    public final HashMap f5314e;
    public float f5315f;
    public float h;
    public float f5316n;
    public float f5317r;
    public float f5318s;
    public final Path f5319w;
    public final b0 f5320x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5320x = b0Var;
        Rect rect = new Rect();
        this.f5312b = rect;
        Paint paint = new Paint(1);
        this.f5313c = paint;
        this.d = new int[4];
        this.f5314e = new HashMap();
        this.f5315f = 0.0f;
        this.h = 0.0f;
        this.f5316n = 1.0f;
        this.f5317r = 0.0f;
        this.f5318s = 0.0f;
        this.f5319w = new Path();
        Drawable mutate = context.getDrawable(2131232675).mutate();
        this.f5311a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = m6.Ke;
        h6 h6Var = b0Var.f5342s;
        t6.x(this, mutate, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5347y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(m6.w0(m6.G8, h6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f5320x;
        xi0 xi0Var = b0Var.f5337n;
        if (b0Var.f5347y != 1 && (xi0Var == null || xi0Var.getDelegate() == null || !xi0Var.getDelegate().E())) {
            return;
        }
        b0Var.f5336m.f51840g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5320x;
            if (b0Var.f5347y != 2 && (paint = this.f5313c) != null) {
                paint.setColor(m6.w0(m6.G8, b0Var.f5342s));
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
