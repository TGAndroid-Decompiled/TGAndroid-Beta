package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class l extends y {
    public final int e;
    public Object f8129f;

    public l(boolean z10) {
        this.e = 0;
    }

    @Override
    public final void b(f0 f0Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) f0Var.d).setBigContentTitle(this.f8173b).bigText((CharSequence) this.f8129f);
                if (this.d) {
                    bigText.setSummaryText(this.f8174c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) f0Var.d).setBigContentTitle(this.f8173b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f8174c);
                }
                ArrayList arrayList = (ArrayList) this.f8129f;
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
            ((ArrayList) this.f8129f).add(q.d(str));
        }
    }

    public void e(String str) {
        this.f8129f = q.d(str);
    }

    public void f(String str) {
        this.f8173b = q.d(str);
    }

    public void g(String str) {
        this.f8174c = q.d(str);
        this.d = true;
    }

    public l(int i10) {
        this.e = i10;
        switch (i10) {
            case 1:
                this.f8129f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
