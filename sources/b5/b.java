package b5;

import android.os.Build;
public class b extends c {
    public final int d;

    public b(int i10, String str, String str2) {
        super(str, str2);
        this.d = i10;
    }

    @Override
    public final boolean a() {
        switch (this.d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            case 1:
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
        }
    }
}
