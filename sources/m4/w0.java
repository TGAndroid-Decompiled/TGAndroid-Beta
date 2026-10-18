package m4;

import ai.r2;
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
import org.telegram.messenger.be;
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
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a5;
import org.telegram.ui.ai;
import org.telegram.ui.d6;
import org.telegram.ui.dq;
import org.telegram.ui.e4;
import org.telegram.ui.e6;
import org.telegram.ui.en;
import org.telegram.ui.ey;
import org.telegram.ui.gp;
import org.telegram.ui.hj;
import org.telegram.ui.i5;
import org.telegram.ui.j4;
import org.telegram.ui.jf1;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.l4;
import org.telegram.ui.lo;
import org.telegram.ui.o3;
import org.telegram.ui.ob;
import org.telegram.ui.od;
import org.telegram.ui.qn;
import org.telegram.ui.r3;
import org.telegram.ui.sn;
import org.telegram.ui.tb;
import org.telegram.ui.te1;
import org.telegram.ui.v4;
import org.telegram.ui.xb;
import org.telegram.ui.xx;
import org.telegram.ui.y3;
import org.telegram.ui.yo;
import v7.q8;
public final class w0 implements e2.j, g1, mi.n, org.telegram.ui.Cells.v, xl0, a2, xx, a5, e5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, lk0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, jf1 {
    public final int f16764a;
    public final Object f16765b;
    public final Object f16766c;

    public w0(int i10, Object obj, Object obj2) {
        this.f16764a = i10;
        this.f16765b = obj;
        this.f16766c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f16764a) {
            case 11:
                sn snVar = (sn) this.f16765b;
                snVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), null, (Uri) this.f16766c, snVar.T5, snVar.f41297n5, snVar.X3, snVar.f41271l5, null, null, null, null, 0, snVar.p5, z10, i10, snVar.R3, snVar.H8());
                return;
            case 12:
                sn snVar2 = (sn) this.f16765b;
                snVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f16766c, snVar2.T5, snVar2.f41297n5, snVar2.X3, null, false, null, null, null, z10, i10, 0, null, false));
                snVar2.Y.setFieldText("");
                snVar2.j9(false);
                return;
            default:
                en enVar = (en) this.f16765b;
                MessageObject messageObject = (MessageObject) this.f16766c;
                if (z10) {
                    enVar.f36557a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20293id, i10);
                    return;
                } else {
                    enVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(mi.q qVar) {
        AndroidUtilities.runOnUIThread(new e2((SpannableString) this.f16765b, qVar, (ua) this.f16766c, 11));
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16765b;
        Surface surface = (Surface) this.f16766c;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16562a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16566i = null;
            return;
        }
        h1 h1Var = new h1(surface);
        i1Var.f16566i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void b(i5 i5Var) {
        ob obVar = (ob) this.f16765b;
        TLRPC.User user = (TLRPC.User) this.f16766c;
        int ordinal = i5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                tb tbVar = obVar.f39716a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20419id);
                    n2 n2Var = tbVar.f41633n;
                    if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                        n2Var.presentFragment(new sn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        obVar.a(user);
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f16766c;
        sn snVar = ((ai) this.f16765b).f35426p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", snVar.T5);
        snVar.presentFragment(new ProfileActivity(bundle, null));
        snVar.D7(true);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        float f11;
        l4 l4Var = (l4) this.f16765b;
        o3 o3Var = (o3) this.f16766c;
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
                    if ((!r3Var.f40560c || f7 >= view.getMeasuredWidth() / 2) && !r3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(l4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            l4Var.P(adapter.E.f20425id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.f20425id;
                        l4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        l4Var.G0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new be(l4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = l4.z(pageBlock);
                if (z10 instanceof y3) {
                    z10 = ((y3) z10).f43304b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(l4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), l4Var.M, 2);
                    l4Var.o(false, true);
                } else if (z10 instanceof e4) {
                    e4 e4Var = (e4) z10;
                    l4Var.Q(e4Var.f36353a.articles.get(e4Var.f36354b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = l4.y(view);
                    if (y3 instanceof org.telegram.ui.o1) {
                        l4Var.d = null;
                        l4Var.f36080f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.o1 o1Var = (org.telegram.ui.o1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = o1Var.f39632f;
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
        switch (this.f16764a) {
            case 1:
                g1 g1Var = (g1) this.f16765b;
                v0 v0Var = (v0) this.f16766c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var.e(f0Var, vVar, i10), new r2(f0Var, vVar, v0Var, 15));
            default:
                g1 g1Var2 = (g1) this.f16765b;
                f1 f1Var = (f1) this.f16766c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var2.e(f0Var, vVar, i10), new r2(f0Var, vVar, f1Var, 16));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        int i11;
        String str;
        boolean matches;
        switch (this.f16764a) {
            case 6:
                v4 v4Var = (v4) this.f16765b;
                v4Var.getClass();
                b2Var.dismiss();
                v4Var.W((View) this.f16766c, true);
                return;
            case 8:
                pf.d.n(((xb) this.f16765b).getParentActivity(), (String) this.f16766c, true);
                return;
            case 10:
                od.V((od) this.f16765b, (TLRPC.Chat) this.f16766c);
                return;
            case 20:
                yo yoVar = (yo) this.f16765b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f16766c);
                tL_channels_updateUsername.username = "";
                yoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new lo(yoVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.e0.Q((org.telegram.ui.Components.e0) this.f16765b, (TL_aicompose.TL_aiComposeTone) this.f16766c, b2Var);
                return;
            case 25:
                ((AtomicBoolean) this.f16765b).set(true);
                ((q0.a) this.f16766c).accept(Boolean.FALSE);
                return;
            case 26:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f16766c;
                int i12 = ((int[]) this.f16765b)[0];
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
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f16765b;
                LaunchActivity launchActivity = (LaunchActivity) this.f16766c;
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
                ((j3) this.f16765b).run(((EditText) this.f16766c).getText().toString());
                return;
            default:
                g4 g4Var = (g4) this.f16765b;
                Utilities.Callback callback = (Utilities.Callback) this.f16766c;
                String trim = g4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = f5.f26080a.matcher(trim.trim()).matches();
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
        ((dq) this.f16765b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f16766c);
    }

    @Override
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.f16765b;
        wc0 wc0Var = (wc0) this.f16766c;
        Pair pair = (Pair) obj;
        qnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            c4 c4Var = qnVar.f40443f;
            if (c4Var != null && longValue == c4Var.h(qnVar.G ? 1 : 0) && bitmap != null) {
                wc0Var.f32103x = bitmap;
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
        sn.H0((sn) this.f16765b, (Context) this.f16766c, tL_error);
        return false;
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        e6 e6Var = (e6) this.f16765b;
        ArrayList arrayList2 = e6Var.f36373c;
        ((ey) this.f16766c).finishFragment();
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
                    if (((d6) arrayList2.get(i16)).f36072c != null && ((d6) arrayList2.get(i16)).f36072c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            e6Var.f36372b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.i0(4, e6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w0(ob obVar, org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        this.f16764a = 9;
        this.f16765b = obVar;
        this.f16766c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f16764a) {
            case 19:
                ko koVar = (ko) this.f16765b;
                koVar.getClass();
                ((b2) this.f16766c).dismiss();
                koVar.N0 = false;
                if (j10 == 0) {
                    return;
                }
                koVar.f38575w0 = j10;
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.f38577x0 = chat;
                TLRPC.ChatFull chatFull = koVar.f38579y0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != koVar.H0;
                koVar.getMessagesController().toggleChannelForum(koVar.f38575w0, koVar.F0, koVar.H0);
                TLRPC.Chat chat2 = koVar.f38577x0;
                chat2.forum = koVar.F0;
                chat2.forum_tabs = koVar.H0;
                if (z10) {
                    koVar.q0();
                    return;
                }
                return;
            case 20:
            default:
                gp gpVar = (gp) this.f16765b;
                Runnable runnable = (Runnable) this.f16766c;
                if (j10 != 0) {
                    kp kpVar = gpVar.f37257x.d;
                    if (kpVar.f38589s) {
                        kpVar.v.set(0, kpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        kpVar.E = j10;
                        kpVar.f38586f = kpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                gpVar.getClass();
                return;
            case 21:
                kp kpVar2 = (kp) this.f16765b;
                n2 n2Var = (n2) this.f16766c;
                if (j10 != 0) {
                    kpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    kpVar2.Y(kpVar2.getMessagesController().getChat(Long.valueOf(j10)), n2Var);
                    return;
                }
                kpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f16766c).f20419id;
        sn snVar = ((hj) this.f16765b).f37546b;
        long j11 = snVar.f41174d4;
        if (j10 != j11) {
            return;
        }
        snVar.va(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f16766c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f16765b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
