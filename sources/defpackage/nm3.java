package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class nm3 {
    public final String a;
    public final String[] b;
    public volatile String[] c;
    public volatile String[] d;
    public volatile long e;
    public volatile long f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile float k;
    public final ArrayList h = new ArrayList();
    public final ArrayList l = new ArrayList();

    public nm3(String str, String[] strArr, String[] strArr2, long j) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
        this.e = j;
    }

    public final String a(String str) {
        String[] split;
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(DictationAsr.i0(this, str2));
        }
        return sb.toString();
    }

    public final String b() {
        return c00.k(new StringBuilder(), this.a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.b) {
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
            strArr = this.c;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (DictationAsr.n(str2).equals(str)) {
                arrayList.add(str2);
            }
        }
        String h0 = DictationAsr.h0(arrayList);
        if (h0 != null) {
            arrayList.remove(h0);
            arrayList.add(0, h0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
