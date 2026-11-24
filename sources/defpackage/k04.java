package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class k04 implements View.OnClickListener {
    public final byte a;
    public final l04 b;

    public k04(l04 l04Var, byte b) {
        this.a = b;
        this.b = l04Var;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i;
        TLRPC.StickerSet stickerSet3;
        byte b = this.a;
        l04 l04Var = this.b;
        switch (b) {
            case 0:
                h04 h04Var = l04Var.x;
                if (h04Var != null && (stickerSet = h04Var.b) != null) {
                    t14 t14Var = l04Var.H;
                    if (!t14Var.w2) {
                        t14Var.w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new nz3(t14Var, t14Var.Z1, t14Var.getContext(), t14Var.a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ah8 ah8Var = l04Var.r;
                TextView textView = l04Var.n;
                TextView textView2 = l04Var.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (ah8Var != null && ah8Var.getVisibility() == 0 && ah8Var.w.isEnabled()) {
                    ah8Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                t14 t14Var2 = l04Var.H;
                ArrayList arrayList2 = t14Var2.q1;
                h04 h04Var2 = l04Var.x;
                if (h04Var2 != null && (stickerSet2 = h04Var2.b) != null) {
                    h04Var2.f = true;
                    d04 d04Var = t14Var2.S;
                    int i2 = t14Var2.d1;
                    ArrayList arrayList3 = t14Var2.r1;
                    g04 g04Var = t14Var2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(l04Var.x.b.id));
                    }
                    l04Var.a(true);
                    int i3 = 0;
                    while (true) {
                        if (i3 < g04Var.getChildCount()) {
                            if ((g04Var.getChildAt(i3) instanceof j04) && (R = RecyclerView.R((view2 = g04Var.getChildAt(i3)))) >= 0 && (i = d04Var.x.get(R)) >= 0 && i < arrayList3.size() && arrayList3.get(i) != null && l04Var.x != null && ((h04) arrayList3.get(i)).b.id == l04Var.x.b.id) {
                                num = Integer.valueOf(R);
                            } else {
                                i3++;
                            }
                        } else {
                            num = null;
                            view2 = null;
                        }
                    }
                    if (num != null) {
                        d04Var.E(num.intValue(), view2);
                    }
                    if (l04Var.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = l04Var.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet n0 = hq6.d0(i2).n0(tL_inputStickerSetID2, true);
                        if (n0 != null && n0.set != null) {
                            d dVar = t14Var2.Z1;
                            if (dVar == null) {
                                dVar = new hu0(l04Var, (byte) 5);
                            }
                            qx3.E0(dVar, n0, true, null, new li3(l04Var, (byte) 27));
                            return;
                        }
                        kk7.f(i2).b(l04Var, 64);
                        hq6 d0 = hq6.d0(i2);
                        l04Var.s = tL_inputStickerSetID2;
                        d0.n0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                t14 t14Var3 = l04Var.H;
                h04 h04Var3 = l04Var.x;
                if (h04Var3 != null && (stickerSet3 = h04Var3.b) != null) {
                    h04Var3.f = false;
                    ArrayList arrayList4 = t14Var3.q1;
                    int i4 = t14Var3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    l04Var.a(true);
                    yz3 yz3Var = t14Var3.J;
                    if (yz3Var != null) {
                        yz3Var.p(t14Var3.getEmojipacks());
                    }
                    t14Var3.V(t14Var3.R.H0());
                    if (l04Var.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = l04Var.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet n02 = hq6.d0(i4).n0(tL_inputStickerSetID3, true);
                        if (n02 != null && n02.set != null) {
                            d dVar2 = t14Var3.Z1;
                            if (dVar2 == null) {
                                dVar2 = new hu0(l04Var, (byte) 5);
                            }
                            d dVar3 = dVar2;
                            eu3 eu3Var = new eu3(l04Var, n02, (byte) 6);
                            Pattern pattern = qx3.P1;
                            if (dVar3.getFragmentView() != null) {
                                hq6.d0(dVar3.getCurrentAccount()).i2(dVar3.getFragmentView().getContext(), n02, null, 0, dVar3, null, true, true, eu3Var, false);
                                return;
                            }
                            return;
                        }
                        kk7.f(i4).b(l04Var, 64);
                        hq6 d02 = hq6.d0(i4);
                        l04Var.w = tL_inputStickerSetID3;
                        d02.n0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u04 u04Var = l04Var.H.u1;
                if (u04Var != null) {
                    u04Var.p();
                    return;
                }
                return;
            case 5:
                u04 u04Var2 = l04Var.H.u1;
                if (u04Var2 != null) {
                    u04Var2.p();
                    return;
                }
                return;
            default:
                u04 u04Var3 = l04Var.H.u1;
                if (u04Var3 != null) {
                    u04Var3.p();
                    return;
                }
                return;
        }
    }
}
