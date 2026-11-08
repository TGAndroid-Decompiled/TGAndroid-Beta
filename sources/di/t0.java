package di;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class t0 {
    public int f9773a;
    public long f9774b;
    public int f9775c;
    public long d;
    public int f9776e;
    public ArrayList f9777f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f9773a).getCurrentTime();
        ArrayList arrayList = this.f9777f;
        int size = arrayList.size();
        int i7 = currentTime;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s0 s0Var = (s0) obj;
            if (s0Var.f9741g > 0) {
                i7 = Math.min(i7, s0Var.d);
                i10 = Math.max(i10, t.b(this.f9773a, (int) s0Var.f9741g, 0) + s0Var.d);
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f22535a;
        return (currentTime - i10) / (i7 - i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f9773a).getCurrentTime();
        ArrayList arrayList = this.f9777f;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            long j3 = s0Var.f9741g;
            if (j3 > 0 && currentTime - s0Var.d <= t.b(this.f9773a, (int) j3, 0)) {
                i7 += (int) s0Var.f9741g;
            }
        }
        this.d = Math.max(this.d, i7);
        return i7;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f9773a).getCurrentTime();
        ArrayList arrayList = this.f9777f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s0 s0Var = (s0) obj;
            if (s0Var.f9741g > 0) {
                currentTime = Math.min(currentTime, s0Var.d);
            }
        }
        this.f9775c = currentTime;
    }
}
