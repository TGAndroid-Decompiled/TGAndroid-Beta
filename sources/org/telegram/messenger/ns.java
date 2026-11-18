package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class ns implements Runnable {
    public final int f25965a;
    public final xs f25966b;
    public final ArrayList f25967c;

    public ns(xs xsVar, ArrayList arrayList, int i7) {
        this.f25965a = i7;
        this.f25966b = xsVar;
        this.f25967c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25965a) {
            case 0:
                xs xsVar = this.f25966b;
                xsVar.f27985x = this.f25967c;
                Intent intent = new Intent(t0.f26915b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", xsVar.currentAccount);
                intent.setFlags(268763140);
                t0.f26915b.startActivity(intent);
                t0.f26915b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                xs xsVar2 = this.f25966b;
                ArrayList arrayList = this.f25967c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    xsVar2.f27984w.remove(arrayList.get(i7));
                }
                ks.e().k(256, new Object[0]);
                return;
            case 2:
                xs xsVar3 = this.f25966b;
                ArrayList arrayList2 = this.f25967c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    xsVar3.f27984w.remove(arrayList2.get(i10));
                }
                ks.e().k(256, new Object[0]);
                return;
            case 3:
                xs xsVar4 = this.f25966b;
                ArrayList arrayList3 = this.f25967c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    xsVar4.f27984w.remove(arrayList3.get(i11));
                }
                ks.e().k(256, new Object[0]);
                return;
            default:
                xs xsVar5 = this.f25966b;
                ArrayList arrayList4 = this.f25967c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    xsVar5.f27984w.remove(arrayList4.get(i12));
                }
                ks.e().k(256, new Object[0]);
                return;
        }
    }
}
