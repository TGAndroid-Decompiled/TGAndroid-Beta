package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class m extends z {
    public final int f8450e;
    public Object f8451f;

    public m(boolean z10) {
        this.f8450e = 0;
    }

    @Override
    public final void b(g0 g0Var) {
        switch (this.f8450e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) g0Var.f8414c).setBigContentTitle(this.f8499b).bigText((CharSequence) this.f8451f);
                if (this.d) {
                    bigText.setSummaryText(this.f8500c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) g0Var.f8414c).setBigContentTitle(this.f8499b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8500c);
                }
                ArrayList arrayList = (ArrayList) this.f8451f;
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
        switch (this.f8450e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8451f).add(r.d(str));
        }
    }

    public void e(String str) {
        this.f8451f = r.d(str);
    }

    public void f(String str) {
        this.f8499b = r.d(str);
    }

    public void g(String str) {
        this.f8500c = r.d(str);
        this.d = true;
    }

    public m(int i10) {
        this.f8450e = i10;
        switch (i10) {
            case 1:
                this.f8451f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
