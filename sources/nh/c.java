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
import ch.p0;
import hi.ia;
import kg.j0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.ri;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.i20;
import xh.l;
public final class c extends ViewGroup implements ue.a, fs, te.b {
    public static final Rect M = new Rect();
    public final j0 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public a J;
    public final ia K;
    public final RectF L;
    public final te.a f21528a;
    public final te.a f21529b;
    public final l9 f21530c;
    public final ImageReceiver d;
    public final Paint f21531e;
    public final Paint f21532f;
    public final n h;
    public final ImageReceiver f21533n;
    public o5 f21534r;
    public p0 f21535s;
    public final l f21536w;
    public e2.j0 f21537x;
    public boolean f21538y;

    public c(Context context) {
        super(context);
        lr lrVar = lr.h;
        this.f21528a = new te.a(0, this, lrVar, 320L, false);
        this.f21529b = new te.a(1, this, lrVar, 320L, false);
        this.f21530c = new l9(this);
        Paint paint = new Paint(1);
        this.f21531e = paint;
        Paint paint2 = new Paint(1);
        this.f21532f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.E = new j0(this, 24);
        this.K = new ia(this, 1);
        this.L = new RectF();
        l lVar = new l(context);
        this.f21536w = lVar;
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
        nVar.f41048c.setStrokeWidth(g0.L(1.0f));
        this.f21533n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        this.f21532f.setAlpha(Math.round(this.f21529b.f57657e * 100.0f));
        int round = Math.round(this.f21528a.f57657e * 220.0f);
        n nVar = this.h;
        nVar.f41046a.setAlpha(round);
        nVar.f41048c.setAlpha(round);
        invalidate();
    }

    @Override
    public final void M(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.J) != null && (groupCallMessage = this.I) != null) {
            ((i20) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final boolean Q0(float f10, float f11) {
        if (a(f10, f11) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Z0(View view, float f10, float f11) {
        return false;
    }

    public final int a(float f10, float f11) {
        e2.j0 j0Var = this.f21537x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = this.L;
        rectF.set((RectF) j0Var.f10445e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f21537x.f10444c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25145k4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2.j0 j0Var = this.f21537x;
        if (j0Var != null) {
            canvas.drawPath((Path) j0Var.d, this.f21531e);
            if (Build.VERSION.SDK_INT >= 29 && this.F != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f10 = 0.0f;
                while (view != this.H) {
                    f10 += view.getY();
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                }
                canvas.save();
                canvas.clipPath((Path) this.f21537x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f21532f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f21537x.d, paint);
            }
            if (this.f21528a.f57657e > 0.0f) {
                RectF rectF = this.L;
                rectF.set((RectF) this.f21537x.f10444c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f21533n.h(canvas, null);
            o5 o5Var = this.f21534r;
            if (o5Var != null) {
                o5Var.draw(canvas);
            }
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.I;
    }

    public float getReactionCenterX() {
        e2.j0 j0Var = this.f21537x;
        if (j0Var != null) {
            return ((RectF) j0Var.f10446f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean m0() {
        return true;
    }

    @Override
    public final boolean m1() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f21533n.P();
        o5 o5Var = this.f21534r;
        if (o5Var != null) {
            o5Var.a(this);
        }
        ks.e().c(this, ks.f25145k4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f21533n.R();
        o5 o5Var = this.f21534r;
        if (o5Var != null) {
            o5Var.n(this);
        }
        ks.e().n(this, ks.f25145k4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        e2.j0 j0Var = this.f21537x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.f10447g).x);
        int round2 = Math.round(((PointF) this.f21537x.f10447g).y);
        l lVar = this.f21536w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L;
        boolean z10;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        e2.j0 j0Var = this.f21537x;
        if (j0Var == null || this.f21538y || j0Var.f10442a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            p0 p0Var = this.f21535s;
            int c10 = n10.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f21536w;
            lVar.measure(c10, makeMeasureSpec);
            float measuredWidth = lVar.getMeasuredWidth();
            if (p0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(70.0f);
            }
            int i11 = L + ceil;
            int b10 = f3.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            ?? obj = new Object();
            obj.f10444c = new RectF();
            obj.d = new Path();
            obj.f10445e = new RectF();
            obj.f10446f = new RectF();
            obj.f10447g = new PointF();
            RectF rectF = (RectF) obj.f10445e;
            PointF pointF = (PointF) obj.f10447g;
            RectF rectF2 = (RectF) obj.f10446f;
            RectF rectF3 = (RectF) obj.f10444c;
            obj.f10442a = size;
            obj.f10443b = b10;
            rectF3.set(0.0f, 0.0f, i11, b10);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, g0.L(14.0f), g0.L(14.0f), Path.Direction.CW);
            if (lVar.getLayout().getParagraphDirection(0) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF.set(0.0f, 0.0f, g0.L(22.0f), g0.L(22.0f));
            if (z10) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-g0.L(4.0f)) - rectF.width(), g0.L(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(g0.L(4.0f), g0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, g0.L(f10), g0.L(f10));
            if (z10) {
                rectF2.offset(rectF3.left + g0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - g0.L(33.0f), 0.0f);
            }
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + g0.L(19.0f)) - lVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - g0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + g0.L(32.0f), 0.0f);
            }
            this.f21537x = obj;
            this.d.A0(rectF);
            this.f21533n.A0((RectF) this.f21537x.f10446f);
            if (this.f21534r != null) {
                Rect rect = M;
                ((RectF) this.f21537x.f10446f).round(rect);
                this.f21534r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f21537x.f10443b);
        this.h.f41050f = Math.round(((RectF) this.f21537x.f10444c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21530c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        j0 j0Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(j0Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(j0Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.f21528a.a(groupCallMessage4.isSendDelayed(), false);
            this.f21529b.a(this.I.isSendError(), false);
        }
        TLObject g22 = mp.u1(j10.f24773t0).g2(groupCallMessage.fromId);
        String m10 = n5.m(g22);
        b9 b9Var = new b9((i6) null);
        b9Var.p(g22);
        this.d.i0(g22, b9Var, null);
        ImageReceiver imageReceiver = this.f21533n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f21534r != null && isAttachedToWindow()) {
            this.f21534r.n(this);
        }
        this.f21534r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new i41(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        p0 p0Var = groupCallMessage.visibleReaction;
        l lVar = this.f21536w;
        if (p0Var == null) {
            CharSequence j02 = fj.j0(groupCallMessage.message, false, true, lVar.getPaint());
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
        } else if (p0Var.f5478f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(groupCallMessage.currentAccount).f26635r.get(groupCallMessage.visibleReaction.f5478f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(fc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (p0Var.f5479g != 0) {
            o5 o5Var = new o5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f5479g);
            this.f21534r = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f21534r.a(this);
            }
        }
        this.f21535s = groupCallMessage.visibleReaction;
        this.f21538y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f21531e.setColor(i7);
    }

    public void setDelegate(a aVar) {
        this.J = aVar;
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    @Override
    public final void t(float f10, float f11) {
    }

    @Override
    public final void e1(View view, float f10, float f11) {
    }

    @Override
    public final void o(View view, float f10, float f11) {
    }

    @Override
    public final void x(View view, float f10, float f11) {
    }
}
