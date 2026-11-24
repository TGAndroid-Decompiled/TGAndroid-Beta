package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class y0b extends FrameLayout implements jm7, s59 {
    public static final AccelerateInterpolator O = new AccelerateInterpolator(0.5f);
    public boolean E;
    public final int F;
    public final boolean G;
    public boolean H;
    public final float I;
    public boolean J;
    public final ImageView K;
    public int L;
    public boolean M;
    public final ylb N;
    public final x0b a;
    public final pj8 b;
    public TLRPC.Document c;
    public t5a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public y0b(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = z8c.t0;
        this.I = 1.0f;
        this.N = ylbVar;
        this.G = z;
        x0b x0bVar = new x0b(this, ylbVar);
        this.a = x0bVar;
        x0bVar.S0 = true;
        x0bVar.A1 = true;
        x0bVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(cmb.w0(null, cmb.Ei, false));
        pj8 pj8Var = new pj8(1, null, context);
        this.b = pj8Var;
        pj8Var.setImageReceiver(x0bVar);
        pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        pj8Var.setImageReceiver(x0bVar);
        addView(pj8Var, qoe.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231970);
        imageView.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        int L = gm.L(12.0f);
        int i = cmb.p5;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        imageView.setBackground(b0);
        anb.j(imageView, b0, M, null, ylbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, qoe.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(d53.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(android.graphics.Canvas r10, android.view.ViewGroup r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0b.b(android.graphics.Canvas, android.view.ViewGroup):void");
    }

    public final void c(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(d53.f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, defpackage.t5a r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0b.d(org.telegram.tgnet.TLRPC$Document, t5a, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j5) {
            e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z) {
        if (this.H) {
            this.J = true;
        } else {
            this.J = false;
        }
        pj8 pj8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pj8Var.getLayoutParams();
        int i = this.F;
        if (!z8c.h(i).p()) {
            int L = gm.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = gm.L(8.0f);
            pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        } else {
            int L2 = gm.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = gm.L(8.0f);
            layoutParams.rightMargin = gm.L(8.0f);
            pj8Var.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
        }
        pj8Var.setLocked(!z8c.h(i).p());
        gm.T3(pj8Var, this.J, 0.9f, true, z);
        invalidate();
    }

    public String getEmoji() {
        return this.f;
    }

    public ImageReceiver getImageView() {
        return this.a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public g47 getSendAnimationData() {
        x0b x0bVar = this.a;
        if (!x0bVar.E()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.a = x0bVar.r() + iArr[0];
        obj.b = x0bVar.s() + iArr[1];
        obj.c = x0bVar.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public t5a getStickerPath() {
        t5a t5aVar = this.d;
        if (t5aVar != null && t5aVar.c) {
            return t5aVar;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (this.M && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.M;
        x0b x0bVar = this.a;
        if (z) {
            x0bVar.K0 = true;
            x0bVar.p0((View) getParent());
        } else {
            x0bVar.p0(this);
        }
        x0bVar.I();
        nm7.f(this.F).b(this, nm7.j5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        nm7.f(this.F).n(this, nm7.j5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = jb6.M0(2131753901, null);
        if (this.c != null) {
            int i = 0;
            while (true) {
                if (i >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(gw3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = kt6.p(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z) {
        this.E = z;
    }

    public void setScaled(boolean z) {
        this.w = z;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(t5a t5aVar) {
        boolean z;
        String str = t5aVar.b;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d(null, t5aVar, null, str, z, false);
    }
}
