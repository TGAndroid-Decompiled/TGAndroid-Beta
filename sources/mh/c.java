package mh;

import ah.i1;
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
import b2.n0;
import di.zb;
import ig.t0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.g0;
import org.telegram.messenger.sk;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.l40;
import wh.n;
public final class c extends ViewGroup implements oe.a, NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final Rect L = new Rect();
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final zb J;
    public final RectF K;
    public final ne.b f15569a;
    public final ne.b f15570b;
    public final oe.b f15571c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f15572f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f15573n;
    public s5 f15574r;
    public i1 f15575s;
    public final n v;
    public n0 f15576w;
    public boolean f15577x;
    public final t0 f15578y;

    public c(Context context) {
        super(context);
        es esVar = es.h;
        this.f15569a = new ne.b(0, this, esVar, 320L, false);
        this.f15570b = new ne.b(1, this, esVar, 320L, false);
        this.f15571c = new oe.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f15572f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f15578y = new t0(this, 16);
        this.J = new zb(this, 1);
        this.K = new RectF();
        n nVar = new n(context);
        this.v = nVar;
        nVar.setDisablePaddingsOffset(true);
        nVar.setTextSize(14.0f);
        nVar.setTextColor(-1);
        nVar.setLinkTextColor(-11683585);
        nVar.setHintTextColor(-1);
        addView(nVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.f29864c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f15573n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: mh.c.b(java.lang.CharSequence):boolean");
    }

    public final int a(float f7, float f10) {
        n0 n0Var = this.f15576w;
        if (n0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) n0Var.e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f7, f10)) {
            return 1;
        }
        if (!((RectF) this.f15576w.f2226c).contains(f7, f10)) {
            return -1;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n0 n0Var = this.f15576w;
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
                canvas.clipPath((Path) this.f15576w.d);
                canvas.translate(0.0f, -f7);
                float f10 = this.F;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f15572f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f15576w.d, paint);
            }
            if (this.f15569a.e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f15576w.f2226c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f15573n.draw(canvas);
            s5 s5Var = this.f15574r;
            if (s5Var != null) {
                s5Var.draw(canvas);
            }
        }
    }

    @Override
    public final boolean forceEnableVibration() {
        return false;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.H;
    }

    public float getReactionCenterX() {
        n0 n0Var = this.f15576w;
        if (n0Var != null) {
            return ((RectF) n0Var.f2227f).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public final boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public final boolean needClickAt(View view, float f7, float f10) {
        if (a(f7, f10) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f15573n.onAttachedToWindow();
        s5 s5Var = this.f15574r;
        if (s5Var != null) {
            s5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f15578y);
        }
    }

    @Override
    public final void onClickAt(View view, float f7, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) == 1 && (aVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((l40) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f15573n.onDetachedFromWindow();
        s5 s5Var = this.f15574r;
        if (s5Var != null) {
            s5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f15578y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n0 n0Var = this.f15576w;
        if (n0Var == null) {
            return;
        }
        int round = Math.round(((PointF) n0Var.f2228g).x);
        int round2 = Math.round(((PointF) this.f15576w.f2228g).y);
        n nVar = this.v;
        nVar.layout(round, round2, nVar.getMeasuredWidth() + round, nVar.getMeasuredHeight() + round2);
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        boolean z10;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        n0 n0Var = this.f15576w;
        if (n0Var == null || this.f15577x || n0Var.f2224a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            i1 i1Var = this.f15575s;
            int c10 = sk.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            n nVar = this.v;
            nVar.measure(c10, makeMeasureSpec);
            float measuredWidth = nVar.getMeasuredWidth();
            if (i1Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int y3 = g0.y(8.0f, nVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            ?? obj = new Object();
            obj.f2226c = new RectF();
            obj.d = new Path();
            obj.e = new RectF();
            obj.f2227f = new RectF();
            obj.f2228g = new PointF();
            RectF rectF = (RectF) obj.e;
            PointF pointF = (PointF) obj.f2228g;
            RectF rectF2 = (RectF) obj.f2227f;
            RectF rectF3 = (RectF) obj.f2226c;
            obj.f2224a = size;
            obj.f2225b = y3;
            rectF3.set(0.0f, 0.0f, i12, y3);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (nVar.getLayout().getParagraphDirection(0) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z10) {
                f7 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f7 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            if (z10) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - nVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f15576w = obj;
            this.d.setImageCoords(rectF);
            this.f15573n.setImageCoords((RectF) this.f15576w.f2227f);
            if (this.f15574r != null) {
                Rect rect = L;
                ((RectF) this.f15576w.f2227f).round(rect);
                this.f15574r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f15576w.f2225b);
        this.h.f29865f = Math.round(((RectF) this.f15576w.f2226c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15571c.a(motionEvent, this);
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        this.f15572f.setAlpha(Math.round(this.f15570b.e * 100.0f));
        int round = Math.round(this.f15569a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f29862a.setAlpha(round);
        hVar.f29864c.setAlpha(round);
        invalidate();
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        t0 t0Var = this.f15578y;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(t0Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(t0Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f15569a.a(groupCallMessage4.isSendDelayed(), false);
            this.f15570b.a(this.H.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        k9 k9Var = new k9((c6) null);
        k9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, k9Var);
        ImageReceiver imageReceiver = this.f15573n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f15574r != null && isAttachedToWindow()) {
            this.f15574r.o(this);
        }
        this.f15574r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        i1 i1Var = groupCallMessage.visibleReaction;
        n nVar = this.v;
        if (i1Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, nVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(formatTextWithEntities);
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
            spannableStringBuilder2.append(formatTextWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (i1Var.f783f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f783f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (i1Var.f784g != 0) {
            s5 s5Var = new s5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f784g);
            this.f15574r = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f15574r.a(this);
            }
        }
        this.f15575s = groupCallMessage.visibleReaction;
        this.f15577x = true;
        nVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.I = aVar;
    }

    @Override
    public final void A(float f7, int i10) {
    }

    @Override
    public final void onClickTouchDown(View view, float f7, float f10) {
    }

    @Override
    public final void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public final void onClickTouchUp(View view, float f7, float f10) {
    }

    @Override
    public final void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public final void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public final void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
