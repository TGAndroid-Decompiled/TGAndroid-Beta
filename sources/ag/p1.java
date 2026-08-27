package ag;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
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
import h7.z5;
import hh.i5;
import hh.oa;
import hh.r3;
import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.eh1;

public final class p1 extends FrameLayout {

    public final int f593a;

    public Object f594b;

    public p1(Context context, int i10) {
        super(context);
        this.f593a = i10;
    }

    public eo a() {
        return ((eo[]) this.f594b)[0];
    }

    public void b() {
        eo[] eoVarArr = (eo[]) this.f594b;
        eo eoVar = eoVarArr[0];
        eo eoVar2 = eoVarArr[1];
        eoVarArr[0] = eoVar2;
        eoVarArr[1] = eoVar;
        eoVar2.f28106n = true;
        eoVar2.setVisibility(0);
        eoVarArr[0].setScaleX(0.8f);
        eoVarArr[0].setScaleY(0.8f);
        eoVarArr[0].setAlpha(0.0f);
        eoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = eoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        rl.o(viewPropertyAnimatorTranslationY, erVar, 320L);
        eo eoVar3 = eoVarArr[1];
        eoVar3.f28106n = false;
        eoVar3.setVisibility(0);
        eoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new bg(eoVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        switch (this.f593a) {
            case 23:
                ol0 ol0Var = (ol0) this.f594b;
                if (ol0Var.f31354r > 0.0f && ol0Var.f31351e != null) {
                    ol0Var.f31352f.reset();
                    float width = getWidth() / ol0Var.f31350c.getWidth();
                    ol0Var.f31352f.postScale(width, width);
                    ol0Var.d.setLocalMatrix(ol0Var.f31352f);
                    ol0Var.f31351e.setAlpha((int) (ol0Var.f31354r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ol0Var.f31351e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ol0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (ol0Var.f31354r * 255.0f));
                    canvas.save();
                    float f12 = ol0Var.D;
                    float f13 = ol0Var.C;
                    float f14 = ol0Var.f31354r;
                    canvas.translate((f13 * f14) + f12, (0.0f * f14) + ol0Var.E);
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ol0Var.F, ol0Var.G), Math.max(ol0Var.F, ol0Var.G), 0.75f), 1.0f, ol0Var.f31354r);
                    canvas.scale(fLerp, fLerp, ((ol0Var.A.getBounds().width() / 2.0f) * ol0Var.F) + (-ol0Var.D) + ol0Var.A.getBounds().left, ((ol0Var.A.getBounds().height() / 2.0f) * ol0Var.G) + (-ol0Var.E) + ol0Var.A.getBounds().top);
                    lg.d dVar = ol0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (ol0Var.f31354r * 255.0f));
                        ol0Var.B.draw(canvas);
                    }
                    ol0Var.A.draw(canvas);
                    canvas.restore();
                }
                break;
            case 27:
                wx0 wx0Var = (wx0) this.f594b;
                ux0 ux0Var = wx0Var.f34365c;
                if (ux0Var != null && ux0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = wx0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x8 = wx0Var.f34365c.getEditField().getX() + wx0Var.f34365c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = wx0Var.P;
                        wx0Var.T = x8 + emojiSpan2.lastDrawX;
                        wx0Var.Q = emojiSpan2.lastDrawY;
                    } else if (wx0Var.R != null && wx0Var.S != null) {
                        wx0Var.T = wx0Var.f34365c.getEditField().getX() + wx0Var.f34365c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                boolean z10 = (!wx0Var.f34370s || wx0Var.v || (arrayList = wx0Var.f34371w) == null || arrayList.isEmpty() || wx0Var.f34372x) ? false : true;
                float fD = wx0Var.L.d(z10 ? 1.0f : 0.0f, false);
                float fD2 = wx0Var.M.d(z10 ? 1.0f : 0.0f, false);
                float fD3 = wx0Var.U.d(wx0Var.T, false);
                if (fD <= 0.0f && fD2 <= 0.0f && !z10) {
                    wx0Var.d.setVisibility(8);
                }
                wx0Var.I.rewind();
                float left = wx0Var.f34366e.getLeft();
                int left2 = wx0Var.f34366e.getLeft();
                ArrayList arrayList2 = wx0Var.f34371w;
                float fD4 = org.telegram.messenger.y1.D(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                y5 y5Var = wx0Var.W;
                float fD5 = y5Var.f34812c;
                boolean z11 = fD5 <= 0.0f;
                float f15 = fD4 - left;
                if (f15 > 0.0f) {
                    fD5 = y5Var.d(f15, z11);
                }
                float fD6 = wx0Var.V.d((left + fD4) / 2.0f, z11);
                ux0 ux0Var2 = wx0Var.f34365c;
                if (ux0Var2 != null && ux0Var2.getEditField() != null) {
                    int i10 = wx0Var.h;
                    if (i10 == 0) {
                        wx0Var.d.setTranslationY(((-wx0Var.f34365c.getEditField().getHeight()) - wx0Var.f34365c.getEditField().getScrollY()) + wx0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        wx0Var.d.setTranslationY(((-wx0Var.getMeasuredHeight()) - wx0Var.f34365c.getEditField().getScrollY()) + wx0Var.Q + AndroidUtilities.dp(20.0f) + wx0Var.d.getHeight());
                    }
                }
                float f16 = fD5 / 4.0f;
                float f17 = fD5 / 2.0f;
                int iMax = (int) Math.max((wx0Var.T - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - wx0Var.f34366e.getLeft(), 0.0f);
                if (wx0Var.f34366e.getPaddingLeft() != iMax) {
                    int paddingLeft = wx0Var.f34366e.getPaddingLeft() - iMax;
                    f10 = 1.0f;
                    wx0Var.f34366e.setPadding(iMax, 0, 0, 0);
                    wx0Var.f34366e.scrollBy(paddingLeft, 0);
                } else {
                    f10 = 1.0f;
                }
                wx0Var.f34366e.setTranslationX(((int) Math.max((fD3 - Math.max(f16, Math.min(f17, AndroidUtilities.dp(66.0f)))) - wx0Var.f34366e.getLeft(), 0.0f)) - iMax);
                float translationX = wx0Var.f34366e.getTranslationX() + (fD6 - f17) + wx0Var.f34366e.getPaddingLeft();
                float translationY = wx0Var.f34366e.getTranslationY() + wx0Var.f34366e.getTop() + wx0Var.f34366e.getPaddingTop() + (wx0Var.h == 0 ? 0 : AndroidUtilities.dp(6.66f));
                float fMin = Math.min(wx0Var.f34366e.getTranslationX() + fD6 + f17 + wx0Var.f34366e.getPaddingLeft(), wx0Var.getWidth() - wx0Var.d.getPaddingRight());
                float translationY2 = (wx0Var.f34366e.getTranslationY() + wx0Var.f34366e.getBottom()) - (wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) : 0);
                float fMin2 = Math.min(AndroidUtilities.dp(9.0f), f17) * 2.0f;
                int i11 = wx0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = translationY2 - fMin2;
                    float f19 = translationX + fMin2;
                    rectF.set(translationX, f18, f19, translationY2);
                    wx0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f20 = translationY + fMin2;
                    rectF.set(translationX, translationY, f19, f20);
                    wx0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f21 = fMin - fMin2;
                    rectF.set(f21, translationY, fMin, f20);
                    wx0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f21, f18, fMin, translationY2);
                    wx0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    wx0Var.I.lineTo(AndroidUtilities.dp(8.66f) + fD3, translationY2);
                    wx0Var.I.lineTo(fD3, AndroidUtilities.dp(6.66f) + translationY2);
                    wx0Var.I.lineTo(fD3 - AndroidUtilities.dp(8.66f), translationY2);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f22 = fMin - fMin2;
                    float f23 = translationY + fMin2;
                    rectF2.set(f22, translationY, fMin, f23);
                    wx0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f24 = translationY2 - fMin2;
                    rectF2.set(f22, f24, fMin, translationY2);
                    wx0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f25 = fMin2 + translationX;
                    rectF2.set(translationX, f24, f25, translationY2);
                    wx0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f25, f23);
                    wx0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    wx0Var.I.lineTo(fD3 - AndroidUtilities.dp(8.66f), translationY);
                    wx0Var.I.lineTo(fD3, translationY - AndroidUtilities.dp(6.66f));
                    wx0Var.I.lineTo(AndroidUtilities.dp(8.66f) + fD3, translationY);
                }
                wx0Var.I.close();
                if (wx0Var.K == null) {
                    Paint paint = new Paint(1);
                    wx0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    wx0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    wx0Var.K.setColor(g6.v0(g6.Be, wx0Var.f34364b));
                }
                if (fD < f10) {
                    wx0Var.J.rewind();
                    float fDp = wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                    double d = fD3 - translationX;
                    double d10 = fDp - translationY;
                    f11 = 255.0f;
                    double d11 = fD3 - fMin;
                    double d12 = fDp - translationY2;
                    wx0Var.J.addCircle(fD3, fDp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d10, 2.0d) + Math.pow(d, 2.0d), Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d)), Math.max(Math.pow(d12, 2.0d) + Math.pow(d, 2.0d), Math.pow(d12, 2.0d) + Math.pow(d11, 2.0d))))) * fD, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(wx0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, wx0Var.getWidth(), wx0Var.getHeight(), (int) (fD * 255.0f), 31);
                } else {
                    f11 = 255.0f;
                }
                canvas.drawPath(wx0Var.I, wx0Var.K);
                canvas.save();
                canvas.clipPath(wx0Var.I);
                super.dispatchDraw(canvas);
                float f26 = wx0Var.W.f34812c;
                float f27 = wx0Var.V.f34812c;
                float f28 = f26 / 2.0f;
                float translationX2 = wx0Var.f34366e.getTranslationX() + (f27 - f28) + wx0Var.f34366e.getPaddingLeft();
                float paddingTop = wx0Var.f34366e.getPaddingTop() + wx0Var.f34366e.getTop();
                float fMin3 = Math.min(wx0Var.f34366e.getTranslationX() + f27 + f28 + wx0Var.f34366e.getPaddingLeft(), wx0Var.getWidth() - wx0Var.d.getPaddingRight());
                float bottom = wx0Var.f34366e.getBottom();
                float fD7 = wx0Var.N.d(wx0Var.f34366e.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
                if (fD7 > 0.0f) {
                    int i12 = (int) translationX2;
                    g6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    g6.F4.setAlpha((int) (fD7 * f11));
                    g6.F4.draw(canvas);
                }
                float fD8 = wx0Var.O.d(wx0Var.f34366e.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
                if (fD8 > 0.0f) {
                    int i13 = (int) fMin3;
                    g6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    g6.E4.setAlpha((int) (fD8 * f11));
                    g6.E4.draw(canvas);
                }
                canvas.restore();
                if (wx0Var.L.f34812c < f10) {
                    canvas.restore();
                    canvas.restore();
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f593a) {
            case 24:
                re reVar = (re) this.f594b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && reVar.isShowing()) {
                    reVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f593a) {
            case 23:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((ol0) this.f594b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f593a) {
            case 5:
                if (((oa) this.f594b).f9848b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                int action = motionEvent.getAction();
                jh.i1 i1Var = jh.i1.V;
                if (i1Var.C != null) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(i1Var.C.getX(), i1Var.C.getY());
                    boolean zDispatchTouchEvent = i1Var.C.dispatchTouchEvent(motionEvent);
                    motionEventObtain.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.C = null;
                    }
                    if (zDispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean zOnTouchEvent = i1Var.f13433x.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                boolean z10 = !i1Var.f13433x.isInProgress() && ((GestureDetector) i1Var.f13434y.f17823b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    i1Var.A = false;
                    i1Var.B = false;
                    o1.j jVar = i1Var.L;
                    if (!jVar.f19141f) {
                        float f10 = i1Var.J;
                        jVar.f19138b = f10;
                        jVar.f19139c = true;
                        o1.k kVar = jVar.f19147u;
                        int i10 = i1Var.F;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        kVar.f19154i = f11 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        i1Var.L.f();
                    }
                    o1.j jVar2 = i1Var.M;
                    if (!jVar2.f19141f) {
                        float f12 = i1Var.K;
                        jVar2.f19138b = f12;
                        jVar2.f19139c = true;
                        jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
                        i1Var.M.f();
                    }
                }
                return zOnTouchEvent || z10;
            case 10:
                if (((mh.g) this.f594b).f18064a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((tk) this.f594b).f32825x0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f593a) {
            case 15:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tk tkVar = (tk) this.f594b;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - tkVar.f32825x0);
                boolean zDrawChild = tkVar.C ? false : super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f593a) {
            case 8:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                jh.i1 i1Var = jh.i1.V;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f13425b, i1Var.d, i1Var.f13426c);
                i1Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f593a) {
            case 18:
                fu fuVar = (fu) this.f594b;
                i81 i81Var = fuVar.f28451c;
                zt ztVar = fuVar.f28450b;
                super.onDetachedFromWindow();
                try {
                    sf0 sf0Var = sf0.f32415l0;
                    if (!sf0Var.L || ztVar.getVisibility() != 0) {
                        if (ztVar.getParent() != null) {
                            removeView(ztVar);
                            ztVar.stopLoading();
                            ztVar.loadUrl("about:blank");
                            ztVar.destroy();
                        }
                    }
                    if (!i81Var.f() && !sf0Var.L) {
                        if (fu.O == fuVar) {
                            fu.O = null;
                        }
                        i81Var.b();
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f593a) {
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f594b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f594b = hVar;
                    hVar.f33595k = false;
                    hVar.f33597m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f594b).f33591f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f594b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                break;
            case 14:
                ((t9) this.f594b).f32717e.a(canvas);
                break;
            case 15:
                tk tkVar = (tk) this.f594b;
                tkVar.W.setColor(g6.v0(g6.f23124h5, tkVar.f34899a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - tkVar.f32825x0, tkVar.W);
                break;
            case 25:
                lu0 lu0Var = (lu0) this.f594b;
                Drawable drawable = lu0Var.d;
                drawable.setBounds(0, lu0Var.f30469f - ((org.telegram.ui.ActionBar.e3) lu0Var).backgroundPaddingTop, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 28:
                q51 q51Var = (q51) this.f594b;
                int translationY = (int) ((q51Var.h - ((org.telegram.ui.ActionBar.e3) q51Var).backgroundPaddingTop) - getTranslationY());
                Drawable drawable2 = q51Var.f31800b;
                drawable2.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        o1 o1Var;
        o1 o1Var2;
        switch (this.f593a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                s1 s1Var = (s1) this.f594b;
                CharSequence text = (!s1Var.h || (o1Var2 = s1Var.f644e) == null) ? null : o1Var2.getText();
                if (text == null && (o1Var = s1Var.d) != null) {
                    text = o1Var.getText();
                }
                if (text != null) {
                    accessibilityNodeInfo.setText(text);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(text);
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f593a) {
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((tk) this.f594b).f32825x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                lu0 lu0Var = (lu0) this.f594b;
                if (motionEvent.getAction() != 0 || lu0Var.f30469f == 0 || motionEvent.getY() >= lu0Var.f30469f) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                lu0Var.dismiss();
                return true;
            case 28:
                q51 q51Var = (q51) this.f594b;
                if (motionEvent.getAction() != 0 || q51Var.h == 0 || motionEvent.getY() >= q51Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                q51Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int iDp;
        int measuredHeight2;
        int measuredWidth2;
        int iDp2;
        float f10;
        boolean z11;
        switch (this.f593a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ig.s sVar = (ig.s) this.f594b;
                if (sVar.G && z10) {
                    sVar.f11449w.setTranslationY(-sVar.f11443c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f11443c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f11451y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f11451y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                t20 t20Var = (t20) this.f594b;
                t20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (t20Var.getMeasuredWidth() / 2.0f));
                t20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (t20Var.getMeasuredWidth() / 2.0f));
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                int iDp3 = AndroidUtilities.dp(36.0f);
                int i14 = ((i12 - i10) - iDp3) / 2;
                int i15 = ((i13 - i11) - iDp3) / 2;
                ((t9) this.f594b).f32717e.f(i14, i15, i14 + iDp3, iDp3 + i15);
                break;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f594b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    measuredWidth2 = getMeasuredWidth() / 2;
                    int i16 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i16;
                    iDp2 = i16 - AndroidUtilities.dp(17.0f);
                    iDp = measuredWidth2;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i17 = measuredWidth / 2;
                    int iDp4 = measuredWidth + i17 + AndroidUtilities.dp(17.0f);
                    iDp = i17 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    measuredWidth2 = iDp4;
                    iDp2 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.m0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.m0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.m0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26254g0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f26254g0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26254g0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f26254g0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f26266n0;
                imageView.layout(measuredWidth2 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f26266n0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26266n0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f26266n0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i18 = 0; i18 < 2; i18++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.O[i18];
                    imageView2.layout(iDp - (imageView2.getMeasuredWidth() / 2), iDp2 - (chatAttachAlertPhotoLayout.O[i18].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.O[i18].getMeasuredWidth() / 2) + iDp, (chatAttachAlertPhotoLayout.O[i18].getMeasuredHeight() / 2) + iDp2);
                }
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                n20 n20Var = (n20) this.f594b;
                p1 p1Var = n20Var.f30820b;
                int[] iArr = n20Var.C;
                p1Var.getLocationOnScreen(iArr);
                n20Var.J = iArr[0];
                n20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.f594b;
                p1 p1Var2 = ol0Var.f31355s;
                zu0 zu0Var = ol0Var.v;
                Drawable drawable = ol0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = ol0Var.f31357x;
                    if (frameLayout != null) {
                        float f11 = bounds.left;
                        float f12 = ol0Var.D;
                        float f13 = f11 + f12;
                        float f14 = bounds.right + f12;
                        float f15 = bounds.top;
                        float f16 = ol0Var.E;
                        float f17 = f15 + f16;
                        float f18 = bounds.bottom + f16;
                        boolean z12 = false;
                        if (ol0Var.H) {
                            f10 = 4.0f;
                            z11 = false;
                        } else {
                            if (f14 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                ol0Var.f31358y.setPivotX(AndroidUtilities.dp(6.0f));
                                ol0Var.f31357x.setX(Math.min(zu0Var.getWidth() - ol0Var.f31357x.getWidth(), f13 - AndroidUtilities.dp(10.0f)) - zu0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = ol0Var.f31358y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                ol0Var.f31357x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f14) - ol0Var.f31357x.getMeasuredWidth()) - zu0Var.getX());
                                z11 = true;
                            }
                            ol0Var.C = z11 ? ((ol0Var.f31357x.getX() + ol0Var.f31357x.getWidth()) - AndroidUtilities.dp(6.0f)) - f14 : (ol0Var.f31357x.getX() + AndroidUtilities.dp(10.0f)) - f13;
                        }
                        float fDp = f18 + (ol0Var.B != null ? AndroidUtilities.dp(21.0f) : 0);
                        if (ol0Var.f31357x.getMeasuredHeight() + fDp > p1Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = ol0Var.f31358y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            ol0Var.f31357x.setY(((f17 - AndroidUtilities.dp(f10)) - ol0Var.f31357x.getMeasuredHeight()) - zu0Var.getY());
                            z12 = true;
                        } else {
                            ol0Var.f31358y.setPivotY(AndroidUtilities.dp(6.0f));
                            ol0Var.f31357x.setY(Math.min((p1Var2.getHeight() - ol0Var.f31357x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), fDp) - zu0Var.getY());
                        }
                        b70 b70Var = ol0Var.f31356w;
                        b70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                    }
                }
                break;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                lu0.m((lu0) this.f594b);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f10;
        float top;
        int measuredHeight;
        int iDp;
        switch (this.f593a) {
            case 1:
                g2 g2Var = (g2) this.f594b;
                if (((org.telegram.ui.ActionBar.e3) g2Var).isPortrait) {
                    g2Var.f396s = View.MeasureSpec.getSize(i10);
                } else {
                    g2Var.f396s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                y2 y2Var = ((x2) this.f594b).f700c;
                k kVar = y2Var.f720n0;
                if (kVar == null) {
                    View view = y2Var.f730x0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = y2Var.f730x0.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                    }
                    j jVar = y2Var.m0;
                    jVar.setTranslationY(f10 - (jVar.getMeasuredHeight() / 2.0f));
                } else {
                    top = kVar.getTop();
                    measuredHeight = y2Var.f720n0.getMeasuredHeight();
                }
                f10 = (measuredHeight / 2.0f) + top;
                j jVar2 = y2Var.m0;
                jVar2.setTranslationY(f10 - (jVar2.getMeasuredHeight() / 2.0f));
                break;
            case 3:
                super.onMeasure(i10, i11);
                ((gh.b2) this.f594b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                break;
            case 13:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                }
                break;
            case 15:
                super.onMeasure(i10, i11);
                qk qkVar = ((tk) this.f594b).B;
                if (qkVar != null) {
                    qkVar.a();
                }
                break;
            case 18:
                int size = View.MeasureSpec.getSize(i10);
                fu fuVar = (fu) this.f594b;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((fuVar.F ? 22 : 0) + 84) + ((int) Math.min(fuVar.D / (fuVar.C / size), AndroidUtilities.displaySize.y / 2)) + 1, 1073741824));
                break;
            case 19:
                wx wxVar = (wx) this.f594b;
                View view2 = (View) wxVar.B.getParent();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((view2 != null ? (int) (view2.getMeasuredHeight() - wxVar.B.getY()) : AndroidUtilities.dp(120.0f)) - wxVar.B.X0, 1073741824));
                break;
            case 20:
                yy yyVar = ((ty) this.f594b).M;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (rl.x(8.0f, yyVar.f35059z0.getMeasuredHeight() - yyVar.X0, 3) * 1.7f), 1073741824));
                break;
            case 25:
                lu0 lu0Var = (lu0) this.f594b;
                hh.f1 f1Var = lu0Var.f30466b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int iD = org.telegram.messenger.y1.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.y1.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i12 = size2 / 5;
                if (iD < i12 * 3) {
                    iDp = AndroidUtilities.dp(8.0f);
                } else {
                    iDp = i12 * 2;
                    if (iD < size2) {
                        iDp -= size2 - iD;
                    }
                }
                if (f1Var.getPaddingTop() != iDp) {
                    lu0Var.h = true;
                    f1Var.setPadding(0, iDp, 0, AndroidUtilities.dp(8.0f));
                    lu0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(iD, size2), 1073741824));
                break;
            case 27:
                wx0 wx0Var = (wx0) this.f594b;
                setPadding(wx0Var.f34368n, wx0Var.h == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), wx0Var.f34368n, wx0Var.h == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f593a) {
            case 8:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f594b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            case 23:
                super.onSizeChanged(i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.f594b;
                pg.c.c(ol0Var.h, ol0Var.f31355s);
                ViewGroup viewGroup = ol0Var.f31358y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f593a) {
            case 25:
                return !((lu0) this.f594b).isDismissed() && super.onTouchEvent(motionEvent);
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                return !((q51) this.f594b).isDismissed() && super.onTouchEvent(motionEvent);
            case 29:
                ((eh1) this.f594b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f593a) {
            case 22:
                zk0 zk0Var = (zk0) this.f594b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(zk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(zk0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, zk0Var.Z0.getMeasuredWidth(), zk0Var.Z0.getMeasuredHeight());
                } catch (Exception unused) {
                    return;
                }
                break;
            case 23:
            case 24:
            default:
                super.requestLayout();
                break;
            case 25:
                if (!((lu0) this.f594b).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 26:
                if (!((ex0) this.f594b).f28174c0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f593a) {
            case 4:
                super.setTranslationY(f10);
                i5 i5Var = (i5) this.f594b;
                r3 r3Var = i5Var.Z;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    i5Var.Z.invalidate();
                    break;
                }
                break;
            case 9:
                sb sbVar = (sb) this.f594b;
                if (getTranslationY() != f10 && sbVar.Y0 != null) {
                    super.setTranslationY(f10);
                    sbVar.Y0.y();
                    break;
                }
                break;
            case 28:
                super.setTranslationY(f10);
                q51.m((q51) this.f594b);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f593a) {
            case 21:
                super.setVisibility(i10);
                ((n20) this.f594b).d.setVisibility(i10);
                break;
            case 27:
                wx0 wx0Var = (wx0) this.f594b;
                boolean z10 = getVisibility() == i10;
                super.setVisibility(i10);
                if (!z10) {
                    boolean z11 = i10 == 0;
                    if (wx0Var.f34366e != null) {
                        for (int i11 = 0; i11 < wx0Var.f34366e.getChildCount(); i11++) {
                            if (z11) {
                                vx0 vx0Var = (vx0) wx0Var.f34366e.getChildAt(i11);
                                Drawable drawable = vx0Var.f34064b;
                                if (drawable instanceof k5) {
                                    ((k5) drawable).a(vx0Var);
                                }
                                vx0Var.f34065c = true;
                            } else {
                                vx0 vx0Var2 = (vx0) wx0Var.f34366e.getChildAt(i11);
                                Drawable drawable2 = vx0Var2.f34064b;
                                if (drawable2 instanceof k5) {
                                    ((k5) drawable2).o(vx0Var2);
                                }
                                vx0Var2.f34065c = false;
                            }
                        }
                    }
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    public p1(Object obj, Context context, int i10) {
        super(context);
        this.f593a = i10;
        this.f594b = obj;
    }

    public p1(Context context, c6 c6Var) {
        super(context);
        this.f593a = 17;
        this.f594b = new eo[2];
        int i10 = 0;
        while (true) {
            eo[] eoVarArr = (eo[]) this.f594b;
            if (i10 < eoVarArr.length) {
                eoVarArr[i10] = new eo(context, c6Var);
                addView(((eo[]) this.f594b)[i10], z5.e(-1, -1, 119));
                i10++;
            } else {
                eoVarArr[0].setVisibility(0);
                ((eo[]) this.f594b)[1].setVisibility(8);
                return;
            }
        }
    }

    public p1(Context context, String str, jh.b bVar) {
        super(context);
        this.f593a = 7;
        int iDp = AndroidUtilities.dp(12.0f);
        int i10 = g6.f23161j5;
        setBackground(g6.b0(iDp, g6.l1(0.06f, bVar.N0(i10))));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        addView(linearLayoutG, z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        j6 j6Var = new j6(context, false, true, true);
        this.f594b = j6Var;
        j6Var.b(0.6f, 450L, er.h);
        j6Var.setTextSize(AndroidUtilities.dp(17.0f));
        j6Var.setTextColor(bVar.N0(i10));
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setAllowCancel(true);
        linearLayoutG.addView(j6Var, z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.N0(i10));
        textView.setGravity(17);
        linearLayoutG.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public p1(Context context, t20 t20Var) {
        super(context);
        this.f593a = 12;
        this.f594b = t20Var;
    }
}
