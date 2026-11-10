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
public final class x3 implements v10 {
    public final int f26442a;
    public final Object f26443b;
    public final Object f26444c;

    public x3(int i7, Object obj, Object obj2) {
        this.f26442a = i7;
        this.f26443b = obj;
        this.f26444c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        boolean z9;
        switch (this.f26442a) {
            case 0:
                d4 d4Var = (d4) this.f26443b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.f26444c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.h3(new b4(22, soVar, tL_error));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                if (chatThemes instanceof TL_account.Tl_chatThemes) {
                    TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                    yr messagesStorage = d4Var.getMessagesStorage();
                    ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                    messagesStorage.getClass();
                    messagesStorage.I(new zq(3, messagesStorage, arrayList3));
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
                        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(d4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList2.get(i10));
                        s3Var.p(0, null);
                        s3Var.p(1, null);
                        s3Var.n(0, null);
                        s3Var.n(1, null);
                        arrayList5.add(s3Var);
                    }
                    g0.h3(new mn(d4Var, tl_chatThemes, arrayList5, arrayList2, soVar, 1));
                    return;
                } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                    g0.h3(new b4(23, d4Var, soVar));
                    return;
                } else {
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f26444c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!((CancellationToken) this.f26443b).isCancellationRequested()) {
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
                final w9 w9Var = (w9) this.f26443b;
                final v10 v10Var = (v10) this.f26444c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = w9Var.f26284e;
                if (tL_StarGiftAuctionState != null) {
                    w9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    w9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.f27189id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.f27189id, Boolean.TRUE);
                    w9Var.j(tL_StarGiftAuctionState.gift.f27189id, new c20() {
                        @Override
                        public final void a(Object obj3) {
                            w9 w9Var2 = w9.this;
                            w9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            w9Var2.d(tL_StarGiftAuctionState2.gift.f27189id).f25603c = (ArrayList) obj3;
                            w9Var2.f(tL_StarGiftAuctionState2.gift.f27189id, tL_StarGiftAuctionState2);
                            v10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    return;
                }
                if (tL_StarGiftAuctionState != null) {
                    w9Var.f(tL_StarGiftAuctionState.gift.f27189id, tL_StarGiftAuctionState);
                }
                v10Var.a(tL_StarGiftAuctionState, tL_error3);
                return;
            case 3:
                qp qpVar = (qp) this.f26443b;
                ii.j0 j0Var = (ii.j0) this.f26444c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    qpVar.S3(peerLinkRequests.chats, false);
                    qpVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList6 = peerLinkRequests.requests;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList6.get(i11);
                        i11++;
                        long j3 = -m5.o(communityPeerRequest.peer);
                        if (qpVar.N0(j3) == null) {
                            qpVar.V2(0, j3, true);
                        }
                    }
                    j0Var.a(peerLinkRequests, null);
                    return;
                }
                j0Var.a(null, tL_error4);
                return;
            case 4:
                qp qpVar2 = (qp) this.f26443b;
                ii.c cVar = (ii.c) this.f26444c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    qpVar2.S3(messages_chats.chats, false);
                    qpVar2.Q7 = messages_chats.chats;
                }
                if (messages_chats != null) {
                    arrayList = messages_chats.chats;
                } else {
                    arrayList = null;
                }
                cVar.a(arrayList);
                return;
            case 5:
                qp qpVar3 = (qp) this.f26443b;
                org.telegram.ui.Components.cr crVar = (org.telegram.ui.Components.cr) this.f26444c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    qpVar3.S3(participantJoinedChats.chats, false);
                    qpVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList7 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList7.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (qpVar3.N0(longValue) == null) {
                            qpVar3.V2(0, longValue, true);
                        }
                    }
                }
                crVar.a(participantJoinedChats, tL_error6);
                return;
            case 6:
                v10 v10Var2 = (v10) this.f26444c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f26443b).dismiss();
                if (tL_error7 != null) {
                    v10Var2.a(null, tL_error7.text);
                    return;
                } else {
                    v10Var2.a(passkey, null);
                    return;
                }
            default:
                i10 i10Var = (i10) this.f26444c;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                m10 m10Var = ((l10) this.f26443b).f23836i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error8 == null) {
                    z9 = true;
                } else {
                    m10Var.getClass();
                    z9 = false;
                }
                i10Var.a(Boolean.valueOf(z9));
                m10Var.getClass();
                return;
        }
    }
}
