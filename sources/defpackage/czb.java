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
public final class czb extends q7c {
    public final in3 n3;
    public final ln o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public czb(Activity activity, int i, vyb vybVar, wyb wybVar, wyb wybVar2, ylb ylbVar) {
        super(activity, i, 0, false, vybVar, wybVar, wybVar2, ylbVar);
        this.n3 = new in3((byte) 7);
        this.o3 = new ln(320L, this, d53.h);
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
            if (childAt instanceof lzb) {
                lzb lzbVar = (lzb) childAt;
                if (lzbVar.F) {
                    if (height > lzbVar.getY()) {
                        height = lzbVar.getY();
                        RecyclerView.R(lzbVar);
                    }
                    if (f < lzbVar.getY() + lzbVar.getHeight()) {
                        f = lzbVar.getY() + lzbVar.getHeight();
                        RecyclerView.R(lzbVar);
                    }
                }
            }
        }
        if (f > height) {
            int i3 = cmb.r9;
            ylb ylbVar = this.o2;
            int v0 = cmb.v0(i3, ylbVar);
            Paint paint = this.r3;
            paint.setColor(v0);
            RectF rectF = gm.P;
            rectF.set((getWidth() - gm.L(56.0f)) / 2.0f, height, (gm.L(56.0f) + getWidth()) / 2.0f, f);
            canvas2.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(2131232207).mutate();
            }
            int v02 = cmb.v0(cmb.a9, ylbVar);
            if (this.q3 != v02) {
                Drawable drawable = this.p3;
                this.q3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + gm.L(4.0f)), (int) (rectF.top + gm.L(2.66f)), (int) (rectF.left + gm.L(13.66f)), (int) (rectF.top + gm.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (i > 0) {
            canvas2.save();
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, 0.0f, getWidth(), gm.L(12.0f));
            this.n3.r(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
