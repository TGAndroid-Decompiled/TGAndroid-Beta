package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
public final class cl4 extends ActionMode {
    public final Context a;
    public final ActionMode.Callback2 b;
    public final Menu c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public final View m;
    public final Point n;
    public final int o;
    public final al4 p = new al4(this, (byte) 0);
    public final al4 q = new al4(this, (byte) 1);
    public final hm4 r;
    public final bl4 s;

    public cl4(Context context, ActionMode.Callback2 callback2, View view, hm4 hm4Var) {
        this.a = context;
        this.b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                cl4 cl4Var = cl4.this;
                return cl4Var.b.onActionItemClicked(cl4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        int[] iArr = new int[2];
        this.g = iArr;
        this.h = new int[2];
        this.i = new int[2];
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = view;
        view.getLocationOnScreen(iArr);
        this.o = gm.L(20.0f);
        this.n = new Point();
        hm4Var.e = menu;
        hm4Var.g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                cl4 cl4Var = cl4.this;
                return cl4Var.b.onActionItemClicked(cl4Var, menuItem);
            }
        };
        this.r = hm4Var;
        bl4 bl4Var = new bl4(hm4Var);
        this.s = bl4Var;
        bl4Var.b = false;
        bl4Var.c = false;
        bl4Var.d = false;
        bl4Var.e = true;
        bl4Var.f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.n;
        defaultDisplay.getRealSize(point);
        int i = point.x;
        int i2 = point.y;
        Rect rect3 = this.l;
        rect3.set(0, 0, i, i2);
        boolean a = a(rect2, rect3);
        bl4 bl4Var = this.s;
        Rect rect4 = this.f;
        if (a) {
            Rect rect5 = this.j;
            if (a(rect2, rect5)) {
                bl4Var.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.o));
                if (!rect2.equals(rect4)) {
                    al4 al4Var = this.p;
                    view.removeCallbacks(al4Var);
                    bl4Var.getClass();
                    if (System.currentTimeMillis() - bl4Var.g > 500) {
                        bl4Var.c = true;
                    }
                    view.postDelayed(al4Var, 50L);
                    hm4 hm4Var = this.r;
                    hm4Var.c.set(rect2);
                    if (hm4Var.b.e()) {
                        hm4Var.c();
                    }
                }
                bl4Var.a();
                rect4.set(rect2);
            }
        }
        bl4Var.d = true;
        rect2.setEmpty();
        bl4Var.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.m;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        hm4 hm4Var = this.r;
        hm4Var.a.removeOnLayoutChangeListener(hm4Var.l);
        fm4 fm4Var = hm4Var.b;
        if (!fm4Var.F) {
            fm4Var.G = false;
            fm4Var.F = true;
            fm4Var.x.cancel();
            fm4Var.w.start();
            fm4Var.D.setEmpty();
        }
        bl4 bl4Var = this.s;
        bl4Var.f = false;
        hm4 hm4Var2 = bl4Var.a;
        hm4Var2.a.removeOnLayoutChangeListener(hm4Var2.l);
        fm4 fm4Var2 = hm4Var2.b;
        if (!fm4Var2.F) {
            fm4Var2.G = false;
            fm4Var2.F = true;
            fm4Var2.x.cancel();
            fm4Var2.w.start();
            fm4Var2.D.setEmpty();
        }
        al4 al4Var = this.p;
        View view = this.m;
        view.removeCallbacks(al4Var);
        view.removeCallbacks(this.q);
        this.b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j) {
        if (j == -1) {
            j = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j);
        View view = this.m;
        al4 al4Var = this.q;
        view.removeCallbacks(al4Var);
        if (min <= 0) {
            al4Var.run();
            return;
        }
        bl4 bl4Var = this.s;
        bl4Var.b = true;
        bl4Var.a();
        view.postDelayed(al4Var, min);
    }

    @Override
    public final void invalidate() {
        this.b.onPrepareActionMode(this, this.c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.b;
        View view = this.m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        bl4 bl4Var = this.s;
        bl4Var.e = z;
        bl4Var.a();
    }

    @Override
    public final void setSubtitle(int i) {
    }

    @Override
    public final void setTitle(int i) {
    }

    @Override
    public final void setCustomView(View view) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }
}
