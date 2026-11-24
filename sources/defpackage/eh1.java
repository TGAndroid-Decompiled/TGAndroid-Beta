package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class eh1 extends FrameLayout implements tjb {
    public final wjb a;
    public final rkb b;
    public final t26 c;
    public final int d;
    public int e;

    public eh1(int i, wjb wjbVar, Activity activity) {
        super(activity);
        this.d = i;
        this.a = wjbVar;
        rkb rkbVar = new rkb(activity, wjbVar, (byte) 1);
        this.b = rkbVar;
        rkbVar.setPadding(gl.L(6.0f), gl.L(5.0f), gl.L(6.0f), 0);
        rkbVar.setClipToPadding(false);
        rkbVar.setAdapter(new ch1(this, activity, wjbVar, i));
        t26 t26Var = new t26();
        this.c = t26Var;
        t26Var.i1(0);
        rkbVar.setLayoutManager(t26Var);
        addView(rkbVar, nme.c(-1.0f, -1));
    }

    public final void a(int i, boolean z) {
        ea7 ea7Var = na7.q1(this.d).E3;
        int i2 = 0;
        if (ea7Var != null) {
            ArrayList arrayList = ea7Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (((da7) arrayList.get(i3)).c == i) {
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
                this.c.g1(i2, (gl.q.x - gl.L(56.0f)) / 2);
            }
            gl.d0(this.b, new ra((byte) 1, this, z));
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
        gl.d0(this.b, new x0(this, na7.q1(this.d).E3, (byte) 15));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
