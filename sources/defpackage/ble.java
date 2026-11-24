package defpackage;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public abstract class ble {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, do5 do5Var) {
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new bo5(inputConnection, do5Var);
            }
            if (au3.a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new co5(inputConnection, do5Var);
        }
        fvc.f("editorInfo must be non-null");
        return null;
    }
}
