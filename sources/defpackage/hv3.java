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
public final class hv3 extends q59 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final kv3 f;

    public hv3(kv3 kv3Var, Context context) {
        this.f = kv3Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        kv3 kv3Var = this.f;
        if (i == kv3Var.h) {
            return 1;
        }
        if (i == kv3Var.s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        kv3 kv3Var = this.f;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 3) {
                    xc5 xc5Var = (xc5) view;
                    Long l = (Long) kv3Var.e.get(i - kv3Var.n);
                    long longValue = l.longValue();
                    if (pg3.D(longValue)) {
                        TLRPC.User W1 = kv3Var.getMessagesController().W1(l);
                        if (i == kv3Var.r - 1) {
                            z = false;
                        }
                        xc5Var.e(W1, null, null, z);
                        return;
                    }
                    TLRPC.Chat L0 = kv3Var.getMessagesController().L0(Long.valueOf(-longValue));
                    if (i == kv3Var.r - 1) {
                        z = false;
                    }
                    xc5Var.e(L0, null, null, z);
                    return;
                }
                return;
            }
            xib xibVar = (xib) view;
            xibVar.g(-1, cmb.p6);
            if (this.d == null) {
                Context context = this.c;
                this.d = context.getResources().getDrawable(2131232576);
                this.e = context.getResources().getDrawable(2131232577);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i3 = cmb.M6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(xibVar, drawable, i3, null, mode);
            anb.x(xibVar, drawable2, cmb.j7, null, mode);
            sn2 sn2Var = new sn2(drawable, drawable2);
            String M0 = jb6.M0(2131745402, null);
            if (kv3Var.n == -1) {
                z = false;
            }
            xibVar.p(M0, sn2Var, z);
            xibVar.getImageView().setPadding(0, gm.L(7.0f), 0, 0);
            return;
        }
        njb njbVar = (njb) view;
        if (i == kv3Var.s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i4 = kv3Var.x;
            if (i4 == 0) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131751149, null));
            } else if (i4 == 1) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131751148, null));
            }
            if (gda.r.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gm.S2(jb6.M0(2131742534, null)));
            }
            njbVar.setText(spannableStringBuilder);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        jv3 jv3Var;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    FrameLayout xc5Var = new xc5(context, 0, 0, false);
                    ImageView k = td4.k(context, 2131231632);
                    k.setScaleType(ImageView.ScaleType.CENTER);
                    xc5Var.setTag(2131296587, k);
                    if (jb6.a0) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    xc5Var.addView(k, qoe.d(40, -1.0f, i2 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    k.setOnTouchListener(new f8(this, xc5Var, (byte) 2));
                    anb.s(k, cmb.a9, null, PorterDuff.Mode.MULTIPLY);
                    jv3Var = xc5Var;
                } else {
                    kv3 kv3Var = this.f;
                    jv3 jv3Var2 = new jv3(kv3Var, context);
                    kv3Var.f = jv3Var2;
                    jv3Var = jv3Var2;
                }
            } else {
                FrameLayout xibVar = new xib(context);
                anb.h(cmb.c6, null, xibVar);
                jv3Var = xibVar;
            }
        } else {
            FrameLayout njbVar = new njb(context);
            anb.Z(njbVar, context, 2131231234, cmb.a7);
            jv3Var = njbVar;
        }
        return new u69(jv3Var);
    }

    @Override
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 1) {
            return;
        }
        anb.h(cmb.c6, null, u69Var.a);
    }
}
