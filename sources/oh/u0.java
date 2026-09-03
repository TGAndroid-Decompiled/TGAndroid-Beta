package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class u0 {
    public int f17800a;
    public long f17801b;
    public int f17802c;
    public long d;
    public int f17803e;
    public ArrayList f17804f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f17800a).getCurrentTime();
        ArrayList arrayList = this.f17804f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            t0 t0Var = (t0) obj;
            if (t0Var.f17762g > 0) {
                i10 = Math.min(i10, t0Var.d);
                i11 = Math.max(i11, s.b(this.f17800a, (int) t0Var.f17762g, 0) + t0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f17800a).getCurrentTime();
        ArrayList arrayList = this.f17804f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            long j10 = t0Var.f17762g;
            if (j10 > 0 && currentTime - t0Var.d <= s.b(this.f17800a, (int) j10, 0)) {
                i10 += (int) t0Var.f17762g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f17800a).getCurrentTime();
        ArrayList arrayList = this.f17804f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t0 t0Var = (t0) obj;
            if (t0Var.f17762g > 0) {
                currentTime = Math.min(currentTime, t0Var.d);
            }
        }
        this.f17802c = currentTime;
    }
}
