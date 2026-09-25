package lh;

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
import ci.ac;
import i2.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.f0;
import org.telegram.messenger.ok;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s51;
import org.telegram.ui.c40;
import vh.n;
import zg.o0;
public final class c extends ViewGroup implements me.a, NotificationCenter.NotificationCenterDelegate, le.e {
    public static final Rect L = new Rect();
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ac J;
    public final RectF K;
    public final le.c f14333a;
    public final le.c f14334b;
    public final me.b f14335c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f14336f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f14337n;
    public q5 f14338r;
    public o0 f14339s;
    public final n v;
    public i0 f14340w;
    public boolean f14341x;
    public final h0 f14342y;

    public c(Context context) {
        super(context);
        rr rrVar = rr.h;
        this.f14333a = new le.c(0, this, rrVar, 320L, false);
        this.f14334b = new le.c(1, this, rrVar, 320L, false);
        this.f14335c = new me.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f14336f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f14342y = new h0(this, 11);
        this.J = new ac(this, 1);
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
        hVar.f29367c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f14337n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: lh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        this.f14336f.setAlpha(Math.round(this.f14334b.e * 100.0f));
        int round = Math.round(this.f14333a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f29365a.setAlpha(round);
        hVar.f29367c.setAlpha(round);
        invalidate();
    }

    public final int a(float f7, float f10) {
        i0 i0Var = this.f14340w;
        if (i0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) i0Var.e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f7, f10)) {
            return 1;
        }
        if (!((RectF) this.f14340w.f3014c).contains(f7, f10)) {
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
        i0 i0Var = this.f14340w;
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
                canvas.clipPath((Path) this.f14340w.d);
                canvas.translate(0.0f, -f7);
                float f10 = this.F;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f14336f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f14340w.d, paint);
            }
            if (this.f14333a.e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f14340w.f3014c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f14337n.draw(canvas);
            q5 q5Var = this.f14338r;
            if (q5Var != null) {
                q5Var.draw(canvas);
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
        i0 i0Var = this.f14340w;
        if (i0Var != null) {
            return ((RectF) i0Var.f3015f).centerX();
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
        this.f14337n.onAttachedToWindow();
        q5 q5Var = this.f14338r;
        if (q5Var != null) {
            q5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f14342y);
        }
    }

    @Override
    public final void onClickAt(View view, float f7, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) == 1 && (aVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((c40) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f14337n.onDetachedFromWindow();
        q5 q5Var = this.f14338r;
        if (q5Var != null) {
            q5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f14342y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i0 i0Var = this.f14340w;
        if (i0Var == null) {
            return;
        }
        int round = Math.round(((PointF) i0Var.f3016g).x);
        int round2 = Math.round(((PointF) this.f14340w.f3016g).y);
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
        i0 i0Var = this.f14340w;
        if (i0Var == null || this.f14341x || i0Var.f3012a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.f14339s;
            int c10 = ok.c(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            n nVar = this.v;
            nVar.measure(c10, makeMeasureSpec);
            float measuredWidth = nVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int y3 = f0.y(8.0f, nVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            ?? obj = new Object();
            obj.f3014c = new RectF();
            obj.d = new Path();
            obj.e = new RectF();
            obj.f3015f = new RectF();
            obj.f3016g = new PointF();
            RectF rectF = (RectF) obj.e;
            PointF pointF = (PointF) obj.f3016g;
            RectF rectF2 = (RectF) obj.f3015f;
            RectF rectF3 = (RectF) obj.f3014c;
            obj.f3012a = size;
            obj.f3013b = y3;
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
            this.f14340w = obj;
            this.d.setImageCoords(rectF);
            this.f14337n.setImageCoords((RectF) this.f14340w.f3015f);
            if (this.f14338r != null) {
                Rect rect = L;
                ((RectF) this.f14340w.f3015f).round(rect);
                this.f14338r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f14340w.f3013b);
        this.h.f29368f = Math.round(((RectF) this.f14340w.f3014c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f14335c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        h0 h0Var = this.f14342y;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(h0Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(h0Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f14333a.a(groupCallMessage4.isSendDelayed(), false);
            this.f14334b.a(this.H.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        h9 h9Var = new h9((d6) null);
        h9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, h9Var);
        ImageReceiver imageReceiver = this.f14337n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f14338r != null && isAttachedToWindow()) {
            this.f14338r.o(this);
        }
        this.f14338r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        n nVar = this.v;
        if (o0Var == null) {
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
        } else if (o0Var.f49397f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f49397f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.f49398g != 0) {
            q5 q5Var = new q5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f49398g);
            this.f14338r = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f14338r.a(this);
            }
        }
        this.f14339s = groupCallMessage.visibleReaction;
        this.f14341x = true;
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
    public final void C(float f7, int i10) {
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
