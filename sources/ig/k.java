package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.ui.ActionBar.t6;
public final class k extends ScrollView {
    public final LinearLayout f8338a;
    public final u f8339b;

    public k(u uVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.f8339b = uVar;
        this.f8338a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y3 = this.f8338a.getY() + org.telegram.messenger.i0.L(1.0f);
        int L = org.telegram.messenger.i0.L(36.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y3, (getMeasuredWidth() + L) / 2.0f, org.telegram.messenger.i0.L(4.0f) + y3);
        t6.f21218t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), t6.f21218t0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.f8339b.f8474i1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(24.0f)) * 0.8333333f) + org.telegram.messenger.i0.L(88.0f));
    }
}
