package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class uya extends FrameLayout {
    public be0 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public oh8 n;
    public boolean r;
    public boolean s;
    public wjb w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        be0 be0Var = this.a;
        if (view == be0Var) {
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
                        be0Var.setScaleX(f);
                        be0Var.setScaleY(this.f);
                        be0Var.invalidate();
                        invalidate();
                    }
                }
                f2 = (((float) j2) / 400.0f) + this.f;
                this.f = f2;
                if (f2 > 1.0f) {
                    this.f = 1.0f;
                    be0Var.setScaleX(f);
                    be0Var.setScaleY(this.f);
                    be0Var.invalidate();
                    invalidate();
                }
                f = f2;
                be0Var.setScaleX(f);
                be0Var.setScaleY(this.f);
                be0Var.invalidate();
                invalidate();
            }
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public g27 getSendAnimationData() {
        be0 be0Var = this.a;
        ImageReceiver imageReceiver = be0Var.getImageReceiver();
        if (!imageReceiver.E()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        be0Var.getLocationInWindow(iArr);
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
            StringBuilder k = b00.k(str, " ");
            k.append(k96.M0(2131753933, null));
            accessibilityNodeInfo.setText(k.toString());
        } else {
            accessibilityNodeInfo.setText(k96.M0(2131753933, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + gl.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z) {
        this.h = z;
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        be0 be0Var = this.a;
        if (be0Var.getImageReceiver().f1 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            be0Var.getImageReceiver().f1 = z ? 1 : 0;
            be0Var.invalidate();
        }
        super.setPressed(z);
    }

    public void setScaled(boolean z) {
        this.e = z;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
