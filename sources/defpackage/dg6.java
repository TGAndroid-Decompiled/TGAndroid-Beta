package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e;
public final class dg6 extends cna {
    public Boolean E;
    public int F;
    public int G;
    public final qh6 H;
    public final e29 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public zz3 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    public dg6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        this.H = qh6Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624184, 120, 120, null);
        frameLayout.addView((View) imageView, tre.e(120, 120, 1));
        Point point = hl.q;
        if (point.x > point.y && !hl.O1()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        linearLayout.addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131745844, null));
        textView.setGravity(17);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, tre.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        uh9.q(textView3, 1, "ResetAccountStatus", 2131745840);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView3, tre.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(hl.o());
        textView4.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView4, tre.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(ob6.M0(2131745844, null));
        textView5.setTypeface(hl.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(hl.L(2.0f), 1.0f);
        textView5.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, tre.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new sa5(this, (byte) 22));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z) {
        this.H.y1(true, true);
        hl.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131745844, "ResetAccount");
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        this.n = bundle;
        this.r = bundle.getString("phoneFormated");
        this.s = bundle.getString("phoneHash");
        this.w = bundle.getString("code");
        this.x = bundle.getInt("startTime");
        this.y = bundle.getInt("waitTime");
        f78 f = f78.f();
        uh9.r("ResetAccountInfo", null, 2131745841, new Object[]{ob6.a(f.e("+" + this.r))}, this.c);
        n();
        zz3 zz3Var = new zz3(this, (byte) 23);
        this.h = zz3Var;
        hl.d3(zz3Var, 1000L);
    }

    public final void n() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = this.y;
        i = ((e) this.H).currentAccount;
        int currentTime = i4 - (ConnectionsManager.getInstance(i).getCurrentTime() - this.x);
        int i5 = 0;
        int max = Math.max(0, currentTime);
        int i6 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i7 = max / 3600;
        int i8 = (max / 60) % 60;
        int i9 = max % 60;
        TextView textView = this.e;
        if (i6 >= 2) {
            textView.setText(ob6.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        if (max == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.E;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        e29 e29Var = this.a;
        if (!z) {
            e29Var.setAutoRepeat(true);
            if (!e29Var.b()) {
                e29Var.d();
            }
        } else {
            e29Var.getAnimatedDrawable().F(0);
        }
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        this.f.setVisibility(i3);
        if (!z) {
            i5 = 4;
        }
        this.d.setVisibility(i5);
        this.E = Boolean.valueOf(z);
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        this.b.setTextColor(aob.w0(null, i, false));
        this.c.setTextColor(aob.w0(null, i, false));
        this.f.setTextColor(aob.w0(null, i, false));
        this.e.setTextColor(aob.w0(null, i, false));
        int w0 = aob.w0(null, aob.Ni, false);
        int w02 = aob.w0(null, aob.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = hl.L(6.0f);
            textView.setBackground(aob.i0(L, L, L, L, w0, w02, w02));
        } else if (w0 != this.F || w02 != this.G) {
            aob.F1(textView.getBackground(), w0, false);
            aob.F1(textView.getBackground(), w02, true);
        }
        this.F = w0;
        this.G = w02;
    }
}
