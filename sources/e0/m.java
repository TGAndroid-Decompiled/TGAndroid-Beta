package e0;

import android.app.Notification;
import java.util.ArrayList;
public final class m extends z {
    public final int e;
    public Object f6049f;

    public m(boolean z10) {
        this.e = 0;
    }

    @Override
    public final void b(cc.f fVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) fVar.d).setBigContentTitle(this.f6087b).bigText((CharSequence) this.f6049f);
                if (this.d) {
                    bigText.setSummaryText(this.f6088c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) fVar.d).setBigContentTitle(this.f6087b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f6088c);
                }
                ArrayList arrayList = (ArrayList) this.f6049f;
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
            ((ArrayList) this.f6049f).add(r.d(str));
        }
    }

    public void e(String str) {
        this.f6049f = r.d(str);
    }

    public void f(String str) {
        this.f6087b = r.d(str);
    }

    public void g(String str) {
        this.f6088c = r.d(str);
        this.d = true;
    }

    public m(int i10) {
        this.e = i10;
        switch (i10) {
            case 1:
                this.f6049f = new ArrayList();
                return;
            default:
                return;
        }
    }
}
