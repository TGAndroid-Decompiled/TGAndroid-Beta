package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class ts implements Runnable {
    public final int f25662a;
    public final dt f25663b;
    public final ArrayList f25664c;

    public ts(dt dtVar, ArrayList arrayList, int i7) {
        this.f25662a = i7;
        this.f25663b = dtVar;
        this.f25664c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25662a) {
            case 0:
                dt dtVar = this.f25663b;
                dtVar.f22105x = this.f25664c;
                Intent intent = new Intent(t0.f25570b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", dtVar.currentAccount);
                intent.setFlags(268763140);
                t0.f25570b.startActivity(intent);
                t0.f25570b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                dt dtVar2 = this.f25663b;
                ArrayList arrayList = this.f25664c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    dtVar2.f22104w.remove(arrayList.get(i7));
                }
                qs.e().k(254, new Object[0]);
                return;
            case 2:
                dt dtVar3 = this.f25663b;
                ArrayList arrayList2 = this.f25664c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    dtVar3.f22104w.remove(arrayList2.get(i10));
                }
                qs.e().k(254, new Object[0]);
                return;
            case 3:
                dt dtVar4 = this.f25663b;
                ArrayList arrayList3 = this.f25664c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    dtVar4.f22104w.remove(arrayList3.get(i11));
                }
                qs.e().k(254, new Object[0]);
                return;
            default:
                dt dtVar5 = this.f25663b;
                ArrayList arrayList4 = this.f25664c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    dtVar5.f22104w.remove(arrayList4.get(i12));
                }
                qs.e().k(254, new Object[0]);
                return;
        }
    }
}
