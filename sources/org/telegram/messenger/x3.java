package org.telegram.messenger;

import android.util.LongSparseArray;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;
public final class x3 implements s10 {
    public final int f27459a;
    public final Object f27460b;
    public final Object f27461c;

    public x3(int i7, Object obj, Object obj2) {
        this.f27459a = i7;
        this.f27460b = obj;
        this.f27461c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z10;
        switch (this.f27459a) {
            case 0:
                d4 d4Var = (d4) this.f27460b;
                org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) this.f27461c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.h3(new b4(22, bpVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    vr messagesStorage = d4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new pq(5, messagesStorage, arrayList3));
                    d4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                    d4Var.getMessagesController().Y3(tl_chatThemes.users, false);
                    d4Var.getMessagesController().S3(tl_chatThemes.chats, false);
                    ArrayList<TLRPC.ChatTheme> arrayList4 = tl_chatThemes.themes;
                    int size = arrayList4.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.ChatTheme chatTheme = arrayList4.get(i7);
                        i7++;
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
                    g0.h3(new jn(d4Var, tl_chatThemes, arrayList5, arrayList2, bpVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.h3(new b4(23, d4Var, bpVar));
                    return;
                } else {
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f27461c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!((CancellationToken) this.f27460b).isCancellationRequested()) {
                    if (auth_authorization != null && tL_error2 == null) {
                        taskCompletionSource.trySetResult(auth_authorization);
                        return;
                    } else {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error2));
                        return;
                    }
                }
                return;
            case 2:
                final v9 v9Var = (v9) this.f27460b;
                final s10 s10Var = (s10) this.f27461c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = v9Var.f26952e;
                if (tL_StarGiftAuctionState != null) {
                    v9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    v9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f28280id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f28280id, Boolean.TRUE);
                    v9Var.j(tL_StarGiftAuctionState.gift.f28280id, new z10() {
                        @Override
                        public final void a(Object obj3) {
                            v9 v9Var2 = v9.this;
                            v9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            v9Var2.d(tL_StarGiftAuctionState2.gift.f28280id).f26430c = (ArrayList) obj3;
                            v9Var2.f(tL_StarGiftAuctionState2.gift.f28280id, tL_StarGiftAuctionState2);
                            s10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    v9Var.f(tL_StarGiftAuctionState.gift.f28280id, tL_StarGiftAuctionState);
                }
                s10Var.a(tL_StarGiftAuctionState, tL_error3);
                return;
            case 3:
                np npVar = (np) this.f27460b;
                li.i0 i0Var = (li.i0) this.f27461c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    npVar.S3(peerLinkRequests.chats, false);
                    npVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j3 = -m5.o(communityPeerRequest.peer);
                        if (npVar.N0(j3) == null) {
                            npVar.V2(0, j3, true);
                        }
                    }
                    i0Var.a(peerLinkRequests, null);
                    return;
                }
                i0Var.a(null, tL_error4);
                return;
            case 4:
                np npVar2 = (np) this.f27460b;
                hi.g7 g7Var = (hi.g7) this.f27461c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    npVar2.S3(messages_chats.chats, false);
                    npVar2.R7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                g7Var.a(arrayList);
                return;
            case 5:
                np npVar3 = (np) this.f27460b;
                org.telegram.ui.Components.kr krVar = (org.telegram.ui.Components.kr) this.f27461c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    npVar3.S3(participantJoinedChats.chats, false);
                    npVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (npVar3.N0(longValue) == null) {
                            npVar3.V2(0, longValue, true);
                        }
                    }
                }
                krVar.a(participantJoinedChats, tL_error6);
                return;
            case 6:
                s10 s10Var2 = (s10) this.f27461c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f27460b).dismiss();
                if (tL_error7 != null) {
                    s10Var2.a(null, tL_error7.text);
                    return;
                } else {
                    s10Var2.a(passkey, null);
                    return;
                }
            default:
                f10 f10Var = (f10) this.f27461c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                j10 j10Var = ((i10) this.f27460b).f24269i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error8 == null) {
                    z10 = true;
                } else {
                    j10Var.getClass();
                    z10 = false;
                }
                f10Var.a(Boolean.valueOf(z10));
                j10Var.getClass();
                return;
        }
    }
}
