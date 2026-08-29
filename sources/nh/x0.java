package nh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f18812a;
    public final a1 f18813b;

    public x0(a1 a1Var, int i10) {
        this.f18812a = i10;
        this.f18813b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f18812a) {
            case 0:
                a1 a1Var = this.f18813b;
                a1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o7 a2 = ((z0) arrayList.get(i10)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f18257b));
                    }
                }
                a1Var.b(arrayList3);
                a1Var.f17376f = false;
                a1Var.f17375e = true;
                lh.s6 storiesController = MessagesController.getInstance(a1Var.f17372a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    lh.r6 r6Var = new lh.r6(storiesController, (o7) obj2);
                    storiesController.d(r6Var.F, r6Var, storiesController.f16219b, false);
                }
                NotificationCenter.getInstance(storiesController.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                a1 a1Var2 = this.f18813b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    o7 a10 = ((z0) arrayList.get(i12)).a();
                    if ((!a10.v() && ((file2 = a10.L) == null || !file2.exists())) || (!a10.f18270g ? currentTimeMillis2 - a10.d > 604800000 : currentTimeMillis2 > a10.J)) {
                        arrayList6.add(a10);
                    } else {
                        a1Var2.f17373b.add(a10);
                        arrayList5.add(Long.valueOf(a10.f18257b));
                    }
                }
                a1Var2.b(arrayList6);
                a1Var2.d = false;
                a1Var2.f17374c = true;
                NotificationCenter.getInstance(a1Var2.f17372a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
