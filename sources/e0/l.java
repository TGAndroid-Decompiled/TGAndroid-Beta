package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class l extends y {
    public final int f9269e;
    public Object f9270f;

    public l(boolean z10) {
        this.f9269e = 0;
    }

    @Override
    public final void b(e0 e0Var) {
        switch (this.f9269e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) e0Var.d).setBigContentTitle(this.f9311b).bigText((CharSequence) this.f9270f);
                if (this.d) {
                    bigText.setSummaryText(this.f9312c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) e0Var.d).setBigContentTitle(this.f9311b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f9312c);
                }
                ArrayList arrayList = (ArrayList) this.f9270f;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                return;
        }
    }

    @Override
    public final String c() {
        switch (this.f9269e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f9270f).add(q.d(str));
        }
    }

    public void e(String str) {
        this.f9270f = q.d(str);
    }

    public void f(String str) {
        this.f9311b = q.d(str);
    }

    public void g(String str) {
        this.f9312c = q.d(str);
        this.d = true;
    }

    public l(int i3) {
        this.f9269e = i3;
        switch (i3) {
            case 1:
                this.f9270f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
