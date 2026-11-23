package org.telegram.messenger;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.PopupNotificationActivity;
public final class os implements Runnable {
    public final int f26162a;
    public final ys f26163b;
    public final ArrayList f26164c;

    public os(ys ysVar, ArrayList arrayList, int i7) {
        this.f26162a = i7;
        this.f26163b = ysVar;
        this.f26164c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f26162a) {
            case 0:
                ys ysVar = this.f26163b;
                ysVar.f28195x = this.f26164c;
                Intent intent = new Intent(t0.f26931b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ysVar.currentAccount);
                intent.setFlags(268763140);
                t0.f26931b.startActivity(intent);
                t0.f26931b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                ys ysVar2 = this.f26163b;
                ArrayList arrayList = this.f26164c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ysVar2.f28194w.remove(arrayList.get(i7));
                }
                ls.e().k(257, new Object[0]);
                return;
            case 2:
                ys ysVar3 = this.f26163b;
                ArrayList arrayList2 = this.f26164c;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ysVar3.f28194w.remove(arrayList2.get(i10));
                }
                ls.e().k(257, new Object[0]);
                return;
            case 3:
                ys ysVar4 = this.f26163b;
                ArrayList arrayList3 = this.f26164c;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ysVar4.f28194w.remove(arrayList3.get(i11));
                }
                ls.e().k(257, new Object[0]);
                return;
            default:
                ys ysVar5 = this.f26163b;
                ArrayList arrayList4 = this.f26164c;
                int size4 = arrayList4.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ysVar5.f28194w.remove(arrayList4.get(i12));
                }
                ls.e().k(257, new Object[0]);
                return;
        }
    }
}
