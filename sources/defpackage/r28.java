package defpackage;

import android.os.AsyncTask;
import org.telegram.ui.p;
public final class r28 extends AsyncTask {
    public final zc1 a;
    public final p b;

    public r28(p pVar, zc1 zc1Var) {
        this.b = pVar;
        this.a = zc1Var;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r28.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        p pVar = this.b;
        if (pVar.R0) {
            return;
        }
        if (str == null) {
            jj.t0(ob6.M0(2131747131, null), pVar);
        } else {
            pVar.x0 = str;
            pVar.h0();
        }
        pVar.N0(true, false);
        pVar.J0(false);
    }
}
