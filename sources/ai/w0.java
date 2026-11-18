package ai;

import a8.la;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import bi.a5;
import bi.f4;
import di.x8;
import fi.a6;
import fi.p6;
import hi.d7;
import hi.ta;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.k3;
import oi.p3;
import oi.s3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.wn;
public final class w0 implements Runnable {
    public final int f1582a;
    public final int f1583b;
    public final Object f1584c;

    public w0(int i7, Object obj, int i10) {
        this.f1582a = i10;
        this.f1583b = i7;
        this.f1584c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        ji.p pVar;
        int i10 = this.f1582a;
        int i11 = -1;
        boolean z11 = false;
        int i12 = this.f1583b;
        Object obj = this.f1584c;
        switch (i10) {
            case 0:
                ExecutorService executorService = DictationLid.f43030a;
                ((c1) obj).a(null, 0L, i12);
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10.i(i12).f24792n);
                ((s4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                gc t6 = f4.g().t(gd.a0(null, null, i12, (String) obj), null);
                t6.f35471t = true;
                t6.j();
                return;
            case 3:
                ((a5) obj).L0(i12);
                return;
            case 4:
                ch.f fVar = (ch.f) obj;
                if (fVar.f5351b) {
                    x10 x10Var = fVar.d;
                    if (x10Var != null) {
                        if (i12 < 300) {
                            z11 = true;
                        }
                        x10Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f5350a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f5352c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.h3(new w0(fVar, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((di.o0) obj).L0(i12, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((x8) obj).f10018a).cancelRequest(i12, true);
                return;
            case 7:
                ((f2.g) obj).f11041b.onAudioFocusChange(i12);
                return;
            case 8:
                p6 p6Var = (p6) obj;
                ArrayList arrayList3 = p6Var.f12390g;
                p6Var.v(arrayList3);
                di.s4 s4Var = p6Var.J;
                Collections.sort(arrayList3, s4Var);
                ArrayList arrayList4 = p6Var.h;
                p6Var.v(arrayList4);
                Collections.sort(arrayList4, s4Var);
                ks.f(i12).k(326, new Object[0]);
                return;
            case 9:
                ((hi.p) obj).a(Integer.valueOf(i12));
                return;
            case 10:
                ((hi.j2) obj).N0(i12);
                return;
            case 11:
                mp.u1(i12).f4((ArrayList) obj, true);
                return;
            case 12:
                ta taVar = (ta) obj;
                int i13 = taVar.f15431c;
                taVar.l();
                taVar.Y1 = false;
                File file = taVar.L1.O0;
                if (file != null) {
                    file.delete();
                    taVar.L1.O0 = null;
                }
                taVar.V(taVar.L1, true);
                CharSequence[] charSequenceArr = {taVar.f15436d1.getText()};
                if (mp.u1(i13).j5()) {
                    arrayList = ri.d0(i13).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {taVar.L1.C0};
                if (mp.u1(i13).j5()) {
                    arrayList2 = ri.d0(i13).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                d7 d7Var = taVar.L1;
                if (TextUtils.equals(d7Var.C0, charSequenceArr[0]) && ri.M(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d7Var.f14411k = z10;
                taVar.L1.C0 = new SpannableString(taVar.f15436d1.getText());
                taVar.y();
                taVar.x();
                d7 d7Var2 = taVar.L1;
                if (d7Var2 != null && d7Var2.K) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                taVar.P1 = i7;
                taVar.L1 = (d7) taVar.I1.get(i12);
                taVar.N(0, 1);
                taVar.M(0, 1);
                taVar.f15439e1.f15716b.f34607g3.O(false);
                taVar.f15436d1.setText(taVar.L1.C0);
                return;
            case 13:
                ((jg.h0) obj).g(i12);
                return;
            case 14:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17787a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 15:
                ji.p pVar2 = (ji.p) obj;
                ji.m mVar = pVar2.f17992a;
                if (pVar2.f18025p0) {
                    if (i12 == 0) {
                        String trim = mVar.f17979n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            pf pfVar = mVar.f17964b;
                            mVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = pfVar.f38384a;
                            int i14 = ChatActivityEnterView.f32538n7;
                            chatActivityEnterView.x2(trim, null);
                            return;
                        }
                        return;
                    } else if (i12 == 1) {
                        String trim2 = mVar.f17979n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            pf pfVar2 = mVar.f17964b;
                            mVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = pfVar2.f38384a;
                            int i15 = ChatActivityEnterView.f32538n7;
                            chatActivityEnterView2.x2(trim2, new dd(chatActivityEnterView2, 20));
                            return;
                        }
                        return;
                    } else if (i12 == 3) {
                        if (mVar.f17966c == 3 && mVar.h != null && mVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            mVar.f17979n = mVar.H;
                            mVar.H = null;
                            mVar.h.setStyleIcon(null);
                            mVar.h.setStyleLabel(null);
                            mVar.h.r(mVar.f17979n);
                            return;
                        }
                        return;
                    } else if (i12 == 4) {
                        if (mVar.h != null && mVar.f17966c == 2) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(gd.M0(2131745074, null));
                            boolean v = DictationAsr.v();
                            if (v) {
                                i11 = 0;
                            }
                            int i16 = i11;
                            for (int i17 = 0; i17 < C.length; i17++) {
                                arrayList5.add(n0.p(C[i17]));
                                if (!v && i16 < 0 && DictationAsr.y(C[i17])) {
                                    i16 = i17 + 1;
                                }
                            }
                            pf pfVar3 = mVar.f17964b;
                            ji.p pVar3 = mVar.h;
                            ji.g gVar2 = new ji.g(mVar, C, 0);
                            ChatActivityEnterView chatActivityEnterView3 = pfVar3.f38384a;
                            if (chatActivityEnterView3.D3 != null) {
                                RectF rectF = new RectF();
                                rectF.set(pVar3.R);
                                if (!rectF.isEmpty()) {
                                    ji.n nVar = new ji.n(pVar3, pVar3.getContext(), 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF.left + pVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF.top + pVar3.getTop());
                                    nVar.setAlpha(0.0f);
                                    chatActivityEnterView3.f32542a2.addView(nVar, layoutParams);
                                    nVar.post(new bg.m0(pfVar3, nVar, new b5(pVar3), arrayList5, i16, gVar2, 9));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i12 == 5) {
                        pf pfVar4 = mVar.f17964b;
                        if (mVar.f17966c == 2) {
                            pfVar4.e();
                            bn bnVar = pfVar4.f38384a.D3;
                            if (bnVar != null) {
                                bnVar.presentFragment(new x2());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF2 = pVar2.f18008f1;
                        float f10 = rectF2.left;
                        float f11 = rectF2.top;
                        float f12 = pVar2.f18016j1;
                        new RectF(f10, f11 + f12, rectF2.right, rectF2.bottom + f12);
                        if (!mVar.f17979n.trim().isEmpty() && (pVar = mVar.h) != null) {
                            pf pfVar5 = mVar.f17964b;
                            ji.h hVar = new ji.h(mVar, 1);
                            ChatActivityEnterView chatActivityEnterView4 = pfVar5.f38384a;
                            if (chatActivityEnterView4.D3 != null) {
                                RectF rectF3 = new RectF();
                                pVar.l(rectF3);
                                ji.n nVar2 = new ji.n(pVar, pVar.getContext(), 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF3.left + pVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF3.top + pVar.getTop());
                                nVar2.setAlpha(0.0f);
                                chatActivityEnterView4.f32542a2.addView(nVar2, layoutParams2);
                                nVar2.post(new wn(pfVar5, nVar2, new of(pVar, 0), hVar, pVar, 3));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 16:
                try {
                    SQLiteDatabase sQLiteDatabase = ((tr) obj).f27056b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 17:
                m2.d dVar = ((l2.o0) obj).N;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1034, new li.c(Q, i12, 15, (char) 0));
                return;
            case 18:
                String str = h2.l0.f13786a;
                h2.c cVar = ((l2.z) ((n2.s) ((k8.a) obj).f18184c)).f19600a.C;
                l2.t tVar = new l2.t(i12, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f13734c).f13771a.getLooper()) {
                    z11 = true;
                }
                la.p(z11);
                cVar.f13732a++;
                cVar.A(new a6(21, cVar, tVar));
                Integer num = (Integer) cVar.f13735e;
                cVar.G(Integer.valueOf(i12));
                return;
            case 19:
                oi.a0 a0Var = (oi.a0) obj;
                oi.d0 d0Var = a0Var.f21931f;
                if (a0Var.f21929c && d0Var.F != null && d0Var.f22442a != null) {
                    a0Var.d = true;
                    a0Var.f21927a.m(false);
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.b0 b0Var = d0Var.F;
                    oi.a aVar = d0Var.f22442a;
                    s3 s3Var = ((k3) b0Var).f22137a;
                    s3Var.r3(false);
                    s3Var.f22337p3.x(new p3(s3Var, aVar, i12), a0Var);
                    return;
                }
                return;
            case 20:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 21:
                mp.u1(i12).b3(0, ((TLRPC.Chat) obj).f28405id, true);
                return;
            case 22:
                ((p4) ((org.telegram.ui.f) obj).f47404b).a0(i12, true);
                return;
            case 23:
                org.telegram.ui.Cells.q1 q1Var = ((org.telegram.ui.Cells.f1) obj).f30584a;
                int i18 = q1Var.N5;
                if (i12 == i18) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) q1Var.I5.get(i18);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.f30507s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!q1Var.Q5.f23997r1) {
                            if (d0Var2.f30498j != null) {
                                q1Var.n();
                            } else if (d0Var2.f30497i != null) {
                                q1Var.n();
                                org.telegram.ui.Cells.l1 l1Var = q1Var.Sa;
                                if (l1Var != null) {
                                    l1Var.I1(q1Var, d0Var2.f30497i);
                                }
                            }
                        }
                    }
                    q1Var.N5 = -1;
                    q1Var.q2();
                    return;
                }
                return;
            case 24:
                td tdVar = ((sd) obj).f51979f;
                tdVar.getClass();
                tdVar.c(i12);
                return;
            case 25:
                bn bnVar2 = ((gi) obj).f48114g;
                if (bnVar2.f45944ac == i12) {
                    bnVar2.pb();
                    return;
                }
                return;
            case 26:
                bn bnVar3 = ((hi) obj).f48404g;
                if (bnVar3.f45944ac == i12) {
                    bnVar3.pb();
                    return;
                }
                return;
            case 27:
                ((oi) obj).f50618a.l(this.f1583b, 0, true, 0, true, 0);
                return;
            case 28:
                bn bnVar4 = ((gi) obj).f48114g;
                if (bnVar4.f45944ac == i12) {
                    bnVar4.pb();
                    return;
                }
                return;
            default:
                bn bnVar5 = ((hi) obj).f48404g;
                if (bnVar5.f45944ac == i12) {
                    bnVar5.pb();
                    return;
                }
                return;
        }
    }

    public w0(Object obj, int i7, int i10) {
        this.f1582a = i10;
        this.f1584c = obj;
        this.f1583b = i7;
    }
}
