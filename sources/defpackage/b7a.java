package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.SessionsActivity;
public final class b7a implements ed {
    public final byte a;
    public final SessionsActivity b;

    public b7a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override
    public final void u(hd hdVar, int i) {
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
                    fa4.g(e, true);
                    return;
                }
            default:
                sessionsActivity.i0();
                return;
        }
    }
}
