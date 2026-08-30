package cg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o0 implements Runnable {
    public final int f2488a;
    public final ArrayList f2489b;

    public o0(ArrayList arrayList, int i10) {
        this.f2488a = i10;
        this.f2489b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f2488a) {
            case 0:
                t0.h = this.f2489b;
                t0.f2528i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f2489b;
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
