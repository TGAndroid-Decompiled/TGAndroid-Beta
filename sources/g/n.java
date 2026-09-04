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
    public final Window.Callback f10207a;
    public boolean f10208b;
    public boolean f10209c;
    public boolean d;
    public final s f10210e;

    public n(s sVar, Window.Callback callback) {
        this.f10210e = sVar;
        if (callback != null) {
            this.f10207a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f10208b = true;
            callback.onContentChanged();
        } finally {
            this.f10208b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f10207a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f10207a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.k.a(this.f10207a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10207a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f10209c;
        Window.Callback callback = this.f10207a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f10210e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f10207a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10207a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10207a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f10207a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f10207a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f10207a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f10208b) {
            this.f10207a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.l)) {
            return false;
        }
        return this.f10207a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f10207a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f10207a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f10207a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b0 q6;
        b(i10, menu);
        if (i10 == 108 && (q6 = this.f10210e.q()) != null) {
            ArrayList arrayList = q6.f10153m;
            if (true != q6.f10152l) {
                q6.f10152l = true;
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
            this.f10207a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        s sVar = this.f10210e;
        if (i10 == 108) {
            b0 q6 = sVar.q();
            if (q6 != null) {
                ArrayList arrayList = q6.f10153m;
                if (q6.f10152l) {
                    q6.f10152l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            r p5 = sVar.p(i10);
            if (p5.f10226m) {
                sVar.h(p5, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f10207a, z10);
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
            lVar.f15130x = true;
        }
        boolean onPreparePanel = this.f10207a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f15130x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.f10210e.p(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f10207a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10207a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f10207a.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f10210e.H) {
            return e(callback);
        }
        return this.f10207a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f10207a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.f10210e.H && i10 == 0) {
            return e(callback);
        }
        return k.j.b(this.f10207a, callback, i10);
    }
}
