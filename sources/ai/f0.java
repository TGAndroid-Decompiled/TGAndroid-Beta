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
import org.telegram.messenger.ai;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.ni1;
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
        gpVar2.f26793n = true;
        gpVar2.setVisibility(0);
        gpVarArr[0].setScaleX(0.8f);
        gpVarArr[0].setScaleY(0.8f);
        gpVarArr[0].setAlpha(0.0f);
        gpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = gpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        is isVar = is.h;
        ai.t(translationY, isVar, 320L);
        gp gpVar3 = gpVarArr[1];
        gpVar3.f26793n = false;
        gpVar3.setVisibility(0);
        gpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(isVar).setDuration(320L).withEndAction(new rg(gpVar3, 28)).start();
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
                in0 in0Var = (in0) this.f933b;
                if (in0Var.f27404r > 0.0f && in0Var.f27401e != null) {
                    in0Var.f27402f.reset();
                    float width = getWidth() / in0Var.f27400c.getWidth();
                    in0Var.f27402f.postScale(width, width);
                    in0Var.d.setLocalMatrix(in0Var.f27402f);
                    in0Var.f27401e.setAlpha((int) (in0Var.f27404r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), in0Var.f27401e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = in0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (in0Var.f27404r * 255.0f));
                    canvas.save();
                    float f15 = in0Var.H;
                    float f16 = in0Var.G;
                    float f17 = in0Var.f27404r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + in0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(in0Var.J, in0Var.K), Math.max(in0Var.J, in0Var.K), 0.75f), 1.0f, in0Var.f27404r);
                    canvas.scale(lerp, lerp, ((in0Var.E.getBounds().width() / 2.0f) * in0Var.J) + (-in0Var.H) + in0Var.E.getBounds().left, ((in0Var.E.getBounds().height() / 2.0f) * in0Var.K) + (-in0Var.I) + in0Var.E.getBounds().top);
                    ch.d dVar = in0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (in0Var.f27404r * 255.0f));
                        in0Var.F.draw(canvas);
                    }
                    in0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                qz0 qz0Var = (qz0) this.f933b;
                oz0 oz0Var = qz0Var.f30272c;
                if (oz0Var != null && oz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = qz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = qz0Var.f30272c.getEditField().getX() + qz0Var.f30272c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = qz0Var.T;
                        qz0Var.f30269a0 = x10 + emojiSpan2.lastDrawX;
                        qz0Var.U = emojiSpan2.lastDrawY;
                    } else if (qz0Var.V != null && qz0Var.W != null) {
                        qz0Var.f30269a0 = qz0Var.f30272c.getEditField().getX() + qz0Var.f30272c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (qz0Var.f30279s && !qz0Var.v && (arrayList = qz0Var.f30280w) != null && !arrayList.isEmpty() && !qz0Var.f30281x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g6 g6Var = qz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = g6Var.d(f7, false);
                org.telegram.ui.Components.g6 g6Var2 = qz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = g6Var2.d(f10, false);
                float d11 = qz0Var.f30271b0.d(qz0Var.f30269a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    qz0Var.d.setVisibility(8);
                }
                qz0Var.M.rewind();
                float left = qz0Var.f30275e.getLeft();
                int left2 = qz0Var.f30275e.getLeft();
                ArrayList arrayList2 = qz0Var.f30280w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.q.D(44.0f, size, left2);
                org.telegram.ui.Components.g6 g6Var3 = qz0Var.f30274d0;
                float f18 = g6Var3.f26613c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = g6Var3.d(f19, z11);
                }
                float d12 = qz0Var.f30273c0.d((left + D) / 2.0f, z11);
                oz0 oz0Var2 = qz0Var.f30272c;
                if (oz0Var2 != null && oz0Var2.getEditField() != null) {
                    int i11 = qz0Var.h;
                    if (i11 == 0) {
                        qz0Var.d.setTranslationY(((-qz0Var.f30272c.getEditField().getHeight()) - qz0Var.f30272c.getEditField().getScrollY()) + qz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        qz0Var.d.setTranslationY(((-qz0Var.getMeasuredHeight()) - qz0Var.f30272c.getEditField().getScrollY()) + qz0Var.U + AndroidUtilities.dp(20.0f) + qz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((qz0Var.f30269a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - qz0Var.f30275e.getLeft(), 0.0f);
                if (qz0Var.f30275e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    qz0Var.f30275e.setPadding(max, 0, 0, 0);
                    qz0Var.f30275e.scrollBy(qz0Var.f30275e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                qz0Var.f30275e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - qz0Var.f30275e.getLeft(), 0.0f)) - max);
                float translationX = qz0Var.f30275e.getTranslationX() + (d12 - f21) + qz0Var.f30275e.getPaddingLeft();
                float translationY = qz0Var.f30275e.getTranslationY() + qz0Var.f30275e.getTop() + qz0Var.f30275e.getPaddingTop();
                if (qz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(qz0Var.f30275e.getTranslationX() + d12 + f21 + qz0Var.f30275e.getPaddingLeft(), qz0Var.getWidth() - qz0Var.d.getPaddingRight());
                float translationY2 = qz0Var.f30275e.getTranslationY() + qz0Var.f30275e.getBottom();
                if (qz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = qz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    qz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    qz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    qz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    qz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    qz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    qz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    qz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    qz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    qz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    qz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    qz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    qz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    qz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    qz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                qz0Var.M.close();
                if (qz0Var.O == null) {
                    Paint paint = new Paint(1);
                    qz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    qz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    qz0Var.O.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Be, qz0Var.f30270b));
                }
                if (d < f11) {
                    qz0Var.N.rewind();
                    if (qz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    qz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(qz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, qz0Var.getWidth(), qz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(qz0Var.M, qz0Var.O);
                canvas.save();
                canvas.clipPath(qz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = qz0Var.f30274d0.f26613c;
                float f33 = qz0Var.f30273c0.f26613c;
                float f34 = f32 / 2.0f;
                float translationX2 = qz0Var.f30275e.getTranslationX() + (f33 - f34) + qz0Var.f30275e.getPaddingLeft();
                float paddingTop = qz0Var.f30275e.getPaddingTop() + qz0Var.f30275e.getTop();
                float min3 = Math.min(qz0Var.f30275e.getTranslationX() + f33 + f34 + qz0Var.f30275e.getPaddingLeft(), qz0Var.getWidth() - qz0Var.d.getPaddingRight());
                float bottom = qz0Var.f30275e.getBottom();
                org.telegram.ui.Components.g6 g6Var4 = qz0Var.R;
                if (qz0Var.f30275e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = g6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.h6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.h6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.h6.F4.draw(canvas);
                }
                org.telegram.ui.Components.g6 g6Var5 = qz0Var.S;
                if (qz0Var.f30275e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = g6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.h6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.h6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.h6.E4.draw(canvas);
                }
                canvas.restore();
                if (qz0Var.P.f26613c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                qg.t2 t2Var = (qg.t2) this.f933b;
                if (t2Var.f46651y > 0.0f && t2Var.f46648s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f46646n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f46647r.setLocalMatrix(t2Var.v);
                    t2Var.f46648s.setAlpha((int) (t2Var.f46651y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f46648s);
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
                    ((in0) this.f933b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 28:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.t2) this.f933b).onBackPressed();
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
                if (((di.i) this.f933b).f8387e0) {
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
                mv mvVar = (mv) this.f933b;
                ia1 ia1Var = mvVar.f28865c;
                gv gvVar = mvVar.f28864b;
                super.onDetachedFromWindow();
                try {
                    ih0 ih0Var = ih0.f27325p0;
                    if (ih0Var.P) {
                        if (gvVar.getVisibility() != 0) {
                        }
                        if (ia1Var.f() && !ih0Var.P) {
                            if (mv.S == mvVar) {
                                mv.S = null;
                            }
                            ia1Var.b();
                            return;
                        }
                        return;
                    }
                    if (gvVar.getParent() != null) {
                        removeView(gvVar);
                        gvVar.stopLoading();
                        gvVar.loadUrl("about:blank");
                        gvVar.destroy();
                    }
                    if (ia1Var.f()) {
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
        r71 r71Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f932a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f933b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f933b = hVar;
                    hVar.f32005k = false;
                    hVar.f32007m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f933b).f32001f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f933b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.fa) this.f933b).f26310e.a(canvas);
                return;
            case 9:
                xl xlVar = (xl) this.f933b;
                xlVar.f32951d0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, xlVar.f30160a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - xlVar.B0, xlVar.f32951d0);
                return;
            case 19:
                hw0 hw0Var = (hw0) this.f933b;
                Drawable drawable = hw0Var.d;
                drawable.setBounds(0, hw0Var.f27089f - hw0.p(hw0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((r71) this.f933b).f30380b;
                drawable2.setBounds(0, (int) ((r71Var.h - r71.p(r71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 26:
                qg.x1 x1Var = (qg.x1) this.f933b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                ow0 ow0Var = x1Var.f46706v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f46710z0 != null) {
                    canvas.save();
                    float e7 = x1Var.f46705u0.e(x1Var.f46704t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, ow0Var.f29541a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = x1Var.f46709y0.e(x1Var.f46708x0);
                    if (!x1Var.f46708x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f46707w0);
                            float max = Math.max(ow0Var.f29541a / bitmap.getWidth(), ow0Var.f29542b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.G0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = x1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = x1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = x1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(x1Var.G0.cropRotate + cropState.transformRotation);
                                if (x1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
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
                qg.o2 o2Var = (qg.o2) this.f933b;
                ImageReceiver imageReceiver = o2Var.f46583x0;
                ow0 ow0Var2 = o2Var.f46581v0;
                if (o2Var.f46582w0 != null) {
                    canvas.save();
                    float e11 = o2Var.f46580u0.e(o2Var.f46579t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, ow0Var2.f29541a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) ow0Var2.f29541a, (int) ow0Var2.f29542b);
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
                if (p0Var.h && (o0Var2 = p0Var.f47472e) != null) {
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
                hw0 hw0Var = (hw0) this.f933b;
                if (motionEvent.getAction() == 0 && hw0Var.f27089f != 0 && motionEvent.getY() < hw0Var.f27089f) {
                    hw0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                r71 r71Var = (r71) this.f933b;
                if (motionEvent.getAction() == 0 && r71Var.h != 0 && motionEvent.getY() < r71Var.h) {
                    r71Var.dismiss();
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
                x30 x30Var = (x30) this.f933b;
                x30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (x30Var.getMeasuredWidth() / 2.0f));
                x30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (x30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.fa) this.f933b).f26310e.f(i17, i18, i17 + dp2, dp2 + i18);
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24049q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24049q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24049q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24049q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24049q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f24049q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24049q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24038k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24038k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24038k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24038k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24051r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24051r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24051r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24051r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                r30 r30Var = (r30) this.f933b;
                f0 f0Var = r30Var.f30321b;
                int[] iArr = r30Var.G;
                f0Var.getLocationOnScreen(iArr);
                r30Var.N = iArr[0];
                r30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                in0 in0Var = (in0) this.f933b;
                f0 f0Var2 = in0Var.f27405s;
                uw0 uw0Var = in0Var.v;
                Drawable drawable = in0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (in0Var.f27407x != null) {
                        float f10 = in0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = in0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!in0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                in0Var.f27408y.setPivotX(AndroidUtilities.dp(6.0f));
                                in0Var.f27407x.setX(Math.min(uw0Var.getWidth() - in0Var.f27407x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - uw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                in0Var.f27408y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                in0Var.f27407x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - in0Var.f27407x.getMeasuredWidth()) - uw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((in0Var.f27407x.getX() + in0Var.f27407x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (in0Var.f27407x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            in0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (in0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (in0Var.f27407x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            in0Var.f27408y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            in0Var.f27407x.setY(((f14 - AndroidUtilities.dp(f7)) - in0Var.f27407x.getMeasuredHeight()) - uw0Var.getY());
                            z12 = true;
                        } else {
                            in0Var.f27408y.setPivotY(AndroidUtilities.dp(6.0f));
                            in0Var.f27407x.setY(Math.min((f0Var2.getHeight() - in0Var.f27407x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - uw0Var.getY());
                        }
                        q80 q80Var = in0Var.f27406w;
                        q80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20359c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                hw0.o((hw0) this.f933b);
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
                mv mvVar = (mv) this.f933b;
                int min = (int) Math.min(mvVar.H / (mvVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (mvVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                az azVar = (az) this.f933b;
                View view = (View) azVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - azVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - azVar.F.f24658b1, 1073741824));
                return;
            case 14:
                b00 b00Var = ((wz) this.f933b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (ai.A(8.0f, b00Var.D0.getMeasuredHeight() - b00Var.f24658b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                hw0 hw0Var = (hw0) this.f933b;
                w0 w0Var = hw0Var.f27086b;
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
                    hw0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    hw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 21:
                qz0 qz0Var = (qz0) this.f933b;
                int i15 = qz0Var.f30277n;
                if (qz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = qz0Var.f30277n;
                if (qz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.c5) this.f933b).T.c(AndroidUtilities.dp(4.0f))));
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
                in0 in0Var = (in0) this.f933b;
                gh.d.c(in0Var.h, in0Var.f27405s);
                ViewGroup viewGroup = in0Var.f27408y;
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
                if (!((hw0) this.f933b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((r71) this.f933b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                ((ni1) this.f933b).T.onTouchEvent(motionEvent);
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
                    ((org.telegram.ui.Wallet.u8) this.f933b).e0(true);
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
                sm0 sm0Var = (sm0) this.f933b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(sm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, sm0Var.f30783b1.getMeasuredWidth(), sm0Var.f30783b1.getMeasuredHeight());
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
                if (!((hw0) this.f933b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((zy0) this.f933b).f33698g0) {
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
                if (getTranslationY() != f7 && lcVar.f5466c1 != null) {
                    super.setTranslationY(f7);
                    lcVar.f5466c1.y();
                    return;
                }
                return;
            case 22:
                super.setTranslationY(f7);
                r71.o((r71) this.f933b);
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
                ((r30) this.f933b).d.setVisibility(i10);
                return;
            case 21:
                qz0 qz0Var = (qz0) this.f933b;
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
                    if (qz0Var.f30275e != null) {
                        for (int i11 = 0; i11 < qz0Var.f30275e.getChildCount(); i11++) {
                            if (z11) {
                                pz0 pz0Var = (pz0) qz0Var.f30275e.getChildAt(i11);
                                Drawable drawable = pz0Var.f29873b;
                                if (drawable instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable).a(pz0Var);
                                }
                                pz0Var.f29874c = true;
                            } else {
                                pz0 pz0Var2 = (pz0) qz0Var.f30275e.getChildAt(i11);
                                Drawable drawable2 = pz0Var2.f29873b;
                                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable2).o(pz0Var2);
                                }
                                pz0Var2.f29874c = false;
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

    public f0(qg.o2 o2Var, Context context) {
        super(context);
        this.f932a = 27;
        this.f933b = o2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f932a = 11;
        this.f933b = new gp[2];
        int i10 = 0;
        while (true) {
            gp[] gpVarArr = (gp[]) this.f933b;
            if (i10 < gpVarArr.length) {
                gpVarArr[i10] = new gp(context, d6Var);
                addView(((gp[]) this.f933b)[i10], w7.x5.e(-1, -1, 119));
                i10++;
            } else {
                gpVarArr[0].setVisibility(0);
                ((gp[]) this.f933b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.x1 x1Var, Context context) {
        super(context);
        this.f932a = 26;
        this.f933b = x1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f932a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20894j5;
        setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.06f, dVar.x0(i10))));
        LinearLayout e7 = ai.e(context, 1);
        addView(e7, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.f933b = r6Var;
        r6Var.b(0.6f, 450L, is.h);
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

    public f0(Context context, x30 x30Var) {
        super(context);
        this.f932a = 6;
        this.f933b = x30Var;
    }
}
