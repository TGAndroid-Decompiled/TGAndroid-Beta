package defpackage;

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
public final class wo implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final bp e;

    public wo(bp bpVar, Window.Callback callback) {
        this.e = bpVar;
        if (callback != null) {
            this.a = callback;
        } else {
            w26.j("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        vwc.a(this.a, list, menu, i);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof yz6)) {
            return false;
        }
        return this.a.onCreatePanelMenu(i, menu);
    }

    @Override
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i, Menu menu) {
        zwc p;
        b(i, menu);
        if (i == 108 && (p = this.e.p()) != null) {
            ArrayList arrayList = p.m;
            if (true != p.l) {
                p.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    fyb.g();
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        bp bpVar = this.e;
        if (i == 108) {
            zwc p = bpVar.p();
            if (p != null) {
                ArrayList arrayList = p.m;
                if (p.l) {
                    p.l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        fyb.g();
                    }
                }
            }
        } else if (i == 0) {
            ap o = bpVar.o(i);
            if (o.m) {
                bpVar.h(o, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z) {
        wwc.a(this.a, z);
    }

    @Override
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        yz6 yz6Var;
        if (menu instanceof yz6) {
            yz6Var = (yz6) menu;
        } else {
            yz6Var = null;
        }
        if (i == 0 && yz6Var == null) {
            return false;
        }
        if (yz6Var != null) {
            yz6Var.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (yz6Var != null) {
            yz6Var.x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        yz6 yz6Var = this.e.o(0).h;
        if (yz6Var != null) {
            d(list, yz6Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return uwc.a(this.a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
