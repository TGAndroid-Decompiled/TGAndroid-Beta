package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f8691e;
    public Object f8692f;

    public o(boolean z10) {
        this.f8691e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f8691e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f8655c).setBigContentTitle(this.f8632b).bigText((CharSequence) this.f8692f);
                if (this.d) {
                    bigText.setSummaryText(this.f8633c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f8655c).setBigContentTitle(this.f8632b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8633c);
                }
                ArrayList arrayList = (ArrayList) this.f8692f;
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
        switch (this.f8691e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8692f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f8692f = t.d(str);
    }

    public void f(String str) {
        this.f8632b = t.d(str);
    }

    public void g(String str) {
        this.f8633c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f8691e = i10;
        switch (i10) {
            case 1:
                this.f8692f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
