package defpackage;

import android.os.AsyncTask;
import org.telegram.ui.p;
public final class o18 extends AsyncTask {
    public final zd1 a;
    public final p b;

    public o18(p pVar, zd1 zd1Var) {
        this.b = pVar;
        this.a = zd1Var;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o18.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        p pVar = this.b;
        if (pVar.R0) {
            return;
        }
        if (str == null) {
            ik.t0(jb6.M0(2131747137, null), pVar);
        } else {
            pVar.x0 = str;
            pVar.i0();
        }
        pVar.N0(true, false);
        pVar.J0(false);
    }
}
