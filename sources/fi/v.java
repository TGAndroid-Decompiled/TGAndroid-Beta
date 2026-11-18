package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.bz;
public abstract class v extends FrameLayout {
    public static final HashSet f12625b = new HashSet();
    public static boolean f12626c = false;
    public final boolean f12627a;

    public v(Context context) {
        super(context);
        boolean z10;
        if (bz.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12627a = z10;
    }

    public final void a(boolean z10) {
        f12626c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f12625b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f12626c) {
            f12625b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (f12626c) {
            f12625b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
