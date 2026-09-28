package ci;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f5804a;
    public final b1 f5805b;

    public x0(b1 b1Var, int i10) {
        this.f5804a = i10;
        this.f5805b = b1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f5804a) {
            case 0:
                b1 b1Var = this.f5805b;
                b1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    l8 a2 = ((a1) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f4967b));
                    }
                }
                b1Var.c(arrayList3);
                b1Var.f4370f = false;
                b1Var.e = true;
                ai.l9 storiesController = MessagesController.getInstance(b1Var.f4367a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    ai.k9 k9Var = new ai.k9(storiesController, (l8) obj2);
                    storiesController.d(k9Var.J, k9Var, storiesController.f1193b, false);
                }
                NotificationCenter.getInstance(storiesController.f1192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                b1 b1Var2 = this.f5805b;
                b1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    l8 a10 = ((a1) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f4979g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        b1Var2.f4368b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f4967b));
                    }
                }
                b1Var2.c(arrayList6);
                b1Var2.d = false;
                b1Var2.f4369c = true;
                NotificationCenter.getInstance(b1Var2.f4367a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
