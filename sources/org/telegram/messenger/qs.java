package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class qs implements Runnable {
    public final int f26126a;
    public final at f26127b;
    public final ArrayList f26128c;

    public qs(at atVar, ArrayList arrayList, int i7) {
        this.f26126a = i7;
        this.f26127b = atVar;
        this.f26128c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f26126a) {
            case 0:
                at atVar = this.f26127b;
                atVar.f22584x = this.f26128c;
                Intent intent = new Intent(t0.f26600b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", atVar.currentAccount);
                intent.setFlags(268763140);
                t0.f26600b.startActivity(intent);
                t0.f26600b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                at atVar2 = this.f26127b;
                ArrayList arrayList = this.f26128c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    atVar2.f22583w.remove(arrayList.get(i7));
                }
                ns.e().k(254, new Object[0]);
                return;
            case 2:
                at atVar3 = this.f26127b;
                ArrayList arrayList2 = this.f26128c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    atVar3.f22583w.remove(arrayList2.get(i10));
                }
                ns.e().k(254, new Object[0]);
                return;
            case 3:
                at atVar4 = this.f26127b;
                ArrayList arrayList3 = this.f26128c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    atVar4.f22583w.remove(arrayList3.get(i11));
                }
                ns.e().k(254, new Object[0]);
                return;
            default:
                at atVar5 = this.f26127b;
                ArrayList arrayList4 = this.f26128c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    atVar5.f22583w.remove(arrayList4.get(i12));
                }
                ns.e().k(254, new Object[0]);
                return;
        }
    }
}
