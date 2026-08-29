package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jr;
import org.telegram.ui.ry;
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path A;
    public Bitmap B;
    public boolean C;
    public k8 f15933a;
    public k8 f15934b;
    public nh.t3 f15935c;
    public final FrameLayout d;
    public final Matrix f15936e;
    public final float[] f15937f;
    public final View h;
    public final org.telegram.ui.ActionBar.c6 f15938n;
    public ArrayList f15939r;
    public final Rect f15940s;
    public final RectF v;
    public final Paint f15941w;
    public final org.telegram.ui.Components.d6 f15942x;
    public final org.telegram.ui.Components.d6 f15943y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f15933a = null;
        this.f15934b = null;
        this.f15935c = null;
        this.f15936e = new Matrix();
        this.f15937f = new float[2];
        this.f15940s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f15941w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.A = new Path();
        this.C = false;
        this.h = view;
        this.f15938n = c6Var;
        this.f15942x = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.f15943y = new org.telegram.ui.Components.d6(view, 0L, 360L, jr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(nh.o7 o7Var) {
        if (o7Var != null && o7Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < o7Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) o7Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) o7Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ry ryVar) {
        FrameLayout frameLayout;
        p8 p8Var;
        ArrayList arrayList2 = this.f15939r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f15939r.size())) {
            nh.t3 t3Var = this.f15935c;
            if (t3Var != null) {
                t3Var.e(true);
                this.f15935c = null;
            }
            int i10 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i10--;
                }
                i10++;
            }
            this.f15934b = null;
            this.f15943y.d(0.0f, true);
            invalidate();
            b(false);
            this.f15939r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.C = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        p8 p8Var2 = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, ryVar);
                        if (storyItem != null) {
                            p8Var2.c(storyItem.views, false);
                        }
                        i7.h6.a(p8Var2);
                        p8Var = p8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f17552c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        bg.n1 n1Var = new bg.n1(getContext(), AndroidUtilities.density);
                        n1Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        n1Var.setIsVideo(true);
                        n1Var.d(UserConfig.selectedAccount, tLObject.f17552c);
                        n1Var.setText(tLObject.a());
                        n1Var.e(3, tL_mediaAreaWeather.color);
                        p8Var = new l8(getContext(), n1Var, mediaArea);
                    } else {
                        p8Var = new k8(getContext(), this.h, mediaArea);
                    }
                    p8Var.setOnClickListener(this);
                    addView(p8Var);
                    double d = mediaArea.coordinates.f22625w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, ry ryVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, ryVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f9;
        float f10;
        float f11;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.f15934b;
            if (k8Var != null && k8Var.f15863s && !k8Var.f15864w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.f15942x.e(z10);
            k8 k8Var2 = this.f15934b;
            if (k8Var2 != null && k8Var2.f15864w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e11 = this.f15943y.e(z11);
            RectF rectF2 = this.v;
            if (e10 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f9 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e10, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((k8) childAt).f15856a;
                        k8 k8Var3 = this.f15934b;
                        if (childAt == k8Var3 && k8Var3.f15863s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e12 = d6Var.e(z12);
                        if (e12 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e12 * 255.0f);
                            Paint paint = this.f15941w;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f9 = 0.0f;
                f10 = 0.2f;
            }
            if ((z11 || e11 > f9) && this.f15933a != null) {
                if (this.B == null) {
                    this.B = ((e3) this).E.getPlayingBitmap();
                }
                if (this.B != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e11, 805306368));
                    canvas2.save();
                    Path path = this.A;
                    path.rewind();
                    rectF.set(this.f15933a.getX(), this.f15933a.getY(), this.f15933a.getX() + this.f15933a.getMeasuredWidth(), this.f15933a.getY() + this.f15933a.getMeasuredHeight());
                    k8 k8Var4 = this.f15933a;
                    if (k8Var4.f15865x) {
                        f11 = k8Var4.f15862r.a(0.05f);
                    } else {
                        f11 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f11 * 1.05f, e11);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f15933a.getRotation(), rectF.centerX(), rectF.centerY());
                    k8 k8Var5 = this.f15933a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = k8Var5.f15857b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * k8Var5.getMeasuredWidth());
                    } else {
                        measuredHeight = k8Var5.getMeasuredHeight() * f10;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f9, f9, getWidth(), getHeight());
                    int width = this.B.getWidth();
                    int height = this.B.getHeight();
                    Rect rect = this.f15940s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f15933a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.B, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f15933a.getX(), this.f15933a.getY());
                    canvas2.rotate(this.f15933a.getRotation(), this.f15933a.getPivotX(), this.f15933a.getPivotY());
                    canvas2.scale(this.f15933a.getScaleX() * lerp, this.f15933a.getScaleY() * lerp, this.f15933a.getPivotX(), this.f15933a.getPivotY());
                    this.f15933a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.B;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.B = null;
                }
            }
            invalidate();
        } else if (view instanceof k8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((k8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.C) {
            this.C = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    m5 m5Var = k8Var.D;
                    if (k8Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(m5Var);
                        AndroidUtilities.runOnUIThread(m5Var, 400L);
                    }
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: lh.m8.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.f15857b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.f22626x / 100.0d) * getMeasuredWidth()));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.f22627y / 100.0d) * getMeasuredHeight()));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.f15914a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.f22626x / 100.0d) * getMeasuredWidth()));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.f22627y / 100.0d) * getMeasuredHeight()));
                l8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) getChildAt(i12);
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f15857b.coordinates.f22625w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f15857b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i12);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f15914a.coordinates.f22625w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f15914a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        nh.t3 t3Var;
        if (getChildCount() == 0 || (t3Var = this.f15935c) == null || !t3Var.R) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            nh.t3 t3Var2 = this.f15935c;
            if (t3Var2 != null) {
                t3Var2.e(true);
                this.f15935c = null;
            }
            this.f15934b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
