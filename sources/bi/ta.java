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
    public ra f3780a;
    public ra f3781b;
    public di.f4 f3782c;
    public final FrameLayout d;
    public final Matrix f3783e;
    public final float[] f3784f;
    public final View h;
    public final org.telegram.ui.ActionBar.f6 f3785n;
    public ArrayList f3786r;
    public final Rect f3787s;
    public final RectF v;
    public final Paint f3788w;
    public final org.telegram.ui.Components.e6 f3789x;
    public final org.telegram.ui.Components.e6 f3790y;

    public ta(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3780a = null;
        this.f3781b = null;
        this.f3782c = null;
        this.f3783e = new Matrix();
        this.f3784f = new float[2];
        this.f3787s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f3788w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f3785n = f6Var;
        this.f3789x = new org.telegram.ui.Components.e6(view, 0L, 120L, new LinearInterpolator());
        this.f3790y = new org.telegram.ui.Components.e6(view, 0L, 360L, pr.h);
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
        ArrayList arrayList2 = this.f3786r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f3786r.size())) {
            di.f4 f4Var = this.f3782c;
            if (f4Var != null) {
                f4Var.e(true);
                this.f3782c = null;
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
            this.f3781b = null;
            this.f3790y.d(0.0f, true);
            invalidate();
            b(false);
            this.f3786r = arrayList;
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
                        tLObject.f7734c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        rg.u0 u0Var = new rg.u0(getContext(), AndroidUtilities.density);
                        u0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        u0Var.setIsVideo(true);
                        u0Var.d(UserConfig.selectedAccount, tLObject.f7734c);
                        u0Var.setText(tLObject.a());
                        u0Var.e(3, tL_mediaAreaWeather.color);
                        waVar = new sa(getContext(), u0Var, mediaArea);
                    } else {
                        waVar = new ra(getContext(), this.h, mediaArea);
                    }
                    waVar.setOnClickListener(this);
                    addView(waVar);
                    double d = mediaArea.coordinates.f20130w;
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
            ra raVar = this.f3781b;
            if (raVar != null && raVar.f3699s && !raVar.f3700w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.f3789x.e(z10);
            ra raVar2 = this.f3781b;
            if (raVar2 != null && raVar2.f3700w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e10 = this.f3790y.e(z11);
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
                        org.telegram.ui.Components.e6 e6Var = ((ra) childAt).f3692a;
                        ra raVar3 = this.f3781b;
                        if (childAt == raVar3 && raVar3.f3699s) {
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
                            Paint paint = this.f3788w;
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
            if ((z11 || e10 > f7) && this.f3780a != null) {
                if (this.F == null) {
                    this.F = ((h4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f3780a.getX(), this.f3780a.getY(), this.f3780a.getX() + this.f3780a.getMeasuredWidth(), this.f3780a.getY() + this.f3780a.getMeasuredHeight());
                    ra raVar4 = this.f3780a;
                    if (raVar4.f3701x) {
                        f11 = raVar4.f3698r.a(0.05f);
                    } else {
                        f11 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f11 * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f3780a.getRotation(), rectF.centerX(), rectF.centerY());
                    ra raVar5 = this.f3780a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = raVar5.f3693b.coordinates;
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
                    Rect rect = this.f3787s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f3780a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f3780a.getX(), this.f3780a.getY());
                    canvas2.rotate(this.f3780a.getRotation(), this.f3780a.getPivotX(), this.f3780a.getPivotY());
                    canvas2.scale(this.f3780a.getScaleX() * lerp, this.f3780a.getScaleY() * lerp, this.f3780a.getPivotX(), this.f3780a.getPivotY());
                    this.f3780a.b(canvas2);
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
                TL_stories.MediaArea mediaArea = raVar.f3693b;
                int measuredWidth = raVar.getMeasuredWidth();
                int measuredHeight = raVar.getMeasuredHeight();
                raVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                raVar.setTranslationX((float) ((mediaArea.coordinates.f20131x / 100.0d) * getMeasuredWidth()));
                raVar.setTranslationY((float) ((mediaArea.coordinates.f20132y / 100.0d) * getMeasuredHeight()));
                raVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof sa) {
                sa saVar = (sa) childAt;
                TL_stories.MediaArea mediaArea2 = saVar.f3737a;
                int measuredWidth2 = saVar.getMeasuredWidth();
                int measuredHeight2 = saVar.getMeasuredHeight();
                saVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                saVar.setTranslationX((float) ((mediaArea2.coordinates.f20131x / 100.0d) * getMeasuredWidth()));
                saVar.setTranslationY((float) ((mediaArea2.coordinates.f20132y / 100.0d) * getMeasuredHeight()));
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
                raVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.f3693b.coordinates.f20130w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((raVar.f3693b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof sa) {
                sa saVar = (sa) getChildAt(i12);
                saVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.f3737a.coordinates.f20130w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((saVar.f3737a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        di.f4 f4Var;
        if (getChildCount() == 0 || (f4Var = this.f3782c) == null || !f4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            di.f4 f4Var2 = this.f3782c;
            if (f4Var2 != null) {
                f4Var2.e(true);
                this.f3782c = null;
            }
            this.f3781b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
