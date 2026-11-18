package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
public final class d implements q10 {
    public final int f23452a;
    public final Object f23453b;

    public d(Object obj, int i7) {
        this.f23452a = i7;
        this.f23453b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Message> arrayList;
        String str;
        boolean z10;
        int i7;
        switch (this.f23452a) {
            case 0:
                e eVar = (e) this.f23453b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArrayList arrayList2 = eVar.f23614b;
                eVar.f23617f = -1;
                eVar.f23618g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    mp.u1(eVar.f23613a).f4(tones.users, false);
                    arrayList2.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList2.addAll(tL_tones.tones);
                    eVar.f23615c = tL_tones.hash;
                    eVar.d();
                    eVar.c();
                    return;
                }
                return;
            case 1:
                f4 f4Var = (f4) this.f23453b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    f4Var.getMessagesController().V3(updates, false);
                    return;
                } else {
                    f4Var.getClass();
                    return;
                }
            case 2:
                u9 u9Var = (u9) this.f23453b;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u9Var.getClass();
                if (starGiftActiveAuctions != null && tL_error3 == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    int i10 = 0;
                    u9Var.getMessagesController().f4(tL_starGiftActiveAuctions.users, false);
                    u9Var.getMessagesController().Z3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    while (i10 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i10);
                        i10++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        u9Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    return;
                }
                return;
            case 3:
                ri riVar = (ri) this.f23453b;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    riVar.getMessagesController().f4(tL_contacts_topPeers.users, false);
                    riVar.getMessagesController().Z3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i11 = 0; i11 < tL_contacts_topPeers.categories.size(); i11++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i11);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            riVar.f26624k1 = tL_topPeerCategoryPeers.peers;
                            riVar.getUserConfig().F = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            riVar.f26626m1 = tL_topPeerCategoryPeers.peers;
                            riVar.getUserConfig().H = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            riVar.l1 = tL_topPeerCategoryPeers.peers;
                            riVar.getUserConfig().G = currentTimeMillis;
                        } else {
                            riVar.f26622j1 = tL_topPeerCategoryPeers.peers;
                            long e10 = riVar.getUserConfig().e();
                            int i12 = 0;
                            while (true) {
                                if (i12 < riVar.f26622j1.size()) {
                                    if (((TLRPC.TL_topPeer) riVar.f26622j1.get(i12)).peer.user_id == e10) {
                                        riVar.f26622j1.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            riVar.getUserConfig().E = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    riVar.getUserConfig().v(false);
                    riVar.o();
                    riVar.getNotificationCenter().k(81, new Object[0]);
                    riVar.getNotificationCenter().k(82, new Object[0]);
                    riVar.getNotificationCenter().k(83, new Object[0]);
                    riVar.getNotificationCenter().k(84, new Object[0]);
                    riVar.getMessagesStorage().f27054a.c(new z4(27, riVar, tL_contacts_topPeers));
                    return;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    riVar.getUserConfig().W = false;
                    riVar.getUserConfig().f24799s = (int) (System.currentTimeMillis() / 1000);
                    riVar.getUserConfig().v(false);
                    riVar.H();
                    return;
                } else {
                    return;
                }
            case 4:
                q0.a aVar = (q0.a) this.f23453b;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                int i13 = 0;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
                    i13 = messages_messages.messages.get(0).f28426id;
                }
                g0.g3(new tm(aVar, i13, 1));
                return;
            case 5:
                li.a aVar2 = (li.a) this.f23453b;
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
                x2 x2Var = (x2) this.f23453b;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    x2Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    return;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Boolean bool = Boolean.TRUE;
                    x2Var.a(bool, null, 0L, bool);
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
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    x2Var.a(bool2, null, 0L, Boolean.valueOf(z10));
                    return;
                }
            default:
                zy zyVar = (zy) this.f23453b;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    zyVar.getMessagesController().V3(updates3, false);
                    return;
                } else {
                    zyVar.getClass();
                    return;
                }
        }
    }
}
