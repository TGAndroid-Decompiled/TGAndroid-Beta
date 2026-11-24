package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class axb extends q5c {
    public final xl3 n3;
    public final lm o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public axb(Activity activity, int i, swb swbVar, twb twbVar, twb twbVar2, wjb wjbVar) {
        super(activity, i, 0, false, swbVar, twbVar, twbVar2, wjbVar);
        this.n3 = new xl3((byte) 7);
        this.o3 = new lm(320L, this, s33.h);
        this.r3 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.o3.d(canScrollVertically(-1));
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f = 0.0f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof jxb) {
                jxb jxbVar = (jxb) childAt;
                if (jxbVar.F) {
                    if (height > jxbVar.getY()) {
                        height = jxbVar.getY();
                        RecyclerView.R(jxbVar);
                    }
                    if (f < jxbVar.getY() + jxbVar.getHeight()) {
                        f = jxbVar.getY() + jxbVar.getHeight();
                        RecyclerView.R(jxbVar);
                    }
                }
            }
        }
        if (f > height) {
            int i3 = bkb.r9;
            wjb wjbVar = this.o2;
            int v0 = bkb.v0(i3, wjbVar);
            Paint paint = this.r3;
            paint.setColor(v0);
            RectF rectF = gl.P;
            rectF.set((getWidth() - gl.L(56.0f)) / 2.0f, height, (gl.L(56.0f) + getWidth()) / 2.0f, f);
            canvas2.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int v02 = bkb.v0(bkb.a9, wjbVar);
            if (this.q3 != v02) {
                Drawable drawable = this.p3;
                this.q3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + gl.L(4.0f)), (int) (rectF.top + gl.L(2.66f)), (int) (rectF.left + gl.L(13.66f)), (int) (rectF.top + gl.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i > 0) {
            canvas2.save();
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), gl.L(12.0f));
            this.n3.s(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
