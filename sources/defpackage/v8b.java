package defpackage;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public abstract class v8b extends FrameLayout implements View.OnClickListener {
    public final mm E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public t8b a;
    public t8b b;
    public kg5 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final t58 h;
    public final x53 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final mm y;

    public v8b(Context context, t58 t58Var, x53 x53Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.w = new RectF();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.F = new Path();
        this.H = false;
        this.h = t58Var;
        this.n = x53Var;
        this.y = new mm(t58Var, 0L, 120L, new LinearInterpolator());
        this.E = new mm(t58Var, 0L, 360L, k43.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(c8b c8bVar) {
        if (c8bVar != null && c8bVar.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c8bVar.T0.size(); i++) {
                if (((mec) c8bVar.T0.get(i)).N instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((mec) c8bVar.T0.get(i)).N);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z);

    public final void c(TL_stories.StoryItem storyItem, tv3 tv3Var) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        d(storyItem, arrayList, tv3Var);
    }

    public final void d(TL_stories.StoryItem storyItem, ArrayList arrayList, tv3 tv3Var) {
        FrameLayout frameLayout;
        aab aabVar;
        ArrayList arrayList2 = this.r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.r.size())) {
            kg5 kg5Var = this.c;
            if (kg5Var != null) {
                kg5Var.f(true);
                this.c = null;
            }
            int i = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i--;
                }
                i++;
            }
            this.b = null;
            this.E.e(true, 0.0f);
            invalidate();
            b(false);
            this.r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.H = false;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i2);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        aab aabVar2 = new aab(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, tv3Var);
                        if (storyItem != null) {
                            aabVar2.c(storyItem.views, false);
                        }
                        iye.a(aabVar2);
                        aabVar = aabVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        ld6 ld6Var = new ld6(getContext(), hl.p);
                        ld6Var.setMaxWidth(hl.q.x);
                        ld6Var.setIsVideo(true);
                        ld6Var.d(yac.t0, tLObject.c);
                        ld6Var.setText(tLObject.a());
                        ld6Var.e(3, tL_mediaAreaWeather.color);
                        aabVar = new u8b(getContext(), ld6Var, mediaArea);
                    } else {
                        aabVar = new t8b(getContext(), this.h, mediaArea);
                    }
                    aabVar.setOnClickListener(this);
                    addView(aabVar);
                    double d = mediaArea.coordinates.w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean z2;
        Canvas canvas2;
        RectF rectF;
        float f;
        float f2;
        t8b t8bVar;
        float measuredHeight;
        boolean z3;
        if (view == this.d) {
            t8b t8bVar2 = this.b;
            if (t8bVar2 != null && t8bVar2.s && !t8bVar2.x) {
                z = true;
            } else {
                z = false;
            }
            float d = this.y.d(z);
            t8b t8bVar3 = this.b;
            if (t8bVar3 != null && t8bVar3.x) {
                z2 = true;
            } else {
                z2 = false;
            }
            float d2 = this.E.d(z2);
            int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
            RectF rectF2 = this.w;
            if (i > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(aob.p1(d, 402653184));
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof t8b) {
                        mm mmVar = ((t8b) childAt).a;
                        t8b t8bVar4 = this.b;
                        if (childAt == t8bVar4 && t8bVar4.s) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float d3 = mmVar.d(z3);
                        if (d3 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i3 = (int) (d3 * 255.0f);
                            Paint paint = this.x;
                            paint.setAlpha(i3);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                f = 0.2f;
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f = 0.2f;
            }
            if ((z2 || d2 > 0.0f) && this.a != null) {
                Bitmap bitmap = this.G;
                if (bitmap == null) {
                    bitmap = ((r58) this).J.getPlayingBitmap();
                    this.G = bitmap;
                }
                if (bitmap != null) {
                    canvas2.drawColor(aob.p1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    t8b t8bVar5 = this.a;
                    if (t8bVar5.y) {
                        f2 = t8bVar5.r.a(0.05f);
                    } else {
                        f2 = 1.0f;
                    }
                    float R1 = hl.R1(1.0f, f2 * 1.05f, d2);
                    canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * t8bVar.getMeasuredWidth());
                    } else {
                        measuredHeight = t8bVar.getMeasuredHeight() * f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = hl.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * R1, this.a.getScaleY() * R1, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap2 = this.G;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.G = null;
                }
            }
            invalidate();
        } else if (view instanceof t8b) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((t8b) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (!this.H) {
            this.H = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof t8b) {
                    t8b t8bVar = (t8b) childAt;
                    s8b s8bVar = t8bVar.I;
                    if (t8bVar.w) {
                        hl.r(s8bVar);
                        hl.d3(s8bVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8b.onClick(android.view.View):void");
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof t8b) {
                t8b t8bVar = (t8b) childAt;
                TL_stories.MediaArea mediaArea = t8bVar.b;
                int measuredWidth = t8bVar.getMeasuredWidth();
                int measuredHeight = t8bVar.getMeasuredHeight();
                t8bVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                t8bVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                t8bVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                t8bVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof u8b) {
                u8b u8bVar = (u8b) childAt;
                TL_stories.MediaArea mediaArea2 = u8bVar.a;
                int measuredWidth2 = u8bVar.getMeasuredWidth();
                int measuredHeight2 = u8bVar.getMeasuredHeight();
                u8bVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                u8bVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                u8bVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                u8bVar.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof t8b) {
                t8b t8bVar = (t8b) getChildAt(i3);
                t8bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8bVar.b.coordinates.w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((t8bVar.b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof u8b) {
                u8b u8bVar = (u8b) getChildAt(i3);
                u8bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u8bVar.a.coordinates.w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u8bVar.a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kg5 kg5Var;
        if (getChildCount() == 0 || (kg5Var = this.c) == null || !kg5Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            kg5 kg5Var2 = this.c;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
                this.c = null;
            }
            this.b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
