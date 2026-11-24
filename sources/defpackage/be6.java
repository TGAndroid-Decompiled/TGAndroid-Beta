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
public final class be6 extends jja {
    public Boolean E;
    public int F;
    public int G;
    public final mf6 H;
    public final ry8 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public ez3 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    public be6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        this.H = mf6Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624185, 120, 120, null);
        frameLayout.addView((View) imageView, nme.e(120, 120, 1));
        Point point = gl.q;
        if (point.x > point.y && !gl.O1()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        linearLayout.addView(frameLayout, nme.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131745924, null));
        textView.setGravity(17);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, nme.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        de9.q(textView3, 1, "ResetAccountStatus", 2131745920);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView3, nme.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(gl.o());
        textView4.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView4, nme.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(k96.M0(2131745924, null));
        textView5.setTypeface(gl.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(gl.L(2.0f), 1.0f);
        textView5.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, nme.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new b95(this, (byte) 21));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        this.H.x1(true, true);
        gl.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return k96.M0(2131745924, "ResetAccount");
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
        p38 f = p38.f();
        de9.r("ResetAccountInfo", null, 2131745921, new Object[]{k96.a(f.e("+" + this.r))}, this.c);
        n();
        ez3 ez3Var = new ez3(this, (byte) 23);
        this.h = ez3Var;
        gl.e3(ez3Var, 1000L);
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
            textView.setText(k96.G(round, "Days", new Object[0]));
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
        ry8 ry8Var = this.a;
        if (!z) {
            ry8Var.setAutoRepeat(true);
            if (!ry8Var.b()) {
                ry8Var.d();
            }
        } else {
            ry8Var.getAnimatedDrawable().F(0);
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
        int i = bkb.F6;
        this.b.setTextColor(bkb.w0(null, i, false));
        this.c.setTextColor(bkb.w0(null, i, false));
        this.f.setTextColor(bkb.w0(null, i, false));
        this.e.setTextColor(bkb.w0(null, i, false));
        int w0 = bkb.w0(null, bkb.Mi, false);
        int w02 = bkb.w0(null, bkb.P9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = gl.L(6.0f);
            textView.setBackground(bkb.i0(L, L, L, L, w0, w02, w02));
        } else if (w0 != this.F || w02 != this.G) {
            bkb.F1(textView.getBackground(), w0, false);
            bkb.F1(textView.getBackground(), w02, true);
        }
        this.F = w0;
        this.G = w02;
    }
}
