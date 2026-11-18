package fi;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class s0 {
    public int f12511a;
    public long f12512b;
    public int f12513c;
    public long d;
    public int f12514e;
    public ArrayList f12515f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f12511a).getCurrentTime();
        ArrayList arrayList = this.f12515f;
        int size = arrayList.size();
        int i7 = currentTime;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            r0 r0Var = (r0) obj;
            if (r0Var.f12488g > 0) {
                i7 = Math.min(i7, r0Var.d);
                i10 = Math.max(i10, t.b(this.f12511a, (int) r0Var.f12488g, 0) + r0Var.d);
            }
        }
        Typeface typeface = org.telegram.messenger.g0.f24090a;
        return (currentTime - i10) / (i7 - i10);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f12511a).getCurrentTime();
        ArrayList arrayList = this.f12515f;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r0 r0Var = (r0) obj;
            long j3 = r0Var.f12488g;
            if (j3 > 0 && currentTime - r0Var.d <= t.b(this.f12511a, (int) j3, 0)) {
                i7 += (int) r0Var.f12488g;
            }
        }
        this.d = Math.max(this.d, i7);
        return i7;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f12511a).getCurrentTime();
        ArrayList arrayList = this.f12515f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r0 r0Var = (r0) obj;
            if (r0Var.f12488g > 0) {
                currentTime = Math.min(currentTime, r0Var.d);
            }
        }
        this.f12513c = currentTime;
    }
}
