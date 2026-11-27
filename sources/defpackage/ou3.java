package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class ou3 extends c79 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final ru3 f;

    public ou3(ru3 ru3Var, Context context) {
        this.f = ru3Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f.w;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        ru3 ru3Var = this.f;
        if (i == ru3Var.h) {
            return 1;
        }
        if (i == ru3Var.s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        ru3 ru3Var = this.f;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 3) {
                    bd5 bd5Var = (bd5) view;
                    Long l = (Long) ru3Var.e.get(i - ru3Var.n);
                    long longValue = l.longValue();
                    if (wf3.D(longValue)) {
                        TLRPC.User X1 = ru3Var.getMessagesController().X1(l);
                        if (i == ru3Var.r - 1) {
                            z = false;
                        }
                        bd5Var.e(X1, null, null, z);
                        return;
                    }
                    TLRPC.Chat M0 = ru3Var.getMessagesController().M0(Long.valueOf(-longValue));
                    if (i == ru3Var.r - 1) {
                        z = false;
                    }
                    bd5Var.e(M0, null, null, z);
                    return;
                }
                return;
            }
            skb skbVar = (skb) view;
            skbVar.g(-1, aob.q6);
            if (this.d == null) {
                Context context = this.c;
                this.d = context.getResources().getDrawable(2131232575);
                this.e = context.getResources().getDrawable(2131232576);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i3 = aob.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(skbVar, drawable, i3, null, mode);
            yob.x(skbVar, drawable2, aob.k7, null, mode);
            zm2 zm2Var = new zm2(drawable, drawable2);
            String M02 = ob6.M0(2131745396, null);
            if (ru3Var.n == -1) {
                z = false;
            }
            skbVar.p(M02, zm2Var, z);
            skbVar.getImageView().setPadding(0, hl.L(7.0f), 0, 0);
            return;
        }
        ilb ilbVar = (ilb) view;
        if (i == ru3Var.s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i4 = ru3Var.x;
            if (i4 == 0) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131751177, null));
            } else if (i4 == 1) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131751176, null));
            }
            if (xea.r.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) hl.S2(ob6.M0(2131742502, null)));
            }
            ilbVar.setText(spannableStringBuilder);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        qu3 qu3Var;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    FrameLayout bd5Var = new bd5(context, 0, 0, false);
                    ImageView k = qd4.k(context, 2131231631);
                    k.setScaleType(ImageView.ScaleType.CENTER);
                    bd5Var.setTag(2131296587, k);
                    if (ob6.a0) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    bd5Var.addView(k, tre.d(40, -1.0f, i2 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    k.setOnTouchListener(new g8(this, bd5Var, (byte) 2));
                    yob.s(k, aob.b9, null, PorterDuff.Mode.MULTIPLY);
                    qu3Var = bd5Var;
                } else {
                    ru3 ru3Var = this.f;
                    qu3 qu3Var2 = new qu3(ru3Var, context);
                    ru3Var.f = qu3Var2;
                    qu3Var = qu3Var2;
                }
            } else {
                FrameLayout skbVar = new skb(context);
                yob.h(aob.d6, null, skbVar);
                qu3Var = skbVar;
            }
        } else {
            FrameLayout ilbVar = new ilb(context);
            yob.Z(ilbVar, context, 2131231233, aob.b7);
            qu3Var = ilbVar;
        }
        return new f89(qu3Var);
    }

    @Override
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 1) {
            return;
        }
        yob.h(aob.d6, null, f89Var.a);
    }
}
