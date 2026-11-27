package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class nn4 extends FrameLayout {
    public final in a;
    public final in b;

    public nn4(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        in inVar = new in(context, true, true, false);
        this.a = inVar;
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        int i4 = aob.L6;
        yob.U(inVar, i4, null);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        inVar.setGravity(i);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(inVar, tre.d(-1, 20.0f, i2 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        in inVar2 = new in(context, true, true, true);
        this.b = inVar2;
        inVar2.b(0.45f, 250L, k43.h);
        inVar2.setTextSize(hl.L(15.0f));
        yob.U(inVar2, i4, null);
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        inVar2.setGravity(i3);
        addView(inVar2, tre.d(-2, 20.0f, (ob6.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = ihc.a;
        new wgc(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        in inVar = this.b;
        inVar.c(str, !ob6.a0, true);
        inVar.setOnClickListener(new el3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        in inVar = this.a;
        if (z) {
            inVar.a();
            if (!ob6.a0) {
                z2 = true;
                inVar.c(str, z2, true);
            }
        }
        z2 = false;
        inVar.c(str, z2, true);
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
