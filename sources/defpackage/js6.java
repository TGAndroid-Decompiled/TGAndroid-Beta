package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class js6 extends dp {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public hs6 J;
    public final zj K;
    public boolean L;
    public long M;
    public final c1 N;
    public final gu6 f;
    public final gs6 h;
    public yt6 n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    public js6(android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js6.<init>(android.content.Context):void");
    }

    @Override
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.K);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.M = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.J.notifyDataSetChanged();
        c1 c1Var = this.N;
        c1Var.removeMessages(3);
        c1Var.removeMessages(2);
        if (list.isEmpty()) {
            i(0);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(2), 5000L);
            return;
        }
        i(1);
    }

    public final void f() {
        if (this.L) {
            this.f.getClass();
            gu6.b();
            ArrayList arrayList = new ArrayList(gu6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                eu6 eu6Var = (eu6) arrayList.get(i);
                if (eu6Var.d() || !eu6Var.g || !eu6Var.h(this.n)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, is6.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            c1 c1Var = this.N;
            c1Var.removeMessages(1);
            c1Var.sendMessageAtTime(c1Var.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(yt6 yt6Var) {
        if (yt6Var != null) {
            if (!this.n.equals(yt6Var)) {
                this.n = yt6Var;
                if (this.L) {
                    gu6 gu6Var = this.f;
                    gs6 gs6Var = this.h;
                    gu6Var.h(gs6Var);
                    gu6Var.a(yt6Var, gs6Var, 1);
                }
                f();
                return;
            }
            return;
        }
        w26.j("selector must not be null");
    }

    public final void i(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    setTitle(2131689649);
                    this.I.setVisibility(8);
                    this.w.setVisibility(8);
                    this.H.setVisibility(8);
                    this.F.setVisibility(0);
                    this.G.setVisibility(0);
                    this.E.setVisibility(0);
                    this.x.setVisibility(0);
                    return;
                }
                setTitle(2131689641);
                this.I.setVisibility(8);
                this.w.setVisibility(8);
                this.H.setVisibility(0);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.E.setVisibility(4);
                this.x.setVisibility(0);
                return;
            }
            setTitle(2131689641);
            this.I.setVisibility(0);
            this.w.setVisibility(8);
            this.H.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        setTitle(2131689641);
        this.I.setVisibility(8);
        this.w.setVisibility(0);
        this.H.setVisibility(0);
        this.F.setVisibility(8);
        this.G.setVisibility(8);
        this.E.setVisibility(8);
        this.x.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        this.f.a(this.n, this.h, 1);
        f();
        c1 c1Var = this.N;
        c1Var.removeMessages(2);
        c1Var.removeMessages(3);
        c1Var.removeMessages(1);
        c1Var.sendMessageDelayed(c1Var.obtainMessage(2), 5000L);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(2131492928);
        this.r = new ArrayList();
        this.J = new hs6(getContext(), this.r);
        this.s = (TextView) findViewById(2131296548);
        this.w = (TextView) findViewById(2131296547);
        this.x = (RelativeLayout) findViewById(2131296551);
        this.y = (TextView) findViewById(2131296552);
        this.E = (TextView) findViewById(2131296549);
        this.F = (LinearLayout) findViewById(2131296541);
        this.G = (Button) findViewById(2131296540);
        this.H = (ProgressBar) findViewById(2131296546);
        Context context = getContext();
        Boolean bool = rde.a;
        boolean z2 = false;
        if (bool == null) {
            if (!rde.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = rde.e;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    rde.e = bool2;
                }
                if (!bool2.booleanValue() && !rde.a(context) && !rde.d(context)) {
                    z = true;
                    bool = Boolean.valueOf(z);
                    rde.a = bool;
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            rde.a = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool3 = rde.c;
            if (bool3 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool3 = Boolean.valueOf(z2);
                rde.c = bool3;
            }
            if (!bool3.booleanValue()) {
                if (!rde.c(context) && !rde.b(context.getResources())) {
                    if (rde.d(context)) {
                        string = context.getString(2131689646);
                    } else {
                        PackageManager packageManager2 = context.getPackageManager();
                        Boolean bool4 = rde.e;
                        if (bool4 == null) {
                            bool4 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                            rde.e = bool4;
                        }
                        if (bool4.booleanValue()) {
                            string = context.getString(2131689648);
                        } else if (rde.a(context)) {
                            string = context.getString(2131689643);
                        } else {
                            string = context.getString(2131689647);
                        }
                    }
                } else {
                    string = context.getString(2131689645);
                }
                this.y.setText(string);
                this.E.setMovementMethod(LinkMovementMethod.getInstance());
                this.G.setOnClickListener(new b95(this, (byte) 25));
                ListView listView = (ListView) findViewById(2131296539);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(16908292));
                getWindow().setLayout(roe.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(2131689644);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new b95(this, (byte) 25));
        ListView listView2 = (ListView) findViewById(2131296539);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(16908292));
        getWindow().setLayout(roe.a(getContext()), -2);
        getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f.h(this.h);
        c1 c1Var = this.N;
        c1Var.removeMessages(1);
        c1Var.removeMessages(2);
        c1Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override
    public final void setTitle(int i) {
        this.s.setText(i);
    }
}
