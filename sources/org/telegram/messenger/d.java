package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class d implements v10 {
    public final int f21929a;
    public final Object f21930b;

    public d(Object obj, int i7) {
        this.f21929a = i7;
        this.f21930b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Message> arrayList;
        String str;
        boolean z9;
        int i7;
        switch (this.f21929a) {
            case 0:
                e eVar = (e) this.f21930b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = eVar.f22124b;
                eVar.f22127f = -1;
                eVar.f22128g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    qp.s1(eVar.f22123a).Y3(tones.users, false);
                    arrayList2.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList2.addAll(tL_tones.tones);
                    eVar.f22125c = tL_tones.hash;
                    eVar.d();
                    eVar.c();
                    return;
                }
                return;
            case 1:
                d4 d4Var = (d4) this.f21930b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    d4Var.getMessagesController().O3(updates, false);
                    return;
                } else {
                    d4Var.getClass();
                    return;
                }
            case 2:
                w9 w9Var = (w9) this.f21930b;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                w9Var.getClass();
                if (starGiftActiveAuctions != null && tL_error3 == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    int i10 = 0;
                    w9Var.getMessagesController().Y3(tL_starGiftActiveAuctions.users, false);
                    w9Var.getMessagesController().S3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    while (i10 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i10);
                        i10++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        w9Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    return;
                }
                return;
            case 3:
                ui uiVar = (ui) this.f21930b;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    uiVar.getMessagesController().Y3(tL_contacts_topPeers.users, false);
                    uiVar.getMessagesController().S3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i11 = 0; i11 < tL_contacts_topPeers.categories.size(); i11++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i11);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            uiVar.f25812j1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().E = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            uiVar.l1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().G = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            uiVar.f25814k1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().F = currentTimeMillis;
                        } else {
                            uiVar.f25810i1 = tL_topPeerCategoryPeers.peers;
                            long e10 = uiVar.getUserConfig().e();
                            int i12 = 0;
                            while (true) {
                                if (i12 < uiVar.f25810i1.size()) {
                                    if (((TLRPC.TL_topPeer) uiVar.f25810i1.get(i12)).peer.user_id == e10) {
                                        uiVar.f25810i1.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            uiVar.getUserConfig().D = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    uiVar.getUserConfig().v(false);
                    uiVar.m();
                    uiVar.getNotificationCenter().k(81, new Object[0]);
                    uiVar.getNotificationCenter().k(82, new Object[0]);
                    uiVar.getNotificationCenter().k(83, new Object[0]);
                    uiVar.getNotificationCenter().k(84, new Object[0]);
                    uiVar.getMessagesStorage().f26688a.c(new y4(27, uiVar, tL_contacts_topPeers));
                    return;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    uiVar.getUserConfig().V = false;
                    uiVar.getUserConfig().f24485s = (int) (System.currentTimeMillis() / 1000);
                    uiVar.getUserConfig().v(false);
                    uiVar.F();
                    return;
                } else {
                    return;
                }
            case 4:
                q0.a aVar = (q0.a) this.f21930b;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                int i13 = 0;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
                    i13 = messages_messages.messages.get(0).f26973id;
                }
                g0.h3(new ym(aVar, i13, 1));
                return;
            case 5:
                ii.a aVar2 = (ii.a) this.f21930b;
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
                w2 w2Var = (w2) this.f21930b;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    w2Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    return;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Boolean bool = Boolean.TRUE;
                    w2Var.a(bool, null, 0L, bool);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("getting web settings error ");
                    if (tL_error6 != null) {
                        str = tL_error6.code + " " + tL_error6.text;
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    a8.d(sb2.toString());
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error6 != null && ((i7 = tL_error6.code) == -2000 || i7 == -2001)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    w2Var.a(bool2, null, 0L, Boolean.valueOf(z9));
                    return;
                }
            default:
                gz gzVar = (gz) this.f21930b;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    gzVar.getMessagesController().O3(updates3, false);
                    return;
                } else {
                    gzVar.getClass();
                    return;
                }
        }
    }
}
