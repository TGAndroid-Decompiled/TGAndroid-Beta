package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class cj1 extends s09 {
    public final byte r;
    public final Object s;

    public cj1(byte b, Context context, Object obj) {
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
                ((fj1) obj).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((l95) obj).invalidate();
                return;
            case 3:
                super.invalidate();
                ((uc5) obj).e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((zf6) obj).h.invalidate();
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((if2) this.s).G1) {
                    accessibilityNodeInfo.setText(jb6.M0(2131754750, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(jb6.M0(2131754749, null));
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
                ((fj1) obj).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i, i2, i3, i4);
                return;
            case 3:
                super.invalidate(i, i2, i3, i4);
                ((uc5) obj).e.invalidate();
                return;
            case 4:
                super.invalidate(i, i2, i3, i4);
                ((zf6) obj).h.invalidate();
                return;
        }
    }
}
