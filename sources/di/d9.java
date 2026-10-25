package di;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;
public final class d9 extends View {
    public int f8495a;
    public int f8496b;
    public final Matrix f8497c;
    public final Paint[] d;
    public final org.telegram.ui.Components.h6 e;
    public boolean f8498f;
    public int h;
    public final Drawable[] f8499n;
    public final float[] f8500r;
    public boolean f8501s;
    public final Paint v;
    public final Path f8502w;
    public final xc f8503x;

    public d9(Context context) {
        super(context);
        this.f8497c = new Matrix();
        this.d = r0;
        this.e = new org.telegram.ui.Components.h6(this, 0L, 260L, ds.h);
        this.f8499n = new Drawable[2];
        this.f8500r = new float[2];
        Paint paint = new Paint(1);
        this.v = paint;
        this.f8502w = new Path();
        this.f8503x = new xc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, g7 g7Var, boolean z11) {
        fi.l9 l9Var;
        this.f8501s = z10;
        this.f8498f = true;
        int i10 = 0;
        if (g7Var != null && (l9Var = g7Var.f8585c.E0) != null) {
            int i11 = l9Var.f11181a;
            org.telegram.ui.Components.h6 h6Var = this.e;
            if (i11 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                h6Var.f(z11, !z11);
            } else if (i11 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                h6Var.f(z11, !z11);
            } else if (i11 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                h6Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                h6Var.f(z11, !z11);
            } else {
                this.f8498f = false;
            }
        } else {
            this.f8498f = false;
        }
        if (!this.f8498f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void b(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f8501s = z10;
        this.f8498f = true;
        int i10 = 0;
        if (storyItem == null) {
            this.f8498f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.h6 h6Var = this.e;
            if (z12) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                h6Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                h6Var.f(z11, true);
            } else if (!storyItem.selected_contacts && (!z10 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z10) {
                    c(17.33f, R.drawable.msg_folders_channels);
                    d(-15292942, -15630089);
                    h6Var.f(z11, true);
                } else {
                    this.f8498f = false;
                }
            } else {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                h6Var.f(z11, true);
            }
        }
        if (!this.f8498f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void c(float f7, int i10) {
        if (i10 == R.drawable.msg_stories_closefriends) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
        } else if (i10 == R.drawable.msg_folders_private) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
        } else if (i10 == R.drawable.msg_folders_groups) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
        } else if (i10 == R.drawable.msg_folders_channels) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
        }
        Drawable[] drawableArr = this.f8499n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f8500r;
        fArr[1] = fArr[0];
        if (drawable != null && i10 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i10;
        drawableArr[0] = resources.getDrawable(i10).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = AndroidUtilities.dpf2(f7);
        invalidate();
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f8495a == i10 && this.f8496b == i11) {
            return;
        }
        this.f8495a = i10;
        this.f8496b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(23.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f8497c;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int dp;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f8501s) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(14.0f);
        }
        return width + dp;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2;
        float dpf22;
        float f7;
        char c10;
        float f10;
        float centerX;
        float centerX2;
        if (!this.f8498f) {
            return;
        }
        if (this.f8501s) {
            dpf2 = 0.0f;
        } else {
            dpf2 = AndroidUtilities.dpf2(7.0f);
        }
        if (this.f8501s) {
            dpf22 = AndroidUtilities.dpf2(43.0f);
        } else {
            dpf22 = AndroidUtilities.dpf2(23.66f);
        }
        float dpf23 = AndroidUtilities.dpf2(23.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(c3.h0.B(getWidth(), dpf22, 2.0f, dpf2), (getHeight() - dpf23) / 2.0f, org.telegram.messenger.t.b(getWidth(), dpf22, 2.0f, dpf2), (getHeight() + dpf23) / 2.0f);
        float a2 = this.f8503x.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float d = this.e.d(0.0f, false);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i10 > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
        }
        if (d < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - d) * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
        }
        float abs = Math.abs(d - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f8499n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f8500r;
        if (drawable != null && d > 0.5f) {
            if (this.f8501s) {
                centerX2 = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f11 = (fArr[1] / 2.0f) * abs;
            f7 = 0.5f;
            c10 = 0;
            f10 = 12.0f;
            drawableArr[1].setBounds((int) vh.w(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f11), (int) (f11 + centerX2), (int) a1.g.c(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f7 = 0.5f;
            c10 = 0;
            f10 = 12.0f;
        }
        if (drawableArr[c10] != null && d <= f7) {
            if (this.f8501s) {
                centerX = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f12 = (fArr[c10] / 2.0f) * abs;
            drawableArr[c10].setBounds((int) vh.w(fArr[c10], 2.0f, abs, centerX), (int) (centerY2 - f12), (int) (f12 + centerX), (int) a1.g.c(fArr[c10], 2.0f, abs, rectF.centerY()));
            drawableArr[c10].draw(canvas);
        }
        if (this.f8501s) {
            Path path = this.f8502w;
            path.rewind();
            path.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
            path.lineTo(rectF.right - AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
            float dpf24 = AndroidUtilities.dpf2(1.33f);
            Paint paint = this.v;
            paint.setStrokeWidth(dpf24);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f8503x.c(z10);
    }
}
