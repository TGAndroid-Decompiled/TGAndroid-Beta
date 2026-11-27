package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class s57 extends FrameLayout {
    public final zz3 E;
    public final ArrayList F;
    public final o57 G;
    public final ll0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final zu1 c;
    public final v47 d;
    public final q57 e;
    public final x47 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public s57(Context context, zu1 zu1Var, ll0 ll0Var, v47 v47Var, TLRPC.User user, TLRPC.Chat chat, int i, o57 o57Var, int i2, final boolean z) {
        super(context);
        this.E = new zz3(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = zu1Var;
        this.x = i;
        this.H = ll0Var;
        this.n = user;
        this.r = chat;
        this.d = v47Var;
        this.G = o57Var;
        this.f = new x47(this, context, o57Var);
        q57 q57Var = new q57(context, o57Var);
        this.e = q57Var;
        jl0 c = ll0Var.c(q57Var, null, false);
        c.p(dtd.k(o57Var));
        c.S.e = true;
        c.q(hl.L(8.0f));
        c.r(hl.L(16.0f));
        q57Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && v47Var.a != null) {
                this.e.a(0, ob6.M0(2131748301, null));
            } else if (i4 == 1 && v47Var.b != null && !z) {
                this.e.a(1, ob6.M0(2131748305, null));
            } else {
                if (i4 == 2 && v47Var.c != null && !z) {
                    this.e.a(2, ob6.M0(2131748304, null));
                }
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new y47(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, tre.e(-1, 66, 87));
        addView(this.f, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new zj3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    s57.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(bb2.V).scaleY(1.0f);
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s57.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i < viewArr.length) {
                View view = viewArr[i];
                if (view != null) {
                    m57 m57Var = (m57) view;
                    if (m57Var.a == 1) {
                        m57Var.i();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
