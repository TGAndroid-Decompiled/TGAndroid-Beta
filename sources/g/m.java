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
    public final Window.Callback f6741a;
    public boolean f6742b;
    public boolean f6743c;
    public boolean d;
    public final q f6744e;

    public m(q qVar, Window.Callback callback) {
        this.f6744e = qVar;
        if (callback != null) {
            this.f6741a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6742b = true;
            callback.onContentChanged();
        } finally {
            this.f6742b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f6741a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f6741a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.l.a(this.f6741a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6741a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f6743c;
        Window.Callback callback = this.f6741a;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f6744e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f6741a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6741a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6741a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r12) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6741a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6741a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f6741a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f6742b) {
            this.f6741a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.l)) {
            return false;
        }
        return this.f6741a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f6741a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f6741a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f6741a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        a0 q10;
        b(i10, menu);
        if (i10 == 108 && (q10 = this.f6744e.q()) != null) {
            ArrayList arrayList = q10.f6687m;
            if (true != q10.f6686l) {
                q10.f6686l = true;
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
            this.f6741a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        q qVar = this.f6744e;
        if (i10 == 108) {
            a0 q10 = qVar.q();
            if (q10 != null) {
                ArrayList arrayList = q10.f6687m;
                if (q10.f6686l) {
                    q10.f6686l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            p p10 = qVar.p(i10);
            if (p10.f6758m) {
                qVar.h(p10, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z4) {
        k.m.a(this.f6741a, z4);
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
            lVar.f11415x = true;
        }
        boolean onPreparePanel = this.f6741a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f11415x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.f6744e.p(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f6741a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6741a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z4) {
        this.f6741a.onWindowFocusChanged(z4);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f6744e.E) {
            return e(callback);
        }
        return this.f6741a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f6741a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.f6744e.E && i10 == 0) {
            return e(callback);
        }
        return k.k.b(this.f6741a, callback, i10);
    }
}
