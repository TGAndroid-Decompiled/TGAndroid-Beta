package di;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f8027a;
    public final a1 f8028b;

    public w0(a1 a1Var, int i10) {
        this.f8027a = i10;
        this.f8028b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f8027a) {
            case 0:
                a1 a1Var = this.f8028b;
                a1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    k8 a2 = ((z0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f7178b));
                    }
                }
                a1Var.c(arrayList3);
                a1Var.f6589f = false;
                a1Var.e = true;
                bi.x8 storiesController = MessagesController.getInstance(a1Var.f6586a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    bi.w8 w8Var = new bi.w8(storiesController, (k8) obj2);
                    storiesController.d(w8Var.J, w8Var, storiesController.f3967b, false);
                }
                NotificationCenter.getInstance(storiesController.f3966a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                a1 a1Var2 = this.f8028b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    k8 a10 = ((z0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f7190g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        a1Var2.f6587b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f7178b));
                    }
                }
                a1Var2.c(arrayList6);
                a1Var2.d = false;
                a1Var2.f6588c = true;
                NotificationCenter.getInstance(a1Var2.f6586a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
