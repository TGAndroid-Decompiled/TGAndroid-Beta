package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.kz;
public abstract class wa extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public ua f3926a;
    public ua f3927b;
    public di.d4 f3928c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f3929f;
    public final View h;
    public final org.telegram.ui.ActionBar.c6 f3930n;
    public ArrayList f3931r;
    public final Rect f3932s;
    public final RectF v;
    public final Paint f3933w;
    public final org.telegram.ui.Components.g6 f3934x;
    public final org.telegram.ui.Components.g6 f3935y;

    public wa(Context context, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f3926a = null;
        this.f3927b = null;
        this.f3928c = null;
        this.e = new Matrix();
        this.f3929f = new float[2];
        this.f3932s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f3933w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f3930n = c6Var;
        this.f3934x = new org.telegram.ui.Components.g6(view, 0L, 120L, new LinearInterpolator());
        this.f3935y = new org.telegram.ui.Components.g6(view, 0L, 360L, es.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(di.k8 k8Var) {
        if (k8Var != null && k8Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < k8Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) k8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) k8Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, kz kzVar) {
        FrameLayout frameLayout;
        za zaVar;
        ArrayList arrayList2 = this.f3931r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f3931r.size())) {
            di.d4 d4Var = this.f3928c;
            if (d4Var != null) {
                d4Var.e(true);
                this.f3928c = null;
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
            this.f3927b = null;
            this.f3935y.d(0.0f, true);
            invalidate();
            b(false);
            this.f3931r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        za zaVar2 = new za(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, kzVar);
                        if (storyItem != null) {
                            zaVar2.c(storyItem.views, false);
                        }
                        w7.c6.a(zaVar2);
                        zaVar = zaVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f7091c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        rg.u0 u0Var = new rg.u0(getContext(), AndroidUtilities.density);
                        u0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        u0Var.setIsVideo(true);
                        u0Var.d(UserConfig.selectedAccount, tLObject.f7091c);
                        u0Var.setText(tLObject.a());
                        u0Var.e(3, tL_mediaAreaWeather.color);
                        zaVar = new va(getContext(), u0Var, mediaArea);
                    } else {
                        zaVar = new ua(getContext(), this.h, mediaArea);
                    }
                    zaVar.setOnClickListener(this);
                    addView(zaVar);
                    double d = mediaArea.coordinates.f19447w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, kz kzVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, kzVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        ua uaVar;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            ua uaVar2 = this.f3927b;
            if (uaVar2 != null && uaVar2.f3804s && !uaVar2.f3805w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f3934x.e(z10);
            ua uaVar3 = this.f3927b;
            if (uaVar3 != null && uaVar3.f3805w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e7 = this.f3935y.e(z11);
            int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
            RectF rectF2 = this.v;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.g6 g6Var = ((ua) childAt).f3798a;
                        ua uaVar4 = this.f3927b;
                        if (childAt == uaVar4 && uaVar4.f3804s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e10 = g6Var.e(z12);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (e10 * 255.0f);
                            Paint paint = this.f3933w;
                            paint.setAlpha(i12);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z11 || e7 > 0.0f) && this.f3926a != null) {
                if (this.F == null) {
                    this.F = ((k4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f3926a.getX(), this.f3926a.getY(), this.f3926a.getX() + this.f3926a.getMeasuredWidth(), this.f3926a.getY() + this.f3926a.getMeasuredHeight());
                    ua uaVar5 = this.f3926a;
                    if (uaVar5.f3806x) {
                        f7 = uaVar5.f3803r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f7 * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f3926a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f3926a.f3799b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * uaVar.getMeasuredWidth());
                    } else {
                        measuredHeight = uaVar.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f3932s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f3926a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f3926a.getX(), this.f3926a.getY());
                    canvas2.rotate(this.f3926a.getRotation(), this.f3926a.getPivotX(), this.f3926a.getPivotY());
                    canvas2.scale(this.f3926a.getScaleX() * lerp, this.f3926a.getScaleY() * lerp, this.f3926a.getPivotX(), this.f3926a.getPivotY());
                    this.f3926a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof ua) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((ua) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof ua) {
                    ua uaVar = (ua) childAt;
                    la laVar = uaVar.H;
                    if (uaVar.v) {
                        AndroidUtilities.cancelRunOnUIThread(laVar);
                        AndroidUtilities.runOnUIThread(laVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: bi.wa.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof ua) {
                ua uaVar = (ua) childAt;
                TL_stories.MediaArea mediaArea = uaVar.f3799b;
                int measuredWidth = uaVar.getMeasuredWidth();
                int measuredHeight = uaVar.getMeasuredHeight();
                uaVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                uaVar.setTranslationX((float) ((mediaArea.coordinates.f19448x / 100.0d) * getMeasuredWidth()));
                uaVar.setTranslationY((float) ((mediaArea.coordinates.f19449y / 100.0d) * getMeasuredHeight()));
                uaVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof va) {
                va vaVar = (va) childAt;
                TL_stories.MediaArea mediaArea2 = vaVar.f3881a;
                int measuredWidth2 = vaVar.getMeasuredWidth();
                int measuredHeight2 = vaVar.getMeasuredHeight();
                vaVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                vaVar.setTranslationX((float) ((mediaArea2.coordinates.f19448x / 100.0d) * getMeasuredWidth()));
                vaVar.setTranslationY((float) ((mediaArea2.coordinates.f19449y / 100.0d) * getMeasuredHeight()));
                vaVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof ua) {
                ua uaVar = (ua) getChildAt(i12);
                uaVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((uaVar.f3799b.coordinates.f19447w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((uaVar.f3799b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof va) {
                va vaVar = (va) getChildAt(i12);
                vaVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((vaVar.f3881a.coordinates.f19447w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((vaVar.f3881a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        di.d4 d4Var;
        if (getChildCount() == 0 || (d4Var = this.f3928c) == null || !d4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            di.d4 d4Var2 = this.f3928c;
            if (d4Var2 != null) {
                d4Var2.e(true);
                this.f3928c = null;
            }
            this.f3927b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
