package dh;

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
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import b2.n0;
import nh.p;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vi;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.y41;
import org.telegram.ui.e30;
import sg.o0;
public final class d extends ViewGroup implements ge.a, vs, fe.e {
    public static final Rect L = new Rect();
    public final a3.d D;
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public b I;
    public final a J;
    public final RectF K;
    public final fe.b f5935a;
    public final fe.b f5936b;
    public final ge.b f5937c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f5938f;
    public final org.telegram.ui.Components.voip.g h;
    public final ImageReceiver f5939n;
    public f5 f5940r;
    public o0 f5941s;
    public final p f5942w;
    public n0 f5943x;
    public boolean f5944y;

    public d(Context context) {
        super(context);
        gr grVar = gr.h;
        this.f5935a = new fe.b(0, this, grVar, 320L, false);
        this.f5936b = new fe.b(1, this, grVar, 320L, false);
        this.f5937c = new ge.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f5938f = paint2;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.h = gVar;
        this.D = new a3.d(this, 28);
        this.J = new a(this, 0);
        this.K = new RectF();
        p pVar = new p(context);
        this.f5942w = pVar;
        pVar.setDisablePaddingsOffset(true);
        pVar.setTextSize(14.0f);
        pVar.setTextColor(-1);
        pVar.setLinkTextColor(-11683585);
        pVar.setHintTextColor(-1);
        addView(pVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.J0(i0.L(11.0f));
        gVar.f31493c.setStrokeWidth(i0.L(1.0f));
        this.f5939n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(android.text.Spannable r6) {
        throw new UnsupportedOperationException("Method not decompiled: dh.d.b(android.text.Spannable):boolean");
    }

    @Override
    public final boolean I1() {
        return false;
    }

    @Override
    public final void N(float f7, float f10) {
        b bVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) == 1 && (bVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((e30) bVar).a(groupCallMessage);
        }
    }

    @Override
    public final boolean V0(float f7, float f10) {
        if (a(f7, f10) == 1) {
            return true;
        }
        return false;
    }

    public final int a(float f7, float f10) {
        n0 n0Var = this.f5943x;
        if (n0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) n0Var.e);
        rectF.inset(-i0.L(5.0f), -i0.L(5.0f));
        if (rectF.contains(f7, f10)) {
            return 1;
        }
        if (!((RectF) this.f5943x.f2125c).contains(f7, f10)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final boolean d1(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14726i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n0 n0Var = this.f5943x;
        if (n0Var != null) {
            canvas.drawPath((Path) n0Var.d, this.e);
            if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f7 = 0.0f;
                while (view != this.G) {
                    f7 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f5943x.d);
                canvas.translate(0.0f, -f7);
                float f10 = this.F;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f5938f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f5943x.d, paint);
            }
            if (this.f5935a.e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f5943x.f2125c);
                rectF.inset(i0.L(1.0f), i0.L(1.0f));
                this.h.a(i0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f5939n.h(canvas, null);
            f5 f5Var = this.f5940r;
            if (f5Var != null) {
                f5Var.draw(canvas);
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
        n0 n0Var = this.f5943x;
        if (n0Var != null) {
            return ((RectF) n0Var.f2126f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean j0() {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f5939n.P();
        f5 f5Var = this.f5940r;
        if (f5Var != null) {
            f5Var.a(this);
        }
        at.e().c(this, at.f14726i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.D);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f5939n.R();
        f5 f5Var = this.f5940r;
        if (f5Var != null) {
            f5Var.n(this);
        }
        at.e().n(this, at.f14726i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.D);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n0 n0Var = this.f5943x;
        if (n0Var == null) {
            return;
        }
        int round = Math.round(((PointF) n0Var.f2127g).x);
        int round2 = Math.round(((PointF) this.f5943x.f2127g).y);
        p pVar = this.f5942w;
        pVar.layout(round, round2, pVar.getMeasuredWidth() + round, pVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int L2;
        boolean z10;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        n0 n0Var = this.f5943x;
        if (n0Var == null || this.f5944y || n0Var.f2123a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.f5941s;
            int c10 = a30.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            p pVar = this.f5942w;
            pVar.measure(c10, makeMeasureSpec);
            float measuredWidth = pVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = i0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = i0.L(70.0f);
            }
            int i12 = L2 + ceil;
            int b10 = m5.b(8.0f, pVar.getMeasuredHeight(), i0.L(28.0f));
            ?? obj = new Object();
            obj.f2125c = new RectF();
            obj.d = new Path();
            obj.e = new RectF();
            obj.f2126f = new RectF();
            obj.f2127g = new PointF();
            RectF rectF = (RectF) obj.e;
            PointF pointF = (PointF) obj.f2127g;
            RectF rectF2 = (RectF) obj.f2126f;
            RectF rectF3 = (RectF) obj.f2125c;
            obj.f2123a = size;
            obj.f2124b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, i0.L(14.0f), i0.L(14.0f), Path.Direction.CW);
            if (pVar.getLayout().getParagraphDirection(0) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF.set(0.0f, 0.0f, i0.L(22.0f), i0.L(22.0f));
            if (z10) {
                f7 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-i0.L(4.0f)) - rectF.width(), i0.L(3.0f));
            } else {
                f7 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(i0.L(4.0f), i0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, i0.L(f7), i0.L(f7));
            if (z10) {
                rectF2.offset(rectF3.left + i0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - i0.L(33.0f), 0.0f);
            }
            rectF2.inset(i0.L(1.0f), i0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + i0.L(19.0f)) - pVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - i0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + i0.L(32.0f), 0.0f);
            }
            this.f5943x = obj;
            this.d.A0(rectF);
            this.f5939n.A0((RectF) this.f5943x.f2126f);
            if (this.f5940r != null) {
                Rect rect = L;
                ((RectF) this.f5943x.f2126f).round(rect);
                this.f5940r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f5943x.f2124b);
        this.h.f31494f = Math.round(((RectF) this.f5943x.f2125c).width() + i0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f5937c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        a3.d dVar = this.D;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(dVar);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(dVar);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f5935a.a(groupCallMessage4.isSendDelayed(), false);
            this.f5936b.a(this.H.isSendError(), false);
        }
        TLObject d22 = wp.r1(e20.f15506s0).d2(groupCallMessage.fromId);
        String m10 = o5.m(d22);
        r8 r8Var = new r8((p6) null);
        r8Var.p(d22);
        this.d.i0(d22, r8Var, null);
        ImageReceiver imageReceiver = this.f5939n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f5940r != null && isAttachedToWindow()) {
            this.f5940r.n(this);
        }
        this.f5940r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new y41(i0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        p pVar = this.f5942w;
        if (o0Var == null) {
            Spannable j02 = kj.j0(groupCallMessage.message, false, true, pVar.getPaint());
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
            spannableStringBuilder2.append((CharSequence) j02);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (o0Var.f48445f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(groupCallMessage.currentAccount).f18670r.get(groupCallMessage.visibleReaction.f48445f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(jc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.f48446g != 0) {
            f5 f5Var = new f5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f48446g);
            this.f5940r = f5Var;
            f5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f5940r.a(this);
            }
        }
        this.f5941s = groupCallMessage.visibleReaction;
        this.f5944y = true;
        pVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.e.setColor(i10);
    }

    public void setDelegate(b bVar) {
        this.I = bVar;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        this.f5938f.setAlpha(Math.round(this.f5936b.e * 100.0f));
        int round = Math.round(this.f5935a.e * 220.0f);
        org.telegram.ui.Components.voip.g gVar = this.h;
        gVar.f31491a.setAlpha(round);
        gVar.f31493c.setAlpha(round);
        invalidate();
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void E(float f7, int i10) {
    }

    @Override
    public final void r(float f7, float f10) {
    }

    @Override
    public final void m(View view, float f7, float f10) {
    }

    @Override
    public final void o1(View view, float f7, float f10) {
    }

    @Override
    public final void u(View view, float f7, float f10) {
    }
}
