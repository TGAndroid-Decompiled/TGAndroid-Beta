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
import e2.j0;
import hi.ia;
import kg.s0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.si;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.i20;
import xh.l;
public final class c extends ViewGroup implements ue.a, gs, te.b {
    public static final Rect M = new Rect();
    public final s0 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public a J;
    public final ia K;
    public final RectF L;
    public final te.a f21522a;
    public final te.a f21523b;
    public final m9 f21524c;
    public final ImageReceiver d;
    public final Paint f21525e;
    public final Paint f21526f;
    public final n h;
    public final ImageReceiver f21527n;
    public p5 f21528r;
    public p0 f21529s;
    public final l f21530w;
    public j0 f21531x;
    public boolean f21532y;

    public c(Context context) {
        super(context);
        nr nrVar = nr.h;
        this.f21522a = new te.a(0, this, nrVar, 320L, false);
        this.f21523b = new te.a(1, this, nrVar, 320L, false);
        this.f21524c = new m9(this);
        Paint paint = new Paint(1);
        this.f21525e = paint;
        Paint paint2 = new Paint(1);
        this.f21526f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.E = new s0(this, 23);
        this.K = new ia(this, 1);
        this.L = new RectF();
        l lVar = new l(context);
        this.f21530w = lVar;
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
        nVar.f41146c.setStrokeWidth(g0.L(1.0f));
        this.f21527n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        this.f21526f.setAlpha(Math.round(this.f21523b.f57665e * 100.0f));
        int round = Math.round(this.f21522a.f57665e * 220.0f);
        n nVar = this.h;
        nVar.f41144a.setAlpha(round);
        nVar.f41146c.setAlpha(round);
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
        j0 j0Var = this.f21531x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = this.L;
        rectF.set((RectF) j0Var.f10437e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f21531x.f10436c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25306l4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.f21531x;
        if (j0Var != null) {
            canvas.drawPath((Path) j0Var.d, this.f21525e);
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
                canvas.clipPath((Path) this.f21531x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f21526f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f21531x.d, paint);
            }
            if (this.f21522a.f57665e > 0.0f) {
                RectF rectF = this.L;
                rectF.set((RectF) this.f21531x.f10436c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f21527n.h(canvas, null);
            p5 p5Var = this.f21528r;
            if (p5Var != null) {
                p5Var.draw(canvas);
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
        j0 j0Var = this.f21531x;
        if (j0Var != null) {
            return ((RectF) j0Var.f10438f).centerX();
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
        this.f21527n.P();
        p5 p5Var = this.f21528r;
        if (p5Var != null) {
            p5Var.a(this);
        }
        ls.e().c(this, ls.f25306l4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f21527n.R();
        p5 p5Var = this.f21528r;
        if (p5Var != null) {
            p5Var.n(this);
        }
        ls.e().n(this, ls.f25306l4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        j0 j0Var = this.f21531x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.f10439g).x);
        int round2 = Math.round(((PointF) this.f21531x.f10439g).y);
        l lVar = this.f21530w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L;
        boolean z10;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        j0 j0Var = this.f21531x;
        if (j0Var == null || this.f21532y || j0Var.f10434a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            p0 p0Var = this.f21529s;
            int c10 = o10.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f21530w;
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
            obj.f10436c = new RectF();
            obj.d = new Path();
            obj.f10437e = new RectF();
            obj.f10438f = new RectF();
            obj.f10439g = new PointF();
            RectF rectF = (RectF) obj.f10437e;
            PointF pointF = (PointF) obj.f10439g;
            RectF rectF2 = (RectF) obj.f10438f;
            RectF rectF3 = (RectF) obj.f10436c;
            obj.f10434a = size;
            obj.f10435b = b10;
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
            this.f21531x = obj;
            this.d.A0(rectF);
            this.f21527n.A0((RectF) this.f21531x.f10438f);
            if (this.f21528r != null) {
                Rect rect = M;
                ((RectF) this.f21531x.f10438f).round(rect);
                this.f21528r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f21531x.f10435b);
        this.h.f41148f = Math.round(((RectF) this.f21531x.f10436c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21524c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        s0 s0Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(s0Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(s0Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.f21522a.a(groupCallMessage4.isSendDelayed(), false);
            this.f21523b.a(this.I.isSendError(), false);
        }
        TLObject g22 = np.u1(k10.f24932t0).g2(groupCallMessage.fromId);
        String m10 = n5.m(g22);
        b9 b9Var = new b9((h6) null);
        b9Var.p(g22);
        this.d.i0(g22, b9Var, null);
        ImageReceiver imageReceiver = this.f21527n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f21528r != null && isAttachedToWindow()) {
            this.f21528r.n(this);
        }
        this.f21528r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new l41(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        p0 p0Var = groupCallMessage.visibleReaction;
        l lVar = this.f21530w;
        if (p0Var == null) {
            CharSequence j02 = gj.j0(groupCallMessage.message, false, true, lVar.getPaint());
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
        } else if (p0Var.f5470f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(groupCallMessage.currentAccount).f26811r.get(groupCallMessage.visibleReaction.f5470f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(gc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (p0Var.f5471g != 0) {
            p5 p5Var = new p5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f5471g);
            this.f21528r = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f21528r.a(this);
            }
        }
        this.f21529s = groupCallMessage.visibleReaction;
        this.f21532y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f21525e.setColor(i7);
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
