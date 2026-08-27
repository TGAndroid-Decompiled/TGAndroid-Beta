package jh;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lh.s9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ce;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dj;
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.fp;
import org.telegram.ui.gy;
import org.telegram.ui.hb;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.jp;
import org.telegram.ui.ko;
import org.telegram.ui.mb;
import org.telegram.ui.mf1;
import org.telegram.ui.pn;
import org.telegram.ui.qb;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.xh;
import org.telegram.ui.xo;
import org.telegram.ui.zx;

public final class z1 implements lh.u8, org.telegram.ui.ActionBar.a2, z8.d, qk0, rk0, org.telegram.ui.Cells.v, zx, org.telegram.ui.v4, org.telegram.ui.Components.x4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, fj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, mf1 {

    public final int f14181a;

    public final Object f14182b;

    public final Object f14183c;

    public z1(int i10, Object obj, Object obj2) {
        this.f14181a = i10;
        this.f14182b = obj;
        this.f14183c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f14181a) {
            case 14:
                rn rnVar = (rn) this.f14182b;
                Uri uri = (Uri) this.f14183c;
                rnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(rnVar.getAccountInstance(), null, uri, rnVar.P5, rnVar.f42095j5, rnVar.T3, rnVar.f42069h5, null, null, null, null, 0, rnVar.f42119l5, z10, i10, rnVar.N3, rnVar.C8());
                break;
            case 15:
            default:
                dn dnVar = (dn) this.f14182b;
                MessageObject messageObject = (MessageObject) this.f14183c;
                if (!z10) {
                    dnVar.getClass();
                } else {
                    dnVar.f37446a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22401id, i10);
                }
                break;
            case 16:
                rn rnVar2 = (rn) this.f14182b;
                rnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f14183c, rnVar2.P5, rnVar2.f42095j5, rnVar2.T3, null, false, null, null, null, z10, i10, 0, null, false));
                rnVar2.U.setFieldText("");
                rnVar2.e9(false);
                break;
        }
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        return nh.s3.B0((nh.s3) this.f14182b, (Context) this.f14183c, view, i10);
    }

    @Override
    public void b(org.telegram.ui.d5 d5Var) {
        hb hbVar = (hb) this.f14182b;
        TLRPC.User user = (TLRPC.User) this.f14183c;
        int iOrdinal = d5Var.ordinal();
        if (iOrdinal == 0) {
            hbVar.a(user);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        mb mbVar = hbVar.f38769a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            org.telegram.ui.ActionBar.n2 n2Var = mbVar.f40428n;
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                n2Var.presentFragment(new rn(bundle));
            }
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i11 = i10;
        switch (this.f14181a) {
            case 4:
                lh.k9 k9Var = (lh.k9) this.f14182b;
                Context context = (Context) this.f14183c;
                ArrayList arrayList2 = k9Var.H;
                a0.h hVar = k9Var.f16250b;
                lh.c9 c9Var = k9Var.f16258x;
                ArrayList arrayList3 = k9Var.f16251c;
                HashMap map = k9Var.d;
                lh.q9 q9Var = k9Var.S;
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    lh.x8 x8Var = (lh.x8) arrayList2.get(i11);
                    int i12 = x8Var.f49413a;
                    int i13 = 0;
                    if (i12 == 3) {
                        if (x8Var.f17047n && q9Var.B) {
                            new lh.s8(context, ((org.telegram.ui.ActionBar.e3) q9Var).currentAccount, q9Var.G, q9Var.f16594c, new lh.a9(k9Var, 0), ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider).show();
                        } else {
                            int i14 = x8Var.f17042i;
                            if (i14 == 1) {
                                if (q9Var.J == 1 || lh.q9.J0(q9Var).isEmpty()) {
                                    q9Var.I = 1;
                                    q9Var.f16593b.D(1);
                                }
                                q9Var.J = 1;
                                k9Var.f(true);
                            } else if (i14 == 3) {
                                if (q9Var.J == 3 || (q9Var.f16597n.isEmpty() && q9Var.f16598r.isEmpty())) {
                                    q9Var.I = 3;
                                    q9Var.f16593b.D(1);
                                }
                                q9Var.J = 3;
                                k9Var.f(true);
                            } else if (i14 == 2) {
                                if (q9Var.J == 2) {
                                    q9Var.I = 2;
                                    q9Var.f16593b.D(1);
                                }
                                q9Var.J = 2;
                                k9Var.f(true);
                            } else if (i14 != 4) {
                                if (i14 > 0) {
                                    arrayList3.clear();
                                    map.clear();
                                    q9Var.J = x8Var.f17042i;
                                    c9Var.f16442c.a();
                                } else {
                                    TLRPC.Chat chat = x8Var.h;
                                    if (chat != null) {
                                        long j10 = chat.f22380id;
                                        if (lh.q9.d1(q9Var, chat) > 200) {
                                            try {
                                                k9Var.performHapticFeedback(3, 1);
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k9Var.getContext(), 0, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
                                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.GroupTooLarge);
                                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GroupTooLargeMessage);
                                            i0.a.C(R.string.OK, alertDialog$Builder, null);
                                        } else if (map.containsKey(Long.valueOf(j10))) {
                                            ArrayList arrayList4 = (ArrayList) map.get(Long.valueOf(j10));
                                            if (arrayList4 != null) {
                                                int size = arrayList4.size();
                                                while (i13 < size) {
                                                    Object obj = arrayList4.get(i13);
                                                    i13++;
                                                    hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                                }
                                            }
                                            map.remove(Long.valueOf(j10));
                                            k9Var.i(true);
                                        } else {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getChat(Long.valueOf(j10));
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getChatFull(j10);
                                            if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                org.telegram.ui.ActionBar.b2 b2Var = k9Var.C;
                                                if (b2Var != null) {
                                                    b2Var.dismiss();
                                                    k9Var.C = null;
                                                }
                                                k9Var.D = j10;
                                                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(k9Var.getContext(), 3, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
                                                k9Var.C = b2Var2;
                                                b2Var2.q(50L);
                                                MessagesStorage messagesStorage = MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount);
                                                messagesStorage.getStorageQueue().postRunnable(new hh.e2(k9Var, chat2, messagesStorage, j10, 12));
                                            } else {
                                                k9Var.d(j10, chatFull.participants);
                                            }
                                            if (!TextUtils.isEmpty(k9Var.E)) {
                                                c9Var.setText("");
                                                k9Var.E = null;
                                                k9Var.g(false);
                                            }
                                        }
                                    } else {
                                        TLRPC.User user = x8Var.f17041g;
                                        if (user != null) {
                                            if (k9Var.f16249a == 0) {
                                                q9Var.J = 0;
                                            }
                                            long j11 = user.f22527id;
                                            HashSet hashSet = new HashSet(arrayList3);
                                            if (arrayList3.contains(Long.valueOf(j11))) {
                                                Iterator it = map.entrySet().iterator();
                                                while (it.hasNext()) {
                                                    Map.Entry entry = (Map.Entry) it.next();
                                                    if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                        it.remove();
                                                        hashSet.addAll((Collection) entry.getValue());
                                                    }
                                                }
                                                hashSet.remove(Long.valueOf(j11));
                                                hVar.k(Boolean.FALSE, j11);
                                            } else {
                                                Iterator it2 = map.entrySet().iterator();
                                                while (it2.hasNext()) {
                                                    Map.Entry entry2 = (Map.Entry) it2.next();
                                                    if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                        it2.remove();
                                                        hashSet.addAll((Collection) entry2.getValue());
                                                    }
                                                }
                                                hashSet.add(Long.valueOf(j11));
                                                if (!TextUtils.isEmpty(k9Var.E)) {
                                                    c9Var.setText("");
                                                    k9Var.E = null;
                                                    k9Var.g(false);
                                                }
                                                hVar.k(Boolean.TRUE, j11);
                                            }
                                            arrayList3.clear();
                                            arrayList3.addAll(hashSet);
                                            k9Var.i(true);
                                        }
                                    }
                                }
                                k9Var.f(true);
                                k9Var.e(true);
                                c9Var.G = true;
                            } else {
                                if (q9Var.J == 4) {
                                    q9Var.I = 4;
                                    q9Var.f16593b.D(1);
                                }
                                q9Var.J = 4;
                                k9Var.f(true);
                            }
                        }
                        break;
                    } else if (i12 != 7) {
                        if (i12 == 9) {
                            int i15 = x8Var.f17050q;
                            if (i15 == 0) {
                                s9 s9Var = q9Var.Y;
                                if (s9Var != null) {
                                    s9Var.run();
                                }
                            } else if (i15 == 1) {
                                TLRPC.InputPeer inputPeer = q9Var.f16594c;
                                long peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).getClientUserId();
                                b70 b70VarF = b70.F(k9Var, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider, view);
                                b70VarF.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new cg.b2(k9Var, peerDialogId, 9), false);
                                b70VarF.k();
                                b70.f(b70VarF, q9Var.i1().B(peerDialogId, true), q9Var.v, false, null, new gh.d1(13, k9Var, b70VarF));
                                b70VarF.Z();
                            } else if (i15 == 5) {
                                org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(k9Var.getContext(), 3, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider);
                                b2Var3.q(500L);
                                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                getgroupcallstreamrtmpurl.live_story = true;
                                TLRPC.InputPeer tL_inputPeerSelf = q9Var.f16594c;
                                if (tL_inputPeerSelf == null) {
                                    tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                                }
                                getgroupcallstreamrtmpurl.peer = tL_inputPeerSelf;
                                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).sendRequest(getgroupcallstreamrtmpurl, new cg.y(k9Var, b2Var3, getgroupcallstreamrtmpurl, 12));
                            } else if (i15 == 6) {
                                q9Var.C = false;
                                k9Var.g(true);
                            }
                        }
                        break;
                    } else if (view instanceof org.telegram.ui.Cells.l8) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                        l8Var.setChecked(!l8Var.b());
                        x8Var.f17044k = l8Var.b();
                        int i16 = x8Var.f17038c;
                        if (i16 == 0) {
                            boolean zB = l8Var.b();
                            q9Var.f16601x = zB;
                            boolean z10 = q9Var.J == 4;
                            if (!zB) {
                                ec ecVarG = new mc(q9Var.container, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider).G(R.raw.passcode_lock_close, 4, LocaleController.getString(z10 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                ecVarG.f28020j = 5000;
                                ecVarG.k(true);
                            } else {
                                ec ecVarG2 = new mc(q9Var.container, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(z10 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                ecVarG2.f28020j = 5000;
                                ecVarG2.k(true);
                            }
                        } else if (i16 == 1) {
                            boolean zB2 = l8Var.b();
                            q9Var.f16602y = zB2;
                            boolean z11 = q9Var.f16594c instanceof TLRPC.TL_inputPeerChannel;
                            if (zB2) {
                                ec ecVarG3 = new mc(q9Var.container, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider).G(R.raw.msg_story_keep, 4, LocaleController.getString(z11 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                ecVarG3.f28020j = 5000;
                                ecVarG3.k(true);
                            } else {
                                ec ecVarG4 = new mc(q9Var.container, ((org.telegram.ui.ActionBar.e3) q9Var).resourcesProvider).G(R.raw.fire_on, 4, LocaleController.getString(z11 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                ecVarG4.f28020j = 5000;
                                ecVarG4.k(true);
                            }
                            k9Var.g(true);
                        } else if (i16 == 2) {
                            q9Var.f16600w = l8Var.b();
                            k9Var.g(true);
                        }
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f14182b;
                org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) this.f14183c;
                if (m4Var.G == null || (i11 = i11 - 1) >= 0) {
                    org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
                    if (j9Var != null) {
                        if (j9Var.y()) {
                            m4Var.K0.f(false);
                        } else {
                            m4Var.K0.f(false);
                        }
                    }
                    org.telegram.ui.k4 adapter = q3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.t3) && adapter.A != null) {
                        org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) view;
                        if (m4Var.C0 == 0) {
                            if ((!t3Var.f42769c || f10 >= view.getMeasuredWidth() / 2) && !t3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(m4Var.T).getUserOrChat("previews");
                                if (!(userOrChat instanceof TLRPC.TL_user)) {
                                    int i17 = UserConfig.selectedAccount;
                                    long j12 = adapter.A.f22533id;
                                    m4Var.b0(true);
                                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                    tL_contacts_resolveUsername.username = "previews";
                                    m4Var.C0 = ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new ce(m4Var, i17, j12));
                                } else {
                                    m4Var.P(adapter.A.f22533id, (TLRPC.User) userOrChat);
                                }
                            }
                        }
                        break;
                    } else if (i11 >= 0 && i11 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i11);
                        TL_iv.PageBlock pageBlockZ = org.telegram.ui.m4.z(pageBlock);
                        if (pageBlockZ instanceof org.telegram.ui.a4) {
                            pageBlockZ = ((org.telegram.ui.a4) pageBlockZ).f36370b;
                        }
                        if (pageBlockZ instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(m4Var.T).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) pageBlockZ).channel), m4Var.I, 2);
                            m4Var.o(false, true);
                            break;
                        } else if (pageBlockZ instanceof org.telegram.ui.g4) {
                            org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) pageBlockZ;
                            m4Var.Q(g4Var.f38307a.articles.get(g4Var.f38308b).url, null, null);
                            break;
                        } else if (pageBlockZ instanceof TL_iv.pageBlockDetails) {
                            View viewY = org.telegram.ui.m4.y(view);
                            if (viewY instanceof org.telegram.ui.p1) {
                                m4Var.d = null;
                                m4Var.f37288f = null;
                                if (adapter.f39590e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlockZ;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int iH = adapter.h();
                                    adapter.M();
                                    int iAbs = Math.abs(adapter.h() - iH);
                                    org.telegram.ui.p1 p1Var = (org.telegram.ui.p1) viewY;
                                    p1Var.f41242f.a(pageblockdetails.open ? 0.0f : 1.0f);
                                    p1Var.invalidate();
                                    if (iAbs != 0) {
                                        if (!pageblockdetails.open) {
                                            adapter.t(i11 + 1, iAbs);
                                        } else {
                                            adapter.s(i11 + 1, iAbs);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void c0(View view, float f10, float f11) {
        int i10 = this.f14181a;
    }

    @Override
    public void d(lh.o9 o9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, lh.k7 k7Var, kh.c cVar) {
        switch (this.f14181a) {
            case 0:
                e4 e4Var = (e4) this.f14182b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f14183c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(e4Var.f13296y2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f22621id = storyItem.f22617id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = o9Var.f16490b;
                ConnectionsManager.getInstance(e4Var.f13296y2).sendRequest(tL_stories_editStory, new gh.f1(e4Var, k7Var, storyItem, o9Var, 6));
                break;
            default:
                x3 x3Var = (x3) this.f14182b;
                lh.q9 q9Var = (lh.q9) this.f14183c;
                e4 e4Var2 = x3Var.f14128l;
                c4 c4Var = e4Var2.K1;
                TL_stories.StoryItem storyItem2 = c4Var.f13141a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    MessagesController.getInstance(e4Var2.f13296y2).getStoriesController().o0(e4Var2.f13291x1, e4Var2.f13267r1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = c4Var.f13141a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(e4Var2.f13296y2).sendRequest(togglegroupcallsettings, new cg.g0(11, x3Var, q9Var));
                    }
                }
                break;
        }
    }

    @Override
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        xh xhVar = (xh) this.f14182b;
        MessageObject messageObject = (MessageObject) this.f14183c;
        rn rnVar = xhVar.f44464p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", rnVar.P5);
        rnVar.presentFragment(new ProfileActivity(bundle, null));
        rnVar.A7(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f14181a) {
            case 2:
                x3 x3Var = (x3) this.f14182b;
                d1 d1Var = ((i9) this.f14183c).f13512w0;
                if (d1Var == null) {
                    e4.f0(x3Var.f14128l);
                    break;
                } else if (!d1Var.f13182w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = d1Var.f13178f;
                    ConnectionsManager.getInstance(d1Var.f13177e).sendRequest(discardgroupcall, new w0(d1Var, 4));
                    d1Var.e();
                    break;
                }
                break;
            case 5:
                nh.s3.y0((nh.s3) this.f14182b, (TL_payments.connectedBotStarRef) this.f14183c);
                break;
            case 9:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.f14182b;
                View view = (View) this.f14183c;
                q4Var.getClass();
                b2Var.dismiss();
                q4Var.W(view, true);
                break;
            case 11:
                we.e.o(((qb) this.f14182b).getParentActivity(), (String) this.f14183c, true);
                break;
            case 13:
                id.V((id) this.f14182b, (TLRPC.Chat) this.f14183c);
                break;
            case 23:
                xo xoVar = (xo) this.f14182b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f14183c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
                tL_channels_updateUsername.username = "";
                xoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new ko(xoVar, 0), 64);
                break;
            case 27:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f14182b, (TL_aicompose.TL_aiComposeTone) this.f14183c, b2Var);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f14182b;
                q0.a aVar = (q0.a) this.f14183c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
                int[] iArr = (int[]) this.f14182b;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f14183c;
                int i12 = iArr[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else {
                    i11 = i12 == 2 ? 28800 : Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f14181a) {
        }
        return false;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.f14182b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f14183c);
    }

    @Override
    public void onComplete(Object obj) {
        pn pnVar = (pn) this.f14182b;
        nb0 nb0Var = (nb0) this.f14183c;
        Pair pair = (Pair) obj;
        pnVar.getClass();
        if (pair == null) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.b4 b4Var = pnVar.f41395f;
        if (b4Var == null || jLongValue != b4Var.i(pnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        nb0Var.f30941x = bitmap;
        nb0Var.i();
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        rn.g0((rn) this.f14182b, (Context) this.f14183c, tL_error);
        return false;
    }

    @Override
    public Object u0(af.h hVar) {
        String str = (String) this.f14182b;
        z8.a aVar = (z8.a) this.f14183c;
        try {
            Trace.beginSection(str);
            return aVar.f50222f.u0(hVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        org.telegram.ui.a6 a6Var = (org.telegram.ui.a6) this.f14182b;
        gy gyVar2 = (gy) this.f14183c;
        ArrayList arrayList2 = a6Var.f36381c;
        gyVar2.finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= a6Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) a6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) a6Var.d.get(i14);
                    break;
                }
                i14++;
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (a6Var.getMessagesController().getCacheByChatsController().getKeepMedia(a6Var.f36382e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = a6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.f36382e, a6Var.d);
        a6Var.U();
        if (keepMediaException != null) {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                if (((org.telegram.ui.z5) arrayList2.get(i16)).f45029c != null && ((org.telegram.ui.z5) arrayList2.get(i16)).f45029c.dialogId == keepMediaException.dialogId) {
                    i12 = i16;
                    break;
                }
            }
            a6Var.f36380b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(14, a6Var, keepMediaException), 150L);
        }
        return true;
    }

    public z1(hb hbVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        this.f14181a = 12;
        this.f14182b = hbVar;
        this.f14183c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f14181a) {
            case 22:
                jo joVar = (jo) this.f14182b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f14183c;
                joVar.getClass();
                b2Var.dismiss();
                joVar.J0 = false;
                if (j10 != 0) {
                    joVar.f39428s0 = j10;
                    TLRPC.Chat chat = joVar.getMessagesController().getChat(Long.valueOf(j10));
                    joVar.f39429t0 = chat;
                    TLRPC.ChatFull chatFull = joVar.f39430u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = chat.forum_tabs != joVar.D0;
                    joVar.getMessagesController().toggleChannelForum(joVar.f39428s0, joVar.B0, joVar.D0);
                    TLRPC.Chat chat2 = joVar.f39429t0;
                    chat2.forum = joVar.B0;
                    chat2.forum_tabs = joVar.D0;
                    if (z10) {
                        joVar.q0();
                    }
                    break;
                }
                break;
            case 23:
            default:
                fp fpVar = (fp) this.f14182b;
                Runnable runnable = (Runnable) this.f14183c;
                if (j10 == 0) {
                    fpVar.getClass();
                } else {
                    jp jpVar = fpVar.f38179x.d;
                    if (jpVar.f39457s) {
                        jpVar.v.set(0, jpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        jpVar.A = j10;
                        jpVar.f39454f = jpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                }
                break;
            case 24:
                jp jpVar2 = (jp) this.f14182b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f14183c;
                if (j10 == 0) {
                    jpVar2.getClass();
                } else {
                    jpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    jpVar2.Y(jpVar2.getMessagesController().getChat(Long.valueOf(j10)), n2Var);
                }
                break;
        }
    }

    @Override
    public void run(boolean z10) {
        dj djVar = (dj) this.f14182b;
        long j10 = ((TLRPC.User) this.f14183c).f22527id;
        rn rnVar = djVar.f37415b;
        long j11 = rnVar.Z3;
        if (j10 != j11) {
            return;
        }
        rnVar.qa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f14182b;
        AtomicReference atomicReference = (AtomicReference) this.f14183c;
        FileLog.e("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    private final void g(View view, float f10, float f11) {
    }

    private final void i(View view, float f10, float f11) {
    }
}
