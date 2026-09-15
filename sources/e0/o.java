package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int e;
    public Object f7816f;

    public o(boolean z10) {
        this.e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f7786c).setBigContentTitle(this.f7766b).bigText((CharSequence) this.f7816f);
                if (this.d) {
                    bigText.setSummaryText(this.f7767c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f7786c).setBigContentTitle(this.f7766b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f7767c);
                }
                ArrayList arrayList = (ArrayList) this.f7816f;
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
            ((ArrayList) this.f7816f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f7816f = t.d(str);
    }

    public void f(String str) {
        this.f7766b = t.d(str);
    }

    public void g(String str) {
        this.f7767c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.e = i10;
        switch (i10) {
            case 1:
                this.f7816f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
