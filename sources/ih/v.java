package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class v extends FrameLayout {
    public static final HashSet f12217b = new HashSet();
    public static boolean f12218c = false;
    public final boolean f12219a;

    public v(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12219a = z10;
    }

    public final void a(boolean z10) {
        f12218c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f12217b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f12218c) {
            f12217b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (f12218c) {
            f12217b.add(this);
        } else {
            super.invalidate(i9, i10, i11, i12);
        }
    }
}
