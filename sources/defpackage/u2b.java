package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class u2b extends FrameLayout {
    public de0 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public cl8 n;
    public boolean r;
    public boolean s;
    public vnb w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        de0 de0Var = this.a;
        if (view == de0Var) {
            boolean z = this.e;
            float f = 1.0f;
            float f2 = 0.8f;
            if ((z && this.f != 0.8f) || (!z && this.f != 1.0f)) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (this.e) {
                    float f3 = this.f;
                    if (f3 != 0.8f) {
                        f = f3 - (((float) j2) / 400.0f);
                        this.f = f;
                        if (f < 0.8f) {
                            this.f = 0.8f;
                            f = f2;
                        }
                        de0Var.setScaleX(f);
                        de0Var.setScaleY(this.f);
                        de0Var.invalidate();
                        invalidate();
                    }
                }
                f2 = (((float) j2) / 400.0f) + this.f;
                this.f = f2;
                if (f2 > 1.0f) {
                    this.f = 1.0f;
                    de0Var.setScaleX(f);
                    de0Var.setScaleY(this.f);
                    de0Var.invalidate();
                    invalidate();
                }
                f = f2;
                de0Var.setScaleX(f);
                de0Var.setScaleY(this.f);
                de0Var.invalidate();
                invalidate();
            }
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public n47 getSendAnimationData() {
        de0 de0Var = this.a;
        ImageReceiver imageReceiver = de0Var.getImageReceiver();
        if (!imageReceiver.E()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        de0Var.getLocationInWindow(iArr);
        obj.a = imageReceiver.r() + iArr[0];
        obj.b = imageReceiver.s() + iArr[1];
        obj.c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.b == null) {
            return;
        }
        String str = null;
        for (int i = 0; i < this.b.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = this.b.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 != null && str2.length() > 0) {
                    str = documentAttribute.alt;
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            StringBuilder l = c00.l(str, " ");
            l.append(ob6.M0(2131753929, null));
            accessibilityNodeInfo.setText(l.toString());
        } else {
            accessibilityNodeInfo.setText(ob6.M0(2131753929, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + hl.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z) {
        this.h = z;
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        de0 de0Var = this.a;
        if (de0Var.getImageReceiver().f1 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            de0Var.getImageReceiver().f1 = z ? 1 : 0;
            de0Var.invalidate();
        }
        super.setPressed(z);
    }

    public void setScaled(boolean z) {
        this.e = z;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
