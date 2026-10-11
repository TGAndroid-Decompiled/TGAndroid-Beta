package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class m extends z {
    public final int f8449e;
    public Object f8450f;

    public m(boolean z10) {
        this.f8449e = 0;
    }

    @Override
    public final void b(g0 g0Var) {
        switch (this.f8449e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) g0Var.f8413c).setBigContentTitle(this.f8498b).bigText((CharSequence) this.f8450f);
                if (this.d) {
                    bigText.setSummaryText(this.f8499c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) g0Var.f8413c).setBigContentTitle(this.f8498b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8499c);
                }
                ArrayList arrayList = (ArrayList) this.f8450f;
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
        switch (this.f8449e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8450f).add(r.d(str));
        }
    }

    public void e(String str) {
        this.f8450f = r.d(str);
    }

    public void f(String str) {
        this.f8498b = r.d(str);
    }

    public void g(String str) {
        this.f8499c = r.d(str);
        this.d = true;
    }

    public m(int i10) {
        this.f8449e = i10;
        switch (i10) {
            case 1:
                this.f8450f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
