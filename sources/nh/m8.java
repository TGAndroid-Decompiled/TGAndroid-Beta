package nh;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.bz;
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final Path B;
    public Bitmap C;
    public boolean D;
    public k8 f15638a;
    public k8 f15639b;
    public ph.f3 f15640c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f15641f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 f15642n;
    public ArrayList f15643r;
    public final Rect f15644s;
    public final RectF v;
    public final Paint f15645w;
    public final org.telegram.ui.Components.z5 f15646x;
    public final org.telegram.ui.Components.z5 f15647y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f15638a = null;
        this.f15639b = null;
        this.f15640c = null;
        this.e = new Matrix();
        this.f15641f = new float[2];
        this.f15644s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f15645w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.B = new Path();
        this.D = false;
        this.h = view;
        this.f15642n = f6Var;
        this.f15646x = new org.telegram.ui.Components.z5(view, 0L, 120L, new LinearInterpolator());
        this.f15647y = new org.telegram.ui.Components.z5(view, 0L, 360L, nr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ph.u6 u6Var) {
        if (u6Var != null && u6Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < u6Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) u6Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) u6Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z4);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, bz bzVar) {
        FrameLayout frameLayout;
        p8 p8Var;
        ArrayList arrayList2 = this.f15643r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f15643r.size())) {
            ph.f3 f3Var = this.f15640c;
            if (f3Var != null) {
                f3Var.e(true);
                this.f15640c = null;
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
            this.f15639b = null;
            this.f15647y.d(0.0f, true);
            invalidate();
            b(false);
            this.f15643r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.D = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        p8 p8Var2 = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, bzVar);
                        if (storyItem != null) {
                            p8Var2.c(storyItem.views, false);
                        }
                        k7.d6.a(p8Var2);
                        p8Var = p8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f42675c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        dg.l1 l1Var = new dg.l1(getContext(), AndroidUtilities.density);
                        l1Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        l1Var.setIsVideo(true);
                        l1Var.d(UserConfig.selectedAccount, tLObject.f42675c);
                        l1Var.setText(tLObject.a());
                        l1Var.e(3, tL_mediaAreaWeather.color);
                        p8Var = new l8(getContext(), l1Var, mediaArea);
                    } else {
                        p8Var = new k8(getContext(), this.h, mediaArea);
                    }
                    p8Var.setOnClickListener(this);
                    addView(p8Var);
                    double d = mediaArea.coordinates.f19415w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, bz bzVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, bzVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float measuredHeight;
        boolean z11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var = this.f15639b;
            if (k8Var != null && k8Var.f15554s && !k8Var.f15555w) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e = this.f15646x.e(z4);
            k8 k8Var2 = this.f15639b;
            if (k8Var2 != null && k8Var2.f15555w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e6 = this.f15647y.e(z10);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.z5 z5Var = ((k8) childAt).f15548a;
                        k8 k8Var3 = this.f15639b;
                        if (childAt == k8Var3 && k8Var3.f15554s) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float e10 = z5Var.e(z11);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
                            Paint paint = this.f15645w;
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
                f10 = 0.0f;
                f11 = 0.2f;
            }
            if ((z10 || e6 > f10) && this.f15638a != null) {
                if (this.C == null) {
                    this.C = ((f3) this).F.getPlayingBitmap();
                }
                if (this.C != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e6, 805306368));
                    canvas2.save();
                    Path path = this.B;
                    path.rewind();
                    rectF.set(this.f15638a.getX(), this.f15638a.getY(), this.f15638a.getX() + this.f15638a.getMeasuredWidth(), this.f15638a.getY() + this.f15638a.getMeasuredHeight());
                    k8 k8Var4 = this.f15638a;
                    if (k8Var4.f15556x) {
                        f12 = k8Var4.f15553r.a(0.05f);
                    } else {
                        f12 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f12 * 1.05f, e6);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f15638a.getRotation(), rectF.centerX(), rectF.centerY());
                    k8 k8Var5 = this.f15638a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = k8Var5.f15549b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * k8Var5.getMeasuredWidth());
                    } else {
                        measuredHeight = k8Var5.getMeasuredHeight() * f11;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f10, f10, getWidth(), getHeight());
                    int width = this.C.getWidth();
                    int height = this.C.getHeight();
                    Rect rect = this.f15644s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f15638a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.C, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f15638a.getX(), this.f15638a.getY());
                    canvas2.rotate(this.f15638a.getRotation(), this.f15638a.getPivotX(), this.f15638a.getPivotY());
                    canvas2.scale(this.f15638a.getScaleX() * lerp, this.f15638a.getScaleY() * lerp, this.f15638a.getPivotX(), this.f15638a.getPivotY());
                    this.f15638a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.C;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C = null;
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
        if (!this.D) {
            this.D = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    n5 n5Var = k8Var.E;
                    if (k8Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(n5Var);
                        AndroidUtilities.runOnUIThread(n5Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: nh.m8.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            bitmap.recycle();
            this.C = null;
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.f15549b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.f19416x / 100.0d) * getMeasuredWidth()));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.f19417y / 100.0d) * getMeasuredHeight()));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.f15598a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.f19416x / 100.0d) * getMeasuredWidth()));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.f19417y / 100.0d) * getMeasuredHeight()));
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
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f15549b.coordinates.f19415w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f15549b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i12);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f15598a.coordinates.f19415w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f15598a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ph.f3 f3Var;
        if (getChildCount() == 0 || (f3Var = this.f15640c) == null || !f3Var.S) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ph.f3 f3Var2 = this.f15640c;
            if (f3Var2 != null) {
                f3Var2.e(true);
                this.f15640c = null;
            }
            this.f15639b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
