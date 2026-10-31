package org.telegram.messenger;

import android.view.MotionEvent;
public final class ja {
    public final int f16230a;
    public final fg.i f16231b;

    public ja(fg.i iVar, int i10) {
        this.f16230a = i10;
        this.f16231b = iVar;
    }

    public final Boolean a(Object obj) {
        switch (this.f16230a) {
            case 0:
                return fg.i.a(this.f16231b, (MotionEvent) obj);
            default:
                return fg.i.b(this.f16231b, (MotionEvent) obj);
        }
    }
}
