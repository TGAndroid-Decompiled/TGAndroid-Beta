package m4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fe;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ac;
import org.telegram.ui.ap;
import org.telegram.ui.aq;
import org.telegram.ui.bh1;
import org.telegram.ui.co;
import org.telegram.ui.d6;
import org.telegram.ui.e4;
import org.telegram.ui.e6;
import org.telegram.ui.fo;
import org.telegram.ui.h5;
import org.telegram.ui.i4;
import org.telegram.ui.k4;
import org.telegram.ui.kg1;
import org.telegram.ui.li;
import org.telegram.ui.np;
import org.telegram.ui.o3;
import org.telegram.ui.qn;
import org.telegram.ui.r3;
import org.telegram.ui.rb;
import org.telegram.ui.sd;
import org.telegram.ui.sj;
import org.telegram.ui.sy;
import org.telegram.ui.tq;
import org.telegram.ui.u4;
import org.telegram.ui.uc;
import org.telegram.ui.wb;
import org.telegram.ui.wp;
import org.telegram.ui.y3;
import org.telegram.ui.yy;
import org.telegram.ui.z4;
import org.telegram.ui.zo;
import v7.q8;
public final class y0 implements g1, org.telegram.ui.Cells.v, bm0, z1, sy, z4, f5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, pk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, bh1 {
    public final int f15419a;
    public final Object f15420b;
    public final Object f15421c;

    public y0(int i10, Object obj, Object obj2) {
        this.f15419a = i10;
        this.f15420b = obj;
        this.f15421c = obj2;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f15419a) {
            case 9:
                fo foVar = (fo) this.f15420b;
                foVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(foVar.getAccountInstance(), null, (Uri) this.f15421c, foVar.T5, foVar.f35739n5, foVar.X3, foVar.f35713l5, null, null, null, null, 0, foVar.p5, z10, i10, foVar.R3, foVar.H8());
                return;
            case 10:
                fo foVar2 = (fo) this.f15420b;
                foVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f15421c, foVar2.T5, foVar2.f35739n5, foVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                foVar2.Y.setFieldText("");
                foVar2.j9(false);
                return;
            default:
                qn qnVar = (qn) this.f15420b;
                MessageObject messageObject = (MessageObject) this.f15421c;
                if (z10) {
                    qnVar.f39190a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f18937id, i10);
                    return;
                } else {
                    qnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f15421c;
        fo foVar = ((li) this.f15420b).f37765p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", foVar.T5);
        foVar.presentFragment(new ProfileActivity(bundle, null));
        foVar.D7(true);
    }

    @Override
    public void b(h5 h5Var) {
        rb rbVar = (rb) this.f15420b;
        TLRPC.User user = (TLRPC.User) this.f15421c;
        int ordinal = h5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                wb wbVar = rbVar.f39444a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19063id);
                    m2 m2Var = wbVar.f40914n;
                    if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                        m2Var.presentFragment(new fo(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        rbVar.a(user);
    }

    @Override
    public Object c(e0 e0Var, v vVar, int i10) {
        switch (this.f15419a) {
            case 0:
                g1 g1Var = (g1) this.f15420b;
                v0 v0Var = (v0) this.f15421c;
                if (e0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var.c(e0Var, vVar, i10), new androidx.car.app.utils.a(e0Var, vVar, v0Var, 14));
            default:
                g1 g1Var2 = (g1) this.f15420b;
                f1 f1Var = (f1) this.f15421c;
                if (e0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var2.c(e0Var, vVar, i10), new androidx.car.app.utils.a(e0Var, vVar, f1Var, 15));
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        float f11;
        k4 k4Var = (k4) this.f15420b;
        o3 o3Var = (o3) this.f15421c;
        if (k4Var.K == null || i10 - 1 >= 0) {
            o9 o9Var = k4Var.O0;
            if (o9Var != null) {
                if (o9Var.x()) {
                    k4Var.O0.f(false);
                    return;
                }
                k4Var.O0.f(false);
            }
            i4 adapter = o3Var.getAdapter();
            if ((view instanceof r3) && adapter.E != null) {
                r3 r3Var = (r3) view;
                if (k4Var.G0 == 0) {
                    if ((!r3Var.f39269c || f7 >= view.getMeasuredWidth() / 2) && !r3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(k4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            k4Var.P(adapter.E.f19069id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.f19069id;
                        k4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        k4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new fe(k4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = k4.z(pageBlock);
                if (z10 instanceof y3) {
                    z10 = ((y3) z10).f41719b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(k4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), k4Var.M, 2);
                    k4Var.o(false, true);
                } else if (z10 instanceof e4) {
                    e4 e4Var = (e4) z10;
                    k4Var.Q(e4Var.f35198a.articles.get(e4Var.f35199b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = k4.y(view);
                    if (y3 instanceof org.telegram.ui.o1) {
                        k4Var.d = null;
                        k4Var.f42177f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = o1Var.f38515f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            o1Var.invalidate();
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
    public void g(a2 a2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f15419a) {
            case 4:
                u4 u4Var = (u4) this.f15420b;
                u4Var.getClass();
                a2Var.dismiss();
                u4Var.W((View) this.f15421c, true);
                return;
            case 6:
                pf.d.n(((ac) this.f15420b).getParentActivity(), (String) this.f15421c, true);
                return;
            case 8:
                sd.V((sd) this.f15420b, (TLRPC.Chat) this.f15421c);
                return;
            case 18:
                np npVar = (np) this.f15420b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f15421c);
                tL_channels_updateUsername.username = "";
                npVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new ap(npVar, 0), 64);
                return;
            case 22:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f15420b, (TL_aicompose.TL_aiComposeTone) this.f15421c, a2Var);
                return;
            case 23:
                ((AtomicBoolean) this.f15420b).set(true);
                ((q0.a) this.f15421c).accept(Boolean.FALSE);
                return;
            case 24:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f15421c;
                int i12 = ((int[]) this.f15420b)[0];
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
            case 25:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f15420b;
                LaunchActivity launchActivity = (LaunchActivity) this.f15421c;
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
            case 26:
                a2Var.dismiss();
                ((uc) this.f15420b).run(((EditText) this.f15421c).getText().toString());
                return;
            case 27:
                h4 h4Var = (h4) this.f15420b;
                Utilities.Callback callback = (Utilities.Callback) this.f15421c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = g5.f24879a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return;
                }
                callback.run(trim);
                a2Var.dismiss();
                return;
            case 28:
                String str2 = (String) this.f15420b;
                m2 m2Var = (m2) this.f15421c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(m2Var.getCurrentAccount()).getInviteText(1));
                    m2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f15420b;
                int i13 = encryptedChat.ttl;
                int value = ((ud0) this.f15421c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((tq) this.f15420b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f15421c);
    }

    @Override
    public void onComplete(Object obj) {
        co coVar = (co) this.f15420b;
        cd0 cd0Var = (cd0) this.f15421c;
        Pair pair = (Pair) obj;
        coVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            b4 b4Var = coVar.f34740f;
            if (b4Var != null && longValue == b4Var.i(coVar.G ? 1 : 0) && bitmap != null) {
                cd0Var.f23712x = bitmap;
                cd0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        fo.H0((fo) this.f15420b, (Context) this.f15421c, tL_error);
        return false;
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        e6 e6Var = (e6) this.f15420b;
        ArrayList arrayList2 = e6Var.f35208c;
        ((yy) this.f15421c).finishFragment();
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
                if (i14 < e6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) e6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) e6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (e6Var.getMessagesController().getCacheByChatsController().getKeepMedia(e6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = e6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
        e6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((d6) arrayList2.get(i16)).f34884c != null && ((d6) arrayList2.get(i16)).f34884c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            e6Var.f35207b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(15, e6Var, keepMediaException), 150L);
        }
        return true;
    }

    public y0(rb rbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f15419a = 7;
        this.f15420b = rbVar;
        this.f15421c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f15419a) {
            case 17:
                zo zoVar = (zo) this.f15420b;
                zoVar.getClass();
                ((a2) this.f15421c).dismiss();
                zoVar.N0 = false;
                if (j10 == 0) {
                    return;
                }
                zoVar.f42392w0 = j10;
                TLRPC.Chat chat = zoVar.getMessagesController().getChat(Long.valueOf(j10));
                zoVar.f42394x0 = chat;
                TLRPC.ChatFull chatFull = zoVar.f42396y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != zoVar.H0;
                zoVar.getMessagesController().toggleChannelForum(zoVar.f42392w0, zoVar.F0, zoVar.H0);
                TLRPC.Chat chat2 = zoVar.f42394x0;
                chat2.forum = zoVar.F0;
                chat2.forum_tabs = zoVar.H0;
                if (z10) {
                    zoVar.q0();
                    return;
                }
                return;
            case 18:
            default:
                wp wpVar = (wp) this.f15420b;
                Runnable runnable = (Runnable) this.f15421c;
                if (j10 != 0) {
                    aq aqVar = wpVar.f41335x.d;
                    if (aqVar.f34054s) {
                        aqVar.v.set(0, aqVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        aqVar.E = j10;
                        aqVar.f34051f = aqVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                wpVar.getClass();
                return;
            case 19:
                aq aqVar2 = (aq) this.f15420b;
                m2 m2Var = (m2) this.f15421c;
                if (j10 != 0) {
                    aqVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    aqVar2.Y(aqVar2.getMessagesController().getChat(Long.valueOf(j10)), m2Var);
                    return;
                }
                aqVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f15421c).f19063id;
        fo foVar = ((sj) this.f15420b).f39833b;
        long j11 = foVar.f35616d4;
        if (j10 != j11) {
            return;
        }
        foVar.va(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f15421c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f15420b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
