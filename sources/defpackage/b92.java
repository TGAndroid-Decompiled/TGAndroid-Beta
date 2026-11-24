package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class b92 extends LinearLayout {
    public final ylb a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    public b92(android.app.Activity r24, android.view.View r25, int r26, defpackage.ylb r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b92.<init>(android.app.Activity, android.view.View, int, ylb):void");
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i3)).setTextColor(i);
            i3++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i2)).setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Yc, this.a), PorterDuff.Mode.MULTIPLY));
                i2++;
            } else {
                return;
            }
        }
    }
}
