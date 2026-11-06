package k;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;
public abstract class k {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        callback.onProvideKeyboardShortcuts(list, menu, i7);
    }
}
