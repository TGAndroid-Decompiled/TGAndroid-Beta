package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f8663e;
    public Object f8664f;

    public o(boolean z10) {
        this.f8663e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f8663e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f8627c).setBigContentTitle(this.f8604b).bigText((CharSequence) this.f8664f);
                if (this.d) {
                    bigText.setSummaryText(this.f8605c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f8627c).setBigContentTitle(this.f8604b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8605c);
                }
                ArrayList arrayList = (ArrayList) this.f8664f;
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
        switch (this.f8663e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8664f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f8664f = t.d(str);
    }

    public void f(String str) {
        this.f8604b = t.d(str);
    }

    public void g(String str) {
        this.f8605c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f8663e = i10;
        switch (i10) {
            case 1:
                this.f8664f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
