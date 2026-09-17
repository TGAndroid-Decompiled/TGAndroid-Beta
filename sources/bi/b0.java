package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class b0 extends FrameLayout {
    public static final HashSet f2785b = new HashSet();
    public static boolean f2786c = false;
    public final boolean f2787a;

    public b0(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2787a = z10;
    }

    public final void a(boolean z10) {
        f2786c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f2785b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f2786c) {
            f2785b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f2786c) {
            f2785b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
