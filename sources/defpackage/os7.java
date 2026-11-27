package defpackage;

import org.telegram.messenger.PushListenerController;
public final class os7 implements Runnable {
    public final byte a = 0;
    public final String b;
    public final int c;

    public os7(int i, String str) {
        this.c = i;
        this.b = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                v21 t = vs7.h().t(ob6.a0(null, null, i, str), null);
                t.u = true;
                t.j();
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$1(str, i);
                return;
        }
    }

    public os7(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
