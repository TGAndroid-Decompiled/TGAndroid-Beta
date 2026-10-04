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
    public final Window.Callback f10071a;
    public boolean f10072b;
    public boolean f10073c;
    public boolean d;
    public final s f10074e;

    public n(s sVar, Window.Callback callback) {
        this.f10074e = sVar;
        if (callback != null) {
            this.f10071a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f10072b = true;
            callback.onContentChanged();
        } finally {
            this.f10072b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f10071a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f10071a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.k.a(this.f10071a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10071a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f10073c;
        Window.Callback callback = this.f10071a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f10074e.i(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
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
        return this.f10071a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10071a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10071a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(android.view.ActionMode.Callback r11) {
        throw new UnsupportedOperationException("Method not decompiled: g.n.e(android.view.ActionMode$Callback):k.e");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f10071a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f10071a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f10071a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f10072b) {
            this.f10071a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.k)) {
            return false;
        }
        return this.f10071a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f10071a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f10071a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f10071a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b0 p5;
        b(i10, menu);
        if (i10 == 108 && (p5 = this.f10074e.p()) != null) {
            ArrayList arrayList = p5.f10017m;
            if (true != p5.f10016l) {
                p5.f10016l = true;
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
            this.f10071a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        s sVar = this.f10074e;
        if (i10 == 108) {
            b0 p5 = sVar.p();
            if (p5 != null) {
                ArrayList arrayList = p5.f10017m;
                if (p5.f10016l) {
                    p5.f10016l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else if (i10 == 0) {
            r o9 = sVar.o(i10);
            if (o9.f10090m) {
                sVar.h(o9, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.f10071a, z10);
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
            kVar.f15191x = true;
        }
        boolean onPreparePanel = this.f10071a.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.f15191x = false;
        }
        return onPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.k kVar = this.f10074e.o(0).h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.j.a(this.f10071a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10071a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f10071a.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f10074e.H) {
            return e(callback);
        }
        return this.f10071a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f10071a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.f10074e.H && i10 == 0) {
            return e(callback);
        }
        return k.j.b(this.f10071a, callback, i10);
    }
}
