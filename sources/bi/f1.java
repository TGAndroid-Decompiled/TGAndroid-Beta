package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class f1 {
    public int f2947a;
    public long f2948b;
    public int f2949c;
    public long d;
    public int f2950e;
    public ArrayList f2951f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f2947a).getCurrentTime();
        ArrayList arrayList = this.f2951f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            e1 e1Var = (e1) obj;
            if (e1Var.f2903g > 0) {
                i10 = Math.min(i10, e1Var.d);
                i11 = Math.max(i11, z.b(this.f2947a, (int) e1Var.f2903g, 0) + e1Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f2947a).getCurrentTime();
        ArrayList arrayList = this.f2951f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e1 e1Var = (e1) obj;
            long j3 = e1Var.f2903g;
            if (j3 > 0 && currentTime - e1Var.d <= z.b(this.f2947a, (int) j3, 0)) {
                i10 += (int) e1Var.f2903g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f2947a).getCurrentTime();
        ArrayList arrayList = this.f2951f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e1 e1Var = (e1) obj;
            if (e1Var.f2903g > 0) {
                currentTime = Math.min(currentTime, e1Var.d);
            }
        }
        this.f2949c = currentTime;
    }
}
