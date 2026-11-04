package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.az;
public abstract class w extends FrameLayout {
    public static final HashSet f11143b = new HashSet();
    public static boolean f11144c = false;
    public final boolean f11145a;

    public w(Context context) {
        super(context);
        boolean z10;
        if (az.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11145a = z10;
    }

    public final void a(boolean z10) {
        f11144c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f11143b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f11144c) {
            f11143b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (f11144c) {
            f11143b.add(this);
        } else {
            super.invalidate(i3, i10, i11, i12);
        }
    }
}
