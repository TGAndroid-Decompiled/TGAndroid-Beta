package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
public abstract class pi5 extends FrameLayout {
    public static final HashSet b = new HashSet();
    public static boolean c = false;
    public final boolean a;

    public pi5(Context context) {
        super(context);
        boolean z;
        if (gda.o() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public final void a(boolean z) {
        c = false;
        if (z) {
            setLayerType(0, null);
        }
        HashSet hashSet = b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (c) {
            b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (c) {
            b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
