package hi;

import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
public final class t {
    public final int f15418a;
    public final Drawable f15419b;
    public final org.telegram.ui.Components.lc f15420c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f15421e;
    public final RectF f15422f;
    public String f15423g;
    public wy0 h;
    public wy0 f15424i;
    public float f15425j;
    public boolean f15426k;
    public final u f15427l;

    public t(u uVar, int i7) {
        int i10;
        this.f15427l = uVar;
        this.f15420c = new org.telegram.ui.Components.lc(uVar);
        kr krVar = kr.h;
        this.d = new org.telegram.ui.Components.c6(uVar, 0L, 260L, krVar);
        this.f15421e = new org.telegram.ui.Components.c6(uVar, 0L, 260L, krVar);
        this.f15422f = new RectF();
        this.f15418a = i7;
        Resources resources = uVar.getContext().getResources();
        if (i7 < 0) {
            i10 = 2131230933;
        } else {
            i10 = 2131230932;
        }
        this.f15419b = resources.getDrawable(i10).mutate();
    }

    public final float a() {
        float L = org.telegram.messenger.g0.L(30.0f);
        int i7 = this.f15418a;
        u uVar = this.f15427l;
        if (i7 < 0) {
            float f10 = L / 2.0f;
            return Math.max(org.telegram.messenger.g0.L(8.0f) + f10, (uVar.h - org.telegram.messenger.g0.L(8.0f)) - f10);
        }
        return (L / 2.0f) + uVar.f15475n + org.telegram.messenger.g0.L(8.0f);
    }

    public final void b(String str) {
        wy0 wy0Var;
        if (TextUtils.equals(str, this.f15423g)) {
            return;
        }
        this.f15423g = str;
        u uVar = this.f15427l;
        if (str == null) {
            wy0Var = null;
        } else {
            wy0 wy0Var2 = new wy0(str, 14.0f, org.telegram.messenger.g0.o());
            wy0Var2.f41774p = i5.c.d(110.0f, uVar.getWidth(), org.telegram.messenger.g0.L(40.0f));
            wy0Var = wy0Var2;
        }
        this.h = wy0Var;
        uVar.invalidate();
    }
}
