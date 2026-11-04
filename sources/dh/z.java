package dh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.li0;
public final class z extends FrameLayout implements z5 {
    public final Drawable f9169a;
    public final Rect f9170b;
    public final Paint f9171c;
    public final int[] d;
    public final HashMap f9172e;
    public float f9173f;
    public float h;
    public float f9174n;
    public float f9175r;
    public float f9176s;
    public final Path f9177w;
    public final a0 f9178x;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f9178x = a0Var;
        Rect rect = new Rect();
        this.f9170b = rect;
        Paint paint = new Paint(1);
        this.f9171c = paint;
        this.d = new int[4];
        this.f9172e = new HashMap();
        this.f9173f = 0.0f;
        this.h = 0.0f;
        this.f9174n = 1.0f;
        this.f9175r = 0.0f;
        this.f9176s = 0.0f;
        this.f9177w = new Path();
        Drawable mutate = context.getDrawable(2131232671).mutate();
        this.f9169a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i3 = k6.He;
        e6 e6Var = a0Var.f8947s;
        r6.y(this, mutate, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        if (a0Var.f8952y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.w0(k6.G8, e6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: dh.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.f9178x;
        li0 li0Var = a0Var.f8942n;
        if (a0Var.f8952y != 1 && (li0Var == null || li0Var.getDelegate() == null || !li0Var.getDelegate().O())) {
            return;
        }
        a0Var.f8941m.f45452g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: dh.z.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            a0 a0Var = this.f9178x;
            if (a0Var.f8952y != 2 && (paint = this.f9171c) != null) {
                paint.setColor(k6.w0(k6.G8, a0Var.f8947s));
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
