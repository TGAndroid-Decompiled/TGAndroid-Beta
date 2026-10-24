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
import org.telegram.ui.Components.zr;
import org.telegram.ui.qy;
public abstract class d9 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public b9 f5261a;
    public b9 f5262b;
    public ei.x3 f5263c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f5264f;
    public final View h;
    public final org.telegram.ui.ActionBar.g6 f5265n;
    public ArrayList f5266r;
    public final Rect f5267s;
    public final RectF v;
    public final Paint f5268w;
    public final org.telegram.ui.Components.d6 f5269x;
    public final org.telegram.ui.Components.d6 f5270y;

    public d9(Context context, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f5261a = null;
        this.f5262b = null;
        this.f5263c = null;
        this.e = new Matrix();
        this.f5264f = new float[2];
        this.f5267s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f5268w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f5265n = g6Var;
        this.f5269x = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        this.f5270y = new org.telegram.ui.Components.d6(view, 0L, 360L, zr.h);
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
        g9 g9Var;
        ArrayList arrayList2 = this.f5266r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f5266r.size())) {
            ei.x3 x3Var = this.f5263c;
            if (x3Var != null) {
                x3Var.e(true);
                this.f5263c = null;
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
            this.f5262b = null;
            this.f5270y.d(0.0f, true);
            invalidate();
            b(false);
            this.f5266r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        g9 g9Var2 = new g9(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, qyVar);
                        if (storyItem != null) {
                            g9Var2.c(storyItem.views, false);
                        }
                        w7.b6.a(g9Var2);
                        g9Var = g9Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f9884c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        rg.s0 s0Var = new rg.s0(getContext(), AndroidUtilities.density);
                        s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        s0Var.setIsVideo(true);
                        s0Var.d(UserConfig.selectedAccount, tLObject.f9884c);
                        s0Var.setText(tLObject.a());
                        s0Var.e(3, tL_mediaAreaWeather.color);
                        g9Var = new c9(getContext(), s0Var, mediaArea);
                    } else {
                        g9Var = new b9(getContext(), this.h, mediaArea);
                    }
                    g9Var.setOnClickListener(this);
                    addView(g9Var);
                    double d = mediaArea.coordinates.f20574w;
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
        b9 b9Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            b9 b9Var2 = this.f5262b;
            if (b9Var2 != null && b9Var2.f5199s && !b9Var2.f5200w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f5269x.e(z10);
            b9 b9Var3 = this.f5262b;
            if (b9Var3 != null && b9Var3.f5200w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e7 = this.f5270y.e(z11);
            int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
            RectF rectF2 = this.v;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(e, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.d6 d6Var = ((b9) childAt).f5193a;
                        b9 b9Var4 = this.f5262b;
                        if (childAt == b9Var4 && b9Var4.f5199s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e10 = d6Var.e(z12);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (e10 * 255.0f);
                            Paint paint = this.f5268w;
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
            if ((z11 || e7 > 0.0f) && this.f5261a != null) {
                if (this.F == null) {
                    this.F = ((m3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f5261a.getX(), this.f5261a.getY(), this.f5261a.getX() + this.f5261a.getMeasuredWidth(), this.f5261a.getY() + this.f5261a.getMeasuredHeight());
                    b9 b9Var5 = this.f5261a;
                    if (b9Var5.f5201x) {
                        f7 = b9Var5.f5198r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f7 * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f5261a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f5261a.f5194b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * b9Var.getMeasuredWidth());
                    } else {
                        measuredHeight = b9Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f5267s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f5261a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f5261a.getX(), this.f5261a.getY());
                    canvas2.rotate(this.f5261a.getRotation(), this.f5261a.getPivotX(), this.f5261a.getPivotY());
                    canvas2.scale(this.f5261a.getScaleX() * lerp, this.f5261a.getScaleY() * lerp, this.f5261a.getPivotX(), this.f5261a.getPivotY());
                    this.f5261a.b(canvas2);
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
        } else if (view instanceof b9) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((b9) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof b9) {
                    b9 b9Var = (b9) childAt;
                    androidx.fragment.app.d dVar = b9Var.H;
                    if (b9Var.v) {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.d9.onClick(android.view.View):void");
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
            } else if (childAt instanceof b9) {
                b9 b9Var = (b9) childAt;
                TL_stories.MediaArea mediaArea = b9Var.f5194b;
                int measuredWidth = b9Var.getMeasuredWidth();
                int measuredHeight = b9Var.getMeasuredHeight();
                b9Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                b9Var.setTranslationX((float) ((mediaArea.coordinates.f20575x / 100.0d) * getMeasuredWidth()));
                b9Var.setTranslationY((float) ((mediaArea.coordinates.f20576y / 100.0d) * getMeasuredHeight()));
                b9Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) childAt;
                TL_stories.MediaArea mediaArea2 = c9Var.f5242a;
                int measuredWidth2 = c9Var.getMeasuredWidth();
                int measuredHeight2 = c9Var.getMeasuredHeight();
                c9Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                c9Var.setTranslationX((float) ((mediaArea2.coordinates.f20575x / 100.0d) * getMeasuredWidth()));
                c9Var.setTranslationY((float) ((mediaArea2.coordinates.f20576y / 100.0d) * getMeasuredHeight()));
                c9Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof b9) {
                b9 b9Var = (b9) getChildAt(i12);
                b9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((b9Var.f5194b.coordinates.f20574w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((b9Var.f5194b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof c9) {
                c9 c9Var = (c9) getChildAt(i12);
                c9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.f5242a.coordinates.f20574w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((c9Var.f5242a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ei.x3 x3Var;
        if (getChildCount() == 0 || (x3Var = this.f5263c) == null || !x3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ei.x3 x3Var2 = this.f5263c;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f5263c = null;
            }
            this.f5262b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
