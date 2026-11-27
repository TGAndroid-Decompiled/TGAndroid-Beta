package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class j82 extends if0 implements snb {
    public int E;
    public final ImageView s;
    public i82 w;
    public TLRPC.Chat x;
    public boolean y;

    public j82(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i;
        float f;
        float f2;
        float f3;
        this.d.setTypeface(hl.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = aob.w0(null, aob.Mi, false);
        this.E = w0;
        imageView.setBackground(aob.f0(w0, 1, -1));
        imageView.setImageResource(2131232577);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(ob6.M0(2131751563, null));
        boolean z = ob6.a0;
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
        addView(imageView, tre.d(48, 50.0f, i2, f, 0.0f, f2, 0.0f));
        ff0 ff0Var = this.d;
        if (ob6.a0) {
            f3 = 24.0f;
        } else {
            f3 = 0.0f;
        }
        ff0Var.setPadding(hl.L(f3), 0, hl.L(ob6.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String str;
        int i3;
        String M0;
        String str2;
        this.y = z;
        this.x = chat;
        rb0 rb0Var = this.b;
        rb0Var.p(chat);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(chat, rb0Var);
        String str3 = chat.title;
        ff0 ff0Var = this.d;
        ff0Var.k(pv3.m(str3, ff0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = xc2.V(chat);
        if (z) {
            if (i2 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = ob6.G(i2, str2, new Object[0]);
            } else {
                if (V) {
                    i3 = 2131751355;
                } else {
                    i3 = 2131754872;
                }
                M0 = ob6.M0(i3, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(ob6.G(i, str, new Object[0]));
        }
        yob.W(this.e, aob.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new sb1(this, chat, (byte) 14));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(i82 i82Var) {
        this.w = i82Var;
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.Mi, false);
            ImageView imageView = this.s;
            if (imageView != null && w0 != this.E) {
                this.E = w0;
                aob.F1(imageView.getBackground(), w0, true);
                imageView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
