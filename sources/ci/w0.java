package ci;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class w0 {
    public int f6097a;
    public long f6098b;
    public int f6099c;
    public long d;
    public int e;
    public ArrayList f6100f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f6097a).getCurrentTime();
        ArrayList arrayList = this.f6100f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            v0 v0Var = (v0) obj;
            if (v0Var.f6068g > 0) {
                i10 = Math.min(i10, v0Var.d);
                i11 = Math.max(i11, u.b(this.f6097a, (int) v0Var.f6068g, 0) + v0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i11, i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f6097a).getCurrentTime();
        ArrayList arrayList = this.f6100f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            v0 v0Var = (v0) obj;
            long j10 = v0Var.f6068g;
            if (j10 > 0 && currentTime - v0Var.d <= u.b(this.f6097a, (int) j10, 0)) {
                i10 += (int) v0Var.f6068g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f6097a).getCurrentTime();
        ArrayList arrayList = this.f6100f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v0 v0Var = (v0) obj;
            if (v0Var.f6068g > 0) {
                currentTime = Math.min(currentTime, v0Var.d);
            }
        }
        this.f6099c = currentTime;
    }
}
