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
public final class m implements Window.Callback {
    public final Window.Callback f6274a;
    public boolean f6275b;
    public boolean f6276c;
    public boolean d;
    public final q e;

    public m(q qVar, Window.Callback callback) {
        this.e = qVar;
        if (callback != null) {
            this.f6274a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6275b = true;
            callback.onContentChanged();
        } finally {
            this.f6275b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f6274a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f6274a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.l.a(this.f6274a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6274a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f6276c;
        Window.Callback callback = this.f6274a;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.e.j(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f6274a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6274a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6274a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6274a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6274a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f6274a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f6275b) {
            this.f6274a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f6274a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f6274a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f6274a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f6274a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        a0 r10;
        b(i10, menu);
        if (i10 == 108 && (r10 = this.e.r()) != null) {
            ArrayList arrayList = r10.f6222m;
            if (true != r10.f6221l) {
                r10.f6221l = true;
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
            this.f6274a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        q qVar = this.e;
        if (i10 == 108) {
            a0 r10 = qVar.r();
            if (r10 != null) {
                ArrayList arrayList = r10.f6222m;
                if (r10.f6221l) {
                    r10.f6221l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            p p10 = qVar.p(i10);
            if (p10.f6288m) {
                qVar.h(p10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z4) {
        k.m.a(this.f6274a, z4);
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
            kVar.f11169x = true;
        }
        boolean onPreparePanel = this.f6274a.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.f11169x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.k kVar = this.e.p(0).h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f6274a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6274a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z4) {
        this.f6274a.onWindowFocusChanged(z4);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.e.E) {
            return e(callback);
        }
        return this.f6274a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f6274a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.e.E && i10 == 0) {
            return e(callback);
        }
        return k.k.b(this.f6274a, callback, i10);
    }
}
