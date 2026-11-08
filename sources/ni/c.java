package ni;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import bg.f0;
import bi.t0;
import bi.ya;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.z0;
import org.telegram.messenger.a8;
import org.telegram.messenger.bp;
import org.telegram.messenger.ez;
import org.telegram.messenger.fd;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.im;
import org.telegram.messenger.m5;
import org.telegram.messenger.oc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.s2;
import org.telegram.messenger.sr;
import org.telegram.messenger.t3;
import org.telegram.messenger.tr;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r3;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.c5;
import org.telegram.ui.e4;
import org.telegram.ui.eb;
import org.telegram.ui.g4;
import org.telegram.ui.go;
import org.telegram.ui.j1;
import org.telegram.ui.jb;
import org.telegram.ui.k3;
import org.telegram.ui.kp;
import org.telegram.ui.lm;
import org.telegram.ui.ma1;
import org.telegram.ui.mb;
import org.telegram.ui.n3;
import org.telegram.ui.oh;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.pn;
import org.telegram.ui.qn;
import org.telegram.ui.qw;
import org.telegram.ui.si;
import org.telegram.ui.so;
import org.telegram.ui.u3;
import org.telegram.ui.u4;
import org.telegram.ui.w5;
import org.telegram.ui.w91;
import org.telegram.ui.ww;
import org.telegram.ui.x5;
import org.telegram.ui.ym;
public final class c implements p, u, cj0, r1, qw, u4, t4, bp, oc, qi0, qh0, qr, ResultCallback, tr, ma1 {
    public final int f20616a;
    public final Object f20617b;
    public final Object f20618c;

    public c(int i7, Object obj, Object obj2) {
        this.f20616a = i7;
        this.f20617b = obj;
        this.f20618c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f20616a) {
            case 8:
                an anVar = (an) this.f20617b;
                anVar.C8();
                gz.Y(anVar.getAccountInstance(), (Uri) this.f20618c, anVar.f43848j6, anVar.D5, anVar.f43870l4, null, anVar.F5, z9, i7, anVar.W8());
                return;
            case 9:
            default:
                lm lmVar = (lm) this.f20617b;
                ij ijVar = (ij) this.f20618c;
                if (z9) {
                    lmVar.f47557a.getMessagesController().v(ijVar.f23262k.f26977id, i7, m5.o(ijVar.f23262k.peer_id), null, false);
                    return;
                }
                return;
            case 10:
                an anVar2 = (an) this.f20617b;
                anVar2.getSendMessagesHelper().r0(ez.b((String) this.f20618c, anVar2.f43848j6, anVar2.D5, anVar2.f43870l4, null, false, null, null, null, z9, i7, 0, null, false));
                anVar2.Z.setFieldText("");
                anVar2.B9(false);
                return;
        }
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        an.O0((an) this.f20617b, (Context) this.f20618c, tL_error);
        return false;
    }

    @Override
    public void b(j2.n nVar) {
        g0.h3(new z0((SpannableString) this.f20617b, nVar, (ya) this.f20618c, 12));
    }

    @Override
    public void c(c5 c5Var) {
        eb ebVar = (eb) this.f20617b;
        TLRPC.User user = (TLRPC.User) this.f20618c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                jb jbVar = ebVar.f45252a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27105id);
                    f2 f2Var = jbVar.f46918n;
                    if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                        f2Var.presentFragment(new an(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ebVar.a(user);
    }

    @Override
    public void d(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        ij ijVar = (ij) this.f20618c;
        an anVar = ((oh) this.f20617b).f48405p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", ijVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", anVar.f43848j6);
        anVar.presentFragment(new ProfileActivity(bundle, null));
        anVar.O7(true);
    }

    @Override
    public void e() {
        an anVar = (an) this.f20617b;
        anVar.getClass();
        ((oi.q) this.f20618c).g();
        anVar.M9();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        float f12;
        g4 g4Var = (g4) this.f20617b;
        k3 k3Var = (k3) this.f20618c;
        if (g4Var.K == null || i7 - 1 >= 0) {
            i9 i9Var = g4Var.P0;
            if (i9Var != null) {
                if (i9Var.x()) {
                    g4Var.P0.f(false);
                    return;
                }
                g4Var.P0.f(false);
            }
            e4 adapter = k3Var.getAdapter();
            if ((view instanceof n3) && adapter.E != null) {
                n3 n3Var = (n3) view;
                if (g4Var.H0 == 0) {
                    if ((!n3Var.f47946c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject f22 = qp.s1(g4Var.X).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.E.f27111id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = p10.f24470s0;
                        long j3 = adapter.E.f27111id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.H0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new im(g4Var, i10, j3));
                    }
                }
            } else if (i7 >= 0 && i7 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
                TL_iv.PageBlock x10 = g4.x(pageBlock);
                if (x10 instanceof u3) {
                    x10 = ((u3) x10).f50201b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    qp.s1(g4Var.X).y3(t3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.M, 2, null);
                    g4Var.m(false, true);
                } else if (x10 instanceof a4) {
                    a4 a4Var = (a4) x10;
                    g4Var.O(a4Var.f43561a.articles.get(a4Var.f43562b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = g4.w(view);
                    if (w10 instanceof j1) {
                        g4Var.d = null;
                        g4Var.f48270f = null;
                        if (adapter.f45186e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            j1 j1Var = (j1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = j1Var.f46814f;
                            if (pageblockdetails.open) {
                                f12 = 0.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            animatedArrowDrawable.a(f12);
                            j1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.o(i7 + 1, abs);
                                } else {
                                    adapter.p(i7 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        String str;
        int i10;
        switch (this.f20616a) {
            case 3:
                p4 p4Var = (p4) this.f20617b;
                p4Var.getClass();
                u1Var.dismiss();
                p4Var.b0((View) this.f20618c, true);
                return;
            case 5:
                vf.c.p(((mb) this.f20617b).getParentActivity(), (String) this.f20618c, true);
                return;
            case 7:
                bd.a0((bd) this.f20617b, (TLRPC.Chat) this.f20618c);
                return;
            case 18:
                go goVar = (go) this.f20617b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = qp.i1((TLRPC.Chat) this.f20618c);
                tL_channels_updateUsername.username = "";
                goVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new qn(goVar, 0), 64);
                return;
            case 22:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.f20617b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f20618c;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(g0Var.f28616a).sendRequestTyped(deletetone, new d3.b(1), new t0(g0Var, h, tL_aiComposeTone, 3));
                return;
            case 23:
                ((f0) this.f20617b).k(((boolean[]) this.f20618c)[0]);
                return;
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f20617b;
                LaunchActivity launchActivity = (LaunchActivity) this.f20618c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                fd G0 = id.E0().G0(str);
                fd fdVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f22396a = tL_langPackLanguage.native_name;
                    obj.f22397b = tL_langPackLanguage.name;
                    obj.f22398c = tL_langPackLanguage.lang_code;
                    obj.f22399e = tL_langPackLanguage.base_lang_code;
                    obj.f22400f = tL_langPackLanguage.plural_code;
                    obj.f22401g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        fdVar = obj;
                    } else {
                        obj.d = "unofficial";
                        fdVar = obj;
                    }
                }
                id.E0().c(fdVar, true, false, false, true, p10.f24470s0, null);
                launchActivity.y0(true);
                return;
            case 25:
                org.telegram.ui.Components.f2 f2Var = (org.telegram.ui.Components.f2) this.f20617b;
                boolean[] zArr = (boolean[]) this.f20618c;
                boolean z9 = zArr[0];
                boolean z10 = zArr[1];
                ww wwVar = (ww) f2Var.f33445b;
                ArrayList arrayList = (ArrayList) f2Var.f33446c;
                wwVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z9) {
                        wwVar.getMessagesController().o4(longValue, wwVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z10) {
                        wwVar.getMessagesController().X(0, longValue, true);
                    }
                    wwVar.getMessagesController().w(longValue);
                }
                wwVar.n4(false);
                return;
            case 26:
                u1Var.dismiss();
                ((org.telegram.messenger.voip.k) this.f20617b).a(((EditText) this.f20618c).getText().toString());
                return;
            case 27:
                sr srVar = (sr) this.f20618c;
                int i12 = ((int[]) this.f20617b)[0];
                if (i12 == 0) {
                    i10 = 900;
                } else if (i12 == 1) {
                    i10 = 3600;
                } else if (i12 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                srVar.a(i10);
                return;
            case 28:
                ((AtomicBoolean) this.f20617b).set(true);
                ((q0.a) this.f20618c).accept(Boolean.FALSE);
                return;
            default:
                String str2 = (String) this.f20617b;
                f2 f2Var2 = (f2) this.f20618c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", g5.r(f2Var2.getCurrentAccount()).s(1));
                    f2Var2.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((kp) this.f20617b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f20618c);
    }

    @Override
    public void k(boolean z9) {
        long j3 = ((TLRPC.User) this.f20618c).f27105id;
        an anVar = ((si) this.f20617b).f49769b;
        long j10 = anVar.f43945r4;
        if (j3 != j10) {
            return;
        }
        anVar.Qa(j10, false);
    }

    @Override
    public void onComplete(Object obj) {
        ym ymVar = (ym) this.f20617b;
        qa0 qa0Var = (qa0) this.f20618c;
        Pair pair = (Pair) obj;
        ymVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            r3 r3Var = ymVar.f52250f;
            if (r3Var != null && longValue == r3Var.h(ymVar.f52260q ? 1 : 0) && bitmap != null) {
                qa0Var.f37272x = bitmap;
                qa0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void r(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f20618c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f20617b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(long j3) {
        boolean z9;
        switch (this.f20616a) {
            case 17:
                pn pnVar = (pn) this.f20617b;
                pnVar.getClass();
                ((u1) this.f20618c).dismiss();
                boolean z10 = false;
                pnVar.N0 = false;
                if (j3 != 0) {
                    pnVar.f48887v0 = j3;
                    TLRPC.Chat M0 = pnVar.getMessagesController().M0(Long.valueOf(j3));
                    pnVar.f48889w0 = M0;
                    TLRPC.ChatFull chatFull = pnVar.f48891x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (M0.forum_tabs != pnVar.G0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (M0.forum_sidebar != pnVar.H0) {
                        z10 = true;
                    }
                    pnVar.getMessagesController().a5(pnVar.f48887v0, pnVar.E0, pnVar.G0, pnVar.H0);
                    TLRPC.Chat chat = pnVar.f48889w0;
                    chat.forum = pnVar.E0;
                    chat.forum_tabs = pnVar.G0;
                    chat.forum_sidebar = pnVar.H0;
                    if (z9 || z10) {
                        pnVar.v0(z9);
                        return;
                    }
                    return;
                }
                return;
            case 18:
            default:
                oo ooVar = (oo) this.f20617b;
                Runnable runnable = (Runnable) this.f20618c;
                if (j3 != 0) {
                    so soVar = ooVar.f48456y.d;
                    if (soVar.f49794s) {
                        soVar.f49795w.set(0, soVar.getMessagesController().M0(Long.valueOf(j3)));
                    } else {
                        soVar.E = j3;
                        soVar.f49791f = soVar.getMessagesController().M0(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                ooVar.getClass();
                return;
            case 19:
                so soVar2 = (so) this.f20617b;
                f2 f2Var = (f2) this.f20618c;
                if (j3 != 0) {
                    soVar2.getMessagesController().b5(j3, false);
                    soVar2.d0(soVar2.getMessagesController().M0(Long.valueOf(j3)), f2Var);
                    return;
                }
                soVar2.getClass();
                return;
        }
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        x5 x5Var = (x5) this.f20617b;
        ArrayList arrayList2 = x5Var.f51772c;
        ((ww) this.f20618c).finishFragment();
        s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < x5Var.d.size()) {
                    if (((s2) x5Var.d.get(i13)).f25407a == ((xr) arrayList.get(i12)).f26520a) {
                        s2Var = (s2) x5Var.d.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                int i14 = 2;
                if (x5Var.getMessagesController().f24887r7.c(x5Var.f51773e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = x5Var.d;
                s2 s2Var2 = new s2(((xr) arrayList.get(i12)).f26520a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        x5Var.getMessagesController().f24887r7.h(x5Var.f51773e, x5Var.d);
        x5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((w5) arrayList2.get(i15)).f50901c != null && ((w5) arrayList2.get(i15)).f50901c.f25407a == s2Var.f25407a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            x5Var.f51771b.v0(i11);
            g0.i3(new org.telegram.ui.ActionBar.p(11, x5Var, s2Var), 150L);
        }
        return true;
    }

    public c(eb ebVar, q1 q1Var, TLRPC.User user) {
        this.f20616a = 6;
        this.f20617b = ebVar;
        this.f20618c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
