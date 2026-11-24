package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class l37 extends FrameLayout {
    public final ez3 E;
    public final ArrayList F;
    public final h37 G;
    public final kl0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final mu1 c;
    public final o27 d;
    public final j37 e;
    public final q27 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public l37(Context context, mu1 mu1Var, kl0 kl0Var, o27 o27Var, TLRPC.User user, TLRPC.Chat chat, int i, h37 h37Var, int i2, final boolean z) {
        super(context);
        this.E = new ez3(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = mu1Var;
        this.x = i;
        this.H = kl0Var;
        this.n = user;
        this.r = chat;
        this.d = o27Var;
        this.G = h37Var;
        this.f = new q27(this, context, h37Var);
        j37 j37Var = new j37(context, h37Var);
        this.e = j37Var;
        il0 c = kl0Var.c(j37Var, null, false);
        c.p(nod.k(h37Var));
        c.S.e = true;
        c.q(gl.L(8.0f));
        c.r(gl.L(16.0f));
        j37Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && o27Var.a != null) {
                this.e.a(0, k96.M0(2131748355, null));
            } else if (i4 == 1 && o27Var.b != null && !z) {
                this.e.a(1, k96.M0(2131748359, null));
            } else {
                if (i4 == 2 && o27Var.c != null && !z) {
                    this.e.a(2, k96.M0(2131748358, null));
                }
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new r27(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, nme.e(-1, 66, 87));
        addView(this.f, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new hj3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    l37.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(la2.V).scaleY(1.0f);
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l37.a(boolean):void");
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
                    f37 f37Var = (f37) view;
                    if (f37Var.a == 1) {
                        f37Var.i();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
