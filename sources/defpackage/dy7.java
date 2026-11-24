package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.ui.LaunchActivity;
public final class dy7 extends Dialog {
    public final FrameLayout a;
    public final cy7 b;

    public dy7(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        gm.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        bh7 bh7Var = new bh7((byte) 25);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(frameLayout, bh7Var);
        cy7 cy7Var = new cy7(this, launchActivity);
        this.b = cy7Var;
        frameLayout.addView(cy7Var, qoe.e(-1, -1, 119));
    }

    public static void a(dy7 dy7Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.b.i() && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.b.i() && (launchActivity = LaunchActivity.H1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.b.i() && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = i;
        attributes.softInputMode = 16;
        boolean z = e21.a;
        attributes.flags = i | 8192;
        gm.f2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        gm.i3(this, false);
    }
}
