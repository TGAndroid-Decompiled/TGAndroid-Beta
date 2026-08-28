package kh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f16390a;
    public final b1 f16391b;

    public y0(b1 b1Var, int i9) {
        this.f16390a = i9;
        this.f16391b = b1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f16390a) {
            case 0:
                b1 b1Var = this.f16391b;
                b1Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    a8 a2 = ((a1) arrayList.get(i9)).a();
                    if ((!a2.v() && ((file = a2.L) == null || !file.exists())) || currentTimeMillis - a2.d > 604800000) {
                        arrayList3.add(a2);
                    } else {
                        arrayList4.add(a2);
                        arrayList2.add(Long.valueOf(a2.f14904b));
                    }
                }
                b1Var.b(arrayList3);
                b1Var.f14980f = false;
                b1Var.f14979e = true;
                ih.v6 storiesController = MessagesController.getInstance(b1Var.f14976a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    ih.u6 u6Var = new ih.u6(storiesController, (a8) obj2);
                    storiesController.d(u6Var.F, u6Var, storiesController.f12237b, false);
                }
                NotificationCenter.getInstance(storiesController.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            default:
                b1 b1Var2 = this.f16391b;
                b1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a8 a3 = ((a1) arrayList.get(i11)).a();
                    if ((!a3.v() && ((file2 = a3.L) == null || !file2.exists())) || (!a3.f14917g ? currentTimeMillis2 - a3.d > 604800000 : currentTimeMillis2 > a3.J)) {
                        arrayList6.add(a3);
                    } else {
                        b1Var2.f14977b.add(a3);
                        arrayList5.add(Long.valueOf(a3.f14904b));
                    }
                }
                b1Var2.b(arrayList6);
                b1Var2.d = false;
                b1Var2.f14978c = true;
                NotificationCenter.getInstance(b1Var2.f14976a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                return;
        }
    }
}
