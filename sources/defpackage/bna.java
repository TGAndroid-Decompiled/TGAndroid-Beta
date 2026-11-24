package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.g0;
import org.telegram.ui.LaunchActivity;
public final class bna implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public bna(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        d Q;
        gb2[] cells;
        b1c b1cVar;
        long a;
        TLRPC.Chat chat;
        int i;
        zoc zocVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kna) obj).dismiss();
                return;
            case 1:
                ((loa) obj).run();
                return;
            case 2:
                ((loa) obj).run();
                return;
            case 3:
                aqa aqaVar = (aqa) obj;
                new ava(aqaVar.b, aqaVar.g).show();
                return;
            case 4:
                ((tqa) obj).dismiss();
                return;
            case 5:
                ((nta) obj).run();
                return;
            case 6:
                if (((yua) ((dr0) obj).d).e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.a = true;
                    Q.showAsSheet(new jva(), obj2);
                    return;
                }
                return;
            case 7:
                ((eya) obj).dismiss();
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new jh8(Q2, 14, false));
                    return;
                }
                return;
            case 8:
                ((zya) obj).b.getImageReceiver().w0(false);
                return;
            case 9:
                gl.d3((zz9) obj, 100L);
                return;
            case 10:
                rza rzaVar = (rza) obj;
                TextView textView = rzaVar.F;
                TextView textView2 = rzaVar.E;
                ah8 ah8Var = rzaVar.G;
                if (ah8Var.getVisibility() == 0 && ah8Var.w.isEnabled()) {
                    ah8Var.performClick();
                    return;
                } else if (textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else {
                    return;
                }
            case 11:
                c1b c1bVar = (c1b) obj;
                LongSparseArray longSparseArray = c1bVar.n;
                m84 m84Var = (m84) view.getParent();
                TLRPC.StickerSetCovered stickerSet = m84Var.getStickerSet();
                if (stickerSet != null && c1bVar.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (m84Var.r) {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        c1bVar.e.a.h(m84Var.getStickerSet());
                        return;
                    }
                    c1bVar.F(stickerSet, m84Var);
                    return;
                }
                return;
            case 12:
                ((m4b) obj).onBackPressed();
                return;
            case 13:
                w4b w4bVar = (w4b) obj;
                w4bVar.onClick(w4bVar.b);
                return;
            case 14:
                l5b l5bVar = (l5b) ((tv7) obj).h;
                if (l5bVar != null) {
                    l5bVar.run();
                    return;
                }
                return;
            case 15:
                v7b v7bVar = (v7b) obj;
                v7bVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new f8b(v7bVar, (byte) 0)).start();
                return;
            case 16:
                ((xdb) obj).dismiss();
                return;
            case 17:
                skb skbVar = (skb) obj;
                gba.D0 = !gba.D0;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("compactMode", gba.D0);
                edit.apply();
                bkb.j(false, false);
                skbVar.c.setChecked(gba.D0);
                tmb tmbVar = skbVar.a;
                for (gb2 gb2Var : tmbVar.getCells()) {
                    gb2Var.getMessageObject().S1 = false;
                    gb2Var.J1();
                    gb2Var.requestLayout();
                }
                tmbVar.invalidate();
                kk7.e().k(279, new Object[0]);
                return;
            case 18:
                e0 e0Var = ((g0) obj).b;
                e0Var.setText("");
                gl.E3(e0Var);
                return;
            case 19:
                ((jpb) obj).b(true);
                return;
            case 20:
                ((jpb) ((bn0) obj).c).b(true);
                return;
            case 21:
                zsb zsbVar = (zsb) obj;
                ArrayList arrayList = zsbVar.f;
                HashSet hashSet = zsbVar.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User V1 = zsbVar.getMessagesController().V1(Long.valueOf(zsbVar.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i2)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList2.get(i3);
                        zsbVar.getMessagesController().T3(chat2, false);
                        zsbVar.getMessagesController().b0(chat2.id, V1);
                    }
                    zsbVar.finishFragment();
                    return;
                }
                return;
            case 22:
                ((otb) obj).b.getImageReceiver().w0(false);
                return;
            case 23:
                ((rzb) obj).dismiss();
                return;
            case 24:
                mu1 mu1Var = ((mr1) obj).E;
                if (!mu1Var.getUserConfig().p() && ((chat = mu1Var.e) == null || !chat.autotranslation)) {
                    i = ((d) mu1Var).currentAccount;
                    na7.q1(i).W3.edit().putInt("dialog_show_translate_count" + mu1Var.a(), 14).commit();
                    mu1Var.showDialog(new jh8((d) mu1Var, 13, false));
                } else {
                    mu1Var.getMessagesController().i4.K(mu1Var.a(), !b1cVar.A(a));
                }
                mu1Var.nd(true);
                return;
            case 25:
                d01.v((Activity) obj, "https://fragment.com/", false);
                return;
            case 26:
                ((glc) obj).dismiss();
                return;
            case 27:
                lnc lncVar = (lnc) obj;
                if (!lncVar.y && lncVar.r && !lncVar.h.b()) {
                    lncVar.h.setProgress(0.0f);
                    lncVar.h.d();
                    return;
                }
                return;
            case 28:
                ((zoc) obj).b(!zocVar.E);
                return;
            default:
                lpc lpcVar = ((ppc) obj).c;
                lpcVar.requestFocus();
                gl.E3(lpcVar);
                return;
        }
    }
}
