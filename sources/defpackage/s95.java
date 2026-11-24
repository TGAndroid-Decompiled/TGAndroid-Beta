package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s95 extends ViewGroup implements uj2, jm7, g94 {
    public static final Rect M = new Rect();
    public final qn4 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public p95 J;
    public final z31 K;
    public final RectF L;
    public final fn0 a;
    public final fn0 b;
    public final vj2 c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final ef1 h;
    public final ImageReceiver n;
    public vm r;
    public k39 s;
    public final xna w;
    public q95 x;
    public boolean y;

    public s95(Context context) {
        super(context);
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 320L, false);
        this.b = new fn0(1, this, d53Var, 320L, false);
        this.c = new vj2(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        ef1 ef1Var = new ef1();
        this.h = ef1Var;
        this.E = new qn4(this, (byte) 22);
        this.K = new z31(this, (byte) 5);
        this.L = new RectF();
        xna xnaVar = new xna(context);
        this.w = xnaVar;
        xnaVar.setDisablePaddingsOffset(true);
        xnaVar.setTextSize(14.0f);
        xnaVar.setTextColor(-1);
        xnaVar.setLinkTextColor(-11683585);
        xnaVar.setHintTextColor(-1);
        addView(xnaVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.q0(gm.L(11.0f));
        ef1Var.c.setStrokeWidth(gm.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s95.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        ef1 ef1Var = this.h;
        ef1Var.a.setAlpha(round);
        ef1Var.c.setAlpha(round);
        invalidate();
    }

    @Override
    public final void I(float f, float f2) {
        p95 p95Var;
        GroupCallMessage groupCallMessage;
        if (a(f, f2) == 1 && (p95Var = this.J) != null && (groupCallMessage = this.I) != null) {
            ((k75) p95Var).a(groupCallMessage);
        }
    }

    public final int a(float f, float f2) {
        q95 q95Var = this.x;
        if (q95Var != null) {
            RectF rectF = this.L;
            rectF.set((RectF) q95Var.d);
            rectF.inset(-gm.L(5.0f), -gm.L(5.0f));
            if (rectF.contains(f, f2)) {
                return 1;
            }
            if (((RectF) this.x.c).contains(f, f2)) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final boolean a1(float f, float f2) {
        if (a(f, f2) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b2() {
        return false;
    }

    @Override
    public final boolean c1(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q95 q95Var = this.x;
        if (q95Var != null) {
            canvas.drawPath((Path) q95Var.f, this.e);
            if (Build.VERSION.SDK_INT >= 29 && this.F != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f = 0.0f;
                while (view != this.H) {
                    f += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.x.f);
                canvas.translate(0.0f, -f);
                float f2 = this.G;
                canvas.scale(f2, f2);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.x.f, paint);
            }
            if (this.a.e > 0.0f) {
                RectF rectF = this.L;
                rectF.set((RectF) this.x.c);
                rectF.inset(gm.L(1.0f), gm.L(1.0f));
                this.h.a(gm.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.n.h(canvas, null);
            vm vmVar = this.r;
            if (vmVar != null) {
                vmVar.draw(canvas);
            }
        }
    }

    @Override
    public final boolean f0() {
        return true;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.I;
    }

    public float getReactionCenterX() {
        q95 q95Var = this.x;
        if (q95Var != null) {
            return ((RectF) q95Var.e).centerX();
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.n.I();
        vm vmVar = this.r;
        if (vmVar != null) {
            vmVar.b(this);
        }
        nm7.e().b(this, nm7.m4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.n.K();
        vm vmVar = this.r;
        if (vmVar != null) {
            vmVar.o(this);
        }
        nm7.e().n(this, nm7.m4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        q95 q95Var = this.x;
        if (q95Var == null) {
            return;
        }
        int round = Math.round(((PointF) q95Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        xna xnaVar = this.w;
        xnaVar.layout(round, round2, xnaVar.getMeasuredWidth() + round, xnaVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int ceil;
        boolean z;
        float f;
        int size = View.MeasureSpec.getSize(i);
        q95 q95Var = this.x;
        if (q95Var == null || this.y || q95Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            k39 k39Var = this.s;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((size - paddingLeft) - paddingRight) - gm.L(44.0f), Integer.MIN_VALUE);
            xna xnaVar = this.w;
            xnaVar.measure(makeMeasureSpec, 0);
            float measuredWidth = xnaVar.getMeasuredWidth();
            if (k39Var == null) {
                ceil = gm.L(44.0f) + ((int) Math.ceil(measuredWidth));
            } else {
                ceil = ((int) Math.ceil(measuredWidth)) + gm.L(70.0f);
            }
            int e = kt6.e(8.0f, xnaVar.getMeasuredHeight(), gm.L(28.0f));
            ?? obj = new Object();
            obj.c = new RectF();
            obj.f = new Path();
            obj.d = new RectF();
            obj.e = new RectF();
            obj.g = new PointF();
            RectF rectF = (RectF) obj.d;
            PointF pointF = (PointF) obj.g;
            RectF rectF2 = (RectF) obj.e;
            RectF rectF3 = (RectF) obj.c;
            obj.a = size;
            obj.b = e;
            rectF3.set(0.0f, 0.0f, ceil, e);
            rectF3.offset((size - ceil) / 2.0f, 0.0f);
            ((Path) obj.f).addRoundRect(rectF3, gm.L(14.0f), gm.L(14.0f), Path.Direction.CW);
            if (xnaVar.getLayout().getParagraphDirection(0) == -1) {
                z = true;
            } else {
                z = false;
            }
            rectF.set(0.0f, 0.0f, gm.L(22.0f), gm.L(22.0f));
            if (z) {
                f = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-gm.L(4.0f)) - rectF.width(), gm.L(3.0f));
            } else {
                f = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(gm.L(4.0f), gm.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, gm.L(f), gm.L(f));
            if (z) {
                rectF2.offset(rectF3.left + gm.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - gm.L(33.0f), 0.0f);
            }
            rectF2.inset(gm.L(1.0f), gm.L(1.0f));
            pointF.set(0.0f, (rectF3.top + gm.L(19.0f)) - xnaVar.getLayout().getLineBaseline(0));
            if (z) {
                pointF.offset((rectF3.right - gm.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + gm.L(32.0f), 0.0f);
            }
            this.x = obj;
            this.d.k0(rectF);
            this.n.k0((RectF) this.x.e);
            if (this.r != null) {
                Rect rect = M;
                ((RectF) this.x.e).round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.x.b);
        this.h.f = Math.round(((RectF) this.x.c).width() + gm.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        qn4 qn4Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(qn4Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(qn4Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.I.isSendError(), false);
        }
        TLObject a2 = oc7.r1(z8c.t0).a2(groupCallMessage.fromId);
        String l = pg3.l(a2);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.o(a2);
        this.d.U(a2, pc0Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.d0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l);
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        k39 k39Var = groupCallMessage.visibleReaction;
        xna xnaVar = this.w;
        if (k39Var == null) {
            CharSequence j0 = k47.j0(groupCallMessage.message, false, true, xnaVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b = b(spannableStringBuilder);
            boolean b2 = b(j0);
            if (b != b2) {
                if (b2) {
                    c = 8295;
                } else {
                    c = 8294;
                }
                spannableStringBuilder2.append(c);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(j0);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (k39Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.d0(gn5.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (k39Var.g != 0) {
            vm vmVar = new vm(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = vmVar;
            vmVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.b(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.y = true;
        xnaVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.e.setColor(i);
    }

    public void setDelegate(p95 p95Var) {
        this.J = p95Var;
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void l(float f, float f2) {
    }

    @Override
    public final void G1(View view, float f, float f2) {
    }

    @Override
    public final void j(View view, float f, float f2) {
    }

    @Override
    public final void r(View view, float f, float f2) {
    }
}
