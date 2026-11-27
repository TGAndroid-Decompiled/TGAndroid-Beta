package defpackage;

import org.telegram.ui.Components.FragmentContextView;
public final class op4 implements Runnable {
    public final byte a;
    public final FragmentContextView b;

    public op4(FragmentContextView fragmentContextView, byte b) {
        this.a = b;
        this.b = fragmentContextView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (b) {
            case 0:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.O.g = 0.0f;
                fragmentContextView.M.invalidate();
                return;
            default:
                float[] fArr2 = FragmentContextView.W0;
                fragmentContextView.o(true);
                return;
        }
    }
}
