package ag;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class p0 implements Runnable {
    public final int f627a;
    public final ArrayList f628b;

    public p0(ArrayList arrayList, int i10) {
        this.f627a = i10;
        this.f628b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f627a) {
            case 0:
                u0.h = this.f628b;
                u0.f673i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f628b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Bitmap) obj).recycle();
                }
                return;
        }
    }
}
