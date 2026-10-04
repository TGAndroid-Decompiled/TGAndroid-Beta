package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class i0 extends FrameLayout {
    public static final HashSet f1057b = new HashSet();
    public static boolean f1058c = false;
    public final boolean f1059a;

    public i0(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1059a = z10;
    }

    public final void a(boolean z10) {
        f1058c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f1057b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f1058c) {
            f1057b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f1058c) {
            f1057b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
