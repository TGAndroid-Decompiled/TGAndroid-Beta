package bi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wq;
public final class u1 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f4783a;
    public final FrameLayout f4784b;
    public final zh.v0 f4785c;
    public final org.telegram.ui.Components.k9 d;
    public final TextView f4786e;
    public final TextView f4787f;
    public Integer h;
    public TLRPC.Document f4788n;
    public final te.a f4789r;
    public boolean f4790s;
    public r1 f4791w;

    public u1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f4789r = new te.a(0, this, wq.h, 320L, false);
        this.f4783a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4784b = frameLayout;
        zh.v0 v0Var = new zh.v0(frameLayout, h6Var, true);
        this.f4785c = v0Var;
        frameLayout.setBackground(v0Var);
        v0Var.f60595w = 1;
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.getImageReceiver().W(0);
        addView(k9Var, c8.ha.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4786e = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, c8.ha.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f4787f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), 285212671));
        addView(textView2, c8.ha.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(u1 u1Var, TLRPC.Document document, int i7, Object obj, boolean z9) {
        String str;
        org.telegram.ui.Components.k9 k9Var = u1Var.d;
        if (document == null) {
            k9Var.b();
            u1Var.f4788n = null;
        } else if (u1Var.f4788n == document) {
        } else {
            u1Var.f4788n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.f27834a7, 0.3f, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i7);
            sb2.append("_");
            sb2.append(i7);
            if (z9) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i10 = (80 - i7) / 2;
            k9Var.setLayoutParams(c8.ha.d(i7, i7, 49, 0.0f, i10 + 17, 0.0f, i10));
            k9Var.m(org.telegram.messenger.hc.b(document), sb3, org.telegram.messenger.hc.c(w10, document), sb3, f10, obj);
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
    }

    public final void b() {
        int f10;
        zh.v0 v0Var = this.f4785c;
        v0Var.f60598z = null;
        Integer num = this.h;
        te.a aVar = this.f4789r;
        TextView textView = this.f4787f;
        if (num != null) {
            f10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false), org.telegram.ui.ActionBar.m6.r1(org.telegram.messenger.g0.T1(0.15f, 1.0f, aVar.f55498e), this.h.intValue()));
            v0Var.f60598z = this.h;
            this.f4784b.invalidate();
            textView.setTextColor(i0.a.f(aVar.f55498e, this.h.intValue(), -1));
        } else if (this.f4790s) {
            int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            int f11 = i0.a.f(aVar.f55498e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            textView.setTextColor(i0.a.f(aVar.f55498e, i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), -1));
            f10 = f11;
        } else {
            f10 = i0.a.f(0.5f, i0.a.o(this.f4791w.f4604a.center_color, 255), i0.a.o(this.f4791w.f4604a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f10);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), f10, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void updateColors() {
        r1 r1Var;
        try {
            if (this.f4787f != null && this.f4784b != null && this.f4785c != null) {
                if (this.h != null || this.f4790s || ((r1Var = this.f4791w) != null && r1Var.f4604a != null)) {
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
    public final void F(float f10, int i7) {
    }
}
