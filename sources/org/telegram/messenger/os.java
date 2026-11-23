package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class os implements Runnable {
    public final int f26126a;
    public final ys f26127b;
    public final ArrayList f26128c;

    public os(ys ysVar, ArrayList arrayList, int i7) {
        this.f26126a = i7;
        this.f26127b = ysVar;
        this.f26128c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f26126a) {
            case 0:
                ys ysVar = this.f26127b;
                ysVar.f28159x = this.f26128c;
                Intent intent = new Intent(t0.f26895b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ysVar.currentAccount);
                intent.setFlags(268763140);
                t0.f26895b.startActivity(intent);
                t0.f26895b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                ys ysVar2 = this.f26127b;
                ArrayList arrayList = this.f26128c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ysVar2.f28158w.remove(arrayList.get(i7));
                }
                ls.e().k(257, new Object[0]);
                return;
            case 2:
                ys ysVar3 = this.f26127b;
                ArrayList arrayList2 = this.f26128c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ysVar3.f28158w.remove(arrayList2.get(i10));
                }
                ls.e().k(257, new Object[0]);
                return;
            case 3:
                ys ysVar4 = this.f26127b;
                ArrayList arrayList3 = this.f26128c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ysVar4.f28158w.remove(arrayList3.get(i11));
                }
                ls.e().k(257, new Object[0]);
                return;
            default:
                ys ysVar5 = this.f26127b;
                ArrayList arrayList4 = this.f26128c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ysVar5.f28158w.remove(arrayList4.get(i12));
                }
                ls.e().k(257, new Object[0]);
                return;
        }
    }
}
