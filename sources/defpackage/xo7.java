package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PopupNotificationActivity;
public final class xo7 implements Runnable {
    public final byte a;
    public final ip7 b;
    public final ArrayList c;

    public xo7(ip7 ip7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ip7 ip7Var = this.b;
                ip7Var.x = this.c;
                Intent intent = new Intent(a.b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", ip7Var.currentAccount);
                intent.setFlags(268763140);
                a.b.startActivity(intent);
                a.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                ip7 ip7Var2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ip7Var2.w.remove(arrayList.get(i));
                }
                jn7.e().k(258, new Object[0]);
                return;
            case 2:
                ip7 ip7Var3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ip7Var3.w.remove(arrayList2.get(i2));
                }
                jn7.e().k(258, new Object[0]);
                return;
            case 3:
                ip7 ip7Var4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ip7Var4.w.remove(arrayList3.get(i3));
                }
                jn7.e().k(258, new Object[0]);
                return;
            default:
                ip7 ip7Var5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ip7Var5.w.remove(arrayList4.get(i4));
                }
                jn7.e().k(258, new Object[0]);
                return;
        }
    }
}
