package ai;

import a8.ma;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import bi.f5;
import bi.i5;
import bi.l4;
import di.s4;
import di.y8;
import fi.p6;
import hi.nb;
import hi.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.l3;
import oi.q3;
import oi.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.ip;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.sd;
import org.telegram.ui.td;
public final class u0 implements Runnable {
    public final int f1547a;
    public final int f1548b;
    public final Object f1549c;

    public u0(int i7, Object obj, int i10) {
        this.f1547a = i10;
        this.f1548b = i7;
        this.f1549c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        ji.q qVar;
        int i10 = this.f1547a;
        int i11 = -1;
        boolean z11 = false;
        int i12 = this.f1548b;
        Object obj = this.f1549c;
        switch (i10) {
            case 0:
                ExecutorService executorService = DictationLid.f43150a;
                ((s1) obj).a(Integer.valueOf(i12));
                return;
            case 1:
                ExecutorService executorService2 = DictationLid.f43150a;
                ((z0) obj).a(null, 0L, i12);
                return;
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", i10.i(i12).f24656n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                fc t6 = l4.h().t(gd.a0(null, null, i12, (String) obj), null);
                t6.f35101t = true;
                t6.j();
                return;
            case 4:
                ((f5) obj).L0(i12);
                return;
            case 5:
                ch.f fVar = (ch.f) obj;
                if (fVar.f5343b) {
                    w10 w10Var = fVar.d;
                    if (w10Var != null) {
                        if (i12 < 300) {
                            z11 = true;
                        }
                        w10Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f5342a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f5344c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.h3(new u0(fVar, max, 5), max);
                    return;
                }
                return;
            case 6:
                ((di.o0) obj).L0(i12, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((y8) obj).f10046a).cancelRequest(i12, true);
                return;
            case 8:
                ((f2.g) obj).f11031b.onAudioFocusChange(i12);
                return;
            case 9:
                p6 p6Var = (p6) obj;
                ArrayList arrayList3 = p6Var.f12392g;
                p6Var.v(arrayList3);
                s4 s4Var = p6Var.J;
                Collections.sort(arrayList3, s4Var);
                ArrayList arrayList4 = p6Var.h;
                p6Var.v(arrayList4);
                Collections.sort(arrayList4, s4Var);
                ks.f(i12).k(327, new Object[0]);
                return;
            case 10:
                ((hi.p) obj).a(Integer.valueOf(i12));
                return;
            case 11:
                ((w10) obj).a(Integer.valueOf(i12));
                return;
            case 12:
                ((hi.r2) obj).N0(i12);
                return;
            case 13:
                mp.u1(i12).f4((ArrayList) obj, true);
                return;
            case 14:
                nb nbVar = (nb) obj;
                int i13 = nbVar.f15062c;
                nbVar.l();
                nbVar.Y1 = false;
                File file = nbVar.L1.O0;
                if (file != null) {
                    file.delete();
                    nbVar.L1.O0 = null;
                }
                nbVar.V(nbVar.L1, true);
                CharSequence[] charSequenceArr = {nbVar.f15067d1.getText()};
                if (mp.u1(i13).j5()) {
                    arrayList = ri.d0(i13).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {nbVar.L1.C0};
                if (mp.u1(i13).j5()) {
                    arrayList2 = ri.d0(i13).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                x7 x7Var = nbVar.L1;
                if (TextUtils.equals(x7Var.C0, charSequenceArr[0]) && ri.M(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                x7Var.f15756k = z10;
                nbVar.L1.C0 = new SpannableString(nbVar.f15067d1.getText());
                nbVar.y();
                nbVar.x();
                x7 x7Var2 = nbVar.L1;
                if (x7Var2 != null && x7Var2.K) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                nbVar.P1 = i7;
                nbVar.L1 = (x7) nbVar.I1.get(i12);
                nbVar.N(0, 1);
                nbVar.M(0, 1);
                nbVar.f15070e1.f14529b.f35323g3.O(false);
                nbVar.f15067d1.setText(nbVar.L1.C0);
                return;
            case 15:
                ((jg.h0) obj).g(i12);
                return;
            case 16:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17880a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 17:
                ji.q qVar2 = (ji.q) obj;
                ji.n nVar = qVar2.f18088a;
                if (qVar2.f18121p0) {
                    if (i12 == 0) {
                        String trim = nVar.f18075n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            qf qfVar = nVar.f18060b;
                            nVar.h("edit", true);
                            ChatActivityEnterView chatActivityEnterView = qfVar.f38823a;
                            int i14 = ChatActivityEnterView.f32633s7;
                            chatActivityEnterView.D2(trim, null);
                            return;
                        }
                        return;
                    } else if (i12 == 1) {
                        String trim2 = nVar.f18075n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            qf qfVar2 = nVar.f18060b;
                            nVar.h("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = qfVar2.f38823a;
                            int i15 = ChatActivityEnterView.f32633s7;
                            chatActivityEnterView2.D2(trim2, new dd(chatActivityEnterView2, 20));
                            return;
                        }
                        return;
                    } else if (i12 == 3) {
                        if (nVar.f18062c == 3 && nVar.h != null && nVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            nVar.f18075n = nVar.H;
                            nVar.H = null;
                            nVar.h.setStyleIcon(null);
                            nVar.h.setStyleLabel(null);
                            nVar.h.r(nVar.f18075n);
                            return;
                        }
                        return;
                    } else if (i12 == 4) {
                        if (nVar.h != null && nVar.f18062c == 2) {
                            String[] H = DictationAsr.H();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(gd.N0(2131745068, null));
                            boolean z12 = DictationAsr.z();
                            if (z12) {
                                i11 = 0;
                            }
                            int i16 = i11;
                            for (int i17 = 0; i17 < H.length; i17++) {
                                arrayList5.add(l0.o(H[i17]));
                                if (!z12 && i16 < 0 && DictationAsr.B(H[i17])) {
                                    i16 = i17 + 1;
                                }
                            }
                            ji.g gVar2 = new ji.g(nVar, H, 0);
                            qf qfVar3 = nVar.f18060b;
                            ji.q qVar3 = nVar.h;
                            ArrayList u10 = ji.n.u(H, z12, gVar2);
                            ChatActivityEnterView chatActivityEnterView3 = qfVar3.f38823a;
                            if (chatActivityEnterView3.F3 != null) {
                                RectF rectF = new RectF();
                                rectF.set(qVar3.R);
                                if (!rectF.isEmpty()) {
                                    ji.o oVar = new ji.o(qVar3, qVar3.getContext(), 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF.left + qVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF.top + qVar3.getTop());
                                    oVar.setAlpha(0.0f);
                                    chatActivityEnterView3.f32655c2.addView(oVar, layoutParams);
                                    oVar.post(new i5(qfVar3, oVar, new org.telegram.ui.ActionBar.i5(qVar3), arrayList5, u10, i16, gVar2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i12 == 5) {
                        qf qfVar4 = nVar.f18060b;
                        if (nVar.f18062c == 2) {
                            qfVar4.e();
                            bn bnVar = qfVar4.f38823a.F3;
                            if (bnVar != null) {
                                bnVar.presentFragment(new r2());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF2 = qVar2.f18104f1;
                        float f10 = rectF2.left;
                        float f11 = rectF2.top;
                        float f12 = qVar2.f18112j1;
                        new RectF(f10, f11 + f12, rectF2.right, rectF2.bottom + f12);
                        if (!nVar.f18075n.trim().isEmpty() && (qVar = nVar.h) != null) {
                            qf qfVar5 = nVar.f18060b;
                            ji.h hVar = new ji.h(nVar, 1);
                            ChatActivityEnterView chatActivityEnterView4 = qfVar5.f38823a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF3 = new RectF();
                                qVar.l(rectF3);
                                ji.o oVar2 = new ji.o(qVar, qVar.getContext(), 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF3.left + qVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF3.top + qVar.getTop());
                                oVar2.setAlpha(0.0f);
                                chatActivityEnterView4.f32655c2.addView(oVar2, layoutParams2);
                                oVar2.post(new ip(qfVar5, oVar2, new aa(qVar, 2), hVar, qVar, 2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 18:
                try {
                    SQLiteDatabase sQLiteDatabase = ((tr) obj).f27151b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 19:
                m2.d dVar = ((l2.p0) obj).N;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1034, new li.c(Q, i12, 15, (char) 0));
                return;
            case 20:
                String str = h2.l0.f13778a;
                h2.c cVar = ((l2.a0) ((n2.s) ((jb.m) obj).f17465c)).f19342a.C;
                l2.u uVar = new l2.u(i12, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f13726c).f13763a.getLooper()) {
                    z11 = true;
                }
                ma.p(z11);
                cVar.f13724a++;
                cVar.A(new fi.l4(23, cVar, uVar));
                Integer num = (Integer) cVar.f13727e;
                cVar.G(Integer.valueOf(i12));
                return;
            case 21:
                oi.b0 b0Var = (oi.b0) obj;
                oi.e0 e0Var = b0Var.f22051f;
                if (b0Var.f22049c && e0Var.F != null && e0Var.f22598a != null) {
                    b0Var.d = true;
                    b0Var.f22047a.n(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.c0 c0Var = e0Var.F;
                    oi.a aVar = e0Var.f22598a;
                    t3 t3Var = ((l3) c0Var).f22292a;
                    t3Var.r3(false);
                    t3Var.f22495p3.c(new q3(t3Var, aVar, i12), b0Var);
                    return;
                }
                return;
            case 22:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 23:
                mp.u1(i12).b3(0, ((TLRPC.Chat) obj).f28492id, true);
                return;
            case 24:
                ((p4) ((org.telegram.ui.f) obj).f47651b).a0(i12, true);
                return;
            case 25:
                org.telegram.ui.Cells.r1 r1Var = ((org.telegram.ui.Cells.g1) obj).f30729a;
                int i18 = r1Var.N5;
                if (i12 == i18) {
                    org.telegram.ui.Cells.d0 d0Var = (org.telegram.ui.Cells.d0) r1Var.I5.get(i18);
                    if (d0Var != null) {
                        org.telegram.ui.Cells.y yVar = d0Var.f30600s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var.b(false);
                        if (!r1Var.Q5.f24102r1) {
                            if (d0Var.f30591j != null) {
                                r1Var.n();
                            } else if (d0Var.f30590i != null) {
                                r1Var.n();
                                org.telegram.ui.Cells.m1 m1Var = r1Var.Sa;
                                if (m1Var != null) {
                                    m1Var.I1(r1Var, d0Var.f30590i);
                                }
                            }
                        }
                    }
                    r1Var.N5 = -1;
                    r1Var.q2();
                    return;
                }
                return;
            case 26:
                td tdVar = ((sd) obj).f52067f;
                tdVar.getClass();
                tdVar.c(i12);
                return;
            case 27:
                bn bnVar2 = ((gi) obj).f48305g;
                if (bnVar2.f46130ac == i12) {
                    bnVar2.pb();
                    return;
                }
                return;
            case 28:
                bn bnVar3 = ((hi) obj).f48559g;
                if (bnVar3.f46130ac == i12) {
                    bnVar3.pb();
                    return;
                }
                return;
            default:
                ((oi) obj).f50702a.l(this.f1548b, 0, true, 0, true, 0);
                return;
        }
    }

    public u0(Object obj, int i7, int i10) {
        this.f1547a = i10;
        this.f1549c = obj;
        this.f1548b = i7;
    }
}
