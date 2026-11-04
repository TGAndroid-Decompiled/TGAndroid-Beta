package oh;

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
import d2.l0;
import dh.n0;
import gi.ka;
import lg.n;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b20;
import yh.l;
public final class c extends ViewGroup implements re.a, cs, qe.b {
    public static final Rect M = new Rect();
    public final n E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public a J;
    public final ka K;
    public final RectF L;
    public final qe.a f21111a;
    public final qe.a f21112b;
    public final k9 f21113c;
    public final ImageReceiver d;
    public final Paint f21114e;
    public final Paint f21115f;
    public final org.telegram.ui.Components.voip.g h;
    public final ImageReceiver f21116n;
    public g5 f21117r;
    public n0 f21118s;
    public final l f21119w;
    public l0 f21120x;
    public boolean f21121y;

    public c(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.f21111a = new qe.a(0, this, xqVar, 320L, false);
        this.f21112b = new qe.a(1, this, xqVar, 320L, false);
        this.f21113c = new k9(this);
        Paint paint = new Paint(1);
        this.f21114e = paint;
        Paint paint2 = new Paint(1);
        this.f21115f = paint2;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.h = gVar;
        this.E = new n(this, 17);
        this.K = new ka(this, 1);
        this.L = new RectF();
        l lVar = new l(context);
        this.f21119w = lVar;
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
        gVar.f39347c.setStrokeWidth(g0.L(1.0f));
        this.f21116n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: oh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void O(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) == 1 && (aVar = this.J) != null && (groupCallMessage = this.I) != null) {
            ((b20) aVar).a(groupCallMessage);
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
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f21115f.setAlpha(Math.round(this.f21112b.f53840e * 100.0f));
        int round = Math.round(this.f21111a.f53840e * 220.0f);
        org.telegram.ui.Components.voip.g gVar = this.h;
        gVar.f39345a.setAlpha(round);
        gVar.f39347c.setAlpha(round);
        invalidate();
    }

    @Override
    public final boolean Z0(View view, float f10, float f11) {
        return false;
    }

    public final int a(float f10, float f11) {
        l0 l0Var = this.f21120x;
        if (l0Var == null) {
            return -1;
        }
        RectF rectF = this.L;
        rectF.set((RectF) l0Var.f8176e);
        rectF.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF.contains(f10, f11)) {
            return 1;
        }
        if (!((RectF) this.f21120x.f8175c).contains(f10, f11)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23246i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l0 l0Var = this.f21120x;
        if (l0Var != null) {
            canvas.drawPath((Path) l0Var.d, this.f21114e);
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
                canvas.clipPath((Path) this.f21120x.d);
                canvas.translate(0.0f, -f10);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(this.F);
                canvas.restore();
            }
            Paint paint = this.f21115f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f21120x.d, paint);
            }
            if (this.f21111a.f53840e > 0.0f) {
                RectF rectF = this.L;
                rectF.set((RectF) this.f21120x.f8175c);
                rectF.inset(g0.L(1.0f), g0.L(1.0f));
                this.h.a(g0.L(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.h(canvas, null);
            this.f21116n.h(canvas, null);
            g5 g5Var = this.f21117r;
            if (g5Var != null) {
                g5Var.draw(canvas);
            }
        }
    }

    @Override
    public final boolean g0() {
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
        l0 l0Var = this.f21120x;
        if (l0Var != null) {
            return ((RectF) l0Var.f8177f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f21116n.P();
        g5 g5Var = this.f21117r;
        if (g5Var != null) {
            g5Var.a(this);
        }
        hs.e().c(this, hs.f23246i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f21116n.R();
        g5 g5Var = this.f21117r;
        if (g5Var != null) {
            g5Var.n(this);
        }
        hs.e().n(this, hs.f23246i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        l0 l0Var = this.f21120x;
        if (l0Var == null) {
            return;
        }
        int round = Math.round(((PointF) l0Var.f8178g).x);
        int round2 = Math.round(((PointF) this.f21120x.f8178g).y);
        l lVar = this.f21119w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int ceil;
        int L;
        boolean z10;
        float f10;
        int size = View.MeasureSpec.getSize(i3);
        l0 l0Var = this.f21120x;
        if (l0Var == null || this.f21121y || l0Var.f8173a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            n0 n0Var = this.f21118s;
            int c2 = q.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.f21119w;
            lVar.measure(c2, makeMeasureSpec);
            float measuredWidth = lVar.getMeasuredWidth();
            if (n0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(70.0f);
            }
            int i11 = L + ceil;
            int b10 = k5.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            ?? obj = new Object();
            obj.f8175c = new RectF();
            obj.d = new Path();
            obj.f8176e = new RectF();
            obj.f8177f = new RectF();
            obj.f8178g = new PointF();
            RectF rectF = (RectF) obj.f8176e;
            PointF pointF = (PointF) obj.f8178g;
            RectF rectF2 = (RectF) obj.f8177f;
            RectF rectF3 = (RectF) obj.f8175c;
            obj.f8173a = size;
            obj.f8174b = b10;
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
            this.f21120x = obj;
            this.d.A0(rectF);
            this.f21116n.A0((RectF) this.f21120x.f8177f);
            if (this.f21117r != null) {
                Rect rect = M;
                ((RectF) this.f21120x.f8177f).round(rect);
                this.f21117r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f21120x.f8174b);
        this.h.f39349f = Math.round(((RectF) this.f21120x.f8175c).width() + g0.L(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f21113c.a(this, motionEvent);
    }

    @Override
    public final boolean s1() {
        return false;
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c2;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        n nVar = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(nVar);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(nVar);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.f21111a.a(groupCallMessage4.isSendDelayed(), false);
            this.f21112b.a(this.I.isSendError(), false);
        }
        TLObject e22 = hp.s1(h10.f22829t0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        u8 u8Var = new u8((e6) null);
        u8Var.p(e22);
        this.d.i0(e22, u8Var, null);
        ImageReceiver imageReceiver = this.f21116n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.f21117r != null && isAttachedToWindow()) {
            this.f21117r.n(this);
        }
        this.f21117r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        n0 n0Var = groupCallMessage.visibleReaction;
        l lVar = this.f21119w;
        if (n0Var == null) {
            CharSequence j02 = zi.j0(groupCallMessage.message, false, true, lVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(j02);
            if (b10 != b11) {
                if (b11) {
                    c2 = 8295;
                } else {
                    c2 = 8294;
                }
                spannableStringBuilder2.append(c2);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(j02);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (n0Var.f9097f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(groupCallMessage.currentAccount).f24045r.get(groupCallMessage.visibleReaction.f9097f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(ac.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (n0Var.f9098g != 0) {
            g5 g5Var = new g5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f9098g);
            this.f21117r = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f21117r.a(this);
            }
        }
        this.f21118s = groupCallMessage.visibleReaction;
        this.f21121y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.f21114e.setColor(i3);
    }

    public void setDelegate(a aVar) {
        this.J = aVar;
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void F(float f10, int i3) {
    }

    @Override
    public final void t(float f10, float f11) {
    }

    @Override
    public final void o(View view, float f10, float f11) {
    }

    @Override
    public final void o1(View view, float f10, float f11) {
    }

    @Override
    public final void x(View view, float f10, float f11) {
    }
}
