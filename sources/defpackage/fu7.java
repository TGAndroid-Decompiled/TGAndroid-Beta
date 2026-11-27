package defpackage;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class fu7 {
    public final LaunchActivity a;
    public final ArrayList b = new ArrayList();
    public int c = Integer.MIN_VALUE;

    public fu7(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        LaunchActivity launchActivity = this.a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.c == Integer.MIN_VALUE) {
                    this.c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i);
                this.c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
