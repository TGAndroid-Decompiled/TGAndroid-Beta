package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
public final class t9 {
    public final byte a;

    public final Object a(Intent intent, int i) {
        boolean z;
        switch (this.a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            if (i2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(ul2.c(arrayList2, 10), ul2.c(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new rx7(it.next(), it2.next()));
                        }
                        return uk6.e(arrayList3);
                    }
                }
                return y24.a;
            case 1:
                return new r9(intent, i);
            case 2:
                return new r9(intent, i);
            default:
                return new r9(intent, i);
        }
    }
}
