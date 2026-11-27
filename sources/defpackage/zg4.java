package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
public final class zg4 implements r69 {
    public final byte a;
    public final Object b;

    public zg4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void e(int i, View view) {
        ac7 ac7Var;
        boolean z;
        ac7 ac7Var2;
        int i2;
        int i3;
        int i4;
        String M0;
        String str;
        v21 K;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        tl8 tl8Var;
        TLRPC.Document document;
        pz8 pz8Var;
        l39 l39Var;
        byte b = this.a;
        String str2 = "";
        long j = 0;
        int i8 = 0;
        r14 = false;
        r14 = false;
        boolean z4 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ah4 ah4Var = (ah4) obj;
                ht2 ht2Var = ah4Var.t1;
                ArrayList arrayList = ((ah4) ah4Var.n1.e).u1;
                if (i < arrayList.size()) {
                    ac7Var = (ac7) arrayList.get(i);
                } else {
                    ac7Var = null;
                }
                if (view instanceof hx0) {
                    z = ((hx0) view).e;
                } else {
                    z = false;
                }
                uj3 uj3Var = (uj3) ((kg2) ht2Var.b).b;
                ArrayList arrayList2 = uj3Var.K2;
                ArrayList E0 = ah4.E0(uj3Var, ac7Var, arrayList2, true, false);
                if (!z) {
                    if (ac7Var != null) {
                        i2 = ac7Var.h.size();
                    } else {
                        i2 = 0;
                    }
                    int size = E0.size() + i2;
                    if ((size > uj3Var.getMessagesController().l4.j1.f() && !uj3Var.getUserConfig().p()) || size > uj3Var.getMessagesController().l4.k1.f()) {
                        Context context = uj3Var.fragmentView.getContext();
                        i3 = ((e) uj3Var).currentAccount;
                        uj3Var.showDialog(new l46(4, i3, null, context, uj3Var));
                        ah4Var.dismiss();
                        return;
                    }
                }
                if (ac7Var != null) {
                    LongSparseIntArray longSparseIntArray = ac7Var.j;
                    if (z) {
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            ac7Var.i.add((Long) arrayList2.get(i9));
                            ac7Var.h.remove(arrayList2.get(i9));
                        }
                        ac7 ac7Var3 = ac7Var;
                        nf4.z0(ac7Var3, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, longSparseIntArray, false, false, true, true, false, uj3Var, null);
                        if (arrayList2.size() == 1) {
                            j = ((Long) arrayList2.get(0)).longValue();
                        }
                        long j2 = j;
                        UndoView w3 = uj3Var.w3();
                        if (w3 != null) {
                            w3.k(j2, 21, Integer.valueOf(arrayList2.size()), ac7Var3, null, null);
                        }
                        uj3Var = uj3Var;
                    } else {
                        ac7 ac7Var4 = ac7Var;
                        if (!E0.isEmpty()) {
                            for (int i10 = 0; i10 < E0.size(); i10++) {
                                ac7Var4.i.remove(E0.get(i10));
                            }
                            ac7Var4.h.addAll(E0);
                            ac7Var2 = ac7Var4;
                            nf4.z0(ac7Var2, ac7Var4.g, ac7Var4.b, ac7Var4.c, ac7Var4.n, ac7Var4.m, ac7Var4.h, ac7Var4.i, longSparseIntArray, false, false, true, true, false, uj3Var, null);
                        } else {
                            ac7Var2 = ac7Var4;
                        }
                        uj3Var = uj3Var;
                        if (E0.size() == 1) {
                            j = ((Long) E0.get(0)).longValue();
                        }
                        long j3 = j;
                        ac7 ac7Var5 = ac7Var2;
                        UndoView w32 = uj3Var.w3();
                        if (w32 != null) {
                            w32.k(j3, 20, Integer.valueOf(E0.size()), ac7Var5, null, null);
                        }
                    }
                } else {
                    uj3Var.presentFragment(new nf4(null, E0));
                }
                uj3Var.A3(true);
                ah4Var.dismiss();
                return;
            case 1:
                ll4 ll4Var = (ll4) obj;
                Runnable runnable = ((dl4) ll4Var.F.get(i)).c;
                if (runnable != null) {
                    runnable.run();
                    ll4Var.c(false);
                    return;
                }
                return;
            case 2:
                qn4 qn4Var = (qn4) obj;
                ArrayList arrayList3 = qn4Var.b2;
                ArrayList arrayList4 = qn4Var.d2;
                if ((view instanceof bd5) && (i4 = (i - 1) - qn4Var.m2) >= 0 && i4 < arrayList3.size()) {
                    long n = wf3.n((TLRPC.Peer) arrayList3.get(i4));
                    if (arrayList4.contains(Long.valueOf(n))) {
                        if (qn4Var.c2.contains(Long.valueOf(n))) {
                            int i11 = -qn4Var.x2;
                            qn4Var.x2 = i11;
                            hl.A3(i11, view, null);
                            yw0.APP_ERROR.a();
                            ArrayList arrayList5 = new ArrayList();
                            int i12 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                            e eVar = qn4Var.r1;
                            if (i12 >= 0) {
                                arrayList5.add(eVar.getMessagesController().X1(Long.valueOf(n)));
                                str = "beep boop.";
                            } else {
                                TLRPC.Chat M02 = eVar.getMessagesController().M0(Long.valueOf(-n));
                                if (xc2.V(M02)) {
                                    M0 = ob6.M0(2131750636, null);
                                } else {
                                    M0 = ob6.M0(2131750637, null);
                                }
                                arrayList5.add(M02);
                                str = M0;
                            }
                            if (qn4Var.y2 != n || System.currentTimeMillis() - qn4Var.z2 > 1500) {
                                qn4Var.y2 = n;
                                qn4Var.z2 = System.currentTimeMillis();
                                v21 g = new d31(qn4Var.f2, null).g(str, arrayList5);
                                g.j = 1500;
                                g.j();
                                return;
                            }
                            return;
                        }
                        arrayList4.remove(Long.valueOf(n));
                        ((bd5) view).c(false, true);
                    } else {
                        arrayList4.add(Long.valueOf(n));
                        ((bd5) view).c(true, true);
                    }
                    qn4Var.d1(true);
                    qn4Var.e1();
                    qn4Var.Z0(false);
                    return;
                }
                return;
            case 3:
                dd5 dd5Var = (dd5) obj;
                if (dd5Var.getParentActivity() != null) {
                    if (i != dd5Var.n && i != 0) {
                        if (i == dd5Var.s) {
                            if (dd5Var.f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", dd5Var.f.link);
                                    dd5Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131748864, null)), 500);
                                    return;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i == dd5Var.r) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dd5Var.getParentActivity());
                            alertDialog$Builder.a.U = ob6.M0(2131745753, null);
                            alertDialog$Builder.a.S = ob6.M0(2131745750, null);
                            alertDialog$Builder.j(ob6.M0(2131745751, null), new e05(dd5Var, (byte) 9));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            dd5Var.showDialog(alertDialog$Builder.a);
                            return;
                        } else {
                            return;
                        }
                    } else if (dd5Var.f != null) {
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", dd5Var.f.link));
                            d31.j(dd5Var).j();
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ((nd5) obj).e0(i, view);
                return;
            case 5:
                sd5 sd5Var = (sd5) obj;
                if (i == sd5Var.c2) {
                    sd5Var.a2.a.b1(true);
                    sd5Var.dismiss();
                    return;
                } else if (view instanceof lj6) {
                    lj6 lj6Var = (lj6) view;
                    if (!sd5Var.Z1.contains(Long.valueOf(lj6Var.getUserId()))) {
                        sd5Var.a2.a.f1(lj6Var.getUserId(), true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ((hs5) obj).d0(i, view);
                return;
            case 7:
                hc8 hc8Var = (hc8) obj;
                xv7 xv7Var = (xv7) xv7.a().get(i);
                hc8Var.e1.setTypeface(xv7Var.a);
                a78 e3 = a78.e(hc8Var.z1);
                String str3 = xv7Var.a;
                e3.j = str3;
                e3.a.edit().putString("typeface", str3).apply();
                h44 h44Var = hc8Var.C0;
                if (h44Var instanceof rlb) {
                    ((rlb) h44Var).setTypeface(xv7Var);
                }
                hc8Var.B0(false);
                return;
            case 8:
                ((LanguageSelectActivity) obj).h0(i, view);
                return;
            case 9:
                l46 l46Var = (l46) obj;
                HashSet hashSet = l46Var.t2;
                if (view instanceof kb) {
                    kb kbVar = (kb) view;
                    TLRPC.Chat currentChannel = kbVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    kbVar.r.a(hashSet.contains(currentChannel), true);
                    l46Var.w1();
                    return;
                } else if (view instanceof bd5) {
                    if (l46Var.T1 || ((i5 = l46Var.c2) != 11 && i5 != 34)) {
                        bd5 bd5Var = (bd5) view;
                        Object object = bd5Var.getObject();
                        if (bd5Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j4 = ((TLRPC.User) object).id;
                                int i13 = -l46Var.P2;
                                l46Var.P2 = i13;
                                hl.A3(i13, bd5Var, null);
                                yw0.APP_ERROR.a();
                                if (j4 >= 0) {
                                    str2 = lbc.l(uc7.s1(l46Var.a).X1(Long.valueOf(j4)));
                                }
                                boolean M3 = uc7.s1(l46Var.a).M3();
                                ViewGroup viewGroup = l46Var.b;
                                if (M3) {
                                    K = new d31((FrameLayout) viewGroup, l46Var.J0).Q(2131624211, 36, hl.S2(ob6.a0(null, null, 2131743415, str2)));
                                } else {
                                    K = new d31((FrameLayout) viewGroup, l46Var.J0).K(2131624211, hl.S2(ob6.a0(null, null, 2131743415, str2)), ob6.M0(2131743414, null), new w36(l46Var, (byte) 0));
                                }
                                K.j();
                                return;
                            }
                            return;
                        }
                        if (hashSet.contains(object)) {
                            hashSet.remove(object);
                        } else {
                            hashSet.add(object);
                        }
                        bd5Var.c(hashSet.contains(object), true);
                        l46Var.w1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 10:
            case 11:
                ((t07) obj).h(view);
                return;
            case 12:
                ((q67) obj).onBackPressed();
                return;
            case 13:
                z67 z67Var = (z67) obj;
                int i14 = z67Var.J;
                if (i >= i14 && i < z67Var.K) {
                    r47 r47Var = (r47) z67Var.y.get(i - i14);
                    if (r47Var.w4()) {
                        if (!z67Var.c0(r47Var)) {
                            z67Var.getOrCreateStoryViewer().J(z67Var.getParentActivity(), r47Var.l, l6b.a(z67Var.f));
                            return;
                        }
                        return;
                    }
                    long B0 = r47.B0(r47Var.k);
                    Bundle bundle = new Bundle();
                    if (wf3.D(B0)) {
                        bundle.putLong("user_id", B0);
                    } else {
                        bundle.putLong("chat_id", -B0);
                    }
                    bundle.putInt("message_id", r47Var.e1());
                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (z67Var.getMessagesController().C(bundle, z67Var, null, null)) {
                        z67Var.presentFragment(new zu1(bundle));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                gv7 gv7Var = (gv7) obj;
                gv7Var.j3.accept(Integer.valueOf(gv7Var.i3.b(i)));
                a78 a78Var = gv7Var.i3;
                a78Var.c.put(Integer.valueOf(a78Var.f), Integer.valueOf(a78Var.b(i)));
                a78Var.e = true;
                return;
            case 15:
                wab wabVar = (wab) obj;
                xv7 xv7Var2 = (xv7) xv7.a().get(i);
                wabVar.V0.setTypeface(xv7Var2.a);
                a78 e4 = a78.e(wabVar.p1);
                String str4 = xv7Var2.a;
                e4.j = str4;
                e4.a.edit().putString("typeface", str4).apply();
                h44 h44Var2 = wabVar.t0;
                if (h44Var2 instanceof rlb) {
                    ((rlb) h44Var2).setTypeface(xv7Var2);
                }
                wabVar.O0(false);
                return;
            case 16:
                ((PasscodeActivity) obj).r0(i, view);
                return;
            case 17:
                g48 g48Var = (g48) obj;
                g48Var.a(i, true);
                r38 r38Var = g48Var.h;
                if (r38Var != null) {
                    r38Var.a(Integer.valueOf(i));
                    return;
                }
                return;
            case 18:
                l98 l98Var = (l98) obj;
                ArrayList arrayList6 = l98Var.n;
                ArrayList arrayList7 = l98Var.f;
                do6 do6Var = l98Var.K;
                if (do6Var == null) {
                    if (arrayList7.isEmpty()) {
                        if (i < arrayList6.size()) {
                            String str5 = (String) arrayList6.get(i);
                            k98 k98Var = l98Var.u0;
                            if (k98Var != null) {
                                k98Var.F(str5);
                                return;
                            }
                            l98Var.Q.getSearchField().setText(str5);
                            l98Var.Q.getSearchField().setSelection(str5.length());
                            l98Var.f0(l98Var.Q.getSearchField());
                            return;
                        } else if (i == arrayList6.size() + 1) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l98Var.getParentActivity());
                            alertDialog$Builder2.a.S = ob6.M0(2131752021, null);
                            alertDialog$Builder2.a.U = ob6.M0(2131752026, null);
                            alertDialog$Builder2.j(ob6.M0(2131752064, null), new d98(l98Var, (byte) 0));
                            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                            id idVar = alertDialog$Builder2.a;
                            l98Var.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    arrayList7 = do6Var.e;
                }
                if (i >= 0 && i < arrayList7.size()) {
                    s7 s7Var = l98Var.Q;
                    if (s7Var != null) {
                        hl.t1(s7Var.getSearchField());
                    }
                    if (l98Var.Z) {
                        l98Var.e0(view, arrayList7.get(i));
                        return;
                    }
                    byte b2 = l98Var.U;
                    if (b2 != 1) {
                        i6 = 3;
                        if (b2 != 3) {
                            if (b2 != 2) {
                                i6 = 10;
                                if (b2 != 10) {
                                    if (l98Var.V == null) {
                                        i8 = 4;
                                    }
                                    i6 = i8;
                                }
                            }
                            PhotoViewer.q0().T1(null, l98Var, null);
                            PhotoViewer q0 = PhotoViewer.q0();
                            int i15 = l98Var.I;
                            boolean z5 = l98Var.J;
                            q0.h = i15;
                            q0.n = z5;
                            PhotoViewer.q0().o1(arrayList7, i, i6, l98Var.m0, l98Var.y0, l98Var.V);
                            return;
                        }
                    }
                    i6 = 1;
                    PhotoViewer.q0().T1(null, l98Var, null);
                    PhotoViewer q02 = PhotoViewer.q0();
                    int i152 = l98Var.I;
                    boolean z52 = l98Var.J;
                    q02.h = i152;
                    q02.n = z52;
                    PhotoViewer.q0().o1(arrayList7, i, i6, l98Var.m0, l98Var.y0, l98Var.V);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList8 = photoViewer.f7;
                if (!arrayList8.isEmpty() && (i7 = photoViewer.O4) >= 0 && i7 < arrayList8.size()) {
                    Object obj2 = arrayList8.get(photoViewer.O4);
                    if (obj2 instanceof go6) {
                        ((go6) obj2).s = photoViewer.k0();
                    }
                }
                photoViewer.j5 = true;
                int indexOf = arrayList8.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.K1(indexOf);
                }
                photoViewer.j5 = false;
                return;
            case 20:
                wh8 wh8Var = (wh8) obj;
                boolean[] zArr = wh8Var.x;
                if (i == wh8Var.p0) {
                    wh8Var.g0();
                    return;
                } else if (view instanceof wkb) {
                    wkb wkbVar = (wkb) view;
                    boolean z6 = wh8Var.M;
                    zeb zebVar = wh8Var.R;
                    if (zebVar != null) {
                        zebVar.e();
                    }
                    if (wh8Var.J) {
                        int i16 = -wh8Var.P;
                        wh8Var.P = i16;
                        hl.A3(i16, wkbVar, null);
                        yw0.APP_ERROR.a();
                        return;
                    }
                    if (i == wh8Var.s0) {
                        z2 = !wh8Var.H;
                        wh8Var.H = z2;
                    } else {
                        int i17 = wh8Var.v0;
                        if (i == i17) {
                            z2 = !wh8Var.I;
                            wh8Var.I = z2;
                        } else {
                            if (i == wh8Var.w0) {
                                z3 = !wh8Var.K;
                                wh8Var.K = z3;
                                wh8Var.u0();
                                int i18 = wh8Var.v0;
                                if (i18 >= 0 && i17 < 0) {
                                    wh8Var.b.i(i18);
                                } else if (i17 >= 0 && i18 < 0) {
                                    wh8Var.b.s(i17);
                                }
                            } else if (i == wh8Var.t0) {
                                boolean z7 = wh8Var.L;
                                z3 = !z7;
                                wh8Var.L = z3;
                                if (!z7 && wh8Var.M) {
                                    int i19 = wh8Var.k0;
                                    wh8Var.M = false;
                                    wh8Var.u0();
                                    f89 L = wh8Var.c.L(wh8Var.u0);
                                    if (L != null) {
                                        ((wkb) L.a).setChecked(false);
                                    } else {
                                        wh8Var.b.g(wh8Var.u0);
                                    }
                                    wh8Var.b.q(i19, 2);
                                }
                            } else if (wh8Var.O == 0) {
                                z2 = !wh8Var.M;
                                wh8Var.M = z2;
                                int i20 = wh8Var.k0;
                                wh8Var.u0();
                                boolean z8 = wh8Var.M;
                                uh8 uh8Var = wh8Var.b;
                                if (z8) {
                                    uh8Var.p(wh8Var.k0, 2);
                                } else {
                                    uh8Var.q(i20, 2);
                                }
                                if (wh8Var.M && wh8Var.L) {
                                    wh8Var.L = false;
                                    f89 L2 = wh8Var.c.L(wh8Var.t0);
                                    if (L2 != null) {
                                        ((wkb) L2.a).setChecked(false);
                                    } else {
                                        wh8Var.b.g(wh8Var.t0);
                                    }
                                }
                                if (wh8Var.M) {
                                    int i21 = 0;
                                    boolean z9 = false;
                                    while (i21 < zArr.length) {
                                        if (z9) {
                                            zArr[i21] = false;
                                        } else if (zArr[i21]) {
                                            z9 = true;
                                        }
                                        i21++;
                                        z9 = z9;
                                    }
                                }
                            } else {
                                return;
                            }
                            z2 = z3;
                        }
                    }
                    if (wh8Var.N && !wh8Var.M) {
                        wh8Var.c.getChildCount();
                        wh8Var.h.a();
                    }
                    for (int i22 = wh8Var.o0; i22 < wh8Var.o0 + wh8Var.E; i22++) {
                        f89 L3 = wh8Var.c.L(i22);
                        if (L3 != null) {
                            View view2 = L3.a;
                            if (view2 instanceof zh8) {
                                zh8 zh8Var = (zh8) view2;
                                zh8Var.n(wh8Var.M, true);
                                zh8Var.r.a(zArr[i22 - wh8Var.o0], z6);
                                if (zh8Var.getTop() > hl.L(40.0f) && i == wh8Var.u0 && !wh8Var.N) {
                                    wh8Var.h.c(zh8Var.getCheckBox());
                                    wh8Var.N = true;
                                }
                            }
                        }
                    }
                    wkbVar.setChecked(z2);
                    wh8Var.j0();
                    return;
                } else {
                    return;
                }
            case 21:
                ((PremiumPreviewFragment) obj).s0(i, view);
                return;
            case 22:
                rl8 rl8Var = (rl8) obj;
                PremiumPreviewFragment premiumPreviewFragment = rl8Var.n;
                ArrayList arrayList9 = premiumPreviewFragment.d;
                jd8 jd8Var = rl8Var.e;
                if (view.isEnabled() && (view instanceof em8)) {
                    em8 em8Var = (em8) view;
                    premiumPreviewFragment.e = arrayList9.indexOf(em8Var.getTier());
                    premiumPreviewFragment.y0(true);
                    em8Var.c(true, true);
                    for (int i23 = 0; i23 < jd8Var.getChildCount(); i23++) {
                        View childAt = jd8Var.getChildAt(i23);
                        if (childAt instanceof em8) {
                            em8 em8Var2 = (em8) childAt;
                            if (em8Var2.getTier() != em8Var.getTier()) {
                                em8Var2.c(false, true);
                            }
                        }
                    }
                    for (int i24 = 0; i24 < jd8Var.getHiddenChildCount(); i24++) {
                        View X = jd8Var.X(i24);
                        if (X instanceof em8) {
                            em8 em8Var3 = (em8) X;
                            if (em8Var3.getTier() != em8Var.getTier()) {
                                em8Var3.c(false, true);
                            }
                        }
                    }
                    for (int i25 = 0; i25 < jd8Var.getCachedChildCount(); i25++) {
                        View Q = jd8Var.Q(i25);
                        if (Q instanceof em8) {
                            em8 em8Var4 = (em8) Q;
                            if (em8Var4.getTier() != em8Var.getTier()) {
                                em8Var4.c(false, true);
                            }
                        }
                    }
                    for (int i26 = 0; i26 < jd8Var.getAttachedScrapChildCount(); i26++) {
                        View P = jd8Var.P(i26);
                        if (P instanceof em8) {
                            em8 em8Var5 = (em8) P;
                            if (em8Var5.getTier() != em8Var.getTier()) {
                                em8Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().p() || ((tl8Var = premiumPreviewFragment.f) != null && tl8Var.a.months < ((tl8) arrayList9.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z4 = true;
                    }
                    hl.R3(frameLayout, z4);
                    return;
                }
                return;
            case 23:
                rk8 rk8Var = (rk8) obj;
                if (view != null) {
                    rk8Var.A1(view, true);
                    rk8Var.l3 = false;
                    rk8Var.y0(0, view.getTop() - ((rk8Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), hl.H);
                    return;
                }
                return;
            case 24:
                ((PrivacyControlActivity) obj).H0(i, view);
                return;
            case 25:
                vn8 vn8Var = (vn8) obj;
                boolean z10 = vn8Var.E;
                if (i == vn8Var.x) {
                    id idVar2 = jj.L(vn8Var.getParentActivity(), ob6.M0(2131747640, null), ob6.M0(2131747641, null), ob6.M0(2131751563, null), new pg6(vn8Var, (byte) 16), null).a;
                    idVar2.show();
                    idVar2.h();
                    return;
                } else if (i == vn8Var.f) {
                    if (z10) {
                        ?? eVar2 = new e(null);
                        eVar2.d = new Paint();
                        eVar2.f = new ag3[2];
                        eVar2.x = true;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("onlySelect", true);
                        bundle2.putBoolean("checkCanWrite", false);
                        bundle2.putBoolean("resetDelegate", false);
                        bundle2.putInt("dialogsType", 9);
                        uj3 uj3Var2 = new uj3(bundle2);
                        eVar2.a = uj3Var2;
                        uj3Var2.E2 = new xf3(eVar2);
                        uj3Var2.onFragmentCreate();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("onlyUsers", true);
                        bundle3.putBoolean("destroyAfterSelect", true);
                        bundle3.putBoolean("returnAsResult", true);
                        bundle3.putBoolean("disableSections", true);
                        bundle3.putBoolean("needFinishFragment", false);
                        bundle3.putBoolean("resetDelegate", false);
                        bundle3.putBoolean("allowSelf", false);
                        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
                        eVar2.b = contactsActivity;
                        contactsActivity.V = new xf3(eVar2);
                        contactsActivity.onFragmentCreate();
                        vn8Var.presentFragment((e) eVar2);
                        return;
                    }
                    Bundle l = bs2.l("isNeverShare", true);
                    if (z10) {
                        l.putInt("chatAddType", 2);
                    }
                    rc5 rc5Var = new rc5(l);
                    rc5Var.x = new tn8(vn8Var);
                    vn8Var.presentFragment(rc5Var);
                    return;
                } else if (i >= vn8Var.r && i < vn8Var.s) {
                    if (z10) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", vn8Var.getMessagesController().x0.keyAt(i - vn8Var.r));
                        vn8Var.presentFragment(new ProfileActivity(bundle4, null));
                        return;
                    }
                    throw null;
                } else {
                    return;
                }
            case 26:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).z2(i);
                return;
            case 27:
                ((ProxyListActivity) obj).f0(i, view);
                return;
            case 28:
                oz8 oz8Var = (oz8) obj;
                if ((view instanceof xy8) && (document = ((xy8) view).e) != null) {
                    long j5 = document.id;
                    if (j5 != 0) {
                        rz8 rz8Var = oz8Var.a;
                        if (rz8Var.d != null) {
                            if (!rz8Var.getUserConfig().p() && ((pz8Var = rz8Var.h) == null || !pz8Var.I.contains(Long.valueOf(j5)))) {
                                g09 g09Var = rz8Var.d;
                                g09Var.getClass();
                                g09Var.d1(0, ob6.M0(2131746202, null), ob6.M0(2131746200, null));
                                g09Var.i0();
                                return;
                            }
                            g09 g09Var2 = rz8Var.d;
                            g09Var2.getClass();
                            String str6 = "c:" + j5;
                            HashMap hashMap = g09Var2.K;
                            if (!hashMap.containsKey(str6)) {
                                wl l2 = wl.l(g09Var2.b, 2, document);
                                l2.b(g09Var2);
                                hashMap.put(str6, l2);
                            }
                            if (!str6.startsWith("c:")) {
                                str6 = str6.replace("️", "");
                            }
                            ArrayList arrayList10 = g09Var2.J;
                            int indexOf2 = arrayList10.indexOf(str6);
                            if (indexOf2 >= 0) {
                                arrayList10.remove(indexOf2);
                            } else {
                                if (arrayList10.size() >= 6) {
                                    arrayList10.remove(0);
                                }
                                arrayList10.add(str6);
                            }
                            g09Var2.c();
                            g09Var2.i0();
                            pz8 pz8Var2 = rz8Var.h;
                            if (pz8Var2 != null) {
                                ArrayList a = pz8Var2.a();
                                a.remove(Long.valueOf(j5));
                                a.add(0, Long.valueOf(j5));
                                while (a.size() > 21) {
                                    qd4.v(1, a);
                                }
                                StringBuilder sb = new StringBuilder();
                                for (int i27 = 0; i27 < a.size(); i27++) {
                                    if (i27 > 0) {
                                        sb.append(',');
                                    }
                                    sb.append(a.get(i27));
                                }
                                uc7.s1(pz8Var2.a).Y3.edit().putString("qrAppliedEmoji", sb.toString()).apply();
                                pz8Var2.K = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                o39 o39Var = (o39) obj;
                ArrayList arrayList11 = o39Var.n;
                int d = o39Var.f.d(i);
                if (d == 0) {
                    n39 n39Var = o39Var.F;
                    if (n39Var != null) {
                        n39Var.g(r47.B1(((TLRPC.MessagePeerReaction) arrayList11.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList11.get(i));
                        return;
                    }
                    return;
                } else if (d == 1 && (l39Var = o39Var.H) != null) {
                    l39Var.c(o39Var.J);
                    return;
                } else {
                    return;
                }
        }
    }
}
