package ei;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class v0 {
    public int f11105a;
    public long f11106b;
    public int f11107c;
    public long d;
    public int f11108e;
    public ArrayList f11109f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f11105a).getCurrentTime();
        ArrayList arrayList = this.f11109f;
        int size = arrayList.size();
        int i3 = currentTime;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u0 u0Var = (u0) obj;
            if (u0Var.f11074g > 0) {
                i3 = Math.min(i3, u0Var.d);
                i10 = Math.max(i10, u.b(this.f11105a, (int) u0Var.f11074g, 0) + u0Var.d);
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        return (currentTime - i10) / (i3 - i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f11105a).getCurrentTime();
        ArrayList arrayList = this.f11109f;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u0 u0Var = (u0) obj;
            long j10 = u0Var.f11074g;
            if (j10 > 0 && currentTime - u0Var.d <= u.b(this.f11105a, (int) j10, 0)) {
                i3 += (int) u0Var.f11074g;
            }
        }
        this.d = Math.max(this.d, i3);
        return i3;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f11105a).getCurrentTime();
        ArrayList arrayList = this.f11109f;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            u0 u0Var = (u0) obj;
            if (u0Var.f11074g > 0) {
                currentTime = Math.min(currentTime, u0Var.d);
            }
        }
        this.f11107c = currentTime;
    }
}
