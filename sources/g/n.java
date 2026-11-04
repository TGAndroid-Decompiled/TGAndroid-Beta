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
    public final Window.Callback f11714a;
    public boolean f11715b;
    public boolean f11716c;
    public boolean d;
    public final s f11717e;

    public n(s sVar, Window.Callback callback) {
        this.f11717e = sVar;
        if (callback != null) {
            this.f11714a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f11715b = true;
            callback.onContentChanged();
        } finally {
            this.f11715b = false;
        }
    }

    public final boolean b(int i3, Menu menu) {
        return this.f11714a.onMenuOpened(i3, menu);
    }

    public final void c(int i3, Menu menu) {
        this.f11714a.onPanelClosed(i3, menu);
    }

    public final void d(List list, Menu menu, int i3) {
        k.l.a(this.f11714a, list, menu, i3);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11714a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f11716c;
        Window.Callback callback = this.f11714a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f11717e.j(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f11714a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11714a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11714a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f11714a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f11714a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f11714a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f11715b) {
            this.f11714a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f11714a.onCreatePanelMenu(i3, menu);
    }

    @Override
    public final View onCreatePanelView(int i3) {
        return this.f11714a.onCreatePanelView(i3);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f11714a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f11714a.onMenuItemSelected(i3, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i3, Menu menu) {
        b0 q10;
        b(i3, menu);
        if (i3 == 108 && (q10 = this.f11717e.q()) != null) {
            ArrayList arrayList = q10.f11670m;
            if (true != q10.f11669l) {
                q10.f11669l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i3, Menu menu) {
        if (this.d) {
            this.f11714a.onPanelClosed(i3, menu);
            return;
        }
        c(i3, menu);
        s sVar = this.f11717e;
        if (i3 == 108) {
            b0 q10 = sVar.q();
            if (q10 != null) {
                ArrayList arrayList = q10.f11670m;
                if (q10.f11669l) {
                    q10.f11669l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i3 == 0) {
            r p10 = sVar.p(i3);
            if (p10.f11733m) {
                sVar.i(p10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.m.a(this.f11714a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        l.k kVar;
        if (menu instanceof l.k) {
            kVar = (l.k) menu;
        } else {
            kVar = null;
        }
        if (i3 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f17437x = true;
        }
        boolean onPreparePanel = this.f11714a.onPreparePanel(i3, view, menu);
        if (kVar != null) {
            kVar.f17437x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        l.k kVar = this.f11717e.p(0).h;
        if (kVar != null) {
            d(list, kVar, i3);
        } else {
            d(list, menu, i3);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f11714a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11714a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f11714a.onWindowFocusChanged(z10);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f11714a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
