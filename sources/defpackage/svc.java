package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class svc extends AsyncTask {
    public static final int f = 0;
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final tvc e;

    public svc(tvc tvcVar, String str) {
        this.e = tvcVar;
        this.a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        tvc tvcVar = this.e;
        if (str != null) {
            if (e21.a) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                hg9.r(strArr[0], sb);
            }
            tvcVar.x = true;
            tvcVar.y = strArr[0];
            String str2 = strArr[1];
            tvcVar.E = str2;
            if (str2.equals("hls")) {
                tvcVar.I = true;
            }
            if (tvcVar.s) {
                tvcVar.i();
            }
            tvcVar.j(false, true);
            tvcVar.g0.d(true, true);
        } else if (!isCancelled()) {
            tvcVar.h();
        }
    }
}
