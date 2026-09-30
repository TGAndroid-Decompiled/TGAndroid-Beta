package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class n1 {
    public int f1286a;
    public long f1287b;
    public int f1288c;
    public long d;
    public int e;
    public ArrayList f1289f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f1286a).getCurrentTime();
        ArrayList arrayList = this.f1289f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            m1 m1Var = (m1) obj;
            if (m1Var.f1230g > 0) {
                i10 = Math.min(i10, m1Var.d);
                i11 = Math.max(i11, g0.b(this.f1286a, (int) m1Var.f1230g, 0) + m1Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f1286a).getCurrentTime();
        ArrayList arrayList = this.f1289f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            m1 m1Var = (m1) obj;
            long j3 = m1Var.f1230g;
            if (j3 > 0 && currentTime - m1Var.d <= g0.b(this.f1286a, (int) j3, 0)) {
                i10 += (int) m1Var.f1230g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f1286a).getCurrentTime();
        ArrayList arrayList = this.f1289f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m1 m1Var = (m1) obj;
            if (m1Var.f1230g > 0) {
                currentTime = Math.min(currentTime, m1Var.d);
            }
        }
        this.f1288c = currentTime;
    }
}
