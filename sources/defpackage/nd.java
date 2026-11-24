package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class nd extends hd {
    public static final int[] v1 = {16842932, 16842933};
    public int l1;
    public int m1;
    public FrameLayout n1;
    public ViewGroup o1;
    public View p1;
    public DialogInterface.OnShowListener q1;
    public DialogInterface.OnDismissListener r1;
    public boolean s1;
    public short t1;
    public final b1 u1;

    public nd(int i, wjb wjbVar, Context context) {
        super(i, wjbVar, context);
        this.s1 = false;
        this.t1 = (short) 0;
        this.u1 = new b1(this, (byte) 9);
    }

    public static Activity s(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return s(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override
    public final void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.dismiss():void");
    }

    @Override
    public final boolean isShowing() {
        if (t().indexOfChild(this.n1) != -1 && !this.s1) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(long j) {
        if (isShowing()) {
            return;
        }
        this.t1 = (int) j;
        show();
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.r1 = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.q1 = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, v1);
        this.l1 = obtainStyledAttributes.getResourceId(0, -1);
        this.m1 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.k0 = true;
        ViewGroup f = f(false);
        this.o1 = f;
        f.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new j1(this, (byte) 7));
        View view = new View(getContext());
        this.p1 = view;
        view.setBackgroundColor(bkb.p1(attributes.dimAmount, -16777216));
        frameLayout.addView(this.p1, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.o1, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.n1 = frameLayout;
        t().addView(this.n1);
        FrameLayout frameLayout3 = this.n1;
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(frameLayout3);
        bdc.i(this.n1, new jd(frameLayout2, (byte) 0));
        this.n1.setVisibility(4);
        long j = this.t1;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        b1 b1Var = this.u1;
        if (i == 0) {
            b1Var.run();
        } else {
            gl.e3(b1Var, j);
        }
    }

    public final ViewGroup t() {
        return (ViewGroup) s(getContext()).getWindow().getDecorView();
    }
}
