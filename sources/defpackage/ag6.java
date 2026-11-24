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
import org.telegram.ui.ActionBar.d;
public final class ag6 extends kla {
    public Boolean E;
    public int F;
    public int G;
    public final mh6 H;
    public final s09 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public o04 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    public ag6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        this.H = mh6Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624184, 120, 120, null);
        frameLayout.addView((View) imageView, qoe.e(120, 120, 1));
        Point point = gm.q;
        if (point.x > point.y && !gm.O1()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        linearLayout.addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131745850, null));
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, qoe.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        hg9.p(textView3, 1, "ResetAccountStatus", 2131745846);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView3, qoe.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(gm.o());
        textView4.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView4, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(jb6.M0(2131745850, null));
        textView5.setTypeface(gm.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(gm.L(2.0f), 1.0f);
        textView5.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, qoe.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new ca5(this, (byte) 24));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        this.H.y1(true, true);
        gm.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131745850, "ResetAccount");
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
        r58 f = r58.f();
        hg9.q("ResetAccountInfo", null, 2131745847, new Object[]{jb6.a(f.e("+" + this.r))}, this.c);
        n();
        o04 o04Var = new o04(this, (byte) 23);
        this.h = o04Var;
        gm.d3(o04Var, 1000L);
    }

    public final void n() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = this.y;
        i = ((d) this.H).currentAccount;
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
            textView.setText(jb6.G(round, "Days", new Object[0]));
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
        s09 s09Var = this.a;
        if (!z) {
            s09Var.setAutoRepeat(true);
            if (!s09Var.b()) {
                s09Var.d();
            }
        } else {
            s09Var.getAnimatedDrawable().F(0);
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
        int i = cmb.F6;
        this.b.setTextColor(cmb.w0(null, i, false));
        this.c.setTextColor(cmb.w0(null, i, false));
        this.f.setTextColor(cmb.w0(null, i, false));
        this.e.setTextColor(cmb.w0(null, i, false));
        int w0 = cmb.w0(null, cmb.Mi, false);
        int w02 = cmb.w0(null, cmb.P9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = gm.L(6.0f);
            textView.setBackground(cmb.i0(L, L, L, L, w0, w02, w02));
        } else if (w0 != this.F || w02 != this.G) {
            cmb.F1(textView.getBackground(), w0, false);
            cmb.F1(textView.getBackground(), w02, true);
        }
        this.F = w0;
        this.G = w02;
    }
}
