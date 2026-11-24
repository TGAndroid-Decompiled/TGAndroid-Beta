package defpackage;

import org.telegram.ui.SessionsActivity;
public final class z8a implements Runnable {
    public final byte a;
    public final SessionsActivity b;
    public final boolean c;

    public z8a(SessionsActivity sessionsActivity, boolean z, byte b) {
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
                sessionsActivity.p0(z);
                return;
            default:
                sessionsActivity.p0(z);
                return;
        }
    }
}
