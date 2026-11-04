package cg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.hs;
public final class e implements Runnable {
    public final int f4641a;
    public final ArrayList f4642b;

    public e(int i3, ArrayList arrayList) {
        this.f4641a = i3;
        this.f4642b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f4641a) {
            case 0:
                ArrayList arrayList = this.f4642b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                tg.b0.h = this.f4642b;
                tg.b0.f55127i = false;
                hs.e().k(331, new Object[0]);
                return;
        }
    }
}
