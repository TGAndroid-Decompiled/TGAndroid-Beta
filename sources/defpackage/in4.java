package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class in4 extends FrameLayout {
    public final io a;
    public final io b;

    public in4(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        io ioVar = new io(context, true, true, false);
        this.a = ioVar;
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTypeface(gm.o());
        int i4 = cmb.K6;
        anb.U(ioVar, i4, null);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        ioVar.setGravity(i);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(ioVar, qoe.d(-1, 20.0f, i2 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        io ioVar2 = new io(context, true, true, true);
        this.b = ioVar2;
        ioVar2.b(0.45f, 250L, d53.h);
        ioVar2.setTextSize(gm.L(15.0f));
        anb.U(ioVar2, i4, null);
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        ioVar2.setGravity(i3);
        addView(ioVar2, qoe.d(-2, 20.0f, (jb6.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = kfc.a;
        new yec(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        io ioVar = this.b;
        ioVar.c(str, !jb6.a0, true);
        ioVar.setOnClickListener(new xl3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        io ioVar = this.a;
        if (z) {
            ioVar.a();
            if (!jb6.a0) {
                z2 = true;
                ioVar.c(str, z2, true);
            }
        }
        z2 = false;
        ioVar.c(str, z2, true);
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
