package oi;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.cd;
import org.telegram.messenger.cm;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mc;
import org.telegram.messenger.mp;
import org.telegram.messenger.nr;
import org.telegram.messenger.or;
import org.telegram.messenger.sr;
import org.telegram.messenger.xo;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.at;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.db;
import org.telegram.ui.ib;
import org.telegram.ui.jo;
import org.telegram.ui.lb;
import org.telegram.ui.mm;
import org.telegram.ui.nh;
import org.telegram.ui.np;
import org.telegram.ui.oa1;
import org.telegram.ui.rn;
import org.telegram.ui.ro;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
import org.telegram.ui.vo;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
import org.telegram.ui.zm;
public final class e0 implements kt, f4, org.telegram.ui.Cells.u, pj0, org.telegram.ui.ActionBar.r1, ww, org.telegram.ui.u4, org.telegram.ui.Components.z4, xo, mc, ej0, di0, lr, ResultCallback, or, oa1 {
    public final int f22004a;
    public final Object f22005b;
    public final Object f22006c;

    public e0(int i7, Object obj, Object obj2) {
        this.f22004a = i7;
        this.f22005b = obj;
        this.f22006c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f22004a) {
            case 10:
                bn bnVar = (bn) this.f22005b;
                bnVar.E8();
                zy.Y(bnVar.getAccountInstance(), (Uri) this.f22006c, bnVar.f46076l6, bnVar.F5, bnVar.f46087m4, null, bnVar.H5, z10, i7, bnVar.Y8());
                return;
            case 11:
            default:
                mm mmVar = (mm) this.f22005b;
                fj fjVar = (fj) this.f22006c;
                if (z10) {
                    mmVar.f49896a.getMessagesController().v(fjVar.f23965k.f28424id, i7, org.telegram.messenger.n5.o(fjVar.f23965k.peer_id), null, false);
                    return;
                }
                return;
            case 12:
                bn bnVar2 = (bn) this.f22005b;
                bnVar2.getSendMessagesHelper().r0(xy.b((String) this.f22006c, bnVar2.f46076l6, bnVar2.F5, bnVar2.f46087m4, null, false, null, null, null, z10, i7, 0, null, false));
                bnVar2.f45923a0.setFieldText("");
                bnVar2.D9(false);
                return;
        }
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        fj fjVar = (fj) this.f22006c;
        bn bnVar = ((nh) this.f22005b).f50183p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", fjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", bnVar.f46076l6);
        bnVar.presentFragment(new ProfileActivity(bundle, null));
        bnVar.P7(true);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(org.telegram.ui.c5 c5Var) {
        db dbVar = (db) this.f22005b;
        TLRPC.User user = (TLRPC.User) this.f22006c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ib ibVar = dbVar.f46850a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28552id);
                    org.telegram.ui.ActionBar.h2 h2Var = ibVar.f48684n;
                    if (h2Var.getMessagesController().E(bundle, h2Var, null, null)) {
                        h2Var.presentFragment(new bn(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        dbVar.a(user);
    }

    @Override
    public void d(boolean z10) {
        long j3 = ((TLRPC.User) this.f22006c).f28552id;
        bn bnVar = ((ti) this.f22005b).f52288b;
        long j10 = bnVar.f46164s4;
        if (j3 != j10) {
            return;
        }
        bnVar.Ta(j10, false);
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        bn.Q0((bn) this.f22005b, (Context) this.f22006c, tL_error);
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        float f12;
        org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f22005b;
        org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f22006c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            j9 j9Var = g4Var.Q0;
            if (j9Var != null) {
                if (j9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            org.telegram.ui.e4 adapter = k3Var.getAdapter();
            if ((view instanceof org.telegram.ui.n3) && adapter.F != null) {
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.f50046c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject h22 = mp.u1(g4Var.Y).h2("previews");
                        if (h22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.f28558id, (TLRPC.User) h22);
                            return;
                        }
                        int i10 = j10.f24770t0;
                        long j3 = adapter.F.f28558id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new cm(g4Var, i10, j3));
                    }
                }
            } else if (i7 >= 0 && i7 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
                TL_iv.PageBlock x10 = org.telegram.ui.g4.x(pageBlock);
                if (x10 instanceof org.telegram.ui.u3) {
                    x10 = ((org.telegram.ui.u3) x10).f52418b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    mp.u1(g4Var.Y).F3(org.telegram.messenger.v3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                    g4Var.m(false, true);
                } else if (x10 instanceof org.telegram.ui.a4) {
                    org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) x10;
                    g4Var.O(a4Var.f45448a.articles.get(a4Var.f45449b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = org.telegram.ui.g4.w(view);
                    if (w10 instanceof org.telegram.ui.j1) {
                        g4Var.d = null;
                        g4Var.f50710f = null;
                        if (adapter.f47049e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            org.telegram.ui.j1 j1Var = (org.telegram.ui.j1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = j1Var.f48847f;
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
    public void g() {
        switch (this.f22004a) {
            case 0:
                ((h0) this.f22005b).i();
                ((g0) this.f22006c).k2();
                return;
            default:
                l5 l5Var = (l5) this.f22005b;
                o5 o5Var = (o5) this.f22006c;
                TL_iv.pageTableCell pagetablecell = o5Var.f22224b;
                if (pagetablecell != null) {
                    d6.d(pagetablecell, o5Var.f22223a.getText());
                }
                a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.f22439a != null) {
                    s3.S1(a3Var.f21932a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str;
        int i10;
        switch (this.f22004a) {
            case 5:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.f22005b;
                p4Var.getClass();
                u1Var.dismiss();
                p4Var.b0((View) this.f22006c, true);
                return;
            case 7:
                vf.c.p(((lb) this.f22005b).getParentActivity(), (String) this.f22006c, true);
                return;
            case 9:
                ad.a0((ad) this.f22005b, (TLRPC.Chat) this.f22006c);
                return;
            case 20:
                jo joVar = (jo) this.f22005b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = mp.k1((TLRPC.Chat) this.f22006c);
                tL_channels_updateUsername.username = "";
                joVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new sn(joVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.f22005b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f22006c;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(m0Var.f30187a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(m0Var, h, tL_aiComposeTone, 6));
                return;
            case 25:
                ((bg.g0) this.f22005b).d(((boolean[]) this.f22006c)[0]);
                return;
            case 26:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f22005b;
                LaunchActivity launchActivity = (LaunchActivity) this.f22006c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                cd G0 = gd.E0().G0(str);
                cd cdVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f23328a = tL_langPackLanguage.native_name;
                    obj.f23329b = tL_langPackLanguage.name;
                    obj.f23330c = tL_langPackLanguage.lang_code;
                    obj.f23331e = tL_langPackLanguage.base_lang_code;
                    obj.f23332f = tL_langPackLanguage.plural_code;
                    obj.f23333g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        cdVar = obj;
                    } else {
                        obj.d = "unofficial";
                        cdVar = obj;
                    }
                }
                gd.E0().c(cdVar, true, false, false, true, j10.f24770t0, null);
                launchActivity.y0(true);
                return;
            case 27:
                at atVar = (at) this.f22005b;
                boolean[] zArr = (boolean[]) this.f22006c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                cx cxVar = (cx) atVar.f45657b;
                ArrayList arrayList = (ArrayList) atVar.f45658c;
                cxVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        cxVar.getMessagesController().w4(longValue, cxVar.getMessagesController().c2(l10), null, null, false);
                    }
                    if (z11) {
                        cxVar.getMessagesController().X(0, longValue, true);
                    }
                    cxVar.getMessagesController().w(longValue);
                }
                cxVar.p4(false);
                return;
            case 28:
                u1Var.dismiss();
                ((li.d) this.f22005b).a(((EditText) this.f22006c).getText().toString());
                return;
            default:
                nr nrVar = (nr) this.f22006c;
                int i12 = ((int[]) this.f22005b)[0];
                if (i12 == 0) {
                    i10 = 900;
                } else if (i12 == 1) {
                    i10 = 3600;
                } else if (i12 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                nrVar.a(i10);
                return;
        }
    }

    @Override
    public void i() {
        bn bnVar = (bn) this.f22005b;
        bnVar.getClass();
        ((ri.q) this.f22006c).g();
        bnVar.O9();
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((np) this.f22005b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f22006c);
    }

    @Override
    public void onComplete(Object obj) {
        zm zmVar = (zm) this.f22005b;
        bb0 bb0Var = (bb0) this.f22006c;
        Pair pair = (Pair) obj;
        zmVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.t3 t3Var = zmVar.f54538f;
            if (t3Var != null && longValue == t3Var.h(zmVar.f54548q ? 1 : 0) && bitmap != null) {
                bb0Var.f33647x = bitmap;
                bb0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void q(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f22006c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f22005b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(long j3) {
        boolean z10;
        switch (this.f22004a) {
            case 1:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                ((p3) this.f22005b).a((String) this.f22006c, tL_inlineButtonTypeUserProfile);
                return;
            case 19:
                rn rnVar = (rn) this.f22005b;
                rnVar.getClass();
                ((org.telegram.ui.ActionBar.u1) this.f22006c).dismiss();
                boolean z11 = false;
                rnVar.O0 = false;
                if (j3 != 0) {
                    rnVar.f51694w0 = j3;
                    TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                    rnVar.f51696x0 = O0;
                    TLRPC.ChatFull chatFull = rnVar.f51698y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (O0.forum_tabs != rnVar.H0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (O0.forum_sidebar != rnVar.I0) {
                        z11 = true;
                    }
                    rnVar.getMessagesController().m5(rnVar.f51694w0, rnVar.F0, rnVar.H0, rnVar.I0);
                    TLRPC.Chat chat = rnVar.f51696x0;
                    chat.forum = rnVar.F0;
                    chat.forum_tabs = rnVar.H0;
                    chat.forum_sidebar = rnVar.I0;
                    if (z10 || z11) {
                        rnVar.v0(z10);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                vo voVar = (vo) this.f22005b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f22006c;
                if (j3 != 0) {
                    voVar.getMessagesController().n5(j3, false);
                    voVar.d0(voVar.getMessagesController().O0(Long.valueOf(j3)), h2Var);
                    return;
                }
                voVar.getClass();
                return;
            default:
                ro roVar = (ro) this.f22005b;
                Runnable runnable = (Runnable) this.f22006c;
                if (j3 != 0) {
                    vo voVar2 = roVar.f51708y.d;
                    if (voVar2.f52820s) {
                        voVar2.f52821w.set(0, voVar2.getMessagesController().O0(Long.valueOf(j3)));
                    } else {
                        voVar2.F = j3;
                        voVar2.f52817f = voVar2.getMessagesController().O0(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                roVar.getClass();
                return;
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) this.f22005b;
        ArrayList arrayList2 = x5Var.f53589c;
        ((cx) this.f22006c).finishFragment();
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < x5Var.d.size()) {
                    if (((org.telegram.messenger.t2) x5Var.d.get(i13)).f26932a == ((sr) arrayList.get(i12)).f26845a) {
                        t2Var = (org.telegram.messenger.t2) x5Var.d.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i14 = 2;
                if (x5Var.getMessagesController().f25778u7.c(x5Var.f53590e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = x5Var.d;
                org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((sr) arrayList.get(i12)).f26845a, i14);
                arrayList3.add(t2Var2);
                t2Var = t2Var2;
            }
            i12++;
        }
        x5Var.getMessagesController().f25778u7.h(x5Var.f53590e, x5Var.d);
        x5Var.Z();
        if (t2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.w5) arrayList2.get(i15)).f52928c != null && ((org.telegram.ui.w5) arrayList2.get(i15)).f52928c.f26932a == t2Var.f26932a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            x5Var.f53588b.v0(i11);
            org.telegram.messenger.g0.h3(new s2(26, x5Var, t2Var), 150L);
        }
        return true;
    }

    public e0(db dbVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        this.f22004a = 8;
        this.f22005b = dbVar;
        this.f22006c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
