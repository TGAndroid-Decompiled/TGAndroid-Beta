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
public final class k9 extends FrameLayout {
    public final gn a;
    public final Paint b;
    public final hx2 c;
    public final Drawable d;
    public final int e;
    public int f;

    public k9(Activity activity, int i) {
        super(activity);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new hx2(new l0(this, (byte) 4));
        this.e = i;
        this.d = activity.getResources().getDrawable(2131231119).mutate();
        gn gnVar = new gn(false, false, false);
        this.a = gnVar;
        gnVar.N = gl.q.x;
        gnVar.setCallback(this);
        gnVar.x(gl.o());
        gnVar.w(gl.L(14.0f));
        gnVar.u(-1);
        gnVar.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
        gn gnVar = this.a;
        if (i == 0) {
            gnVar.t(k96.M0(2131750320, null), true, true);
            return;
        }
        int i2 = (j > 3600L ? 1 : (j == 3600L ? 0 : -1));
        int i3 = (int) j;
        if (i2 > 0) {
            h0 = gl.g0(i3, false, false);
        } else {
            h0 = gl.h0(i3, false);
        }
        gnVar.t(h0, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - gl.L(14.0f);
        gn gnVar = this.a;
        int c = measuredWidth - ((int) gnVar.c());
        int L = c - gl.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), gl.L(14.0f), gl.L(14.0f), this.b);
        canvas.restore();
        gnVar.setBounds(c, 0, getMeasuredWidth() - gl.L(8.0f), getMeasuredHeight() - gl.L(1.0f));
        gnVar.draw(canvas);
        int L2 = gl.L(-22.0f) + c;
        int L3 = gl.L(5.0f);
        int L4 = gl.L(-4.0f) + c;
        int L5 = gl.L(23.0f);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(172.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
