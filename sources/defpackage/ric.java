package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ric extends FrameLayout {
    public final lfc a;
    public qic b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public ric(Activity activity, lfc lfcVar) {
        super(activity);
        this.a = lfcVar;
        setWillNotDraw(true);
        qic qicVar = new qic(activity, lfcVar);
        this.b = qicVar;
        addView(qicVar, nme.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, nme.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, nme.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new oy8(2131623946, i, i, true, null);
        this.b.b = new oy8(2131623946, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        qic qicVar = new qic(getContext(), this.a);
        if (i == 2131623963) {
            oy8 oy8Var = new oy8(i, i2, i2, true, null);
            qicVar.c = oy8Var;
            oy8Var.M(qicVar);
        } else {
            qicVar.a = new oy8(i, i2, i2, true, null);
            oy8 oy8Var2 = new oy8(i, i2, i2, true, null);
            qicVar.b = oy8Var2;
            oy8Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        qicVar.a(i3, z, false);
        qicVar.setAlpha(0.0f);
        qicVar.setOnBtnClickedListener(this.b.y);
        addView(qicVar, nme.a(53.5f, 53.5f, 1));
        qic qicVar2 = this.b;
        this.b = qicVar;
        qicVar.animate().alpha(1.0f).setDuration(250L).start();
        qicVar2.animate().alpha(0.0f).setDuration(250L).setListener(new eh8((Object) this, (Object) qicVar2, (byte) 23)).start();
    }

    public final void c(int i) {
        this.b.a = new oy8(2131624201, i, i, true, null);
        this.b.b = new oy8(2131624201, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ric.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(pic picVar) {
        this.b.setOnBtnClickedListener(picVar);
    }
}
