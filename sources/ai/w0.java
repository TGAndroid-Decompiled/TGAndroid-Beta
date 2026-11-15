package ai;

import a8.ja;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import di.p4;
import di.u8;
import fi.f6;
import fi.s6;
import hi.d7;
import hi.sa;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.i3;
import oi.n3;
import oi.q3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.hp;
import org.telegram.ui.lm;
import org.telegram.ui.ni;
import org.telegram.ui.ol;
import org.telegram.ui.sd;
import org.telegram.ui.td;
public final class w0 implements Runnable {
    public final int f1591a;
    public final int f1592b;
    public final Object f1593c;

    public w0(int i7, Object obj, int i10) {
        this.f1591a = i10;
        this.f1592b = i7;
        this.f1593c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        ji.p pVar;
        int i10;
        int i11 = this.f1591a;
        int i12 = -1;
        boolean z11 = false;
        int i13 = this.f1592b;
        Object obj = this.f1593c;
        switch (i11) {
            case 0:
                ExecutorService executorService = DictationLid.f42585a;
                ((c1) obj).a(null, 0L, i13);
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", m10.i(i13).f24959n);
                ((o4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                ch.f fVar = (ch.f) obj;
                if (fVar.f5065b) {
                    z10 z10Var = fVar.d;
                    if (z10Var != null) {
                        if (i13 < 300) {
                            z11 = true;
                        }
                        z10Var.a(Boolean.valueOf(z11));
                        try {
                            fVar.f5064a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f5066c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.i3(new w0(fVar, max, 2), max);
                    return;
                }
                return;
            case 3:
                ConnectionsManager.getInstance(((u8) obj).f9529a).cancelRequest(i13, true);
                return;
            case 4:
                ((f2.f) obj).f10719b.onAudioFocusChange(i13);
                return;
            case 5:
                s6 s6Var = (s6) obj;
                ArrayList arrayList3 = s6Var.f12324g;
                s6Var.v(arrayList3);
                p4 p4Var = s6Var.J;
                Collections.sort(arrayList3, p4Var);
                ArrayList arrayList4 = s6Var.h;
                s6Var.v(arrayList4);
                Collections.sort(arrayList4, p4Var);
                ns.f(i13).k(324, new Object[0]);
                return;
            case 6:
                ((hi.o) obj).a(Integer.valueOf(i13));
                return;
            case 7:
                ((hi.i2) obj).M0(i13);
                return;
            case 8:
                np.s1(i13).Y3((ArrayList) obj, true);
                return;
            case 9:
                sa saVar = (sa) obj;
                int i14 = saVar.f15043c;
                saVar.l();
                saVar.Y1 = false;
                File file = saVar.L1.O0;
                if (file != null) {
                    file.delete();
                    saVar.L1.O0 = null;
                }
                saVar.V(saVar.L1, true);
                CharSequence[] charSequenceArr = {saVar.f15048d1.getText()};
                if (np.s1(i14).Y4()) {
                    arrayList = si.b0(i14).W(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {saVar.L1.C0};
                if (np.s1(i14).Y4()) {
                    arrayList2 = si.b0(i14).W(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                d7 d7Var = saVar.L1;
                if (TextUtils.equals(d7Var.C0, charSequenceArr[0]) && si.K(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d7Var.f14146k = z10;
                saVar.L1.C0 = new SpannableString(saVar.f15048d1.getText());
                saVar.y();
                saVar.x();
                d7 d7Var2 = saVar.L1;
                if (d7Var2 != null && d7Var2.K) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                saVar.P1 = i7;
                saVar.L1 = (d7) saVar.I1.get(i13);
                saVar.N(0, 1);
                saVar.M(0, 1);
                saVar.f15051e1.f15326b.f39892g3.O(false);
                saVar.f15048d1.setText(saVar.L1.C0);
                return;
            case 10:
                ((jg.h0) obj).g(i13);
                return;
            case 11:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17401a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 12:
                ji.p pVar2 = (ji.p) obj;
                ji.m mVar = pVar2.f17597a;
                if (pVar2.f17627n0) {
                    if (i13 == 0) {
                        String trim = mVar.f17586n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            gf gfVar = mVar.f17571b;
                            mVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = gfVar.f34928a;
                            int i15 = ChatActivityEnterView.N6;
                            chatActivityEnterView.n2(trim, null);
                            return;
                        }
                        return;
                    } else if (i13 == 1) {
                        String trim2 = mVar.f17586n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            gf gfVar2 = mVar.f17571b;
                            mVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = gfVar2.f34928a;
                            int i16 = ChatActivityEnterView.N6;
                            chatActivityEnterView2.n2(trim2, new uc(chatActivityEnterView2, 13));
                            return;
                        }
                        return;
                    } else if (i13 == 3) {
                        if (mVar.f17573c == 3 && mVar.h != null && mVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            mVar.f17586n = mVar.H;
                            mVar.H = null;
                            mVar.h.setStyleIcon(null);
                            mVar.h.setStyleLabel(null);
                            mVar.h.r(mVar.f17586n);
                            return;
                        }
                        return;
                    } else if (i13 == 4) {
                        if (mVar.h != null && mVar.f17573c == 2) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add("Auto-Detect");
                            boolean v = DictationAsr.v();
                            if (v) {
                                i12 = 0;
                            }
                            int i17 = i12;
                            for (int i18 = 0; i18 < C.length; i18++) {
                                arrayList5.add(n0.l(C[i18]));
                                if (!v && i17 < 0 && DictationAsr.y(C[i18])) {
                                    i17 = i18 + 1;
                                }
                            }
                            gf gfVar3 = mVar.f17571b;
                            ji.p pVar3 = mVar.h;
                            ji.g gVar2 = new ji.g(mVar, C, 0);
                            ChatActivityEnterView chatActivityEnterView3 = gfVar3.f34928a;
                            if (chatActivityEnterView3.f32319x3 != null) {
                                RectF rectF = new RectF();
                                rectF.set(pVar3.P);
                                if (!rectF.isEmpty()) {
                                    ji.n nVar = new ji.n(pVar3, pVar3.getContext(), 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF.left + pVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF.top + pVar3.getTop());
                                    nVar.setAlpha(0.0f);
                                    chatActivityEnterView3.U1.addView(nVar, layoutParams);
                                    nVar.post(new bg.l0(gfVar3, nVar, new ff(pVar3, 0), arrayList5, i17, gVar2, 9));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i13 == 5) {
                        gf gfVar4 = mVar.f17571b;
                        if (mVar.f17573c == 2) {
                            gfVar4.e();
                            an anVar = gfVar4.f34928a.f32319x3;
                            if (anVar != null) {
                                anVar.presentFragment(new x2());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF2 = pVar2.f17607d1;
                        float f10 = rectF2.left;
                        float f11 = rectF2.top;
                        float f12 = pVar2.f17617h1;
                        new RectF(f10, f11 + f12, rectF2.right, rectF2.bottom + f12);
                        if (!mVar.f17586n.trim().isEmpty() && (pVar = mVar.h) != null) {
                            gf gfVar5 = mVar.f17571b;
                            ji.h hVar = new ji.h(mVar, 1);
                            ChatActivityEnterView chatActivityEnterView4 = gfVar5.f34928a;
                            if (chatActivityEnterView4.f32319x3 != null) {
                                RectF rectF3 = new RectF();
                                pVar.l(rectF3);
                                ji.n nVar2 = new ji.n(pVar, pVar.getContext(), 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF3.left + pVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF3.top + pVar.getTop());
                                nVar2.setAlpha(0.0f);
                                chatActivityEnterView4.U1.addView(nVar2, layoutParams2);
                                nVar2.post(new hp(gfVar5, nVar2, new ou(pVar, 5), hVar, pVar, 2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 13:
                try {
                    SQLiteDatabase sQLiteDatabase = ((vr) obj).f27221b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 14:
                m2.e eVar = ((l2.o0) obj).N;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1034, new li.p(Q, i13, 14, (char) 0));
                return;
            case 15:
                String str = h2.l0.f13471a;
                h2.c cVar = ((l2.z) ((n2.s) ((k8.a) obj).f17789c)).f19233a.C;
                l2.t tVar = new l2.t(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((h2.i0) cVar.f13419c).f13456a.getLooper()) {
                    z11 = true;
                }
                ja.p(z11);
                cVar.f13417a++;
                cVar.A(new f6(19, cVar, tVar));
                Integer num = (Integer) cVar.f13420e;
                cVar.G(Integer.valueOf(i13));
                return;
            case 16:
                oi.a0 a0Var = (oi.a0) obj;
                oi.d0 d0Var = a0Var.f21565f;
                if (a0Var.f21563c && d0Var.F != null && d0Var.f22106a != null) {
                    a0Var.d = true;
                    a0Var.f21561a.m(false);
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.b0 b0Var = d0Var.F;
                    oi.a aVar = d0Var.f22106a;
                    q3 q3Var = ((i3) b0Var).f21739a;
                    q3Var.r3(false);
                    q3Var.f21931p3.n(new n3(q3Var, aVar, i13), a0Var);
                    return;
                }
                return;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 18:
                np.s1(i13).V2(0, ((TLRPC.Chat) obj).f28051id, true);
                return;
            case 19:
                ((org.telegram.ui.p4) ((org.telegram.ui.f) obj).f46930b).a0(i13, true);
                return;
            case 20:
                org.telegram.ui.Cells.q1 q1Var = ((org.telegram.ui.Cells.f1) obj).f30208a;
                int i19 = q1Var.N5;
                if (i13 == i19) {
                    org.telegram.ui.Cells.c0 c0Var = (org.telegram.ui.Cells.c0) q1Var.I5.get(i19);
                    if (c0Var != null) {
                        org.telegram.ui.Cells.y yVar = c0Var.f30078s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var.b(false);
                        if (!q1Var.Q5.f23848r1) {
                            if (c0Var.f30069j != null) {
                                q1Var.n();
                            } else if (c0Var.f30068i != null) {
                                q1Var.n();
                                org.telegram.ui.Cells.l1 l1Var = q1Var.Sa;
                                if (l1Var != null) {
                                    l1Var.I1(q1Var, c0Var.f30068i);
                                }
                            }
                        }
                    }
                    q1Var.N5 = -1;
                    q1Var.q2();
                    return;
                }
                return;
            case 21:
                td tdVar = ((sd) obj).f51201f;
                tdVar.getClass();
                tdVar.c(i13);
                return;
            case 22:
                an anVar2 = ((gi) obj).f47449g;
                if (anVar2.Zb == i13) {
                    anVar2.pb();
                    return;
                }
                return;
            case 23:
                an anVar3 = ((hi) obj).f47705g;
                if (anVar3.Zb == i13) {
                    anVar3.pb();
                    return;
                }
                return;
            case 24:
                ((ni) obj).f49567a.l(this.f1592b, 0, true, 0, true, 0);
                return;
            case 25:
                an anVar4 = ((gi) obj).f47449g;
                if (anVar4.Zb == i13) {
                    anVar4.pb();
                    return;
                }
                return;
            case 26:
                an anVar5 = ((hi) obj).f47705g;
                if (anVar5.Zb == i13) {
                    anVar5.pb();
                    return;
                }
                return;
            case 27:
                an anVar6 = ((hi) obj).f47705g;
                if (anVar6.Zb == i13) {
                    anVar6.pb();
                    return;
                }
                return;
            case 28:
                an anVar7 = ((ol) obj).f49990x0;
                anVar7.C0.h1(i13, anVar7.N4);
                return;
            default:
                i10 = ((org.telegram.ui.ActionBar.e2) ((lm) obj).f49001a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i13, true);
                return;
        }
    }

    public w0(Object obj, int i7, int i10) {
        this.f1591a = i10;
        this.f1593c = obj;
        this.f1592b = i7;
    }
}
