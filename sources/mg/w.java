package mg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.View;
import dg.d3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh.b1;
import nh.b4;
import nh.d4;
import nh.e1;
import nh.i9;
import nh.w3;
import nh.x0;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.he;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.c6;
import org.telegram.ui.d6;
import org.telegram.ui.di;
import org.telegram.ui.dp;
import org.telegram.ui.f4;
import org.telegram.ui.f5;
import org.telegram.ui.iy;
import org.telegram.ui.j4;
import org.telegram.ui.jb;
import org.telegram.ui.jj;
import org.telegram.ui.jn;
import org.telegram.ui.jq;
import org.telegram.ui.kf1;
import org.telegram.ui.l4;
import org.telegram.ui.mp;
import org.telegram.ui.n1;
import org.telegram.ui.nd;
import org.telegram.ui.ob;
import org.telegram.ui.oy;
import org.telegram.ui.p3;
import org.telegram.ui.p51;
import org.telegram.ui.po;
import org.telegram.ui.qo;
import org.telegram.ui.qp;
import org.telegram.ui.s3;
import org.telegram.ui.s4;
import org.telegram.ui.sb;
import org.telegram.ui.vn;
import org.telegram.ui.x4;
import org.telegram.ui.xn;
import org.telegram.ui.z3;
import ph.d8;
import ph.f6;
import ph.f8;
import ph.n7;
public final class w implements p51, ug.g, n7, c2, c9.e, org.telegram.ui.Cells.v, jl0, iy, x4, y4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, xj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ag1 {
    public final int f14160a;
    public final Object f14161b;
    public final Object f14162c;

    public w(int i10, Object obj, Object obj2) {
        this.f14160a = i10;
        this.f14161b = obj;
        this.f14162c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f14160a) {
            case 13:
                xn xnVar = (xn) this.f14161b;
                xnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), null, (Uri) this.f14162c, xnVar.Q5, xnVar.f40076k5, xnVar.U3, xnVar.f40052i5, null, null, null, null, 0, xnVar.f40100m5, z4, i10, xnVar.O3, xnVar.C8());
                return;
            case 14:
            default:
                jn jnVar = (jn) this.f14161b;
                MessageObject messageObject = (MessageObject) this.f14162c;
                if (z4) {
                    jnVar.f35381a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f19205id, i10);
                    return;
                } else {
                    jnVar.getClass();
                    return;
                }
            case 15:
                xn xnVar2 = (xn) this.f14161b;
                xnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f14162c, xnVar2.Q5, xnVar2.f40076k5, xnVar2.U3, null, false, null, null, null, z4, i10, 0, null, false));
                xnVar2.V.setFieldText("");
                xnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f14162c;
        xn xnVar = ((di) this.f14161b).f33658p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", xnVar.Q5);
        xnVar.presentFragment(new ProfileActivity(bundle, null));
        xnVar.A7(true);
    }

    @Override
    public void b(f5 f5Var) {
        jb jbVar = (jb) this.f14161b;
        TLRPC.User user = (TLRPC.User) this.f14162c;
        int ordinal = f5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ob obVar = jbVar.f35312a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19331id);
                    p2 p2Var = obVar.f36864n;
                    if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                        p2Var.presentFragment(new xn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        jbVar.a(user);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        float f12;
        l4 l4Var = (l4) this.f14161b;
        p3 p3Var = (p3) this.f14162c;
        if (l4Var.H == null || i10 - 1 >= 0) {
            m9 m9Var = l4Var.L0;
            if (m9Var != null) {
                if (m9Var.y()) {
                    l4Var.L0.f(false);
                    return;
                }
                l4Var.L0.f(false);
            }
            j4 adapter = p3Var.getAdapter();
            if ((view instanceof s3) && adapter.B != null) {
                s3 s3Var = (s3) view;
                if (l4Var.D0 == 0) {
                    if ((!s3Var.f38185c || f10 >= view.getMeasuredWidth() / 2) && !s3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(l4Var.U).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            l4Var.P(adapter.B.f19337id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.B.f19337id;
                        l4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        l4Var.D0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new he(l4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z4 = l4.z(pageBlock);
                if (z4 instanceof z3) {
                    z4 = ((z3) z4).f40661b;
                }
                if (z4 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(l4Var.U).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z4).channel), l4Var.J, 2);
                    l4Var.o(false, true);
                } else if (z4 instanceof f4) {
                    f4 f4Var = (f4) z4;
                    l4Var.Q(f4Var.f34153a.articles.get(f4Var.f34154b).url, null, null);
                } else if (z4 instanceof TL_iv.pageBlockDetails) {
                    View y10 = l4.y(view);
                    if (y10 instanceof n1) {
                        l4Var.d = null;
                        l4Var.f36478f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z4;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            n1 n1Var = (n1) y10;
                            AnimatedArrowDrawable animatedArrowDrawable = n1Var.f36429f;
                            if (pageblockdetails.open) {
                                f12 = 0.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            animatedArrowDrawable.a(f12);
                            n1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.s(i10 + 1, abs);
                                } else {
                                    adapter.t(i10 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void d(RectF rectF, View view) {
        ((pg.b) this.f14161b).s(rectF.left, rectF.top);
        ((View) this.f14162c).invalidate();
    }

    @Override
    public void e(d8 d8Var, boolean z4, boolean z10, boolean z11, boolean z12, TLRPC.InputPeer inputPeer, int i10, f6 f6Var, org.telegram.ui.web.o0 o0Var) {
        boolean z13;
        switch (this.f14160a) {
            case 2:
                d4 d4Var = (d4) this.f14161b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f14162c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(d4Var.f15263z2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f19423id = storyItem.f19419id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = d8Var.f41467b;
                ConnectionsManager.getInstance(d4Var.f15263z2).sendRequest(tL_stories_editStory, new b1(d4Var, f6Var, storyItem, d8Var, 6));
                return;
            default:
                w3 w3Var = (w3) this.f14161b;
                f8 f8Var = (f8) this.f14162c;
                d4 d4Var2 = w3Var.f16027l;
                b4 b4Var = d4Var2.L1;
                TL_stories.StoryItem storyItem2 = b4Var.f15111a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != z11) {
                    MessagesController.getInstance(d4Var2.f15263z2).getStoriesController().o0(d4Var2.f15258y1, d4Var2.f15234s1, z11, null);
                }
                TL_stories.StoryItem storyItem3 = b4Var.f15111a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z4);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(d4Var2.f15263z2).sendRequest(togglegroupcallsettings, new d3(12, w3Var, f8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public Object f0(c5.j jVar) {
        String str = (String) this.f14161b;
        c9.b bVar = (c9.b) this.f14162c;
        try {
            Trace.beginSection(str);
            return bVar.f2151f.f0(jVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void i(d2 d2Var, int i10) {
        int i11;
        String str;
        switch (this.f14160a) {
            case 4:
                w3 w3Var = (w3) this.f14161b;
                e1 e1Var = ((i9) this.f14162c).f15498x0;
                if (e1Var != null) {
                    if (!e1Var.f15299w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = e1Var.f15295f;
                        ConnectionsManager.getInstance(e1Var.e).sendRequest(discardgroupcall, new x0(e1Var, 4));
                        e1Var.e();
                        return;
                    }
                    return;
                }
                d4.f0(w3Var.f16027l);
                return;
            case 8:
                s4 s4Var = (s4) this.f14161b;
                s4Var.getClass();
                d2Var.dismiss();
                s4Var.W((View) this.f14162c, true);
                return;
            case 10:
                af.g.o(((sb) this.f14161b).getParentActivity(), (String) this.f14162c, true);
                return;
            case 12:
                nd.V((nd) this.f14161b, (TLRPC.Chat) this.f14162c);
                return;
            case 22:
                dp dpVar = (dp) this.f14161b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f14162c);
                tL_channels_updateUsername.username = "";
                dpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new qo(dpVar, 0), 64);
                return;
            case 26:
                org.telegram.ui.Components.f0.P((org.telegram.ui.Components.f0) this.f14161b, (TL_aicompose.TL_aiComposeTone) this.f14162c, d2Var);
                return;
            case 27:
                ((AtomicBoolean) this.f14161b).set(true);
                ((q0.a) this.f14162c).accept(Boolean.FALSE);
                return;
            case 28:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f14162c;
                int i12 = ((int[]) this.f14161b)[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else if (i12 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            default:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f14161b;
                LaunchActivity launchActivity = (LaunchActivity) this.f14162c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                LocaleController.LocaleInfo languageFromDict = LocaleController.getInstance().getLanguageFromDict(str);
                if (languageFromDict == null) {
                    languageFromDict = new LocaleController.LocaleInfo();
                    languageFromDict.name = tL_langPackLanguage.native_name;
                    languageFromDict.nameEnglish = tL_langPackLanguage.name;
                    languageFromDict.shortName = tL_langPackLanguage.lang_code;
                    languageFromDict.baseLangCode = tL_langPackLanguage.base_lang_code;
                    languageFromDict.pluralLangCode = tL_langPackLanguage.plural_code;
                    languageFromDict.isRtl = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        languageFromDict.pathToFile = "remote";
                    } else {
                        languageFromDict.pathToFile = "unofficial";
                    }
                }
                LocaleController.getInstance().applyLanguage(languageFromDict, true, false, false, true, UserConfig.selectedAccount, null);
                launchActivity.u0(true);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((jq) this.f14161b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f14162c);
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.f14161b;
        dc0 dc0Var = (dc0) this.f14162c;
        Pair pair = (Pair) obj;
        vnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            e4 e4Var = vnVar.f39218f;
            if (e4Var != null && longValue == e4Var.i(vnVar.D ? 1 : 0) && bitmap != null) {
                dc0Var.f24253x = bitmap;
                dc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        xn.g0((xn) this.f14161b, (Context) this.f14162c, tL_error);
        return false;
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        d6 d6Var = (d6) this.f14161b;
        ArrayList arrayList2 = d6Var.f33522c;
        ((oy) this.f14162c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < d6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) d6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) d6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (d6Var.getMessagesController().getCacheByChatsController().getKeepMedia(d6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = d6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.e, d6Var.d);
        d6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((c6) arrayList2.get(i16)).f33097c != null && ((c6) arrayList2.get(i16)).f33097c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            d6Var.f33521b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(20, d6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w(jb jbVar, t1 t1Var, TLRPC.User user) {
        this.f14160a = 11;
        this.f14161b = jbVar;
        this.f14162c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f14160a) {
            case 21:
                po poVar = (po) this.f14161b;
                poVar.getClass();
                ((d2) this.f14162c).dismiss();
                poVar.K0 = false;
                if (j10 == 0) {
                    return;
                }
                poVar.f37405t0 = j10;
                TLRPC.Chat chat = poVar.getMessagesController().getChat(Long.valueOf(j10));
                poVar.f37406u0 = chat;
                TLRPC.ChatFull chatFull = poVar.f37407v0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z4 = chat.forum_tabs != poVar.E0;
                poVar.getMessagesController().toggleChannelForum(poVar.f37405t0, poVar.C0, poVar.E0);
                TLRPC.Chat chat2 = poVar.f37406u0;
                chat2.forum = poVar.C0;
                chat2.forum_tabs = poVar.E0;
                if (z4) {
                    poVar.q0();
                    return;
                }
                return;
            case 22:
            default:
                mp mpVar = (mp) this.f14161b;
                Runnable runnable = (Runnable) this.f14162c;
                if (j10 != 0) {
                    qp qpVar = mpVar.f36365x.d;
                    if (qpVar.f37809s) {
                        qpVar.v.set(0, qpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        qpVar.B = j10;
                        qpVar.f37806f = qpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                mpVar.getClass();
                return;
            case 23:
                qp qpVar2 = (qp) this.f14161b;
                p2 p2Var = (p2) this.f14162c;
                if (j10 != 0) {
                    qpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    qpVar2.Y(qpVar2.getMessagesController().getChat(Long.valueOf(j10)), p2Var);
                    return;
                }
                qpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z4) {
        long j10 = ((TLRPC.User) this.f14162c).f19331id;
        xn xnVar = ((jj) this.f14161b).f35363b;
        long j11 = xnVar.f39948a4;
        if (j10 != j11) {
            return;
        }
        xnVar.qa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f14162c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f14161b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
