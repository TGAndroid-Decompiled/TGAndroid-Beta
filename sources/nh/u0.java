package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class u0 {
    public int f15947a;
    public long f15948b;
    public int f15949c;
    public long d;
    public int e;
    public ArrayList f15950f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f15947a).getCurrentTime();
        ArrayList arrayList = this.f15950f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            t0 t0Var = (t0) obj;
            if (t0Var.f15900g > 0) {
                i10 = Math.min(i10, t0Var.d);
                i11 = Math.max(i11, t.b(this.f15947a, (int) t0Var.f15900g, 0) + t0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f15947a).getCurrentTime();
        ArrayList arrayList = this.f15950f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            long j10 = t0Var.f15900g;
            if (j10 > 0 && currentTime - t0Var.d <= t.b(this.f15947a, (int) j10, 0)) {
                i10 += (int) t0Var.f15900g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f15947a).getCurrentTime();
        ArrayList arrayList = this.f15950f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t0 t0Var = (t0) obj;
            if (t0Var.f15900g > 0) {
                currentTime = Math.min(currentTime, t0Var.d);
            }
        }
        this.f15949c = currentTime;
    }
}
