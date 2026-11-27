package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class kpa implements Runnable {
    public final byte a;
    public final mpa b;

    public kpa(mpa mpaVar, byte b) {
        this.a = b;
        this.b = mpaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mpa mpaVar = this.b;
        switch (b) {
            case 0:
                if (mpaVar.j.isEmpty()) {
                    mpaVar.i = true;
                    mpa.n = null;
                    lpa lpaVar = mpaVar.f;
                    if (lpaVar != null) {
                        lpaVar.a = false;
                        mpaVar.f = null;
                    }
                    mpaVar.d.removeView(mpaVar.e);
                    if (mpaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mpaVar.d.getParent()).removeView(mpaVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = mpaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                return;
        }
    }
}
