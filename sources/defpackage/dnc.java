package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class dnc extends FrameLayout {
    public final kjc a;
    public cnc b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public dnc(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = kjcVar;
        setWillNotDraw(true);
        cnc cncVar = new cnc(activity, kjcVar);
        this.b = cncVar;
        addView(cncVar, tre.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, tre.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, tre.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new b29(2131623946, i, i, true, null);
        this.b.b = new b29(2131623946, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        cnc cncVar = new cnc(getContext(), this.a);
        if (i == 2131623963) {
            b29 b29Var = new b29(i, i2, i2, true, null);
            cncVar.c = b29Var;
            b29Var.M(cncVar);
        } else {
            cncVar.a = new b29(i, i2, i2, true, null);
            b29 b29Var2 = new b29(i, i2, i2, true, null);
            cncVar.b = b29Var2;
            b29Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        cncVar.a(i3, z, false);
        cncVar.setAlpha(0.0f);
        cncVar.setOnBtnClickedListener(this.b.y);
        addView(cncVar, tre.a(53.5f, 53.5f, 1));
        cnc cncVar2 = this.b;
        this.b = cncVar;
        cncVar.animate().alpha(1.0f).setDuration(250L).start();
        cncVar2.animate().alpha(0.0f).setDuration(250L).setListener(new wd8((Object) this, (Object) cncVar2, (byte) 24)).start();
    }

    public final void c(int i) {
        this.b.a = new b29(2131624200, i, i, true, null);
        this.b.b = new b29(2131624200, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnc.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(bnc bncVar) {
        this.b.setOnBtnClickedListener(bncVar);
    }
}
