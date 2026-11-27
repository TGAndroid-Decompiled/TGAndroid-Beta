package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
public final class eq5 extends InputConnectionWrapper {
    public final gq5 a;

    public eq5(InputConnection inputConnection, gq5 gq5Var) {
        super(inputConnection, false);
        this.a = gq5Var;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        kj4 kj4Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            kj4Var = new kj4(new hq5(inputContentInfo), (byte) 8);
        }
        if (this.a.a(kj4Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
