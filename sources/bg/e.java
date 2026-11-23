package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ls;
public final class e implements Runnable {
    public final int f3241a;
    public final ArrayList f3242b;

    public e(int i7, ArrayList arrayList) {
        this.f3241a = i7;
        this.f3242b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3241a) {
            case 0:
                ArrayList arrayList = this.f3242b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.a0.h = this.f3242b;
                sg.a0.f57198i = false;
                ls.e().k(334, new Object[0]);
                return;
        }
    }
}
