package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class fja extends FrameLayout {
    public final de0 a;
    public final TextView b;
    public final a88 c;
    public final View d;
    public final og2 e;
    public final FrameLayout f;
    public AnimatorSet h;
    public r47 n;
    public final kja r;

    public fja(kja kjaVar, Context context) {
        super(context);
        this.r = kjaVar;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, tre.c(-1.0f, -1));
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.getImageReceiver().G0 = true;
        de0Var.getImageReceiver().H0 = true;
        frameLayout.addView(de0Var, tre.c(-1.0f, -1));
        a88 a88Var = new a88(context, (byte) 1);
        a88Var.b = new RectF();
        this.c = a88Var;
        a88Var.setWillNotDraw(false);
        a88Var.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        frameLayout.addView(a88Var, tre.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232565);
        a88Var.addView(imageView, tre.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        a88Var.addView(textView, tre.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
        og2 og2Var = new og2(21, null, context);
        this.e = og2Var;
        og2Var.setVisibility(4);
        og2Var.b(-1, aob.Ci, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(1);
        addView(og2Var, tre.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.e.a.q) {
            de0 de0Var = this.a;
            if (de0Var.getImageReceiver().B() && de0Var.getImageReceiver().i1 == 1.0f && !PhotoViewer.P0(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.D3()) {
            accessibilityNodeInfo.setText(ob6.M0(2131753955, null));
        } else if (r47.K4(this.n.k)) {
            accessibilityNodeInfo.setText(ob6.M0(2131753926, null) + ", " + ob6.z((int) this.n.L0()));
        } else {
            accessibilityNodeInfo.setText(ob6.M0(2131753941, null));
        }
        if (this.e.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(r47 r47Var) {
        int i;
        int i2;
        this.n = r47Var;
        this.a.getImageReceiver().v0(!PhotoViewer.P0(r47Var), false);
        if (!TextUtils.isEmpty(uc7.s1(this.r.s).E1(r47Var.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(2131232540);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (r47.K4(r47Var.k)) {
            this.c.setVisibility(0);
            this.b.setText(hl.g0((int) r47Var.L0(), false, false));
            TLRPC.Document F0 = r47Var.F0();
            TLRPC.PhotoSize w = xb4.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 320, false, null, false);
            if (w != w2) {
                photoSize = w2;
            }
            if (w != null) {
                BitmapDrawable bitmapDrawable = r47Var.I1;
                de0 de0Var = this.a;
                if (bitmapDrawable != null) {
                    de0Var.n(jn5.c(photoSize, F0), "100_100", null, r47Var.I1, r47Var);
                    return;
                } else {
                    de0Var.k(jn5.c(photoSize, F0), "100_100", jn5.c(w, F0), "b", a.b.getResources().getDrawable(2131232540), null, 0, r47Var);
                    return;
                }
            }
            this.a.setImageResource(2131232540);
            return;
        }
        TLRPC.MessageMedia messageMedia = r47Var.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !r47Var.p0.isEmpty()) {
            this.c.setVisibility(4);
            TLRPC.PhotoSize w3 = xb4.w(r47Var.p0, 50, false, null, false);
            TLRPC.PhotoSize w4 = xb4.w(r47Var.p0, 320, false, w3, false);
            if (!r47Var.z0 && !lq3.q(this.r.s).d(r47Var)) {
                BitmapDrawable bitmapDrawable2 = r47Var.I1;
                de0 de0Var2 = this.a;
                if (bitmapDrawable2 != null) {
                    de0Var2.k(null, null, null, null, bitmapDrawable2, null, 0, r47Var);
                    return;
                } else {
                    de0Var2.k(null, null, jn5.f(w3, r47Var.n0), "b", a.b.getResources().getDrawable(2131232540), null, 0, r47Var);
                    return;
                }
            }
            if (w4 != w3) {
                photoSize = w3;
            }
            BitmapDrawable bitmapDrawable3 = r47Var.I1;
            de0 de0Var3 = this.a;
            if (bitmapDrawable3 != null) {
                ImageReceiver imageReceiver = de0Var3.getImageReceiver();
                jn5 f = jn5.f(w4, r47Var.n0);
                long j = 0;
                BitmapDrawable bitmapDrawable4 = r47Var.I1;
                if (w4 != null) {
                    j = w4.size;
                }
                if (r47.Q5(r47Var.k)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                imageReceiver.Z(f, "100_100", null, null, bitmapDrawable4, j, null, r47Var, i2);
                return;
            }
            long j2 = 0;
            ImageReceiver imageReceiver2 = de0Var3.getImageReceiver();
            jn5 f2 = jn5.f(w4, r47Var.n0);
            jn5 f3 = jn5.f(photoSize, r47Var.n0);
            if (w4 != null) {
                j2 = w4.size;
            }
            if (r47.Q5(r47Var.k)) {
                i = 2;
            } else {
                i = 1;
            }
            imageReceiver2.Z(f2, "100_100", f3, "b", null, j2, null, r47Var, i);
            return;
        }
        this.c.setVisibility(4);
        this.a.setImageResource(2131232540);
    }
}
