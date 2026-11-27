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
public final class v95 extends ViewGroup implements cj2, fn7, s84 {
    public static final Rect M = new Rect();
    public final rj4 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public s95 J;
    public final a31 K;
    public final RectF L;
    public final fm0 a;
    public final fm0 b;
    public final dj2 c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final fe1 h;
    public final ImageReceiver n;
    public wl r;
    public w49 s;
    public final tpa w;
    public t95 x;
    public boolean y;

    public v95(Context context) {
        super(context);
        k43 k43Var = k43.h;
        this.a = new fm0(0, this, k43Var, 320L, false);
        this.b = new fm0(1, this, k43Var, 320L, false);
        this.c = new dj2(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        fe1 fe1Var = new fe1();
        this.h = fe1Var;
        this.E = new rj4(this, (byte) 29);
        this.K = new a31(this, (byte) 5);
        this.L = new RectF();
        tpa tpaVar = new tpa(context);
        this.w = tpaVar;
        tpaVar.setDisablePaddingsOffset(true);
        tpaVar.setTextSize(14.0f);
        tpaVar.setTextColor(-1);
        tpaVar.setLinkTextColor(-11683585);
        tpaVar.setHintTextColor(-1);
        addView(tpaVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.q0(hl.L(11.0f));
        fe1Var.c.setStrokeWidth(hl.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v95.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void I(float f, float f2) {
        s95 s95Var;
        GroupCallMessage groupCallMessage;
        if (a(f, f2) == 1 && (s95Var = this.J) != null && (groupCallMessage = this.I) != null) {
            ((o75) s95Var).a(groupCallMessage);
        }
    }

    @Override
    public final boolean T0(float f, float f2) {
        if (a(f, f2) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean W0(View view, float f, float f2) {
        return false;
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    public final int a(float f, float f2) {
        t95 t95Var = this.x;
        if (t95Var != null) {
            RectF rectF = this.L;
            rectF.set((RectF) t95Var.d);
            rectF.inset(-hl.L(5.0f), -hl.L(5.0f));
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
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t95 t95Var = this.x;
        if (t95Var != null) {
            canvas.drawPath((Path) t95Var.f, this.e);
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
                rectF.inset(hl.L(1.0f), hl.L(1.0f));
                this.h.a(hl.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.n.h(canvas, null);
            wl wlVar = this.r;
            if (wlVar != null) {
                wlVar.draw(canvas);
            }
        }
    }

    @Override
    public final boolean e0() {
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
        t95 t95Var = this.x;
        if (t95Var != null) {
            return ((RectF) t95Var.e).centerX();
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.n.I();
        wl wlVar = this.r;
        if (wlVar != null) {
            wlVar.b(this);
        }
        jn7.e().b(this, jn7.l4);
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
        wl wlVar = this.r;
        if (wlVar != null) {
            wlVar.o(this);
        }
        jn7.e().n(this, jn7.l4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        t95 t95Var = this.x;
        if (t95Var == null) {
            return;
        }
        int round = Math.round(((PointF) t95Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        tpa tpaVar = this.w;
        tpaVar.layout(round, round2, tpaVar.getMeasuredWidth() + round, tpaVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int ceil;
        boolean z;
        float f;
        int size = View.MeasureSpec.getSize(i);
        t95 t95Var = this.x;
        if (t95Var == null || this.y || t95Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            w49 w49Var = this.s;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((size - paddingLeft) - paddingRight) - hl.L(44.0f), Integer.MIN_VALUE);
            tpa tpaVar = this.w;
            tpaVar.measure(makeMeasureSpec, 0);
            float measuredWidth = tpaVar.getMeasuredWidth();
            if (w49Var == null) {
                ceil = hl.L(44.0f) + ((int) Math.ceil(measuredWidth));
            } else {
                ceil = ((int) Math.ceil(measuredWidth)) + hl.L(70.0f);
            }
            int e = qu6.e(8.0f, tpaVar.getMeasuredHeight(), hl.L(28.0f));
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
            ((Path) obj.f).addRoundRect(rectF3, hl.L(14.0f), hl.L(14.0f), Path.Direction.CW);
            if (tpaVar.getLayout().getParagraphDirection(0) == -1) {
                z = true;
            } else {
                z = false;
            }
            rectF.set(0.0f, 0.0f, hl.L(22.0f), hl.L(22.0f));
            if (z) {
                f = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-hl.L(4.0f)) - rectF.width(), hl.L(3.0f));
            } else {
                f = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(hl.L(4.0f), hl.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, hl.L(f), hl.L(f));
            if (z) {
                rectF2.offset(rectF3.left + hl.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - hl.L(33.0f), 0.0f);
            }
            rectF2.inset(hl.L(1.0f), hl.L(1.0f));
            pointF.set(0.0f, (rectF3.top + hl.L(19.0f)) - tpaVar.getLayout().getLineBaseline(0));
            if (z) {
                pointF.offset((rectF3.right - hl.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + hl.L(32.0f), 0.0f);
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
        this.h.f = Math.round(((RectF) this.x.c).width() + hl.L(48.0f));
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
        rj4 rj4Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(rj4Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(rj4Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.I.isSendError(), false);
        }
        TLObject b2 = uc7.s1(yac.t0).b2(groupCallMessage.fromId);
        String l = wf3.l(b2);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.o(b2);
        this.d.U(b2, rb0Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.d0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l);
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        w49 w49Var = groupCallMessage.visibleReaction;
        tpa tpaVar = this.w;
        if (w49Var == null) {
            CharSequence j0 = r47.j0(groupCallMessage.message, false, true, tpaVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b = b(spannableStringBuilder);
            boolean b3 = b(j0);
            if (b != b3) {
                if (b3) {
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
        } else if (w49Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.d0(jn5.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (w49Var.g != 0) {
            wl wlVar = new wl(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = wlVar;
            wlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.b(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.y = true;
        tpaVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.e.setColor(i);
    }

    public void setDelegate(s95 s95Var) {
        this.J = s95Var;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        fe1 fe1Var = this.h;
        fe1Var.a.setAlpha(round);
        fe1Var.c.setAlpha(round);
        invalidate();
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void n(float f, float f2) {
    }

    @Override
    public final void v0(float f, int i) {
    }

    @Override
    public final void D1(View view, float f, float f2) {
    }

    @Override
    public final void j(View view, float f, float f2) {
    }

    @Override
    public final void s(View view, float f, float f2) {
    }
}
