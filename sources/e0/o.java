package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f5715e;
    public Object f5716f;

    public o(boolean z10) {
        this.f5715e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f5715e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f5679c).setBigContentTitle(this.f5656b).bigText((CharSequence) this.f5716f);
                if (this.d) {
                    bigText.setSummaryText(this.f5657c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f5679c).setBigContentTitle(this.f5656b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f5657c);
                }
                ArrayList arrayList = (ArrayList) this.f5716f;
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
        switch (this.f5715e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f5716f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f5716f = t.d(str);
    }

    public void f(String str) {
        this.f5656b = t.d(str);
    }

    public void g(String str) {
        this.f5657c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f5715e = i10;
        switch (i10) {
            case 1:
                this.f5716f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
