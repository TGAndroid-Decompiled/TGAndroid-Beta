package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class l57 extends FrameLayout {
    public final o04 E;
    public final ArrayList F;
    public final h57 G;
    public final km0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final yv1 c;
    public final o47 d;
    public final j57 e;
    public final q47 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public l57(Context context, yv1 yv1Var, km0 km0Var, o47 o47Var, TLRPC.User user, TLRPC.Chat chat, int i, h57 h57Var, int i2, final boolean z) {
        super(context);
        this.E = new o04(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = yv1Var;
        this.x = i;
        this.H = km0Var;
        this.n = user;
        this.r = chat;
        this.d = o47Var;
        this.G = h57Var;
        this.f = new q47(this, context, h57Var);
        j57 j57Var = new j57(context, h57Var);
        this.e = j57Var;
        im0 c = km0Var.c(j57Var, null, false);
        c.p(qqd.k(h57Var));
        c.S.e = true;
        c.q(gm.L(8.0f));
        c.r(gm.L(16.0f));
        j57Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && o47Var.a != null) {
                this.e.a(0, jb6.M0(2131748304, null));
            } else if (i4 == 1 && o47Var.b != null && !z) {
                this.e.a(1, jb6.M0(2131748308, null));
            } else {
                if (i4 == 2 && o47Var.c != null && !z) {
                    this.e.a(2, jb6.M0(2131748307, null));
                }
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new r47(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, qoe.e(-1, 66, 87));
        addView(this.f, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new sk3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    l57.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(wb2.V).scaleY(1.0f);
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l57.a(boolean):void");
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
                    f57 f57Var = (f57) view;
                    if (f57Var.a == 1) {
                        f57Var.i();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
