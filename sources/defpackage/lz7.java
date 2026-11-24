package defpackage;

import android.os.AsyncTask;
import org.telegram.ui.p;
public final class lz7 extends AsyncTask {
    public final rc1 a;
    public final p b;

    public lz7(p pVar, rc1 rc1Var) {
        this.b = pVar;
        this.a = rc1Var;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz7.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        p pVar = this.b;
        if (pVar.R0) {
            return;
        }
        if (str == null) {
            ij.t0(k96.M0(2131747211, null), pVar);
        } else {
            pVar.x0 = str;
            pVar.h0();
        }
        pVar.M0(true, false);
        pVar.I0(false);
    }
}
