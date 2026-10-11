package m4;

import ai.r5;
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
import org.telegram.messenger.ce;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b4;
import org.telegram.ui.c5;
import org.telegram.ui.da;
import org.telegram.ui.eg1;
import org.telegram.ui.f4;
import org.telegram.ui.h4;
import org.telegram.ui.hi;
import org.telegram.ui.ip;
import org.telegram.ui.l3;
import org.telegram.ui.lb;
import org.telegram.ui.ld;
import org.telegram.ui.ln;
import org.telegram.ui.my;
import org.telegram.ui.nq;
import org.telegram.ui.o3;
import org.telegram.ui.o4;
import org.telegram.ui.oc;
import org.telegram.ui.oj;
import org.telegram.ui.qb;
import org.telegram.ui.qp;
import org.telegram.ui.sy;
import org.telegram.ui.u4;
import org.telegram.ui.ub;
import org.telegram.ui.ug1;
import org.telegram.ui.uo;
import org.telegram.ui.up;
import org.telegram.ui.v3;
import org.telegram.ui.vo;
import org.telegram.ui.xn;
import org.telegram.ui.y5;
import org.telegram.ui.z5;
import org.telegram.ui.zn;
import v7.j8;
public final class v0 implements b1, org.telegram.ui.Cells.v, hm0, z1, my, u4, f5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, vk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, ug1 {
    public final int f16268a;
    public final Object f16269b;
    public final Object f16270c;

    public v0(int i10, Object obj, Object obj2) {
        this.f16268a = i10;
        this.f16269b = obj;
        this.f16270c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f16268a) {
            case 8:
                zn znVar = (zn) this.f16269b;
                znVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), null, (Uri) this.f16270c, znVar.T5, znVar.f44867n5, znVar.X3, znVar.f44841l5, null, null, null, null, 0, znVar.p5, z10, i10, znVar.R3, znVar.H8());
                return;
            case 9:
                zn znVar2 = (zn) this.f16269b;
                znVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f16270c, znVar2.T5, znVar2.f44867n5, znVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                znVar2.Y.setFieldText("");
                znVar2.j9(false);
                return;
            default:
                ln lnVar = (ln) this.f16269b;
                MessageObject messageObject = (MessageObject) this.f16270c;
                if (z10) {
                    lnVar.f39701a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20053id, i10);
                    return;
                } else {
                    lnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean K(sy syVar) {
        return false;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f16270c;
        zn znVar = ((hi) this.f16269b).f38445p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", znVar.T5);
        znVar.presentFragment(new ProfileActivity(bundle, null));
        znVar.D7(true);
    }

    @Override
    public void b(c5 c5Var) {
        lb lbVar = (lb) this.f16269b;
        TLRPC.User user = (TLRPC.User) this.f16270c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                qb qbVar = lbVar.f39576a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20179id);
                    m2 m2Var = qbVar.f41128n;
                    if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                        m2Var.presentFragment(new zn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        lbVar.a(user);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        h4 h4Var = (h4) this.f16269b;
        l3 l3Var = (l3) this.f16270c;
        if (h4Var.K == null || i10 - 1 >= 0) {
            o9 o9Var = h4Var.O0;
            if (o9Var != null) {
                if (o9Var.x()) {
                    h4Var.O0.f(false);
                    return;
                }
                h4Var.O0.f(false);
            }
            f4 adapter = l3Var.getAdapter();
            if ((view instanceof o3) && adapter.E != null) {
                o3 o3Var = (o3) view;
                if (h4Var.G0 == 0) {
                    if ((!o3Var.f40405c || f7 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(h4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            h4Var.P(adapter.E.f20185id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j3 = adapter.E.f20185id;
                        h4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        h4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ce(h4Var, i11, j3));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = h4.z(pageBlock);
                if (z10 instanceof v3) {
                    z10 = ((v3) z10).f42865b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(h4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), h4Var.M, 2);
                    h4Var.o(false, true);
                } else if (z10 instanceof b4) {
                    b4 b4Var = (b4) z10;
                    h4Var.Q(b4Var.f36253a.articles.get(b4Var.f36254b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = h4.y(view);
                    if (y3 instanceof org.telegram.ui.l1) {
                        h4Var.d = null;
                        h4Var.f42100f = null;
                        if (adapter.f37528e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.l1 l1Var = (org.telegram.ui.l1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = l1Var.f39477f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            l1Var.invalidate();
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
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((nq) this.f16269b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f16270c);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f16268a) {
            case 3:
                o4 o4Var = (o4) this.f16269b;
                o4Var.getClass();
                a2Var.dismiss();
                o4Var.W((View) this.f16270c, true);
                return;
            case 5:
                of.f.o(((ub) this.f16269b).getParentActivity(), (String) this.f16270c, true);
                return;
            case 7:
                ld.V((ld) this.f16269b, (TLRPC.Chat) this.f16270c);
                return;
            case 17:
                ip ipVar = (ip) this.f16269b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f16270c);
                tL_channels_updateUsername.username = "";
                ipVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new vo(ipVar, 0), 64);
                return;
            case 21:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f16269b, (TL_aicompose.TL_aiComposeTone) this.f16270c, a2Var);
                return;
            case 22:
                ((AtomicBoolean) this.f16269b).set(true);
                ((q0.a) this.f16270c).accept(Boolean.FALSE);
                return;
            case 23:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f16270c;
                int i12 = ((int[]) this.f16269b)[0];
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
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f16269b;
                LaunchActivity launchActivity = (LaunchActivity) this.f16270c;
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
            case 25:
                a2Var.dismiss();
                ((oc) this.f16269b).run(((EditText) this.f16270c).getText().toString());
                return;
            case 26:
                org.telegram.ui.Components.h4 h4Var = (org.telegram.ui.Components.h4) this.f16269b;
                Utilities.Callback callback = (Utilities.Callback) this.f16270c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = g5.f26605a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return;
                }
                callback.run(trim);
                a2Var.dismiss();
                return;
            case 27:
                String str2 = (String) this.f16269b;
                m2 m2Var = (m2) this.f16270c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(m2Var.getCurrentAccount()).getInviteText(1));
                    m2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 28:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f16269b;
                int i13 = encryptedChat.ttl;
                int value = ((vd0) this.f16270c).getValue();
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
            default:
                ((da) this.f16269b).run(((boolean[]) this.f16270c)[0]);
                return;
        }
    }

    @Override
    public Object h(b0 b0Var, r rVar, int i10) {
        b1 b1Var = (b1) this.f16269b;
        a1 a1Var = (a1) this.f16270c;
        if (b0Var.j()) {
            return j8.b(new m1(-100));
        }
        return e2.d0.c0((i9.w) b1Var.h(b0Var, rVar, i10), new r5(b0Var, rVar, a1Var, 15));
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f16269b;
        dd0 dd0Var = (dd0) this.f16270c;
        Pair pair = (Pair) obj;
        xnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.b4 b4Var = xnVar.f44115f;
            if (b4Var != null && longValue == b4Var.i(xnVar.G ? 1 : 0) && bitmap != null) {
                dd0Var.f25568x = bitmap;
                dd0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        zn.H0((zn) this.f16269b, (Context) this.f16270c, tL_error);
        return false;
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        z5 z5Var = (z5) this.f16269b;
        ArrayList arrayList2 = z5Var.f44583c;
        ((sy) this.f16270c).finishFragment();
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
                if (i14 < z5Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) z5Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) z5Var.d.get(i14);
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
                if (z5Var.getMessagesController().getCacheByChatsController().getKeepMedia(z5Var.f44584e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = z5Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.f44584e, z5Var.d);
        z5Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((y5) arrayList2.get(i16)).f44259c != null && ((y5) arrayList2.get(i16)).f44259c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            z5Var.f44582b.u0(i12);
            AndroidUtilities.runOnUIThread(new a6(8, z5Var, keepMediaException), 150L);
        }
        return true;
    }

    public v0(lb lbVar, u1 u1Var, TLRPC.User user) {
        this.f16268a = 6;
        this.f16269b = lbVar;
        this.f16270c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void run(long j3) {
        switch (this.f16268a) {
            case 16:
                uo uoVar = (uo) this.f16269b;
                uoVar.getClass();
                ((a2) this.f16270c).dismiss();
                uoVar.N0 = false;
                if (j3 == 0) {
                    return;
                }
                uoVar.f42684w0 = j3;
                TLRPC.Chat chat = uoVar.getMessagesController().getChat(Long.valueOf(j3));
                uoVar.f42686x0 = chat;
                TLRPC.ChatFull chatFull = uoVar.f42688y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != uoVar.H0;
                uoVar.getMessagesController().toggleChannelForum(uoVar.f42684w0, uoVar.F0, uoVar.H0);
                TLRPC.Chat chat2 = uoVar.f42686x0;
                chat2.forum = uoVar.F0;
                chat2.forum_tabs = uoVar.H0;
                if (z10) {
                    uoVar.q0();
                    return;
                }
                return;
            case 17:
            default:
                qp qpVar = (qp) this.f16269b;
                Runnable runnable = (Runnable) this.f16270c;
                if (j3 != 0) {
                    up upVar = qpVar.f41215x.d;
                    if (upVar.f42741s) {
                        upVar.v.set(0, upVar.getMessagesController().getChat(Long.valueOf(j3)));
                    } else {
                        upVar.E = j3;
                        upVar.f42738f = upVar.getMessagesController().getChat(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                qpVar.getClass();
                return;
            case 18:
                up upVar2 = (up) this.f16269b;
                m2 m2Var = (m2) this.f16270c;
                if (j3 != 0) {
                    upVar2.getMessagesController().toggleChannelInvitesHistory(j3, false);
                    upVar2.Y(upVar2.getMessagesController().getChat(Long.valueOf(j3)), m2Var);
                    return;
                }
                upVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j3 = ((TLRPC.User) this.f16270c).f20179id;
        zn znVar = ((oj) this.f16269b).f40556b;
        long j10 = znVar.f44743d4;
        if (j3 != j10) {
            return;
        }
        znVar.va(j10, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f16270c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f16269b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
