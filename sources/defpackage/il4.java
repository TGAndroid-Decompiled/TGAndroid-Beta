package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class il4 extends FrameLayout {
    public final hn a;
    public final hn b;

    public il4(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        hn hnVar = new hn(context, true, true, false);
        this.a = hnVar;
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        int i4 = bkb.K6;
        zkb.U(hnVar, i4, null);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        hnVar.setGravity(i);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(hnVar, nme.d(-1, 20.0f, i2 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        hn hnVar2 = new hn(context, true, true, true);
        this.b = hnVar2;
        hnVar2.b(0.45f, 250L, s33.h);
        hnVar2.setTextSize(gl.L(15.0f));
        zkb.U(hnVar2, i4, null);
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        hnVar2.setGravity(i3);
        addView(hnVar2, nme.d(-2, 20.0f, (k96.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = jdc.a;
        new xcc(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        hn hnVar = this.b;
        hnVar.c(str, !k96.a0, true);
        hnVar.setOnClickListener(new nk3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        hn hnVar = this.a;
        if (z) {
            hnVar.a();
            if (!k96.a0) {
                z2 = true;
                hnVar.c(str, z2, true);
            }
        }
        z2 = false;
        hnVar.c(str, z2, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
