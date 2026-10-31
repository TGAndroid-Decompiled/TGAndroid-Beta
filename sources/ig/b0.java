package ig;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.zs;
public final class b0 implements Runnable {
    public final int f8278a;
    public final ArrayList f8279b;

    public b0(int i10, ArrayList arrayList) {
        this.f8278a = i10;
        this.f8279b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f8278a) {
            case 0:
                h0.h = this.f8279b;
                h0.f8318i = false;
                zs.e().k(331, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f8279b;
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
