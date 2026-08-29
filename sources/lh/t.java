package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class t extends FrameLayout {
    public static final HashSet f16247b = new HashSet();
    public static boolean f16248c = false;
    public final boolean f16249a;

    public t(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16249a = z10;
    }

    public final void a(boolean z10) {
        f16248c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f16247b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f16248c) {
            f16247b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f16248c) {
            f16247b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
