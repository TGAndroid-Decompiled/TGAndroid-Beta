package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class hm4 {
    public static final ul4 p = new Object();
    public static final List q = Arrays.asList(2131296505, 2131296493, 2131296499, 2131296511, 2131296501, 2131296514, 2131296510, 2131296500, 2131296504, 2131296495);
    public static final List r = Arrays.asList(2131296493, 2131296499, 2131296511, 2131296500, 2131296501, 2131296514, 2131296510, 2131296504);
    public final View a;
    public final fm4 b;
    public Menu e;
    public final int i;
    public Runnable j;
    public wg0 k;
    public final ylb n;
    public final km0 o;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public ArrayList f = new ArrayList();
    public MenuItem.OnMenuItemClickListener g = p;
    public boolean h = true;
    public final wl0 l = new wl0(this);
    public final x03 m = new x03((byte) 18);

    public hm4(Context context, View view, int i, ylb ylbVar, km0 km0Var) {
        this.a = view;
        this.i = i;
        this.o = km0Var;
        this.n = ylbVar;
        this.b = new fm4(this, context, view);
    }

    public static AnimatorSet a(RelativeLayout relativeLayout, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }

    public static void e(android.view.View r4, android.view.MenuItem r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm4.e(android.view.View, android.view.MenuItem, boolean):void");
    }

    public final android.widget.LinearLayout b(android.content.Context r22, android.view.MenuItem r23, boolean r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm4.b(android.content.Context, android.view.MenuItem, boolean, boolean, boolean):android.widget.LinearLayout");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm4.c():void");
    }

    public final ArrayList d(Menu menu) {
        wg0 wg0Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(d(subMenu));
                } else if ((item.getItemId() != 2131296504 || (wg0Var = this.k) == null || ((Boolean) wg0Var.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != 2131296505 || this.j == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
