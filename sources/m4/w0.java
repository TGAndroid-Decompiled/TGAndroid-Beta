package m4;

import ai.u2;
import ai.ua;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import ig.e2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ce;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a5;
import org.telegram.ui.bq;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.d6;
import org.telegram.ui.e4;
import org.telegram.ui.e6;
import org.telegram.ui.ep;
import org.telegram.ui.fj;
import org.telegram.ui.hf1;
import org.telegram.ui.i5;
import org.telegram.ui.io;
import org.telegram.ui.ip;
import org.telegram.ui.j4;
import org.telegram.ui.jo;
import org.telegram.ui.l4;
import org.telegram.ui.mb;
import org.telegram.ui.md;
import org.telegram.ui.o3;
import org.telegram.ui.on;
import org.telegram.ui.qn;
import org.telegram.ui.r3;
import org.telegram.ui.rb;
import org.telegram.ui.re1;
import org.telegram.ui.v4;
import org.telegram.ui.vb;
import org.telegram.ui.vx;
import org.telegram.ui.wo;
import org.telegram.ui.y3;
import org.telegram.ui.yh;
import v7.q8;
public final class w0 implements e2.j, g1, mi.n, org.telegram.ui.Cells.v, yl0, a2, vx, a5, e5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, mk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, hf1 {
    public final int f16765a;
    public final Object f16766b;
    public final Object f16767c;

    public w0(int i10, Object obj, Object obj2) {
        this.f16765a = i10;
        this.f16766b = obj;
        this.f16767c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f16765a) {
            case 11:
                qn qnVar = (qn) this.f16766b;
                qnVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), null, (Uri) this.f16767c, qnVar.T5, qnVar.f40779n5, qnVar.X3, qnVar.f40753l5, null, null, null, null, 0, qnVar.p5, z10, i10, qnVar.R3, qnVar.H8());
                return;
            case 12:
                qn qnVar2 = (qn) this.f16766b;
                qnVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f16767c, qnVar2.T5, qnVar2.f40779n5, qnVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                qnVar2.Y.setFieldText("");
                qnVar2.j9(false);
                return;
            default:
                cn cnVar = (cn) this.f16766b;
                MessageObject messageObject = (MessageObject) this.f16767c;
                if (z10) {
                    cnVar.f36011a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20297id, i10);
                    return;
                } else {
                    cnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(mi.q qVar) {
        AndroidUtilities.runOnUIThread(new e2((SpannableString) this.f16766b, qVar, (ua) this.f16767c, 11));
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16766b;
        Surface surface = (Surface) this.f16767c;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16563a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16567i = null;
            return;
        }
        h1 h1Var = new h1(surface);
        i1Var.f16567i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void b(i5 i5Var) {
        mb mbVar = (mb) this.f16766b;
        TLRPC.User user = (TLRPC.User) this.f16767c;
        int ordinal = i5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                rb rbVar = mbVar.f39171a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20423id);
                    n2 n2Var = rbVar.f41111n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new qn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        mbVar.a(user);
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f16767c;
        qn qnVar = ((yh) this.f16766b).f43500p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", qnVar.T5);
        qnVar.presentFragment(new ProfileActivity(bundle, null));
        qnVar.D7(true);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        float f11;
        l4 l4Var = (l4) this.f16766b;
        o3 o3Var = (o3) this.f16767c;
        if (l4Var.K == null || i10 - 1 >= 0) {
            n9 n9Var = l4Var.O0;
            if (n9Var != null) {
                if (n9Var.x()) {
                    l4Var.O0.f(false);
                    return;
                }
                l4Var.O0.f(false);
            }
            j4 adapter = o3Var.getAdapter();
            if ((view instanceof r3) && adapter.E != null) {
                r3 r3Var = (r3) view;
                if (l4Var.G0 == 0) {
                    if ((!r3Var.f41045c || f7 >= view.getMeasuredWidth() / 2) && !r3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(l4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            l4Var.P(adapter.E.f20429id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.f20429id;
                        l4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        l4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ce(l4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = l4.z(pageBlock);
                if (z10 instanceof y3) {
                    z10 = ((y3) z10).f43340b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(l4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), l4Var.M, 2);
                    l4Var.o(false, true);
                } else if (z10 instanceof e4) {
                    e4 e4Var = (e4) z10;
                    l4Var.Q(e4Var.f36540a.articles.get(e4Var.f36541b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = l4.y(view);
                    if (y3 instanceof org.telegram.ui.o1) {
                        l4Var.d = null;
                        l4Var.f35525f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = o1Var.f39742f;
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
    public Object e(f0 f0Var, v vVar, int i10) {
        switch (this.f16765a) {
            case 1:
                g1 g1Var = (g1) this.f16766b;
                v0 v0Var = (v0) this.f16767c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var.e(f0Var, vVar, i10), new u2(f0Var, vVar, v0Var, 15));
            default:
                g1 g1Var2 = (g1) this.f16766b;
                f1 f1Var = (f1) this.f16767c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var2.e(f0Var, vVar, i10), new u2(f0Var, vVar, f1Var, 16));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f16765a) {
            case 6:
                v4 v4Var = (v4) this.f16766b;
                v4Var.getClass();
                b2Var.dismiss();
                v4Var.W((View) this.f16767c, true);
                return;
            case 8:
                pf.d.n(((vb) this.f16766b).getParentActivity(), (String) this.f16767c, true);
                return;
            case 10:
                md.V((md) this.f16766b, (TLRPC.Chat) this.f16767c);
                return;
            case 20:
                wo woVar = (wo) this.f16766b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f16767c);
                tL_channels_updateUsername.username = "";
                woVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new jo(woVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f16766b, (TL_aicompose.TL_aiComposeTone) this.f16767c, b2Var);
                return;
            case 25:
                ((AtomicBoolean) this.f16766b).set(true);
                ((q0.a) this.f16767c).accept(Boolean.FALSE);
                return;
            case 26:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f16767c;
                int i12 = ((int[]) this.f16766b)[0];
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
            case 27:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f16766b;
                LaunchActivity launchActivity = (LaunchActivity) this.f16767c;
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
                launchActivity.y0(true);
                return;
            case 28:
                b2Var.dismiss();
                ((j3) this.f16766b).run(((EditText) this.f16767c).getText().toString());
                return;
            default:
                g4 g4Var = (g4) this.f16766b;
                Utilities.Callback callback = (Utilities.Callback) this.f16767c;
                String trim = g4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = f5.f26077a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(g4Var);
                    return;
                }
                callback.run(trim);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bq) this.f16766b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f16767c);
    }

    @Override
    public void onComplete(Object obj) {
        on onVar = (on) this.f16766b;
        wc0 wc0Var = (wc0) this.f16767c;
        Pair pair = (Pair) obj;
        onVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            c4 c4Var = onVar.f39932f;
            if (c4Var != null && longValue == c4Var.h(onVar.G ? 1 : 0) && bitmap != null) {
                wc0Var.f32088x = bitmap;
                wc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        qn.H0((qn) this.f16766b, (Context) this.f16767c, tL_error);
        return false;
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        e6 e6Var = (e6) this.f16766b;
        ArrayList arrayList2 = e6Var.f36555c;
        ((cy) this.f16767c).finishFragment();
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
                    if (((d6) arrayList2.get(i16)).f36275c != null && ((d6) arrayList2.get(i16)).f36275c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            e6Var.f36554b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.i0(4, e6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w0(mb mbVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f16765a = 9;
        this.f16766b = mbVar;
        this.f16767c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f16765a) {
            case 19:
                io ioVar = (io) this.f16766b;
                ioVar.getClass();
                ((b2) this.f16767c).dismiss();
                ioVar.N0 = false;
                if (j10 == 0) {
                    return;
                }
                ioVar.f38062w0 = j10;
                TLRPC.Chat chat = ioVar.getMessagesController().getChat(Long.valueOf(j10));
                ioVar.f38064x0 = chat;
                TLRPC.ChatFull chatFull = ioVar.f38066y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != ioVar.H0;
                ioVar.getMessagesController().toggleChannelForum(ioVar.f38062w0, ioVar.F0, ioVar.H0);
                TLRPC.Chat chat2 = ioVar.f38064x0;
                chat2.forum = ioVar.F0;
                chat2.forum_tabs = ioVar.H0;
                if (z10) {
                    ioVar.q0();
                    return;
                }
                return;
            case 20:
            default:
                ep epVar = (ep) this.f16766b;
                Runnable runnable = (Runnable) this.f16767c;
                if (j10 != 0) {
                    ip ipVar = epVar.f36741x.d;
                    if (ipVar.f38076s) {
                        ipVar.v.set(0, ipVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        ipVar.E = j10;
                        ipVar.f38073f = ipVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                epVar.getClass();
                return;
            case 21:
                ip ipVar2 = (ip) this.f16766b;
                n2 n2Var = (n2) this.f16767c;
                if (j10 != 0) {
                    ipVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    ipVar2.Y(ipVar2.getMessagesController().getChat(Long.valueOf(j10)), n2Var);
                    return;
                }
                ipVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f16767c).f20423id;
        qn qnVar = ((fj) this.f16766b).f37020b;
        long j11 = qnVar.f40656d4;
        if (j10 != j11) {
            return;
        }
        qnVar.va(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f16767c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f16766b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
