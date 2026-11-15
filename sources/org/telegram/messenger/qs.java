package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class qs implements Runnable {
    public final int f26134a;
    public final at f26135b;
    public final ArrayList f26136c;

    public qs(at atVar, ArrayList arrayList, int i7) {
        this.f26134a = i7;
        this.f26135b = atVar;
        this.f26136c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f26134a) {
            case 0:
                at atVar = this.f26135b;
                atVar.f22584x = this.f26136c;
                Intent intent = new Intent(t0.f26609b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", atVar.currentAccount);
                intent.setFlags(268763140);
                t0.f26609b.startActivity(intent);
                t0.f26609b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                at atVar2 = this.f26135b;
                ArrayList arrayList = this.f26136c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    atVar2.f22583w.remove(arrayList.get(i7));
                }
                ns.e().k(254, new Object[0]);
                return;
            case 2:
                at atVar3 = this.f26135b;
                ArrayList arrayList2 = this.f26136c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    atVar3.f22583w.remove(arrayList2.get(i10));
                }
                ns.e().k(254, new Object[0]);
                return;
            case 3:
                at atVar4 = this.f26135b;
                ArrayList arrayList3 = this.f26136c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    atVar4.f22583w.remove(arrayList3.get(i11));
                }
                ns.e().k(254, new Object[0]);
                return;
            default:
                at atVar5 = this.f26135b;
                ArrayList arrayList4 = this.f26136c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    atVar5.f22583w.remove(arrayList4.get(i12));
                }
                ns.e().k(254, new Object[0]);
                return;
        }
    }
}
