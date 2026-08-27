package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;

public abstract class t extends FrameLayout {

    public static final HashSet f13982b = new HashSet();

    public static boolean f13983c = false;

    public final boolean f13984a;

    public t(Context context) {
        super(context);
        this.f13984a = SharedConfig.getDevicePerformanceClass() == 2;
    }

    public final void a(boolean z10) {
        f13983c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f13982b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f13983c) {
            f13982b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f13983c) {
            f13982b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
