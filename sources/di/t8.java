package di;

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
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.h20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ix;
public abstract class t8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.w5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public r8 f9794a;
    public r8 f9795b;
    public fi.m3 f9796c;
    public final FrameLayout d;
    public final Matrix f9797e;
    public final float[] f9798f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 f9799n;
    public ArrayList f9800r;
    public final Rect f9801s;
    public final RectF f9802w;
    public final Paint f9803x;
    public final org.telegram.ui.Components.w5 f9804y;

    public t8(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9794a = null;
        this.f9795b = null;
        this.f9796c = null;
        this.f9797e = new Matrix();
        this.f9798f = new float[2];
        this.f9801s = new Rect();
        this.f9802w = new RectF();
        Paint paint = new Paint(1);
        this.f9803x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f9799n = f6Var;
        this.f9804y = new org.telegram.ui.Components.w5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.w5(view, 0L, 360L, xq.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(fi.e7 e7Var) {
        if (e7Var != null && e7Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < e7Var.T0.size(); i7++) {
                if (((h20) e7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((h20) e7Var.T0.get(i7)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z9);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ix ixVar) {
        FrameLayout frameLayout;
        w8 w8Var;
        ArrayList arrayList2 = this.f9800r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f9800r.size())) {
            fi.m3 m3Var = this.f9796c;
            if (m3Var != null) {
                m3Var.f(true);
                this.f9796c = null;
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
            this.f9795b = null;
            this.D.e(true, 0.0f);
            invalidate();
            b(false);
            this.f9800r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        w8 w8Var2 = new w8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, ixVar);
                        if (storyItem != null) {
                            w8Var2.c(storyItem.views, false);
                        }
                        ka.a(w8Var2);
                        w8Var = w8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f12823c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.f22543p);
                        m0Var.setMaxWidth(org.telegram.messenger.g0.f22544q.x);
                        m0Var.setIsVideo(true);
                        m0Var.d(p10.f24467s0, tLObject.f12823c);
                        m0Var.setText(tLObject.a());
                        m0Var.e(3, tL_mediaAreaWeather.color);
                        w8Var = new s8(getContext(), m0Var, mediaArea);
                    } else {
                        w8Var = new r8(getContext(), this.h, mediaArea);
                    }
                    w8Var.setOnClickListener(this);
                    addView(w8Var);
                    double d = mediaArea.coordinates.f27188w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, ix ixVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, ixVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f10;
        r8 r8Var;
        float measuredHeight;
        boolean z11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            r8 r8Var2 = this.f9795b;
            if (r8Var2 != null && r8Var2.f9729s && !r8Var2.f9731x) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d = this.f9804y.d(z9);
            r8 r8Var3 = this.f9795b;
            if (r8Var3 != null && r8Var3.f9731x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = this.D.d(z10);
            int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f9802w;
            if (i7 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.w5 w5Var = ((r8) childAt).f9722a;
                        r8 r8Var4 = this.f9795b;
                        if (childAt == r8Var4 && r8Var4.f9729s) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float d10 = w5Var.d(z11);
                        if (d10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d10 * 255.0f);
                            Paint paint = this.f9803x;
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
            if ((z10 || d2 > 0.0f) && this.f9794a != null) {
                if (this.F == null) {
                    this.F = ((f3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f9794a.getX(), this.f9794a.getY(), this.f9794a.getX() + this.f9794a.getMeasuredWidth(), this.f9794a.getY() + this.f9794a.getMeasuredHeight());
                    r8 r8Var5 = this.f9794a;
                    if (r8Var5.f9732y) {
                        f10 = r8Var5.f9728r.a(0.05f);
                    } else {
                        f10 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(1.0f, f10 * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f9794a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f9794a.f9723b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * r8Var.getMeasuredWidth());
                    } else {
                        measuredHeight = r8Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f9801s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f9794a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f9794a.getX(), this.f9794a.getY());
                    canvas2.rotate(this.f9794a.getRotation(), this.f9794a.getPivotX(), this.f9794a.getPivotY());
                    canvas2.scale(this.f9794a.getScaleX() * T1, this.f9794a.getScaleY() * T1, this.f9794a.getPivotX(), this.f9794a.getPivotY());
                    this.f9794a.b(canvas2);
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
        } else if (view instanceof r8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((r8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof r8) {
                    r8 r8Var = (r8) childAt;
                    s7 s7Var = r8Var.H;
                    if (r8Var.f9730w) {
                        org.telegram.messenger.g0.r(s7Var);
                        org.telegram.messenger.g0.i3(s7Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: di.t8.onClick(android.view.View):void");
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) childAt;
                TL_stories.MediaArea mediaArea = r8Var.f9723b;
                int measuredWidth = r8Var.getMeasuredWidth();
                int measuredHeight = r8Var.getMeasuredHeight();
                r8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                r8Var.setTranslationX((float) ((mediaArea.coordinates.f27189x / 100.0d) * getMeasuredWidth()));
                r8Var.setTranslationY((float) ((mediaArea.coordinates.f27190y / 100.0d) * getMeasuredHeight()));
                r8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) childAt;
                TL_stories.MediaArea mediaArea2 = s8Var.f9771a;
                int measuredWidth2 = s8Var.getMeasuredWidth();
                int measuredHeight2 = s8Var.getMeasuredHeight();
                s8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                s8Var.setTranslationX((float) ((mediaArea2.coordinates.f27189x / 100.0d) * getMeasuredWidth()));
                s8Var.setTranslationY((float) ((mediaArea2.coordinates.f27190y / 100.0d) * getMeasuredHeight()));
                s8Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) getChildAt(i11);
                r8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.f9723b.coordinates.f27188w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.f9723b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) getChildAt(i11);
                s8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f9771a.coordinates.f27188w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f9771a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fi.m3 m3Var;
        if (getChildCount() == 0 || (m3Var = this.f9796c) == null || !m3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            fi.m3 m3Var2 = this.f9796c;
            if (m3Var2 != null) {
                m3Var2.f(true);
                this.f9796c = null;
            }
            this.f9795b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
