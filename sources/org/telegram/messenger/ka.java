package org.telegram.messenger;

import android.view.MotionEvent;
public final class ka {
    public final int f16583a;
    public final fg.i f16584b;

    public ka(fg.i iVar, int i10) {
        this.f16583a = i10;
        this.f16584b = iVar;
    }

    public final Boolean a(Object obj) {
        switch (this.f16583a) {
            case 0:
                return fg.i.a(this.f16584b, (MotionEvent) obj);
            default:
                return fg.i.b(this.f16584b, (MotionEvent) obj);
        }
    }
}
