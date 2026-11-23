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
import bi.c5;
import bi.f5;
import bi.i4;
import di.s4;
import di.y8;
import fi.l4;
import fi.p6;
import hi.c7;
import hi.sa;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.l3;
import oi.q3;
import oi.t3;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rf;
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
public final class c1 implements Runnable {
    public final int f1140a;
    public final int f1141b;
    public final Object f1142c;

    public c1(int i7, Object obj, int i10) {
        this.f1140a = i10;
        this.f1141b = i7;
        this.f1142c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        ji.r rVar;
        int i10 = this.f1140a;
        int i11 = -1;
        boolean z11 = false;
        int i12 = this.f1141b;
        Object obj = this.f1142c;
        switch (i10) {
            case 0:
                ExecutorService executorService = DictationLid.f43075a;
                ((e1) obj).a(null, 0L, i12);
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", k10.i(i12).f24987n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                gc t6 = i4.h().t(hd.a0(null, null, i12, (String) obj), null);
                t6.f35537t = true;
                t6.j();
                return;
            case 3:
                ((c5) obj).L0(i12);
                return;
            case 4:
                ch.f fVar = (ch.f) obj;
                if (fVar.f5380b) {
                    y10 y10Var = fVar.d;
                    if (y10Var != null) {
                        if (i12 < 300) {
                            z11 = true;
                        }
                        y10Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f5379a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f5381c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.h3(new c1(fVar, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((di.o0) obj).L0(i12, true);
                return;
            case 6:
                ConnectionsManager.getInstance(((y8) obj).f10085a).cancelRequest(i12, true);
                return;
            case 7:
                ((f2.g) obj).f11070b.onAudioFocusChange(i12);
                return;
            case 8:
                p6 p6Var = (p6) obj;
                ArrayList arrayList3 = p6Var.f12430g;
                p6Var.v(arrayList3);
                s4 s4Var = p6Var.J;
                Collections.sort(arrayList3, s4Var);
                ArrayList arrayList4 = p6Var.h;
                p6Var.v(arrayList4);
                Collections.sort(arrayList4, s4Var);
                ls.f(i12).k(327, new Object[0]);
                return;
            case 9:
                ((hi.q) obj).a(Integer.valueOf(i12));
                return;
            case 10:
                ((hi.i2) obj).N0(i12);
                return;
            case 11:
                np.u1(i12).f4((ArrayList) obj, true);
                return;
            case 12:
                sa saVar = (sa) obj;
                int i13 = saVar.f15392c;
                saVar.l();
                saVar.Y1 = false;
                File file = saVar.L1.O0;
                if (file != null) {
                    file.delete();
                    saVar.L1.O0 = null;
                }
                saVar.V(saVar.L1, true);
                CharSequence[] charSequenceArr = {saVar.f15397d1.getText()};
                if (np.u1(i13).j5()) {
                    arrayList = si.d0(i13).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {saVar.L1.C0};
                if (np.u1(i13).j5()) {
                    arrayList2 = si.d0(i13).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                c7 c7Var = saVar.L1;
                if (TextUtils.equals(c7Var.C0, charSequenceArr[0]) && si.M(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                c7Var.f14361k = z10;
                saVar.L1.C0 = new SpannableString(saVar.f15397d1.getText());
                saVar.y();
                saVar.x();
                c7 c7Var2 = saVar.L1;
                if (c7Var2 != null && c7Var2.K) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                saVar.P1 = i7;
                saVar.L1 = (c7) saVar.I1.get(i12);
                saVar.N(0, 1);
                saVar.M(0, 1);
                saVar.f15400e1.f15697b.f35790g3.O(false);
                saVar.f15397d1.setText(saVar.L1.C0);
                return;
            case 13:
                ((jg.h0) obj).g(i12);
                return;
            case 14:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17812a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 15:
                ji.r rVar2 = (ji.r) obj;
                ji.o oVar = rVar2.f18023a;
                if (rVar2.f18056p0) {
                    if (i12 == 0) {
                        String trim = oVar.f18010n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            rf rfVar = oVar.f17995b;
                            oVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = rfVar.f39178a;
                            int i14 = ChatActivityEnterView.f32569s7;
                            chatActivityEnterView.A2(trim, null);
                            return;
                        }
                        return;
                    } else if (i12 == 1) {
                        String trim2 = oVar.f18010n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            rf rfVar2 = oVar.f17995b;
                            oVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = rfVar2.f39178a;
                            int i15 = ChatActivityEnterView.f32569s7;
                            chatActivityEnterView2.A2(trim2, new dd(chatActivityEnterView2, 20));
                            return;
                        }
                        return;
                    } else if (i12 == 3) {
                        if (oVar.f17997c == 3 && oVar.h != null && oVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            oVar.f18010n = oVar.H;
                            oVar.H = null;
                            oVar.h.setStyleIcon(null);
                            oVar.h.setStyleLabel(null);
                            oVar.h.r(oVar.f18010n);
                            return;
                        }
                        return;
                    } else if (i12 == 4) {
                        if (oVar.h != null && oVar.f17997c == 2) {
                            String[] E = DictationAsr.E();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(hd.N0(2131745068, null));
                            boolean x10 = DictationAsr.x();
                            if (x10) {
                                i11 = 0;
                            }
                            int i16 = i11;
                            for (int i17 = 0; i17 < E.length; i17++) {
                                arrayList5.add(p0.q(E[i17]));
                                if (!x10 && i16 < 0 && DictationAsr.A(E[i17])) {
                                    i16 = i17 + 1;
                                }
                            }
                            ji.f fVar2 = new ji.f(oVar, E, 0);
                            rf rfVar3 = oVar.f17995b;
                            ji.r rVar3 = oVar.h;
                            ArrayList v = ji.o.v(E, x10, fVar2);
                            ChatActivityEnterView chatActivityEnterView3 = rfVar3.f39178a;
                            if (chatActivityEnterView3.F3 != null) {
                                RectF rectF = new RectF();
                                rectF.set(rVar3.R);
                                if (!rectF.isEmpty()) {
                                    ji.p pVar = new ji.p(rVar3, rVar3.getContext(), 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF.left + rVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF.top + rVar3.getTop());
                                    pVar.setAlpha(0.0f);
                                    chatActivityEnterView3.f32591c2.addView(pVar, layoutParams);
                                    pVar.post(new f5(rfVar3, pVar, new org.telegram.ui.Cells.c5(rVar3), arrayList5, v, i16, fVar2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i12 == 5) {
                        rf rfVar4 = oVar.f17995b;
                        if (oVar.f17997c == 2) {
                            rfVar4.e();
                            bn bnVar = rfVar4.f39178a.F3;
                            if (bnVar != null) {
                                bnVar.presentFragment(new a3());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF2 = rVar2.f18039f1;
                        float f10 = rectF2.left;
                        float f11 = rectF2.top;
                        float f12 = rVar2.f18047j1;
                        new RectF(f10, f11 + f12, rectF2.right, rectF2.bottom + f12);
                        if (!oVar.f18010n.trim().isEmpty() && (rVar = oVar.h) != null) {
                            rf rfVar5 = oVar.f17995b;
                            ji.g gVar2 = new ji.g(oVar, 1);
                            ChatActivityEnterView chatActivityEnterView4 = rfVar5.f39178a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF3 = new RectF();
                                rVar.l(rectF3);
                                ji.p pVar2 = new ji.p(rVar, rVar.getContext(), 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF3.left + rVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF3.top + rVar.getTop());
                                pVar2.setAlpha(0.0f);
                                chatActivityEnterView4.f32591c2.addView(pVar2, layoutParams2);
                                pVar2.post(new wn(rfVar5, pVar2, new qf(rVar, 0), gVar2, rVar, 3));
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
                    SQLiteDatabase sQLiteDatabase = ((ur) obj).f27252b;
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
                String str = h2.l0.f13815a;
                h2.c cVar = ((l2.z) ((n2.s) ((k8.a) obj).f18215c)).f19628a.C;
                l2.t tVar = new l2.t(i12, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f13763c).f13800a.getLooper()) {
                    z11 = true;
                }
                la.p(z11);
                cVar.f13761a++;
                cVar.A(new l4(23, cVar, tVar));
                Integer num = (Integer) cVar.f13764e;
                cVar.G(Integer.valueOf(i12));
                return;
            case 19:
                oi.b0 b0Var = (oi.b0) obj;
                oi.e0 e0Var = b0Var.f21985f;
                if (b0Var.f21983c && e0Var.F != null && e0Var.f22531a != null) {
                    b0Var.d = true;
                    b0Var.f21981a.m(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.c0 c0Var = e0Var.F;
                    oi.a aVar = e0Var.f22531a;
                    t3 t3Var = ((l3) c0Var).f22224a;
                    t3Var.r3(false);
                    t3Var.f22428p3.x(new q3(t3Var, aVar, i12), b0Var);
                    return;
                }
                return;
            case 20:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 21:
                np.u1(i12).b3(0, ((TLRPC.Chat) obj).f28434id, true);
                return;
            case 22:
                ((p4) ((org.telegram.ui.f) obj).f47433b).a0(i12, true);
                return;
            case 23:
                org.telegram.ui.Cells.r1 r1Var = ((org.telegram.ui.Cells.g1) obj).f30674a;
                int i18 = r1Var.N5;
                if (i12 == i18) {
                    org.telegram.ui.Cells.d0 d0Var = (org.telegram.ui.Cells.d0) r1Var.I5.get(i18);
                    if (d0Var != null) {
                        org.telegram.ui.Cells.y yVar = d0Var.f30545s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var.b(false);
                        if (!r1Var.Q5.f24242r1) {
                            if (d0Var.f30536j != null) {
                                r1Var.n();
                            } else if (d0Var.f30535i != null) {
                                r1Var.n();
                                org.telegram.ui.Cells.m1 m1Var = r1Var.Sa;
                                if (m1Var != null) {
                                    m1Var.I1(r1Var, d0Var.f30535i);
                                }
                            }
                        }
                    }
                    r1Var.N5 = -1;
                    r1Var.q2();
                    return;
                }
                return;
            case 24:
                td tdVar = ((sd) obj).f52028f;
                tdVar.getClass();
                tdVar.c(i12);
                return;
            case 25:
                bn bnVar2 = ((gi) obj).f48123g;
                if (bnVar2.f45962ac == i12) {
                    bnVar2.pb();
                    return;
                }
                return;
            case 26:
                bn bnVar3 = ((hi) obj).f48407g;
                if (bnVar3.f45962ac == i12) {
                    bnVar3.pb();
                    return;
                }
                return;
            case 27:
                ((oi) obj).f50611a.l(this.f1141b, 0, true, 0, true, 0);
                return;
            case 28:
                bn bnVar4 = ((gi) obj).f48123g;
                if (bnVar4.f45962ac == i12) {
                    bnVar4.pb();
                    return;
                }
                return;
            default:
                bn bnVar5 = ((hi) obj).f48407g;
                if (bnVar5.f45962ac == i12) {
                    bnVar5.pb();
                    return;
                }
                return;
        }
    }

    public c1(Object obj, int i7, int i10) {
        this.f1140a = i10;
        this.f1142c = obj;
        this.f1141b = i7;
    }
}
