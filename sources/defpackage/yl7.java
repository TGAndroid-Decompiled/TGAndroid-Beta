package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PopupNotificationActivity;
public final class yl7 implements Runnable {
    public final byte a;
    public final im7 b;
    public final ArrayList c;

    public yl7(im7 im7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                im7 im7Var = this.b;
                im7Var.x = this.c;
                Intent intent = new Intent(a.b, PopupNotificationActivity.class);
                intent.putExtra("force", true);
                intent.putExtra("currentAccount", im7Var.currentAccount);
                intent.setFlags(268763140);
                a.b.startActivity(intent);
                a.b.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 1:
                im7 im7Var2 = this.b;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    im7Var2.w.remove(arrayList.get(i));
                }
                kk7.e().k(257, new Object[0]);
                return;
            case 2:
                im7 im7Var3 = this.b;
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    im7Var3.w.remove(arrayList2.get(i2));
                }
                kk7.e().k(257, new Object[0]);
                return;
            case 3:
                im7 im7Var4 = this.b;
                ArrayList arrayList3 = this.c;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    im7Var4.w.remove(arrayList3.get(i3));
                }
                kk7.e().k(257, new Object[0]);
                return;
            default:
                im7 im7Var5 = this.b;
                ArrayList arrayList4 = this.c;
                int size4 = arrayList4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    im7Var5.w.remove(arrayList4.get(i4));
                }
                kk7.e().k(257, new Object[0]);
                return;
        }
    }
}
