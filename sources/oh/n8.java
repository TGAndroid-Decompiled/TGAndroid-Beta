package oh;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class n8 extends View {
    public int f17504a;
    public int f17505b;
    public final Matrix f17506c;
    public final Paint[] d;
    public final org.telegram.ui.Components.z5 f17507e;
    public boolean f17508f;
    public int h;
    public final Drawable[] f17509n;
    public final float[] f17510r;
    public boolean f17511s;
    public final Paint v;
    public final Path f17512w;
    public final rc f17513x;

    public n8(Context context) {
        super(context);
        this.f17506c = new Matrix();
        this.d = r0;
        this.f17507e = new org.telegram.ui.Components.z5(this, 0L, 260L, pr.h);
        this.f17509n = new Drawable[2];
        this.f17510r = new float[2];
        Paint paint = new Paint(1);
        this.v = paint;
        this.f17512w = new Path();
        this.f17513x = new rc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z4, s6 s6Var, boolean z10) {
        qh.a8 a8Var;
        this.f17511s = z4;
        this.f17508f = true;
        int i10 = 0;
        if (s6Var != null && (a8Var = s6Var.f17739c.E0) != null) {
            int i11 = a8Var.f44994a;
            org.telegram.ui.Components.z5 z5Var = this.f17507e;
            if (i11 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                z5Var.f(z10, !z10);
            } else if (i11 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                z5Var.f(z10, !z10);
            } else if (i11 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                z5Var.f(z10, !z10);
            } else if (z4) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                z5Var.f(z10, !z10);
            } else {
                this.f17508f = false;
            }
        } else {
            this.f17508f = false;
        }
        if (!this.f17508f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void b(boolean z4, TL_stories.StoryItem storyItem, boolean z10) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f17511s = z4;
        this.f17508f = true;
        int i10 = 0;
        if (storyItem == null) {
            this.f17508f = false;
        } else {
            boolean z11 = storyItem.close_friends;
            org.telegram.ui.Components.z5 z5Var = this.f17507e;
            if (z11) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                z5Var.f(z10, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                z5Var.f(z10, true);
            } else if (!storyItem.selected_contacts && (!z4 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z4) {
                    c(17.33f, R.drawable.msg_folders_channels);
                    d(-15292942, -15630089);
                    z5Var.f(z10, true);
                } else {
                    this.f17508f = false;
                }
            } else {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                z5Var.f(z10, true);
            }
        }
        if (!this.f17508f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void c(float f10, int i10) {
        if (i10 == R.drawable.msg_stories_closefriends) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
        } else if (i10 == R.drawable.msg_folders_private) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
        } else if (i10 == R.drawable.msg_folders_groups) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
        } else if (i10 == R.drawable.msg_folders_channels) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
        }
        Drawable[] drawableArr = this.f17509n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f17510r;
        fArr[1] = fArr[0];
        if (drawable != null && i10 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i10;
        drawableArr[0] = resources.getDrawable(i10).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = AndroidUtilities.dpf2(f10);
        invalidate();
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f17504a == i10 && this.f17505b == i11) {
            return;
        }
        this.f17504a = i10;
        this.f17505b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(23.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f17506c;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int dp;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f17511s) {
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
        char c3;
        float f10;
        float f11;
        float centerX;
        float centerX2;
        if (!this.f17508f) {
            return;
        }
        if (this.f17511s) {
            dpf2 = 0.0f;
        } else {
            dpf2 = AndroidUtilities.dpf2(7.0f);
        }
        if (this.f17511s) {
            dpf22 = AndroidUtilities.dpf2(43.0f);
        } else {
            dpf22 = AndroidUtilities.dpf2(23.66f);
        }
        float dpf23 = AndroidUtilities.dpf2(23.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(e2.c.x(getWidth(), dpf22, 2.0f, dpf2), (getHeight() - dpf23) / 2.0f, l.d.b(getWidth(), dpf22, 2.0f, dpf2), (getHeight() + dpf23) / 2.0f);
        float a2 = this.f17513x.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float d = this.f17507e.d(0.0f, false);
        Paint[] paintArr = this.d;
        if (d > 0.0f) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
        }
        if (d < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - d) * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
        }
        float abs = Math.abs(d - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f17509n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f17510r;
        if (drawable != null && d > 0.5f) {
            if (this.f17511s) {
                centerX2 = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f12 = (fArr[1] / 2.0f) * abs;
            f11 = 0.5f;
            c3 = 0;
            f10 = 12.0f;
            drawableArr[1].setBounds((int) org.telegram.messenger.y3.A(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f12), (int) (f12 + centerX2), (int) w.c.c(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            c3 = 0;
            f10 = 12.0f;
            f11 = 0.5f;
        }
        if (drawableArr[c3] != null && d <= f11) {
            if (this.f17511s) {
                centerX = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f13 = (fArr[c3] / 2.0f) * abs;
            drawableArr[c3].setBounds((int) org.telegram.messenger.y3.A(fArr[c3], 2.0f, abs, centerX), (int) (centerY2 - f13), (int) (f13 + centerX), (int) w.c.c(fArr[c3], 2.0f, abs, rectF.centerY()));
            drawableArr[c3].draw(canvas);
        }
        if (this.f17511s) {
            Path path = this.f17512w;
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
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f17513x.c(z4);
    }
}
