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
public abstract class w4b extends FrameLayout implements View.OnClickListener {
    public final lm E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public u4b a;
    public u4b b;
    public je5 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final d28 h;
    public final f53 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final lm y;

    public w4b(Context context, d28 d28Var, f53 f53Var) {
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
        this.h = d28Var;
        this.n = f53Var;
        this.y = new lm(d28Var, 0L, 120L, new LinearInterpolator());
        this.E = new lm(d28Var, 0L, 360L, s33.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(f4b f4bVar) {
        if (f4bVar != null && f4bVar.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f4bVar.T0.size(); i++) {
                if (((mac) f4bVar.T0.get(i)).N instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((mac) f4bVar.T0.get(i)).N);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z);

    public final void c(TL_stories.StoryItem storyItem, zu3 zu3Var) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        d(storyItem, arrayList, zu3Var);
    }

    public final void d(TL_stories.StoryItem storyItem, ArrayList arrayList, zu3 zu3Var) {
        FrameLayout frameLayout;
        c6b c6bVar;
        ArrayList arrayList2 = this.r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.r.size())) {
            je5 je5Var = this.c;
            if (je5Var != null) {
                je5Var.f(true);
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
                        c6b c6bVar2 = new c6b(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, zu3Var);
                        if (storyItem != null) {
                            c6bVar2.c(storyItem.views, false);
                        }
                        ote.a(c6bVar2);
                        c6bVar = c6bVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        hb6 hb6Var = new hb6(getContext(), gl.p);
                        hb6Var.setMaxWidth(gl.q.x);
                        hb6Var.setIsVideo(true);
                        hb6Var.d(y6c.t0, tLObject.c);
                        hb6Var.setText(tLObject.a());
                        hb6Var.e(3, tL_mediaAreaWeather.color);
                        c6bVar = new v4b(getContext(), hb6Var, mediaArea);
                    } else {
                        c6bVar = new u4b(getContext(), this.h, mediaArea);
                    }
                    c6bVar.setOnClickListener(this);
                    addView(c6bVar);
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
        u4b u4bVar;
        float measuredHeight;
        boolean z3;
        if (view == this.d) {
            u4b u4bVar2 = this.b;
            if (u4bVar2 != null && u4bVar2.s && !u4bVar2.x) {
                z = true;
            } else {
                z = false;
            }
            float d = this.y.d(z);
            u4b u4bVar3 = this.b;
            if (u4bVar3 != null && u4bVar3.x) {
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
                canvas2.drawColor(bkb.p1(d, 402653184));
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof u4b) {
                        lm lmVar = ((u4b) childAt).a;
                        u4b u4bVar4 = this.b;
                        if (childAt == u4bVar4 && u4bVar4.s) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float d3 = lmVar.d(z3);
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
                    bitmap = ((b28) this).J.getPlayingBitmap();
                    this.G = bitmap;
                }
                if (bitmap != null) {
                    canvas2.drawColor(bkb.p1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    u4b u4bVar5 = this.a;
                    if (u4bVar5.y) {
                        f2 = u4bVar5.r.a(0.05f);
                    } else {
                        f2 = 1.0f;
                    }
                    float R1 = gl.R1(1.0f, f2 * 1.05f, d2);
                    canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * u4bVar.getMeasuredWidth());
                    } else {
                        measuredHeight = u4bVar.getMeasuredHeight() * f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = gl.P;
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
        } else if (view instanceof u4b) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((u4b) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (!this.H) {
            this.H = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof u4b) {
                    u4b u4bVar = (u4b) childAt;
                    kya kyaVar = u4bVar.I;
                    if (u4bVar.w) {
                        gl.r(kyaVar);
                        gl.e3(kyaVar, 400L);
                    }
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4b.onClick(android.view.View):void");
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
            } else if (childAt instanceof u4b) {
                u4b u4bVar = (u4b) childAt;
                TL_stories.MediaArea mediaArea = u4bVar.b;
                int measuredWidth = u4bVar.getMeasuredWidth();
                int measuredHeight = u4bVar.getMeasuredHeight();
                u4bVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                u4bVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                u4bVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                u4bVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof v4b) {
                v4b v4bVar = (v4b) childAt;
                TL_stories.MediaArea mediaArea2 = v4bVar.a;
                int measuredWidth2 = v4bVar.getMeasuredWidth();
                int measuredHeight2 = v4bVar.getMeasuredHeight();
                v4bVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                v4bVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                v4bVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                v4bVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof u4b) {
                u4b u4bVar = (u4b) getChildAt(i3);
                u4bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u4bVar.b.coordinates.w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((u4bVar.b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof v4b) {
                v4b v4bVar = (v4b) getChildAt(i3);
                v4bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v4bVar.a.coordinates.w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v4bVar.a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        je5 je5Var;
        if (getChildCount() == 0 || (je5Var = this.c) == null || !je5Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            je5 je5Var2 = this.c;
            if (je5Var2 != null) {
                je5Var2.f(true);
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
