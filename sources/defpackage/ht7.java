package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ht7 extends Dialog implements pk5 {
    public final ActionBarLayout a;
    public final FrameLayout b;
    public final by7 c;

    public ht7(Context context) {
        super(context, 2131755352);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        qk5 qk5Var = new qk5(new qv0(this, (byte) 7));
        qk5Var.c = true;
        actionBarLayout.R(qk5Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (gm.O1() && !gm.E && !gm.N1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new m67(this, (byte) 3));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            wm9.c(actionBarLayout.getView());
        }
        by7 by7Var = new by7(context);
        this.c = by7Var;
        frameLayout.addView(by7Var, qoe.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(d dVar) {
        boolean z;
        if (gm.O1() && !gm.E && !gm.N1()) {
            z = true;
        } else {
            z = false;
        }
        this.a.T(dVar, z);
    }

    @Override
    public final void e(int[] iArr) {
        if (gm.O1() && !gm.E && !gm.N1()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
        }
    }

    @Override
    public final boolean h(d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
        return true;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, qk5 qk5Var) {
        d dVar = qk5Var.a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.c.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        ActionBarLayout actionBarLayout = this.a;
        actionBarLayout.G();
        if (actionBarLayout.getFragmentStack().size() <= 1) {
            dismiss();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z = true;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        FrameLayout frameLayout = this.b;
        frameLayout.setSystemUiVisibility(1280);
        frameLayout.setOnApplyWindowInsetsListener(new wt((byte) 2));
        if (i >= 26) {
            if (on2.h(cmb.w0(null, cmb.c6, true)) < 0.9d) {
                z = false;
            }
            gm.i3(this, z);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.c);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.remove(this.c);
        }
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}
