package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class era extends FrameLayout implements s84, snb {
    public final vnb a;
    public final FrameLayout b;
    public final px4 c;
    public final de0 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final fm0 r;
    public boolean s;
    public cra w;

    public era(Context context, vnb vnbVar) {
        super(context);
        this.r = new fm0(0, this, k43.h, 320L, false);
        this.a = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        px4 px4Var = new px4(frameLayout, vnbVar, true);
        this.c = px4Var;
        frameLayout.setBackground(px4Var);
        px4Var.w = true;
        addView(frameLayout, tre.e(-1, -1, 119));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.getImageReceiver().M(0);
        addView(de0Var, tre.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, tre.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(hl.L(5.0f), hl.L(1.0f), hl.L(5.0f), hl.L(1.0f));
        textView2.setBackground(aob.b0(hl.L(10.0f), 285212671));
        addView(textView2, tre.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public final void a() {
        int f;
        px4 px4Var = this.c;
        px4Var.z = null;
        Integer num = this.h;
        fm0 fm0Var = this.r;
        TextView textView = this.f;
        if (num != null) {
            f = aob.v(aob.w0(null, aob.d6, false), aob.p1(hl.R1(0.15f, 1.0f, fm0Var.e), this.h.intValue()));
            px4Var.z = this.h;
            this.b.invalidate();
            textView.setTextColor(vm2.f(fm0Var.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i = aob.d6;
            int w0 = aob.w0(null, i, false);
            int i2 = aob.G6;
            int f2 = vm2.f(fm0Var.e, vm2.f(0.05f, w0, aob.w0(null, i2, false)), aob.w0(null, aob.Fi, false));
            textView.setTextColor(vm2.f(fm0Var.e, vm2.f(0.5f, aob.w0(null, i, false), aob.w0(null, i2, false)), -1));
            f = f2;
        } else {
            f = vm2.f(0.5f, vm2.o(this.w.a.center_color, 255), vm2.o(this.w.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f);
            textView.invalidate();
        } else if (aob.F1(textView.getBackground(), f, false)) {
            textView.invalidate();
        }
    }

    public final void b(int i, Object obj, TLRPC.Document document, boolean z) {
        String str;
        de0 de0Var = this.d;
        if (document == null) {
            de0Var.b();
            this.n = null;
        } else if (this.n == document) {
        } else {
            this.n = document;
            TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(100.0f), false, null, false);
            ggb f = lp3.f(document, aob.a7, 0.3f, null);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("_");
            sb.append(i);
            if (z) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb.append(str);
            String sb2 = sb.toString();
            int i2 = (80 - i) / 2;
            de0Var.setLayoutParams(tre.d(i, i, 49, 0.0f, i2 + 17, 0.0f, i2));
            de0Var.j(jn5.b(document), sb2, jn5.c(w, document), sb2, f, obj);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        a();
    }

    @Override
    public final void updateColors() {
        cra craVar;
        try {
            if (this.f != null && this.b != null && this.c != null) {
                if (this.h != null || this.s || ((craVar = this.w) != null && craVar.a != null)) {
                    a();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
