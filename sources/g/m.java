package g;

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
public final class m implements Window.Callback {
    public final Window.Callback f12147a;
    public boolean f12148b;
    public boolean f12149c;
    public boolean d;
    public final r e;

    public m(r rVar, Window.Callback callback) {
        this.e = rVar;
        if (callback != null) {
            this.f12147a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12148b = true;
            callback.onContentChanged();
        } finally {
            this.f12148b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f12147a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f12147a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.k.a(this.f12147a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12147a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f12149c;
        Window.Callback callback = this.f12147a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12147a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12147a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12147a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12147a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12147a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f12147a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f12148b) {
            this.f12147a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f12147a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f12147a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f12147a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f12147a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        a0 p10;
        b(i10, menu);
        if (i10 == 108 && (p10 = this.e.p()) != null) {
            ArrayList arrayList = p10.f12095m;
            if (true != p10.f12094l) {
                p10.f12094l = true;
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
            this.f12147a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        r rVar = this.e;
        if (i10 == 108) {
            a0 p10 = rVar.p();
            if (p10 != null) {
                ArrayList arrayList = p10.f12095m;
                if (p10.f12094l) {
                    p10.f12094l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            q o10 = rVar.o(i10);
            if (o10.f12163m) {
                rVar.h(o10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f12147a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.k kVar;
        if (menu instanceof l.k) {
            kVar = (l.k) menu;
        } else {
            kVar = null;
        }
        if (i10 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f16738x = true;
        }
        boolean onPreparePanel = this.f12147a.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.f16738x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.k kVar = this.e.o(0).h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f12147a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12147a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f12147a.onWindowFocusChanged(z10);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f12147a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
