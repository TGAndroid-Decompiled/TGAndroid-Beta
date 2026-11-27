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
public final class b1c extends q9c {
    public final pm3 n3;
    public final mm o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public b1c(Activity activity, int i, y0c y0cVar, t0c t0cVar, t0c t0cVar2, vnb vnbVar) {
        super(activity, i, 0, false, y0cVar, t0cVar, t0cVar2, vnbVar);
        this.n3 = new pm3((byte) 7);
        this.o3 = new mm(320L, this, k43.h);
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
            if (childAt instanceof k1c) {
                k1c k1cVar = (k1c) childAt;
                if (k1cVar.F) {
                    if (height > k1cVar.getY()) {
                        height = k1cVar.getY();
                        RecyclerView.S(k1cVar);
                    }
                    if (f < k1cVar.getY() + k1cVar.getHeight()) {
                        f = k1cVar.getY() + k1cVar.getHeight();
                        RecyclerView.S(k1cVar);
                    }
                }
            }
        }
        if (f > height) {
            int i3 = aob.s9;
            vnb vnbVar = this.o2;
            int v0 = aob.v0(i3, vnbVar);
            Paint paint = this.r3;
            paint.setColor(v0);
            RectF rectF = hl.P;
            rectF.set((getWidth() - hl.L(56.0f)) / 2.0f, height, (hl.L(56.0f) + getWidth()) / 2.0f, f);
            canvas2.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int v02 = aob.v0(aob.b9, vnbVar);
            if (this.q3 != v02) {
                Drawable drawable = this.p3;
                this.q3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + hl.L(4.0f)), (int) (rectF.top + hl.L(2.66f)), (int) (rectF.left + hl.L(13.66f)), (int) (rectF.top + hl.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i > 0) {
            canvas2.save();
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), hl.L(12.0f));
            this.n3.r(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
