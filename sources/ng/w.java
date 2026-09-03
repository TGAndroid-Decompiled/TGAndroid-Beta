package ng;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.View;
import eg.b3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lh.b1;
import oh.d4;
import oh.e1;
import oh.i9;
import oh.x0;
import oh.y3;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c6;
import org.telegram.ui.d6;
import org.telegram.ui.di;
import org.telegram.ui.ep;
import org.telegram.ui.f4;
import org.telegram.ui.f5;
import org.telegram.ui.ig1;
import org.telegram.ui.j4;
import org.telegram.ui.jb;
import org.telegram.ui.jj;
import org.telegram.ui.jn;
import org.telegram.ui.jy;
import org.telegram.ui.kq;
import org.telegram.ui.l4;
import org.telegram.ui.n1;
import org.telegram.ui.nd;
import org.telegram.ui.np;
import org.telegram.ui.ob;
import org.telegram.ui.p3;
import org.telegram.ui.po;
import org.telegram.ui.py;
import org.telegram.ui.qo;
import org.telegram.ui.rp;
import org.telegram.ui.s3;
import org.telegram.ui.s4;
import org.telegram.ui.sb;
import org.telegram.ui.sf1;
import org.telegram.ui.vn;
import org.telegram.ui.w51;
import org.telegram.ui.x4;
import org.telegram.ui.xn;
import org.telegram.ui.z3;
import qh.a8;
import qh.c8;
import qh.k7;
import qh.l6;
public final class w implements w51, c9.e, vg.g, k7, c2, org.telegram.ui.Cells.v, jl0, jy, x4, y4, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, yj0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ig1 {
    public final int f16236a;
    public final Object f16237b;
    public final Object f16238c;

    public w(int i10, Object obj, Object obj2) {
        this.f16236a = i10;
        this.f16237b = obj;
        this.f16238c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f16236a) {
            case 13:
                xn xnVar = (xn) this.f16237b;
                xnVar.l8(null, null);
                SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), null, (Uri) this.f16238c, xnVar.Q5, xnVar.f43223k5, xnVar.U3, xnVar.f43199i5, null, null, null, null, 0, xnVar.f43247m5, z4, i10, xnVar.O3, xnVar.C8());
                return;
            case 14:
            default:
                jn jnVar = (jn) this.f16237b;
                MessageObject messageObject = (MessageObject) this.f16238c;
                if (z4) {
                    jnVar.f38085a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20866id, i10);
                    return;
                } else {
                    jnVar.getClass();
                    return;
                }
            case 15:
                xn xnVar2 = (xn) this.f16237b;
                xnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f16238c, xnVar2.Q5, xnVar2.f43223k5, xnVar2.U3, null, false, null, null, null, z4, i10, 0, null, false));
                xnVar2.V.setFieldText("");
                xnVar2.e9(false);
                return;
        }
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f16238c;
        xn xnVar = ((di) this.f16237b).f36211p;
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
        jb jbVar = (jb) this.f16237b;
        TLRPC.User user = (TLRPC.User) this.f16238c;
        int ordinal = f5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ob obVar = jbVar.f37937a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20992id);
                    p2 p2Var = obVar.f39638n;
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
        l4 l4Var = (l4) this.f16237b;
        p3 p3Var = (p3) this.f16238c;
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
                    if ((!s3Var.f41004c || f10 >= view.getMeasuredWidth() / 2) && !s3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(l4Var.U).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            l4Var.P(adapter.B.f20998id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.B.f20998id;
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
                    z4 = ((z3) z4).f43783b;
                }
                if (z4 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(l4Var.U).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z4).channel), l4Var.J, 2);
                    l4Var.o(false, true);
                } else if (z4 instanceof f4) {
                    f4 f4Var = (f4) z4;
                    l4Var.Q(f4Var.f36651a.articles.get(f4Var.f36652b).url, null, null);
                } else if (z4 instanceof TL_iv.pageBlockDetails) {
                    View y10 = l4.y(view);
                    if (y10 instanceof n1) {
                        l4Var.d = null;
                        l4Var.f39557f = null;
                        if (adapter.f37836e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z4;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            n1 n1Var = (n1) y10;
                            AnimatedArrowDrawable animatedArrowDrawable = n1Var.f39157f;
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
        ((qg.b) this.f16237b).s(rectF.left, rectF.top);
        ((View) this.f16238c).invalidate();
    }

    @Override
    public void e(a8 a8Var, boolean z4, boolean z10, boolean z11, boolean z12, TLRPC.InputPeer inputPeer, int i10, l6 l6Var, org.telegram.ui.web.s0 s0Var) {
        boolean z13;
        switch (this.f16236a) {
            case 3:
                oh.f4 f4Var = (oh.f4) this.f16237b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f16238c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(f4Var.f17135z2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f21086id = storyItem.f21082id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = a8Var.f44995b;
                ConnectionsManager.getInstance(f4Var.f17135z2).sendRequest(tL_stories_editStory, new b1(f4Var, l6Var, storyItem, a8Var, 6));
                return;
            default:
                y3 y3Var = (y3) this.f16237b;
                c8 c8Var = (c8) this.f16238c;
                oh.f4 f4Var2 = y3Var.f17952l;
                d4 d4Var = f4Var2.L1;
                TL_stories.StoryItem storyItem2 = d4Var.f16963a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != z11) {
                    MessagesController.getInstance(f4Var2.f17135z2).getStoriesController().o0(f4Var2.f17130y1, f4Var2.f17106s1, z11, null);
                }
                TL_stories.StoryItem storyItem3 = d4Var.f16963a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z4);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(f4Var2.f17135z2).sendRequest(togglegroupcallsettings, new b3(12, y3Var, c8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object e0(c5.j jVar) {
        String str = (String) this.f16237b;
        c9.b bVar = (c9.b) this.f16238c;
        try {
            Trace.beginSection(str);
            return bVar.f2340f.e0(jVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((kq) this.f16237b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f16238c);
    }

    @Override
    public void j(d2 d2Var, int i10) {
        int i11;
        String str;
        switch (this.f16236a) {
            case 5:
                y3 y3Var = (y3) this.f16237b;
                e1 e1Var = ((i9) this.f16238c).f17305x0;
                if (e1Var != null) {
                    if (!e1Var.f17012w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = e1Var.f17008f;
                        ConnectionsManager.getInstance(e1Var.f17007e).sendRequest(discardgroupcall, new x0(e1Var, 4));
                        e1Var.e();
                        return;
                    }
                    return;
                }
                oh.f4.f0(y3Var.f17952l);
                return;
            case 8:
                s4 s4Var = (s4) this.f16237b;
                s4Var.getClass();
                d2Var.dismiss();
                s4Var.W((View) this.f16238c, true);
                return;
            case 10:
                af.g.o(((sb) this.f16237b).getParentActivity(), (String) this.f16238c, true);
                return;
            case 12:
                nd.V((nd) this.f16237b, (TLRPC.Chat) this.f16238c);
                return;
            case 22:
                ep epVar = (ep) this.f16237b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f16238c);
                tL_channels_updateUsername.username = "";
                epVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new qo(epVar, 0), 64);
                return;
            case 26:
                org.telegram.ui.Components.f0.P((org.telegram.ui.Components.f0) this.f16237b, (TL_aicompose.TL_aiComposeTone) this.f16238c, d2Var);
                return;
            case 27:
                ((AtomicBoolean) this.f16237b).set(true);
                ((q0.a) this.f16238c).accept(Boolean.FALSE);
                return;
            case 28:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f16238c;
                int i12 = ((int[]) this.f16237b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f16237b;
                LaunchActivity launchActivity = (LaunchActivity) this.f16238c;
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
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.f16237b;
        fc0 fc0Var = (fc0) this.f16238c;
        Pair pair = (Pair) obj;
        vnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.f4 f4Var = vnVar.f42178f;
            if (f4Var != null && longValue == f4Var.i(vnVar.D ? 1 : 0) && bitmap != null) {
                fc0Var.f26890x = bitmap;
                fc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        xn.g0((xn) this.f16237b, (Context) this.f16238c, tL_error);
        return false;
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        d6 d6Var = (d6) this.f16237b;
        ArrayList arrayList2 = d6Var.f35988c;
        ((py) this.f16238c).finishFragment();
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
                if (d6Var.getMessagesController().getCacheByChatsController().getKeepMedia(d6Var.f35989e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = d6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.f35989e, d6Var.d);
        d6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((c6) arrayList2.get(i16)).f35697c != null && ((c6) arrayList2.get(i16)).f35697c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            d6Var.f35987b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(18, d6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w(jb jbVar, t1 t1Var, TLRPC.User user) {
        this.f16236a = 11;
        this.f16237b = jbVar;
        this.f16238c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f16236a) {
            case 21:
                po poVar = (po) this.f16237b;
                poVar.getClass();
                ((d2) this.f16238c).dismiss();
                poVar.K0 = false;
                if (j10 == 0) {
                    return;
                }
                poVar.f40082t0 = j10;
                TLRPC.Chat chat = poVar.getMessagesController().getChat(Long.valueOf(j10));
                poVar.f40083u0 = chat;
                TLRPC.ChatFull chatFull = poVar.f40084v0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z4 = chat.forum_tabs != poVar.E0;
                poVar.getMessagesController().toggleChannelForum(poVar.f40082t0, poVar.C0, poVar.E0);
                TLRPC.Chat chat2 = poVar.f40083u0;
                chat2.forum = poVar.C0;
                chat2.forum_tabs = poVar.E0;
                if (z4) {
                    poVar.q0();
                    return;
                }
                return;
            case 22:
            default:
                np npVar = (np) this.f16237b;
                Runnable runnable = (Runnable) this.f16238c;
                if (j10 != 0) {
                    rp rpVar = npVar.f39421x.d;
                    if (rpVar.f40900s) {
                        rpVar.v.set(0, rpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        rpVar.B = j10;
                        rpVar.f40897f = rpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                npVar.getClass();
                return;
            case 23:
                rp rpVar2 = (rp) this.f16237b;
                p2 p2Var = (p2) this.f16238c;
                if (j10 != 0) {
                    rpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    rpVar2.Y(rpVar2.getMessagesController().getChat(Long.valueOf(j10)), p2Var);
                    return;
                }
                rpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z4) {
        long j10 = ((TLRPC.User) this.f16238c).f20992id;
        xn xnVar = ((jj) this.f16237b).f38068b;
        long j11 = xnVar.f43094a4;
        if (j10 != j11) {
            return;
        }
        xnVar.qa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f16238c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f16237b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
