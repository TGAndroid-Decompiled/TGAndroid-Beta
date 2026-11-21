package di;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.lz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
public final class f1 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f8769a;
    public final FrameLayout f8770b;
    public final bi.c3 f8771c;
    public final org.telegram.ui.Components.q9 d;
    public final TextView f8772e;
    public final TextView f8773f;
    public Integer h;
    public TLRPC.Document f8774n;
    public final te.a f8775r;
    public boolean f8776s;
    public c1 f8777w;

    public f1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f8775r = new te.a(0, this, nr.h, 320L, false);
        this.f8769a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8770b = frameLayout;
        bi.c3 c3Var = new bi.c3(frameLayout, h6Var, true);
        this.f8771c = c3Var;
        frameLayout.setBackground(c3Var);
        c3Var.f3474w = 1;
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.getImageReceiver().W(0);
        addView(q9Var, c8.ma.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8772e = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, c8.ma.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f8773f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), 285212671));
        addView(textView2, c8.ma.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(f1 f1Var, TLRPC.Document document, int i7, Object obj, boolean z10) {
        String str;
        org.telegram.ui.Components.q9 q9Var = f1Var.d;
        if (document == null) {
            q9Var.b();
            f1Var.f8774n = null;
        } else if (f1Var.f8774n == document) {
        } else {
            f1Var.f8774n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29321a7, 0.3f, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i7);
            sb2.append("_");
            sb2.append(i7);
            if (z10) {
                str = "_nolimit_pcache";
            } else {
                str = "";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            int i10 = (80 - i7) / 2;
            q9Var.setLayoutParams(c8.ma.d(i7, i7, 49, 0.0f, i10 + 17, 0.0f, i10));
            q9Var.m(org.telegram.messenger.fc.b(document), sb3, org.telegram.messenger.fc.c(w10, document), sb3, f10, obj);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        b();
    }

    public final void b() {
        int f10;
        bi.c3 c3Var = this.f8771c;
        c3Var.f3477z = null;
        Integer num = this.h;
        te.a aVar = this.f8775r;
        TextView textView = this.f8773f;
        if (num != null) {
            f10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false), org.telegram.ui.ActionBar.m6.r1(org.telegram.messenger.g0.T1(0.15f, 1.0f, aVar.f57696e), this.h.intValue()));
            c3Var.f3477z = this.h;
            this.f8770b.invalidate();
            textView.setTextColor(i0.a.f(aVar.f57696e, this.h.intValue(), -1));
        } else if (this.f8776s) {
            int i7 = org.telegram.ui.ActionBar.m6.f29378d6;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            int f11 = i0.a.f(aVar.f57696e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false));
            textView.setTextColor(i0.a.f(aVar.f57696e, i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false)), -1));
            f10 = f11;
        } else {
            f10 = i0.a.f(0.5f, i0.a.o(this.f8777w.f8613a.center_color, 255), i0.a.o(this.f8777w.f8613a.pattern_color, 255));
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
        c1 c1Var;
        try {
            if (this.f8773f != null && this.f8770b != null && this.f8771c != null) {
                if (this.h != null || this.f8776s || ((c1Var = this.f8777w) != null && c1Var.f8613a != null)) {
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
    public final void D(float f10, int i7) {
    }
}
