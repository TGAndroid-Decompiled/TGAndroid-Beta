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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.oy;
public abstract class c9 extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public a9 f8463a;
    public a9 f8464b;
    public fi.v3 f8465c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f8466f;
    public final View h;
    public final org.telegram.ui.ActionBar.u6 f8467n;
    public ArrayList f8468r;
    public final Rect f8469s;
    public final RectF v;
    public final Paint f8470w;
    public final org.telegram.ui.Components.h6 f8471x;
    public final org.telegram.ui.Components.h6 f8472y;

    public c9(Context context, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f8463a = null;
        this.f8464b = null;
        this.f8465c = null;
        this.e = new Matrix();
        this.f8466f = new float[2];
        this.f8469s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f8470w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f8467n = u6Var;
        this.f8471x = new org.telegram.ui.Components.h6(view, 0L, 120L, new LinearInterpolator());
        this.f8472y = new org.telegram.ui.Components.h6(view, 0L, 360L, ds.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(fi.w7 w7Var) {
        if (w7Var != null && w7Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < w7Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) w7Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) w7Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, oy oyVar) {
        FrameLayout frameLayout;
        f9 f9Var;
        ArrayList arrayList2 = this.f8468r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f8468r.size())) {
            fi.v3 v3Var = this.f8465c;
            if (v3Var != null) {
                v3Var.e(true);
                this.f8465c = null;
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
            this.f8464b = null;
            this.f8472y.d(0.0f, true);
            invalidate();
            b(false);
            this.f8468r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        f9 f9Var2 = new f9(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, oyVar);
                        if (storyItem != null) {
                            f9Var2.c(storyItem.views, false);
                        }
                        gb1.b(f9Var2);
                        f9Var = f9Var2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f11455c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        sg.t0 t0Var = new sg.t0(getContext(), AndroidUtilities.density);
                        t0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        t0Var.setIsVideo(true);
                        t0Var.d(UserConfig.selectedAccount, tLObject.f11455c);
                        t0Var.setText(tLObject.a());
                        t0Var.e(3, tL_mediaAreaWeather.color);
                        f9Var = new b9(getContext(), t0Var, mediaArea);
                    } else {
                        f9Var = new a9(getContext(), this.h, mediaArea);
                    }
                    f9Var.setOnClickListener(this);
                    addView(f9Var);
                    double d = mediaArea.coordinates.f22260w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, oy oyVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, oyVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        a9 a9Var;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            a9 a9Var2 = this.f8464b;
            if (a9Var2 != null && a9Var2.f8401s && !a9Var2.f8402w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f8471x.e(z10);
            a9 a9Var3 = this.f8464b;
            if (a9Var3 != null && a9Var3.f8402w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e10 = this.f8472y.e(z11);
            int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
            RectF rectF2 = this.v;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(e, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.h6 h6Var = ((a9) childAt).f8395a;
                        a9 a9Var4 = this.f8464b;
                        if (childAt == a9Var4 && a9Var4.f8401s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e11 = h6Var.e(z12);
                        if (e11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (e11 * 255.0f);
                            Paint paint = this.f8470w;
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
            if ((z11 || e10 > 0.0f) && this.f8463a != null) {
                if (this.F == null) {
                    this.F = ((m3) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f8463a.getX(), this.f8463a.getY(), this.f8463a.getX() + this.f8463a.getMeasuredWidth(), this.f8463a.getY() + this.f8463a.getMeasuredHeight());
                    a9 a9Var5 = this.f8463a;
                    if (a9Var5.f8403x) {
                        f7 = a9Var5.f8400r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f7 * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f8463a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f8463a.f8396b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * a9Var.getMeasuredWidth());
                    } else {
                        measuredHeight = a9Var.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f8469s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f8463a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f8463a.getX(), this.f8463a.getY());
                    canvas2.rotate(this.f8463a.getRotation(), this.f8463a.getPivotX(), this.f8463a.getPivotY());
                    canvas2.scale(this.f8463a.getScaleX() * lerp, this.f8463a.getScaleY() * lerp, this.f8463a.getPivotX(), this.f8463a.getPivotY());
                    this.f8463a.b(canvas2);
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
        } else if (view instanceof a9) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((a9) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof a9) {
                    a9 a9Var = (a9) childAt;
                    s8 s8Var = a9Var.H;
                    if (a9Var.v) {
                        AndroidUtilities.cancelRunOnUIThread(s8Var);
                        AndroidUtilities.runOnUIThread(s8Var, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: di.c9.onClick(android.view.View):void");
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
            } else if (childAt instanceof a9) {
                a9 a9Var = (a9) childAt;
                TL_stories.MediaArea mediaArea = a9Var.f8396b;
                int measuredWidth = a9Var.getMeasuredWidth();
                int measuredHeight = a9Var.getMeasuredHeight();
                a9Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                a9Var.setTranslationX((float) ((mediaArea.coordinates.f22261x / 100.0d) * getMeasuredWidth()));
                a9Var.setTranslationY((float) ((mediaArea.coordinates.f22262y / 100.0d) * getMeasuredHeight()));
                a9Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof b9) {
                b9 b9Var = (b9) childAt;
                TL_stories.MediaArea mediaArea2 = b9Var.f8439a;
                int measuredWidth2 = b9Var.getMeasuredWidth();
                int measuredHeight2 = b9Var.getMeasuredHeight();
                b9Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                b9Var.setTranslationX((float) ((mediaArea2.coordinates.f22261x / 100.0d) * getMeasuredWidth()));
                b9Var.setTranslationY((float) ((mediaArea2.coordinates.f22262y / 100.0d) * getMeasuredHeight()));
                b9Var.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof a9) {
                a9 a9Var = (a9) getChildAt(i12);
                a9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((a9Var.f8396b.coordinates.f22260w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((a9Var.f8396b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof b9) {
                b9 b9Var = (b9) getChildAt(i12);
                b9Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((b9Var.f8439a.coordinates.f22260w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((b9Var.f8439a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fi.v3 v3Var;
        if (getChildCount() == 0 || (v3Var = this.f8465c) == null || !v3Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            fi.v3 v3Var2 = this.f8465c;
            if (v3Var2 != null) {
                v3Var2.e(true);
                this.f8465c = null;
            }
            this.f8464b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
