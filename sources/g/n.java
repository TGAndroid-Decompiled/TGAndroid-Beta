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
public final class n implements Window.Callback {
    public final Window.Callback f12989a;
    public boolean f12990b;
    public boolean f12991c;
    public boolean d;
    public final s f12992e;

    public n(s sVar, Window.Callback callback) {
        this.f12992e = sVar;
        if (callback != null) {
            this.f12989a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12990b = true;
            callback.onContentChanged();
        } finally {
            this.f12990b = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f12989a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f12989a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        k.k.a(this.f12989a, list, menu, i7);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12989a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f12991c;
        Window.Callback callback = this.f12989a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f12992e.k(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f12989a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12989a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12989a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12989a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12989a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f12989a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f12990b) {
            this.f12989a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f12989a.onCreatePanelMenu(i7, menu);
    }

    @Override
    public final View onCreatePanelView(int i7) {
        return this.f12989a.onCreatePanelView(i7);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f12989a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f12989a.onMenuItemSelected(i7, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i7, Menu menu) {
        b0 r10;
        b(i7, menu);
        if (i7 == 108 && (r10 = this.f12992e.r()) != null) {
            ArrayList arrayList = r10.f12945m;
            if (true != r10.f12944l) {
                r10.f12944l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.d) {
            this.f12989a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        s sVar = this.f12992e;
        if (i7 == 108) {
            b0 r10 = sVar.r();
            if (r10 != null) {
                ArrayList arrayList = r10.f12945m;
                if (r10.f12944l) {
                    r10.f12944l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i7 == 0) {
            r q10 = sVar.q(i7);
            if (q10.f13008m) {
                sVar.j(q10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f12989a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        l.k kVar;
        if (menu instanceof l.k) {
            kVar = (l.k) menu;
        } else {
            kVar = null;
        }
        if (i7 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f19194x = true;
        }
        boolean onPreparePanel = this.f12989a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.f19194x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        l.k kVar = this.f12992e.q(0).h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f12989a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12989a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f12989a.onWindowFocusChanged(z10);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f12989a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
