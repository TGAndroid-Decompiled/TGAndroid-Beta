package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tsb extends AnimatorListenerAdapter {
    public final byte a;
    public final usb b;

    public tsb(usb usbVar, byte b) {
        this.a = b;
        this.b = usbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        usb usbVar = this.b;
        switch (b) {
            case 0:
                usbVar.b.s.setVisibility(8);
                return;
            default:
                usbVar.b.a.setVisibility(8);
                return;
        }
    }
}
