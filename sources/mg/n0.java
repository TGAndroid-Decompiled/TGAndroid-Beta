package mg;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.z60;
import org.telegram.ui.un;
import org.telegram.ui.uy0;
public final class n0 implements Runnable {
    public final int f13190a = 0;
    public final long f13191b;
    public final long f13192c;
    public final Object d;
    public final Object e;
    public final Object f13193f;

    public n0(long j10, long j11, w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway) {
        this.d = w0Var;
        this.e = prepaidGiveaway;
        this.f13193f = tL_prepaidStarsGiveaway;
        this.f13191b = j10;
        this.f13192c = j11;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10 = this.f13190a;
        Object obj = this.f13193f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = k0.l(w0Var.f13268e2);
                int i11 = w0Var.f13265b2;
                int i12 = og.w.f14232w;
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w0Var.f13272i2.b(true);
                ArrayList arrayList = w0Var.U1;
                ArrayList arrayList2 = w0Var.W1;
                TLRPC.Chat chat = w0Var.T1;
                boolean z11 = w0Var.f13279p2;
                boolean z12 = w0Var.f13278o2;
                int i13 = prepaidGiveaway.quantity;
                String str = w0Var.f13277n2;
                s0 s0Var = new s0(this.f13191b, this.f13192c, w0Var, prepaidGiveaway, tL_prepaidStarsGiveaway);
                o0 o0Var = new o0(w0Var, 6);
                vp r12 = vp.r1(d20.f15147s0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.f15147s0);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i14 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i14 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i14 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = r12.i1(-chat.f19793id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj5 = arrayList.get(i16);
                        i16++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject).f19793id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i17 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i17 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i17 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = r12.i1(-chat.f19793id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj6 = arrayList2.get(i18);
                        i18++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size4) {
                        Object obj7 = arrayList.get(i19);
                        i19++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject2).f19793id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f20030id;
                tL_payments_launchPrepaidGiveaway.peer = r12.i1(-chat.f19793id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new ag.p0(o0Var, r12, s0Var, 5));
                return;
            default:
                ((z60) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f13191b);
                bundle.putLong("topic_id", this.f13192c);
                ((k2) obj2).presentFragment(new uy0(bundle, (p6) obj));
                return;
        }
    }

    public n0(z60 z60Var, long j10, long j11, un unVar, p6 p6Var) {
        this.d = z60Var;
        this.f13191b = j10;
        this.f13192c = j11;
        this.e = unVar;
        this.f13193f = p6Var;
    }
}
