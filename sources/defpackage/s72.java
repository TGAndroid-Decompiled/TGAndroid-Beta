package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class s72 extends gf0 implements tjb {
    public int E;
    public final ImageView s;
    public r72 w;
    public TLRPC.Chat x;
    public boolean y;

    public s72(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i;
        float f;
        float f2;
        float f3;
        this.d.setTypeface(gl.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = bkb.w0(null, bkb.Li, false);
        this.E = w0;
        imageView.setBackground(bkb.f0(w0, 1, -1));
        imageView.setImageResource(2131232566);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(k96.M0(2131751586, null));
        boolean z = k96.a0;
        if (z) {
            i = 3;
        } else {
            i = 5;
        }
        int i2 = i | 17;
        if (z) {
            f = 3.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 3.0f;
        }
        addView(imageView, nme.d(48, 50.0f, i2, f, 0.0f, f2, 0.0f));
        df0 df0Var = this.d;
        if (k96.a0) {
            f3 = 24.0f;
        } else {
            f3 = 0.0f;
        }
        df0Var.setPadding(gl.L(f3), 0, gl.L(k96.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String str;
        int i3;
        String M0;
        String str2;
        this.y = z;
        this.x = chat;
        pb0 pb0Var = this.b;
        pb0Var.p(chat);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(chat, pb0Var);
        String str3 = chat.title;
        df0 df0Var = this.d;
        df0Var.k(vu3.m(str3, df0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = hc2.V(chat);
        if (z) {
            if (i2 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = k96.G(i2, str2, new Object[0]);
            } else {
                if (V) {
                    i3 = 2131751378;
                } else {
                    i3 = 2131754876;
                }
                M0 = k96.M0(i3, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(k96.G(i, str, new Object[0]));
        }
        zkb.W(this.e, bkb.q5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new kb1(this, chat, (byte) 12));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(r72 r72Var) {
        this.w = r72Var;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.Li, false);
            ImageView imageView = this.s;
            if (imageView != null && w0 != this.E) {
                this.E = w0;
                bkb.F1(imageView.getBackground(), w0, true);
                imageView.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
