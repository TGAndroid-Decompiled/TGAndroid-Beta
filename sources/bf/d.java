package bf;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

public abstract class d {

    public static final int[] f2083a = new int[2];

    public static int a(Context context) {
        if (AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidUtilities.checkPipPermissions(context) ? 1 : -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (z10 || !AndroidUtilities.checkInlinePermissions(context)) {
            i10 = 2;
        } else {
            i10 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
        }
        layoutParams.type = i10;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
