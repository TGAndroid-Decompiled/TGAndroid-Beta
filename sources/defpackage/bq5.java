package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
public final class bq5 extends InputConnectionWrapper {
    public final dq5 a;

    public bq5(InputConnection inputConnection, dq5 dq5Var) {
        super(inputConnection, false);
        this.a = dq5Var;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        lj4 lj4Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            lj4Var = new lj4(new eq5(inputContentInfo));
        }
        if (this.a.a(lj4Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
