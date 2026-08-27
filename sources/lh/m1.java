package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.us;

public final class m1 extends us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final boolean M = LiteMode.isEnabled(8200);
    public final o1 N;

    public m1(o1 o1Var) {
        this.N = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.k5 k5Var, n1 n1Var, float f10) {
        if (k5Var != null) {
            k5Var.setAlpha((int) (f10 * 255.0f));
            k5Var.draw(canvas);
        } else if (n1Var.f16416e != null) {
            canvas.save();
            canvas.clipRect(n1Var.f16416e.getImageX(), n1Var.f16416e.getImageY(), n1Var.f16416e.getImageX2(), n1Var.f16416e.getImageY2());
            n1Var.f16416e.setAlpha(f10);
            n1Var.f16416e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        if (this.K == null) {
            return;
        }
        f2.v0 v0Var = this.N.V;
        int i12 = 0;
        boolean z10 = true;
        boolean z11 = (v0Var != null && v0Var.k()) || this.K.size() <= 4 || !this.M;
        if (!z11) {
            while (true) {
                if (i12 >= this.K.size()) {
                    z10 = z11;
                    break;
                } else if (((n1) this.K.get(i12)).getScale() != 1.0f) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            z10 = z11;
            break;
        }
        if (!z10) {
            super.a(canvas, j10, i10, i11, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            n1 n1Var = (n1) arrayList.get(i10);
            n1Var.getClass();
            org.telegram.ui.Components.k5 k5Var = n1Var.f16415c;
            if (k5Var != null) {
                k5Var.setColorFilter(this.N.f16467d3);
            }
            n1Var.f16418n.draw(canvas, n1Var.h[this.G]);
            i10++;
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.k5 k5Var;
        if (this.K != null) {
            canvas.save();
            canvas.translate(-this.J, 0.0f);
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                n1 n1Var = (n1) this.K.get(i10);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f10;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.k5 k5Var2 = n1Var.f16415c;
                if (k5Var2 != null) {
                    k5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.f16416e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.N.f16467d3;
                if (porterDuffColorFilter != null && (k5Var = n1Var.f16415c) != null) {
                    k5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, k5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, k5Var2, n1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((n1) arrayList.get(i10)).h[this.G];
            if (backgroundThreadDrawHolder != null) {
                backgroundThreadDrawHolder.release();
            }
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i10;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            n1 n1Var = (n1) this.K.get(i11);
            n1Var.getClass();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = n1Var.h;
            org.telegram.ui.Components.k5 k5Var = n1Var.f16415c;
            ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : n1Var.f16416e;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(n1Var.getAlpha());
                org.telegram.ui.Components.k5 k5Var2 = n1Var.f16415c;
                if (k5Var2 != null) {
                    k5Var2.setColorFilter(this.N.f16467d3);
                }
                int i12 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i12], i12);
                backgroundThreadDrawHolderArr[i12] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                n1Var.f16418n = imageReceiver;
                if (imageReceiver.getLottieAnimation() != null) {
                    n1Var.f16418n.getLottieAnimation().S(j10);
                }
                if (n1Var.f16418n.getAnimation() != null) {
                    n1Var.f16418n.getAnimation().D(j10);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(n1Var.getPaddingLeft(), n1Var.getPaddingTop(), n1Var.getWidth() - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                oi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || (i10 = lottieAnimation.f31309c) == 0) {
                    org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
                    if (animation == null || animation.getIntrinsicHeight() == 0) {
                        Bitmap bitmap = imageReceiver.getBitmap();
                        if (bitmap != null) {
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                        } else {
                            Drawable staticThumb = imageReceiver.getStaticThumb();
                            intrinsicWidth = (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) ? 1.0f : staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                        }
                        if (intrinsicWidth < 1.0f) {
                            float fHeight = (rect.height() * intrinsicWidth) / 2.0f;
                            int iCenterX = (int) (rect.centerX() - fHeight);
                            int iCenterX2 = (int) (rect.centerX() + fHeight);
                            rect.left = iCenterX;
                            rect.right = iCenterX2;
                        } else if (intrinsicWidth > 1.0f) {
                            float fWidth = (rect.width() / intrinsicWidth) / 2.0f;
                            int iCenterY = (int) (rect.centerY() - fWidth);
                            int iCenterY2 = (int) (rect.centerY() + fWidth);
                            rect.top = iCenterY;
                            rect.bottom = iCenterY2;
                        }
                        rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.J, 0);
                        backgroundThreadDrawHolderArr[i12].setBounds(rect);
                        arrayList.add(n1Var);
                    } else {
                        width = animation.getIntrinsicWidth();
                        height = animation.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = lottieAnimation.f31307b;
                    f10 = i10;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth < 1.0f) {
                    float fHeight2 = (rect.height() * intrinsicWidth) / 2.0f;
                    int iCenterX3 = (int) (rect.centerX() - fHeight2);
                    int iCenterX4 = (int) (rect.centerX() + fHeight2);
                    rect.left = iCenterX3;
                    rect.right = iCenterX4;
                } else if (intrinsicWidth > 1.0f) {
                    float fWidth2 = (rect.width() / intrinsicWidth) / 2.0f;
                    int iCenterY3 = (int) (rect.centerY() - fWidth2);
                    int iCenterY4 = (int) (rect.centerY() + fWidth2);
                    rect.top = iCenterY3;
                    rect.bottom = iCenterY4;
                }
                rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.J, 0);
                backgroundThreadDrawHolderArr[i12].setBounds(rect);
                arrayList.add(n1Var);
            }
        }
    }
}
