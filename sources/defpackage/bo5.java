package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
public final class bo5 extends InputConnectionWrapper {
    public final do5 a;

    public bo5(InputConnection inputConnection, do5 do5Var) {
        super(inputConnection, false);
        this.a = do5Var;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        gi3 gi3Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            gi3Var = new gi3(new eo5(inputContentInfo));
        }
        if (this.a.a(gi3Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
