package ci;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.jz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class n1 extends FrameLayout implements qe.b, org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f5576a;
    public final FrameLayout f5577b;
    public final ai.m2 f5578c;
    public final org.telegram.ui.Components.k9 d;
    public final TextView f5579e;
    public final TextView f5580f;
    public Integer h;
    public TLRPC.Document f5581n;
    public final qe.a f5582r;
    public boolean f5583s;
    public k1 f5584w;

    public n1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5582r = new qe.a(0, this, xq.h, 320L, false);
        this.f5576a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5577b = frameLayout;
        ai.m2 m2Var = new ai.m2(frameLayout, e6Var, true);
        this.f5578c = m2Var;
        frameLayout.setBackground(m2Var);
        m2Var.f817w = 1;
        addView(frameLayout, mf.e(-1, -1, 119));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.getImageReceiver().W(0);
        addView(k9Var, mf.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5579e = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, mf.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f5580f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 285212671));
        addView(textView2, mf.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(n1 n1Var, TLRPC.Document document, int i3, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.k9 k9Var = n1Var.d;
        if (document == null) {
            k9Var.b();
            n1Var.f5581n = null;
        } else if (n1Var.f5581n == document) {
        } else {
            n1Var.f5581n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            jz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27824a7, 0.3f, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            sb2.append("_");
            sb2.append(i3);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i10 = (80 - i3) / 2;
            k9Var.setLayoutParams(mf.d(i3, i3, 49, 0.0f, i10 + 17, 0.0f, i10));
            k9Var.m(org.telegram.messenger.ac.b(document), sb3, org.telegram.messenger.ac.c(w10, document), sb3, f10, obj);
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        b();
    }

    public final void b() {
        int f10;
        ai.m2 m2Var = this.f5578c;
        m2Var.f820z = null;
        Integer num = this.h;
        qe.a aVar = this.f5582r;
        TextView textView = this.f5580f;
        if (num != null) {
            f10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(0.15f, 1.0f, aVar.f53840e), this.h.intValue()));
            m2Var.f820z = this.h;
            this.f5577b.invalidate();
            textView.setTextColor(i0.a.f(aVar.f53840e, this.h.intValue(), -1));
        } else if (this.f5583s) {
            int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            int f11 = i0.a.f(aVar.f53840e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            textView.setTextColor(i0.a.f(aVar.f53840e, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), -1));
            f10 = f11;
        } else {
            f10 = i0.a.f(0.5f, i0.a.o(this.f5584w.f5371a.center_color, 255), i0.a.o(this.f5584w.f5371a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f10);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), f10, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void updateColors() {
        k1 k1Var;
        try {
            if (this.f5580f != null && this.f5577b != null && this.f5578c != null) {
                if (this.h != null || this.f5583s || ((k1Var = this.f5584w) != null && k1Var.f5371a != null)) {
                    b();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
