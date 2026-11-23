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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.pf;
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
public final class t0 implements Runnable {
    public final int f1535a;
    public final int f1536b;
    public final Object f1537c;

    public t0(int i7, Object obj, int i10) {
        this.f1535a = i10;
        this.f1536b = i7;
        this.f1537c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        ji.q qVar;
        int i10 = this.f1535a;
        int i11 = -1;
        boolean z11 = false;
        int i12 = this.f1536b;
        Object obj = this.f1537c;
        switch (i10) {
            case 0:
                ExecutorService executorService = DictationLid.f43040a;
                ((r1) obj).a(Integer.valueOf(i12));
                return;
            case 1:
                ExecutorService executorService2 = DictationLid.f43040a;
                ((y0) obj).a(null, 0L, i12);
                return;
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", k10.i(i12).f24951n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                gc t6 = l4.h().t(hd.a0(null, null, i12, (String) obj), null);
                t6.f35499t = true;
                t6.j();
                return;
            case 4:
                ((f5) obj).L0(i12);
                return;
            case 5:
                ch.f fVar = (ch.f) obj;
                if (fVar.f5343b) {
                    y10 y10Var = fVar.d;
                    if (y10Var != null) {
                        if (i12 < 300) {
                            z11 = true;
                        }
                        y10Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f5342a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f5344c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.h3(new t0(fVar, max, 5), max);
                    return;
                }
                return;
            case 6:
                ((di.o0) obj).L0(i12, true);
                return;
            case 7:
                ConnectionsManager.getInstance(((y8) obj).f10048a).cancelRequest(i12, true);
                return;
            case 8:
                ((f2.g) obj).f11033b.onAudioFocusChange(i12);
                return;
            case 9:
                p6 p6Var = (p6) obj;
                ArrayList arrayList3 = p6Var.f12382g;
                p6Var.v(arrayList3);
                s4 s4Var = p6Var.J;
                Collections.sort(arrayList3, s4Var);
                ArrayList arrayList4 = p6Var.h;
                p6Var.v(arrayList4);
                Collections.sort(arrayList4, s4Var);
                ls.f(i12).k(327, new Object[0]);
                return;
            case 10:
                ((hi.o) obj).a(Integer.valueOf(i12));
                return;
            case 11:
                ((y10) obj).a(Integer.valueOf(i12));
                return;
            case 12:
                ((hi.i2) obj).N0(i12);
                return;
            case 13:
                np.u1(i12).f4((ArrayList) obj, true);
                return;
            case 14:
                ta taVar = (ta) obj;
                int i13 = taVar.f15395c;
                taVar.l();
                taVar.Y1 = false;
                File file = taVar.L1.O0;
                if (file != null) {
                    file.delete();
                    taVar.L1.O0 = null;
                }
                taVar.V(taVar.L1, true);
                CharSequence[] charSequenceArr = {taVar.f15400d1.getText()};
                if (np.u1(i13).j5()) {
                    arrayList = si.d0(i13).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {taVar.L1.C0};
                if (np.u1(i13).j5()) {
                    arrayList2 = si.d0(i13).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                d7 d7Var = taVar.L1;
                if (TextUtils.equals(d7Var.C0, charSequenceArr[0]) && si.M(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d7Var.f14385k = z10;
                taVar.L1.C0 = new SpannableString(taVar.f15400d1.getText());
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
                taVar.f15403e1.f15669b.f35742g3.O(false);
                taVar.f15400d1.setText(taVar.L1.C0);
                return;
            case 15:
                ((jg.h0) obj).g(i12);
                return;
            case 16:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17778a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 17:
                ji.q qVar2 = (ji.q) obj;
                ji.n nVar = qVar2.f17986a;
                if (qVar2.f18019p0) {
                    if (i12 == 0) {
                        String trim = nVar.f17973n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            qf qfVar = nVar.f17958b;
                            nVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = qfVar.f38848a;
                            int i14 = ChatActivityEnterView.f32535s7;
                            chatActivityEnterView.A2(trim, null);
                            return;
                        }
                        return;
                    } else if (i12 == 1) {
                        String trim2 = nVar.f17973n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            qf qfVar2 = nVar.f17958b;
                            nVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = qfVar2.f38848a;
                            int i15 = ChatActivityEnterView.f32535s7;
                            chatActivityEnterView2.A2(trim2, new dd(chatActivityEnterView2, 20));
                            return;
                        }
                        return;
                    } else if (i12 == 3) {
                        if (nVar.f17960c == 3 && nVar.h != null && nVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            nVar.f17973n = nVar.H;
                            nVar.H = null;
                            nVar.h.setStyleIcon(null);
                            nVar.h.setStyleLabel(null);
                            nVar.h.r(nVar.f17973n);
                            return;
                        }
                        return;
                    } else if (i12 == 4) {
                        if (nVar.h != null && nVar.f17960c == 2) {
                            String[] D = DictationAsr.D();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(hd.N0(2131745068, null));
                            boolean x10 = DictationAsr.x();
                            if (x10) {
                                i11 = 0;
                            }
                            int i16 = i11;
                            for (int i17 = 0; i17 < D.length; i17++) {
                                arrayList5.add(k0.q(D[i17]));
                                if (!x10 && i16 < 0 && DictationAsr.z(D[i17])) {
                                    i16 = i17 + 1;
                                }
                            }
                            ji.f fVar2 = new ji.f(nVar, D, 0);
                            qf qfVar3 = nVar.f17958b;
                            ji.q qVar3 = nVar.h;
                            ArrayList v = ji.n.v(D, x10, fVar2);
                            ChatActivityEnterView chatActivityEnterView3 = qfVar3.f38848a;
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
                                    chatActivityEnterView3.f32557c2.addView(oVar, layoutParams);
                                    oVar.post(new i5(qfVar3, oVar, new c5(qVar3), arrayList5, v, i16, fVar2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i12 == 5) {
                        qf qfVar4 = nVar.f17958b;
                        if (nVar.f17960c == 2) {
                            qfVar4.e();
                            bn bnVar = qfVar4.f38848a.F3;
                            if (bnVar != null) {
                                bnVar.presentFragment(new q2());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF2 = qVar2.f18002f1;
                        float f10 = rectF2.left;
                        float f11 = rectF2.top;
                        float f12 = qVar2.f18010j1;
                        new RectF(f10, f11 + f12, rectF2.right, rectF2.bottom + f12);
                        if (!nVar.f17973n.trim().isEmpty() && (qVar = nVar.h) != null) {
                            qf qfVar5 = nVar.f17958b;
                            ji.g gVar2 = new ji.g(nVar, 1);
                            ChatActivityEnterView chatActivityEnterView4 = qfVar5.f38848a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF3 = new RectF();
                                qVar.l(rectF3);
                                ji.o oVar2 = new ji.o(qVar, qVar.getContext(), 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF3.left + qVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF3.top + qVar.getTop());
                                oVar2.setAlpha(0.0f);
                                chatActivityEnterView4.f32557c2.addView(oVar2, layoutParams2);
                                oVar2.post(new ip(qfVar5, oVar2, new pf(qVar, 0), gVar2, qVar, 2));
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
                    SQLiteDatabase sQLiteDatabase = ((ur) obj).f27216b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 19:
                m2.d dVar = ((l2.o0) obj).N;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1034, new li.c(Q, i12, 15, (char) 0));
                return;
            case 20:
                String str = h2.l0.f13778a;
                h2.c cVar = ((l2.z) ((n2.s) ((k8.a) obj).f18178c)).f19594a.C;
                l2.t tVar = new l2.t(i12, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f13726c).f13763a.getLooper()) {
                    z11 = true;
                }
                ma.p(z11);
                cVar.f13724a++;
                cVar.A(new a6(21, cVar, tVar));
                Integer num = (Integer) cVar.f13727e;
                cVar.G(Integer.valueOf(i12));
                return;
            case 21:
                oi.a0 a0Var = (oi.a0) obj;
                oi.d0 d0Var = a0Var.f21922f;
                if (a0Var.f21920c && d0Var.F != null && d0Var.f22468a != null) {
                    a0Var.d = true;
                    a0Var.f21918a.m(false);
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.b0 b0Var = d0Var.F;
                    oi.a aVar = d0Var.f22468a;
                    s3 s3Var = ((k3) b0Var).f22163a;
                    s3Var.r3(false);
                    s3Var.f22365p3.x(new p3(s3Var, aVar, i12), a0Var);
                    return;
                }
                return;
            case 22:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 23:
                np.u1(i12).b3(0, ((TLRPC.Chat) obj).f28398id, true);
                return;
            case 24:
                ((p4) ((org.telegram.ui.f) obj).f47394b).a0(i12, true);
                return;
            case 25:
                org.telegram.ui.Cells.r1 r1Var = ((org.telegram.ui.Cells.g1) obj).f30640a;
                int i18 = r1Var.N5;
                if (i12 == i18) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) r1Var.I5.get(i18);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.f30511s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!r1Var.Q5.f24206r1) {
                            if (d0Var2.f30502j != null) {
                                r1Var.n();
                            } else if (d0Var2.f30501i != null) {
                                r1Var.n();
                                org.telegram.ui.Cells.m1 m1Var = r1Var.Sa;
                                if (m1Var != null) {
                                    m1Var.I1(r1Var, d0Var2.f30501i);
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
                td tdVar = ((sd) obj).f51997f;
                tdVar.getClass();
                tdVar.c(i12);
                return;
            case 27:
                bn bnVar2 = ((gi) obj).f48059g;
                if (bnVar2.f45915ac == i12) {
                    bnVar2.pb();
                    return;
                }
                return;
            case 28:
                bn bnVar3 = ((hi) obj).f48371g;
                if (bnVar3.f45915ac == i12) {
                    bnVar3.pb();
                    return;
                }
                return;
            default:
                ((oi) obj).f50588a.l(this.f1536b, 0, true, 0, true, 0);
                return;
        }
    }

    public t0(Object obj, int i7, int i10) {
        this.f1535a = i10;
        this.f1537c = obj;
        this.f1536b = i7;
    }
}
