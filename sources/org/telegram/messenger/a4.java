package org.telegram.messenger;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;
public final class a4 implements j20 {
    public final int f14573a;
    public final Object f14574b;
    public final Object f14575c;

    public a4(int i10, Object obj, Object obj2) {
        this.f14573a = i10;
        this.f14574b = obj;
        this.f14575c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f14573a) {
            case 0:
                g4 g4Var = (g4) this.f14574b;
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.f14575c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    i0.g3(new e4(20, apVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    hs messagesStorage = g4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new hr(2, messagesStorage, arrayList3));
                    g4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                    g4Var.getMessagesController().V3(tl_chatThemes.users, false);
                    g4Var.getMessagesController().P3(tl_chatThemes.chats, false);
                    ArrayList<TLRPC.ChatTheme> arrayList4 = tl_chatThemes.themes;
                    int size = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.ChatTheme chatTheme = arrayList4.get(i10);
                        i10++;
                        TLRPC.ChatTheme chatTheme2 = chatTheme;
                        if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                            arrayList2.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size());
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(g4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList2.get(i11));
                        y3Var.p(0, null);
                        y3Var.p(1, null);
                        y3Var.n(0, null);
                        y3Var.n(1, null);
                        arrayList5.add(y3Var);
                    }
                    i0.g3(new cn(g4Var, tl_chatThemes, arrayList5, arrayList2, apVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    i0.g3(new e4(21, g4Var, apVar));
                    return;
                } else {
                    return;
                }
            case 1:
                final x9 x9Var = (x9) this.f14574b;
                final j20 j20Var = (j20) this.f14575c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = x9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    x9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    x9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f20021id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f20021id, Boolean.TRUE);
                    x9Var.j(tL_StarGiftAuctionState.gift.f20021id, new q20() {
                        @Override
                        public final void a(Object obj3) {
                            x9 x9Var2 = x9.this;
                            x9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            x9Var2.d(tL_StarGiftAuctionState2.gift.f20021id).f18271c = (ArrayList) obj3;
                            x9Var2.f(tL_StarGiftAuctionState2.gift.f20021id, tL_StarGiftAuctionState2);
                            j20Var.a(tL_StarGiftAuctionState2, tL_error2);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    x9Var.f(tL_StarGiftAuctionState.gift.f20021id, tL_StarGiftAuctionState);
                }
                j20Var.a(tL_StarGiftAuctionState, tL_error2);
                return;
            case 2:
                vp vpVar = (vp) this.f14574b;
                yh.c0 c0Var = (yh.c0) this.f14575c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    vpVar.P3(peerLinkRequests.chats, false);
                    vpVar.V3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i12);
                        i12++;
                        long j10 = -o5.o(communityPeerRequest.peer);
                        if (vpVar.M0(j10) == null) {
                            vpVar.T2(0, j10, true);
                        }
                    }
                    c0Var.a(peerLinkRequests, null);
                    return;
                }
                c0Var.a(null, tL_error3);
                return;
            case 3:
                vp vpVar2 = (vp) this.f14574b;
                vh.m6 m6Var = (vh.m6) this.f14575c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    vpVar2.P3(messages_chats.chats, false);
                    vpVar2.R7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                m6Var.a(arrayList);
                return;
            case 4:
                vp vpVar3 = (vp) this.f14574b;
                org.telegram.ui.Components.nr nrVar = (org.telegram.ui.Components.nr) this.f14575c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    vpVar3.P3(participantJoinedChats.chats, false);
                    vpVar3.V3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Long l4 = arrayList7.get(i13);
                        i13++;
                        long longValue = l4.longValue();
                        if (vpVar3.M0(longValue) == null) {
                            vpVar3.T2(0, longValue, true);
                        }
                    }
                }
                nrVar.a(participantJoinedChats, tL_error5);
                return;
            case 5:
                j20 j20Var2 = (j20) this.f14575c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.x1) this.f14574b).dismiss();
                if (tL_error6 != null) {
                    j20Var2.a(null, tL_error6.text);
                    return;
                } else {
                    j20Var2.a(passkey, null);
                    return;
                }
            default:
                w10 w10Var = (w10) this.f14575c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                a20 a20Var = ((z10) this.f14574b).f19474i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error7 == null) {
                    z10 = true;
                } else {
                    a20Var.getClass();
                    z10 = false;
                }
                w10Var.a(Boolean.valueOf(z10));
                a20Var.getClass();
                return;
        }
    }
}
