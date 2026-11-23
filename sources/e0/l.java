package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class l extends y {
    public final int f10230e;
    public Object f10231f;

    public l(boolean z10) {
        this.f10230e = 0;
    }

    @Override
    public final void b(a4.k kVar) {
        switch (this.f10230e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) kVar.d).setBigContentTitle(this.f10271b).bigText((CharSequence) this.f10231f);
                if (this.d) {
                    bigText.setSummaryText(this.f10272c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) kVar.d).setBigContentTitle(this.f10271b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f10272c);
                }
                ArrayList arrayList = (ArrayList) this.f10231f;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                return;
        }
    }

    @Override
    public final String c() {
        switch (this.f10230e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f10231f).add(q.d(str));
        }
    }

    public void e(String str) {
        this.f10231f = q.d(str);
    }

    public void f(String str) {
        this.f10271b = q.d(str);
    }

    public void g(String str) {
        this.f10272c = q.d(str);
        this.d = true;
    }

    public l(int i7) {
        this.f10230e = i7;
        switch (i7) {
            case 1:
                this.f10231f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
