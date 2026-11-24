package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public abstract class dne {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, dq5 dq5Var) {
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new bq5(inputConnection, dq5Var);
            }
            if (lv3.a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new cq5(inputConnection, dq5Var);
        }
        gxc.d("editorInfo must be non-null");
        return null;
    }
}
