package mh;

import ah.j1;
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
import di.ec;
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
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.h40;
import wh.p;
public final class c extends ViewGroup implements me.a, NotificationCenter.NotificationCenterDelegate, le.d {
    public static final Rect L = new Rect();
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ec J;
    public final RectF K;
    public final le.b f16314a;
    public final le.b f16315b;
    public final me.b f16316c;
    public final ImageReceiver d;
    public final Paint f16317e;
    public final Paint f16318f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver f16319n;
    public q5 f16320r;
    public j1 f16321s;
    public final p v;
    public i0 f16322w;
    public boolean f16323x;
    public final t0 f16324y;

    public c(Context context) {
        super(context);
        pr prVar = pr.h;
        this.f16314a = new le.b(0, this, prVar, 320L, false);
        this.f16315b = new le.b(1, this, prVar, 320L, false);
        this.f16316c = new me.b(this);
        Paint paint = new Paint(1);
        this.f16317e = paint;
        Paint paint2 = new Paint(1);
        this.f16318f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.f16324y = new t0(this, 14);
        this.J = new ec(this, 1);
        this.K = new RectF();
        p pVar = new p(context);
        this.v = pVar;
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
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.f31501c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f16319n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: mh.c.b(java.lang.CharSequence):boolean");
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        this.f16318f.setAlpha(Math.round(this.f16315b.f15368e * 100.0f));
        int round = Math.round(this.f16314a.f15368e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.f31499a.setAlpha(round);
        hVar.f31501c.setAlpha(round);
        invalidate();
    }

    public final int a(float f7, float f10) {
        i0 i0Var = this.f16322w;
        if (i0Var == null) {
            return -1;
        }
        RectF rectF = this.K;
        rectF.set((RectF) i0Var.f2067e);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f7, f10)) {
            return 1;
        }
        if (!((RectF) this.f16322w.f2066c).contains(f7, f10)) {
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
        i0 i0Var = this.f16322w;
        if (i0Var != null) {
            canvas.drawPath((Path) i0Var.d, this.f16317e);
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
                canvas.clipPath((Path) this.f16322w.d);
                canvas.translate(0.0f, -f7);
                float f10 = this.F;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(this.E);
                canvas.restore();
            }
            Paint paint = this.f16318f;
            if (paint.getAlpha() > 0) {
                canvas.drawPath((Path) this.f16322w.d, paint);
            }
            if (this.f16314a.f15368e > 0.0f) {
                RectF rectF = this.K;
                rectF.set((RectF) this.f16322w.f2066c);
                rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF, null);
                invalidate();
            }
            super.dispatchDraw(canvas);
            this.d.draw(canvas);
            this.f16319n.draw(canvas);
            q5 q5Var = this.f16320r;
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
        i0 i0Var = this.f16322w;
        if (i0Var != null) {
            return ((RectF) i0Var.f2068f).centerX();
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
        this.f16319n.onAttachedToWindow();
        q5 q5Var = this.f16320r;
        if (q5Var != null) {
            q5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.f16324y);
        }
    }

    @Override
    public final void onClickAt(View view, float f7, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) == 1 && (aVar = this.I) != null && (groupCallMessage = this.H) != null) {
            ((h40) aVar).a(groupCallMessage);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f16319n.onDetachedFromWindow();
        q5 q5Var = this.f16320r;
        if (q5Var != null) {
            q5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.f16324y);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i0 i0Var = this.f16322w;
        if (i0Var == null) {
            return;
        }
        int round = Math.round(((PointF) i0Var.f2069g).x);
        int round2 = Math.round(((PointF) this.f16322w.f2069g).y);
        p pVar = this.v;
        pVar.layout(round, round2, pVar.getMeasuredWidth() + round, pVar.getMeasuredHeight() + round2);
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
        i0 i0Var = this.f16322w;
        if (i0Var == null || this.f16323x || i0Var.f2064a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            j1 j1Var = this.f16321s;
            int d = wl.d(44.0f, (size - paddingLeft) - paddingRight, Integer.MIN_VALUE);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            p pVar = this.v;
            pVar.measure(d, makeMeasureSpec);
            float measuredWidth = pVar.getMeasuredWidth();
            if (j1Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int b10 = w1.b(8.0f, pVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            ?? obj = new Object();
            obj.f2066c = new RectF();
            obj.d = new Path();
            obj.f2067e = new RectF();
            obj.f2068f = new RectF();
            obj.f2069g = new PointF();
            RectF rectF = (RectF) obj.f2067e;
            PointF pointF = (PointF) obj.f2069g;
            RectF rectF2 = (RectF) obj.f2068f;
            RectF rectF3 = (RectF) obj.f2066c;
            obj.f2064a = size;
            obj.f2065b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) obj.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            if (pVar.getLayout().getParagraphDirection(0) == -1) {
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
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - pVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.f16322w = obj;
            this.d.setImageCoords(rectF);
            this.f16319n.setImageCoords((RectF) this.f16322w.f2068f);
            if (this.f16320r != null) {
                Rect rect = L;
                ((RectF) this.f16322w.f2068f).round(rect);
                this.f16320r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.f16322w.f2065b);
        this.h.f31503f = Math.round(((RectF) this.f16322w.f2066c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f16316c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        char c10;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        t0 t0Var = this.f16324y;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(t0Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(t0Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.f16314a.a(groupCallMessage4.isSendDelayed(), false);
            this.f16315b.a(this.H.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        i9 i9Var = new i9((f6) null);
        i9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, i9Var);
        ImageReceiver imageReceiver = this.f16319n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.f16320r != null && isAttachedToWindow()) {
            this.f16320r.o(this);
        }
        this.f16320r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        j1 j1Var = groupCallMessage.visibleReaction;
        p pVar = this.v;
        if (j1Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, pVar.getPaint());
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
        } else if (j1Var.f597f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f597f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (j1Var.f598g != 0) {
            q5 q5Var = new q5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.f598g);
            this.f16320r = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.f16320r.a(this);
            }
        }
        this.f16321s = groupCallMessage.visibleReaction;
        this.f16323x = true;
        pVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f16317e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.I = aVar;
    }

    @Override
    public final void z(float f7, int i10) {
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
