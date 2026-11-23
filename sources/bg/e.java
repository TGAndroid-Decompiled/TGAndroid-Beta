package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ks;
public final class e implements Runnable {
    public final int f3192a;
    public final ArrayList f3193b;

    public e(int i7, ArrayList arrayList) {
        this.f3192a = i7;
        this.f3193b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3192a) {
            case 0:
                ArrayList arrayList = this.f3193b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.a0.h = this.f3193b;
                sg.a0.f57277i = false;
                ks.e().k(334, new Object[0]);
                return;
        }
    }
}
