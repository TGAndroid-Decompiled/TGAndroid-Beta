package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class k75 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final j95 d;

    public k75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = j95Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        ka5 ka5Var;
        j95 j95Var = this.d;
        i75 i75Var = j95Var.l1;
        if (j95Var.W3 != 1.0f) {
            if (j95Var.M4 != null && j95Var.Q4) {
                canvas.save();
                float measuredHeight = (j95Var.M4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j95Var.M4.getAvatarImageView().getMeasuredHeight());
                float f = j95Var.W3;
                int L = (int) ((hl.L(13.0f) * f) + ((1.0f - j95Var.W3) * measuredHeight));
                int i = (int) ((1.0f - f) * measuredHeight);
                j95Var.M4.getAvatarWavesDrawable().a(canvas, j95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, j95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, this);
                j95Var.M4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j95Var.M4.getAvatarImageView().s(L, L, i, i);
                j95Var.M4.getAvatarImageView().getImageReceiver().h(canvas, null);
                j95Var.M4.getAvatarImageView().setRoundRadius(j95Var.M4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (j95Var.P4 != null && j95Var.O4 == null && j95Var.E4) {
                canvas.save();
                float measuredHeight2 = (j95Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j95Var.P4.getAvatarImageView().getMeasuredHeight());
                float f2 = j95Var.W3;
                int L2 = (int) ((hl.L(13.0f) * f2) + ((1.0f - j95Var.W3) * measuredHeight2));
                int i2 = (int) ((1.0f - f2) * measuredHeight2);
                j95Var.P4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j95Var.P4.getAvatarImageView().s(L2, L2, i2, i2);
                j95Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                j95Var.P4.getAvatarImageView().setRoundRadius(j95Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        i75Var.setAlpha(j95Var.W3);
        Path path = this.c;
        path.reset();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{hl.L(13.0f), hl.L(13.0f), hl.L(13.0f), hl.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (i75Var.j1) {
            for (int i3 = 0; i3 < i75Var.getChildCount(); i3++) {
                view = i75Var.getChildAt(i3);
                if (view instanceof ct8) {
                    break;
                }
            }
        }
        view = null;
        if (view != null && (ka5Var = j95Var.O4) != null && ka5Var.w && !j95Var.v4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            i75Var.getChildVisibleRect(view, rect, null);
            int i4 = rect.left;
            if (i4 < (-i75Var.getMeasuredWidth())) {
                i4 += i75Var.getMeasuredWidth() << 1;
            } else if (i4 > i75Var.getMeasuredWidth()) {
                i4 -= i75Var.getMeasuredWidth() << 1;
            }
            canvas.translate(i4, 0.0f);
            j95Var.O4.draw(canvas);
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
