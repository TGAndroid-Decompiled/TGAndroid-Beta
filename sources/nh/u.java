package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class u extends FrameLayout {
    public static final HashSet f15924b = new HashSet();
    public static boolean f15925c = false;
    public final boolean f15926a;

    public u(Context context) {
        super(context);
        boolean z4;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15926a = z4;
    }

    public final void a(boolean z4) {
        f15925c = false;
        if (z4) {
            setLayerType(0, null);
        }
        HashSet hashSet = f15924b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f15925c) {
            f15924b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f15925c) {
            f15924b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
