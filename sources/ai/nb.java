package ai;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.fz;
public abstract class nb extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public lb f1491a;
    public lb f1492b;
    public ci.d4 f1493c;
    public final FrameLayout d;
    public final Matrix f1494e;
    public final float[] f1495f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 f1496n;
    public ArrayList f1497r;
    public final Rect f1498s;
    public final RectF v;
    public final Paint f1499w;
    public final org.telegram.ui.Components.g6 f1500x;
    public final org.telegram.ui.Components.g6 f1501y;

    public nb(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f1491a = null;
        this.f1492b = null;
        this.f1493c = null;
        this.f1494e = new Matrix();
        this.f1495f = new float[2];
        this.f1498s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f1499w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f1496n = e6Var;
        this.f1500x = new org.telegram.ui.Components.g6(view, 0L, 120L, new LinearInterpolator());
        this.f1501y = new org.telegram.ui.Components.g6(view, 0L, 360L, hs.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ci.l8 l8Var) {
        if (l8Var != null && l8Var.T0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < l8Var.T0.size(); i10++) {
                if (((VideoEditedInfo.MediaEntity) l8Var.T0.get(i10)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    arrayList.add(((VideoEditedInfo.MediaEntity) l8Var.T0.get(i10)).mediaArea);
                }
            }
            return arrayList;
        }
        return null;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, fz fzVar) {
        FrameLayout frameLayout;
        qb qbVar;
        ArrayList arrayList2 = this.f1497r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f1497r.size())) {
            ci.d4 d4Var = this.f1493c;
            if (d4Var != null) {
                d4Var.e(true);
                this.f1493c = null;
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
            this.f1492b = null;
            this.f1501y.d(0.0f, true);
            invalidate();
            b(false);
            this.f1497r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        qb qbVar2 = new qb(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, fzVar);
                        if (storyItem != null) {
                            qbVar2.c(storyItem.views, false);
                        }
                        w7.z5.a(qbVar2);
                        qbVar = qbVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f5352c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        qg.s0 s0Var = new qg.s0(getContext(), AndroidUtilities.density);
                        s0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        s0Var.setIsVideo(true);
                        s0Var.d(UserConfig.selectedAccount, tLObject.f5352c);
                        s0Var.setText(tLObject.a());
                        s0Var.e(3, tL_mediaAreaWeather.color);
                        qbVar = new mb(getContext(), s0Var, mediaArea);
                    } else {
                        qbVar = new lb(getContext(), this.h, mediaArea);
                    }
                    qbVar.setOnClickListener(this);
                    addView(qbVar);
                    double d = mediaArea.coordinates.f20271w;
                }
            }
            frameLayout.bringToFront();
        }
    }

    public final void d(TL_stories.StoryItem storyItem, fz fzVar) {
        ArrayList<TL_stories.MediaArea> arrayList;
        if (storyItem != null) {
            arrayList = storyItem.media_areas;
        } else {
            arrayList = null;
        }
        c(storyItem, arrayList, fzVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        RectF rectF;
        float f7;
        lb lbVar;
        float measuredHeight;
        boolean z12;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            lb lbVar2 = this.f1492b;
            if (lbVar2 != null && lbVar2.f1371s && !lbVar2.f1372w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.f1500x.e(z10);
            lb lbVar3 = this.f1492b;
            if (lbVar3 != null && lbVar3.f1372w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e10 = this.f1501y.e(z11);
            int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
            RectF rectF2 = this.v;
            if (i10 > 0) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(e7, 402653184));
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.g6 g6Var = ((lb) childAt).f1364a;
                        lb lbVar4 = this.f1492b;
                        if (childAt == lbVar4 && lbVar4.f1371s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e11 = g6Var.e(z12);
                        if (e11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i12 = (int) (e11 * 255.0f);
                            Paint paint = this.f1499w;
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
            if ((z11 || e10 > 0.0f) && this.f1491a != null) {
                if (this.F == null) {
                    this.F = ((w4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(e10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f1491a.getX(), this.f1491a.getY(), this.f1491a.getX() + this.f1491a.getMeasuredWidth(), this.f1491a.getY() + this.f1491a.getMeasuredHeight());
                    lb lbVar5 = this.f1491a;
                    if (lbVar5.f1373x) {
                        f7 = lbVar5.f1370r.a(0.05f);
                    } else {
                        f7 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f7 * 1.05f, e10);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f1491a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.f1491a.f1365b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * lbVar.getMeasuredWidth());
                    } else {
                        measuredHeight = lbVar.getMeasuredHeight() * 0.2f;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f1498s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f1491a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f1491a.getX(), this.f1491a.getY());
                    canvas2.rotate(this.f1491a.getRotation(), this.f1491a.getPivotX(), this.f1491a.getPivotY());
                    canvas2.scale(this.f1491a.getScaleX() * lerp, this.f1491a.getScaleY() * lerp, this.f1491a.getPivotX(), this.f1491a.getPivotY());
                    this.f1491a.b(canvas2);
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
        } else if (view instanceof lb) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((lb) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof lb) {
                    lb lbVar = (lb) childAt;
                    a3.d dVar = lbVar.H;
                    if (lbVar.v) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.nb.onClick(android.view.View):void");
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
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) childAt;
                TL_stories.MediaArea mediaArea = lbVar.f1365b;
                int measuredWidth = lbVar.getMeasuredWidth();
                int measuredHeight = lbVar.getMeasuredHeight();
                lbVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                lbVar.setTranslationX((float) ((mediaArea.coordinates.f20272x / 100.0d) * getMeasuredWidth()));
                lbVar.setTranslationY((float) ((mediaArea.coordinates.f20273y / 100.0d) * getMeasuredHeight()));
                lbVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof mb) {
                mb mbVar = (mb) childAt;
                TL_stories.MediaArea mediaArea2 = mbVar.f1431a;
                int measuredWidth2 = mbVar.getMeasuredWidth();
                int measuredHeight2 = mbVar.getMeasuredHeight();
                mbVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                mbVar.setTranslationX((float) ((mediaArea2.coordinates.f20272x / 100.0d) * getMeasuredWidth()));
                mbVar.setTranslationY((float) ((mediaArea2.coordinates.f20273y / 100.0d) * getMeasuredHeight()));
                mbVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) getChildAt(i12);
                lbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.f1365b.coordinates.f20271w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.f1365b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof mb) {
                mb mbVar = (mb) getChildAt(i12);
                mbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((mbVar.f1431a.coordinates.f20271w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((mbVar.f1431a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ci.d4 d4Var;
        if (getChildCount() == 0 || (d4Var = this.f1493c) == null || !d4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ci.d4 d4Var2 = this.f1493c;
            if (d4Var2 != null) {
                d4Var2.e(true);
                this.f1493c = null;
            }
            this.f1492b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
