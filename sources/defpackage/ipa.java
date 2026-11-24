package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ipa extends FrameLayout implements g94, vlb {
    public final ylb a;
    public final FrameLayout b;
    public final lx4 c;
    public final bf0 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final fn0 r;
    public boolean s;
    public gpa w;

    public ipa(Context context, ylb ylbVar) {
        super(context);
        this.r = new fn0(0, this, d53.h, 320L, false);
        this.a = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        lx4 lx4Var = new lx4(frameLayout, ylbVar, true);
        this.c = lx4Var;
        frameLayout.setBackground(lx4Var);
        lx4Var.w = true;
        addView(frameLayout, qoe.e(-1, -1, 119));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.getImageReceiver().M(0);
        addView(bf0Var, qoe.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, qoe.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(gm.L(5.0f), gm.L(1.0f), gm.L(5.0f), gm.L(1.0f));
        textView2.setBackground(cmb.b0(gm.L(10.0f), 285212671));
        addView(textView2, qoe.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        a();
    }

    public final void a() {
        int f;
        lx4 lx4Var = this.c;
        lx4Var.z = null;
        Integer num = this.h;
        fn0 fn0Var = this.r;
        TextView textView = this.f;
        if (num != null) {
            f = cmb.v(cmb.w0(null, cmb.c6, false), cmb.p1(gm.R1(0.15f, 1.0f, fn0Var.e), this.h.intValue()));
            lx4Var.z = this.h;
            this.b.invalidate();
            textView.setTextColor(on2.f(fn0Var.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i = cmb.c6;
            int w0 = cmb.w0(null, i, false);
            int i2 = cmb.F6;
            int f2 = on2.f(fn0Var.e, on2.f(0.05f, w0, cmb.w0(null, i2, false)), cmb.w0(null, cmb.Ei, false));
            textView.setTextColor(on2.f(fn0Var.e, on2.f(0.5f, cmb.w0(null, i, false), cmb.w0(null, i2, false)), -1));
            f = f2;
        } else {
            f = on2.f(0.5f, on2.p(this.w.a.center_color, 255), on2.p(this.w.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f);
            textView.invalidate();
        } else if (cmb.F1(textView.getBackground(), f, false)) {
            textView.invalidate();
        }
    }

    public final void b(int i, Object obj, TLRPC.Document document, boolean z) {
        String str;
        bf0 bf0Var = this.d;
        if (document == null) {
            bf0Var.b();
            this.n = null;
        } else if (this.n == document) {
        } else {
            this.n = document;
            TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(100.0f), false, null, false);
            meb f = eq3.f(document, cmb.Z6, 0.3f, null);
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
            bf0Var.setLayoutParams(qoe.d(i, i, 49, 0.0f, i2 + 17, 0.0f, i2));
            bf0Var.j(gn5.b(document), sb2, gn5.c(w, document), sb2, f, obj);
        }
    }

    @Override
    public final void updateColors() {
        gpa gpaVar;
        try {
            if (this.f != null && this.b != null && this.c != null) {
                if (this.h != null || this.s || ((gpaVar = this.w) != null && gpaVar.a != null)) {
                    a();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void V(float f, int i) {
    }
}
