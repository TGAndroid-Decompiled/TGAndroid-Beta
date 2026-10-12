package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class m extends z {
    public final int f8447e;
    public Object f8448f;

    public m(boolean z10) {
        this.f8447e = 0;
    }

    @Override
    public final void b(g0 g0Var) {
        switch (this.f8447e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) g0Var.f8411c).setBigContentTitle(this.f8496b).bigText((CharSequence) this.f8448f);
                if (this.d) {
                    bigText.setSummaryText(this.f8497c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) g0Var.f8411c).setBigContentTitle(this.f8496b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8497c);
                }
                ArrayList arrayList = (ArrayList) this.f8448f;
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
        switch (this.f8447e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8448f).add(r.d(str));
        }
    }

    public void e(String str) {
        this.f8448f = r.d(str);
    }

    public void f(String str) {
        this.f8496b = r.d(str);
    }

    public void g(String str) {
        this.f8497c = r.d(str);
        this.d = true;
    }

    public m(int i10) {
        this.f8447e = i10;
        switch (i10) {
            case 1:
                this.f8448f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
