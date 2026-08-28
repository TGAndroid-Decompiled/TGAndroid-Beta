package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f4745e;
    public Object f4746f;

    public o(boolean z10) {
        this.f4745e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f4745e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f4709c).setBigContentTitle(this.f4686b).bigText((CharSequence) this.f4746f);
                if (this.d) {
                    bigText.setSummaryText(this.f4687c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f4709c).setBigContentTitle(this.f4686b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f4687c);
                }
                ArrayList arrayList = (ArrayList) this.f4746f;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                return;
        }
    }

    @Override
    public final String c() {
        switch (this.f4745e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f4746f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f4746f = t.d(str);
    }

    public void f(String str) {
        this.f4686b = t.d(str);
    }

    public void g(String str) {
        this.f4687c = t.d(str);
        this.d = true;
    }

    public o(int i9) {
        this.f4745e = i9;
        switch (i9) {
            case 1:
                this.f4746f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
