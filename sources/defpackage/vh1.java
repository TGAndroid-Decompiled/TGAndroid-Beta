package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class vh1 extends ry8 {
    public final byte r;
    public final Object s;

    public vh1(byte b, Context context, Object obj) {
        super(context);
        this.r = b;
        this.s = obj;
    }

    @Override
    public final void invalidate() {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate();
                ((yh1) obj).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((m75) obj).invalidate();
                return;
            case 3:
                super.invalidate();
                ((wa5) obj).e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((ae6) obj).h.invalidate();
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((xd2) this.s).G1) {
                    accessibilityNodeInfo.setText(k96.M0(2131754750, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(k96.M0(2131754749, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate(i, i2, i3, i4);
                ((yh1) obj).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i, i2, i3, i4);
                return;
            case 3:
                super.invalidate(i, i2, i3, i4);
                ((wa5) obj).e.invalidate();
                return;
            case 4:
                super.invalidate(i, i2, i3, i4);
                ((ae6) obj).h.invalidate();
                return;
        }
    }
}
