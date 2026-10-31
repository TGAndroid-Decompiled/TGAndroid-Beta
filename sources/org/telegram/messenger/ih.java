package org.telegram.messenger;

import java.util.ArrayList;
public final class ih implements Runnable {
    public final int f16131a;
    public final ri f16132b;
    public final ArrayList f16133c;
    public final String d;

    public ih(ri riVar, ArrayList arrayList, String str, int i10) {
        this.f16131a = i10;
        this.f16132b = riVar;
        this.f16133c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16131a) {
            case 0:
                i0.g3(new ih(this.f16132b, this.f16133c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f16133c;
                this.f16132b.c(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f16133c;
                this.f16132b.c(this.d, arrayList2);
                return;
        }
    }
}
