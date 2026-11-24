package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class j96 {
    public int a;
    public long b;
    public int c;
    public long d;
    public int e;
    public ArrayList f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = currentTime;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i96 i96Var = (i96) obj;
            if (i96Var.g > 0) {
                i = Math.min(i, i96Var.d);
                i2 = Math.max(i2, bg5.b(this.a, (int) i96Var.g, 0) + i96Var.d);
            }
        }
        Typeface typeface = gm.a;
        return (currentTime - i2) / (i - i2);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i96 i96Var = (i96) obj;
            long j = i96Var.g;
            if (j > 0 && currentTime - i96Var.d <= bg5.b(this.a, (int) j, 0)) {
                i += (int) i96Var.g;
            }
        }
        this.d = Math.max(this.d, i);
        return i;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i96 i96Var = (i96) obj;
            if (i96Var.g > 0) {
                currentTime = Math.min(currentTime, i96Var.d);
            }
        }
        this.c = currentTime;
    }
}
