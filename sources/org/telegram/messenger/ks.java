package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class ks implements Runnable {
    public final int f23866a;
    public final us f23867b;
    public final ArrayList f23868c;

    public ks(us usVar, ArrayList arrayList, int i3) {
        this.f23866a = i3;
        this.f23867b = usVar;
        this.f23868c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f23866a) {
            case 0:
                us usVar = this.f23867b;
                usVar.f25774x = this.f23868c;
                Intent intent = new Intent(t0.f25457b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", usVar.currentAccount);
                intent.setFlags(268763140);
                t0.f25457b.startActivity(intent);
                t0.f25457b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                us usVar2 = this.f23867b;
                ArrayList arrayList = this.f23868c;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    usVar2.f25773w.remove(arrayList.get(i3));
                }
                hs.e().k(254, new Object[0]);
                return;
            case 2:
                us usVar3 = this.f23867b;
                ArrayList arrayList2 = this.f23868c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    usVar3.f25773w.remove(arrayList2.get(i10));
                }
                hs.e().k(254, new Object[0]);
                return;
            case 3:
                us usVar4 = this.f23867b;
                ArrayList arrayList3 = this.f23868c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    usVar4.f25773w.remove(arrayList3.get(i11));
                }
                hs.e().k(254, new Object[0]);
                return;
            default:
                us usVar5 = this.f23867b;
                ArrayList arrayList4 = this.f23868c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    usVar5.f25773w.remove(arrayList4.get(i12));
                }
                hs.e().k(254, new Object[0]);
                return;
        }
    }
}
