package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class id5 extends q59 {
    public final Context c;
    public final kd5 d;

    public id5(kd5 kd5Var, Context context) {
        this.d = kd5Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
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
        kd5 kd5Var = this.d;
        if ((i < kd5Var.F || i >= kd5Var.G) && i != kd5Var.K) {
            if (i != kd5Var.E && i != kd5Var.I) {
                if (i != kd5Var.y && i != kd5Var.L) {
                    if (i == kd5Var.J) {
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
    public final void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        int i4;
        kd5 kd5Var = this.d;
        boolean z2 = kd5Var.O;
        int i5 = u69Var.f;
        View view = u69Var.a;
        boolean z3 = true;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 4) {
                    if (i5 == 5) {
                        hd5 hd5Var = (hd5) view;
                        if (kd5Var.K <= 0) {
                            z3 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kd5Var.r;
                        hd5Var.b = z3;
                        qu3 qu3Var = hd5Var.a;
                        gd5 gd5Var = hd5Var.f;
                        qu3Var.removeTextChangedListener(gd5Var);
                        if (tL_messages_stickerSet == null) {
                            qu3Var.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            qu3Var.setText(str);
                            qu3Var.setSelection(str.length());
                        }
                        qu3Var.addTextChangedListener(gd5Var);
                        return;
                    }
                    return;
                } else if (i == kd5Var.I) {
                    ((jf5) view).setText(jb6.M0(2131754431, null));
                    return;
                } else {
                    jf5 jf5Var = (jf5) view;
                    if (z2) {
                        i4 = 2131752067;
                    } else {
                        i4 = 2131752052;
                    }
                    jf5Var.setText(jb6.M0(i4, null));
                    return;
                }
            } else if (i == kd5Var.y) {
                if (z2) {
                    i3 = 2131752066;
                } else {
                    i3 = 2131752051;
                }
                String M0 = jb6.M0(i3, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new uj(this, (byte) 1), indexOf, indexOf + 9, 18);
                        ((njb) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        ((njb) view).setText(M0);
                        return;
                    }
                }
                ((njb) view).setText(M0);
                return;
            } else if (i == kd5Var.L) {
                ((njb) view).setText(jb6.M0(2131754426, null));
                return;
            } else {
                return;
            }
        }
        s1b s1bVar = (s1b) view;
        if (i != kd5Var.K) {
            i2 = ((d) kd5Var).currentAccount;
            ArrayList t0 = hs6.d0(i2).t0(kd5Var.e0());
            int i6 = i - kd5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            if (i6 != t0.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            s1bVar.d(tL_messages_stickerSet3, z, false);
            s1bVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = kd5Var.r;
            if (tL_messages_stickerSet4 != null) {
                j = tL_messages_stickerSet4.set.id;
            } else if (kd5Var.d0(kd5Var.w) != null) {
                j = kd5Var.d0(kd5Var.w).id;
            } else {
                j = 0;
            }
            if (tL_messages_stickerSet2.set.id != j) {
                z3 = false;
            }
            s1bVar.b(z3, false);
            return;
        }
        s1bVar.b(false, false);
        s1bVar.d(kd5Var.r, false, false);
        s1bVar.setDeleteAction(new ca5(this, (byte) 8));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View s1bVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    s1bVar = new jf5(context);
                    anb.h(cmb.c6, null, s1bVar);
                } else {
                    kd5 kd5Var = this.d;
                    hd5 hd5Var = new hd5(kd5Var, context);
                    kd5Var.P = hd5Var;
                    s1bVar = hd5Var;
                }
            } else {
                s1bVar = new njb(context);
            }
        } else {
            s1bVar = new s1b(context, 3);
            anb.h(cmb.c6, null, s1bVar);
        }
        s1bVar.setLayoutParams(new g69(-1, -2));
        return new u69(s1bVar);
    }
}
