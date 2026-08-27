package g;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import h7.o7;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

public final class n implements Window.Callback {

    public final Window.Callback f6269a;

    public boolean f6270b;

    public boolean f6271c;
    public boolean d;

    public final r f6272e;

    public n(r rVar, Window.Callback callback) {
        this.f6272e = rVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6269a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6270b = true;
            callback.onContentChanged();
        } finally {
            this.f6270b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f6269a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f6269a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.l.a(this.f6269a, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6269a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f6271c;
        Window.Callback callback = this.f6269a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f6272e.i(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        q qVar;
        boolean z10;
        l.l lVar;
        boolean zPerformShortcut;
        if (!this.f6269a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            r rVar = this.f6272e;
            b0 b0VarQ = rVar.q();
            if (b0VarQ == null) {
                qVar = rVar.R;
                if (qVar == null && rVar.v(qVar, keyEvent.getKeyCode(), keyEvent)) {
                    q qVar2 = rVar.R;
                    if (qVar2 != null) {
                        qVar2.f6285l = true;
                    }
                } else {
                    if (rVar.R == null) {
                        q qVarP = rVar.p(0);
                        rVar.w(qVarP, keyEvent);
                        boolean zV = rVar.v(qVarP, keyEvent.getKeyCode(), keyEvent);
                        qVarP.f6284k = false;
                        if (zV) {
                        }
                    }
                }
            } else {
                a0 a0Var = b0VarQ.f6211i;
                if (a0Var == null || (lVar = a0Var.d) == null) {
                    zPerformShortcut = false;
                } else {
                    lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = lVar.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    qVar = rVar.R;
                    if (qVar == null) {
                        if (rVar.R == null) {
                            q qVarP2 = rVar.p(0);
                            rVar.w(qVarP2, keyEvent);
                            boolean zV2 = rVar.v(qVarP2, keyEvent.getKeyCode(), keyEvent);
                            qVarP2.f6284k = false;
                            z10 = zV2;
                        }
                    } else {
                        if (rVar.R == null) {
                            q qVarP3 = rVar.p(0);
                            rVar.w(qVarP3, keyEvent);
                            boolean zV3 = rVar.v(qVarP3, keyEvent.getKeyCode(), keyEvent);
                            qVarP3.f6284k = false;
                            if (zV3) {
                            }
                        }
                    }
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6269a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6269a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6269a.dispatchTrackballEvent(motionEvent);
    }

    public final k.e e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        r rVar = this.f6272e;
        Context context = rVar.f6296e;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(context, callback);
        k.a aVar = rVar.f6310x;
        if (aVar != null) {
            aVar.a();
        }
        xe.b bVar = new xe.b(29, rVar, tVar);
        b0 b0VarQ = rVar.q();
        int i10 = 1;
        if (b0VarQ != null) {
            a0 a0Var = b0VarQ.f6211i;
            if (a0Var != null) {
                a0Var.a();
            }
            b0VarQ.f6207c.setHideOnContentScrollEnabled(false);
            b0VarQ.f6209f.e();
            a0 a0Var2 = new a0(b0VarQ, b0VarQ.f6209f.getContext(), bVar);
            l.l lVar = a0Var2.d;
            lVar.w();
            try {
                boolean zG = ((com.google.firebase.messaging.t) a0Var2.f6199e.f49392b).G(a0Var2, lVar);
                lVar.v();
                if (zG) {
                    b0VarQ.f6211i = a0Var2;
                    a0Var2.g();
                    b0VarQ.f6209f.c(a0Var2);
                    b0VarQ.a(true);
                } else {
                    a0Var2 = null;
                }
                rVar.f6310x = a0Var2;
            } catch (Throwable th) {
                lVar.v();
                throw th;
            }
        }
        if (rVar.f6310x == null) {
            m0 m0Var = rVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            k.a aVar2 = rVar.f6310x;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (rVar.f6311y == null) {
                if (rVar.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(2130968585, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        k.c cVar = new k.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    rVar.f6311y = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130968600);
                    rVar.A = popupWindow;
                    o7.b(popupWindow, 2);
                    rVar.A.setContentView(rVar.f6311y);
                    rVar.A.setWidth(-1);
                    context.getTheme().resolveAttribute(2130968579, typedValue, true);
                    rVar.f6311y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    rVar.A.setHeight(-2);
                    rVar.B = new i(rVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) rVar.F.findViewById(2131296317);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(rVar.n()));
                        rVar.f6311y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (rVar.f6311y != null) {
                m0 m0Var2 = rVar.C;
                if (m0Var2 != null) {
                    m0Var2.b();
                }
                rVar.f6311y.e();
                Context context2 = rVar.f6311y.getContext();
                ActionBarContextView actionBarContextView = rVar.f6311y;
                k.d dVar = new k.d();
                dVar.f14211c = context2;
                dVar.d = actionBarContextView;
                dVar.f14212e = bVar;
                l.l lVar2 = new l.l(actionBarContextView.getContext());
                lVar2.f15319l = 1;
                dVar.f14214n = lVar2;
                lVar2.f15313e = dVar;
                if (tVar.G(dVar, lVar2)) {
                    dVar.g();
                    rVar.f6311y.c(dVar);
                    rVar.f6310x = dVar;
                    if (!rVar.E || (viewGroup = rVar.F) == null) {
                        rVar.f6311y.setAlpha(1.0f);
                        rVar.f6311y.setVisibility(0);
                        if (rVar.f6311y.getParent() instanceof View) {
                            View view = (View) rVar.f6311y.getParent();
                            WeakHashMap weakHashMap = j0.f46605a;
                            r0.z.c(view);
                        }
                    } else {
                        WeakHashMap weakHashMap2 = j0.f46605a;
                        if (viewGroup.isLaidOut()) {
                            rVar.f6311y.setAlpha(0.0f);
                            m0 m0VarA = j0.a(rVar.f6311y);
                            m0VarA.a(1.0f);
                            rVar.C = m0VarA;
                            m0VarA.d(new j(rVar, i10));
                        } else {
                            rVar.f6311y.setAlpha(1.0f);
                            rVar.f6311y.setVisibility(0);
                            if (rVar.f6311y.getParent() instanceof View) {
                                View view2 = (View) rVar.f6311y.getParent();
                                WeakHashMap weakHashMap3 = j0.f46605a;
                                r0.z.c(view2);
                            }
                        }
                    }
                    if (rVar.A != null) {
                        rVar.f6298f.getDecorView().post(rVar.B);
                    }
                } else {
                    rVar.f6310x = null;
                }
            }
            rVar.y();
            rVar.f6310x = rVar.f6310x;
        }
        rVar.y();
        k.a aVar3 = rVar.f6310x;
        if (aVar3 != null) {
            return tVar.r(aVar3);
        }
        return null;
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6269a.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6269a.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.f6269a.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.f6270b) {
            this.f6269a.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof l.l)) {
            return this.f6269a.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.f6269a.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f6269a.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f6269a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b0 b0VarQ;
        b(i10, menu);
        if (i10 == 108 && (b0VarQ = this.f6272e.q()) != null) {
            ArrayList arrayList = b0VarQ.f6215m;
            if (true != b0VarQ.f6214l) {
                b0VarQ.f6214l = true;
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
            this.f6269a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        r rVar = this.f6272e;
        if (i10 != 108) {
            if (i10 == 0) {
                q qVarP = rVar.p(i10);
                if (qVarP.f6286m) {
                    rVar.h(qVarP, false);
                    return;
                }
                return;
            }
            return;
        }
        b0 b0VarQ = rVar.q();
        if (b0VarQ != null) {
            ArrayList arrayList = b0VarQ.f6215m;
            if (b0VarQ.f6214l) {
                b0VarQ.f6214l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        k.m.a(this.f6269a, z10);
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.l lVar = menu instanceof l.l ? (l.l) menu : null;
        if (i10 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f15330x = true;
        }
        boolean zOnPreparePanel = this.f6269a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f15330x = false;
        }
        return zOnPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.f6272e.p(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f6269a, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6269a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.f6269a.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.f6272e.D ? e(callback) : this.f6269a.onWindowStartingActionMode(callback);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.f6269a.onSearchRequested();
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.f6272e.D && i10 == 0) {
            return e(callback);
        }
        return k.k.b(this.f6269a, callback, i10);
    }
}
