package m4;

import ai.u2;
import ai.va;
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
import ig.d2;
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
import org.telegram.messenger.fe;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c6;
import org.telegram.ui.d4;
import org.telegram.ui.d6;
import org.telegram.ui.dn;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.fj;
import org.telegram.ui.gp;
import org.telegram.ui.h5;
import org.telegram.ui.i4;
import org.telegram.ui.k4;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.lo;
import org.telegram.ui.mb;
import org.telegram.ui.md;
import org.telegram.ui.n3;
import org.telegram.ui.nf1;
import org.telegram.ui.q3;
import org.telegram.ui.qn;
import org.telegram.ui.rb;
import org.telegram.ui.sn;
import org.telegram.ui.u4;
import org.telegram.ui.vb;
import org.telegram.ui.x3;
import org.telegram.ui.xe1;
import org.telegram.ui.xx;
import org.telegram.ui.yh;
import org.telegram.ui.yo;
import org.telegram.ui.z4;
import v7.q8;
public final class w0 implements e2.j, g1, mi.n, org.telegram.ui.Cells.u, am0, z1, xx, z4, b5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, ok0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, nf1 {
    public final int f16828a;
    public final Object f16829b;
    public final Object f16830c;

    public w0(int i10, Object obj, Object obj2) {
        this.f16828a = i10;
        this.f16829b = obj;
        this.f16830c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f16828a) {
            case 11:
                sn snVar = (sn) this.f16829b;
                snVar.o8(null, null);
                SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), null, (Uri) this.f16830c, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, snVar.f41739x5, null, null, null, null, 0, snVar.B5, z10, i10, snVar.f41489d4, snVar.H8());
                return;
            case 12:
                sn snVar2 = (sn) this.f16829b;
                snVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f16830c, snVar2.f41516f6, snVar2.f41764z5, snVar2.f41561j4, null, false, null, null, null, z10, i10, 0, null, false));
                snVar2.Y.setFieldText("");
                snVar2.j9(false);
                return;
            default:
                dn dnVar = (dn) this.f16829b;
                MessageObject messageObject = (MessageObject) this.f16830c;
                if (z10) {
                    dnVar.f36651a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f20365id, i10);
                    return;
                } else {
                    dnVar.getClass();
                    return;
                }
        }
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Object a(f0 f0Var, v vVar, int i10) {
        switch (this.f16828a) {
            case 1:
                g1 g1Var = (g1) this.f16829b;
                v0 v0Var = (v0) this.f16830c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var.a(f0Var, vVar, i10), new u2(f0Var, vVar, v0Var, 15));
            default:
                g1 g1Var2 = (g1) this.f16829b;
                f1 f1Var = (f1) this.f16830c;
                if (f0Var.j()) {
                    return q8.b(new s1(-100));
                }
                return e2.m0.g0((j9.y) g1Var2.a(f0Var, vVar, i10), new u2(f0Var, vVar, f1Var, 16));
        }
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16829b;
        Surface surface = (Surface) this.f16830c;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16626a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16630i = null;
            return;
        }
        h1 h1Var = new h1(surface);
        i1Var.f16630i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void b(h5 h5Var) {
        mb mbVar = (mb) this.f16829b;
        TLRPC.User user = (TLRPC.User) this.f16830c;
        int ordinal = h5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                rb rbVar = mbVar.f39530a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20491id);
                    o2 o2Var = rbVar.f41085n;
                    if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                        o2Var.presentFragment(new sn(bundle));
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
    public void c(float f7, float f10, int i10, View view) {
        float f11;
        k4 k4Var = (k4) this.f16829b;
        n3 n3Var = (n3) this.f16830c;
        if (k4Var.K == null || i10 - 1 >= 0) {
            o9 o9Var = k4Var.P0;
            if (o9Var != null) {
                if (o9Var.x()) {
                    k4Var.P0.f(false);
                    return;
                }
                k4Var.P0.f(false);
            }
            i4 adapter = n3Var.getAdapter();
            if ((view instanceof q3) && adapter.E != null) {
                q3 q3Var = (q3) view;
                if (k4Var.H0 == 0) {
                    if ((!q3Var.f40702c || f7 >= view.getMeasuredWidth() / 2) && !q3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(k4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            k4Var.P(adapter.E.f20497id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.f20497id;
                        k4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        k4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new fe(k4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = k4.z(pageBlock);
                if (z10 instanceof x3) {
                    z10 = ((x3) z10).f43461b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(k4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), k4Var.M, 2);
                    k4Var.o(false, true);
                } else if (z10 instanceof d4) {
                    d4 d4Var = (d4) z10;
                    k4Var.Q(d4Var.f36463a.articles.get(d4Var.f36464b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = k4.y(view);
                    if (y3 instanceof org.telegram.ui.n1) {
                        k4Var.d = null;
                        k4Var.f37217f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = n1Var.f39688f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
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
    public void d(mi.q qVar) {
        AndroidUtilities.runOnUIThread(new d2((SpannableString) this.f16829b, qVar, (va) this.f16830c, 11));
    }

    @Override
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f16830c;
        sn snVar = ((yh) this.f16829b).f43861p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", snVar.f41516f6);
        snVar.presentFragment(new ProfileActivity(bundle, null));
        snVar.D7(true);
    }

    @Override
    public void g(c2 c2Var, int i10) {
        String str;
        int i11;
        boolean matches;
        switch (this.f16828a) {
            case 6:
                u4 u4Var = (u4) this.f16829b;
                u4Var.getClass();
                c2Var.dismiss();
                u4Var.W((View) this.f16830c, true);
                return;
            case 8:
                pf.d.n(((vb) this.f16829b).getParentActivity(), (String) this.f16830c, true);
                return;
            case 10:
                md.V((md) this.f16829b, (TLRPC.Chat) this.f16830c);
                return;
            case 20:
                yo yoVar = (yo) this.f16829b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f16830c);
                tL_channels_updateUsername.username = "";
                yoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new lo(yoVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f16829b, (TL_aicompose.TL_aiComposeTone) this.f16830c, c2Var);
                return;
            case 25:
                ((AtomicBoolean) this.f16829b).set(true);
                ((q0.a) this.f16830c).accept(Boolean.FALSE);
                return;
            case 26:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f16829b;
                LaunchActivity launchActivity = (LaunchActivity) this.f16830c;
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
                launchActivity.z0(true);
                return;
            case 27:
                c2Var.dismiss();
                ((m3) this.f16829b).run(((EditText) this.f16830c).getText().toString());
                return;
            case 28:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f16830c;
                int i12 = ((int[]) this.f16829b)[0];
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
                e4 e4Var = (e4) this.f16829b;
                Utilities.Callback callback = (Utilities.Callback) this.f16830c;
                String trim = e4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = d5.f25562a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(e4Var);
                    return;
                }
                callback.run(trim);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((dq) this.f16829b).p0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f16830c);
    }

    @Override
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.f16829b;
        wc0 wc0Var = (wc0) this.f16830c;
        Pair pair = (Pair) obj;
        qnVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            f4 f4Var = qnVar.f40882f;
            if (f4Var != null && longValue == f4Var.h(qnVar.f40892q ? 1 : 0) && bitmap != null) {
                wc0Var.f32212x = bitmap;
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
        sn.L0((sn) this.f16829b, (Context) this.f16830c, tL_error);
        return false;
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        d6 d6Var = (d6) this.f16829b;
        ArrayList arrayList2 = d6Var.f36485c;
        ((ey) this.f16830c).finishFragment();
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
                if (i14 < d6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) d6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) d6Var.d.get(i14);
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
                    if (((c6) arrayList2.get(i16)).f36228c != null && ((c6) arrayList2.get(i16)).f36228c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            d6Var.f36484b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.h0(4, d6Var, keepMediaException), 150L);
        }
        return true;
    }

    public w0(mb mbVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        this.f16828a = 9;
        this.f16829b = mbVar;
        this.f16830c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f16828a) {
            case 19:
                ko koVar = (ko) this.f16829b;
                koVar.getClass();
                ((c2) this.f16830c).dismiss();
                koVar.M0 = false;
                if (j10 == 0) {
                    return;
                }
                koVar.f38978v0 = j10;
                TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(j10));
                koVar.f38980w0 = chat;
                TLRPC.ChatFull chatFull = koVar.f38982x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != koVar.G0;
                koVar.getMessagesController().toggleChannelForum(koVar.f38978v0, koVar.E0, koVar.G0);
                TLRPC.Chat chat2 = koVar.f38980w0;
                chat2.forum = koVar.E0;
                chat2.forum_tabs = koVar.G0;
                if (z10) {
                    koVar.q0();
                    return;
                }
                return;
            case 20:
            default:
                gp gpVar = (gp) this.f16829b;
                Runnable runnable = (Runnable) this.f16830c;
                if (j10 != 0) {
                    kp kpVar = gpVar.f37621x.d;
                    if (kpVar.f38994s) {
                        kpVar.v.set(0, kpVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        kpVar.E = j10;
                        kpVar.f38991f = kpVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                gpVar.getClass();
                return;
            case 21:
                kp kpVar2 = (kp) this.f16829b;
                o2 o2Var = (o2) this.f16830c;
                if (j10 != 0) {
                    kpVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    kpVar2.Y(kpVar2.getMessagesController().getChat(Long.valueOf(j10)), o2Var);
                    return;
                }
                kpVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f16830c).f20491id;
        sn snVar = ((fj) this.f16829b).f37347b;
        long j11 = snVar.f41635p4;
        if (j10 != j11) {
            return;
        }
        snVar.va(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f16830c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f16829b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
