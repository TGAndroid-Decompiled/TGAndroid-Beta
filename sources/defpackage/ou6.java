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
public final class ou6 extends ep {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public mu6 J;
    public final ak K;
    public boolean L;
    public long M;
    public final d1 N;
    public final lw6 f;
    public final lu6 h;
    public dw6 n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    public ou6(android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou6.<init>(android.content.Context):void");
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
        d1 d1Var = this.N;
        d1Var.removeMessages(3);
        d1Var.removeMessages(2);
        if (list.isEmpty()) {
            i(0);
            d1Var.sendMessageDelayed(d1Var.obtainMessage(2), 5000L);
            return;
        }
        i(1);
    }

    public final void f() {
        if (this.L) {
            this.f.getClass();
            lw6.b();
            ArrayList arrayList = new ArrayList(lw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                jw6 jw6Var = (jw6) arrayList.get(i);
                if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.n)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, nu6.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            d1 d1Var = this.N;
            d1Var.removeMessages(1);
            d1Var.sendMessageAtTime(d1Var.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(dw6 dw6Var) {
        if (dw6Var != null) {
            if (!this.n.equals(dw6Var)) {
                this.n = dw6Var;
                if (this.L) {
                    lw6 lw6Var = this.f;
                    lu6 lu6Var = this.h;
                    lw6Var.h(lu6Var);
                    lw6Var.a(dw6Var, lu6Var, 1);
                }
                f();
                return;
            }
            return;
        }
        lq5.j("selector must not be null");
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
        d1 d1Var = this.N;
        d1Var.removeMessages(2);
        d1Var.removeMessages(3);
        d1Var.removeMessages(1);
        d1Var.sendMessageDelayed(d1Var.obtainMessage(2), 5000L);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(2131492928);
        this.r = new ArrayList();
        this.J = new mu6(getContext(), this.r);
        this.s = (TextView) findViewById(2131296548);
        this.w = (TextView) findViewById(2131296547);
        this.x = (RelativeLayout) findViewById(2131296551);
        this.y = (TextView) findViewById(2131296552);
        this.E = (TextView) findViewById(2131296549);
        this.F = (LinearLayout) findViewById(2131296541);
        this.G = (Button) findViewById(2131296540);
        this.H = (ProgressBar) findViewById(2131296546);
        Context context = getContext();
        Boolean bool = iie.a;
        boolean z2 = false;
        if (bool == null) {
            if (!iie.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = iie.e;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    iie.e = bool2;
                }
                if (!bool2.booleanValue() && !iie.a(context) && !iie.d(context)) {
                    z = true;
                    bool = Boolean.valueOf(z);
                    iie.a = bool;
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            iie.a = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool3 = iie.c;
            if (bool3 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool3 = Boolean.valueOf(z2);
                iie.c = bool3;
            }
            if (!bool3.booleanValue()) {
                if (!iie.c(context) && !iie.b(context.getResources())) {
                    if (iie.d(context)) {
                        string = context.getString(2131689646);
                    } else {
                        PackageManager packageManager2 = context.getPackageManager();
                        Boolean bool4 = iie.e;
                        if (bool4 == null) {
                            bool4 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                            iie.e = bool4;
                        }
                        if (bool4.booleanValue()) {
                            string = context.getString(2131689648);
                        } else if (iie.a(context)) {
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
                this.G.setOnClickListener(new sa5(this, (byte) 26));
                ListView listView = (ListView) findViewById(2131296539);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(16908292));
                getWindow().setLayout(mte.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(2131689644);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new sa5(this, (byte) 26));
        ListView listView2 = (ListView) findViewById(2131296539);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(16908292));
        getWindow().setLayout(mte.a(getContext()), -2);
        getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f.h(this.h);
        d1 d1Var = this.N;
        d1Var.removeMessages(1);
        d1Var.removeMessages(2);
        d1Var.removeMessages(3);
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
