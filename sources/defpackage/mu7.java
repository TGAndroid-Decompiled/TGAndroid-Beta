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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class mu7 extends Dialog implements sk5 {
    public final ActionBarLayout a;
    public final FrameLayout b;
    public final fz7 c;

    public mu7(Context context) {
        super(context, 2131755352);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        tk5 tk5Var = new tk5(new qu0(this, (byte) 7));
        tk5Var.c = true;
        actionBarLayout.R(tk5Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (hl.O1() && !hl.E && !hl.N1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new am7(this, (byte) 2));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            ko9.e(actionBarLayout.getView());
        }
        fz7 fz7Var = new fz7(context);
        this.c = fz7Var;
        frameLayout.addView(fz7Var, tre.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(e eVar) {
        boolean z;
        if (hl.O1() && !hl.E && !hl.N1()) {
            z = true;
        } else {
            z = false;
        }
        this.a.T(eVar, z);
    }

    @Override
    public final void e(int[] iArr) {
        if (hl.O1() && !hl.E && !hl.N1()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
        }
    }

    @Override
    public final boolean h(e eVar, ActionBarLayout actionBarLayout) {
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
    public final boolean l(ActionBarLayout actionBarLayout, tk5 tk5Var) {
        e eVar = tk5Var.a;
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
        frameLayout.setOnApplyWindowInsetsListener(new us((byte) 2));
        if (i >= 26) {
            if (vm2.h(aob.w0(null, aob.d6, true)) < 0.9d) {
                z = false;
            }
            hl.i3(this, z);
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
