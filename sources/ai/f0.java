package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.fv;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.ha1;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.pi1;
public final class f0 extends FrameLayout {
    public final int f932a;
    public Object f933b;

    public f0(Context context, int i10) {
        super(context);
        this.f932a = i10;
    }

    public gp a() {
        return ((gp[]) this.f933b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f932a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.f) this.f933b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(ah.c cVar, dh.e eVar) {
        jh.f fVar = (jh.f) this.f933b;
        fVar.b(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        gp[] gpVarArr = (gp[]) this.f933b;
        gp gpVar = gpVarArr[0];
        gp gpVar2 = gpVarArr[1];
        gpVarArr[0] = gpVar2;
        gpVarArr[1] = gpVar;
        gpVar2.f26831n = true;
        gpVar2.setVisibility(0);
        gpVarArr[0].setScaleX(0.8f);
        gpVarArr[0].setScaleY(0.8f);
        gpVarArr[0].setAlpha(0.0f);
        gpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = gpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        hs hsVar = hs.h;
        bi.t(translationY, hsVar, 320L);
        gp gpVar3 = gpVarArr[1];
        gpVar3.f26831n = false;
        gpVar3.setVisibility(0);
        gpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(hsVar).setDuration(320L).withEndAction(new rg(gpVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        int size;
        boolean z11;
        float f11;
        int dp;
        int i10;
        float f12;
        float f13;
        float f14;
        float dp2;
        ArrayList arrayList;
        switch (this.f932a) {
            case 17:
                gn0 gn0Var = (gn0) this.f933b;
                if (gn0Var.f26821r > 0.0f && gn0Var.f26818e != null) {
                    gn0Var.f26819f.reset();
                    float width = getWidth() / gn0Var.f26817c.getWidth();
                    gn0Var.f26819f.postScale(width, width);
                    gn0Var.d.setLocalMatrix(gn0Var.f26819f);
                    gn0Var.f26818e.setAlpha((int) (gn0Var.f26821r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gn0Var.f26818e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = gn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (gn0Var.f26821r * 255.0f));
                    canvas.save();
                    float f15 = gn0Var.H;
                    float f16 = gn0Var.G;
                    float f17 = gn0Var.f26821r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + gn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(gn0Var.J, gn0Var.K), Math.max(gn0Var.J, gn0Var.K), 0.75f), 1.0f, gn0Var.f26821r);
                    canvas.scale(lerp, lerp, ((gn0Var.E.getBounds().width() / 2.0f) * gn0Var.J) + (-gn0Var.H) + gn0Var.E.getBounds().left, ((gn0Var.E.getBounds().height() / 2.0f) * gn0Var.K) + (-gn0Var.I) + gn0Var.E.getBounds().top);
                    ch.d dVar = gn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (gn0Var.f26821r * 255.0f));
                        gn0Var.F.draw(canvas);
                    }
                    gn0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                oz0 oz0Var = (oz0) this.f933b;
                mz0 mz0Var = oz0Var.f29605c;
                if (mz0Var != null && mz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = oz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = oz0Var.f29605c.getEditField().getX() + oz0Var.f29605c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = oz0Var.T;
                        oz0Var.f29602a0 = x10 + emojiSpan2.lastDrawX;
                        oz0Var.U = emojiSpan2.lastDrawY;
                    } else if (oz0Var.V != null && oz0Var.W != null) {
                        oz0Var.f29602a0 = oz0Var.f29605c.getEditField().getX() + oz0Var.f29605c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (oz0Var.f29612s && !oz0Var.v && (arrayList = oz0Var.f29613w) != null && !arrayList.isEmpty() && !oz0Var.f29614x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g6 g6Var = oz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = g6Var.d(f7, false);
                org.telegram.ui.Components.g6 g6Var2 = oz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = g6Var2.d(f10, false);
                float d11 = oz0Var.f29604b0.d(oz0Var.f29602a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    oz0Var.d.setVisibility(8);
                }
                oz0Var.M.rewind();
                float left = oz0Var.f29608e.getLeft();
                int left2 = oz0Var.f29608e.getLeft();
                ArrayList arrayList2 = oz0Var.f29613w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.q.D(44.0f, size, left2);
                org.telegram.ui.Components.g6 g6Var3 = oz0Var.f29607d0;
                float f18 = g6Var3.f26599c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = g6Var3.d(f19, z11);
                }
                float d12 = oz0Var.f29606c0.d((left + D) / 2.0f, z11);
                mz0 mz0Var2 = oz0Var.f29605c;
                if (mz0Var2 != null && mz0Var2.getEditField() != null) {
                    int i11 = oz0Var.h;
                    if (i11 == 0) {
                        oz0Var.d.setTranslationY(((-oz0Var.f29605c.getEditField().getHeight()) - oz0Var.f29605c.getEditField().getScrollY()) + oz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        oz0Var.d.setTranslationY(((-oz0Var.getMeasuredHeight()) - oz0Var.f29605c.getEditField().getScrollY()) + oz0Var.U + AndroidUtilities.dp(20.0f) + oz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((oz0Var.f29602a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - oz0Var.f29608e.getLeft(), 0.0f);
                if (oz0Var.f29608e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    oz0Var.f29608e.setPadding(max, 0, 0, 0);
                    oz0Var.f29608e.scrollBy(oz0Var.f29608e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                oz0Var.f29608e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - oz0Var.f29608e.getLeft(), 0.0f)) - max);
                float translationX = oz0Var.f29608e.getTranslationX() + (d12 - f21) + oz0Var.f29608e.getPaddingLeft();
                float translationY = oz0Var.f29608e.getTranslationY() + oz0Var.f29608e.getTop() + oz0Var.f29608e.getPaddingTop();
                if (oz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(oz0Var.f29608e.getTranslationX() + d12 + f21 + oz0Var.f29608e.getPaddingLeft(), oz0Var.getWidth() - oz0Var.d.getPaddingRight());
                float translationY2 = oz0Var.f29608e.getTranslationY() + oz0Var.f29608e.getBottom();
                if (oz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = oz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    oz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    oz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    oz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    oz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    oz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    oz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    oz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    oz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    oz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    oz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    oz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    oz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    oz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    oz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                oz0Var.M.close();
                if (oz0Var.O == null) {
                    Paint paint = new Paint(1);
                    oz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    oz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    oz0Var.O.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Be, oz0Var.f29603b));
                }
                if (d < f11) {
                    oz0Var.N.rewind();
                    if (oz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    oz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(oz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, oz0Var.getWidth(), oz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(oz0Var.M, oz0Var.O);
                canvas.save();
                canvas.clipPath(oz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = oz0Var.f29607d0.f26599c;
                float f33 = oz0Var.f29606c0.f26599c;
                float f34 = f32 / 2.0f;
                float translationX2 = oz0Var.f29608e.getTranslationX() + (f33 - f34) + oz0Var.f29608e.getPaddingLeft();
                float paddingTop = oz0Var.f29608e.getPaddingTop() + oz0Var.f29608e.getTop();
                float min3 = Math.min(oz0Var.f29608e.getTranslationX() + f33 + f34 + oz0Var.f29608e.getPaddingLeft(), oz0Var.getWidth() - oz0Var.d.getPaddingRight());
                float bottom = oz0Var.f29608e.getBottom();
                org.telegram.ui.Components.g6 g6Var4 = oz0Var.R;
                if (oz0Var.f29608e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = g6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.i6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.i6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.i6.F4.draw(canvas);
                }
                org.telegram.ui.Components.g6 g6Var5 = oz0Var.S;
                if (oz0Var.f29608e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = g6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.i6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.i6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.i6.E4.draw(canvas);
                }
                canvas.restore();
                if (oz0Var.P.f26599c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                qg.u2 u2Var = (qg.u2) this.f933b;
                if (u2Var.f46582y > 0.0f && u2Var.f46579s != null) {
                    u2Var.v.reset();
                    float width2 = getWidth() / u2Var.f46577n.getWidth();
                    u2Var.v.postScale(width2, width2);
                    u2Var.f46578r.setLocalMatrix(u2Var.v);
                    u2Var.f46579s.setAlpha((int) (u2Var.f46582y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.f46579s);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f932a) {
            case 18:
                hf hfVar = (hf) this.f933b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hfVar.isShowing()) {
                    hfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f932a) {
            case 17:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((gn0) this.f933b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 28:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.u2) this.f933b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f932a) {
            case 2:
                if (((di.i) this.f933b).f8388e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((xl) this.f933b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f932a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xl xlVar = (xl) this.f933b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - xlVar.B0);
                if (!xlVar.G) {
                    z10 = super.drawChild(canvas, view, j3);
                }
                canvas.restore();
                return z10;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f932a) {
            case 12:
                lv lvVar = (lv) this.f933b;
                ha1 ha1Var = lvVar.f28599c;
                fv fvVar = lvVar.f28598b;
                super.onDetachedFromWindow();
                try {
                    gh0 gh0Var = gh0.f26700p0;
                    if (gh0Var.P) {
                        if (fvVar.getVisibility() != 0) {
                        }
                        if (ha1Var.f() && !gh0Var.P) {
                            if (lv.S == lvVar) {
                                lv.S = null;
                            }
                            ha1Var.b();
                            return;
                        }
                        return;
                    }
                    if (fvVar.getParent() != null) {
                        removeView(fvVar);
                        fvVar.stopLoading();
                        fvVar.loadUrl("about:blank");
                        fvVar.destroy();
                    }
                    if (ha1Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        p71 p71Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f932a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f933b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f933b = hVar;
                    hVar.f31959k = false;
                    hVar.f31961m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f933b).f31955f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f933b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.ga) this.f933b).f26642e.a(canvas);
                return;
            case 9:
                xl xlVar = (xl) this.f933b;
                xlVar.f32907d0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, xlVar.f30172a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - xlVar.B0, xlVar.f32907d0);
                return;
            case 19:
                fw0 fw0Var = (fw0) this.f933b;
                Drawable drawable = fw0Var.d;
                drawable.setBounds(0, fw0Var.f26502f - fw0.p(fw0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((p71) this.f933b).f29752b;
                drawable2.setBounds(0, (int) ((p71Var.h - p71.p(p71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 26:
                qg.y1 y1Var = (qg.y1) this.f933b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                mw0 mw0Var = y1Var.f46638v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f46642z0 != null) {
                    canvas.save();
                    float e7 = y1Var.f46637u0.e(y1Var.f46636t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, mw0Var.f28963a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = y1Var.f46641y0.e(y1Var.f46640x0);
                    if (!y1Var.f46640x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f46639w0);
                            float max = Math.max(mw0Var.f28963a / bitmap.getWidth(), mw0Var.f28964b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = y1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = y1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + cropState.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                qg.p2 p2Var = (qg.p2) this.f933b;
                ImageReceiver imageReceiver = p2Var.f46515x0;
                mw0 mw0Var2 = p2Var.f46513v0;
                if (p2Var.f46514w0 != null) {
                    canvas.save();
                    float e11 = p2Var.f46512u0.e(p2Var.f46511t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, mw0Var2.f28963a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) mw0Var2.f28963a, (int) mw0Var2.f28964b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        rg.o0 o0Var;
        rg.o0 o0Var2;
        switch (this.f932a) {
            case 29:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.p0 p0Var = (rg.p0) this.f933b;
                if (p0Var.h && (o0Var2 = p0Var.f47382e) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.d) != null) {
                    charSequence = o0Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f932a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((xl) this.f933b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                fw0 fw0Var = (fw0) this.f933b;
                if (motionEvent.getAction() == 0 && fw0Var.f26502f != 0 && motionEvent.getY() < fw0Var.f26502f) {
                    fw0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                p71 p71Var = (p71) this.f933b;
                if (motionEvent.getAction() == 0 && p71Var.h != 0 && motionEvent.getY() < p71Var.h) {
                    p71Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i14;
        int i15;
        FrameLayout frameLayout;
        float f7;
        boolean z11;
        int i16;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x10;
        switch (this.f932a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w30 w30Var = (w30) this.f933b;
                w30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (w30Var.getMeasuredWidth() / 2.0f));
                w30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (w30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ga) this.f933b).f26642e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f933b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i14 = getMeasuredWidth() / 2;
                    int i19 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i19;
                    i15 = i19 - AndroidUtilities.dp(17.0f);
                    dp = i14;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i20 = measuredWidth / 2;
                    int dp3 = measuredWidth + i20 + AndroidUtilities.dp(17.0f);
                    dp = i20 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i14 = dp3;
                    i15 = measuredHeight2;
                }
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24057q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24057q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24057q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24057q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24057q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f24057q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24057q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24046k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24046k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24046k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24046k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24059r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24059r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24059r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24059r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                q30 q30Var = (q30) this.f933b;
                f0 f0Var = q30Var.f30013b;
                int[] iArr = q30Var.G;
                f0Var.getLocationOnScreen(iArr);
                q30Var.N = iArr[0];
                q30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                gn0 gn0Var = (gn0) this.f933b;
                f0 f0Var2 = gn0Var.f26822s;
                sw0 sw0Var = gn0Var.v;
                Drawable drawable = gn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (gn0Var.f26824x != null) {
                        float f10 = gn0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = gn0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!gn0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                gn0Var.f26825y.setPivotX(AndroidUtilities.dp(6.0f));
                                gn0Var.f26824x.setX(Math.min(sw0Var.getWidth() - gn0Var.f26824x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - sw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                gn0Var.f26825y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                gn0Var.f26824x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - gn0Var.f26824x.getMeasuredWidth()) - sw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((gn0Var.f26824x.getX() + gn0Var.f26824x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (gn0Var.f26824x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            gn0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (gn0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (gn0Var.f26824x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            gn0Var.f26825y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            gn0Var.f26824x.setY(((f14 - AndroidUtilities.dp(f7)) - gn0Var.f26824x.getMeasuredHeight()) - sw0Var.getY());
                            z12 = true;
                        } else {
                            gn0Var.f26825y.setPivotY(AndroidUtilities.dp(6.0f));
                            gn0Var.f26824x.setY(Math.min((f0Var2.getHeight() - gn0Var.f26824x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - sw0Var.getY());
                        }
                        p80 p80Var = gn0Var.f26823w;
                        p80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20365c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                fw0.o((fw0) this.f933b);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int dp2;
        int dp3;
        switch (this.f932a) {
            case 7:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 9:
                super.onMeasure(i10, i11);
                ul ulVar = ((xl) this.f933b).F;
                if (ulVar != null) {
                    ulVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                lv lvVar = (lv) this.f933b;
                int min = (int) Math.min(lvVar.H / (lvVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (lvVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                zy zyVar = (zy) this.f933b;
                View view = (View) zyVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - zyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - zyVar.F.f24397b1, 1073741824));
                return;
            case 14:
                a00 a00Var = ((vz) this.f933b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (bi.A(8.0f, a00Var.D0.getMeasuredHeight() - a00Var.f24397b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                fw0 fw0Var = (fw0) this.f933b;
                w0 w0Var = fw0Var.f26499b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.q.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.q.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (w0Var.getPaddingTop() != i13) {
                    fw0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    fw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 21:
                oz0 oz0Var = (oz0) this.f933b;
                int i15 = oz0Var.f29610n;
                if (oz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = oz0Var.f29610n;
                if (oz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.a5) this.f933b).T.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f932a) {
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                gn0 gn0Var = (gn0) this.f933b;
                gh.d.c(gn0Var.h, gn0Var.f26822s);
                ViewGroup viewGroup = gn0Var.f26825y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f932a) {
            case 19:
                if (!((fw0) this.f933b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((p71) this.f933b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                ((pi1) this.f933b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f932a) {
            case 4:
                super.onViewAdded(view);
                bringChildToFront((jh.f) this.f933b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f932a) {
            case 25:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.s8) this.f933b).e0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f932a) {
            case 16:
                qm0 qm0Var = (qm0) this.f933b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(qm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(qm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, qm0Var.f30192b1.getMeasuredWidth(), qm0Var.f30192b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
            case 18:
            default:
                super.requestLayout();
                return;
            case 19:
                if (!((fw0) this.f933b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((xy0) this.f933b).f33032g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f932a) {
            case 1:
                ci.lc lcVar = (ci.lc) this.f933b;
                if (getTranslationY() != f7 && lcVar.f5467c1 != null) {
                    super.setTranslationY(f7);
                    lcVar.f5467c1.y();
                    return;
                }
                return;
            case 22:
                super.setTranslationY(f7);
                p71.o((p71) this.f933b);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f932a) {
            case 15:
                super.setVisibility(i10);
                ((q30) this.f933b).d.setVisibility(i10);
                return;
            case 21:
                oz0 oz0Var = (oz0) this.f933b;
                if (getVisibility() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i10);
                if (!z10) {
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (oz0Var.f29608e != null) {
                        for (int i11 = 0; i11 < oz0Var.f29608e.getChildCount(); i11++) {
                            if (z11) {
                                nz0 nz0Var = (nz0) oz0Var.f29608e.getChildAt(i11);
                                Drawable drawable = nz0Var.f29309b;
                                if (drawable instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable).a(nz0Var);
                                }
                                nz0Var.f29310c = true;
                            } else {
                                nz0 nz0Var2 = (nz0) oz0Var.f29608e.getChildAt(i11);
                                Drawable drawable2 = nz0Var2.f29309b;
                                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable2).o(nz0Var2);
                                }
                                nz0Var2.f29310c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public f0(Object obj, Context context, int i10) {
        super(context);
        this.f932a = i10;
        this.f933b = obj;
    }

    public f0(Context context) {
        super(context);
        this.f932a = 4;
        View view = new View(context);
        this.f933b = view;
        addView(view, w7.x5.g());
    }

    public f0(qg.p2 p2Var, Context context) {
        super(context);
        this.f932a = 27;
        this.f933b = p2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f932a = 11;
        this.f933b = new gp[2];
        int i10 = 0;
        while (true) {
            gp[] gpVarArr = (gp[]) this.f933b;
            if (i10 < gpVarArr.length) {
                gpVarArr[i10] = new gp(context, e6Var);
                addView(((gp[]) this.f933b)[i10], w7.x5.e(-1, -1, 119));
                i10++;
            } else {
                gpVarArr[0].setVisibility(0);
                ((gp[]) this.f933b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.y1 y1Var, Context context) {
        super(context);
        this.f932a = 26;
        this.f933b = y1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f932a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20905j5;
        setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.m1(0.06f, dVar.x0(i10))));
        LinearLayout e7 = bi.e(context, 1);
        addView(e7, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.f933b = r6Var;
        r6Var.b(0.6f, 450L, hs.h);
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTextColor(dVar.x0(i10));
        r6Var.setScaleProperty(0.7f);
        r6Var.setGravity(17);
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setAllowCancel(true);
        e7.addView(r6Var, w7.x5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.x0(i10));
        textView.setGravity(17);
        e7.addView(textView, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(Context context, w30 w30Var) {
        super(context);
        this.f932a = 6;
        this.f933b = w30Var;
    }
}
