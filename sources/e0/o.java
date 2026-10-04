package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f8464e;
    public Object f8465f;

    public o(boolean z10) {
        this.f8464e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f8464e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f8428c).setBigContentTitle(this.f8404b).bigText((CharSequence) this.f8465f);
                if (this.d) {
                    bigText.setSummaryText(this.f8405c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f8428c).setBigContentTitle(this.f8404b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8405c);
                }
                ArrayList arrayList = (ArrayList) this.f8465f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                return;
        }
    }

    @Override
    public final String c() {
        switch (this.f8464e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8465f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f8465f = t.d(str);
    }

    public void f(String str) {
        this.f8404b = t.d(str);
    }

    public void g(String str) {
        this.f8405c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f8464e = i10;
        switch (i10) {
            case 1:
                this.f8465f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
