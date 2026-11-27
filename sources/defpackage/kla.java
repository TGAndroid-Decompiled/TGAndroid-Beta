package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.g0;
import org.telegram.ui.LaunchActivity;
public final class kla implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public kla(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        e Q;
        wb2[] cells;
        a5c a5cVar;
        long a;
        TLRPC.Chat chat;
        int i;
        ltc ltcVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nla nlaVar = (nla) obj;
                if (!nlaVar.y.f) {
                    if (nlaVar.x.f) {
                        jla jlaVar = nlaVar.a;
                        boolean z = nlaVar.b;
                        d6 d6Var = jlaVar.f0;
                        if (d6Var != null) {
                            d6Var.b(z ? 1 : 0);
                            return;
                        }
                        return;
                    } else if (nlaVar.c == mla.b) {
                        hl.A3(4.0f, nlaVar, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ((gra) obj).dismiss();
                return;
            case 2:
                ((nsa) obj).run();
                return;
            case 3:
                ((nsa) obj).run();
                return;
            case 4:
                bua buaVar = (bua) obj;
                new eza(buaVar.b, buaVar.g).show();
                return;
            case 5:
                ((uua) obj).dismiss();
                return;
            case 6:
                ((qxa) obj).run();
                return;
            case 7:
                if (((cza) ((dr0) obj).d).e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.a = true;
                    Q.showAsSheet(new nza(), obj2);
                    return;
                }
                return;
            case 8:
                ((g2b) obj).dismiss();
                e Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new xk8(Q2, 14, false));
                    return;
                }
                return;
            case 9:
                ((z2b) obj).b.getImageReceiver().w0(false);
                return;
            case 10:
                hl.d3((ux9) obj, 100L);
                return;
            case 11:
                p3b p3bVar = (p3b) obj;
                TextView textView = p3bVar.F;
                TextView textView2 = p3bVar.E;
                ok8 ok8Var = p3bVar.G;
                if (ok8Var.getVisibility() == 0 && ok8Var.w.isEnabled()) {
                    ok8Var.performClick();
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
            case 12:
                z4b z4bVar = (z4b) obj;
                LongSparseArray longSparseArray = z4bVar.n;
                h94 h94Var = (h94) view.getParent();
                TLRPC.StickerSetCovered stickerSet = h94Var.getStickerSet();
                if (stickerSet != null && z4bVar.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (h94Var.r) {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        z4bVar.e.a.h(h94Var.getStickerSet());
                        return;
                    }
                    z4bVar.F(stickerSet, h94Var);
                    return;
                }
                return;
            case 13:
                ((k8b) obj).onBackPressed();
                return;
            case 14:
                v8b v8bVar = (v8b) obj;
                v8bVar.onClick(v8bVar.b);
                return;
            case 15:
                i9b i9bVar = (i9b) ((az7) obj).h;
                if (i9bVar != null) {
                    i9bVar.run();
                    return;
                }
                return;
            case 16:
                tbb tbbVar = (tbb) obj;
                tbbVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new ecb(tbbVar, (byte) 0)).start();
                return;
            case 17:
                ((shb) obj).dismiss();
                return;
            case 18:
                rob robVar = (rob) obj;
                xea.D0 = !xea.D0;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("compactMode", xea.D0);
                edit.apply();
                aob.j(false, false);
                robVar.c.setChecked(xea.D0);
                sqb sqbVar = robVar.a;
                for (wb2 wb2Var : sqbVar.getCells()) {
                    wb2Var.getMessageObject().S1 = false;
                    wb2Var.J1();
                    wb2Var.requestLayout();
                }
                sqbVar.invalidate();
                jn7.e().k(280, new Object[0]);
                return;
            case 19:
                e0 e0Var = ((g0) obj).b;
                e0Var.setText("");
                hl.E3(e0Var);
                return;
            case 20:
                ((ktb) obj).b(true);
                return;
            case 21:
                ((ktb) ((bn0) obj).c).b(true);
                return;
            case 22:
                axb axbVar = (axb) obj;
                ArrayList arrayList = axbVar.f;
                HashSet hashSet = axbVar.x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User X1 = axbVar.getMessagesController().X1(Long.valueOf(axbVar.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i2)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) arrayList2.get(i3);
                        axbVar.getMessagesController().a4(chat2, false);
                        axbVar.getMessagesController().d0(chat2.id, X1);
                    }
                    axbVar.finishFragment();
                    return;
                }
                return;
            case 23:
                ((pxb) obj).b.getImageReceiver().w0(false);
                return;
            case 24:
                ((r3c) obj).dismiss();
                return;
            case 25:
                zu1 zu1Var = ((as1) obj).E;
                if (!zu1Var.getUserConfig().p() && ((chat = zu1Var.e) == null || !chat.autotranslation)) {
                    i = ((e) zu1Var).currentAccount;
                    uc7.s1(i).W3.edit().putInt("dialog_show_translate_count" + zu1Var.a(), 14).commit();
                    zu1Var.showDialog(new xk8((e) zu1Var, 13, false));
                } else {
                    zu1Var.getMessagesController().i4.K(zu1Var.a(), !a5cVar.A(a));
                }
                zu1Var.zd(true);
                return;
            case 26:
                m01.w((Activity) obj, "https://fragment.com/", false);
                return;
            case 27:
                ((tpc) obj).dismiss();
                return;
            case 28:
                yrc yrcVar = (yrc) obj;
                if (!yrcVar.y && yrcVar.r && !yrcVar.h.b()) {
                    yrcVar.h.setProgress(0.0f);
                    yrcVar.h.d();
                    return;
                }
                return;
            default:
                ((ltc) obj).b(!ltcVar.E);
                return;
        }
    }
}
