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
    public final Window.Callback f7201a;
    public boolean f7202b;
    public boolean f7203c;
    public boolean d;
    public final r e;

    public m(r rVar, Window.Callback callback) {
        this.e = rVar;
        if (callback != null) {
            this.f7201a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f7202b = true;
            callback.onContentChanged();
        } finally {
            this.f7202b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f7201a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f7201a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.l.a(this.f7201a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7201a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f7203c;
        Window.Callback callback = this.f7201a;
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
        return this.f7201a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7201a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7201a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f7201a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f7201a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f7201a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f7202b) {
            this.f7201a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.l)) {
            return false;
        }
        return this.f7201a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f7201a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f7201a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f7201a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b0 q6;
        b(i10, menu);
        if (i10 == 108 && (q6 = this.e.q()) != null) {
            ArrayList arrayList = q6.f7159m;
            if (true != q6.f7158l) {
                q6.f7158l = true;
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
            this.f7201a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        r rVar = this.e;
        if (i10 == 108) {
            b0 q6 = rVar.q();
            if (q6 != null) {
                ArrayList arrayList = q6.f7159m;
                if (q6.f7158l) {
                    q6.f7158l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            q o10 = rVar.o(i10);
            if (o10.f7217m) {
                rVar.h(o10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.m.a(this.f7201a, z10);
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
            lVar.f11517x = true;
        }
        boolean onPreparePanel = this.f7201a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f11517x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.e.o(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f7201a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7201a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f7201a.onWindowFocusChanged(z10);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f7201a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
