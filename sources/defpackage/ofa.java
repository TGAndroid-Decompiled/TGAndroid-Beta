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
public final class ofa extends FrameLayout {
    public final be0 a;
    public final TextView b;
    public final k48 c;
    public final View d;
    public final wf2 e;
    public final FrameLayout f;
    public AnimatorSet h;
    public k27 n;
    public final rfa r;

    public ofa(rfa rfaVar, Context context) {
        super(context);
        this.r = rfaVar;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, nme.c(-1.0f, -1));
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.getImageReceiver().G0 = true;
        be0Var.getImageReceiver().H0 = true;
        frameLayout.addView(be0Var, nme.c(-1.0f, -1));
        k48 k48Var = new k48(context, (byte) 1);
        k48Var.b = new RectF();
        this.c = k48Var;
        k48Var.setWillNotDraw(false);
        k48Var.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        frameLayout.addView(k48Var, nme.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232554);
        k48Var.addView(imageView, nme.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        k48Var.addView(textView, nme.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(bkb.L0(false));
        addView(view, nme.c(-1.0f, -1));
        wf2 wf2Var = new wf2(21, null, context);
        this.e = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.Bi, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(1);
        addView(wf2Var, nme.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
            be0 be0Var = this.a;
            if (be0Var.getImageReceiver().B() && be0Var.getImageReceiver().i1 == 1.0f && !PhotoViewer.O0(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.D3()) {
            accessibilityNodeInfo.setText(k96.M0(2131753959, null));
        } else if (k27.K4(this.n.k)) {
            accessibilityNodeInfo.setText(k96.M0(2131753930, null) + ", " + k96.z((int) this.n.L0()));
        } else {
            accessibilityNodeInfo.setText(k96.M0(2131753945, null));
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

    public void setMessageObject(k27 k27Var) {
        int i;
        int i2;
        this.n = k27Var;
        this.a.getImageReceiver().v0(!PhotoViewer.O0(k27Var), false);
        if (!TextUtils.isEmpty(na7.q1(this.r.s).C1(k27Var.k.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(2131232529);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (k27.K4(k27Var.k)) {
            this.c.setVisibility(0);
            this.b.setText(gl.g0((int) k27Var.L0(), false, false));
            TLRPC.Document F0 = k27Var.F0();
            TLRPC.PhotoSize w = ba4.w(F0.thumbs, 50, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(F0.thumbs, 320, false, null, false);
            if (w != w2) {
                photoSize = w2;
            }
            if (w != null) {
                BitmapDrawable bitmapDrawable = k27Var.I1;
                be0 be0Var = this.a;
                if (bitmapDrawable != null) {
                    be0Var.n(gl5.c(photoSize, F0), "100_100", null, k27Var.I1, k27Var);
                    return;
                } else {
                    be0Var.k(gl5.c(photoSize, F0), "100_100", gl5.c(w, F0), "b", a.b.getResources().getDrawable(2131232529), null, 0, k27Var);
                    return;
                }
            }
            this.a.setImageResource(2131232529);
            return;
        }
        TLRPC.MessageMedia messageMedia = k27Var.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !k27Var.p0.isEmpty()) {
            this.c.setVisibility(4);
            TLRPC.PhotoSize w3 = ba4.w(k27Var.p0, 50, false, null, false);
            TLRPC.PhotoSize w4 = ba4.w(k27Var.p0, 320, false, w3, false);
            if (!k27Var.z0 && !up3.q(this.r.s).d(k27Var)) {
                BitmapDrawable bitmapDrawable2 = k27Var.I1;
                be0 be0Var2 = this.a;
                if (bitmapDrawable2 != null) {
                    be0Var2.k(null, null, null, null, bitmapDrawable2, null, 0, k27Var);
                    return;
                } else {
                    be0Var2.k(null, null, gl5.f(w3, k27Var.n0), "b", a.b.getResources().getDrawable(2131232529), null, 0, k27Var);
                    return;
                }
            }
            if (w4 != w3) {
                photoSize = w3;
            }
            BitmapDrawable bitmapDrawable3 = k27Var.I1;
            be0 be0Var3 = this.a;
            if (bitmapDrawable3 != null) {
                ImageReceiver imageReceiver = be0Var3.getImageReceiver();
                gl5 f = gl5.f(w4, k27Var.n0);
                long j = 0;
                BitmapDrawable bitmapDrawable4 = k27Var.I1;
                if (w4 != null) {
                    j = w4.size;
                }
                if (k27.Q5(k27Var.k)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                imageReceiver.Z(f, "100_100", null, null, bitmapDrawable4, j, null, k27Var, i2);
                return;
            }
            long j2 = 0;
            ImageReceiver imageReceiver2 = be0Var3.getImageReceiver();
            gl5 f2 = gl5.f(w4, k27Var.n0);
            gl5 f3 = gl5.f(photoSize, k27Var.n0);
            if (w4 != null) {
                j2 = w4.size;
            }
            if (k27.Q5(k27Var.k)) {
                i = 2;
            } else {
                i = 1;
            }
            imageReceiver2.Z(f2, "100_100", f3, "b", null, j2, null, k27Var, i);
            return;
        }
        this.c.setVisibility(4);
        this.a.setImageResource(2131232529);
    }
}
