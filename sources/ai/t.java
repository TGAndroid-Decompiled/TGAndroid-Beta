package ai;

import java.util.ArrayList;
public final class t {
    public final String f1539a;
    public final String[] f1540b;
    public volatile long f1541c;
    public volatile long d;
    public int f1542e;
    public boolean f1544g;
    public boolean h;
    public volatile float f1545i;
    public final ArrayList f1543f = new ArrayList();
    public final ArrayList f1546j = new ArrayList();

    public t(String str, String[] strArr, long j3) {
        this.f1539a = str;
        this.f1540b = strArr;
        this.f1541c = j3;
    }

    public final String a() {
        return a8.p0.s(new StringBuilder(), this.f1539a, ".tzf");
    }

    public final boolean b(String str) {
        for (String str2 : this.f1540b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
