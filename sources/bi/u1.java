package bi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
public final class u1 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f4784a;
    public final FrameLayout f4785b;
    public final zh.w0 f4786c;
    public final org.telegram.ui.Components.l9 d;
    public final TextView f4787e;
    public final TextView f4788f;
    public Integer h;
    public TLRPC.Document f4789n;
    public final te.a f4790r;
    public boolean f4791s;
    public r1 f4792w;

    public u1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4790r = new te.a(0, this, xq.h, 320L, false);
        this.f4784a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4785b = frameLayout;
        zh.w0 w0Var = new zh.w0(frameLayout, f6Var, true);
        this.f4786c = w0Var;
        frameLayout.setBackground(w0Var);
        w0Var.f60486w = 1;
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.getImageReceiver().W(0);
        addView(l9Var, c8.ha.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4787e = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, c8.ha.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f4788f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 285212671));
        addView(textView2, c8.ha.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(u1 u1Var, TLRPC.Document document, int i7, Object obj, boolean z9) {
        String str;
        org.telegram.ui.Components.l9 l9Var = u1Var.d;
        if (document == null) {
            l9Var.b();
            u1Var.f4789n = null;
        } else if (u1Var.f4789n == document) {
        } else {
            u1Var.f4789n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27792a7, 0.3f, null);
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
            l9Var.setLayoutParams(c8.ha.d(i7, i7, 49, 0.0f, i10 + 17, 0.0f, i10));
            l9Var.m(org.telegram.messenger.hc.b(document), sb3, org.telegram.messenger.hc.c(w10, document), sb3, f10, obj);
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
    }

    public final void b() {
        int f10;
        zh.w0 w0Var = this.f4786c;
        w0Var.f60489z = null;
        Integer num = this.h;
        te.a aVar = this.f4790r;
        TextView textView = this.f4788f;
        if (num != null) {
            f10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false), org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(0.15f, 1.0f, aVar.f55395e), this.h.intValue()));
            w0Var.f60489z = this.h;
            this.f4785b.invalidate();
            textView.setTextColor(i0.a.f(aVar.f55395e, this.h.intValue(), -1));
        } else if (this.f4791s) {
            int i7 = org.telegram.ui.ActionBar.k6.f27848d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            int f11 = i0.a.f(aVar.f55395e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            textView.setTextColor(i0.a.f(aVar.f55395e, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)), -1));
            f10 = f11;
        } else {
            f10 = i0.a.f(0.5f, i0.a.o(this.f4792w.f4604a.center_color, 255), i0.a.o(this.f4792w.f4604a.pattern_color, 255));
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
        r1 r1Var;
        try {
            if (this.f4788f != null && this.f4785b != null && this.f4786c != null) {
                if (this.h != null || this.f4791s || ((r1Var = this.f4792w) != null && r1Var.f4604a != null)) {
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
