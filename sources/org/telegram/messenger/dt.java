package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class dt implements Runnable {
    public final int f15426a;
    public final pt f15427b;
    public final ArrayList f15428c;

    public dt(pt ptVar, ArrayList arrayList, int i10) {
        this.f15426a = i10;
        this.f15427b = ptVar;
        this.f15428c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f15426a) {
            case 0:
                pt ptVar = this.f15427b;
                ptVar.f17661x = this.f15428c;
                Intent intent = new Intent(w0.f18945b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ptVar.currentAccount);
                intent.setFlags(268763140);
                w0.f18945b.startActivity(intent);
                w0.f18945b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                pt ptVar2 = this.f15427b;
                ArrayList arrayList = this.f15428c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ptVar2.f17660w.remove(arrayList.get(i10));
                }
                at.e().k(254, new Object[0]);
                return;
            case 2:
                pt ptVar3 = this.f15427b;
                ArrayList arrayList2 = this.f15428c;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ptVar3.f17660w.remove(arrayList2.get(i11));
                }
                at.e().k(254, new Object[0]);
                return;
            case 3:
                pt ptVar4 = this.f15427b;
                ArrayList arrayList3 = this.f15428c;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ptVar4.f17660w.remove(arrayList3.get(i12));
                }
                at.e().k(254, new Object[0]);
                return;
            default:
                pt ptVar5 = this.f15427b;
                ArrayList arrayList4 = this.f15428c;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ptVar5.f17660w.remove(arrayList4.get(i13));
                }
                at.e().k(254, new Object[0]);
                return;
        }
    }
}
