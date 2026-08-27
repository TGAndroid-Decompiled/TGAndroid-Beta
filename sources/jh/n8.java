package jh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;

public final class n8 extends View {

    public int f13706a;

    public int f13707b;

    public final Matrix f13708c;
    public final Paint[] d;

    public final org.telegram.ui.Components.y5 f13709e;

    public boolean f13710f;
    public int h;

    public final Drawable[] f13711n;

    public final float[] f13712r;

    public boolean f13713s;
    public final Paint v;

    public final Path f13714w;

    public final nc f13715x;

    public n8(Context context) {
        super(context);
        this.f13708c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.f13709e = new org.telegram.ui.Components.y5(this, 0L, 260L, er.h);
        this.f13711n = new Drawable[2];
        this.f13712r = new float[2];
        Paint paint = new Paint(1);
        this.v = paint;
        this.f13714w = new Path();
        this.f13715x = new nc(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, r6 r6Var, boolean z11) {
        lh.o9 o9Var;
        this.f13713s = z10;
        this.f13710f = true;
        if (r6Var == null || (o9Var = r6Var.f13907c.E0) == null) {
            this.f13710f = false;
        } else {
            int i10 = o9Var.f16489a;
            org.telegram.ui.Components.y5 y5Var = this.f13709e;
            if (i10 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                y5Var.f(z11, !z11);
            } else if (i10 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                y5Var.f(z11, !z11);
            } else if (i10 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                y5Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                y5Var.f(z11, !z11);
            } else {
                this.f13710f = false;
            }
        }
        setVisibility(this.f13710f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f13713s = z10;
        this.f13710f = true;
        if (storyItem == null) {
            this.f13710f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.y5 y5Var = this.f13709e;
            if (z12) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                y5Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                y5Var.f(z11, true);
            } else if (storyItem.selected_contacts || (z10 && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                y5Var.f(z11, true);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                y5Var.f(z11, true);
            } else {
                this.f13710f = false;
            }
        }
        setVisibility(this.f13710f ? 0 : 8);
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
        Drawable[] drawableArr = this.f13711n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f13712r;
        fArr[1] = fArr[0];
        if (drawable == null || i10 != this.h) {
            Resources resources = getContext().getResources();
            this.h = i10;
            drawableArr[0] = resources.getDrawable(i10).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = AndroidUtilities.dpf2(f10);
            invalidate();
        }
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f13706a == i10 && this.f13707b == i11) {
            return;
        }
        float fDp = AndroidUtilities.dp(23.0f);
        this.f13706a = i10;
        this.f13707b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, fDp, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f13708c;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.f13713s ? 0 : AndroidUtilities.dp(14.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        char c10;
        float f10;
        float f11;
        float fCenterX;
        float fCenterX2;
        if (this.f13710f) {
            float fDpf2 = this.f13713s ? 0.0f : AndroidUtilities.dpf2(7.0f);
            float fDpf3 = this.f13713s ? AndroidUtilities.dpf2(43.0f) : AndroidUtilities.dpf2(23.66f);
            float fDpf4 = AndroidUtilities.dpf2(23.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(com.google.android.recaptcha.internal.a.A(getWidth(), fDpf3, 2.0f, fDpf2), (getHeight() - fDpf4) / 2.0f, i0.a.c(getWidth(), fDpf3, 2.0f, fDpf2), (getHeight() + fDpf4) / 2.0f);
            float fA = this.f13715x.a(0.075f);
            canvas.save();
            canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
            float fD = this.f13709e.d(0.0f, false);
            Paint[] paintArr = this.d;
            if (fD > 0.0f) {
                paintArr[1].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
            }
            if (fD < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - fD) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
            }
            float fAbs = Math.abs(fD - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.f13711n;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.f13712r;
            if (drawable == null || fD <= 0.5f) {
                c10 = 0;
                f10 = 12.0f;
                f11 = 0.5f;
            } else {
                if (this.f13713s) {
                    fCenterX2 = AndroidUtilities.dpf2(14.66f) + rectF.left;
                } else {
                    fCenterX2 = rectF.centerX();
                }
                Drawable drawable2 = drawableArr[1];
                int iC = (int) rl.c(fArr[1], 2.0f, fAbs, fCenterX2);
                float fCenterY = rectF.centerY();
                float f12 = (fArr[1] / 2.0f) * fAbs;
                f11 = 0.5f;
                c10 = 0;
                f10 = 12.0f;
                drawable2.setBounds(iC, (int) (fCenterY - f12), (int) (f12 + fCenterX2), (int) s3.c.c(fArr[1], 2.0f, fAbs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c10] != null && fD <= f11) {
                if (this.f13713s) {
                    fCenterX = AndroidUtilities.dpf2(14.66f) + rectF.left;
                } else {
                    fCenterX = rectF.centerX();
                }
                Drawable drawable3 = drawableArr[c10];
                int iC2 = (int) rl.c(fArr[c10], 2.0f, fAbs, fCenterX);
                float fCenterY2 = rectF.centerY();
                float f13 = (fArr[c10] / 2.0f) * fAbs;
                drawable3.setBounds(iC2, (int) (fCenterY2 - f13), (int) (f13 + fCenterX), (int) s3.c.c(fArr[c10], 2.0f, fAbs, rectF.centerY()));
                drawableArr[c10].draw(canvas);
            }
            if (this.f13713s) {
                Path path = this.f13714w;
                path.rewind();
                path.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                path.lineTo(rectF.right - AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                float fDpf5 = AndroidUtilities.dpf2(1.33f);
                Paint paint = this.v;
                paint.setStrokeWidth(fDpf5);
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f13715x.c(z10);
    }
}
