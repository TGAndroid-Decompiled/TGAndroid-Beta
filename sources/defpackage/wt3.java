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
public final class wt3 extends n39 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final zt3 f;

    public wt3(zt3 zt3Var, Context context) {
        this.f = zt3Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        zt3 zt3Var = this.f;
        if (i == zt3Var.h) {
            return 1;
        }
        if (i == zt3Var.s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        zt3 zt3Var = this.f;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 3) {
                    za5 za5Var = (za5) view;
                    Long l = (Long) zt3Var.e.get(i - zt3Var.n);
                    long longValue = l.longValue();
                    if (cf3.D(longValue)) {
                        TLRPC.User V1 = zt3Var.getMessagesController().V1(l);
                        if (i == zt3Var.r - 1) {
                            z = false;
                        }
                        za5Var.e(V1, null, null, z);
                        return;
                    }
                    TLRPC.Chat K0 = zt3Var.getMessagesController().K0(Long.valueOf(-longValue));
                    if (i == zt3Var.r - 1) {
                        z = false;
                    }
                    za5Var.e(K0, null, null, z);
                    return;
                }
                return;
            }
            wgb wgbVar = (wgb) view;
            wgbVar.g(-1, bkb.p6);
            if (this.d == null) {
                Context context = this.c;
                this.d = context.getResources().getDrawable(2131232564);
                this.e = context.getResources().getDrawable(2131232565);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i3 = bkb.M6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(wgbVar, drawable, i3, null, mode);
            zkb.x(wgbVar, drawable2, bkb.j7, null, mode);
            fm2 fm2Var = new fm2(drawable, drawable2);
            String M0 = k96.M0(2131745476, null);
            if (zt3Var.n == -1) {
                z = false;
            }
            wgbVar.p(M0, fm2Var, z);
            wgbVar.getImageView().setPadding(0, gl.L(7.0f), 0, 0);
            return;
        }
        mhb mhbVar = (mhb) view;
        if (i == zt3Var.s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i4 = zt3Var.x;
            if (i4 == 0) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131751200, null));
            } else if (i4 == 1) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131751199, null));
            }
            if (gba.r.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gl.S2(k96.M0(2131742608, null)));
            }
            mhbVar.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        yt3 yt3Var;
        int i2;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    FrameLayout za5Var = new za5(context, 0, 0, false);
                    ImageView k = tb4.k(context, 2131231631);
                    k.setScaleType(ImageView.ScaleType.CENTER);
                    za5Var.setTag(2131296587, k);
                    if (k96.a0) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    za5Var.addView(k, nme.d(40, -1.0f, i2 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    k.setOnTouchListener(new f8(this, za5Var, (byte) 2));
                    zkb.s(k, bkb.a9, null, PorterDuff.Mode.MULTIPLY);
                    yt3Var = za5Var;
                } else {
                    zt3 zt3Var = this.f;
                    yt3 yt3Var2 = new yt3(zt3Var, context);
                    zt3Var.f = yt3Var2;
                    yt3Var = yt3Var2;
                }
            } else {
                FrameLayout wgbVar = new wgb(context);
                zkb.h(bkb.c6, null, wgbVar);
                yt3Var = wgbVar;
            }
        } else {
            FrameLayout mhbVar = new mhb(context);
            zkb.Z(mhbVar, context, 2131231233, bkb.a7);
            yt3Var = mhbVar;
        }
        return new s49(yt3Var);
    }

    @Override
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 1) {
            return;
        }
        zkb.h(bkb.c6, null, s49Var.a);
    }
}
