package defpackage;

import org.telegram.ui.SessionsActivity;
public final class x6a implements Runnable {
    public final byte a;
    public final SessionsActivity b;
    public final boolean c;

    public x6a(SessionsActivity sessionsActivity, boolean z, byte b) {
        this.a = b;
        this.b = sessionsActivity;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                sessionsActivity.o0(z);
                return;
            default:
                sessionsActivity.o0(z);
                return;
        }
    }
}
