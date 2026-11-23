package ai;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class q {
    public final String f1454a;
    public final String[] f1455b;
    public volatile String[] f1456c;
    public volatile String[] d;
    public volatile long f1457e;
    public volatile long f1458f;
    public int f1459g;
    public boolean f1460i;
    public boolean f1461j;
    public volatile float f1462k;
    public final ArrayList h = new ArrayList();
    public final ArrayList f1463l = new ArrayList();

    public q(String str, String[] strArr, String[] strArr2, long j3) {
        this.f1454a = str;
        this.f1455b = strArr;
        this.f1456c = strArr2;
        this.f1457e = j3;
    }

    public final String a(String str) {
        String[] split;
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(DictationAsr.g0(this, str2));
        }
        return sb2.toString();
    }

    public final String b() {
        return a8.p0.s(new StringBuilder(), this.f1454a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.f1455b) {
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
            strArr = this.f1456c;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (DictationAsr.p(str2).equals(str)) {
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
