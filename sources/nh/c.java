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
import l2.a0;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.Components.wq;
import org.telegram.ui.j20;
import xh.l;
public final class c extends ViewGroup implements ue.a, ls, te.b {
    public static final Rect L = new Rect();
    public final a0 D;
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ka J;
    public final RectF K;
    public final te.a f20599a;
    public final te.a f20600b;
    public final l9 f20601c;
    public final ImageReceiver d;
    public final Paint f20602e;
    public final Paint f20603f;
    public final n h;
    public final ImageReceiver f20604n;
    public h5 f20605r;
    public o0 f20606s;
    public final l f20607w;
    public j0 f20608x;
    public boolean f20609y;

    public c(Context context) {
        super(context);
        wq wqVar = wq.h;
        this.f20599a = new te.a(0, this, wqVar, 320L, false);
        this.f20600b = new te.a(1, this, wqVar, 320L, false);
        this.f20601c = new l9(this);
        Paint paint = new Paint(1);
        this.f20602e = paint;
        Paint paint2 = new Paint(1);
        this.f20603f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.D = new a0(this, 13);
        this.J = new ka(this, 1);
        this.K = new RectF();
        l lVar = new l(context);
        this.f20607w = lVar;
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
        nVar.f39381c.setStrokeWidth(g0.L(1.0f));
        this.f20604n = new ImageReceiver(this);
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
            ((j20) aVar).a(groupCallMessage);
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
        this.f20603f.setAlpha(Math.round(this.f20600b.f55498e * 100.0f));
        int round = Math.round(this.f20599a.f55498e * 220.0f);
        n nVar = this.h;
        nVar.f39379a.setAlpha(round);
        nVar.f39381c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        j0 j0Var = this.f20608x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) j0Var.f10296e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f20608x.f10295c).contains(f10, f11)) {
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
        if (i7 == qs.f25022i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.f20608x;
        if (j0Var != null) {
            canvas.drawPath((Path) j0Var.d, this.f20602e);
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
                canvas.clipPath((Path) this.f20608x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.F;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f20603f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f20608x.d, paint);
            }
            if (this.f20599a.f55498e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f20608x.f10295c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f20604n.h(canvas, null);
            h5 h5Var = this.f20605r;
            if (h5Var != null) {
                h5Var.draw(canvas);
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
        j0 j0Var = this.f20608x;
        if (j0Var != null) {
            return ((RectF) j0Var.f10297f).centerX();
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
        this.f20604n.P();
        h5 h5Var = this.f20605r;
        if (h5Var != null) {
            h5Var.a(this);
        }
        qs.e().c(this, qs.f25022i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.D);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f20604n.R();
        h5 h5Var = this.f20605r;
        if (h5Var != null) {
            h5Var.n(this);
        }
        qs.e().n(this, qs.f25022i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.D);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        j0 j0Var = this.f20608x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.f10298g).x);
        int round2 = Math.round(((PointF) this.f20608x.f10298g).y);
        l lVar = this.f20607w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L2;
        boolean z9;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        j0 j0Var = this.f20608x;
        if (j0Var == null || this.f20609y || j0Var.f10293a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.f20606s;
            int c10 = q.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f20607w;
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
            obj.f10295c = new RectF();
            obj.d = new Path();
            obj.f10296e = new RectF();
            obj.f10297f = new RectF();
            obj.f10298g = new PointF();
            RectF rectF = (RectF) obj.f10296e;
            PointF pointF = (PointF) obj.f10298g;
            RectF rectF2 = (RectF) obj.f10297f;
            RectF rectF3 = (RectF) obj.f10295c;
            obj.f10293a = size;
            obj.f10294b = b10;
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
            this.f20608x = obj;
            this.d.A0(rectF);
            this.f20604n.A0((RectF) this.f20608x.f10297f);
            if (this.f20605r != null) {
                Rect rect = L;
                ((RectF) this.f20608x.f10297f).round(rect);
                this.f20605r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f20608x.f10294b);
        this.h.f39383f = Math.round(((RectF) this.f20608x.f10295c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f20601c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        a0 a0Var = this.D;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(a0Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(a0Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f20599a.a(groupCallMessage4.isSendDelayed(), false);
            this.f20600b.a(this.H.isSendError(), false);
        }
        TLObject e22 = qp.s1(p10.f24474s0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        v8 v8Var = new v8((h6) null);
        v8Var.p(e22);
        this.d.i0(e22, v8Var, null);
        ImageReceiver imageReceiver = this.f20604n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f20605r != null && isAttachedToWindow()) {
            this.f20605r.n(this);
        }
        this.f20605r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        l lVar = this.f20607w;
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
        } else if (o0Var.f6359f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(groupCallMessage.currentAccount).f25840r.get(groupCallMessage.visibleReaction.f6359f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(hc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.f6360g != 0) {
            h5 h5Var = new h5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f6360g);
            this.f20605r = h5Var;
            h5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f20605r.a(this);
            }
        }
        this.f20606s = groupCallMessage.visibleReaction;
        this.f20609y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f20602e.setColor(i7);
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
