package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ks;
public final class e implements Runnable {
    public final int f3221a;
    public final ArrayList f3222b;

    public e(int i7, ArrayList arrayList) {
        this.f3221a = i7;
        this.f3222b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3221a) {
            case 0:
                ArrayList arrayList = this.f3222b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.a0.h = this.f3222b;
                sg.a0.f57153i = false;
                ks.e().k(333, new Object[0]);
                return;
        }
    }
}
