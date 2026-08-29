package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class t0 {
    public int f16250a;
    public long f16251b;
    public int f16252c;
    public long d;
    public int f16253e;
    public ArrayList f16254f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f16250a).getCurrentTime();
        ArrayList arrayList = this.f16254f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            s0 s0Var = (s0) obj;
            if (s0Var.f16199g > 0) {
                i10 = Math.min(i10, s0Var.d);
                i11 = Math.max(i11, s.b(this.f16250a, (int) s0Var.f16199g, 0) + s0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f16250a).getCurrentTime();
        ArrayList arrayList = this.f16254f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s0 s0Var = (s0) obj;
            long j10 = s0Var.f16199g;
            if (j10 > 0 && currentTime - s0Var.d <= s.b(this.f16250a, (int) j10, 0)) {
                i10 += (int) s0Var.f16199g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f16250a).getCurrentTime();
        ArrayList arrayList = this.f16254f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            if (s0Var.f16199g > 0) {
                currentTime = Math.min(currentTime, s0Var.d);
            }
        }
        this.f16252c = currentTime;
    }
}
