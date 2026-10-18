package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.qy;
public abstract class e9 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public c9 f5363a;
    public c9 f5364b;
    public ei.x3 f5365c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f5366f;
    public final View h;
    public final org.telegram.ui.ActionBar.d6 f5367n;
    public ArrayList f5368r;
    public final Rect f5369s;
    public final RectF v;
    public final Paint f5370w;
    public final org.telegram.ui.Components.f6 f5371x;
    public final org.telegram.ui.Components.f6 f5372y;

    public e9(Context context, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5363a = null;
        this.f5364b = null;
        this.f5365c = null;
        this.e = new Matrix();
        this.f5366f = new float[2];
        this.f5369s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f5370w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f5367n = d6Var;
        this.f5371x = new org.telegram.ui.Components.f6(view, 0L, 120L, new LinearInterpolator());
        this.f5372y = new org.telegram.ui.Components.f6(view, 0L, 360L, bs.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ei.a8 a8Var) {
        if (a8Var != null && a8Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < a8Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) a8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) a8Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, qy qyVar) {
        FrameLayout frameLayout;
        h9 h9Var;
        ArrayList arrayList2 = this.f5368r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f5368r.size())) {
            ei.x3 x3Var = this.f5365c;
            if (x3Var != null) {
                x3Var.e(true);
                this.f5365c = null;
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
            this.f5364b = null;
            this.f5372y.d(0.0f, true);
            invalidate();
            b(false);
            this.f5368r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        h9 h9Var2 = new h9(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, qyVar);
                        if (storyItem != null) {
                            h9Var2.c(storyItem.views, false);
                        }
                        w7.b6.a(h9Var2);
                        h9Var = h9Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f9871c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        rg.s0 s0Var = new rg.s0(getContext(), AndroidUtilities.density);
                        s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        s0Var.setIsVideo(true);
                        s0Var.d(UserConfig.selectedAccount, tLObject.f9871c);
                        s0Var.setText(tLObject.a());
                        s0Var.e(3, tL_mediaAreaWeather.color);
                        h9Var = new d9(getContext(), s0Var, mediaArea);
                    } else {
                        h9Var = new c9(getContext(), this.h, mediaArea);
                    }
                    h9Var.setOnClickListener(this);
                    addView(h9Var);
                    double d = mediaArea.coordinates.f20509w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, qy qyVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, qyVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        c9 c9Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            c9 c9Var2 = this.f5364b;
            if (c9Var2 != null && c9Var2.f5301s && !c9Var2.f5302w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f5371x.e(z10);
            c9 c9Var3 = this.f5364b;
            if (c9Var3 != null && c9Var3.f5302w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e7 = this.f5372y.e(z11);
            int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
            RectF rectF2 = this.v;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(e, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.f6 f6Var = ((c9) childAt).f5295a;
                        c9 c9Var4 = this.f5364b;
                        if (childAt == c9Var4 && c9Var4.f5301s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e10 = f6Var.e(z12);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (e10 * 255.0f);
                            Paint paint = this.f5370w;
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
            if ((z11 || e7 > 0.0f) && this.f5363a != null) {
                if (this.F == null) {
                    this.F = ((n3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f5363a.getX(), this.f5363a.getY(), this.f5363a.getX() + this.f5363a.getMeasuredWidth(), this.f5363a.getY() + this.f5363a.getMeasuredHeight());
                    c9 c9Var5 = this.f5363a;
                    if (c9Var5.f5303x) {
                        f7 = c9Var5.f5300r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f7 * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f5363a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f5363a.f5296b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * c9Var.getMeasuredWidth());
                    } else {
                        measuredHeight = c9Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f5369s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f5363a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f5363a.getX(), this.f5363a.getY());
                    canvas2.rotate(this.f5363a.getRotation(), this.f5363a.getPivotX(), this.f5363a.getPivotY());
                    canvas2.scale(this.f5363a.getScaleX() * lerp, this.f5363a.getScaleY() * lerp, this.f5363a.getPivotX(), this.f5363a.getPivotY());
                    this.f5363a.b(canvas2);
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
        } else if (view instanceof c9) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((c9) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof c9) {
                    c9 c9Var = (c9) childAt;
                    androidx.fragment.app.d dVar = c9Var.H;
                    if (c9Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        AndroidUtilities.runOnUIThread(dVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.onClick(android.view.View):void");
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
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) childAt;
                TL_stories.MediaArea mediaArea = c9Var.f5296b;
                int measuredWidth = c9Var.getMeasuredWidth();
                int measuredHeight = c9Var.getMeasuredHeight();
                c9Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                c9Var.setTranslationX((float) ((mediaArea.coordinates.f20510x / 100.0d) * getMeasuredWidth()));
                c9Var.setTranslationY((float) ((mediaArea.coordinates.f20511y / 100.0d) * getMeasuredHeight()));
                c9Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof d9) {
                d9 d9Var = (d9) childAt;
                TL_stories.MediaArea mediaArea2 = d9Var.f5343a;
                int measuredWidth2 = d9Var.getMeasuredWidth();
                int measuredHeight2 = d9Var.getMeasuredHeight();
                d9Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                d9Var.setTranslationX((float) ((mediaArea2.coordinates.f20510x / 100.0d) * getMeasuredWidth()));
                d9Var.setTranslationY((float) ((mediaArea2.coordinates.f20511y / 100.0d) * getMeasuredHeight()));
                d9Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) getChildAt(i12);
                c9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.f5296b.coordinates.f20509w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.f5296b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof d9) {
                d9 d9Var = (d9) getChildAt(i12);
                d9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((d9Var.f5343a.coordinates.f20509w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((d9Var.f5343a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ei.x3 x3Var;
        if (getChildCount() == 0 || (x3Var = this.f5365c) == null || !x3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ei.x3 x3Var2 = this.f5365c;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f5365c = null;
            }
            this.f5364b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
