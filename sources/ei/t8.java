package ei;

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
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fx;
public abstract class t8 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.u5 E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public r8 f11055a;
    public r8 f11056b;
    public gi.l3 f11057c;
    public final FrameLayout d;
    public final Matrix f11058e;
    public final float[] f11059f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 f11060n;
    public ArrayList f11061r;
    public final Rect f11062s;
    public final RectF f11063w;
    public final Paint f11064x;
    public final org.telegram.ui.Components.u5 f11065y;

    public t8(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f11055a = null;
        this.f11056b = null;
        this.f11057c = null;
        this.f11058e = new Matrix();
        this.f11059f = new float[2];
        this.f11062s = new Rect();
        this.f11063w = new RectF();
        Paint paint = new Paint(1);
        this.f11064x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = view;
        this.f11060n = e6Var;
        this.f11065y = new org.telegram.ui.Components.u5(view, 0L, 120L, new LinearInterpolator());
        this.E = new org.telegram.ui.Components.u5(view, 0L, 360L, xq.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(gi.f7 f7Var) {
        if (f7Var != null && f7Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < f7Var.T0.size(); i3++) {
                if (((z10) f7Var.T0.get(i3)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((z10) f7Var.T0.get(i3)).M);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, fx fxVar) {
        FrameLayout frameLayout;
        w8 w8Var;
        ArrayList arrayList2 = this.f11061r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f11061r.size())) {
            gi.l3 l3Var = this.f11057c;
            if (l3Var != null) {
                l3Var.f(true);
                this.f11057c = null;
            }
            int i3 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i3--;
                }
                i3++;
            }
            this.f11056b = null;
            this.E.e(true, 0.0f);
            invalidate();
            b(false);
            this.f11061r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.H = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        w8 w8Var2 = new w8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, fxVar);
                        if (storyItem != null) {
                            w8Var2.c(storyItem.views, false);
                        }
                        pf.a(w8Var2);
                        w8Var = w8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f13584c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        ug.l0 l0Var = new ug.l0(getContext(), org.telegram.messenger.g0.f22607p);
                        l0Var.setMaxWidth(org.telegram.messenger.g0.f22608q.x);
                        l0Var.setIsVideo(true);
                        l0Var.d(h10.f22829t0, tLObject.f13584c);
                        l0Var.setText(tLObject.a());
                        l0Var.e(3, tL_mediaAreaWeather.color);
                        w8Var = new s8(getContext(), l0Var, mediaArea);
                    } else {
                        w8Var = new r8(getContext(), this.h, mediaArea);
                    }
                    w8Var.setOnClickListener(this);
                    addView(w8Var);
                    double d = mediaArea.coordinates.f27236w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, fx fxVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, fxVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f10;
        r8 r8Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            r8 r8Var2 = this.f11056b;
            if (r8Var2 != null && r8Var2.f10902s && !r8Var2.f10904x) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f11065y.d(z10);
            r8 r8Var3 = this.f11056b;
            if (r8Var3 != null && r8Var3.f10904x) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d10 = this.E.d(z11);
            int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.f11063w;
            if (i3 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.u5 u5Var = ((r8) childAt).f10895a;
                        r8 r8Var4 = this.f11056b;
                        if (childAt == r8Var4 && r8Var4.f10902s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float d11 = u5Var.d(z12);
                        if (d11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d11 * 255.0f);
                            Paint paint = this.f11064x;
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
            if ((z11 || d10 > 0.0f) && this.f11055a != null) {
                if (this.G == null) {
                    this.G = ((i3) this).J.getPlayingBitmap();
                }
                if (this.G != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d10, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.f11055a.getX(), this.f11055a.getY(), this.f11055a.getX() + this.f11055a.getMeasuredWidth(), this.f11055a.getY() + this.f11055a.getMeasuredHeight());
                    r8 r8Var5 = this.f11055a;
                    if (r8Var5.f10905y) {
                        f10 = r8Var5.f10901r.a(0.05f);
                    } else {
                        f10 = 1.0f;
                    }
                    float T1 = org.telegram.messenger.g0.T1(1.0f, f10 * 1.05f, d10);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f11055a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f11055a.f10896b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * r8Var.getMeasuredWidth());
                    } else {
                        measuredHeight = r8Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.f11062s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f11055a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f11055a.getX(), this.f11055a.getY());
                    canvas2.rotate(this.f11055a.getRotation(), this.f11055a.getPivotX(), this.f11055a.getPivotY());
                    canvas2.scale(this.f11055a.getScaleX() * T1, this.f11055a.getScaleY() * T1, this.f11055a.getPivotX(), this.f11055a.getPivotY());
                    this.f11055a.b(canvas2);
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
        } else if (view instanceof r8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((r8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.H) {
            this.H = true;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof r8) {
                    r8 r8Var = (r8) childAt;
                    z5 z5Var = r8Var.I;
                    if (r8Var.f10903w) {
                        org.telegram.messenger.g0.r(z5Var);
                        org.telegram.messenger.g0.i3(z5Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: ei.t8.onClick(android.view.View):void");
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i3, i12 - i10);
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) childAt;
                TL_stories.MediaArea mediaArea = r8Var.f10896b;
                int measuredWidth = r8Var.getMeasuredWidth();
                int measuredHeight = r8Var.getMeasuredHeight();
                r8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                r8Var.setTranslationX((float) ((mediaArea.coordinates.f27237x / 100.0d) * getMeasuredWidth()));
                r8Var.setTranslationY((float) ((mediaArea.coordinates.f27238y / 100.0d) * getMeasuredHeight()));
                r8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) childAt;
                TL_stories.MediaArea mediaArea2 = s8Var.f11029a;
                int measuredWidth2 = s8Var.getMeasuredWidth();
                int measuredHeight2 = s8Var.getMeasuredHeight();
                s8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                s8Var.setTranslationX((float) ((mediaArea2.coordinates.f27237x / 100.0d) * getMeasuredWidth()));
                s8Var.setTranslationY((float) ((mediaArea2.coordinates.f27238y / 100.0d) * getMeasuredHeight()));
                s8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof r8) {
                r8 r8Var = (r8) getChildAt(i11);
                r8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.f10896b.coordinates.f27236w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r8Var.f10896b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof s8) {
                s8 s8Var = (s8) getChildAt(i11);
                s8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f11029a.coordinates.f27236w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((s8Var.f11029a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gi.l3 l3Var;
        if (getChildCount() == 0 || (l3Var = this.f11057c) == null || !l3Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            gi.l3 l3Var2 = this.f11057c;
            if (l3Var2 != null) {
                l3Var2.f(true);
                this.f11057c = null;
            }
            this.f11056b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
