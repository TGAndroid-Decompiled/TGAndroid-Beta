package bi;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.gz;
public abstract class ta extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public ra f3753a;
    public ra f3754b;
    public di.f4 f3755c;
    public final FrameLayout d;
    public final Matrix f3756e;
    public final float[] f3757f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 f3758n;
    public ArrayList f3759r;
    public final Rect f3760s;
    public final RectF v;
    public final Paint f3761w;
    public final org.telegram.ui.Components.e6 f3762x;
    public final org.telegram.ui.Components.e6 f3763y;

    public ta(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3753a = null;
        this.f3754b = null;
        this.f3755c = null;
        this.f3756e = new Matrix();
        this.f3757f = new float[2];
        this.f3760s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f3761w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f3758n = f6Var;
        this.f3762x = new org.telegram.ui.Components.e6(view, 0L, 120L, new LinearInterpolator());
        this.f3763y = new org.telegram.ui.Components.e6(view, 0L, 360L, pr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(di.o8 o8Var) {
        if (o8Var != null && o8Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < o8Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) o8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) o8Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, gz gzVar) {
        FrameLayout frameLayout;
        wa waVar;
        ArrayList arrayList2 = this.f3759r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f3759r.size())) {
            di.f4 f4Var = this.f3755c;
            if (f4Var != null) {
                f4Var.e(true);
                this.f3755c = null;
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
            this.f3754b = null;
            this.f3763y.d(0.0f, true);
            invalidate();
            b(false);
            this.f3759r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        wa waVar2 = new wa(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, gzVar);
                        if (storyItem != null) {
                            waVar2.c(storyItem.views, false);
                        }
                        w7.z5.a(waVar2);
                        waVar = waVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f7706c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        rg.u0 u0Var = new rg.u0(getContext(), AndroidUtilities.density);
                        u0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        u0Var.setIsVideo(true);
                        u0Var.d(UserConfig.selectedAccount, tLObject.f7706c);
                        u0Var.setText(tLObject.a());
                        u0Var.e(3, tL_mediaAreaWeather.color);
                        waVar = new sa(getContext(), u0Var, mediaArea);
                    } else {
                        waVar = new ra(getContext(), this.h, mediaArea);
                    }
                    waVar.setOnClickListener(this);
                    addView(waVar);
                    double d = mediaArea.coordinates.f20103w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, gz gzVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, gzVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        float f10;
        float f11;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            ra raVar = this.f3754b;
            if (raVar != null && raVar.f3672s && !raVar.f3673w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.f3762x.e(z10);
            ra raVar2 = this.f3754b;
            if (raVar2 != null && raVar2.f3673w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e10 = this.f3763y.e(z11);
            RectF rectF2 = this.v;
            if (e7 > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e7, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.e6 e6Var = ((ra) childAt).f3665a;
                        ra raVar3 = this.f3754b;
                        if (childAt == raVar3 && raVar3.f3672s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e11 = e6Var.e(z12);
                        if (e11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e11 * 255.0f);
                            Paint paint = this.f3761w;
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
                f7 = 0.0f;
                f10 = 0.2f;
            }
            if ((z11 || e10 > f7) && this.f3753a != null) {
                if (this.F == null) {
                    this.F = ((h4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f3753a.getX(), this.f3753a.getY(), this.f3753a.getX() + this.f3753a.getMeasuredWidth(), this.f3753a.getY() + this.f3753a.getMeasuredHeight());
                    ra raVar4 = this.f3753a;
                    if (raVar4.f3674x) {
                        f11 = raVar4.f3671r.a(0.05f);
                    } else {
                        f11 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f11 * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f3753a.getRotation(), rectF.centerX(), rectF.centerY());
                    ra raVar5 = this.f3753a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = raVar5.f3666b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * raVar5.getMeasuredWidth());
                    } else {
                        measuredHeight = raVar5.getMeasuredHeight() * f10;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f3760s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f3753a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f3753a.getX(), this.f3753a.getY());
                    canvas2.rotate(this.f3753a.getRotation(), this.f3753a.getPivotX(), this.f3753a.getPivotY());
                    canvas2.scale(this.f3753a.getScaleX() * lerp, this.f3753a.getScaleY() * lerp, this.f3753a.getPivotX(), this.f3753a.getPivotY());
                    this.f3753a.b(canvas2);
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
        } else if (view instanceof ra) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((ra) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof ra) {
                    ra raVar = (ra) childAt;
                    oa oaVar = raVar.H;
                    if (raVar.v) {
                        AndroidUtilities.cancelRunOnUIThread(oaVar);
                        AndroidUtilities.runOnUIThread(oaVar, 400L);
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
        throw new UnsupportedOperationException("Method not decompiled: bi.ta.onClick(android.view.View):void");
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
            } else if (childAt instanceof ra) {
                ra raVar = (ra) childAt;
                TL_stories.MediaArea mediaArea = raVar.f3666b;
                int measuredWidth = raVar.getMeasuredWidth();
                int measuredHeight = raVar.getMeasuredHeight();
                raVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                raVar.setTranslationX((float) ((mediaArea.coordinates.f20104x / 100.0d) * getMeasuredWidth()));
                raVar.setTranslationY((float) ((mediaArea.coordinates.f20105y / 100.0d) * getMeasuredHeight()));
                raVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof sa) {
                sa saVar = (sa) childAt;
                TL_stories.MediaArea mediaArea2 = saVar.f3710a;
                int measuredWidth2 = saVar.getMeasuredWidth();
                int measuredHeight2 = saVar.getMeasuredHeight();
                saVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                saVar.setTranslationX((float) ((mediaArea2.coordinates.f20104x / 100.0d) * getMeasuredWidth()));
                saVar.setTranslationY((float) ((mediaArea2.coordinates.f20105y / 100.0d) * getMeasuredHeight()));
                saVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof ra) {
                ra raVar = (ra) getChildAt(i12);
                raVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.f3666b.coordinates.f20103w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.f3666b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof sa) {
                sa saVar = (sa) getChildAt(i12);
                saVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.f3710a.coordinates.f20103w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.f3710a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        di.f4 f4Var;
        if (getChildCount() == 0 || (f4Var = this.f3755c) == null || !f4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            di.f4 f4Var2 = this.f3755c;
            if (f4Var2 != null) {
                f4Var2.e(true);
                this.f3755c = null;
            }
            this.f3754b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
