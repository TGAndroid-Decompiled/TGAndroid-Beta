package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class gyc extends AsyncTask {
    public static final int f = 0;
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final hyc e;

    public gyc(hyc hycVar, String str) {
        this.e = hycVar;
        this.a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        hyc hycVar = this.e;
        if (str != null) {
            if (f11.a) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                uh9.s(strArr[0], sb);
            }
            hycVar.x = true;
            hycVar.y = strArr[0];
            String str2 = strArr[1];
            hycVar.E = str2;
            if (str2.equals("hls")) {
                hycVar.I = true;
            }
            if (hycVar.s) {
                hycVar.i();
            }
            hycVar.j(false, true);
            hycVar.g0.d(true, true);
        } else if (!isCancelled()) {
            hycVar.h();
        }
    }
}
