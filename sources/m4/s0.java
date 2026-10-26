package m4;

import a8.qd;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import bi.ua;
import f9.g2;
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
import org.telegram.messenger.he;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.af1;
import org.telegram.ui.ap;
import org.telegram.ui.b6;
import org.telegram.ui.c4;
import org.telegram.ui.c6;
import org.telegram.ui.cy;
import org.telegram.ui.fn;
import org.telegram.ui.g5;
import org.telegram.ui.gj;
import org.telegram.ui.gq;
import org.telegram.ui.h4;
import org.telegram.ui.j4;
import org.telegram.ui.jp;
import org.telegram.ui.m3;
import org.telegram.ui.mo;
import org.telegram.ui.nb;
import org.telegram.ui.nd;
import org.telegram.ui.no;
import org.telegram.ui.np;
import org.telegram.ui.p3;
import org.telegram.ui.qf1;
import org.telegram.ui.sb;
import org.telegram.ui.sn;
import org.telegram.ui.t4;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.w3;
import org.telegram.ui.wb;
import org.telegram.ui.y4;
import org.telegram.ui.zh;
public final class s0 implements e2.j, h1, ni.n, org.telegram.ui.Cells.u, am0, b2, ux, y4, e5, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, ol0, ok0, MessagesStorage.BooleanCallback, ResultCallback, MessagesStorage.LongCallback, qf1 {
    public final int f18228a;
    public final Object f18229b;
    public final Object f18230c;

    public s0(int i10, Object obj, Object obj2) {
        this.f18228a = i10;
        this.f18229b = obj;
        this.f18230c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        switch (this.f18228a) {
            case 13:
                un unVar = (un) this.f18229b;
                unVar.s8(null, null);
                SendMessagesHelper.prepareSendingPhoto(unVar.getAccountInstance(), null, (Uri) this.f18230c, unVar.f44252f6, unVar.f44501z5, unVar.f44298j4, unVar.f44476x5, null, null, null, null, 0, unVar.B5, z10, i10, unVar.f44224d4, unVar.L8());
                return;
            case 14:
            default:
                fn fnVar = (fn) this.f18229b;
                MessageObject messageObject = (MessageObject) this.f18230c;
                if (z10) {
                    fnVar.f39423a.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22048id, i10);
                    return;
                } else {
                    fnVar.getClass();
                    return;
                }
            case 15:
                un unVar2 = (un) this.f18229b;
                unVar2.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f18230c, unVar2.f44252f6, unVar2.f44501z5, unVar2.f44298j4, null, false, null, null, null, z10, i10, 0, null, false));
                unVar2.Y.setFieldText("");
                unVar2.o9(false);
                return;
        }
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void a(c cVar) {
        AndroidUtilities.runOnUIThread(new jg.f1((SpannableString) this.f18229b, cVar, (ua) this.f18230c, 14));
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18228a) {
            case 0:
                j1 j1Var = (j1) this.f18229b;
                b2.u1 u1Var = (b2.u1) this.f18230c;
                n1 n1Var = (n1) obj;
                j1Var.getClass();
                f9.l0 l0Var = u1Var.H;
                if (!l0Var.isEmpty()) {
                    b2.t1 c10 = u1Var.a().c();
                    g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.r1 r1Var = (b2.r1) it.next();
                        b2.q1 q1Var = (b2.q1) j1Var.d.f10334n.get(r1Var.f3385a.f3359b);
                        if (q1Var != null && r1Var.f3385a.f3358a == q1Var.f3358a) {
                            c10.a(new b2.r1(q1Var, r1Var.f3386b));
                        } else {
                            c10.a(r1Var);
                        }
                    }
                    u1Var = c10.b();
                }
                n1Var.p(u1Var);
                return;
            case 1:
                w wVar = (w) this.f18230c;
                n1 n1Var2 = (n1) obj;
                f0 f0Var = (f0) ((j1) this.f18229b).f18091a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(wVar, false);
                    return;
                }
                return;
            default:
                j1 j1Var2 = (j1) this.f18229b;
                Surface surface = (Surface) this.f18230c;
                n1 n1Var3 = (n1) obj;
                ((f0) j1Var2.f18091a.get()).getClass();
                if (surface == null) {
                    n1Var3.T(null);
                    j1Var2.f18095i = null;
                    return;
                }
                i1 i1Var = new i1(surface);
                j1Var2.f18095i = i1Var;
                n1Var3.T(i1Var);
                return;
        }
    }

    @Override
    public void b(g5 g5Var) {
        nb nbVar = (nb) this.f18229b;
        TLRPC.User user = (TLRPC.User) this.f18230c;
        int ordinal = g5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                sb sbVar = nbVar.f41831a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22176id);
                    r2 r2Var = sbVar.f43444n;
                    if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                        r2Var.presentFragment(new un(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        nbVar.a(user);
    }

    @Override
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.f18228a) {
            case 3:
                h1 h1Var = (h1) this.f18229b;
                x0 x0Var = (x0) this.f18230c;
                if (f0Var.j()) {
                    return qd.b(new t1(-100));
                }
                return e2.n0.g0((k9.y) h1Var.c(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, x0Var, 15));
            default:
                h1 h1Var2 = (h1) this.f18229b;
                g1 g1Var = (g1) this.f18230c;
                if (f0Var.j()) {
                    return qd.b(new t1(-100));
                }
                return e2.n0.g0((k9.y) h1Var2.c(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, g1Var, 16));
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d() {
        un unVar = (un) this.f18229b;
        unVar.getClass();
        ((oi.q) this.f18230c).g();
        unVar.z9();
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        float f11;
        j4 j4Var = (j4) this.f18229b;
        m3 m3Var = (m3) this.f18230c;
        if (j4Var.K == null || i10 - 1 >= 0) {
            s9 s9Var = j4Var.P0;
            if (s9Var != null) {
                if (s9Var.x()) {
                    j4Var.P0.f(false);
                    return;
                }
                j4Var.P0.f(false);
            }
            h4 adapter = m3Var.getAdapter();
            if ((view instanceof p3) && adapter.E != null) {
                p3 p3Var = (p3) view;
                if (j4Var.H0 == 0) {
                    if ((!p3Var.f42343c || f7 >= view.getMeasuredWidth() / 2) && !p3Var.d) {
                        TLObject userOrChat = MessagesController.getInstance(j4Var.X).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            j4Var.P(adapter.E.f22182id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i11 = UserConfig.selectedAccount;
                        long j10 = adapter.E.f22182id;
                        j4Var.b0(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        j4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new he(j4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock z10 = j4.z(pageBlock);
                if (z10 instanceof w3) {
                    z10 = ((w3) z10).f44962b;
                }
                if (z10 instanceof TL_iv.pageBlockChannel) {
                    MessagesController.getInstance(j4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z10).channel), j4Var.M, 2);
                    j4Var.o(false, true);
                } else if (z10 instanceof c4) {
                    c4 c4Var = (c4) z10;
                    j4Var.Q(c4Var.f38246a.articles.get(c4Var.f38247b).url, null, null);
                } else if (z10 instanceof TL_iv.pageBlockDetails) {
                    View y3 = j4.y(view);
                    if (y3 instanceof org.telegram.ui.l1) {
                        j4Var.d = null;
                        j4Var.f39922f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int h = adapter.h();
                            adapter.M();
                            int abs = Math.abs(adapter.h() - h);
                            org.telegram.ui.l1 l1Var = (org.telegram.ui.l1) y3;
                            AnimatedArrowDrawable animatedArrowDrawable = l1Var.f41100f;
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
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        MessageObject messageObject = (MessageObject) this.f18230c;
        un unVar = ((zh) this.f18229b).f46302p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", messageObject.getId());
        bundle.putLong("report_reaction_from_dialog_id", unVar.f44252f6);
        unVar.presentFragment(new ProfileActivity(bundle, null));
        unVar.H7(true);
    }

    @Override
    public void h(e2 e2Var, int i10) {
        String str;
        switch (this.f18228a) {
            case 8:
                t4 t4Var = (t4) this.f18229b;
                t4Var.getClass();
                e2Var.dismiss();
                t4Var.X((View) this.f18230c, true);
                return;
            case 10:
                qf.d.n(((wb) this.f18229b).getParentActivity(), (String) this.f18230c, true);
                return;
            case 12:
                nd.W((nd) this.f18229b, (TLRPC.Chat) this.f18230c);
                return;
            case 23:
                ap apVar = (ap) this.f18229b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) this.f18230c);
                tL_channels_updateUsername.username = "";
                apVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new no(apVar, 0), 64);
                return;
            case 27:
                org.telegram.ui.Components.e0.P((org.telegram.ui.Components.e0) this.f18229b, (TL_aicompose.TL_aiComposeTone) this.f18230c, e2Var);
                return;
            case 28:
                ((AtomicBoolean) this.f18229b).set(true);
                ((q0.a) this.f18230c).accept(Boolean.FALSE);
                return;
            default:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f18229b;
                LaunchActivity launchActivity = (LaunchActivity) this.f18230c;
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
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((gq) this.f18229b).q0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f18230c);
    }

    @Override
    public void onComplete(Object obj) {
        sn snVar = (sn) this.f18229b;
        uc0 uc0Var = (uc0) this.f18230c;
        Pair pair = (Pair) obj;
        snVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.h4 h4Var = snVar.f43545f;
            if (h4Var != null && longValue == h4Var.h(snVar.f43555q ? 1 : 0) && bitmap != null) {
                uc0Var.f33376x = bitmap;
                uc0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        un.M0((un) this.f18229b, (Context) this.f18230c, tL_error);
        return false;
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        c6 c6Var = (c6) this.f18229b;
        ArrayList arrayList2 = c6Var.f38275c;
        ((cy) this.f18230c).finishFragment();
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
                if (i14 < c6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) c6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) c6Var.d.get(i14);
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
                if (c6Var.getMessagesController().getCacheByChatsController().getKeepMedia(c6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = c6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
        c6Var.V();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((b6) arrayList2.get(i16)).f37981c != null && ((b6) arrayList2.get(i16)).f37981c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            c6Var.f38274b.v0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(15, c6Var, keepMediaException), 150L);
        }
        return true;
    }

    public s0(nb nbVar, org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        this.f18228a = 11;
        this.f18229b = nbVar;
        this.f18230c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void run(long j10) {
        switch (this.f18228a) {
            case 22:
                mo moVar = (mo) this.f18229b;
                moVar.getClass();
                ((e2) this.f18230c).dismiss();
                moVar.M0 = false;
                if (j10 == 0) {
                    return;
                }
                moVar.f41624v0 = j10;
                TLRPC.Chat chat = moVar.getMessagesController().getChat(Long.valueOf(j10));
                moVar.f41626w0 = chat;
                TLRPC.ChatFull chatFull = moVar.f41628x0;
                if (chatFull != null) {
                    chatFull.hidden_prehistory = true;
                }
                boolean z10 = chat.forum_tabs != moVar.G0;
                moVar.getMessagesController().toggleChannelForum(moVar.f41624v0, moVar.E0, moVar.G0);
                TLRPC.Chat chat2 = moVar.f41626w0;
                chat2.forum = moVar.E0;
                chat2.forum_tabs = moVar.G0;
                if (z10) {
                    moVar.r0();
                    return;
                }
                return;
            case 23:
            default:
                jp jpVar = (jp) this.f18229b;
                Runnable runnable = (Runnable) this.f18230c;
                if (j10 != 0) {
                    np npVar = jpVar.f40713x.d;
                    if (npVar.f41967s) {
                        npVar.v.set(0, npVar.getMessagesController().getChat(Long.valueOf(j10)));
                    } else {
                        npVar.E = j10;
                        npVar.f41964f = npVar.getMessagesController().getChat(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                jpVar.getClass();
                return;
            case 24:
                np npVar2 = (np) this.f18229b;
                r2 r2Var = (r2) this.f18230c;
                if (j10 != 0) {
                    npVar2.getMessagesController().toggleChannelInvitesHistory(j10, false);
                    npVar2.Z(npVar2.getMessagesController().getChat(Long.valueOf(j10)), r2Var);
                    return;
                }
                npVar2.getClass();
                return;
        }
    }

    @Override
    public void run(boolean z10) {
        long j10 = ((TLRPC.User) this.f18230c).f22176id;
        un unVar = ((gj) this.f18229b).f39709b;
        long j11 = unVar.f44373p4;
        if (j10 != j11) {
            return;
        }
        unVar.Aa(j11, false);
    }

    @Override
    public void run(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f18230c;
        FileLog.e("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f18229b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
