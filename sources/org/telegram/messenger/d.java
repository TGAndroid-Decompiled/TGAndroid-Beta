package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class d implements k20 {
    public final int f15251a;
    public final Object f15252b;

    public d(Object obj, int i10) {
        this.f15251a = i10;
        this.f15252b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Message> arrayList;
        String str;
        boolean z10;
        int i10;
        switch (this.f15251a) {
            case 0:
                e eVar = (e) this.f15252b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = eVar.f15486b;
                eVar.f15488f = -1;
                eVar.f15489g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    wp.r1(eVar.f15485a).V3(tones.users, false);
                    arrayList2.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList2.addAll(tL_tones.tones);
                    eVar.f15487c = tL_tones.hash;
                    eVar.d();
                    eVar.c();
                    return;
                }
                return;
            case 1:
                g4 g4Var = (g4) this.f15252b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    g4Var.getMessagesController().L3(updates, false);
                    return;
                } else {
                    g4Var.getClass();
                    return;
                }
            case 2:
                y9 y9Var = (y9) this.f15252b;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                y9Var.getClass();
                if (starGiftActiveAuctions != null && tL_error3 == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    int i11 = 0;
                    y9Var.getMessagesController().V3(tL_starGiftActiveAuctions.users, false);
                    y9Var.getMessagesController().P3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    while (i11 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i11);
                        i11++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        y9Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) this.f15252b;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    viVar.getMessagesController().V3(tL_contacts_topPeers.users, false);
                    viVar.getMessagesController().P3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i12 = 0; i12 < tL_contacts_topPeers.categories.size(); i12++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i12);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            viVar.f18656j1 = tL_topPeerCategoryPeers.peers;
                            viVar.getUserConfig().E = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            viVar.l1 = tL_topPeerCategoryPeers.peers;
                            viVar.getUserConfig().G = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            viVar.f18658k1 = tL_topPeerCategoryPeers.peers;
                            viVar.getUserConfig().F = currentTimeMillis;
                        } else {
                            viVar.f18654i1 = tL_topPeerCategoryPeers.peers;
                            long e = viVar.getUserConfig().e();
                            int i13 = 0;
                            while (true) {
                                if (i13 < viVar.f18654i1.size()) {
                                    if (((TLRPC.TL_topPeer) viVar.f18654i1.get(i13)).peer.user_id == e) {
                                        viVar.f18654i1.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            viVar.getUserConfig().D = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    viVar.getUserConfig().v(false);
                    viVar.m();
                    viVar.getNotificationCenter().k(81, new Object[0]);
                    viVar.getNotificationCenter().k(82, new Object[0]);
                    viVar.getNotificationCenter().k(83, new Object[0]);
                    viVar.getNotificationCenter().k(84, new Object[0]);
                    viVar.getMessagesStorage().f16331a.c(new t6(25, viVar, tL_contacts_topPeers));
                    return;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    viVar.getUserConfig().V = false;
                    viVar.getUserConfig().f15531s = (int) (System.currentTimeMillis() / 1000);
                    viVar.getUserConfig().v(false);
                    viVar.F();
                    return;
                } else {
                    return;
                }
            case 4:
                q0.a aVar = (q0.a) this.f15252b;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                int i14 = 0;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
                    i14 = messages_messages.messages.get(0).f19815id;
                }
                i0.g3(new jn(aVar, i14, 1));
                return;
            case 5:
                yh.a aVar2 = (yh.a) this.f15252b;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (tL_error5 != null) {
                    aVar2.a(null, tL_error5);
                    return;
                } else {
                    aVar2.a(new TLRPC.TL_boolTrue(), null);
                    return;
                }
            case 6:
                a3 a3Var = (a3) this.f15252b;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    a3Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    return;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("getting web settings error ");
                    if (tL_error6 != null) {
                        str = tL_error6.code + " " + tL_error6.text;
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    f8.d(sb2.toString());
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error6 != null && ((i10 = tL_error6.code) == -2000 || i10 == -2001)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    a3Var.a(bool2, null, 0L, Boolean.valueOf(z10));
                    return;
                }
            default:
                rz rzVar = (rz) this.f15252b;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    rzVar.getMessagesController().L3(updates3, false);
                    return;
                } else {
                    rzVar.getClass();
                    return;
                }
        }
    }
}
