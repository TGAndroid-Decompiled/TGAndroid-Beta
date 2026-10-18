package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class w extends FrameLayout {
    public static final HashSet f6027b = new HashSet();
    public static boolean f6028c = false;
    public final boolean f6029a;

    public w(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6029a = z10;
    }

    public final void a(boolean z10) {
        f6028c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f6027b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f6028c) {
            f6027b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f6028c) {
            f6027b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
