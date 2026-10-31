package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class ct implements Runnable {
    public final int f15070a;
    public final ot f15071b;
    public final ArrayList f15072c;

    public ct(ot otVar, ArrayList arrayList, int i10) {
        this.f15070a = i10;
        this.f15071b = otVar;
        this.f15072c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15070a) {
            case 0:
                ot otVar = this.f15071b;
                otVar.f17328x = this.f15072c;
                Intent intent = new Intent(w0.f19025b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", otVar.currentAccount);
                intent.setFlags(268763140);
                w0.f19025b.startActivity(intent);
                w0.f19025b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                ot otVar2 = this.f15071b;
                ArrayList arrayList = this.f15072c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    otVar2.f17327w.remove(arrayList.get(i10));
                }
                zs.e().k(254, new Object[0]);
                return;
            case 2:
                ot otVar3 = this.f15071b;
                ArrayList arrayList2 = this.f15072c;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    otVar3.f17327w.remove(arrayList2.get(i11));
                }
                zs.e().k(254, new Object[0]);
                return;
            case 3:
                ot otVar4 = this.f15071b;
                ArrayList arrayList3 = this.f15072c;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    otVar4.f17327w.remove(arrayList3.get(i12));
                }
                zs.e().k(254, new Object[0]);
                return;
            default:
                ot otVar5 = this.f15071b;
                ArrayList arrayList4 = this.f15072c;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    otVar5.f17327w.remove(arrayList4.get(i13));
                }
                zs.e().k(254, new Object[0]);
                return;
        }
    }
}
