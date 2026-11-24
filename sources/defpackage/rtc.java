package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;
public final class rtc extends AsyncTask {
    public static final int f = 0;
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final stc e;

    public rtc(stc stcVar, String str) {
        this.e = stcVar;
        this.a = str;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        stc stcVar = this.e;
        if (str != null) {
            if (w01.a) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                de9.s(strArr[0], sb);
            }
            stcVar.x = true;
            stcVar.y = strArr[0];
            String str2 = strArr[1];
            stcVar.E = str2;
            if (str2.equals("hls")) {
                stcVar.I = true;
            }
            if (stcVar.s) {
                stcVar.i();
            }
            stcVar.j(false, true);
            stcVar.g0.d(true, true);
        } else if (!isCancelled()) {
            stcVar.h();
        }
    }
}
