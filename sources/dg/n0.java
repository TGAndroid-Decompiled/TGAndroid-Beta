package dg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class n0 implements Runnable {
    public final int f4619a;
    public final ArrayList f4620b;

    public n0(ArrayList arrayList, int i10) {
        this.f4619a = i10;
        this.f4620b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f4619a) {
            case 0:
                s0.h = this.f4620b;
                s0.f4664i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f4620b;
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
