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
import hi.ha;
import kg.j1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.Components.y31;
import org.telegram.ui.f20;
import xh.l;
public final class c extends ViewGroup implements ue.a, is, te.b {
    public static final Rect M = new Rect();
    public final j1 E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public a J;
    public final ha K;
    public final RectF L;
    public final te.a f21164a;
    public final te.a f21165b;
    public final k9 f21166c;
    public final ImageReceiver d;
    public final Paint f21167e;
    public final Paint f21168f;
    public final n h;
    public final ImageReceiver f21169n;
    public g5 f21170r;
    public p0 f21171s;
    public final l f21172w;
    public j0 f21173x;
    public boolean f21174y;

    public c(Context context) {
        super(context);
        er erVar = er.h;
        this.f21164a = new te.a(0, this, erVar, 320L, false);
        this.f21165b = new te.a(1, this, erVar, 320L, false);
        this.f21166c = new k9(this);
        Paint paint = new Paint(1);
        this.f21167e = paint;
        Paint paint2 = new Paint(1);
        this.f21168f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.E = new j1(this, 20);
        this.K = new ha(this, 1);
        this.L = new RectF();
        l lVar = new l(context);
        this.f21172w = lVar;
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
        nVar.f40793c.setStrokeWidth(g0.L(1.0f));
        this.f21169n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        this.f21168f.setAlpha(Math.round(this.f21165b.f57081e * 100.0f));
        int round = Math.round(this.f21164a.f57081e * 220.0f);
        n nVar = this.h;
        nVar.f40791a.setAlpha(round);
        nVar.f40793c.setAlpha(round);
        invalidate();
    }

    @Override
    public final void O(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.J) != null && (groupCallMessage = this.I) != null) {
            ((f20) aVar).a(groupCallMessage);
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
        j0 j0Var = this.f21173x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = this.L;
        rectF.set((RectF) j0Var.f10127e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f21173x.f10126c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25514i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.f21173x;
        if (j0Var != null) {
            canvas.drawPath((Path) j0Var.d, this.f21167e);
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
                canvas.clipPath((Path) this.f21173x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f21168f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f21173x.d, paint);
            }
            if (this.f21164a.f57081e > 0.0f) {
                RectF rectF = this.L;
                rectF.set((RectF) this.f21173x.f10126c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f21169n.h(canvas, null);
            g5 g5Var = this.f21170r;
            if (g5Var != null) {
                g5Var.draw(canvas);
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
        j0 j0Var = this.f21173x;
        if (j0Var != null) {
            return ((RectF) j0Var.f10128f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean k0() {
        return true;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f21169n.P();
        g5 g5Var = this.f21170r;
        if (g5Var != null) {
            g5Var.a(this);
        }
        ns.e().c(this, ns.f25514i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f21169n.R();
        g5 g5Var = this.f21170r;
        if (g5Var != null) {
            g5Var.n(this);
        }
        ns.e().n(this, ns.f25514i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        j0 j0Var = this.f21173x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.f10129g).x);
        int round2 = Math.round(((PointF) this.f21173x.f10129g).y);
        l lVar = this.f21172w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L;
        boolean z10;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        j0 j0Var = this.f21173x;
        if (j0Var == null || this.f21174y || j0Var.f10124a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            p0 p0Var = this.f21171s;
            int c10 = i20.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f21172w;
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
            int b10 = k5.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            ?? obj = new Object();
            obj.f10126c = new RectF();
            obj.d = new Path();
            obj.f10127e = new RectF();
            obj.f10128f = new RectF();
            obj.f10129g = new PointF();
            RectF rectF = (RectF) obj.f10127e;
            PointF pointF = (PointF) obj.f10129g;
            RectF rectF2 = (RectF) obj.f10128f;
            RectF rectF3 = (RectF) obj.f10126c;
            obj.f10124a = size;
            obj.f10125b = b10;
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
            this.f21173x = obj;
            this.d.A0(rectF);
            this.f21169n.A0((RectF) this.f21173x.f10128f);
            if (this.f21170r != null) {
                Rect rect = M;
                ((RectF) this.f21173x.f10128f).round(rect);
                this.f21170r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f21173x.f10125b);
        this.h.f40795f = Math.round(((RectF) this.f21173x.f10126c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21166c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        j1 j1Var = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(j1Var);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(j1Var);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.f21164a.a(groupCallMessage4.isSendDelayed(), false);
            this.f21165b.a(this.I.isSendError(), false);
        }
        TLObject e22 = np.s1(m10.f24934t0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        t8 t8Var = new t8((e6) null);
        t8Var.p(e22);
        this.d.i0(e22, t8Var, null);
        ImageReceiver imageReceiver = this.f21169n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f21170r != null && isAttachedToWindow()) {
            this.f21170r.n(this);
        }
        this.f21170r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new y31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        p0 p0Var = groupCallMessage.visibleReaction;
        l lVar = this.f21172w;
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
        } else if (p0Var.f5188f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(groupCallMessage.currentAccount).f26495r.get(groupCallMessage.visibleReaction.f5188f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(gc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (p0Var.f5189g != 0) {
            g5 g5Var = new g5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f5189g);
            this.f21170r = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f21170r.a(this);
            }
        }
        this.f21171s = groupCallMessage.visibleReaction;
        this.f21174y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f21167e.setColor(i7);
    }

    public void setDelegate(a aVar) {
        this.J = aVar;
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void E(float f10, int i7) {
    }

    @Override
    public final void s(float f10, float f11) {
    }

    @Override
    public final void e1(View view, float f10, float f11) {
    }

    @Override
    public final void n(View view, float f10, float f11) {
    }

    @Override
    public final void v(View view, float f10, float f11) {
    }
}
