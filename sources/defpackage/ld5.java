package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ld5 extends c79 {
    public final Context c;
    public final nd5 d;

    public ld5(nd5 nd5Var, Context context) {
        this.d = nd5Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i) {
        nd5 nd5Var = this.d;
        if ((i < nd5Var.F || i >= nd5Var.G) && i != nd5Var.K) {
            if (i != nd5Var.E && i != nd5Var.I) {
                if (i != nd5Var.y && i != nd5Var.L) {
                    if (i == nd5Var.J) {
                        return 5;
                    }
                    return 0;
                }
                return 1;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        int i4;
        nd5 nd5Var = this.d;
        boolean z2 = nd5Var.O;
        int i5 = f89Var.f;
        View view = f89Var.a;
        boolean z3 = true;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 4) {
                    if (i5 == 5) {
                        kd5 kd5Var = (kd5) view;
                        if (nd5Var.K <= 0) {
                            z3 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nd5Var.r;
                        kd5Var.b = z3;
                        xt3 xt3Var = kd5Var.a;
                        jd5 jd5Var = kd5Var.f;
                        xt3Var.removeTextChangedListener(jd5Var);
                        if (tL_messages_stickerSet == null) {
                            xt3Var.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            xt3Var.setText(str);
                            xt3Var.setSelection(str.length());
                        }
                        xt3Var.addTextChangedListener(jd5Var);
                        return;
                    }
                    return;
                } else if (i == nd5Var.I) {
                    ((mf5) view).setText(ob6.M0(2131754427, null));
                    return;
                } else {
                    mf5 mf5Var = (mf5) view;
                    if (z2) {
                        i4 = 2131752095;
                    } else {
                        i4 = 2131752080;
                    }
                    mf5Var.setText(ob6.M0(i4, null));
                    return;
                }
            } else if (i == nd5Var.y) {
                if (z2) {
                    i3 = 2131752094;
                } else {
                    i3 = 2131752079;
                }
                String M0 = ob6.M0(i3, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new vi(this, (byte) 1), indexOf, indexOf + 9, 18);
                        ((ilb) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        ((ilb) view).setText(M0);
                        return;
                    }
                }
                ((ilb) view).setText(M0);
                return;
            } else if (i == nd5Var.L) {
                ((ilb) view).setText(ob6.M0(2131754422, null));
                return;
            } else {
                return;
            }
        }
        p3b p3bVar = (p3b) view;
        if (i != nd5Var.K) {
            i2 = ((e) nd5Var).currentAccount;
            ArrayList t0 = ls6.d0(i2).t0(nd5Var.d0());
            int i6 = i - nd5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            if (i6 != t0.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            p3bVar.d(tL_messages_stickerSet3, z, false);
            p3bVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = nd5Var.r;
            if (tL_messages_stickerSet4 != null) {
                j = tL_messages_stickerSet4.set.id;
            } else if (nd5Var.c0(nd5Var.w) != null) {
                j = nd5Var.c0(nd5Var.w).id;
            } else {
                j = 0;
            }
            if (tL_messages_stickerSet2.set.id != j) {
                z3 = false;
            }
            p3bVar.b(z3, false);
            return;
        }
        p3bVar.b(false, false);
        p3bVar.d(nd5Var.r, false, false);
        p3bVar.setDeleteAction(new sa5(this, (byte) 6));
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View p3bVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    p3bVar = new mf5(context);
                    yob.h(aob.d6, null, p3bVar);
                } else {
                    nd5 nd5Var = this.d;
                    kd5 kd5Var = new kd5(nd5Var, context);
                    nd5Var.P = kd5Var;
                    p3bVar = kd5Var;
                }
            } else {
                p3bVar = new ilb(context);
            }
        } else {
            p3bVar = new p3b(context, 3);
            yob.h(aob.d6, null, p3bVar);
        }
        p3bVar.setLayoutParams(new r79(-1, -2));
        return new f89(p3bVar);
    }
}
