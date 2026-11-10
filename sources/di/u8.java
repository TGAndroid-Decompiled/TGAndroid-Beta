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
import org.telegram.ui.Components.wq;
import org.telegram.ui.lx;
public abstract class u8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.v5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public s8 f9841a;
    public s8 f9842b;
    public fi.m3 f9843c;
    public final FrameLayout d;
    public final Matrix f9844e;
    public final float[] f9845f;
    public final View h;
    public final org.telegram.ui.ActionBar.h6 f9846n;
    public ArrayList f9847r;
    public final Rect f9848s;
    public final RectF f9849w;
    public final Paint f9850x;
    public final org.telegram.ui.Components.v5 f9851y;

    public u8(Context context, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f9841a = null;
        this.f9842b = null;
        this.f9843c = null;
        this.f9844e = new Matrix();
        this.f9845f = new float[2];
        this.f9848s = new Rect();
        this.f9849w = new RectF();
        Paint paint = new Paint(1);
        this.f9850x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f9846n = h6Var;
        this.f9851y = new org.telegram.ui.Components.v5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.v5(view, 0L, 360L, wq.h);
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

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, lx lxVar) {
        FrameLayout frameLayout;
        x8 x8Var;
        ArrayList arrayList2 = this.f9847r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f9847r.size())) {
            fi.m3 m3Var = this.f9843c;
            if (m3Var != null) {
                m3Var.f(true);
                this.f9843c = null;
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
            this.f9842b = null;
            this.D.e(true, 0.0f);
            invalidate();
            b(false);
            this.f9847r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        x8 x8Var2 = new x8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, lxVar);
                        if (storyItem != null) {
                            x8Var2.c(storyItem.views, false);
                        }
                        ka.a(x8Var2);
                        x8Var = x8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f12823c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.f22566p);
                        m0Var.setMaxWidth(org.telegram.messenger.g0.f22567q.x);
                        m0Var.setIsVideo(true);
                        m0Var.d(p10.f24474s0, tLObject.f12823c);
                        m0Var.setText(tLObject.a());
                        m0Var.e(3, tL_mediaAreaWeather.color);
                        x8Var = new t8(getContext(), m0Var, mediaArea);
                    } else {
                        x8Var = new s8(getContext(), this.h, mediaArea);
                    }
                    x8Var.setOnClickListener(this);
                    addView(x8Var);
                    double d = mediaArea.coordinates.f27195w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, lx lxVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, lxVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f10;
        s8 s8Var;
        float measuredHeight;
        boolean z11;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            s8 s8Var2 = this.f9842b;
            if (s8Var2 != null && s8Var2.f9765s && !s8Var2.f9767x) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d = this.f9851y.d(z9);
            s8 s8Var3 = this.f9842b;
            if (s8Var3 != null && s8Var3.f9767x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = this.D.d(z10);
            int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f9849w;
            if (i7 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.v5 v5Var = ((s8) childAt).f9758a;
                        s8 s8Var4 = this.f9842b;
                        if (childAt == s8Var4 && s8Var4.f9765s) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float d10 = v5Var.d(z11);
                        if (d10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d10 * 255.0f);
                            Paint paint = this.f9850x;
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
            if ((z10 || d2 > 0.0f) && this.f9841a != null) {
                if (this.F == null) {
                    this.F = ((f3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f9841a.getX(), this.f9841a.getY(), this.f9841a.getX() + this.f9841a.getMeasuredWidth(), this.f9841a.getY() + this.f9841a.getMeasuredHeight());
                    s8 s8Var5 = this.f9841a;
                    if (s8Var5.f9768y) {
                        f10 = s8Var5.f9764r.a(0.05f);
                    } else {
                        f10 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(1.0f, f10 * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f9841a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f9841a.f9759b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * s8Var.getMeasuredWidth());
                    } else {
                        measuredHeight = s8Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f9848s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f9841a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f9841a.getX(), this.f9841a.getY());
                    canvas2.rotate(this.f9841a.getRotation(), this.f9841a.getPivotX(), this.f9841a.getPivotY());
                    canvas2.scale(this.f9841a.getScaleX() * T1, this.f9841a.getScaleY() * T1, this.f9841a.getPivotX(), this.f9841a.getPivotY());
                    this.f9841a.b(canvas2);
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
        } else if (view instanceof s8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((s8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof s8) {
                    s8 s8Var = (s8) childAt;
                    f8 f8Var = s8Var.H;
                    if (s8Var.f9766w) {
                        org.telegram.messenger.g0.r(f8Var);
                        org.telegram.messenger.g0.i3(f8Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: di.u8.onClick(android.view.View):void");
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
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) childAt;
                TL_stories.MediaArea mediaArea = s8Var.f9759b;
                int measuredWidth = s8Var.getMeasuredWidth();
                int measuredHeight = s8Var.getMeasuredHeight();
                s8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                s8Var.setTranslationX((float) ((mediaArea.coordinates.f27196x / 100.0d) * getMeasuredWidth()));
                s8Var.setTranslationY((float) ((mediaArea.coordinates.f27197y / 100.0d) * getMeasuredHeight()));
                s8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof t8) {
                t8 t8Var = (t8) childAt;
                TL_stories.MediaArea mediaArea2 = t8Var.f9803a;
                int measuredWidth2 = t8Var.getMeasuredWidth();
                int measuredHeight2 = t8Var.getMeasuredHeight();
                t8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                t8Var.setTranslationX((float) ((mediaArea2.coordinates.f27196x / 100.0d) * getMeasuredWidth()));
                t8Var.setTranslationY((float) ((mediaArea2.coordinates.f27197y / 100.0d) * getMeasuredHeight()));
                t8Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) getChildAt(i11);
                s8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f9759b.coordinates.f27195w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f9759b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof t8) {
                t8 t8Var = (t8) getChildAt(i11);
                t8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8Var.f9803a.coordinates.f27195w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8Var.f9803a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fi.m3 m3Var;
        if (getChildCount() == 0 || (m3Var = this.f9843c) == null || !m3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            fi.m3 m3Var2 = this.f9843c;
            if (m3Var2 != null) {
                m3Var2.f(true);
                this.f9843c = null;
            }
            this.f9842b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
