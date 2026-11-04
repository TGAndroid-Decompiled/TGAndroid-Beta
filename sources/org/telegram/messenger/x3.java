package org.telegram.messenger;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;
public final class x3 implements n10 {
    public final int f26340a;
    public final Object f26341b;
    public final Object f26342c;

    public x3(int i3, Object obj, Object obj2) {
        this.f26340a = i3;
        this.f26341b = obj;
        this.f26342c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f26340a) {
            case 0:
                d4 d4Var = (d4) this.f26341b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.f26342c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.h3(new b4(22, soVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    qr messagesStorage = d4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new pq(3, messagesStorage, arrayList3));
                    d4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                    d4Var.getMessagesController().Y3(tl_chatThemes.users, false);
                    d4Var.getMessagesController().S3(tl_chatThemes.chats, false);
                    ArrayList<TLRPC.ChatTheme> arrayList4 = tl_chatThemes.themes;
                    int size = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.ChatTheme chatTheme = arrayList4.get(i3);
                        i3++;
                        TLRPC.ChatTheme chatTheme2 = chatTheme;
                        if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                            arrayList2.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList2.size());
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList2.get(i10));
                        p3Var.p(0, null);
                        p3Var.p(1, null);
                        p3Var.n(0, null);
                        p3Var.n(1, null);
                        arrayList5.add(p3Var);
                    }
                    g0.h3(new cn(d4Var, tl_chatThemes, arrayList5, arrayList2, soVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.h3(new b4(23, d4Var, soVar));
                    return;
                } else {
                    return;
                }
            case 1:
                final q9 q9Var = (q9) this.f26341b;
                final n10 n10Var = (n10) this.f26342c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = q9Var.f24865e;
                if (tL_StarGiftAuctionState != null) {
                    q9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    q9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f27230id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f27230id, Boolean.TRUE);
                    q9Var.j(tL_StarGiftAuctionState.gift.f27230id, new u10() {
                        @Override
                        public final void a(Object obj3) {
                            q9 q9Var2 = q9.this;
                            q9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            q9Var2.d(tL_StarGiftAuctionState2.gift.f27230id).f24336c = (ArrayList) obj3;
                            q9Var2.f(tL_StarGiftAuctionState2.gift.f27230id, tL_StarGiftAuctionState2);
                            n10Var.a(tL_StarGiftAuctionState2, tL_error2);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    q9Var.f(tL_StarGiftAuctionState.gift.f27230id, tL_StarGiftAuctionState);
                }
                n10Var.a(tL_StarGiftAuctionState, tL_error2);
                return;
            case 2:
                hp hpVar = (hp) this.f26341b;
                ji.g0 g0Var = (ji.g0) this.f26342c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    hpVar.S3(peerLinkRequests.chats, false);
                    hpVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j10 = -m5.o(communityPeerRequest.peer);
                        if (hpVar.N0(j10) == null) {
                            hpVar.V2(0, j10, true);
                        }
                    }
                    g0Var.a(peerLinkRequests, null);
                    return;
                }
                g0Var.a(null, tL_error3);
                return;
            case 3:
                hp hpVar2 = (hp) this.f26341b;
                gi.j8 j8Var = (gi.j8) this.f26342c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    hpVar2.S3(messages_chats.chats, false);
                    hpVar2.Q7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                j8Var.a(arrayList);
                return;
            case 4:
                hp hpVar3 = (hp) this.f26341b;
                org.telegram.ui.Components.dr drVar = (org.telegram.ui.Components.dr) this.f26342c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    hpVar3.S3(participantJoinedChats.chats, false);
                    hpVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (hpVar3.N0(longValue) == null) {
                            hpVar3.V2(0, longValue, true);
                        }
                    }
                }
                drVar.a(participantJoinedChats, tL_error5);
                return;
            case 5:
                n10 n10Var2 = (n10) this.f26342c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.s1) this.f26341b).dismiss();
                if (tL_error6 != null) {
                    n10Var2.a(null, tL_error6.text);
                    return;
                } else {
                    n10Var2.a(passkey, null);
                    return;
                }
            default:
                a10 a10Var = (a10) this.f26342c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                e10 e10Var = ((d10) this.f26341b).f22126i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error7 == null) {
                    z10 = true;
                } else {
                    e10Var.getClass();
                    z10 = false;
                }
                a10Var.a(Boolean.valueOf(z10));
                e10Var.getClass();
                return;
        }
    }
}
