package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int e;
    public Object f7121f;

    public o(boolean z10) {
        this.e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f7091c).setBigContentTitle(this.f7071b).bigText((CharSequence) this.f7121f);
                if (this.d) {
                    bigText.setSummaryText(this.f7072c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f7091c).setBigContentTitle(this.f7071b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f7072c);
                }
                ArrayList arrayList = (ArrayList) this.f7121f;
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
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f7121f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f7121f = t.d(str);
    }

    public void f(String str) {
        this.f7071b = t.d(str);
    }

    public void g(String str) {
        this.f7072c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.e = i10;
        switch (i10) {
            case 1:
                this.f7121f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
