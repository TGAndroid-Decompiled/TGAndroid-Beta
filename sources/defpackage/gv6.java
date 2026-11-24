package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class gv6 extends dq {
    public ew6 E;
    public final long F;
    public long G;
    public final c1 H;
    public final gw6 f;
    public final hu6 h;
    public final Context n;
    public yv6 r;
    public ArrayList s;
    public fv6 w;
    public RecyclerView x;
    public boolean y;

    public gv6(android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv6.<init>(android.content.Context):void");
    }

    public final void e() {
        if (this.E == null && this.y) {
            this.f.getClass();
            gw6.b();
            ArrayList arrayList = new ArrayList(gw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                ew6 ew6Var = (ew6) arrayList.get(i);
                if (ew6Var.d() || !ew6Var.g || !ew6Var.h(this.r)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, ju6.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j = this.F;
            if (uptimeMillis >= j) {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
                return;
            }
            c1 c1Var = this.H;
            c1Var.removeMessages(1);
            c1Var.sendMessageAtTime(c1Var.obtainMessage(1, arrayList), this.G + j);
        }
    }

    public final void f(yv6 yv6Var) {
        if (yv6Var != null) {
            if (!this.r.equals(yv6Var)) {
                this.r = yv6Var;
                if (this.y) {
                    gw6 gw6Var = this.f;
                    hu6 hu6Var = this.h;
                    gw6Var.h(hu6Var);
                    gw6Var.a(yv6Var, hu6Var, 1);
                }
                e();
                return;
            }
            return;
        }
        u36.j("selector must not be null");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        this.f.a(this.r, this.h, 1);
        e();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i;
        int a;
        super.onCreate(bundle);
        setContentView(2131492932);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        if (yqe.h(context)) {
            i = 2131099761;
        } else {
            i = 2131099760;
        }
        decorView.setBackgroundColor(context.getColor(i));
        this.s = new ArrayList();
        ((ImageButton) findViewById(2131296567)).setOnClickListener(new g6(this, (byte) 9));
        this.w = new fv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296569);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new u46());
        int i2 = -1;
        if (!context.getResources().getBoolean(2131034115)) {
            a = -1;
        } else {
            a = uqe.a(context);
        }
        if (context.getResources().getBoolean(2131034115)) {
            i2 = -2;
        }
        getWindow().setLayout(a, i2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.H.removeMessages(1);
    }
}
