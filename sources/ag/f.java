package ag;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f implements Runnable {
    public final int f1273a;
    public final ArrayList f1274b;

    public f(ArrayList arrayList, int i10) {
        this.f1273a = i10;
        this.f1274b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f1273a) {
            case 0:
                ArrayList arrayList = this.f1274b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                rg.j0.h = this.f1274b;
                rg.j0.f47436i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
        }
    }
}
