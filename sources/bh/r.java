package bh;

import android.content.Context;
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
import bi.dd;
import bi.g5;
import bi.h7;
import bi.r1;
import fi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ma1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.ih1;
public final class r extends FrameLayout {
    public final int f4112a;
    public Object f4113b;

    public r(Context context, int i10) {
        super(context);
        this.f4112a = i10;
    }

    public cp a() {
        return ((cp[]) this.f4113b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f4112a) {
            case 8:
                super.addView(view, i10, i11);
                ((jh.f) this.f4113b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(ch.b bVar, fh.e eVar) {
        lh.f fVar = (lh.f) this.f4113b;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        cp[] cpVarArr = (cp[]) this.f4113b;
        cp cpVar = cpVarArr[0];
        cp cpVar2 = cpVarArr[1];
        cpVarArr[0] = cpVar2;
        cpVarArr[1] = cpVar;
        cpVar2.f27231n = true;
        cpVar2.setVisibility(0);
        cpVarArr[0].setScaleX(0.8f);
        cpVarArr[0].setScaleY(0.8f);
        cpVarArr[0].setAlpha(0.0f);
        cpVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = cpVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        ds dsVar = ds.h;
        vh.q(translationY, dsVar, 320L);
        cp cpVar3 = cpVarArr[1];
        cpVar3.f27231n = false;
        cpVar3.setVisibility(0);
        cpVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(dsVar).setDuration(320L).withEndAction(new pg(cpVar3, 29)).start();
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
        switch (this.f4112a) {
            case 21:
                hn0 hn0Var = (hn0) this.f4113b;
                if (hn0Var.f29025r > 0.0f && hn0Var.e != null) {
                    hn0Var.f29023f.reset();
                    float width = getWidth() / hn0Var.f29022c.getWidth();
                    hn0Var.f29023f.postScale(width, width);
                    hn0Var.d.setLocalMatrix(hn0Var.f29023f);
                    hn0Var.e.setAlpha((int) (hn0Var.f29025r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), hn0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = hn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (hn0Var.f29025r * 255.0f));
                    canvas.save();
                    float f15 = hn0Var.H;
                    float f16 = hn0Var.G;
                    float f17 = hn0Var.f29025r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + hn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(hn0Var.J, hn0Var.K), Math.max(hn0Var.J, hn0Var.K), 0.75f), 1.0f, hn0Var.f29025r);
                    canvas.scale(lerp, lerp, ((hn0Var.E.getBounds().width() / 2.0f) * hn0Var.J) + (-hn0Var.H) + hn0Var.E.getBounds().left, ((hn0Var.E.getBounds().height() / 2.0f) * hn0Var.K) + (-hn0Var.I) + hn0Var.E.getBounds().top);
                    eh.d dVar = hn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (hn0Var.f29025r * 255.0f));
                        hn0Var.F.draw(canvas);
                    }
                    hn0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                tz0 tz0Var = (tz0) this.f4113b;
                rz0 rz0Var = tz0Var.f33176c;
                if (rz0Var != null && rz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = tz0Var.V;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x9 = tz0Var.f33176c.getEditField().getX() + tz0Var.f33176c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = tz0Var.V;
                        tz0Var.f33177c0 = x9 + emojiSpan2.lastDrawX;
                        tz0Var.W = emojiSpan2.lastDrawY;
                    } else if (tz0Var.f33173a0 != null && tz0Var.f33175b0 != null) {
                        tz0Var.f33177c0 = tz0Var.f33176c.getEditField().getX() + tz0Var.f33176c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (tz0Var.f33184s && !tz0Var.v && (arrayList = tz0Var.f33185w) != null && !arrayList.isEmpty() && !tz0Var.f33186x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6 h6Var = tz0Var.R;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = h6Var.d(f7, false);
                h6 h6Var2 = tz0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = h6Var2.d(f10, false);
                float d11 = tz0Var.f33178d0.d(tz0Var.f33177c0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    tz0Var.d.setVisibility(8);
                }
                tz0Var.O.rewind();
                float left = tz0Var.e.getLeft();
                int left2 = tz0Var.e.getLeft();
                ArrayList arrayList2 = tz0Var.f33185w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float b10 = vh.b(44.0f, size, left2);
                h6 h6Var3 = tz0Var.f33181f0;
                float f18 = h6Var3.f28811c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = b10 - left;
                if (f19 > 0.0f) {
                    f18 = h6Var3.d(f19, z11);
                }
                float d12 = tz0Var.f33179e0.d((left + b10) / 2.0f, z11);
                rz0 rz0Var2 = tz0Var.f33176c;
                if (rz0Var2 != null && rz0Var2.getEditField() != null) {
                    int i11 = tz0Var.h;
                    if (i11 == 0) {
                        tz0Var.d.setTranslationY(((-tz0Var.f33176c.getEditField().getHeight()) - tz0Var.f33176c.getEditField().getScrollY()) + tz0Var.W + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        tz0Var.d.setTranslationY(((-tz0Var.getMeasuredHeight()) - tz0Var.f33176c.getEditField().getScrollY()) + tz0Var.W + AndroidUtilities.dp(20.0f) + tz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((tz0Var.f33177c0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - tz0Var.e.getLeft(), 0.0f);
                if (tz0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    tz0Var.e.setPadding(max, 0, 0, 0);
                    tz0Var.e.scrollBy(tz0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                tz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - tz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = tz0Var.e.getTranslationX() + (d12 - f21) + tz0Var.e.getPaddingLeft();
                float translationY = tz0Var.e.getTranslationY() + tz0Var.e.getTop() + tz0Var.e.getPaddingTop();
                if (tz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(tz0Var.e.getTranslationX() + d12 + f21 + tz0Var.e.getPaddingLeft(), tz0Var.getWidth() - tz0Var.d.getPaddingRight());
                float translationY2 = tz0Var.e.getTranslationY() + tz0Var.e.getBottom();
                if (tz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = tz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    tz0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    tz0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    tz0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    tz0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    tz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    tz0Var.O.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    tz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    tz0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    tz0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    tz0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    tz0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    tz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    tz0Var.O.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    tz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                tz0Var.O.close();
                if (tz0Var.Q == null) {
                    Paint paint = new Paint(1);
                    tz0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    tz0Var.Q.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    tz0Var.Q.setColor(y6.w0(y6.Be, tz0Var.f33174b));
                }
                if (d < f11) {
                    tz0Var.P.rewind();
                    if (tz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    tz0Var.P.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(tz0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, tz0Var.getWidth(), tz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(tz0Var.O, tz0Var.Q);
                canvas.save();
                canvas.clipPath(tz0Var.O);
                super.dispatchDraw(canvas);
                float f32 = tz0Var.f33181f0.f28811c;
                float f33 = tz0Var.f33179e0.f28811c;
                float f34 = f32 / 2.0f;
                float translationX2 = tz0Var.e.getTranslationX() + (f33 - f34) + tz0Var.e.getPaddingLeft();
                float paddingTop = tz0Var.e.getPaddingTop() + tz0Var.e.getTop();
                float min3 = Math.min(tz0Var.e.getTranslationX() + f33 + f34 + tz0Var.e.getPaddingLeft(), tz0Var.getWidth() - tz0Var.d.getPaddingRight());
                float bottom = tz0Var.e.getBottom();
                h6 h6Var4 = tz0Var.T;
                if (tz0Var.e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = h6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    y6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    y6.F4.setAlpha((int) (d17 * f12));
                    y6.F4.draw(canvas);
                }
                h6 h6Var5 = tz0Var.U;
                if (tz0Var.e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = h6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    y6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    y6.E4.setAlpha((int) (d18 * f12));
                    y6.E4.draw(canvas);
                }
                canvas.restore();
                if (tz0Var.R.f28811c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f4112a) {
            case 22:
                ef efVar = (ef) this.f4113b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && efVar.isShowing()) {
                    efVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f4112a) {
            case 21:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((hn0) this.f4113b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tu0[] tu0VarArr;
        tu0 tu0Var;
        switch (this.f4112a) {
            case 2:
                if (((dd) this.f4113b).f4531t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((gi.h) this.f4113b).f12520s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((sl) this.f4113b).f32622y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                ta0 ta0Var = (ta0) this.f4113b;
                sa0 sa0Var = ta0Var.R;
                if (sa0Var != null && (tu0Var = (tu0VarArr = sa0Var.m0)[0]) != null && tu0Var.h.getFastScroll() != null && tu0VarArr[0].h.getFastScroll().f32640n) {
                    return ta0Var.R.W(motionEvent);
                }
                sa0 sa0Var2 = ta0Var.R;
                if (sa0Var2 != null && sa0Var2.N(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                lw0 lw0Var = (lw0) this.f4113b;
                if (motionEvent.getActionMasked() == 0 && (lw0Var.f30309d0 || motionEvent.getY() >= lw0Var.f30304a0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: bh.r.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4112a) {
            case 15:
                dv dvVar = (dv) this.f4113b;
                ma1 ma1Var = dvVar.f27608c;
                xu xuVar = dvVar.f27607b;
                super.onDetachedFromWindow();
                try {
                    ch0 ch0Var = ch0.f27159p0;
                    if (ch0Var.P) {
                        if (xuVar.getVisibility() != 0) {
                        }
                        if (ma1Var.f() && !ch0Var.P) {
                            if (dv.S == dvVar) {
                                dv.S = null;
                            }
                            ma1Var.b();
                            return;
                        }
                        return;
                    }
                    if (xuVar.getParent() != null) {
                        removeView(xuVar);
                        xuVar.stopLoading();
                        xuVar.loadUrl("about:blank");
                        xuVar.destroy();
                    }
                    if (ma1Var.f()) {
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
        switch (this.f4112a) {
            case 0:
                super.onDraw(canvas);
                u uVar = (u) this.f4113b;
                if (uVar.f4157x > 0) {
                    canvas.drawRect(0.0f, getHeight() - uVar.f4157x, getWidth(), getHeight(), uVar.f4158y);
                    return;
                }
                return;
            case 10:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f4113b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f4113b = hVar;
                    hVar.f33824k = false;
                    hVar.f33826m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f4113b).f33820f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f4113b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 11:
                ((ha) this.f4113b).e.a(canvas);
                return;
            case 12:
                sl slVar = (sl) this.f4113b;
                slVar.f32594b0.setColor(y6.w0(y6.f23427h5, slVar.f30214a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - slVar.f32622y0, slVar.f32594b0);
                return;
            case 23:
                ew0 ew0Var = (ew0) this.f4113b;
                Drawable drawable = ew0Var.d;
                drawable.setBounds(0, ew0Var.f27999f - ew0.n(ew0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 27:
                x71 x71Var = (x71) this.f4113b;
                Drawable drawable2 = x71Var.f34655b;
                drawable2.setBounds(0, (int) ((x71Var.h - x71.n(x71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f4112a) {
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((sl) this.f4113b).f32622y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                ew0 ew0Var = (ew0) this.f4113b;
                if (motionEvent.getAction() == 0 && ew0Var.f27999f != 0 && motionEvent.getY() < ew0Var.f27999f) {
                    ew0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 27:
                x71 x71Var = (x71) this.f4113b;
                if (motionEvent.getAction() == 0 && x71Var.h != 0 && motionEvent.getY() < x71Var.h) {
                    x71Var.dismiss();
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
        float x9;
        switch (this.f4112a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                u uVar = (u) this.f4113b;
                if (uVar.N && z10) {
                    uVar.f0(uVar.P.e);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                q30 q30Var = (q30) this.f4113b;
                q30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (q30Var.getMeasuredWidth() / 2.0f));
                q30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (q30Var.getMeasuredWidth() / 2.0f));
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((ha) this.f4113b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f4113b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f26051q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f26051q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f26051q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f26051q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f26051q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f26051q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f26051q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26040k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f26040k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26040k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f26040k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f26053r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f26053r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26053r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f26053r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                k30 k30Var = (k30) this.f4113b;
                r rVar = k30Var.f29790b;
                int[] iArr = k30Var.G;
                rVar.getLocationOnScreen(iArr);
                k30Var.N = iArr[0];
                k30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                hn0 hn0Var = (hn0) this.f4113b;
                r rVar2 = hn0Var.f29026s;
                vw0 vw0Var = hn0Var.v;
                Drawable drawable = hn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (hn0Var.f29028x != null) {
                        float f10 = hn0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = hn0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!hn0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                hn0Var.f29029y.setPivotX(AndroidUtilities.dp(6.0f));
                                hn0Var.f29028x.setX(Math.min(vw0Var.getWidth() - hn0Var.f29028x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - vw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                hn0Var.f29029y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                hn0Var.f29028x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - hn0Var.f29028x.getMeasuredWidth()) - vw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x9 = ((hn0Var.f29028x.getX() + hn0Var.f29028x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x9 = (hn0Var.f29028x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            hn0Var.G = x9;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (hn0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (hn0Var.f29028x.getMeasuredHeight() + f16 > rVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            hn0Var.f29029y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            hn0Var.f29028x.setY(((f14 - AndroidUtilities.dp(f7)) - hn0Var.f29028x.getMeasuredHeight()) - vw0Var.getY());
                            z12 = true;
                        } else {
                            hn0Var.f29029y.setPivotY(AndroidUtilities.dp(6.0f));
                            hn0Var.f29028x.setY(Math.min((rVar2.getHeight() - hn0Var.f29028x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - vw0Var.getY());
                        }
                        k80 k80Var = hn0Var.f29027w;
                        k80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f22360c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ew0.m((ew0) this.f4113b);
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
        switch (this.f4112a) {
            case 10:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 12:
                super.onMeasure(i10, i11);
                pl plVar = ((sl) this.f4113b).f32621y;
                if (plVar != null) {
                    plVar.a();
                    return;
                }
                return;
            case 15:
                int size = View.MeasureSpec.getSize(i10);
                dv dvVar = (dv) this.f4113b;
                int min = (int) Math.min(dvVar.H / (dvVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (dvVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 16:
                sy syVar = (sy) this.f4113b;
                View view = (View) syVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - syVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - syVar.F.f32715b1, 1073741824));
                return;
            case 17:
                sz szVar = ((nz) this.f4113b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (vh.B(8.0f, szVar.D0.getMeasuredHeight() - szVar.f32715b1, 3) * 1.7f), 1073741824));
                return;
            case 23:
                ew0 ew0Var = (ew0) this.f4113b;
                r1 r1Var = ew0Var.f27997b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int b10 = vh.b(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.t.D(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (b10 < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (b10 < size2) {
                        i13 -= size2 - b10;
                    }
                }
                if (r1Var.getPaddingTop() != i13) {
                    ew0Var.h = true;
                    r1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    ew0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(b10, size2), 1073741824));
                return;
            case 26:
                tz0 tz0Var = (tz0) this.f4113b;
                int i15 = tz0Var.f33182n;
                if (tz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = tz0Var.f33182n;
                if (tz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 29:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((m5) this.f4113b).S.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4112a) {
            case 21:
                super.onSizeChanged(i10, i11, i12, i13);
                hn0 hn0Var = (hn0) this.f4113b;
                ih.d.c(hn0Var.h, hn0Var.f29026s);
                ViewGroup viewGroup = hn0Var.f29029y;
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
        switch (this.f4112a) {
            case 23:
                if (!((ew0) this.f4113b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 27:
                if (!((x71) this.f4113b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 28:
                ((ih1) this.f4113b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f4112a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f4113b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f4112a) {
            case 20:
                mm0 mm0Var = (mm0) this.f4113b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(mm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, mm0Var.f30622b1.getMeasuredWidth(), mm0Var.f30622b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                if (!((ew0) this.f4113b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 25:
                if (!((cz0) this.f4113b).f27297g0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f4112a) {
            case 1:
                super.setTranslationY(f7);
                h7 h7Var = (h7) this.f4113b;
                g5 g5Var = h7Var.f4735e0;
                if (g5Var != null && g5Var.getVisibility() == 0) {
                    h7Var.f4735e0.invalidate();
                    return;
                }
                return;
            case 4:
                sb sbVar = (sb) this.f4113b;
                if (getTranslationY() != f7 && sbVar.f11614c1 != null) {
                    super.setTranslationY(f7);
                    sbVar.f11614c1.y();
                    return;
                }
                return;
            case 27:
                super.setTranslationY(f7);
                x71.m((x71) this.f4113b);
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
        switch (this.f4112a) {
            case 18:
                super.setVisibility(i10);
                ((k30) this.f4113b).d.setVisibility(i10);
                return;
            case 26:
                tz0 tz0Var = (tz0) this.f4113b;
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
                    if (tz0Var.e != null) {
                        for (int i11 = 0; i11 < tz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                sz0 sz0Var = (sz0) tz0Var.e.getChildAt(i11);
                                Drawable drawable = sz0Var.f32796b;
                                if (drawable instanceof t5) {
                                    ((t5) drawable).a(sz0Var);
                                }
                                sz0Var.f32797c = true;
                            } else {
                                sz0 sz0Var2 = (sz0) tz0Var.e.getChildAt(i11);
                                Drawable drawable2 = sz0Var2.f32796b;
                                if (drawable2 instanceof t5) {
                                    ((t5) drawable2).o(sz0Var2);
                                }
                                sz0Var2.f32797c = false;
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

    public r(Object obj, Context context, int i10) {
        super(context);
        this.f4112a = i10;
        this.f4113b = obj;
    }

    public r(Context context) {
        super(context);
        this.f4112a = 7;
        View view = new View(context);
        this.f4113b = view;
        addView(view, gb1.k());
    }

    public r(Context context, u6 u6Var) {
        super(context);
        this.f4112a = 14;
        this.f4113b = new cp[2];
        int i10 = 0;
        while (true) {
            cp[] cpVarArr = (cp[]) this.f4113b;
            if (i10 < cpVarArr.length) {
                cpVarArr[i10] = new cp(context, u6Var);
                addView(((cp[]) this.f4113b)[i10], gb1.i(-1, -1, 119));
                i10++;
            } else {
                cpVarArr[0].setVisibility(0);
                ((cp[]) this.f4113b)[1].setVisibility(8);
                return;
            }
        }
    }

    public r(Context context, String str, di.b bVar) {
        super(context);
        this.f4112a = 3;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = y6.f23464j5;
        Drawable c02 = y6.c0(dp, y6.o1(0.06f, bVar.g(i10)));
        b7 L = f7.L(0.06f, i10);
        setBackground(c02);
        f7.k(this, c02, L, null, bVar);
        LinearLayout d = vh.d(context, 1);
        addView(d, gb1.h(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        s6 s6Var = new s6(context, false, true, true);
        this.f4113b = s6Var;
        s6Var.b(0.6f, 450L, ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(17.0f));
        f7.Z(s6Var, i10, bVar);
        s6Var.setScaleProperty(0.7f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setAllowCancel(true);
        d.addView(s6Var, gb1.o(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        f7.V(textView, i10, bVar);
        textView.setGravity(17);
        d.addView(textView, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public r(u uVar, Context context) {
        super(context);
        this.f4112a = 0;
        this.f4113b = uVar;
        setWillNotDraw(false);
    }

    public r(lw0 lw0Var, Context context) {
        super(context);
        this.f4112a = 24;
        this.f4113b = lw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public r(Context context, q30 q30Var) {
        super(context);
        this.f4112a = 9;
        this.f4113b = q30Var;
    }
}
