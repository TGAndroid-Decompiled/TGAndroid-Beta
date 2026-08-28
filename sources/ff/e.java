package ff;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e implements Runnable {
    public final int f6163a;
    public final ArrayList f6164b;

    public e(ArrayList arrayList, int i9) {
        this.f6163a = i9;
        this.f6164b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f6163a) {
            case 0:
                ArrayList arrayList = this.f6164b;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                xf.i0.h = this.f6164b;
                xf.i0.f49239i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
        }
    }
}
