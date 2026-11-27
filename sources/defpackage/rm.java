package defpackage;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
public final class rm {
    public static final qm h = new qm("progress", (byte) 0);
    public final TextPaint c;
    public ObjectAnimator d;
    public final wb2 g;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public float e = 0.0f;
    public int f = 1;

    public rm(wb2 wb2Var, TextPaint textPaint) {
        this.c = textPaint;
        this.g = wb2Var;
    }

    public final int a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += ((StaticLayout) arrayList.get(i)).getLineWidth(0);
        }
        return (int) Math.ceil(f);
    }

    public final void b(int i, boolean z) {
        boolean z2;
        float f;
        String str;
        TextPaint textPaint;
        float f2;
        ArrayList arrayList;
        int i2 = this.f;
        ArrayList arrayList2 = this.a;
        if (i2 == i && !arrayList2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList3 = this.b;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        arrayList2.clear();
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(i);
        if (i > this.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = i;
        float f3 = 0.0f;
        this.e = 0.0f;
        int i3 = 0;
        while (i3 < valueOf2.length()) {
            int i4 = i3 + 1;
            String substring = valueOf2.substring(i3, i4);
            if (!arrayList3.isEmpty() && i3 < valueOf.length()) {
                str = valueOf.substring(i3, i4);
            } else {
                str = null;
            }
            if (str != null && str.equals(substring)) {
                arrayList2.add((StaticLayout) arrayList3.get(i3));
                arrayList3.set(i3, null);
                f2 = f3;
                arrayList = arrayList3;
            } else {
                f2 = f3;
                arrayList = arrayList3;
                arrayList2.add(new StaticLayout(substring, this.c, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            }
            f3 = f2;
            i3 = i4;
            arrayList3 = arrayList;
        }
        float f4 = f3;
        ArrayList arrayList4 = arrayList3;
        if (z && !arrayList4.isEmpty()) {
            if (z2) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, f, f4);
            this.d = ofFloat;
            ofFloat.setDuration(150L);
            this.d.addListener(new h0(this, (byte) 7));
            this.d.start();
        }
        this.g.invalidate();
    }
}
