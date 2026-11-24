package defpackage;

import android.app.Activity;
public final class k58 implements qac {
    public final byte a;
    public final String[] b;
    public final Activity c;
    public final qac d;

    public k58(String[] strArr, Activity activity, qac qacVar, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = activity;
        this.d = qacVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        qac qacVar = this.d;
        Activity activity = this.c;
        String[] strArr = this.b;
        int[] iArr = (int[]) obj;
        switch (b) {
            case 0:
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (activity.checkSelfPermission(strArr[i]) == 0) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                qacVar.a(Boolean.valueOf(z));
                return;
            default:
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (activity.checkSelfPermission(strArr[i2]) == 0) {
                            i2++;
                        }
                    } else {
                        z = true;
                    }
                }
                qacVar.a(Boolean.valueOf(z));
                return;
        }
    }
}
