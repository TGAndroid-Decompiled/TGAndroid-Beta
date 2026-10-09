package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f6180a;
    public final a1 f6181b;

    public w0(a1 a1Var, int i10) {
        this.f6180a = i10;
        this.f6181b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f6180a) {
            case 0:
                a1 a1Var = this.f6181b;
                a1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    l8 a2 = ((z0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f5397b));
                    }
                }
                a1Var.c(arrayList3);
                a1Var.f4715f = false;
                a1Var.f4714e = true;
                ai.m9 storiesController = MessagesController.getInstance(a1Var.f4711a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    ai.l9 l9Var = new ai.l9(storiesController, (l8) obj2);
                    storiesController.d(l9Var.J, l9Var, storiesController.f1407b, false);
                }
                NotificationCenter.getInstance(storiesController.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                a1 a1Var2 = this.f6181b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    l8 a10 = ((z0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f5410g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        a1Var2.f4712b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f5397b));
                    }
                }
                a1Var2.c(arrayList6);
                a1Var2.d = false;
                a1Var2.f4713c = true;
                NotificationCenter.getInstance(a1Var2.f4711a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
