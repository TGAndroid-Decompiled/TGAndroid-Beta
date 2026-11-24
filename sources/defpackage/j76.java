package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class j76 {
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
            i76 i76Var = (i76) obj;
            if (i76Var.g > 0) {
                i = Math.min(i, i76Var.d);
                i2 = Math.max(i2, de5.b(this.a, (int) i76Var.g, 0) + i76Var.d);
            }
        }
        Typeface typeface = gl.a;
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
            i76 i76Var = (i76) obj;
            long j = i76Var.g;
            if (j > 0 && currentTime - i76Var.d <= de5.b(this.a, (int) j, 0)) {
                i += (int) i76Var.g;
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
            i76 i76Var = (i76) obj;
            if (i76Var.g > 0) {
                currentTime = Math.min(currentTime, i76Var.d);
            }
        }
        this.c = currentTime;
    }
}
