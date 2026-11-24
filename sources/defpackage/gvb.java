package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
public final class gvb extends View {
    public final HashMap a;
    public final hvb b;

    public gvb(hvb hvbVar, Activity activity) {
        super(activity);
        this.b = hvbVar;
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
        qvb qvbVar = this.b.d;
        int size = View.MeasureSpec.getSize(i);
        int L2 = gl.L(64.0f);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < qvbVar.b.size(); i8++) {
            if (qvbVar.b.get(i8) != null && ((ivb) qvbVar.b.get(i8)).c != null) {
                String str = ((ivb) qvbVar.b.get(i8)).c.title;
                HashMap hashMap = this.a;
                Boolean bool = (Boolean) hashMap.get(str);
                if (bool == null) {
                    int i9 = 50;
                    if (!k96.a0) {
                        if (qvbVar.isInPreviewMode()) {
                            i5 = 11;
                        } else {
                            i5 = 50;
                        }
                        f = i5 + 4;
                    } else {
                        f = 18.0f;
                    }
                    int L3 = size - gl.L(f);
                    if (!k96.a0) {
                        L = gl.L(22.0f);
                    } else {
                        if (qvbVar.isInPreviewMode()) {
                            i9 = 11;
                        }
                        L = gl.L(i9 + 13);
                    }
                    if (bkb.A0[0].measureText(str) <= (L3 - L) - ((int) Math.ceil(bkb.H0.measureText("00:00")))) {
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
                int L4 = gl.L(i4 + 64);
                if (((ivb) qvbVar.b.get(i8)).c.id == 1) {
                    L2 = L4;
                }
                if (((ivb) qvbVar.b.get(i8)).c.hidden) {
                    i6++;
                }
                i7 += L4;
            }
        }
        if (i6 > 0) {
            i3 = (((qvbVar.O.getMeasuredHeight() - qvbVar.O.getPaddingTop()) - qvbVar.O.getPaddingBottom()) - i7) + L2;
        } else {
            i3 = 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, i3), 1073741824));
    }
}
