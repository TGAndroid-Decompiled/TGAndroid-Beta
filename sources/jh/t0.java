package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

public final class t0 {

    public int f13985a;

    public long f13986b;

    public int f13987c;
    public long d;

    public int f13988e;

    public ArrayList f13989f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.f13985a).getCurrentTime();
        ArrayList arrayList = this.f13989f;
        int size = arrayList.size();
        int iMin = currentTime;
        int iMax = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            if (s0Var.f13934g > 0) {
                iMin = Math.min(iMin, s0Var.d);
                iMax = Math.max(iMax, s.b(this.f13985a, (int) s0Var.f13934g, 0) + s0Var.d);
            }
        }
        return AndroidUtilities.ilerp(currentTime, iMax, iMin);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.f13985a).getCurrentTime();
        ArrayList arrayList = this.f13989f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s0 s0Var = (s0) obj;
            long j10 = s0Var.f13934g;
            if (j10 > 0 && currentTime - s0Var.d <= s.b(this.f13985a, (int) j10, 0)) {
                i10 += (int) s0Var.f13934g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.f13985a).getCurrentTime();
        ArrayList arrayList = this.f13989f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            if (s0Var.f13934g > 0) {
                currentTime = Math.min(currentTime, s0Var.d);
            }
        }
        this.f13987c = currentTime;
    }
}
