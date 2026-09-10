package kh;

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
import b2.i0;
import bi.pd;
import gg.v1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.a2;
import org.telegram.messenger.em;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.i40;
import uh.o;
import yg.p0;
public final class c extends ViewGroup implements me.a, NotificationCenter.NotificationCenterDelegate, le.d {
    public static final Rect L = new Rect();
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final pd J;
    public final RectF K;
    public final le.b f12505a;
    public final le.b f12506b;
    public final me.b f12507c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f12508f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f12509n;
    public p5 f12510r;
    public p0 f12511s;
    public final o v;
    public i0 f12512w;
    public boolean f12513x;
    public final v1 f12514y;

    public c(Context context) {
        super(context);
        wr wrVar = wr.h;
        this.f12505a = new le.b(0, this, wrVar, 320L, false);
        this.f12506b = new le.b(1, this, wrVar, 320L, false);
        this.f12507c = new me.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f12508f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f12514y = new v1(this, 17);
        this.J = new pd(this, 1);
        this.K = new RectF();
        o oVar = new o(context);
        this.v = oVar;
        oVar.setDisablePaddingsOffset(true);
        oVar.setTextSize(14.0f);
        oVar.setTextColor(-1);
        oVar.setLinkTextColor(-11683585);
        oVar.setHintTextColor(-1);
        addView(oVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.f28146c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f12509n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: kh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        this.f12508f.setAlpha(Math.round(this.f12506b.e * 100.0f));
        int round = Math.round(this.f12505a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f28144a.setAlpha(round);
        hVar.f28146c.setAlpha(round);
        invalidate();
    }

    public final int a(float f7, float f10) {
        i0 i0Var = this.f12512w;
        if (i0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) i0Var.e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f7, f10)) {
            return 1;
        }
        if (!((RectF) this.f12512w.f1715c).contains(f7, f10)) {
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
        i0 i0Var = this.f12512w;
        if (i0Var != null) {
            canvas.drawPath((Path) i0Var.d, this.e);
            if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
                float f7 = 0.0f;
                View view = this;
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
                canvas.clipPath((Path) this.f12512w.d);
                canvas.translate(0.0f, -f7);
                float f10 = this.F;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f12508f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f12512w.d, paint);
            }
            if (this.f12505a.e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f12512w.f1715c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f12509n.draw(canvas);
            p5 p5Var = this.f12510r;
            if (p5Var != null) {
                p5Var.draw(canvas);
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
        i0 i0Var = this.f12512w;
        if (i0Var != null) {
            return ((RectF) i0Var.f1716f).centerX();
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
        this.f12509n.onAttachedToWindow();
        p5 p5Var = this.f12510r;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f12514y);
        }
    }

    @Override
    public final void onClickAt(View view, float f7, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) == 1 && (aVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((i40) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f12509n.onDetachedFromWindow();
        p5 p5Var = this.f12510r;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f12514y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i0 i0Var = this.f12512w;
        if (i0Var == null) {
            return;
        }
        int round = Math.round(((PointF) i0Var.f1717g).x);
        int round2 = Math.round(((PointF) this.f12512w.f1717g).y);
        o oVar = this.v;
        oVar.layout(round, round2, oVar.getMeasuredWidth() + round, oVar.getMeasuredHeight() + round2);
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
        i0 i0Var = this.f12512w;
        if (i0Var == null || this.f12513x || i0Var.f1713a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            p0 p0Var = this.f12511s;
            int d = em.d(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            o oVar = this.v;
            oVar.measure(d, makeMeasureSpec);
            float measuredWidth = oVar.getMeasuredWidth();
            if (p0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int b10 = a2.b(8.0f, oVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            ?? obj = new Object();
            obj.f1715c = new RectF();
            obj.d = new Path();
            obj.e = new RectF();
            obj.f1716f = new RectF();
            obj.f1717g = new PointF();
            RectF rectF = (RectF) obj.e;
            PointF pointF = (PointF) obj.f1717g;
            RectF rectF2 = (RectF) obj.f1716f;
            RectF rectF3 = (RectF) obj.f1715c;
            obj.f1713a = size;
            obj.f1714b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (oVar.getLayout().getParagraphDirection(0) == -1) {
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
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - oVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f12512w = obj;
            this.d.setImageCoords(rectF);
            this.f12509n.setImageCoords((RectF) this.f12512w.f1716f);
            if (this.f12510r != null) {
                Rect rect = L;
                ((RectF) this.f12512w.f1716f).round(rect);
                this.f12510r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f12512w.f1714b);
        this.h.f28147f = Math.round(((RectF) this.f12512w.f1715c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f12507c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        v1 v1Var = this.f12514y;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(v1Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(v1Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f12505a.a(groupCallMessage4.isSendDelayed(), false);
            this.f12506b.a(this.H.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        g9 g9Var = new g9((f6) null);
        g9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, g9Var);
        ImageReceiver imageReceiver = this.f12509n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f12510r != null && isAttachedToWindow()) {
            this.f12510r.o(this);
        }
        this.f12510r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        p0 p0Var = groupCallMessage.visibleReaction;
        o oVar = this.v;
        if (p0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, oVar.getPaint());
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
        } else if (p0Var.f47101f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f47101f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (p0Var.f47102g != 0) {
            p5 p5Var = new p5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f47102g);
            this.f12510r = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f12510r.a(this);
            }
        }
        this.f12511s = groupCallMessage.visibleReaction;
        this.f12513x = true;
        oVar.setText(spannableStringBuilder);
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
    public final void B(float f7, int i10) {
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
