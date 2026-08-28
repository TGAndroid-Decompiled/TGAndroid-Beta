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
    public final Window.Callback f6988a;
    public boolean f6989b;
    public boolean f6990c;
    public boolean d;
    public final q f6991e;

    public m(q qVar, Window.Callback callback) {
        this.f6991e = qVar;
        if (callback != null) {
            this.f6988a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6989b = true;
            callback.onContentChanged();
        } finally {
            this.f6989b = false;
        }
    }

    public final boolean b(int i9, Menu menu) {
        return this.f6988a.onMenuOpened(i9, menu);
    }

    public final void c(int i9, Menu menu) {
        this.f6988a.onPanelClosed(i9, menu);
    }

    public final void d(List list, Menu menu, int i9) {
        k.k.a(this.f6988a, list, menu, i9);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6988a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f6990c;
        Window.Callback callback = this.f6988a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f6991e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f6988a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6988a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6988a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.m.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6988a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6988a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f6988a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f6989b) {
            this.f6988a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f6988a.onCreatePanelMenu(i9, menu);
    }

    @Override
    public final View onCreatePanelView(int i9) {
        return this.f6988a.onCreatePanelView(i9);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f6988a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        return this.f6988a.onMenuItemSelected(i9, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i9, Menu menu) {
        a0 q10;
        b(i9, menu);
        if (i9 == 108 && (q10 = this.f6991e.q()) != null) {
            ArrayList arrayList = q10.f6934m;
            if (true != q10.f6933l) {
                q10.f6933l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i9, Menu menu) {
        if (this.d) {
            this.f6988a.onPanelClosed(i9, menu);
            return;
        }
        c(i9, menu);
        q qVar = this.f6991e;
        if (i9 == 108) {
            a0 q10 = qVar.q();
            if (q10 != null) {
                ArrayList arrayList = q10.f6934m;
                if (q10.f6933l) {
                    q10.f6933l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i9 == 0) {
            p p6 = qVar.p(i9);
            if (p6.f7005m) {
                qVar.h(p6, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f6988a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i9, View view, Menu menu) {
        l.k kVar;
        if (menu instanceof l.k) {
            kVar = (l.k) menu;
        } else {
            kVar = null;
        }
        if (i9 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f16574x = true;
        }
        boolean onPreparePanel = this.f6988a.onPreparePanel(i9, view, menu);
        if (kVar != null) {
            kVar.f16574x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i9) {
        l.k kVar = this.f6991e.p(0).h;
        if (kVar != null) {
            d(list, kVar, i9);
        } else {
            d(list, menu, i9);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f6988a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6988a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f6988a.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f6991e.D) {
            return e(callback);
        }
        return this.f6988a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f6988a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i9) {
        if (this.f6991e.D && i9 == 0) {
            return e(callback);
        }
        return k.j.b(this.f6988a, callback, i9);
    }
}
