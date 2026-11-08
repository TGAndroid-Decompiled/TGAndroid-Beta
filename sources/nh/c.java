package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.o0;
import e2.j0;
import fi.ka;
import l2.w;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.g20;
import xh.l;
public final class c extends ViewGroup implements ue.a, ls, te.b {
    public static final Rect L = new Rect();
    public final w D;
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ka J;
    public final RectF K;
    public final te.a f20594a;
    public final te.a f20595b;
    public final l9 f20596c;
    public final ImageReceiver d;
    public final Paint f20597e;
    public final Paint f20598f;
    public final n h;
    public final ImageReceiver f20599n;
    public i5 f20600r;
    public o0 f20601s;
    public final l f20602w;
    public j0 f20603x;
    public boolean f20604y;

    public c(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.f20594a = new te.a(0, this, xqVar, 320L, false);
        this.f20595b = new te.a(1, this, xqVar, 320L, false);
        this.f20596c = new l9(this);
        Paint paint = new Paint(1);
        this.f20597e = paint;
        Paint paint2 = new Paint(1);
        this.f20598f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.D = new w(this, 14);
        this.J = new ka(this, 1);
        this.K = new RectF();
        l lVar = new l(context);
        this.f20602w = lVar;
        lVar.setDisablePaddingsOffset(true);
        lVar.setTextSize(14.0f);
        lVar.setTextColor(-1);
        lVar.setLinkTextColor(-11683585);
        lVar.setHintTextColor(-1);
        addView(lVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.J0(g0.L(11.0f));
        nVar.f39372c.setStrokeWidth(g0.L(1.0f));
        this.f20599n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void O(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((g20) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final boolean U0(float f10, float f11) {
        if (a(f10, f11) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        this.f20598f.setAlpha(Math.round(this.f20595b.f55486e * 100.0f));
        int round = Math.round(this.f20594a.f55486e * 220.0f);
        n nVar = this.h;
        nVar.f39370a.setAlpha(round);
        nVar.f39372c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        j0 j0Var = this.f20603x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) j0Var.f10291e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f20603x.f10290c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final boolean c1(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25018i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.f20603x;
        if (j0Var != null) {
            canvas.drawPath((Path) j0Var.d, this.f20597e);
            if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f10 = 0.0f;
                while (view != this.G) {
                    f10 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f20603x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.F;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f20598f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f20603x.d, paint);
            }
            if (this.f20594a.f55486e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f20603x.f10290c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f20599n.h(canvas, null);
            i5 i5Var = this.f20600r;
            if (i5Var != null) {
                i5Var.draw(canvas);
            }
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.H;
    }

    public float getReactionCenterX() {
        j0 j0Var = this.f20603x;
        if (j0Var != null) {
            return ((RectF) j0Var.f10292f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean j0() {
        return true;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f20599n.P();
        i5 i5Var = this.f20600r;
        if (i5Var != null) {
            i5Var.a(this);
        }
        qs.e().c(this, qs.f25018i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.D);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f20599n.R();
        i5 i5Var = this.f20600r;
        if (i5Var != null) {
            i5Var.n(this);
        }
        qs.e().n(this, qs.f25018i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.D);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        j0 j0Var = this.f20603x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.f10293g).x);
        int round2 = Math.round(((PointF) this.f20603x.f10293g).y);
        l lVar = this.f20602w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L2;
        boolean z9;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        j0 j0Var = this.f20603x;
        if (j0Var == null || this.f20604y || j0Var.f10288a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.f20601s;
            int c10 = q.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f20602w;
            lVar.measure(c10, makeMeasureSpec);
            float measuredWidth = lVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = g0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = g0.L(70.0f);
            }
            int i11 = L2 + ceil;
            int b10 = k5.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            ?? obj = new Object();
            obj.f10290c = new RectF();
            obj.d = new Path();
            obj.f10291e = new RectF();
            obj.f10292f = new RectF();
            obj.f10293g = new PointF();
            RectF rectF = (RectF) obj.f10291e;
            PointF pointF = (PointF) obj.f10293g;
            RectF rectF2 = (RectF) obj.f10292f;
            RectF rectF3 = (RectF) obj.f10290c;
            obj.f10288a = size;
            obj.f10289b = b10;
            rectF3.set(0.0f, 0.0f, i11, b10);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, g0.L(14.0f), g0.L(14.0f), Path.Direction.CW);
            if (lVar.getLayout().getParagraphDirection(0) == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            rectF.set(0.0f, 0.0f, g0.L(22.0f), g0.L(22.0f));
            if (z9) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-g0.L(4.0f)) - rectF.width(), g0.L(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(g0.L(4.0f), g0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, g0.L(f10), g0.L(f10));
            if (z9) {
                rectF2.offset(rectF3.left + g0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - g0.L(33.0f), 0.0f);
            }
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + g0.L(19.0f)) - lVar.getLayout().getLineBaseline(0));
            if (z9) {
                pointF.offset((rectF3.right - g0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + g0.L(32.0f), 0.0f);
            }
            this.f20603x = obj;
            this.d.A0(rectF);
            this.f20599n.A0((RectF) this.f20603x.f10292f);
            if (this.f20600r != null) {
                Rect rect = L;
                ((RectF) this.f20603x.f10292f).round(rect);
                this.f20600r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f20603x.f10289b);
        this.h.f39374f = Math.round(((RectF) this.f20603x.f10290c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f20596c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        w wVar = this.D;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(wVar);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(wVar);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f20594a.a(groupCallMessage4.isSendDelayed(), false);
            this.f20595b.a(this.H.isSendError(), false);
        }
        TLObject e22 = qp.s1(p10.f24470s0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        w8 w8Var = new w8((f6) null);
        w8Var.p(e22);
        this.d.i0(e22, w8Var, null);
        ImageReceiver imageReceiver = this.f20599n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f20600r != null && isAttachedToWindow()) {
            this.f20600r.n(this);
        }
        this.f20600r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        l lVar = this.f20602w;
        if (o0Var == null) {
            CharSequence j02 = ij.j0(groupCallMessage.message, false, true, lVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(j02);
            if (b10 != b11) {
                if (b11) {
                    c10 = 8295;
                } else {
                    c10 = 8294;
                }
                spannableStringBuilder2.append(c10);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(j02);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (o0Var.f6356f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(groupCallMessage.currentAccount).f25836r.get(groupCallMessage.visibleReaction.f6356f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(hc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.f6357g != 0) {
            i5 i5Var = new i5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f6357g);
            this.f20600r = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f20600r.a(this);
            }
        }
        this.f20601s = groupCallMessage.visibleReaction;
        this.f20604y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f20597e.setColor(i7);
    }

    public void setDelegate(a aVar) {
        this.I = aVar;
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void F(float f10, int i7) {
    }

    @Override
    public final void s(float f10, float f11) {
    }

    @Override
    public final void l1(View view, float f10, float f11) {
    }

    @Override
    public final void m(View view, float f10, float f11) {
    }

    @Override
    public final void w(View view, float f10, float f11) {
    }
}
