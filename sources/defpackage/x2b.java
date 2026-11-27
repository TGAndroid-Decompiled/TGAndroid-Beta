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
public class x2b extends FrameLayout implements fn7, e79 {
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
    public final vnb N;
    public final w2b a;
    public final cl8 b;
    public TLRPC.Document c;
    public k7a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public x2b(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = yac.t0;
        this.I = 1.0f;
        this.N = vnbVar;
        this.G = z;
        w2b w2bVar = new w2b(this, vnbVar);
        this.a = w2bVar;
        w2bVar.S0 = true;
        w2bVar.A1 = true;
        w2bVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(aob.w0(null, aob.Fi, false));
        cl8 cl8Var = new cl8(1, null, context);
        this.b = cl8Var;
        cl8Var.setImageReceiver(w2bVar);
        cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        cl8Var.setImageReceiver(w2bVar);
        addView(cl8Var, tre.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231969);
        imageView.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        int L = hl.L(12.0f);
        int i = aob.q5;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        imageView.setBackground(b0);
        yob.j(imageView, b0, M, null, vnbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, tre.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(k43.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(android.graphics.Canvas r10, android.view.ViewGroup r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2b.b(android.graphics.Canvas, android.view.ViewGroup):void");
    }

    public final void c(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(k43.f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, defpackage.k7a r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2b.d(org.telegram.tgnet.TLRPC$Document, k7a, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.i5) {
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
        cl8 cl8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cl8Var.getLayoutParams();
        int i = this.F;
        if (!yac.h(i).p()) {
            int L = hl.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = hl.L(8.0f);
            cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        } else {
            int L2 = hl.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = hl.L(8.0f);
            layoutParams.rightMargin = hl.L(8.0f);
            cl8Var.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
        }
        cl8Var.setLocked(!yac.h(i).p());
        hl.T3(cl8Var, this.J, 0.9f, true, z);
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

    public n47 getSendAnimationData() {
        w2b w2bVar = this.a;
        if (!w2bVar.E()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.a = w2bVar.r() + iArr[0];
        obj.b = w2bVar.s() + iArr[1];
        obj.c = w2bVar.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public k7a getStickerPath() {
        k7a k7aVar = this.d;
        if (k7aVar != null && k7aVar.c) {
            return k7aVar;
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
        w2b w2bVar = this.a;
        if (z) {
            w2bVar.K0 = true;
            w2bVar.p0((View) getParent());
        } else {
            w2bVar.p0(this);
        }
        w2bVar.I();
        jn7.f(this.F).b(this, jn7.i5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        jn7.f(this.F).n(this, jn7.i5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = ob6.M0(2131753929, null);
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
                        textView.setText(pv3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = qu6.o(documentAttribute.alt, " ", M0, new StringBuilder());
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

    public void setSticker(k7a k7aVar) {
        boolean z;
        String str = k7aVar.b;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d(null, k7aVar, null, str, z, false);
    }
}
