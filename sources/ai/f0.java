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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zl;
import org.telegram.ui.qi1;
public final class f0 extends FrameLayout {
    public final int f930a;
    public Object f931b;

    public f0(Context context, int i10) {
        super(context);
        this.f930a = i10;
    }

    public ip a() {
        return ((ip[]) this.f931b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f930a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.f) this.f931b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(ah.c cVar, dh.e eVar) {
        jh.f fVar = (jh.f) this.f931b;
        fVar.b(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        ip[] ipVarArr = (ip[]) this.f931b;
        ip ipVar = ipVarArr[0];
        ip ipVar2 = ipVarArr[1];
        ipVarArr[0] = ipVar2;
        ipVarArr[1] = ipVar;
        ipVar2.f27257n = true;
        ipVar2.setVisibility(0);
        ipVarArr[0].setScaleX(0.8f);
        ipVarArr[0].setScaleY(0.8f);
        ipVarArr[0].setAlpha(0.0f);
        ipVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = ipVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        js jsVar = js.h;
        am.t(translationY, jsVar, 320L);
        ip ipVar3 = ipVarArr[1];
        ipVar3.f27257n = false;
        ipVar3.setVisibility(0);
        ipVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(jsVar).setDuration(320L).withEndAction(new tg(ipVar3, 28)).start();
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
        switch (this.f930a) {
            case 16:
                float dp3 = AndroidUtilities.dp(2.0f);
                float u10 = com.google.android.gms.internal.vision.e2.u(dp3, 2.0f, getWidth(), 2.0f);
                rl0 rl0Var = (rl0) this.f931b;
                float left = ((rl0Var.f30181e.getLeft() - rl0Var.d.getLeft()) * rl0Var.f30187x.f16087e) + rl0Var.d.getLeft();
                rl0Var.f30186w.set(left, dp3, u10 + left, getHeight() - dp3);
                canvas.drawRoundRect(rl0Var.f30186w, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), rl0Var.v);
                super.dispatchDraw(canvas);
                return;
            case 18:
                mn0 mn0Var = (mn0) this.f931b;
                if (mn0Var.f28610r > 0.0f && mn0Var.f28607e != null) {
                    mn0Var.f28608f.reset();
                    float width = getWidth() / mn0Var.f28606c.getWidth();
                    mn0Var.f28608f.postScale(width, width);
                    mn0Var.d.setLocalMatrix(mn0Var.f28608f);
                    mn0Var.f28607e.setAlpha((int) (mn0Var.f28610r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mn0Var.f28607e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = mn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (mn0Var.f28610r * 255.0f));
                    canvas.save();
                    float f15 = mn0Var.H;
                    float f16 = mn0Var.G;
                    float f17 = mn0Var.f28610r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + mn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(mn0Var.J, mn0Var.K), Math.max(mn0Var.J, mn0Var.K), 0.75f), 1.0f, mn0Var.f28610r);
                    canvas.scale(lerp, lerp, ((mn0Var.E.getBounds().width() / 2.0f) * mn0Var.J) + (-mn0Var.H) + mn0Var.E.getBounds().left, ((mn0Var.E.getBounds().height() / 2.0f) * mn0Var.K) + (-mn0Var.I) + mn0Var.E.getBounds().top);
                    ch.d dVar = mn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (mn0Var.f28610r * 255.0f));
                        mn0Var.F.draw(canvas);
                    }
                    mn0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                uz0 uz0Var = (uz0) this.f931b;
                sz0 sz0Var = uz0Var.f31297c;
                if (sz0Var != null && sz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = uz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = uz0Var.f31297c.getEditField().getX() + uz0Var.f31297c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = uz0Var.T;
                        uz0Var.f31294a0 = x10 + emojiSpan2.lastDrawX;
                        uz0Var.U = emojiSpan2.lastDrawY;
                    } else if (uz0Var.V != null && uz0Var.W != null) {
                        uz0Var.f31294a0 = uz0Var.f31297c.getEditField().getX() + uz0Var.f31297c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (uz0Var.f31304s && !uz0Var.v && (arrayList = uz0Var.f31305w) != null && !arrayList.isEmpty() && !uz0Var.f31306x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g6 g6Var = uz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = g6Var.d(f7, false);
                org.telegram.ui.Components.g6 g6Var2 = uz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = g6Var2.d(f10, false);
                float d11 = uz0Var.f31296b0.d(uz0Var.f31294a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    uz0Var.d.setVisibility(8);
                }
                uz0Var.M.rewind();
                float left2 = uz0Var.f31300e.getLeft();
                int left3 = uz0Var.f31300e.getLeft();
                ArrayList arrayList2 = uz0Var.f31305w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.v0.D(44.0f, size, left3);
                org.telegram.ui.Components.g6 g6Var3 = uz0Var.f31299d0;
                float f18 = g6Var3.f26303c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left2;
                if (f19 > 0.0f) {
                    f18 = g6Var3.d(f19, z11);
                }
                float d12 = uz0Var.f31298c0.d((left2 + D) / 2.0f, z11);
                sz0 sz0Var2 = uz0Var.f31297c;
                if (sz0Var2 != null && sz0Var2.getEditField() != null) {
                    int i11 = uz0Var.h;
                    if (i11 == 0) {
                        uz0Var.d.setTranslationY(((-uz0Var.f31297c.getEditField().getHeight()) - uz0Var.f31297c.getEditField().getScrollY()) + uz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        uz0Var.d.setTranslationY(((-uz0Var.getMeasuredHeight()) - uz0Var.f31297c.getEditField().getScrollY()) + uz0Var.U + AndroidUtilities.dp(20.0f) + uz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((uz0Var.f31294a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - uz0Var.f31300e.getLeft(), 0.0f);
                if (uz0Var.f31300e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    uz0Var.f31300e.setPadding(max, 0, 0, 0);
                    uz0Var.f31300e.scrollBy(uz0Var.f31300e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                uz0Var.f31300e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - uz0Var.f31300e.getLeft(), 0.0f)) - max);
                float translationX = uz0Var.f31300e.getTranslationX() + (d12 - f21) + uz0Var.f31300e.getPaddingLeft();
                float translationY = uz0Var.f31300e.getTranslationY() + uz0Var.f31300e.getTop() + uz0Var.f31300e.getPaddingTop();
                if (uz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(uz0Var.f31300e.getTranslationX() + d12 + f21 + uz0Var.f31300e.getPaddingLeft(), uz0Var.getWidth() - uz0Var.d.getPaddingRight());
                float translationY2 = uz0Var.f31300e.getTranslationY() + uz0Var.f31300e.getBottom();
                if (uz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = uz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    uz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    uz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    uz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    uz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    uz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    uz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    uz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    uz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    uz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    uz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    uz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    uz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    uz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    uz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                uz0Var.M.close();
                if (uz0Var.O == null) {
                    Paint paint = new Paint(1);
                    uz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    uz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    uz0Var.O.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Be, uz0Var.f31295b));
                }
                if (d < f11) {
                    uz0Var.N.rewind();
                    if (uz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    uz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(uz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, uz0Var.getWidth(), uz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(uz0Var.M, uz0Var.O);
                canvas.save();
                canvas.clipPath(uz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = uz0Var.f31299d0.f26303c;
                float f33 = uz0Var.f31298c0.f26303c;
                float f34 = f32 / 2.0f;
                float translationX2 = uz0Var.f31300e.getTranslationX() + (f33 - f34) + uz0Var.f31300e.getPaddingLeft();
                float paddingTop = uz0Var.f31300e.getPaddingTop() + uz0Var.f31300e.getTop();
                float min3 = Math.min(uz0Var.f31300e.getTranslationX() + f33 + f34 + uz0Var.f31300e.getPaddingLeft(), uz0Var.getWidth() - uz0Var.d.getPaddingRight());
                float bottom = uz0Var.f31300e.getBottom();
                org.telegram.ui.Components.g6 g6Var4 = uz0Var.R;
                if (uz0Var.f31300e.canScrollHorizontally(-1)) {
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
                org.telegram.ui.Components.g6 g6Var5 = uz0Var.S;
                if (uz0Var.f31300e.canScrollHorizontally(1)) {
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
                if (uz0Var.P.f26303c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                qg.u2 u2Var = (qg.u2) this.f931b;
                if (u2Var.f46519y > 0.0f && u2Var.f46516s != null) {
                    u2Var.v.reset();
                    float width2 = getWidth() / u2Var.f46514n.getWidth();
                    u2Var.v.postScale(width2, width2);
                    u2Var.f46515r.setLocalMatrix(u2Var.v);
                    u2Var.f46516s.setAlpha((int) (u2Var.f46519y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.f46516s);
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
        switch (this.f930a) {
            case 19:
                kf kfVar = (kf) this.f931b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && kfVar.isShowing()) {
                    kfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f930a) {
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((mn0) this.f931b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 29:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.u2) this.f931b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f930a) {
            case 2:
                if (((di.i) this.f931b).f8385e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((zl) this.f931b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f930a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                zl zlVar = (zl) this.f931b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - zlVar.B0);
                if (!zlVar.G) {
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
        switch (this.f930a) {
            case 12:
                ov ovVar = (ov) this.f931b;
                ma1 ma1Var = ovVar.f29297c;
                iv ivVar = ovVar.f29296b;
                super.onDetachedFromWindow();
                try {
                    jh0 jh0Var = jh0.f27503p0;
                    if (jh0Var.P) {
                        if (ivVar.getVisibility() != 0) {
                        }
                        if (ma1Var.f() && !jh0Var.P) {
                            if (ov.S == ovVar) {
                                ov.S = null;
                            }
                            ma1Var.b();
                            return;
                        }
                        return;
                    }
                    if (ivVar.getParent() != null) {
                        removeView(ivVar);
                        ivVar.stopLoading();
                        ivVar.loadUrl("about:blank");
                        ivVar.destroy();
                    }
                    if (ma1Var.f()) {
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
        u71 u71Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f930a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f931b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f931b = hVar;
                    hVar.f31706k = false;
                    hVar.f31708m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f931b).f31702f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f931b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.fa) this.f931b).f25987e.a(canvas);
                return;
            case 9:
                zl zlVar = (zl) this.f931b;
                zlVar.f33401d0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20630h5, zlVar.f30573a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - zlVar.B0, zlVar.f33401d0);
                return;
            case 20:
                lw0 lw0Var = (lw0) this.f931b;
                Drawable drawable = lw0Var.d;
                drawable.setBounds(0, lw0Var.f28305f - lw0.p(lw0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 23:
                Drawable drawable2 = ((u71) this.f931b).f31097b;
                drawable2.setBounds(0, (int) ((u71Var.h - u71.p(u71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 27:
                qg.y1 y1Var = (qg.y1) this.f931b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                sw0 sw0Var = y1Var.f46575v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f46579z0 != null) {
                    canvas.save();
                    float e7 = y1Var.f46574u0.e(y1Var.f46573t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, sw0Var.f30696a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.v0.A(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = y1Var.f46578y0.e(y1Var.f46577x0);
                    if (!y1Var.f46577x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f46576w0);
                            float max = Math.max(sw0Var.f30696a / bitmap.getWidth(), sw0Var.f30697b / bitmap.getHeight());
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
            case 28:
                qg.p2 p2Var = (qg.p2) this.f931b;
                ImageReceiver imageReceiver = p2Var.f46452x0;
                sw0 sw0Var2 = p2Var.f46450v0;
                if (p2Var.f46451w0 != null) {
                    canvas.save();
                    float e11 = p2Var.f46449u0.e(p2Var.f46448t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, sw0Var2.f30696a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.v0.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) sw0Var2.f30696a, (int) sw0Var2.f30697b);
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
        switch (this.f930a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((zl) this.f931b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                lw0 lw0Var = (lw0) this.f931b;
                if (motionEvent.getAction() == 0 && lw0Var.f28305f != 0 && motionEvent.getY() < lw0Var.f28305f) {
                    lw0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                u71 u71Var = (u71) this.f931b;
                if (motionEvent.getAction() == 0 && u71Var.h != 0 && motionEvent.getY() < u71Var.h) {
                    u71Var.dismiss();
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
        switch (this.f930a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                z30 z30Var = (z30) this.f931b;
                z30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (z30Var.getMeasuredWidth() / 2.0f));
                z30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (z30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.fa) this.f931b).f25987e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f931b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f23834q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f23834q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f23834q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23834q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f23834q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f23834q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23834q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23823k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f23823k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23823k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f23823k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f23836r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f23836r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23836r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f23836r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                t30 t30Var = (t30) this.f931b;
                f0 f0Var = t30Var.f30743b;
                int[] iArr = t30Var.G;
                f0Var.getLocationOnScreen(iArr);
                t30Var.N = iArr[0];
                t30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                mn0 mn0Var = (mn0) this.f931b;
                f0 f0Var2 = mn0Var.f28611s;
                yw0 yw0Var = mn0Var.v;
                Drawable drawable = mn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (mn0Var.f28613x != null) {
                        float f10 = mn0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = mn0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!mn0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                mn0Var.f28614y.setPivotX(AndroidUtilities.dp(6.0f));
                                mn0Var.f28613x.setX(Math.min(yw0Var.getWidth() - mn0Var.f28613x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - yw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                mn0Var.f28614y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                mn0Var.f28613x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - mn0Var.f28613x.getMeasuredWidth()) - yw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((mn0Var.f28613x.getX() + mn0Var.f28613x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (mn0Var.f28613x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            mn0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (mn0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (mn0Var.f28613x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            mn0Var.f28614y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            mn0Var.f28613x.setY(((f14 - AndroidUtilities.dp(f7)) - mn0Var.f28613x.getMeasuredHeight()) - yw0Var.getY());
                            z12 = true;
                        } else {
                            mn0Var.f28614y.setPivotY(AndroidUtilities.dp(6.0f));
                            mn0Var.f28613x.setY(Math.min((f0Var2.getHeight() - mn0Var.f28613x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - yw0Var.getY());
                        }
                        s80 s80Var = mn0Var.f28612w;
                        s80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20132c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                lw0.o((lw0) this.f931b);
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
        switch (this.f930a) {
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
                wl wlVar = ((zl) this.f931b).F;
                if (wlVar != null) {
                    wlVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                ov ovVar = (ov) this.f931b;
                int min = (int) Math.min(ovVar.H / (ovVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (ovVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                cz czVar = (cz) this.f931b;
                View view = (View) czVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - czVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - czVar.F.f25076b1, 1073741824));
                return;
            case 14:
                d00 d00Var = ((yz) this.f931b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (am.A(8.0f, d00Var.D0.getMeasuredHeight() - d00Var.f25076b1, 3) * 1.7f), 1073741824));
                return;
            case 20:
                lw0 lw0Var = (lw0) this.f931b;
                w0 w0Var = lw0Var.f28302b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.v0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.v0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    lw0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    lw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 22:
                uz0 uz0Var = (uz0) this.f931b;
                int i15 = uz0Var.f31302n;
                if (uz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = uz0Var.f31302n;
                if (uz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 25:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((org.telegram.ui.Wallet.c5) this.f931b).T.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f930a) {
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                mn0 mn0Var = (mn0) this.f931b;
                gh.d.c(mn0Var.h, mn0Var.f28611s);
                ViewGroup viewGroup = mn0Var.f28614y;
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
        switch (this.f930a) {
            case 20:
                if (!((lw0) this.f931b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 21:
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                if (!((u71) this.f931b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                ((qi1) this.f931b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f930a) {
            case 4:
                super.onViewAdded(view);
                bringChildToFront((jh.f) this.f931b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f930a) {
            case 26:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((org.telegram.ui.Wallet.u8) this.f931b).e0(true);
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
        switch (this.f930a) {
            case 17:
                wm0 wm0Var = (wm0) this.f931b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(wm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, wm0Var.f32443b1.getMeasuredWidth(), wm0Var.f32443b1.getMeasuredHeight());
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
                if (!((lw0) this.f931b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((dz0) this.f931b).f25487g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f930a) {
            case 1:
                ci.lc lcVar = (ci.lc) this.f931b;
                if (getTranslationY() != f7 && lcVar.f5465c1 != null) {
                    super.setTranslationY(f7);
                    lcVar.f5465c1.y();
                    return;
                }
                return;
            case 23:
                super.setTranslationY(f7);
                u71.o((u71) this.f931b);
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
        switch (this.f930a) {
            case 15:
                super.setVisibility(i10);
                ((t30) this.f931b).d.setVisibility(i10);
                return;
            case 22:
                uz0 uz0Var = (uz0) this.f931b;
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
                    if (uz0Var.f31300e != null) {
                        for (int i11 = 0; i11 < uz0Var.f31300e.getChildCount(); i11++) {
                            if (z11) {
                                tz0 tz0Var = (tz0) uz0Var.f31300e.getChildAt(i11);
                                Drawable drawable = tz0Var.f31004b;
                                if (drawable instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable).a(tz0Var);
                                }
                                tz0Var.f31005c = true;
                            } else {
                                tz0 tz0Var2 = (tz0) uz0Var.f31300e.getChildAt(i11);
                                Drawable drawable2 = tz0Var2.f31004b;
                                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                                    ((org.telegram.ui.Components.s5) drawable2).o(tz0Var2);
                                }
                                tz0Var2.f31005c = false;
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
        this.f930a = i10;
        this.f931b = obj;
    }

    public f0(Context context) {
        super(context);
        this.f930a = 4;
        View view = new View(context);
        this.f931b = view;
        addView(view, w7.w5.g());
    }

    public f0(qg.p2 p2Var, Context context) {
        super(context);
        this.f930a = 28;
        this.f931b = p2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f930a = 11;
        this.f931b = new ip[2];
        int i10 = 0;
        while (true) {
            ip[] ipVarArr = (ip[]) this.f931b;
            if (i10 < ipVarArr.length) {
                ipVarArr[i10] = new ip(context, c6Var);
                addView(((ip[]) this.f931b)[i10], w7.w5.e(-1, -1, 119));
                i10++;
            } else {
                ipVarArr[0].setVisibility(0);
                ((ip[]) this.f931b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.y1 y1Var, Context context) {
        super(context);
        this.f930a = 27;
        this.f931b = y1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f930a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20667j5;
        setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.06f, dVar.x0(i10))));
        LinearLayout e7 = am.e(context, 1);
        addView(e7, w7.w5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.f931b = r6Var;
        r6Var.b(0.6f, 450L, js.h);
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTextColor(dVar.x0(i10));
        r6Var.setScaleProperty(0.7f);
        r6Var.setGravity(17);
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setAllowCancel(true);
        e7.addView(r6Var, w7.w5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.x0(i10));
        textView.setGravity(17);
        e7.addView(textView, w7.w5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(Context context, z30 z30Var) {
        super(context);
        this.f930a = 6;
        this.f931b = z30Var;
    }
}
