package og;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class h0 implements Runnable {
    public final int f14386a;
    public final ArrayList f14387b;

    public h0(ArrayList arrayList, int i10) {
        this.f14386a = i10;
        this.f14387b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f14386a) {
            case 0:
                m0.h = this.f14387b;
                m0.f14423i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f14387b;
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
