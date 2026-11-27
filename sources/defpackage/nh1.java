package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class nh1 extends FrameLayout implements snb {
    public final vnb a;
    public final qob b;
    public final x46 c;
    public final int d;
    public int e;

    public nh1(int i, vnb vnbVar, Activity activity) {
        super(activity);
        this.d = i;
        this.a = vnbVar;
        qob qobVar = new qob(activity, vnbVar, (byte) 1);
        this.b = qobVar;
        qobVar.setPadding(hl.L(6.0f), hl.L(5.0f), hl.L(6.0f), 0);
        qobVar.setClipToPadding(false);
        qobVar.setAdapter(new lh1(this, activity, vnbVar, i));
        x46 x46Var = new x46();
        this.c = x46Var;
        x46Var.i1(0);
        qobVar.setLayoutManager(x46Var);
        addView(qobVar, tre.c(-1.0f, -1));
    }

    public final void a(int i, boolean z) {
        lc7 lc7Var = uc7.s1(this.d).E3;
        int i2 = 0;
        if (lc7Var != null) {
            ArrayList arrayList = lc7Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (((kc7) arrayList.get(i3)).c == i) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 != this.e) {
            this.e = i2;
            if (!z) {
                this.c.g1(i2, (hl.q.x - hl.L(56.0f)) / 2);
            }
            hl.d0(this.b, new sa((byte) 1, this, z));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        hl.d0(this.b, new y0(this, uc7.s1(this.d).E3, (byte) 15));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
