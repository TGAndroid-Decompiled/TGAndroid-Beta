package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f4833e;
    public Object f4834f;

    public o(boolean z4) {
        this.f4833e = 0;
    }

    @Override
    public final void b(a4.k kVar) {
        switch (this.f4833e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) kVar.f94c).setBigContentTitle(this.f4776b).bigText((CharSequence) this.f4834f);
                if (this.d) {
                    bigText.setSummaryText(this.f4777c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) kVar.f94c).setBigContentTitle(this.f4776b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f4777c);
                }
                ArrayList arrayList = (ArrayList) this.f4834f;
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
        switch (this.f4833e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f4834f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f4834f = t.d(str);
    }

    public void f(String str) {
        this.f4776b = t.d(str);
    }

    public void g(String str) {
        this.f4777c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f4833e = i10;
        switch (i10) {
            case 1:
                this.f4834f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
