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
import org.telegram.ui.Components.qr;
import org.telegram.ui.gz;
public abstract class mb extends FrameLayout implements View.OnClickListener {
    public final Path E;
    public Bitmap F;
    public boolean G;
    public kb f1259a;
    public kb f1260b;
    public ci.f4 f1261c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f1262f;
    public final View h;
    public final org.telegram.ui.ActionBar.e6 f1263n;
    public ArrayList f1264r;
    public final Rect f1265s;
    public final RectF v;
    public final Paint f1266w;
    public final org.telegram.ui.Components.c6 f1267x;
    public final org.telegram.ui.Components.c6 f1268y;

    public mb(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f1259a = null;
        this.f1260b = null;
        this.f1261c = null;
        this.e = new Matrix();
        this.f1262f = new float[2];
        this.f1265s = new Rect();
        this.v = new RectF();
        Paint paint = new Paint(1);
        this.f1266w = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.f1263n = e6Var;
        this.f1267x = new org.telegram.ui.Components.c6(view, 0L, 120L, new LinearInterpolator());
        this.f1268y = new org.telegram.ui.Components.c6(view, 0L, 360L, qr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(ci.o8 o8Var) {
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
        pb pbVar;
        ArrayList arrayList2 = this.f1264r;
        if (arrayList != arrayList2 || (arrayList != null && arrayList2 != null && arrayList.size() != this.f1264r.size())) {
            ci.f4 f4Var = this.f1261c;
            if (f4Var != null) {
                f4Var.e(true);
                this.f1261c = null;
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
            this.f1260b = null;
            this.f1268y.d(0.0f, true);
            invalidate();
            b(false);
            this.f1264r = arrayList;
            if (arrayList == null) {
                return;
            }
            this.G = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
                if (mediaArea != null && mediaArea.coordinates != null) {
                    if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        pb pbVar2 = new pb(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, gzVar);
                        if (storyItem != null) {
                            pbVar2.c(storyItem.views, false);
                        }
                        w7.z5.a(pbVar2);
                        pbVar = pbVar2;
                    } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                        ?? tLObject = new TLObject();
                        tLObject.f5099c = tL_mediaAreaWeather.emoji;
                        tLObject.d = (float) tL_mediaAreaWeather.temperature_c;
                        qg.v0 v0Var = new qg.v0(getContext(), AndroidUtilities.density);
                        v0Var.setMaxWidth(AndroidUtilities.displaySize.x);
                        v0Var.setIsVideo(true);
                        v0Var.d(UserConfig.selectedAccount, tLObject.f5099c);
                        v0Var.setText(tLObject.a());
                        v0Var.e(3, tL_mediaAreaWeather.color);
                        pbVar = new lb(getContext(), v0Var, mediaArea);
                    } else {
                        pbVar = new kb(getContext(), this.h, mediaArea);
                    }
                    pbVar.setOnClickListener(this);
                    addView(pbVar);
                    double d = mediaArea.coordinates.f18344w;
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
            kb kbVar = this.f1260b;
            if (kbVar != null && kbVar.f1155s && !kbVar.f1156w) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f1267x.e(z10);
            kb kbVar2 = this.f1260b;
            if (kbVar2 != null && kbVar2.f1156w) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e7 = this.f1268y.e(z11);
            RectF rectF2 = this.v;
            if (e > 0.0f) {
                canvas2 = canvas;
                rectF = rectF2;
                f7 = 0.0f;
                f10 = 0.2f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(e, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.c6 c6Var = ((kb) childAt).f1149a;
                        kb kbVar3 = this.f1260b;
                        if (childAt == kbVar3 && kbVar3.f1155s) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float e10 = c6Var.e(z12);
                        if (e10 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (e10 * 255.0f);
                            Paint paint = this.f1266w;
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
            if ((z11 || e7 > f7) && this.f1259a != null) {
                if (this.F == null) {
                    this.F = ((v4) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(e7, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.f1259a.getX(), this.f1259a.getY(), this.f1259a.getX() + this.f1259a.getMeasuredWidth(), this.f1259a.getY() + this.f1259a.getMeasuredHeight());
                    kb kbVar4 = this.f1259a;
                    if (kbVar4.f1157x) {
                        f11 = kbVar4.f1154r.a(0.05f);
                    } else {
                        f11 = 1.0f;
                    }
                    float lerp = AndroidUtilities.lerp(1.0f, f11 * 1.05f, e7);
                    canvas2.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.f1259a.getRotation(), rectF.centerX(), rectF.centerY());
                    kb kbVar5 = this.f1259a;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = kbVar5.f1150b.coordinates;
                    if ((mediaAreaCoordinates.flags & 1) != 0) {
                        measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * kbVar5.getMeasuredWidth());
                    } else {
                        measuredHeight = kbVar5.getMeasuredHeight() * f10;
                    }
                    path.addRoundRect(rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f7, f7, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.f1265s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.f1259a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.f1259a.getX(), this.f1259a.getY());
                    canvas2.rotate(this.f1259a.getRotation(), this.f1259a.getPivotX(), this.f1259a.getPivotY());
                    canvas2.scale(this.f1259a.getScaleX() * lerp, this.f1259a.getScaleY() * lerp, this.f1259a.getPivotX(), this.f1259a.getPivotY());
                    this.f1259a.b(canvas2);
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
        } else if (view instanceof kb) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((kb) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        if (!this.G) {
            this.G = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof kb) {
                    kb kbVar = (kb) childAt;
                    a3.d dVar = kbVar.H;
                    if (kbVar.v) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.mb.onClick(android.view.View):void");
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
            } else if (childAt instanceof kb) {
                kb kbVar = (kb) childAt;
                TL_stories.MediaArea mediaArea = kbVar.f1150b;
                int measuredWidth = kbVar.getMeasuredWidth();
                int measuredHeight = kbVar.getMeasuredHeight();
                kbVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                kbVar.setTranslationX((float) ((mediaArea.coordinates.f18345x / 100.0d) * getMeasuredWidth()));
                kbVar.setTranslationY((float) ((mediaArea.coordinates.f18346y / 100.0d) * getMeasuredHeight()));
                kbVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) childAt;
                TL_stories.MediaArea mediaArea2 = lbVar.f1212a;
                int measuredWidth2 = lbVar.getMeasuredWidth();
                int measuredHeight2 = lbVar.getMeasuredHeight();
                lbVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                lbVar.setTranslationX((float) ((mediaArea2.coordinates.f18345x / 100.0d) * getMeasuredWidth()));
                lbVar.setTranslationY((float) ((mediaArea2.coordinates.f18346y / 100.0d) * getMeasuredHeight()));
                lbVar.setRotation((float) mediaArea2.coordinates.rotation);
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
            } else if (childAt instanceof kb) {
                kb kbVar = (kb) getChildAt(i12);
                kbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((kbVar.f1150b.coordinates.f18344w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((kbVar.f1150b.coordinates.h / 100.0d) * size2), 1073741824));
            } else if (childAt instanceof lb) {
                lb lbVar = (lb) getChildAt(i12);
                lbVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.f1212a.coordinates.f18344w / 100.0d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((lbVar.f1212a.coordinates.h / 100.0d) * size2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ci.f4 f4Var;
        if (getChildCount() == 0 || (f4Var = this.f1261c) == null || !f4Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ci.f4 f4Var2 = this.f1261c;
            if (f4Var2 != null) {
                f4Var2.e(true);
                this.f1261c = null;
            }
            this.f1260b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
