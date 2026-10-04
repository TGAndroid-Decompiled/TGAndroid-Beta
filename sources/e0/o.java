package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class o extends b0 {
    public final int f8463e;
    public Object f8464f;

    public o(boolean z10) {
        this.f8463e = 0;
    }

    @Override
    public final void b(i0 i0Var) {
        switch (this.f8463e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i0Var.f8427c).setBigContentTitle(this.f8403b).bigText((CharSequence) this.f8464f);
                if (this.d) {
                    bigText.setSummaryText(this.f8404c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) i0Var.f8427c).setBigContentTitle(this.f8403b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8404c);
                }
                ArrayList arrayList = (ArrayList) this.f8464f;
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
        switch (this.f8463e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public void d(String str) {
        if (str != null) {
            ((ArrayList) this.f8464f).add(t.d(str));
        }
    }

    public void e(String str) {
        this.f8464f = t.d(str);
    }

    public void f(String str) {
        this.f8403b = t.d(str);
    }

    public void g(String str) {
        this.f8404c = t.d(str);
        this.d = true;
    }

    public o(int i10) {
        this.f8463e = i10;
        switch (i10) {
            case 1:
                this.f8464f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
