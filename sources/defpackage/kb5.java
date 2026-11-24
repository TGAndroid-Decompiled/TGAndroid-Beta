package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class kb5 extends n39 {
    public final Context c;
    public final mb5 d;

    public kb5(mb5 mb5Var, Context context) {
        this.d = mb5Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
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
        mb5 mb5Var = this.d;
        if ((i < mb5Var.F || i >= mb5Var.G) && i != mb5Var.K) {
            if (i != mb5Var.E && i != mb5Var.I) {
                if (i != mb5Var.y && i != mb5Var.L) {
                    if (i == mb5Var.J) {
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
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        int i4;
        mb5 mb5Var = this.d;
        boolean z2 = mb5Var.O;
        int i5 = s49Var.f;
        View view = s49Var.a;
        boolean z3 = true;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 4) {
                    if (i5 == 5) {
                        jb5 jb5Var = (jb5) view;
                        if (mb5Var.K <= 0) {
                            z3 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mb5Var.r;
                        jb5Var.b = z3;
                        gt3 gt3Var = jb5Var.a;
                        ib5 ib5Var = jb5Var.f;
                        gt3Var.removeTextChangedListener(ib5Var);
                        if (tL_messages_stickerSet == null) {
                            gt3Var.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            gt3Var.setText(str);
                            gt3Var.setSelection(str.length());
                        }
                        gt3Var.addTextChangedListener(ib5Var);
                        return;
                    }
                    return;
                } else if (i == mb5Var.I) {
                    ((ld5) view).setText(k96.M0(2131754431, null));
                    return;
                } else {
                    ld5 ld5Var = (ld5) view;
                    if (z2) {
                        i4 = 2131752118;
                    } else {
                        i4 = 2131752103;
                    }
                    ld5Var.setText(k96.M0(i4, null));
                    return;
                }
            } else if (i == mb5Var.y) {
                if (z2) {
                    i3 = 2131752117;
                } else {
                    i3 = 2131752102;
                }
                String M0 = k96.M0(i3, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new ui(this, (byte) 1), indexOf, indexOf + 9, 18);
                        ((mhb) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        ((mhb) view).setText(M0);
                        return;
                    }
                }
                ((mhb) view).setText(M0);
                return;
            } else if (i == mb5Var.L) {
                ((mhb) view).setText(k96.M0(2131754426, null));
                return;
            } else {
                return;
            }
        }
        rza rzaVar = (rza) view;
        if (i != mb5Var.K) {
            i2 = ((d) mb5Var).currentAccount;
            ArrayList t0 = hq6.d0(i2).t0(mb5Var.d0());
            int i6 = i - mb5Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
            if (i6 != t0.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            rzaVar.d(tL_messages_stickerSet3, z, false);
            rzaVar.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = mb5Var.r;
            if (tL_messages_stickerSet4 != null) {
                j = tL_messages_stickerSet4.set.id;
            } else if (mb5Var.c0(mb5Var.w) != null) {
                j = mb5Var.c0(mb5Var.w).id;
            } else {
                j = 0;
            }
            if (tL_messages_stickerSet2.set.id != j) {
                z3 = false;
            }
            rzaVar.b(z3, false);
            return;
        }
        rzaVar.b(false, false);
        rzaVar.d(mb5Var.r, false, false);
        rzaVar.setDeleteAction(new b95(this, (byte) 5));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View rzaVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    rzaVar = new ld5(context);
                    zkb.h(bkb.c6, null, rzaVar);
                } else {
                    mb5 mb5Var = this.d;
                    jb5 jb5Var = new jb5(mb5Var, context);
                    mb5Var.P = jb5Var;
                    rzaVar = jb5Var;
                }
            } else {
                rzaVar = new mhb(context);
            }
        } else {
            rzaVar = new rza(context, 3);
            zkb.h(bkb.c6, null, rzaVar);
        }
        rzaVar.setLayoutParams(new e49(-1, -2));
        return new s49(rzaVar);
    }
}
