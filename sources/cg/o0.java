package cg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class o0 implements Runnable {
    public final int f2471a;
    public final ArrayList f2472b;

    public o0(ArrayList arrayList, int i10) {
        this.f2471a = i10;
        this.f2472b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f2471a) {
            case 0:
                t0.h = this.f2472b;
                t0.f2511i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f2472b;
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
