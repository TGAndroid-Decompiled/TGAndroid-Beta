package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ks;
public final class e implements Runnable {
    public final int f3234a;
    public final ArrayList f3235b;

    public e(int i7, ArrayList arrayList) {
        this.f3234a = i7;
        this.f3235b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3234a) {
            case 0:
                ArrayList arrayList = this.f3235b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.a0.h = this.f3235b;
                sg.a0.f57194i = false;
                ks.e().k(334, new Object[0]);
                return;
        }
    }
}
