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
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.jx;
public abstract class m8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.u5 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public k8 f12035a;
    public k8 f12036b;
    public hi.l3 f12037c;
    public final FrameLayout d;
    public final Matrix f12038e;
    public final float[] f12039f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 f12040n;
    public ArrayList f12041r;
    public final Rect f12042s;
    public final RectF f12043w;
    public final Paint f12044x;
    public final org.telegram.ui.Components.u5 f12045y;

    public m8(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12035a = null;
        this.f12036b = null;
        this.f12037c = null;
        this.f12038e = new Matrix();
        this.f12039f = new float[2];
        this.f12042s = new Rect();
        this.f12043w = new RectF();
        Paint paint = new Paint(1);
        this.f12044x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = view;
        this.f12040n = e6Var;
        this.f12045y = new org.telegram.ui.Components.u5(view, 0L, 120L, new LinearInterpolator());
        this.E = new org.telegram.ui.Components.u5(view, 0L, 360L, er.h);
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
                if (((e20) d7Var.T0.get(i7)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((e20) d7Var.T0.get(i7)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, jx jxVar) {
        FrameLayout frameLayout;
        p8 p8Var;
        ArrayList arrayList2 = this.f12041r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f12041r.size())) {
            hi.l3 l3Var = this.f12037c;
            if (l3Var != null) {
                l3Var.f(true);
                this.f12037c = null;
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
            this.f12036b = null;
            this.E.e(true, 0.0f);
            invalidate();
            b(false);
            this.f12041r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.H = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        p8 p8Var2 = new p8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, jxVar);
                        if (storyItem != null) {
                            p8Var2.c(storyItem.views, false);
                        }
                        na.a(p8Var2);
                        p8Var = p8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f14885c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        tg.m0 m0Var = new tg.m0(getContext(), org.telegram.messenger.g0.f23608p);
                        m0Var.setMaxWidth(org.telegram.messenger.g0.f23609q.x);
                        m0Var.setIsVideo(true);
                        m0Var.d(m10.f24934t0, tLObject.f14885c);
                        m0Var.setText(tLObject.a());
                        m0Var.e(3, tL_mediaAreaWeather.color);
                        p8Var = new l8(getContext(), m0Var, mediaArea);
                    } else {
                        p8Var = new k8(getContext(), this.h, mediaArea);
                    }
                    p8Var.setOnClickListener(this);
                    addView(p8Var);
                    double d = mediaArea.coordinates.f28286w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, jx jxVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, jxVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f10;
        k8 k8Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            k8 k8Var2 = this.f12036b;
            if (k8Var2 != null && k8Var2.f11970s && !k8Var2.f11972x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f12045y.d(z10);
            k8 k8Var3 = this.f12036b;
            if (k8Var3 != null && k8Var3.f11972x) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d2 = this.E.d(z11);
            int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f12043w;
            if (i7 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.u5 u5Var = ((k8) childAt).f11963a;
                        k8 k8Var4 = this.f12036b;
                        if (childAt == k8Var4 && k8Var4.f11970s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float d10 = u5Var.d(z12);
                        if (d10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d10 * 255.0f);
                            Paint paint = this.f12044x;
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
            if ((z11 || d2 > 0.0f) && this.f12035a != null) {
                if (this.G == null) {
                    this.G = ((a3) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.f12035a.getX(), this.f12035a.getY(), this.f12035a.getX() + this.f12035a.getMeasuredWidth(), this.f12035a.getY() + this.f12035a.getMeasuredHeight());
                    k8 k8Var5 = this.f12035a;
                    if (k8Var5.f11973y) {
                        f10 = k8Var5.f11969r.a(0.05f);
                    } else {
                        f10 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(1.0f, f10 * 1.05f, d2);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f12035a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f12035a.f11964b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * k8Var.getMeasuredWidth());
                    } else {
                        measuredHeight = k8Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.f12042s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f12035a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f12035a.getX(), this.f12035a.getY());
                    canvas2.rotate(this.f12035a.getRotation(), this.f12035a.getPivotX(), this.f12035a.getPivotY());
                    canvas2.scale(this.f12035a.getScaleX() * T1, this.f12035a.getScaleY() * T1, this.f12035a.getPivotX(), this.f12035a.getPivotY());
                    this.f12035a.b(canvas2);
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
        } else if (view instanceof k8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((k8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.H) {
            this.H = true;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    c1 c1Var = k8Var.I;
                    if (k8Var.f11971w) {
                        org.telegram.messenger.g0.r(c1Var);
                        org.telegram.messenger.g0.i3(c1Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: fi.m8.onClick(android.view.View):void");
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
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                TL_stories.MediaArea mediaArea = k8Var.f11964b;
                int measuredWidth = k8Var.getMeasuredWidth();
                int measuredHeight = k8Var.getMeasuredHeight();
                k8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                k8Var.setTranslationX((float) ((mediaArea.coordinates.f28287x / 100.0d) * getMeasuredWidth()));
                k8Var.setTranslationY((float) ((mediaArea.coordinates.f28288y / 100.0d) * getMeasuredHeight()));
                k8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) childAt;
                TL_stories.MediaArea mediaArea2 = l8Var.f12019a;
                int measuredWidth2 = l8Var.getMeasuredWidth();
                int measuredHeight2 = l8Var.getMeasuredHeight();
                l8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                l8Var.setTranslationX((float) ((mediaArea2.coordinates.f28287x / 100.0d) * getMeasuredWidth()));
                l8Var.setTranslationY((float) ((mediaArea2.coordinates.f28288y / 100.0d) * getMeasuredHeight()));
                l8Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof k8) {
                k8 k8Var = (k8) getChildAt(i11);
                k8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f11964b.coordinates.f28286w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((k8Var.f11964b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof l8) {
                l8 l8Var = (l8) getChildAt(i11);
                l8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f12019a.coordinates.f28286w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((l8Var.f12019a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        hi.l3 l3Var;
        if (getChildCount() == 0 || (l3Var = this.f12037c) == null || !l3Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            hi.l3 l3Var2 = this.f12037c;
            if (l3Var2 != null) {
                l3Var2.f(true);
                this.f12037c = null;
            }
            this.f12036b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
