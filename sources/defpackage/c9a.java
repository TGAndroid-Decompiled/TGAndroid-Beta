package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.SessionsActivity;
public final class c9a implements ee {
    public final byte a;
    public final SessionsActivity b;

    public c9a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                sessionsActivity.j0();
                return;
        }
    }
}
