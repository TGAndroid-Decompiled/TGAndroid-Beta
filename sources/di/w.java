package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;
public abstract class w extends FrameLayout {
    public static final HashSet f9281b = new HashSet();
    public static boolean f9282c = false;
    public final boolean f9283a;

    public w(Context context) {
        super(context);
        boolean z10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9283a = z10;
    }

    public final void a(boolean z10) {
        f9282c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f9281b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f9282c) {
            f9281b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f9282c) {
            f9281b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
