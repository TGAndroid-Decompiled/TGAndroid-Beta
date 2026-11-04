package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class d implements n10 {
    public final int f22110a;
    public final Object f22111b;

    public d(Object obj, int i3) {
        this.f22110a = i3;
        this.f22111b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Message> arrayList;
        String str;
        boolean z10;
        int i3;
        switch (this.f22110a) {
            case 0:
                e eVar = (e) this.f22111b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = eVar.f22272b;
                eVar.f22275f = -1;
                eVar.f22276g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    hp.s1(eVar.f22271a).Y3(tones.users, false);
                    arrayList2.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList2.addAll(tL_tones.tones);
                    eVar.f22273c = tL_tones.hash;
                    eVar.d();
                    eVar.c();
                    return;
                }
                return;
            case 1:
                d4 d4Var = (d4) this.f22111b;
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
                q9 q9Var = (q9) this.f22111b;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                q9Var.getClass();
                if (starGiftActiveAuctions != null && tL_error3 == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    int i10 = 0;
                    q9Var.getMessagesController().Y3(tL_starGiftActiveAuctions.users, false);
                    q9Var.getMessagesController().S3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    while (i10 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i10);
                        i10++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        q9Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    return;
                }
                return;
            case 3:
                li liVar = (li) this.f22111b;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    liVar.getMessagesController().Y3(tL_contacts_topPeers.users, false);
                    liVar.getMessagesController().S3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i11 = 0; i11 < tL_contacts_topPeers.categories.size(); i11++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i11);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            liVar.k1 = tL_topPeerCategoryPeers.peers;
                            liVar.getUserConfig().F = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            liVar.m1 = tL_topPeerCategoryPeers.peers;
                            liVar.getUserConfig().H = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            liVar.f24035l1 = tL_topPeerCategoryPeers.peers;
                            liVar.getUserConfig().G = currentTimeMillis;
                        } else {
                            liVar.f24032j1 = tL_topPeerCategoryPeers.peers;
                            long e10 = liVar.getUserConfig().e();
                            int i12 = 0;
                            while (true) {
                                if (i12 < liVar.f24032j1.size()) {
                                    if (((TLRPC.TL_topPeer) liVar.f24032j1.get(i12)).peer.user_id == e10) {
                                        liVar.f24032j1.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            liVar.getUserConfig().E = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    liVar.getUserConfig().v(false);
                    liVar.m();
                    liVar.getNotificationCenter().k(81, new Object[0]);
                    liVar.getNotificationCenter().k(82, new Object[0]);
                    liVar.getNotificationCenter().k(83, new Object[0]);
                    liVar.getNotificationCenter().k(84, new Object[0]);
                    liVar.getMessagesStorage().f24934a.c(new y4(27, liVar, tL_contacts_topPeers));
                    return;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    liVar.getUserConfig().W = false;
                    liVar.getUserConfig().f22855s = (int) (System.currentTimeMillis() / 1000);
                    liVar.getUserConfig().v(false);
                    liVar.F();
                    return;
                } else {
                    return;
                }
            case 4:
                q0.a aVar = (q0.a) this.f22111b;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                int i13 = 0;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
                    i13 = messages_messages.messages.get(0).f27022id;
                }
                g0.h3(new om(aVar, i13, 1));
                return;
            case 5:
                ji.a aVar2 = (ji.a) this.f22111b;
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
                w2 w2Var = (w2) this.f22111b;
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
                    if (tL_error6 != null && ((i3 = tL_error6.code) == -2000 || i3 == -2001)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    w2Var.a(bool2, null, 0L, Boolean.valueOf(z10));
                    return;
                }
            default:
                yy yyVar = (yy) this.f22111b;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    yyVar.getMessagesController().O3(updates3, false);
                    return;
                } else {
                    yyVar.getClass();
                    return;
                }
        }
    }
}
