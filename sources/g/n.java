package g;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
public final class n implements Window.Callback {
    public final Window.Callback f10235a;
    public boolean f10236b;
    public boolean f10237c;
    public boolean d;
    public final s f10238e;

    public n(s sVar, Window.Callback callback) {
        this.f10238e = sVar;
        if (callback != null) {
            this.f10235a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f10236b = true;
            callback.onContentChanged();
        } finally {
            this.f10236b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f10235a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f10235a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.k.a(this.f10235a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10235a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f10237c;
        Window.Callback callback = this.f10235a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f10238e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f10235a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10235a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10235a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f10235a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f10235a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f10235a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f10236b) {
            this.f10235a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.l)) {
            return false;
        }
        return this.f10235a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f10235a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f10235a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f10235a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b0 q6;
        b(i10, menu);
        if (i10 == 108 && (q6 = this.f10238e.q()) != null) {
            ArrayList arrayList = q6.f10181m;
            if (true != q6.f10180l) {
                q6.f10180l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.d) {
            this.f10235a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        s sVar = this.f10238e;
        if (i10 == 108) {
            b0 q6 = sVar.q();
            if (q6 != null) {
                ArrayList arrayList = q6.f10181m;
                if (q6.f10180l) {
                    q6.f10180l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            r p5 = sVar.p(i10);
            if (p5.f10254m) {
                sVar.h(p5, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f10235a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.l lVar;
        if (menu instanceof l.l) {
            lVar = (l.l) menu;
        } else {
            lVar = null;
        }
        if (i10 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f15156x = true;
        }
        boolean onPreparePanel = this.f10235a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f15156x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.f10238e.p(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f10235a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10235a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f10235a.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f10238e.H) {
            return e(callback);
        }
        return this.f10235a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f10235a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.f10238e.H && i10 == 0) {
            return e(callback);
        }
        return k.j.b(this.f10235a, callback, i10);
    }
}
