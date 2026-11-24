package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class d92 extends gg0 implements vlb {
    public int E;
    public final ImageView s;
    public c92 w;
    public TLRPC.Chat x;
    public boolean y;

    public d92(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i;
        float f;
        float f2;
        float f3;
        this.d.setTypeface(gm.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = cmb.w0(null, cmb.Li, false);
        this.E = w0;
        imageView.setBackground(cmb.f0(w0, 1, -1));
        imageView.setImageResource(2131232578);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(jb6.M0(2131751535, null));
        boolean z = jb6.a0;
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
        addView(imageView, qoe.d(48, 50.0f, i2, f, 0.0f, f2, 0.0f));
        dg0 dg0Var = this.d;
        if (jb6.a0) {
            f3 = 24.0f;
        } else {
            f3 = 0.0f;
        }
        dg0Var.setPadding(gm.L(f3), 0, gm.L(jb6.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String str;
        int i3;
        String M0;
        String str2;
        this.y = z;
        this.x = chat;
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str3 = chat.title;
        dg0 dg0Var = this.d;
        dg0Var.k(gw3.m(str3, dg0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = sd2.V(chat);
        if (z) {
            if (i2 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = jb6.G(i2, str2, new Object[0]);
            } else {
                if (V) {
                    i3 = 2131751327;
                } else {
                    i3 = 2131754876;
                }
                M0 = jb6.M0(i3, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(jb6.G(i, str, new Object[0]));
        }
        anb.W(this.e, cmb.q5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new rc1(this, chat, (byte) 13));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(c92 c92Var) {
        this.w = c92Var;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.Li, false);
            ImageView imageView = this.s;
            if (imageView != null && w0 != this.E) {
                this.E = w0;
                cmb.F1(imageView.getBackground(), w0, true);
                imageView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
