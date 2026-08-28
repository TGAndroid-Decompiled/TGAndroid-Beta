package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.py;
public abstract class q8 extends FrameLayout implements View.OnClickListener {
    public final Path A;
    public Bitmap B;
    public boolean C;
    public o8 f12004a;
    public o8 f12005b;
    public kh.x3 f12006c;
    public final FrameLayout d;
    public final Matrix f12007e;
    public final float[] f12008f;
    public final View h;
    public final org.telegram.ui.ActionBar.b6 f12009n;
    public ArrayList f12010r;
    public final Rect f12011s;
    public final RectF v;
    public final Paint f12012w;
    public final org.telegram.ui.Components.y5 f12013x;
    public final org.telegram.ui.Components.y5 f12014y;

    public q8(Context context, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f12004a = null;
        this.f12005b = null;
        this.f12006c = null;
        this.f12007e = new Matrix();
        this.f12008f = new float[2];
        this.f12011s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f12012w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.A = new Path();
        this.C = false;
        this.h = view;
        this.f12009n = b6Var;
        this.f12013x = new org.telegram.ui.Components.y5(view, 0L, 120L, new LinearInterpolator());
        this.f12014y = new org.telegram.ui.Components.y5(view, 0L, 360L, gr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(kh.a8 a8Var) {
        if (a8Var != null && a8Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < a8Var.T0.size(); i9++) {
                if (((VideoEditedInfo.MediaEntity) a8Var.T0.get(i9)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) a8Var.T0.get(i9)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, py pyVar) {
        FrameLayout frameLayout;
        t8 t8Var;
        ArrayList arrayList2 = this.f12010r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f12010r.size())) {
            kh.x3 x3Var = this.f12006c;
            if (x3Var != null) {
                x3Var.e(true);
                this.f12006c = null;
            }
            int i9 = 0;
            while (true) {
                int childCount = getChildCount();
                frameLayout = this.d;
                if (i9 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i9);
                if (childAt != frameLayout) {
                    removeView(childAt);
                    i9--;
                }
                i9++;
            }
            this.f12005b = null;
            this.f12014y.d(0.0f, true);
            invalidate();
            b(false);
            this.f12010r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.C = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i10);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        t8 t8Var2 = new t8(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, pyVar);
                        if (storyItem != null) {
                            t8Var2.c(storyItem.views, false);
                        }
                        g7.g6.a(t8Var2);
                        t8Var = t8Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f16113c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        yf.r0 r0Var = new yf.r0(getContext(), AndroidUtilities.density);
                        r0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        r0Var.setIsVideo(true);
                        r0Var.d(UserConfig.selectedAccount, tLObject.f16113c);
                        r0Var.setText(tLObject.a());
                        r0Var.e(3, tL_mediaAreaWeather.color);
                        t8Var = new p8(getContext(), r0Var, mediaArea);
                    } else {
                        t8Var = new o8(getContext(), this.h, mediaArea);
                    }
                    t8Var.setOnClickListener(this);
                    addView(t8Var);
                    double d = mediaArea.coordinates.f22613w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, py pyVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, pyVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            o8 o8Var = this.f12005b;
            if (o8Var != null && o8Var.f11912s && !o8Var.f11913w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.f12013x.e(z10);
            o8 o8Var2 = this.f12005b;
            if (o8Var2 != null && o8Var2.f11913w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e11 = this.f12014y.e(z11);
            RectF rectF2 = this.v;
            if (e10 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e10, 402653184));
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.y5 y5Var = ((o8) childAt).f11905a;
                        o8 o8Var3 = this.f12005b;
                        if (childAt == o8Var3 && o8Var3.f11912s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e12 = y5Var.e(z12);
                        if (e12 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i10 = (int) (e12 * 255.0f);
                            Paint paint = this.f12012w;
                            paint.setAlpha(i10);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f10 = 0.0f;
                f11 = 0.2f;
            }
            if ((z11 || e11 > f10) && this.f12004a != null) {
                if (this.B == null) {
                    this.B = ((g3) this).E.getPlayingBitmap();
                }
                if (this.B != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e11, 805306368));
                    canvas2.save();
                    Path path = this.A;
                    path.rewind();
                    rectF.set(this.f12004a.getX(), this.f12004a.getY(), this.f12004a.getX() + this.f12004a.getMeasuredWidth(), this.f12004a.getY() + this.f12004a.getMeasuredHeight());
                    o8 o8Var4 = this.f12004a;
                    if (o8Var4.f11914x) {
                        f12 = o8Var4.f11911r.a(0.05f);
                    } else {
                        f12 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f12 * 1.05f, e11);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f12004a.getRotation(), rectF.centerX(), rectF.centerY());
                    o8 o8Var5 = this.f12004a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = o8Var5.f11906b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * o8Var5.getMeasuredWidth());
                    } else {
                        measuredHeight = o8Var5.getMeasuredHeight() * f11;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f10, f10, getWidth(), getHeight());
                    int width = this.B.getWidth();
                    int height = this.B.getHeight();
                    Rect rect = this.f12011s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f12004a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.B, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f12004a.getX(), this.f12004a.getY());
                    canvas2.rotate(this.f12004a.getRotation(), this.f12004a.getPivotX(), this.f12004a.getPivotY());
                    canvas2.scale(this.f12004a.getScaleX() * lerp, this.f12004a.getScaleY() * lerp, this.f12004a.getPivotX(), this.f12004a.getPivotY());
                    this.f12004a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.B;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.B = null;
                }
            }
            invalidate();
        } else if (view instanceof o8) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((o8) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.C) {
            this.C = true;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt instanceof o8) {
                    o8 o8Var = (o8) childAt;
                    g gVar = o8Var.D;
                    if (o8Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: ih.q8.onClick(android.view.View):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.layout(0, 0, i11 - i9, i12 - i10);
            } else if (childAt instanceof o8) {
                o8 o8Var = (o8) childAt;
                TL_stories.MediaArea mediaArea = o8Var.f11906b;
                int measuredWidth = o8Var.getMeasuredWidth();
                int measuredHeight = o8Var.getMeasuredHeight();
                o8Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                o8Var.setTranslationX((float) ((mediaArea.coordinates.f22614x / 100.0d) * getMeasuredWidth()));
                o8Var.setTranslationY((float) ((mediaArea.coordinates.f22615y / 100.0d) * getMeasuredHeight()));
                o8Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof p8) {
                p8 p8Var = (p8) childAt;
                TL_stories.MediaArea mediaArea2 = p8Var.f11977a;
                int measuredWidth2 = p8Var.getMeasuredWidth();
                int measuredHeight2 = p8Var.getMeasuredHeight();
                p8Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                p8Var.setTranslationX((float) ((mediaArea2.coordinates.f22614x / 100.0d) * getMeasuredWidth()));
                p8Var.setTranslationY((float) ((mediaArea2.coordinates.f22615y / 100.0d) * getMeasuredHeight()));
                p8Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof o8) {
                o8 o8Var = (o8) getChildAt(i11);
                o8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((o8Var.f11906b.coordinates.f22613w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((o8Var.f11906b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof p8) {
                p8 p8Var = (p8) getChildAt(i11);
                p8Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((p8Var.f11977a.coordinates.f22613w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((p8Var.f11977a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        kh.x3 x3Var;
        if (getChildCount() == 0 || (x3Var = this.f12006c) == null || !x3Var.R) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            kh.x3 x3Var2 = this.f12006c;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f12006c = null;
            }
            this.f12005b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
