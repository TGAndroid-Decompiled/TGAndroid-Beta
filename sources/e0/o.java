package e0;

import android.app.Notification;
import java.util.ArrayList;

public final class o extends b0 {

    public final int f5102e;

    public Object f5103f;

    public o(boolean z10) {
        this.f5102e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f5102e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f5066c).setBigContentTitle(this.f5043b).bigText((CharSequence) this.f5103f);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.f5044c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f5066c).setBigContentTitle(this.f5043b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f5044c);
                }
                ArrayList arrayList = (ArrayList) this.f5103f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override
    public final String c() {
        switch (this.f5102e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f5103f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f5103f = t.d(str);
    }

    public void f(String str) {
        this.f5043b = t.d(str);
    }

    public void g(String str) {
        this.f5044c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f5102e = i10;
        switch (i10) {
            case 1:
                this.f5103f = new ArrayList();
                break;
        }
    }
}
