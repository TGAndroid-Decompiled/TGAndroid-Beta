package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class f14 implements View.OnClickListener {
    public final byte a;
    public final g14 b;

    public f14(g14 g14Var, byte b) {
        this.a = b;
        this.b = g14Var;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int S;
        int i;
        TLRPC.StickerSet stickerSet3;
        byte b = this.a;
        g14 g14Var = this.b;
        switch (b) {
            case 0:
                c14 c14Var = g14Var.x;
                if (c14Var != null && (stickerSet = c14Var.b) != null) {
                    o24 o24Var = g14Var.H;
                    if (!o24Var.w2) {
                        o24Var.w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new i04(o24Var, o24Var.Z1, o24Var.getContext(), o24Var.a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ok8 ok8Var = g14Var.r;
                TextView textView = g14Var.n;
                TextView textView2 = g14Var.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (ok8Var != null && ok8Var.getVisibility() == 0 && ok8Var.w.isEnabled()) {
                    ok8Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                o24 o24Var2 = g14Var.H;
                ArrayList arrayList2 = o24Var2.q1;
                c14 c14Var2 = g14Var.x;
                if (c14Var2 != null && (stickerSet2 = c14Var2.b) != null) {
                    c14Var2.f = true;
                    y04 y04Var = o24Var2.S;
                    int i2 = o24Var2.d1;
                    ArrayList arrayList3 = o24Var2.r1;
                    b14 b14Var = o24Var2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(g14Var.x.b.id));
                    }
                    g14Var.a(true);
                    int i3 = 0;
                    while (true) {
                        if (i3 < b14Var.getChildCount()) {
                            if ((b14Var.getChildAt(i3) instanceof e14) && (S = RecyclerView.S((view2 = b14Var.getChildAt(i3)))) >= 0 && (i = y04Var.x.get(S)) >= 0 && i < arrayList3.size() && arrayList3.get(i) != null && g14Var.x != null && ((c14) arrayList3.get(i)).b.id == g14Var.x.b.id) {
                                num = Integer.valueOf(S);
                            } else {
                                i3++;
                            }
                        } else {
                            num = null;
                            view2 = null;
                        }
                    }
                    if (num != null) {
                        y04Var.E(num.intValue(), view2);
                    }
                    if (g14Var.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = g14Var.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet n0 = ls6.d0(i2).n0(tL_inputStickerSetID2, true);
                        if (n0 != null && n0.set != null) {
                            e eVar = o24Var2.Z1;
                            if (eVar == null) {
                                eVar = new qu0(g14Var, (byte) 5);
                            }
                            ly3.F0(eVar, n0, true, null, new lw3(g14Var, (byte) 6));
                            return;
                        }
                        jn7.f(i2).b(g14Var, 65);
                        ls6 d0 = ls6.d0(i2);
                        g14Var.s = tL_inputStickerSetID2;
                        d0.n0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                o24 o24Var3 = g14Var.H;
                c14 c14Var3 = g14Var.x;
                if (c14Var3 != null && (stickerSet3 = c14Var3.b) != null) {
                    c14Var3.f = false;
                    ArrayList arrayList4 = o24Var3.q1;
                    int i4 = o24Var3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    g14Var.a(true);
                    t04 t04Var = o24Var3.J;
                    if (t04Var != null) {
                        t04Var.p(o24Var3.getEmojipacks());
                    }
                    o24Var3.U(o24Var3.R.H0());
                    if (g14Var.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = g14Var.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet n02 = ls6.d0(i4).n0(tL_inputStickerSetID3, true);
                        if (n02 != null && n02.set != null) {
                            e eVar2 = o24Var3.Z1;
                            if (eVar2 == null) {
                                eVar2 = new qu0(g14Var, (byte) 5);
                            }
                            e eVar3 = eVar2;
                            vx3 vx3Var = new vx3(g14Var, n02, (byte) 3);
                            Pattern pattern = ly3.P1;
                            if (eVar3.getFragmentView() != null) {
                                ls6.d0(eVar3.getCurrentAccount()).i2(eVar3.getFragmentView().getContext(), n02, null, 0, eVar3, null, true, true, vx3Var, false);
                                return;
                            }
                            return;
                        }
                        jn7.f(i4).b(g14Var, 65);
                        ls6 d02 = ls6.d0(i4);
                        g14Var.w = tL_inputStickerSetID3;
                        d02.n0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                p14 p14Var = g14Var.H.u1;
                if (p14Var != null) {
                    p14Var.p();
                    return;
                }
                return;
            case 5:
                p14 p14Var2 = g14Var.H.u1;
                if (p14Var2 != null) {
                    p14Var2.p();
                    return;
                }
                return;
            default:
                p14 p14Var3 = g14Var.H.u1;
                if (p14Var3 != null) {
                    p14Var3.p();
                    return;
                }
                return;
        }
    }
}
