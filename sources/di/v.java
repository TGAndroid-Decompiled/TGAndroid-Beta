package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.iz;
public abstract class v extends FrameLayout {
    public static final HashSet f9855b = new HashSet();
    public static boolean f9856c = false;
    public final boolean f9857a;

    public v(Context context) {
        super(context);
        boolean z9;
        if (iz.o() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9857a = z9;
    }

    public final void a(boolean z9) {
        f9856c = false;
        if (z9) {
            setLayerType(0, null);
        }
        HashSet hashSet = f9855b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f9856c) {
            f9855b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (f9856c) {
            f9855b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
