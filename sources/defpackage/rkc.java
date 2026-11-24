package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class rkc extends FrameLayout {
    public final lhc a;
    public qkc b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public rkc(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = lhcVar;
        setWillNotDraw(true);
        qkc qkcVar = new qkc(activity, lhcVar);
        this.b = qkcVar;
        addView(qkcVar, qoe.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, qoe.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, qoe.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new p09(2131623946, i, i, true, null);
        this.b.b = new p09(2131623946, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        qkc qkcVar = new qkc(getContext(), this.a);
        if (i == 2131623963) {
            p09 p09Var = new p09(i, i2, i2, true, null);
            qkcVar.c = p09Var;
            p09Var.M(qkcVar);
        } else {
            qkcVar.a = new p09(i, i2, i2, true, null);
            p09 p09Var2 = new p09(i, i2, i2, true, null);
            qkcVar.b = p09Var2;
            p09Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        qkcVar.a(i3, z, false);
        qkcVar.setAlpha(0.0f);
        qkcVar.setOnBtnClickedListener(this.b.y);
        addView(qkcVar, qoe.a(53.5f, 53.5f, 1));
        qkc qkcVar2 = this.b;
        this.b = qkcVar;
        qkcVar.animate().alpha(1.0f).setDuration(250L).start();
        qkcVar2.animate().alpha(0.0f).setDuration(250L).setListener(new ic8((Object) this, (Object) qkcVar2, (byte) 24)).start();
    }

    public final void c(int i) {
        this.b.a = new p09(2131624200, i, i, true, null);
        this.b.b = new p09(2131624200, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkc.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(pkc pkcVar) {
        this.b.setOnBtnClickedListener(pkcVar);
    }
}
