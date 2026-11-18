package ai;

import java.util.ArrayList;
public final class t {
    public final String f1530a;
    public final String[] f1531b;
    public volatile long f1532c;
    public volatile long d;
    public int f1533e;
    public boolean f1535g;
    public boolean h;
    public volatile float f1536i;
    public final ArrayList f1534f = new ArrayList();
    public final ArrayList f1537j = new ArrayList();

    public t(String str, String[] strArr, long j3) {
        this.f1530a = str;
        this.f1531b = strArr;
        this.f1532c = j3;
    }

    public final String a() {
        return a8.p0.s(new StringBuilder(), this.f1530a, ".tzf");
    }

    public final boolean b(String str) {
        for (String str2 : this.f1531b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
