package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class izb extends View {
    public final HashMap a;
    public final jzb b;

    public izb(jzb jzbVar, Activity activity) {
        super(activity);
        this.b = jzbVar;
        this.a = new HashMap();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        int L;
        boolean z;
        int i5;
        tzb tzbVar = this.b.d;
        int size = View.MeasureSpec.getSize(i);
        int L2 = hl.L(64.0f);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < tzbVar.b.size(); i8++) {
            if (tzbVar.b.get(i8) != null && ((kzb) tzbVar.b.get(i8)).c != null) {
                String str = ((kzb) tzbVar.b.get(i8)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i9 = 50;
                    if (!ob6.a0) {
                        if (tzbVar.isInPreviewMode()) {
                            i5 = 11;
                        } else {
                            i5 = 50;
                        }
                        f = i5 + 4;
                    } else {
                        f = 18.0f;
                    }
                    int L3 = size - hl.L(f);
                    if (!ob6.a0) {
                        L = hl.L(22.0f);
                    } else {
                        if (tzbVar.isInPreviewMode()) {
                            i9 = 11;
                        }
                        L = hl.L(i9 + 13);
                    }
                    if (aob.A0[0].measureText(str) <= (L3 - L) - ((int) Math.ceil(aob.H0.measureText("00:00")))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                    hashMap.put(str, bool);
                }
                if (!bool.booleanValue()) {
                    i4 = 20;
                } else {
                    i4 = 0;
                }
                int L4 = hl.L(i4 + 64);
                if (((kzb) tzbVar.b.get(i8)).c.id == 1) {
                    L2 = L4;
                }
                if (((kzb) tzbVar.b.get(i8)).c.hidden) {
                    i6++;
                }
                i7 += L4;
            }
        }
        if (i6 > 0) {
            i3 = (((tzbVar.O.getMeasuredHeight() - tzbVar.O.getPaddingTop()) - tzbVar.O.getPaddingBottom()) - i7) + L2;
        } else {
            i3 = 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i3), 1073741824));
    }
}
