package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public abstract class tpe {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, gq5 gq5Var) {
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new eq5(inputConnection, gq5Var);
            }
            if (tu3.a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new fq5(inputConnection, gq5Var);
        }
        p3d.h("editorInfo must be non-null");
        return null;
    }
}
