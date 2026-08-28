package af;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public abstract class d {
    public static final int[] f155a = new int[2];

    public static int a(Context context) {
        if (AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (AndroidUtilities.checkPipPermissions(context)) {
                return 1;
            }
            return -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        int i9;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!z10 && AndroidUtilities.checkInlinePermissions(context)) {
            if (Build.VERSION.SDK_INT >= 26) {
                i9 = 2038;
            } else {
                i9 = 2003;
            }
        } else {
            i9 = 2;
        }
        layoutParams.type = i9;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
