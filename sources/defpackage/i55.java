package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class i55 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final h75 d;

    public i55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = h75Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        h85 h85Var;
        h75 h75Var = this.d;
        g55 g55Var = h75Var.l1;
        if (h75Var.W3 != 1.0f) {
            if (h75Var.M4 != null && h75Var.Q4) {
                canvas.save();
                float measuredHeight = (h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / h75Var.M4.getAvatarImageView().getMeasuredHeight());
                float f = h75Var.W3;
                int L = (int) ((gl.L(13.0f) * f) + ((1.0f - h75Var.W3) * measuredHeight));
                int i = (int) ((1.0f - f) * measuredHeight);
                h75Var.M4.getAvatarWavesDrawable().a(canvas, h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2, h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2, this);
                h75Var.M4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h75Var.M4.getAvatarImageView().s(L, L, i, i);
                h75Var.M4.getAvatarImageView().getImageReceiver().h(canvas, null);
                h75Var.M4.getAvatarImageView().setRoundRadius(h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (h75Var.P4 != null && h75Var.O4 == null && h75Var.E4) {
                canvas.save();
                float measuredHeight2 = (h75Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / h75Var.P4.getAvatarImageView().getMeasuredHeight());
                float f2 = h75Var.W3;
                int L2 = (int) ((gl.L(13.0f) * f2) + ((1.0f - h75Var.W3) * measuredHeight2));
                int i2 = (int) ((1.0f - f2) * measuredHeight2);
                h75Var.P4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h75Var.P4.getAvatarImageView().s(L2, L2, i2, i2);
                h75Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                h75Var.P4.getAvatarImageView().setRoundRadius(h75Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        g55Var.setAlpha(h75Var.W3);
        Path path = this.c;
        path.reset();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{gl.L(13.0f), gl.L(13.0f), gl.L(13.0f), gl.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (g55Var.j1) {
            for (int i3 = 0; i3 < g55Var.getChildCount(); i3++) {
                view = g55Var.getChildAt(i3);
                if (view instanceof qp8) {
                    break;
                }
            }
        }
        view = null;
        if (view != null && (h85Var = h75Var.O4) != null && h85Var.w && !h75Var.v4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            g55Var.getChildVisibleRect(view, rect, null);
            int i4 = rect.left;
            if (i4 < (-g55Var.getMeasuredWidth())) {
                i4 += g55Var.getMeasuredWidth() << 1;
            } else if (i4 > g55Var.getMeasuredWidth()) {
                i4 -= g55Var.getMeasuredWidth() << 1;
            }
            canvas.translate(i4, 0.0f);
            h75Var.O4.draw(canvas);
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
