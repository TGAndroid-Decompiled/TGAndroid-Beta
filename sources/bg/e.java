package bg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.qs;
public final class e implements Runnable {
    public final int f3269a;
    public final ArrayList f3270b;

    public e(int i7, ArrayList arrayList) {
        this.f3269a = i7;
        this.f3270b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f3269a) {
            case 0:
                ArrayList arrayList = this.f3270b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Bitmap) obj).recycle();
                }
                return;
            default:
                sg.b0.h = this.f3270b;
                sg.b0.f55017i = false;
                qs.e().k(331, new Object[0]);
                return;
        }
    }
}
