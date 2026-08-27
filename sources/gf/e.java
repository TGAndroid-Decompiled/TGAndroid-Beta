package gf;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;

public final class e implements Runnable {

    public final int f6963a;

    public final ArrayList f6964b;

    public e(ArrayList arrayList, int i10) {
        this.f6963a = i10;
        this.f6964b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f6963a) {
            case 0:
                ArrayList arrayList = this.f6964b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Bitmap) obj).recycle();
                }
                break;
            default:
                yf.i0.h = this.f6964b;
                yf.i0.f49947i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                break;
        }
    }
}
