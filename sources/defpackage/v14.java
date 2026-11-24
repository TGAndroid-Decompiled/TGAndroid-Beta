package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class v14 implements View.OnClickListener {
    public final byte a;
    public final w14 b;

    public v14(w14 w14Var, byte b) {
        this.a = b;
        this.b = w14Var;
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
        w14 w14Var = this.b;
        switch (b) {
            case 0:
                s14 s14Var = w14Var.x;
                if (s14Var != null && (stickerSet = s14Var.b) != null) {
                    e34 e34Var = w14Var.H;
                    if (!e34Var.w2) {
                        e34Var.w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new x04(e34Var, e34Var.Z1, e34Var.getContext(), e34Var.a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cj8 cj8Var = w14Var.r;
                TextView textView = w14Var.n;
                TextView textView2 = w14Var.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (cj8Var != null && cj8Var.getVisibility() == 0 && cj8Var.w.isEnabled()) {
                    cj8Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                e34 e34Var2 = w14Var.H;
                ArrayList arrayList2 = e34Var2.q1;
                s14 s14Var2 = w14Var.x;
                if (s14Var2 != null && (stickerSet2 = s14Var2.b) != null) {
                    s14Var2.f = true;
                    o14 o14Var = e34Var2.S;
                    int i2 = e34Var2.d1;
                    ArrayList arrayList3 = e34Var2.r1;
                    r14 r14Var = e34Var2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.id))) {
                        arrayList2.add(Long.valueOf(w14Var.x.b.id));
                    }
                    w14Var.a(true);
                    int i3 = 0;
                    while (true) {
                        if (i3 < r14Var.getChildCount()) {
                            if ((r14Var.getChildAt(i3) instanceof u14) && (R = RecyclerView.R((view2 = r14Var.getChildAt(i3)))) >= 0 && (i = o14Var.x.get(R)) >= 0 && i < arrayList3.size() && arrayList3.get(i) != null && w14Var.x != null && ((s14) arrayList3.get(i)).b.id == w14Var.x.b.id) {
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
                        o14Var.E(num.intValue(), view2);
                    }
                    if (w14Var.s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = w14Var.x.b;
                        tL_inputStickerSetID2.id = stickerSet4.id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(i2).n0(tL_inputStickerSetID2, true);
                        if (n0 != null && n0.set != null) {
                            d dVar = e34Var2.Z1;
                            if (dVar == null) {
                                dVar = new qv0(w14Var, (byte) 5);
                            }
                            az3.E0(dVar, n0, true, null, new a14(w14Var, (byte) 2));
                            return;
                        }
                        nm7.f(i2).b(w14Var, 65);
                        hs6 d0 = hs6.d0(i2);
                        w14Var.s = tL_inputStickerSetID2;
                        d0.n0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                e34 e34Var3 = w14Var.H;
                s14 s14Var3 = w14Var.x;
                if (s14Var3 != null && (stickerSet3 = s14Var3.b) != null) {
                    s14Var3.f = false;
                    ArrayList arrayList4 = e34Var3.q1;
                    int i4 = e34Var3.d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.id));
                    w14Var.a(true);
                    j14 j14Var = e34Var3.J;
                    if (j14Var != null) {
                        j14Var.p(e34Var3.getEmojipacks());
                    }
                    e34Var3.U(e34Var3.R.H0());
                    if (w14Var.w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = w14Var.x.b;
                        tL_inputStickerSetID3.id = stickerSet5.id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet n02 = hs6.d0(i4).n0(tL_inputStickerSetID3, true);
                        if (n02 != null && n02.set != null) {
                            d dVar2 = e34Var3.Z1;
                            if (dVar2 == null) {
                                dVar2 = new qv0(w14Var, (byte) 5);
                            }
                            d dVar3 = dVar2;
                            pv3 pv3Var = new pv3(w14Var, n02, (byte) 7);
                            Pattern pattern = az3.P1;
                            if (dVar3.getFragmentView() != null) {
                                hs6.d0(dVar3.getCurrentAccount()).i2(dVar3.getFragmentView().getContext(), n02, null, 0, dVar3, null, true, true, pv3Var, false);
                                return;
                            }
                            return;
                        }
                        nm7.f(i4).b(w14Var, 65);
                        hs6 d02 = hs6.d0(i4);
                        w14Var.w = tL_inputStickerSetID3;
                        d02.n0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                f24 f24Var = w14Var.H.u1;
                if (f24Var != null) {
                    f24Var.p();
                    return;
                }
                return;
            case 5:
                f24 f24Var2 = w14Var.H.u1;
                if (f24Var2 != null) {
                    f24Var2.p();
                    return;
                }
                return;
            default:
                f24 f24Var3 = w14Var.H.u1;
                if (f24Var3 != null) {
                    f24Var3.p();
                    return;
                }
                return;
        }
    }
}
