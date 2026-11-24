package defpackage;

import android.os.Build;
public class bo extends co {
    public final byte d;

    public bo(String str, String str2, byte b) {
        super(str, str2);
        this.d = b;
    }

    @Override
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
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
