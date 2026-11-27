package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
public final class l9 extends FrameLayout {
    public final hn a;
    public final Paint b;
    public final by2 c;
    public final Drawable d;
    public final int e;
    public int f;

    public l9(Activity activity, int i) {
        super(activity);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new by2(new m0(this, (byte) 4));
        this.e = i;
        this.d = activity.getResources().getDrawable(2131231119).mutate();
        hn hnVar = new hn(false, false, false);
        this.a = hnVar;
        hnVar.N = hl.q.x;
        hnVar.setCallback(this);
        hnVar.x(hl.o());
        hnVar.w(hl.L(14.0f));
        hnVar.u(-1);
        hnVar.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, hl.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i) {
        this.f = i;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.c.a(max);
            b(max);
        }
    }

    public final void b(long j) {
        String h0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        hn hnVar = this.a;
        if (i == 0) {
            hnVar.t(ob6.M0(2131750297, null), true, true);
            return;
        }
        int i2 = (j > 3600L ? 1 : (j == 3600L ? 0 : -1));
        int i3 = (int) j;
        if (i2 > 0) {
            h0 = hl.g0(i3, false, false);
        } else {
            h0 = hl.h0(i3, false);
        }
        hnVar.t(h0, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - hl.L(14.0f);
        hn hnVar = this.a;
        int c = measuredWidth - ((int) hnVar.c());
        int L = c - hl.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), hl.L(14.0f), hl.L(14.0f), this.b);
        canvas.restore();
        hnVar.setBounds(c, 0, getMeasuredWidth() - hl.L(8.0f), getMeasuredHeight() - hl.L(1.0f));
        hnVar.draw(canvas);
        int L2 = hl.L(-22.0f) + c;
        int L3 = hl.L(5.0f);
        int L4 = hl.L(-4.0f) + c;
        int L5 = hl.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(172.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
