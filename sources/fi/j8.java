package fi;

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
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lr;
import org.telegram.ui.nx;
public abstract class j8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.c6 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public h8 f12159a;
    public h8 f12160b;
    public hi.m3 f12161c;
    public final FrameLayout d;
    public final Matrix f12162e;
    public final float[] f12163f;
    public final View h;
    public final org.telegram.ui.ActionBar.i6 f12164n;
    public ArrayList f12165r;
    public final Rect f12166s;
    public final RectF f12167w;
    public final Paint f12168x;
    public final org.telegram.ui.Components.c6 f12169y;

    public j8(Context context, View view, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f12159a = null;
        this.f12160b = null;
        this.f12161c = null;
        this.f12162e = new Matrix();
        this.f12163f = new float[2];
        this.f12166s = new Rect();
        this.f12167w = new RectF();
        Paint paint = new Paint(1);
        this.f12168x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = view;
        this.f12164n = i6Var;
        this.f12169y = new org.telegram.ui.Components.c6(view, 0L, 120L, new LinearInterpolator());
        this.E = new org.telegram.ui.Components.c6(view, 0L, 360L, lr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(hi.d7 d7Var) {
        if (d7Var != null && d7Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < d7Var.T0.size(); i7++) {
                if (((c20) d7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((c20) d7Var.T0.get(i7)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, nx nxVar) {
        FrameLayout frameLayout;
        m8 m8Var;
        ArrayList arrayList2 = this.f12165r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f12165r.size())) {
            hi.m3 m3Var = this.f12161c;
            if (m3Var != null) {
                m3Var.f(true);
                this.f12161c = null;
            }
            int i7 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i7);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i7--;
                }
                i7++;
            }
            this.f12160b = null;
            this.E.e(true, 0.0f);
            invalidate();
            b(false);
            this.f12165r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.H = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        m8 m8Var2 = new m8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, nxVar);
                        if (storyItem != null) {
                            m8Var2.c(storyItem.views, false);
                        }
                        ra.a(m8Var2);
                        m8Var = m8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f15297c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.f24117p);
                        m0Var.setMaxWidth(org.telegram.messenger.g0.f24118q.x);
                        m0Var.setIsVideo(true);
                        m0Var.d(j10.f24770t0, tLObject.f15297c);
                        m0Var.setText(tLObject.a());
                        m0Var.e(3, tL_mediaAreaWeather.color);
                        m8Var = new i8(getContext(), m0Var, mediaArea);
                    } else {
                        m8Var = new h8(getContext(), this.h, mediaArea);
                    }
                    m8Var.setOnClickListener(this);
                    addView(m8Var);
                    double d = mediaArea.coordinates.f28638w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, nx nxVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, nxVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f10;
        h8 h8Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            h8 h8Var2 = this.f12160b;
            if (h8Var2 != null && h8Var2.f12071s && !h8Var2.f12073x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f12169y.d(z10);
            h8 h8Var3 = this.f12160b;
            if (h8Var3 != null && h8Var3.f12073x) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d2 = this.E.d(z11);
            int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f12167w;
            if (i7 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.c6 c6Var = ((h8) childAt).f12064a;
                        h8 h8Var4 = this.f12160b;
                        if (childAt == h8Var4 && h8Var4.f12071s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float d10 = c6Var.d(z12);
                        if (d10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d10 * 255.0f);
                            Paint paint = this.f12168x;
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
            }
            if ((z11 || d2 > 0.0f) && this.f12159a != null) {
                if (this.G == null) {
                    this.G = ((y2) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.f12159a.getX(), this.f12159a.getY(), this.f12159a.getX() + this.f12159a.getMeasuredWidth(), this.f12159a.getY() + this.f12159a.getMeasuredHeight());
                    h8 h8Var5 = this.f12159a;
                    if (h8Var5.f12074y) {
                        f10 = h8Var5.f12070r.a(0.05f);
                    } else {
                        f10 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(1.0f, f10 * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f12159a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f12159a.f12065b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * h8Var.getMeasuredWidth());
                    } else {
                        measuredHeight = h8Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.f12166s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f12159a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f12159a.getX(), this.f12159a.getY());
                    canvas2.rotate(this.f12159a.getRotation(), this.f12159a.getPivotX(), this.f12159a.getPivotY());
                    canvas2.scale(this.f12159a.getScaleX() * T1, this.f12159a.getScaleY() * T1, this.f12159a.getPivotX(), this.f12159a.getPivotY());
                    this.f12159a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.G = null;
                }
            }
            invalidate();
        } else if (view instanceof h8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((h8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.H) {
            this.H = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    f2.a aVar = h8Var.I;
                    if (h8Var.f12072w) {
                        org.telegram.messenger.g0.r(aVar);
                        org.telegram.messenger.g0.h3(aVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: fi.j8.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
            } else if (childAt instanceof h8) {
                h8 h8Var = (h8) childAt;
                TL_stories.MediaArea mediaArea = h8Var.f12065b;
                int measuredWidth = h8Var.getMeasuredWidth();
                int measuredHeight = h8Var.getMeasuredHeight();
                h8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                h8Var.setTranslationX((float) ((mediaArea.coordinates.f28639x / 100.0d) * getMeasuredWidth()));
                h8Var.setTranslationY((float) ((mediaArea.coordinates.f28640y / 100.0d) * getMeasuredHeight()));
                h8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof i8) {
                i8 i8Var = (i8) childAt;
                TL_stories.MediaArea mediaArea2 = i8Var.f12130a;
                int measuredWidth2 = i8Var.getMeasuredWidth();
                int measuredHeight2 = i8Var.getMeasuredHeight();
                i8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                i8Var.setTranslationX((float) ((mediaArea2.coordinates.f28639x / 100.0d) * getMeasuredWidth()));
                i8Var.setTranslationY((float) ((mediaArea2.coordinates.f28640y / 100.0d) * getMeasuredHeight()));
                i8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof h8) {
                h8 h8Var = (h8) getChildAt(i11);
                h8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((h8Var.f12065b.coordinates.f28638w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((h8Var.f12065b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof i8) {
                i8 i8Var = (i8) getChildAt(i11);
                i8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((i8Var.f12130a.coordinates.f28638w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((i8Var.f12130a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        hi.m3 m3Var;
        if (getChildCount() == 0 || (m3Var = this.f12161c) == null || !m3Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            hi.m3 m3Var2 = this.f12161c;
            if (m3Var2 != null) {
                m3Var2.f(true);
                this.f12161c = null;
            }
            this.f12160b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
