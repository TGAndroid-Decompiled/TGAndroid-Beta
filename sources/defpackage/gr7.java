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
public final class gr7 extends Dialog implements qi5 {
    public final ActionBarLayout a;
    public final FrameLayout b;
    public final yv7 c;

    public gr7(Context context) {
        super(context, 2131755352);
        ActionBarLayout actionBarLayout = new ActionBarLayout(context, false);
        this.a = actionBarLayout;
        actionBarLayout.setFragmentStack(new ArrayList());
        ri5 ri5Var = new ri5(new hu0(this, (byte) 7));
        ri5Var.c = true;
        actionBarLayout.R(ri5Var);
        actionBarLayout.setDelegate(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(actionBarLayout.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (gl.O1() && !gl.E && !gl.N1()) {
            frameLayout.setBackgroundColor(-1728053248);
            frameLayout.setOnClickListener(new fr7(this, (byte) 0));
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            vk9.c(actionBarLayout.getView());
        }
        yv7 yv7Var = new yv7(context);
        this.c = yv7Var;
        frameLayout.addView(yv7Var, nme.c(-1.0f, -1));
        setContentView(frameLayout);
    }

    public final void c(d dVar) {
        boolean z;
        if (gl.O1() && !gl.E && !gl.N1()) {
            z = true;
        } else {
            z = false;
        }
        this.a.T(dVar, z);
    }

    @Override
    public final void e(int[] iArr) {
        if (gl.O1() && !gl.E && !gl.N1()) {
            iArr[0] = View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(530.0f), View.MeasureSpec.getSize(iArr[0])), 1073741824);
            iArr[1] = View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(528.0f), View.MeasureSpec.getSize(iArr[1])), 1073741824);
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
    public final boolean l(ActionBarLayout actionBarLayout, ri5 ri5Var) {
        d dVar = ri5Var.a;
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
        frameLayout.setOnApplyWindowInsetsListener(new vs((byte) 2));
        if (i >= 26) {
            if (bm2.h(bkb.w0(null, bkb.c6, true)) < 0.9d) {
                z = false;
            }
            gl.i3(this, z);
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
