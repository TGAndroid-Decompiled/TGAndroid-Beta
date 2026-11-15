package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ns;
public final class e implements Runnable {
    public final int f3227a;
    public final ArrayList f3228b;

    public e(int i7, ArrayList arrayList) {
        this.f3227a = i7;
        this.f3228b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3227a) {
            case 0:
                ArrayList arrayList = this.f3228b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.a0.h = this.f3228b;
                sg.a0.f56579i = false;
                ns.e().k(331, new Object[0]);
                return;
        }
    }
}
