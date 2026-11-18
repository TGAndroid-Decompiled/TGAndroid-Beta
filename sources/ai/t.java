package ai;

import java.util.ArrayList;
public final class t {
    public final String f1531a;
    public final String[] f1532b;
    public volatile long f1533c;
    public volatile long d;
    public int f1534e;
    public boolean f1536g;
    public boolean h;
    public volatile float f1537i;
    public final ArrayList f1535f = new ArrayList();
    public final ArrayList f1538j = new ArrayList();

    public t(String str, String[] strArr, long j3) {
        this.f1531a = str;
        this.f1532b = strArr;
        this.f1533c = j3;
    }

    public final String a() {
        return a8.p0.s(new StringBuilder(), this.f1531a, ".tzf");
    }

    public final boolean b(String str) {
        for (String str2 : this.f1532b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
