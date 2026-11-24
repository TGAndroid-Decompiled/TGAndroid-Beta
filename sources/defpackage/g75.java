package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class g75 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final g95 d;

    public g75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = g95Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        ha5 ha5Var;
        g95 g95Var = this.d;
        e75 e75Var = g95Var.l1;
        if (g95Var.W3 != 1.0f) {
            if (g95Var.M4 != null && g95Var.Q4) {
                canvas.save();
                float measuredHeight = (g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g95Var.M4.getAvatarImageView().getMeasuredHeight());
                float f = g95Var.W3;
                int L = (int) ((gm.L(13.0f) * f) + ((1.0f - g95Var.W3) * measuredHeight));
                int i = (int) ((1.0f - f) * measuredHeight);
                g95Var.M4.getAvatarWavesDrawable().a(canvas, g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, this);
                g95Var.M4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g95Var.M4.getAvatarImageView().s(L, L, i, i);
                g95Var.M4.getAvatarImageView().getImageReceiver().h(canvas, null);
                g95Var.M4.getAvatarImageView().setRoundRadius(g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (g95Var.P4 != null && g95Var.O4 == null && g95Var.E4) {
                canvas.save();
                float measuredHeight2 = (g95Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g95Var.P4.getAvatarImageView().getMeasuredHeight());
                float f2 = g95Var.W3;
                int L2 = (int) ((gm.L(13.0f) * f2) + ((1.0f - g95Var.W3) * measuredHeight2));
                int i2 = (int) ((1.0f - f2) * measuredHeight2);
                g95Var.P4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g95Var.P4.getAvatarImageView().s(L2, L2, i2, i2);
                g95Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                g95Var.P4.getAvatarImageView().setRoundRadius(g95Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e75Var.setAlpha(g95Var.W3);
        Path path = this.c;
        path.reset();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{gm.L(13.0f), gm.L(13.0f), gm.L(13.0f), gm.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e75Var.j1) {
            for (int i3 = 0; i3 < e75Var.getChildCount(); i3++) {
                view = e75Var.getChildAt(i3);
                if (view instanceof rr8) {
                    break;
                }
            }
        }
        view = null;
        if (view != null && (ha5Var = g95Var.O4) != null && ha5Var.w && !g95Var.v4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            e75Var.getChildVisibleRect(view, rect, null);
            int i4 = rect.left;
            if (i4 < (-e75Var.getMeasuredWidth())) {
                i4 += e75Var.getMeasuredWidth() << 1;
            } else if (i4 > e75Var.getMeasuredWidth()) {
                i4 -= e75Var.getMeasuredWidth() << 1;
            }
            canvas.translate(i4, 0.0f);
            g95Var.O4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.b.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
