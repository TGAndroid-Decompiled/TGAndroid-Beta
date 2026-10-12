package ah;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Wallet.r8;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.wi1;
import rg.q2;
import rg.v2;
import rg.z1;
import w7.a6;
public final class x extends FrameLayout {
    public final int f894a;
    public Object f895b;

    public x(Context context, int i10) {
        super(context);
        this.f894a = i10;
    }

    public dp a() {
        return ((dp[]) this.f895b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f894a) {
            case 6:
                super.addView(view, i10, i11);
                ((ih.f) this.f895b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(bh.b bVar, eh.e eVar) {
        kh.f fVar = (kh.f) this.f895b;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        dp[] dpVarArr = (dp[]) this.f895b;
        dp dpVar = dpVarArr[0];
        dp dpVar2 = dpVarArr[1];
        dpVarArr[0] = dpVar2;
        dpVarArr[1] = dpVar;
        dpVar2.f24465n = true;
        dpVar2.setVisibility(0);
        dpVarArr[0].setScaleX(0.8f);
        dpVarArr[0].setScaleY(0.8f);
        dpVarArr[0].setAlpha(0.0f);
        dpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = dpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        es esVar = es.h;
        yh.s(translationY, esVar, 320L);
        dp dpVar3 = dpVarArr[1];
        dpVar3.f24465n = false;
        dpVar3.setVisibility(0);
        dpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(esVar).setDuration(320L).withEndAction(new qg(dpVar3, 28)).start();
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
        switch (this.f894a) {
            case 18:
                cn0 cn0Var = (cn0) this.f895b;
                if (cn0Var.f24145r > 0.0f && cn0Var.e != null) {
                    cn0Var.f24143f.reset();
                    float width = getWidth() / cn0Var.f24142c.getWidth();
                    cn0Var.f24143f.postScale(width, width);
                    cn0Var.d.setLocalMatrix(cn0Var.f24143f);
                    cn0Var.e.setAlpha((int) (cn0Var.f24145r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), cn0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = cn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (cn0Var.f24145r * 255.0f));
                    canvas.save();
                    float f15 = cn0Var.H;
                    float f16 = cn0Var.G;
                    float f17 = cn0Var.f24145r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + cn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(cn0Var.J, cn0Var.K), Math.max(cn0Var.J, cn0Var.K), 0.75f), 1.0f, cn0Var.f24145r);
                    canvas.scale(lerp, lerp, ((cn0Var.E.getBounds().width() / 2.0f) * cn0Var.J) + (-cn0Var.H) + cn0Var.E.getBounds().left, ((cn0Var.E.getBounds().height() / 2.0f) * cn0Var.K) + (-cn0Var.I) + cn0Var.E.getBounds().top);
                    dh.d dVar = cn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (cn0Var.f24145r * 255.0f));
                        cn0Var.F.draw(canvas);
                    }
                    cn0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                kz0 kz0Var = (kz0) this.f895b;
                iz0 iz0Var = kz0Var.f26831c;
                if (iz0Var != null && iz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = kz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = kz0Var.f26831c.getEditField().getX() + kz0Var.f26831c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = kz0Var.T;
                        kz0Var.f26828a0 = x10 + emojiSpan2.lastDrawX;
                        kz0Var.U = emojiSpan2.lastDrawY;
                    } else if (kz0Var.V != null && kz0Var.W != null) {
                        kz0Var.f26828a0 = kz0Var.f26831c.getEditField().getX() + kz0Var.f26831c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (kz0Var.f26837s && !kz0Var.v && (arrayList = kz0Var.f26838w) != null && !arrayList.isEmpty() && !kz0Var.f26839x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g6 g6Var = kz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = g6Var.d(f7, false);
                g6 g6Var2 = kz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = g6Var2.d(f10, false);
                float d11 = kz0Var.f26830b0.d(kz0Var.f26828a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    kz0Var.d.setVisibility(8);
                }
                kz0Var.M.rewind();
                float left = kz0Var.e.getLeft();
                int left2 = kz0Var.e.getLeft();
                ArrayList arrayList2 = kz0Var.f26838w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float y3 = yh.y(44.0f, size, left2);
                g6 g6Var3 = kz0Var.f26833d0;
                float f18 = g6Var3.f25190c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = y3 - left;
                if (f19 > 0.0f) {
                    f18 = g6Var3.d(f19, z11);
                }
                float d12 = kz0Var.f26832c0.d((left + y3) / 2.0f, z11);
                iz0 iz0Var2 = kz0Var.f26831c;
                if (iz0Var2 != null && iz0Var2.getEditField() != null) {
                    int i11 = kz0Var.h;
                    if (i11 == 0) {
                        kz0Var.d.setTranslationY(((-kz0Var.f26831c.getEditField().getHeight()) - kz0Var.f26831c.getEditField().getScrollY()) + kz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        kz0Var.d.setTranslationY(((-kz0Var.getMeasuredHeight()) - kz0Var.f26831c.getEditField().getScrollY()) + kz0Var.U + AndroidUtilities.dp(20.0f) + kz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((kz0Var.f26828a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f);
                if (kz0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    kz0Var.e.setPadding(max, 0, 0, 0);
                    kz0Var.e.scrollBy(kz0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                kz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = kz0Var.e.getTranslationX() + (d12 - f21) + kz0Var.e.getPaddingLeft();
                float translationY = kz0Var.e.getTranslationY() + kz0Var.e.getTop() + kz0Var.e.getPaddingTop();
                if (kz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(kz0Var.e.getTranslationX() + d12 + f21 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float translationY2 = kz0Var.e.getTranslationY() + kz0Var.e.getBottom();
                if (kz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = kz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    kz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    kz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    kz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    kz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    kz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    kz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    kz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    kz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    kz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    kz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    kz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    kz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    kz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    kz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                kz0Var.M.close();
                if (kz0Var.O == null) {
                    Paint paint = new Paint(1);
                    kz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    kz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    kz0Var.O.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Be, kz0Var.f26829b));
                }
                if (d < f11) {
                    kz0Var.N.rewind();
                    if (kz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    kz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(kz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, kz0Var.getWidth(), kz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(kz0Var.M, kz0Var.O);
                canvas.save();
                canvas.clipPath(kz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = kz0Var.f26833d0.f25190c;
                float f33 = kz0Var.f26832c0.f25190c;
                float f34 = f32 / 2.0f;
                float translationX2 = kz0Var.e.getTranslationX() + (f33 - f34) + kz0Var.e.getPaddingLeft();
                float paddingTop = kz0Var.e.getPaddingTop() + kz0Var.e.getTop();
                float min3 = Math.min(kz0Var.e.getTranslationX() + f33 + f34 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float bottom = kz0Var.e.getBottom();
                g6 g6Var4 = kz0Var.R;
                if (kz0Var.e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = g6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.g6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.g6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.g6.F4.draw(canvas);
                }
                g6 g6Var5 = kz0Var.S;
                if (kz0Var.e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = g6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.g6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.g6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.g6.E4.draw(canvas);
                }
                canvas.restore();
                if (kz0Var.P.f25190c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                v2 v2Var = (v2) this.f895b;
                if (v2Var.f44590y > 0.0f && v2Var.f44587s != null) {
                    v2Var.v.reset();
                    float width2 = getWidth() / v2Var.f44585n.getWidth();
                    v2Var.v.postScale(width2, width2);
                    v2Var.f44586r.setLocalMatrix(v2Var.v);
                    v2Var.f44587s.setAlpha((int) (v2Var.f44590y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v2Var.f44587s);
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
        switch (this.f894a) {
            case 19:
                gf gfVar = (gf) this.f895b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gfVar.isShowing()) {
                    gfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f894a) {
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((cn0) this.f895b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 29:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((v2) this.f895b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f894a) {
            case 3:
                if (((ei.i) this.f895b).f8800e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((ul) this.f895b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f894a) {
            case 10:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ul ulVar = (ul) this.f895b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - ulVar.B0);
                if (!ulVar.G) {
                    z10 = super.drawChild(canvas, view, j10);
                }
                canvas.restore();
                return z10;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f894a) {
            case 13:
                hv hvVar = (hv) this.f895b;
                ca1 ca1Var = hvVar.f25752c;
                bv bvVar = hvVar.f25751b;
                super.onDetachedFromWindow();
                try {
                    fh0 fh0Var = fh0.f25035p0;
                    if (fh0Var.P) {
                        if (bvVar.getVisibility() != 0) {
                        }
                        if (ca1Var.f() && !fh0Var.P) {
                            if (hv.S == hvVar) {
                                hv.S = null;
                            }
                            ca1Var.b();
                            return;
                        }
                        return;
                    }
                    if (bvVar.getParent() != null) {
                        removeView(bvVar);
                        bvVar.stopLoading();
                        bvVar.loadUrl("about:blank");
                        bvVar.destroy();
                    }
                    if (ca1Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m71 m71Var;
        x xVar;
        MediaController.CropState cropState;
        switch (this.f894a) {
            case 8:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f895b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f895b = hVar;
                    hVar.f30200k = false;
                    hVar.f30202m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f895b).f30196f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f895b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 9:
                ((fa) this.f895b).e.a(canvas);
                return;
            case 10:
                ul ulVar = (ul) this.f895b;
                ulVar.f29709d0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, ulVar.f27670a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ulVar.B0, ulVar.f29709d0);
                return;
            case 20:
                bw0 bw0Var = (bw0) this.f895b;
                Drawable drawable = bw0Var.d;
                drawable.setBounds(0, bw0Var.f23868f - bw0.o(bw0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 23:
                Drawable drawable2 = ((m71) this.f895b).f27229b;
                drawable2.setBounds(0, (int) ((m71Var.h - m71.o(m71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 27:
                z1 z1Var = (z1) this.f895b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                iw0 iw0Var = z1Var.f44639v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.f44643z0 != null) {
                    canvas.save();
                    float e = z1Var.f44638u0.e(z1Var.f44637t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, iw0Var.f26116a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.B(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = z1Var.f44642y0.e(z1Var.f44641x0);
                    if (!z1Var.f44641x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(xVar.getWidth() / 2.0f, xVar.getHeight() / 2.0f);
                            canvas.rotate(z1Var.f44640w0);
                            float max = Math.max(iw0Var.f26116a / bitmap.getWidth(), iw0Var.f26117b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (z1Var.G0 != null) {
                                canvas.rotate(-z1Var.getOrientation());
                                int contentWidth = z1Var.getContentWidth();
                                int contentHeight = z1Var.getContentHeight();
                                if (((z1Var.getOrientation() + z1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = z1Var.getContentHeight();
                                    contentHeight = z1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = z1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = z1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = z1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(z1Var.G0.cropRotate + cropState.transformRotation);
                                if (z1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(z1Var.getOrientation());
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
            case 28:
                q2 q2Var = (q2) this.f895b;
                ImageReceiver imageReceiver = q2Var.f44523x0;
                iw0 iw0Var2 = q2Var.f44521v0;
                if (q2Var.f44522w0 != null) {
                    canvas.save();
                    float e10 = q2Var.f44520u0.e(q2Var.f44519t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, iw0Var2.f26116a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.B(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) iw0Var2.f26116a, (int) iw0Var2.f26117b);
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f894a) {
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((ul) this.f895b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                bw0 bw0Var = (bw0) this.f895b;
                if (motionEvent.getAction() == 0 && bw0Var.f23868f != 0 && motionEvent.getY() < bw0Var.f23868f) {
                    bw0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                m71 m71Var = (m71) this.f895b;
                if (motionEvent.getAction() == 0 && m71Var.h != 0 && motionEvent.getY() < m71Var.h) {
                    m71Var.dismiss();
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
        switch (this.f894a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                a0 a0Var = (a0) this.f895b;
                if (a0Var.K && z10) {
                    a0Var.f642w.setTranslationY(-a0Var.f637c.getMeasuredHeight());
                    int measuredHeight3 = a0Var.f637c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.f644y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    a0Var.f644y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                s30 s30Var = (s30) this.f895b;
                s30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (s30Var.getMeasuredWidth() / 2.0f));
                s30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (s30Var.getMeasuredWidth() / 2.0f));
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((fa) this.f895b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f895b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f23054q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f23054q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f23054q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23054q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f23054q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f23054q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23054q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23043k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f23043k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23043k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f23043k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f23056r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f23056r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23056r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f23056r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                m30 m30Var = (m30) this.f895b;
                x xVar = m30Var.f27179b;
                int[] iArr = m30Var.G;
                xVar.getLocationOnScreen(iArr);
                m30Var.N = iArr[0];
                m30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                cn0 cn0Var = (cn0) this.f895b;
                x xVar2 = cn0Var.f24146s;
                ow0 ow0Var = cn0Var.v;
                Drawable drawable = cn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (cn0Var.f24148x != null) {
                        float f10 = cn0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = cn0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!cn0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                cn0Var.f24149y.setPivotX(AndroidUtilities.dp(6.0f));
                                cn0Var.f24148x.setX(Math.min(ow0Var.getWidth() - cn0Var.f24148x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - ow0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                cn0Var.f24149y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                cn0Var.f24148x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - cn0Var.f24148x.getMeasuredWidth()) - ow0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((cn0Var.f24148x.getX() + cn0Var.f24148x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (cn0Var.f24148x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            cn0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (cn0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (cn0Var.f24148x.getMeasuredHeight() + f16 > xVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            cn0Var.f24149y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            cn0Var.f24148x.setY(((f14 - AndroidUtilities.dp(f7)) - cn0Var.f24148x.getMeasuredHeight()) - ow0Var.getY());
                            z12 = true;
                        } else {
                            cn0Var.f24149y.setPivotY(AndroidUtilities.dp(6.0f));
                            cn0Var.f24148x.setY(Math.min((xVar2.getHeight() - cn0Var.f24148x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - ow0Var.getY());
                        }
                        m80 m80Var = cn0Var.f24147w;
                        m80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f19540c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                bw0.n((bw0) this.f895b);
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
        switch (this.f894a) {
            case 8:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 10:
                super.onMeasure(i10, i11);
                rl rlVar = ((ul) this.f895b).F;
                if (rlVar != null) {
                    rlVar.a();
                    return;
                }
                return;
            case 13:
                int size = View.MeasureSpec.getSize(i10);
                hv hvVar = (hv) this.f895b;
                int min = (int) Math.min(hvVar.H / (hvVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (hvVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 14:
                vy vyVar = (vy) this.f895b;
                View view = (View) vyVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - vyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - vyVar.F.f31010b1, 1073741824));
                return;
            case 15:
                wz wzVar = ((rz) this.f895b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (yh.B(8.0f, wzVar.D0.getMeasuredHeight() - wzVar.f31010b1, 3) * 1.7f), 1073741824));
                return;
            case 20:
                bw0 bw0Var = (bw0) this.f895b;
                bi.o0 o0Var = bw0Var.f23866b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int y3 = yh.y(54.0f, LocationController.getLocationsCount(), yh.c(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (y3 < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (y3 < size2) {
                        i13 -= size2 - y3;
                    }
                }
                if (o0Var.getPaddingTop() != i13) {
                    bw0Var.h = true;
                    o0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    bw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(y3, size2), 1073741824));
                return;
            case 22:
                kz0 kz0Var = (kz0) this.f895b;
                int i15 = kz0Var.f26835n;
                if (kz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = kz0Var.f26835n;
                if (kz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 25:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((z4) this.f895b).T.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f894a) {
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                cn0 cn0Var = (cn0) this.f895b;
                hh.d.c(cn0Var.h, cn0Var.f24146s);
                ViewGroup viewGroup = cn0Var.f24149y;
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
        switch (this.f894a) {
            case 20:
                if (!((bw0) this.f895b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 21:
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                if (!((m71) this.f895b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                ((wi1) this.f895b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f894a) {
            case 5:
                super.onViewAdded(view);
                bringChildToFront((kh.f) this.f895b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f894a) {
            case 26:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r8) this.f895b).e0(true);
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
        switch (this.f894a) {
            case 17:
                mm0 mm0Var = (mm0) this.f895b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, mm0Var.f27415b1.getMeasuredWidth(), mm0Var.f27415b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 18:
            case 19:
            default:
                super.requestLayout();
                return;
            case 20:
                if (!((bw0) this.f895b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((ty0) this.f895b).f29510g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f894a) {
            case 2:
                kc kcVar = (kc) this.f895b;
                if (getTranslationY() != f7 && kcVar.f7243c1 != null) {
                    super.setTranslationY(f7);
                    kcVar.f7243c1.y();
                    return;
                }
                return;
            case 23:
                super.setTranslationY(f7);
                m71.n((m71) this.f895b);
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
        switch (this.f894a) {
            case 16:
                super.setVisibility(i10);
                ((m30) this.f895b).d.setVisibility(i10);
                return;
            case 22:
                kz0 kz0Var = (kz0) this.f895b;
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
                    if (kz0Var.e != null) {
                        for (int i11 = 0; i11 < kz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                jz0 jz0Var = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable = jz0Var.f26521b;
                                if (drawable instanceof s5) {
                                    ((s5) drawable).a(jz0Var);
                                }
                                jz0Var.f26522c = true;
                            } else {
                                jz0 jz0Var2 = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable2 = jz0Var2.f26521b;
                                if (drawable2 instanceof s5) {
                                    ((s5) drawable2).o(jz0Var2);
                                }
                                jz0Var2.f26522c = false;
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

    public x(Object obj, Context context, int i10) {
        super(context);
        this.f894a = i10;
        this.f895b = obj;
    }

    public x(Context context) {
        super(context);
        this.f894a = 5;
        View view = new View(context);
        this.f895b = view;
        addView(view, a6.g());
    }

    public x(q2 q2Var, Context context) {
        super(context);
        this.f894a = 28;
        this.f895b = q2Var;
        setWillNotDraw(false);
    }

    public x(Context context, c6 c6Var) {
        super(context);
        this.f894a = 12;
        this.f895b = new dp[2];
        int i10 = 0;
        while (true) {
            dp[] dpVarArr = (dp[]) this.f895b;
            if (i10 < dpVarArr.length) {
                dpVarArr[i10] = new dp(context, c6Var);
                addView(((dp[]) this.f895b)[i10], a6.e(-1, -1, 119));
                i10++;
            } else {
                dpVarArr[0].setVisibility(0);
                ((dp[]) this.f895b)[1].setVisibility(8);
                return;
            }
        }
    }

    public x(z1 z1Var, Context context) {
        super(context);
        this.f894a = 27;
        this.f895b = z1Var;
        setWillNotDraw(false);
    }

    public x(Context context, String str, bi.b bVar) {
        super(context);
        this.f894a = 1;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f20007j5;
        setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.06f, bVar.F0(i10))));
        LinearLayout e = yh.e(context, 1);
        addView(e, a6.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        s6 s6Var = new s6(context, false, true, true);
        this.f895b = s6Var;
        s6Var.b(0.6f, 450L, es.h);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        s6Var.setTextColor(bVar.F0(i10));
        s6Var.setScaleProperty(0.7f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setAllowCancel(true);
        e.addView(s6Var, a6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.F0(i10));
        textView.setGravity(17);
        e.addView(textView, a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public x(Context context, s30 s30Var) {
        super(context);
        this.f894a = 7;
        this.f895b = s30Var;
    }
}
