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
public class xya extends FrameLayout implements gk7, p39 {
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
    public final wjb N;
    public final wya a;
    public final oh8 b;
    public TLRPC.Document c;
    public s3a d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public xya(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.n = 1.0f;
        this.F = y6c.t0;
        this.I = 1.0f;
        this.N = wjbVar;
        this.G = z;
        wya wyaVar = new wya(this, wjbVar);
        this.a = wyaVar;
        wyaVar.S0 = true;
        wyaVar.A1 = true;
        wyaVar.m0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(bkb.w0(null, bkb.Ei, false));
        oh8 oh8Var = new oh8(1, null, context);
        this.b = oh8Var;
        oh8Var.setImageReceiver(wyaVar);
        oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        oh8Var.setImageReceiver(wyaVar);
        addView(oh8Var, nme.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(2131231969);
        imageView.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        int L = gl.L(12.0f);
        int i = bkb.p5;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, wjbVar);
        imageView.setAlpha(0.0f);
        addView(imageView, nme.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(s33.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(android.graphics.Canvas r10, android.view.ViewGroup r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.b(android.graphics.Canvas, android.view.ViewGroup):void");
    }

    public final void c(boolean z) {
        ImageView imageView = this.K;
        if (z) {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(s33.f).start();
            return;
        }
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public final void d(org.telegram.tgnet.TLRPC.Document r29, defpackage.s3a r30, java.lang.Object r31, java.lang.String r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.d(org.telegram.tgnet.TLRPC$Document, s3a, java.lang.Object, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.h5) {
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
        oh8 oh8Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh8Var.getLayoutParams();
        int i = this.F;
        if (!y6c.h(i).p()) {
            int L = gl.L(24.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = gl.L(8.0f);
            oh8Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        } else {
            int L2 = gl.L(16.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = gl.L(8.0f);
            layoutParams.rightMargin = gl.L(8.0f);
            oh8Var.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        }
        oh8Var.setLocked(!y6c.h(i).p());
        gl.U3(oh8Var, this.J, 0.9f, true, z);
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

    public g27 getSendAnimationData() {
        wya wyaVar = this.a;
        if (!wyaVar.E()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        obj.a = wyaVar.r() + iArr[0];
        obj.b = wyaVar.s() + iArr[1];
        obj.c = wyaVar.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public s3a getStickerPath() {
        s3a s3aVar = this.d;
        if (s3aVar != null && s3aVar.c) {
            return s3aVar;
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
        wya wyaVar = this.a;
        if (z) {
            wyaVar.K0 = true;
            wyaVar.p0((View) getParent());
        } else {
            wyaVar.p0(this);
        }
        wyaVar.I();
        kk7.f(this.F).b(this, kk7.h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        kk7.f(this.F).n(this, kk7.h5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = k96.M0(2131753933, null);
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
                        textView.setText(vu3.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = ls6.o(documentAttribute.alt, " ", M0, new StringBuilder());
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

    public void setSticker(s3a s3aVar) {
        boolean z;
        String str = s3aVar.b;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d(null, s3aVar, null, str, z, false);
    }
}
