package ai;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class p {
    public final String f1442a;
    public final String[] f1443b;
    public volatile String[] f1444c;
    public volatile String[] d;
    public volatile long f1445e;
    public volatile long f1446f;
    public int f1447g;
    public boolean f1448i;
    public boolean f1449j;
    public volatile float f1450k;
    public final ArrayList h = new ArrayList();
    public final ArrayList f1451l = new ArrayList();

    public p(String str, String[] strArr, String[] strArr2, long j3) {
        this.f1442a = str;
        this.f1443b = strArr;
        this.f1444c = strArr2;
        this.f1445e = j3;
    }

    public final String a(String str) {
        String[] split;
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(DictationAsr.c0(this, str2));
        }
        return sb2.toString();
    }

    public final String b() {
        return a8.p0.s(new StringBuilder(), this.f1442a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.f1443b) {
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
            strArr = this.f1444c;
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
