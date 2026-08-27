package lh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

public final class x0 implements Utilities.Callback {

    public final int f17028a;

    public final a1 f17029b;

    public x0(a1 a1Var, int i10) {
        this.f17028a = i10;
        this.f17029b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f17028a) {
            case 0:
                a1 a1Var = this.f17029b;
                a1Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z7 z7VarA = ((z0) arrayList.get(i10)).a();
                    if ((z7VarA.v() || ((file = z7VarA.L) != null && file.exists())) && jCurrentTimeMillis - z7VarA.d <= 604800000) {
                        arrayList4.add(z7VarA);
                        arrayList2.add(Long.valueOf(z7VarA.f17196b));
                    } else {
                        arrayList3.add(z7VarA);
                    }
                }
                a1Var.b(arrayList3);
                a1Var.f15628f = false;
                a1Var.f15627e = true;
                jh.s6 storiesController = MessagesController.getInstance(a1Var.f15624a).getStoriesController();
                storiesController.getClass();
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    jh.r6 r6Var = new jh.r6(storiesController, (z7) obj2);
                    storiesController.d(r6Var.F, r6Var, storiesController.f13956b, false);
                }
                NotificationCenter.getInstance(storiesController.f13955a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            default:
                a1 a1Var2 = this.f17029b;
                a1Var2.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    z7 z7VarA2 = ((z0) arrayList.get(i12)).a();
                    if ((z7VarA2.v() || ((file2 = z7VarA2.L) != null && file2.exists())) && (!z7VarA2.f17209g ? jCurrentTimeMillis2 - z7VarA2.d <= 604800000 : jCurrentTimeMillis2 <= z7VarA2.J)) {
                        a1Var2.f15625b.add(z7VarA2);
                        arrayList5.add(Long.valueOf(z7VarA2.f17196b));
                    } else {
                        arrayList6.add(z7VarA2);
                    }
                }
                a1Var2.b(arrayList6);
                a1Var2.d = false;
                a1Var2.f15626c = true;
                NotificationCenter.getInstance(a1Var2.f15624a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
                break;
        }
    }
}
