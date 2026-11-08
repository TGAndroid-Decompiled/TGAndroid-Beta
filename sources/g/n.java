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
    public final Window.Callback f13330a;
    public boolean f13331b;
    public boolean f13332c;
    public boolean d;
    public final s f13333e;

    public n(s sVar, Window.Callback callback) {
        this.f13333e = sVar;
        if (callback != null) {
            this.f13330a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f13331b = true;
            callback.onContentChanged();
        } finally {
            this.f13331b = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f13330a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f13330a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        k.k.a(this.f13330a, list, menu, i7);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f13330a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f13332c;
        Window.Callback callback = this.f13330a;
        if (z9) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f13333e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f13330a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f13330a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f13330a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f13330a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f13330a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f13330a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f13331b) {
            this.f13330a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f13330a.onCreatePanelMenu(i7, menu);
    }

    @Override
    public final View onCreatePanelView(int i7) {
        return this.f13330a.onCreatePanelView(i7);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f13330a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f13330a.onMenuItemSelected(i7, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i7, Menu menu) {
        b0 p10;
        b(i7, menu);
        if (i7 == 108 && (p10 = this.f13333e.p()) != null) {
            ArrayList arrayList = p10.f13286m;
            if (true != p10.f13285l) {
                p10.f13285l = true;
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
            this.f13330a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        s sVar = this.f13333e;
        if (i7 == 108) {
            b0 p10 = sVar.p();
            if (p10 != null) {
                ArrayList arrayList = p10.f13286m;
                if (p10.f13285l) {
                    p10.f13285l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i7 == 0) {
            r o4 = sVar.o(i7);
            if (o4.f13349m) {
                sVar.h(o4, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z9) {
        k.l.a(this.f13330a, z9);
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
            kVar.f17691x = true;
        }
        boolean onPreparePanel = this.f13330a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.f17691x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        l.k kVar = this.f13333e.o(0).h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f13330a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f13330a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        this.f13330a.onWindowFocusChanged(z9);
    }

    @Override
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f13330a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
