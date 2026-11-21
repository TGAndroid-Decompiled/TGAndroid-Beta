package ai;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class t {
    public final String f1508a;
    public final String[] f1509b;
    public volatile String[] f1510c;
    public volatile String[] d;
    public volatile long f1511e;
    public volatile long f1512f;
    public int f1513g;
    public boolean f1514i;
    public boolean f1515j;
    public volatile float f1516k;
    public final ArrayList h = new ArrayList();
    public final ArrayList f1517l = new ArrayList();

    public t(String str, String[] strArr, String[] strArr2, long j3) {
        this.f1508a = str;
        this.f1509b = strArr;
        this.f1510c = strArr2;
        this.f1511e = j3;
    }

    public final String a(String str) {
        String[] split;
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(DictationAsr.d0(this, str2));
        }
        return sb2.toString();
    }

    public final String b() {
        return a8.p0.s(new StringBuilder(), this.f1508a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.f1509b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final String[] d(String str) {
        String[] strArr;
        if (this.d != null) {
            strArr = this.d;
        } else {
            strArr = this.f1510c;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (DictationAsr.o(str2).equals(str)) {
                arrayList.add(str2);
            }
        }
        String b10 = DictationAsr.b(arrayList);
        if (b10 != null) {
            arrayList.remove(b10);
            arrayList.add(0, b10);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
