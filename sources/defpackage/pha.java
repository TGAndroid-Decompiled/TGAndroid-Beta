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
public final class pha extends FrameLayout {
    public final bf0 a;
    public final TextView b;
    public final n68 c;
    public final View d;
    public final jh2 e;
    public final FrameLayout f;
    public AnimatorSet h;
    public k47 n;
    public final tha r;

    public pha(tha thaVar, Context context) {
        super(context);
        this.r = thaVar;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, qoe.c(-1.0f, -1));
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.getImageReceiver().G0 = true;
        bf0Var.getImageReceiver().H0 = true;
        frameLayout.addView(bf0Var, qoe.c(-1.0f, -1));
        n68 n68Var = new n68(context, (byte) 1);
        n68Var.b = new RectF();
        this.c = n68Var;
        n68Var.setWillNotDraw(false);
        n68Var.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        frameLayout.addView(n68Var, qoe.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232566);
        n68Var.addView(imageView, qoe.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n68Var.addView(textView, qoe.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
        jh2 jh2Var = new jh2(21, null, context);
        this.e = jh2Var;
        jh2Var.setVisibility(4);
        jh2Var.b(-1, cmb.Bi, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(1);
        addView(jh2Var, qoe.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
            bf0 bf0Var = this.a;
            if (bf0Var.getImageReceiver().B() && bf0Var.getImageReceiver().i1 == 1.0f && !PhotoViewer.P0(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.D3()) {
            accessibilityNodeInfo.setText(jb6.M0(2131753927, null));
        } else if (k47.K4(this.n.k)) {
            accessibilityNodeInfo.setText(jb6.M0(2131753898, null) + ", " + jb6.z((int) this.n.L0()));
        } else {
            accessibilityNodeInfo.setText(jb6.M0(2131753913, null));
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

    public void setMessageObject(k47 k47Var) {
        int i;
        int i2;
        this.n = k47Var;
        this.a.getImageReceiver().v0(!PhotoViewer.P0(k47Var), false);
        if (!TextUtils.isEmpty(oc7.r1(this.r.s).D1(k47Var.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(2131232541);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (k47.K4(k47Var.k)) {
            this.c.setVisibility(0);
            this.b.setText(gm.g0((int) k47Var.L0(), false, false));
            TLRPC.Document F0 = k47Var.F0();
            TLRPC.PhotoSize w = bc4.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(F0.thumbs, 320, false, null, false);
            if (w != w2) {
                photoSize = w2;
            }
            if (w != null) {
                BitmapDrawable bitmapDrawable = k47Var.I1;
                bf0 bf0Var = this.a;
                if (bitmapDrawable != null) {
                    bf0Var.n(gn5.c(photoSize, F0), "100_100", null, k47Var.I1, k47Var);
                    return;
                } else {
                    bf0Var.k(gn5.c(photoSize, F0), "100_100", gn5.c(w, F0), "b", a.b.getResources().getDrawable(2131232541), null, 0, k47Var);
                    return;
                }
            }
            this.a.setImageResource(2131232541);
            return;
        }
        TLRPC.MessageMedia messageMedia = k47Var.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !k47Var.p0.isEmpty()) {
            this.c.setVisibility(4);
            TLRPC.PhotoSize w3 = bc4.w(k47Var.p0, 50, false, null, false);
            TLRPC.PhotoSize w4 = bc4.w(k47Var.p0, 320, false, w3, false);
            if (!k47Var.z0 && !er3.q(this.r.s).d(k47Var)) {
                BitmapDrawable bitmapDrawable2 = k47Var.I1;
                bf0 bf0Var2 = this.a;
                if (bitmapDrawable2 != null) {
                    bf0Var2.k(null, null, null, null, bitmapDrawable2, null, 0, k47Var);
                    return;
                } else {
                    bf0Var2.k(null, null, gn5.f(w3, k47Var.n0), "b", a.b.getResources().getDrawable(2131232541), null, 0, k47Var);
                    return;
                }
            }
            if (w4 != w3) {
                photoSize = w3;
            }
            BitmapDrawable bitmapDrawable3 = k47Var.I1;
            bf0 bf0Var3 = this.a;
            if (bitmapDrawable3 != null) {
                ImageReceiver imageReceiver = bf0Var3.getImageReceiver();
                gn5 f = gn5.f(w4, k47Var.n0);
                long j = 0;
                BitmapDrawable bitmapDrawable4 = k47Var.I1;
                if (w4 != null) {
                    j = w4.size;
                }
                if (k47.Q5(k47Var.k)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                imageReceiver.Z(f, "100_100", null, null, bitmapDrawable4, j, null, k47Var, i2);
                return;
            }
            long j2 = 0;
            ImageReceiver imageReceiver2 = bf0Var3.getImageReceiver();
            gn5 f2 = gn5.f(w4, k47Var.n0);
            gn5 f3 = gn5.f(photoSize, k47Var.n0);
            if (w4 != null) {
                j2 = w4.size;
            }
            if (k47.Q5(k47Var.k)) {
                i = 2;
            } else {
                i = 1;
            }
            imageReceiver2.Z(f2, "100_100", f3, "b", null, j2, null, k47Var, i);
            return;
        }
        this.c.setVisibility(4);
        this.a.setImageResource(2131232541);
    }
}
