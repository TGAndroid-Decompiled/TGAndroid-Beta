package ei;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f10059a;
    public final a1 f10060b;

    public x0(a1 a1Var, int i10) {
        this.f10059a = i10;
        this.f10060b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f10059a) {
            case 0:
                a1 a1Var = this.f10060b;
                a1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    a8 a2 = ((z0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f8697b));
                    }
                }
                a1Var.c(arrayList3);
                a1Var.f8675f = false;
                a1Var.e = true;
                ci.i7 storiesController = MessagesController.getInstance(a1Var.f8672a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    ci.h7 h7Var = new ci.h7(storiesController, (a8) obj2);
                    storiesController.d(h7Var.J, h7Var, storiesController.f5492b, false);
                }
                NotificationCenter.getInstance(storiesController.f5491a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                a1 a1Var2 = this.f10060b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    a8 a10 = ((z0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f8709g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        a1Var2.f8673b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f8697b));
                    }
                }
                a1Var2.c(arrayList6);
                a1Var2.d = false;
                a1Var2.f8674c = true;
                NotificationCenter.getInstance(a1Var2.f8672a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
