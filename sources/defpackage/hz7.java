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
public final class hz7 extends Dialog {
    public final FrameLayout a;
    public final gz7 b;

    public hz7(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        hl.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        ku7 ku7Var = new ku7((byte) 11);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(frameLayout, ku7Var);
        gz7 gz7Var = new gz7(this, launchActivity);
        this.b = gz7Var;
        frameLayout.addView(gz7Var, tre.e(-1, -1, 119));
    }

    public static void a(hz7 hz7Var) {
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
        boolean z = f11.a;
        attributes.flags = i | 8192;
        hl.f2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        hl.i3(this, false);
    }
}
