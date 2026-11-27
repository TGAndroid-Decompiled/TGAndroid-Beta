package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class lv6 extends ep {
    public jw6 E;
    public final long F;
    public long G;
    public final d1 H;
    public final lw6 f;
    public final lu6 h;
    public final Context n;
    public dw6 r;
    public ArrayList s;
    public kv6 w;
    public RecyclerView x;
    public boolean y;

    public lv6(android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.<init>(android.content.Context):void");
    }

    public final void e() {
        if (this.E == null && this.y) {
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
                if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.r)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, nu6.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.G;
            long j = this.F;
            if (uptimeMillis >= j) {
                this.G = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
                return;
            }
            d1 d1Var = this.H;
            d1Var.removeMessages(1);
            d1Var.sendMessageAtTime(d1Var.obtainMessage(1, arrayList), this.G + j);
        }
    }

    public final void f(dw6 dw6Var) {
        if (dw6Var != null) {
            if (!this.r.equals(dw6Var)) {
                this.r = dw6Var;
                if (this.y) {
                    lw6 lw6Var = this.f;
                    lu6 lu6Var = this.h;
                    lw6Var.h(lu6Var);
                    lw6Var.a(dw6Var, lu6Var, 1);
                }
                e();
                return;
            }
            return;
        }
        lq5.j("selector must not be null");
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
        if (nte.h(context)) {
            i = 2131099761;
        } else {
            i = 2131099760;
        }
        decorView.setBackgroundColor(context.getColor(i));
        this.s = new ArrayList();
        ((ImageButton) findViewById(2131296567)).setOnClickListener(new h6(this, (byte) 9));
        this.w = new kv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296569);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new x46());
        int i2 = -1;
        if (!context.getResources().getBoolean(2131034115)) {
            a = -1;
        } else {
            a = mte.a(context);
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
