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
    public final Window.Callback f9775a;
    public boolean f9776b;
    public boolean f9777c;
    public boolean d;
    public final r e;

    public m(r rVar, Window.Callback callback) {
        this.e = rVar;
        if (callback != null) {
            this.f9775a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f9776b = true;
            callback.onContentChanged();
        } finally {
            this.f9776b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f9775a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f9775a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.k.a(this.f9775a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9775a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f9777c;
        Window.Callback callback = this.f9775a;
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
        return this.f9775a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9775a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9775a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f9775a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f9775a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f9775a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f9776b) {
            this.f9775a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f9775a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f9775a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f9775a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f9775a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        a0 r10;
        b(i10, menu);
        if (i10 == 108 && (r10 = this.e.r()) != null) {
            ArrayList arrayList = r10.f9723m;
            if (true != r10.f9722l) {
                r10.f9722l = true;
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
            this.f9775a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        r rVar = this.e;
        if (i10 == 108) {
            a0 r10 = rVar.r();
            if (r10 != null) {
                ArrayList arrayList = r10.f9723m;
                if (r10.f9722l) {
                    r10.f9722l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            q q6 = rVar.q(i10);
            if (q6.f9791m) {
                rVar.h(q6, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f9775a, z10);
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
            kVar.f14434x = true;
        }
        boolean onPreparePanel = this.f9775a.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.f14434x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.k kVar = this.e.q(0).h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f9775a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9775a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f9775a.onWindowFocusChanged(z10);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f9775a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
