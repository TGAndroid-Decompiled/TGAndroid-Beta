package ih;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class v0 {
    public int f12220a;
    public long f12221b;
    public int f12222c;
    public long d;
    public int f12223e;
    public ArrayList f12224f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f12220a).getCurrentTime();
        ArrayList arrayList = this.f12224f;
        int size = arrayList.size();
        int i9 = currentTime;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u0 u0Var = (u0) obj;
            if (u0Var.f12179g > 0) {
                i9 = Math.min(i9, u0Var.d);
                i10 = Math.max(i10, u.b(this.f12220a, (int) u0Var.f12179g, 0) + u0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, i10, i9);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f12220a).getCurrentTime();
        ArrayList arrayList = this.f12224f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u0 u0Var = (u0) obj;
            long j10 = u0Var.f12179g;
            if (j10 > 0 && currentTime - u0Var.d <= u.b(this.f12220a, (int) j10, 0)) {
                i9 += (int) u0Var.f12179g;
            }
        }
        this.d = Math.max(this.d, i9);
        return i9;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f12220a).getCurrentTime();
        ArrayList arrayList = this.f12224f;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            u0 u0Var = (u0) obj;
            if (u0Var.f12179g > 0) {
                currentTime = Math.min(currentTime, u0Var.d);
            }
        }
        this.f12222c = currentTime;
    }
}
