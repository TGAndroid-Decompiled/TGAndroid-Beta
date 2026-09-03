package oh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class t extends FrameLayout {
    public static final HashSet f17754b = new HashSet();
    public static boolean f17755c = false;
    public final boolean f17756a;

    public t(Context context) {
        super(context);
        boolean z4;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f17756a = z4;
    }

    public final void a(boolean z4) {
        f17755c = false;
        if (z4) {
            setLayerType(0, null);
        }
        HashSet hashSet = f17754b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f17755c) {
            f17754b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f17755c) {
            f17754b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
