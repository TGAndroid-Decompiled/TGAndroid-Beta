package ai;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class t {
    public final String f1516a;
    public final String[] f1517b;
    public volatile String[] f1518c;
    public volatile String[] d;
    public volatile long f1519e;
    public volatile long f1520f;
    public int f1521g;
    public boolean f1522i;
    public boolean f1523j;
    public volatile float f1524k;
    public final ArrayList h = new ArrayList();
    public final ArrayList f1525l = new ArrayList();

    public t(String str, String[] strArr, String[] strArr2, long j3) {
        this.f1516a = str;
        this.f1517b = strArr;
        this.f1518c = strArr2;
        this.f1519e = j3;
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
        return a8.p0.s(new StringBuilder(), this.f1516a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.f1517b) {
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
            strArr = this.f1518c;
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
