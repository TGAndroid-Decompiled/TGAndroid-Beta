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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
public final class bf4 implements c39 {
    public final byte a;
    public final Object b;

    public bf4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void d(int i, View view) {
        t97 t97Var;
        boolean z;
        int i2;
        int i3;
        int i4;
        String M0;
        String str;
        m21 K;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        gi8 gi8Var;
        TLRPC.Document document;
        ew8 ew8Var;
        xz8 xz8Var;
        byte b = this.a;
        String str2 = "";
        long j = 0;
        int i8 = 0;
        r13 = false;
        r13 = false;
        boolean z4 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                cf4 cf4Var = (cf4) obj;
                vu2 vu2Var = cf4Var.t1;
                ArrayList arrayList = ((cf4) cf4Var.n1.e).u1;
                if (i < arrayList.size()) {
                    t97Var = (t97) arrayList.get(i);
                } else {
                    t97Var = null;
                }
                if (view instanceof zw0) {
                    z = ((zw0) view).e;
                } else {
                    z = false;
                }
                cj3 cj3Var = (cj3) ((vm2) vu2Var.b).b;
                ArrayList arrayList2 = cj3Var.K2;
                ArrayList D0 = cf4.D0(cj3Var, t97Var, arrayList2, true, false);
                if (!z) {
                    if (t97Var != null) {
                        i2 = t97Var.h.size();
                    } else {
                        i2 = 0;
                    }
                    int size = D0.size() + i2;
                    if ((size > cj3Var.getMessagesController().k4.b1.f() && !cj3Var.getUserConfig().p()) || size > cj3Var.getMessagesController().k4.c1.f()) {
                        Context context = cj3Var.fragmentView.getContext();
                        i3 = ((d) cj3Var).currentAccount;
                        cj3Var.showDialog(new h26(4, i3, null, context, cj3Var));
                        cf4Var.dismiss();
                        return;
                    }
                }
                if (t97Var != null) {
                    LongSparseIntArray longSparseIntArray = t97Var.j;
                    if (z) {
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            t97Var.i.add((Long) arrayList2.get(i9));
                            t97Var.h.remove(arrayList2.get(i9));
                        }
                        pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, longSparseIntArray, false, false, true, true, false, cj3Var, null);
                        if (arrayList2.size() == 1) {
                            j = ((Long) arrayList2.get(0)).longValue();
                        }
                        long j2 = j;
                        t97 t97Var2 = t97Var;
                        UndoView u3 = cj3Var.u3();
                        if (u3 != null) {
                            u3.k(j2, 21, Integer.valueOf(arrayList2.size()), t97Var2, null, null);
                        }
                        cj3Var = cj3Var;
                    } else {
                        if (!D0.isEmpty()) {
                            for (int i10 = 0; i10 < D0.size(); i10++) {
                                t97Var.i.remove(D0.get(i10));
                            }
                            t97Var.h.addAll(D0);
                            pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, longSparseIntArray, false, false, true, true, false, cj3Var, null);
                        }
                        cj3Var = cj3Var;
                        if (D0.size() == 1) {
                            j = ((Long) D0.get(0)).longValue();
                        }
                        long j3 = j;
                        t97 t97Var3 = t97Var;
                        UndoView u32 = cj3Var.u3();
                        if (u32 != null) {
                            u32.k(j3, 20, Integer.valueOf(D0.size()), t97Var3, null, null);
                        }
                    }
                } else {
                    cj3Var.presentFragment(new pd4(null, D0));
                }
                cj3Var.y3(true);
                cf4Var.dismiss();
                return;
            case 1:
                hj4 hj4Var = (hj4) obj;
                Runnable runnable = ((zi4) hj4Var.F.get(i)).c;
                if (runnable != null) {
                    runnable.run();
                    hj4Var.c(false);
                    return;
                }
                return;
            case 2:
                ll4 ll4Var = (ll4) obj;
                ArrayList arrayList3 = ll4Var.b2;
                ArrayList arrayList4 = ll4Var.d2;
                if ((view instanceof za5) && (i4 = (i - 1) - ll4Var.m2) >= 0 && i4 < arrayList3.size()) {
                    long n = cf3.n((TLRPC.Peer) arrayList3.get(i4));
                    if (arrayList4.contains(Long.valueOf(n))) {
                        if (ll4Var.c2.contains(Long.valueOf(n))) {
                            int i11 = -ll4Var.x2;
                            ll4Var.x2 = i11;
                            gl.A3(i11, view, null);
                            pw0.APP_ERROR.a();
                            ArrayList arrayList5 = new ArrayList();
                            int i12 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                            d dVar = ll4Var.r1;
                            if (i12 >= 0) {
                                arrayList5.add(dVar.getMessagesController().V1(Long.valueOf(n)));
                                str = "beep boop.";
                            } else {
                                TLRPC.Chat K0 = dVar.getMessagesController().K0(Long.valueOf(-n));
                                if (hc2.V(K0)) {
                                    M0 = k96.M0(2131750659, null);
                                } else {
                                    M0 = k96.M0(2131750660, null);
                                }
                                arrayList5.add(K0);
                                str = M0;
                            }
                            if (ll4Var.y2 != n || System.currentTimeMillis() - ll4Var.z2 > 1500) {
                                ll4Var.y2 = n;
                                ll4Var.z2 = System.currentTimeMillis();
                                m21 g = new u21(ll4Var.f2, null).g(str, arrayList5);
                                g.j = 1500;
                                g.j();
                                return;
                            }
                            return;
                        }
                        arrayList4.remove(Long.valueOf(n));
                        ((za5) view).c(false, true);
                    } else {
                        arrayList4.add(Long.valueOf(n));
                        ((za5) view).c(true, true);
                    }
                    ll4Var.c1(true);
                    ll4Var.d1();
                    ll4Var.Y0(false);
                    return;
                }
                return;
            case 3:
                bb5 bb5Var = (bb5) obj;
                if (bb5Var.getParentActivity() != null) {
                    if (i != bb5Var.n && i != 0) {
                        if (i == bb5Var.s) {
                            if (bb5Var.f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", bb5Var.f.link);
                                    bb5Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131748918, null)), 500);
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i == bb5Var.r) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb5Var.getParentActivity());
                            alertDialog$Builder.a.U = k96.M0(2131745833, null);
                            alertDialog$Builder.a.S = k96.M0(2131745830, null);
                            alertDialog$Builder.j(k96.M0(2131745831, null), new ry4(bb5Var, (byte) 7));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            bb5Var.showDialog(alertDialog$Builder.a);
                            return;
                        } else {
                            return;
                        }
                    } else if (bb5Var.f != null) {
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bb5Var.f.link));
                            u21.j(bb5Var).j();
                            return;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ((mb5) obj).e0(i, view);
                return;
            case 5:
                rb5 rb5Var = (rb5) obj;
                if (i == rb5Var.c2) {
                    rb5Var.a2.a.a1(true);
                    rb5Var.dismiss();
                    return;
                } else if (view instanceof gh6) {
                    gh6 gh6Var = (gh6) view;
                    if (!rb5Var.Z1.contains(Long.valueOf(gh6Var.getUserId()))) {
                        rb5Var.a2.a.e1(gh6Var.getUserId(), true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ((gq5) obj).d0(i, view);
                return;
            case 7:
                q88 q88Var = (q88) obj;
                qs7 qs7Var = (qs7) qs7.a().get(i);
                q88Var.k1.setTypeface(qs7Var.a);
                k38 e3 = k38.e(q88Var.F1);
                String str3 = qs7Var.a;
                e3.j = str3;
                e3.a.edit().putString("typeface", str3).apply();
                l34 l34Var = q88Var.I0;
                if (l34Var instanceof vhb) {
                    ((vhb) l34Var).setTypeface(qs7Var);
                }
                q88Var.B0(false);
                return;
            case 8:
                ((LanguageSelectActivity) obj).h0(i, view);
                return;
            case 9:
                h26 h26Var = (h26) obj;
                HashSet hashSet = h26Var.t2;
                if (view instanceof jb) {
                    jb jbVar = (jb) view;
                    TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    jbVar.r.a(hashSet.contains(currentChannel), true);
                    h26Var.v1();
                    return;
                } else if (view instanceof za5) {
                    if (h26Var.T1 || ((i5 = h26Var.c2) != 11 && i5 != 34)) {
                        za5 za5Var = (za5) view;
                        Object object = za5Var.getObject();
                        if (za5Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j4 = ((TLRPC.User) object).id;
                                int i13 = -h26Var.P2;
                                h26Var.P2 = i13;
                                gl.A3(i13, za5Var, null);
                                pw0.APP_ERROR.a();
                                if (j4 >= 0) {
                                    str2 = l7c.l(na7.q1(h26Var.a).V1(Long.valueOf(j4)));
                                }
                                boolean F3 = na7.q1(h26Var.a).F3();
                                ViewGroup viewGroup = h26Var.b;
                                if (F3) {
                                    K = new u21((FrameLayout) viewGroup, h26Var.J0).Q(2131624211, 36, gl.S2(k96.a0(null, null, 2131743521, str2)));
                                } else {
                                    K = new u21((FrameLayout) viewGroup, h26Var.J0).K(2131624211, gl.S2(k96.a0(null, null, 2131743521, str2)), k96.M0(2131743520, null), new s16(h26Var, (byte) 0));
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
                        za5Var.c(hashSet.contains(object), true);
                        h26Var.v1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 10:
            case 11:
                ((my6) obj).h(view);
                return;
            case 12:
                ((j47) obj).onBackPressed();
                return;
            case 13:
                s47 s47Var = (s47) obj;
                int i14 = s47Var.J;
                if (i >= i14 && i < s47Var.K) {
                    k27 k27Var = (k27) s47Var.y.get(i - i14);
                    if (k27Var.w4()) {
                        if (!s47Var.c0(k27Var)) {
                            s47Var.getOrCreateStoryViewer().J(s47Var.getParentActivity(), k27Var.l, p2b.a(s47Var.f));
                            return;
                        }
                        return;
                    }
                    long B0 = k27.B0(k27Var.k);
                    Bundle bundle = new Bundle();
                    if (cf3.D(B0)) {
                        bundle.putLong("user_id", B0);
                    } else {
                        bundle.putLong("chat_id", -B0);
                    }
                    bundle.putInt("message_id", k27Var.e1());
                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (s47Var.getMessagesController().A(bundle, s47Var, null, null)) {
                        s47Var.presentFragment(new mu1(bundle));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                as7 as7Var = (as7) obj;
                as7Var.j3.accept(Integer.valueOf(as7Var.i3.b(i)));
                k38 k38Var = as7Var.i3;
                k38Var.c.put(Integer.valueOf(k38Var.f), Integer.valueOf(k38Var.b(i)));
                k38Var.e = true;
                return;
            case 15:
                x6b x6bVar = (x6b) obj;
                qs7 qs7Var2 = (qs7) qs7.a().get(i);
                x6bVar.b1.setTypeface(qs7Var2.a);
                k38 e4 = k38.e(x6bVar.v1);
                String str4 = qs7Var2.a;
                e4.j = str4;
                e4.a.edit().putString("typeface", str4).apply();
                l34 l34Var2 = x6bVar.z0;
                if (l34Var2 instanceof vhb) {
                    ((vhb) l34Var2).setTypeface(qs7Var2);
                }
                x6bVar.P0(false);
                return;
            case 16:
                ((PasscodeActivity) obj).r0(i, view);
                return;
            case 17:
                z08 z08Var = (z08) obj;
                z08Var.a(i, true);
                l08 l08Var = z08Var.h;
                if (l08Var != null) {
                    l08Var.a(Integer.valueOf(i));
                    return;
                }
                return;
            case 18:
                u58 u58Var = (u58) obj;
                ArrayList arrayList6 = u58Var.n;
                ArrayList arrayList7 = u58Var.f;
                xl6 xl6Var = u58Var.K;
                if (xl6Var == null) {
                    if (arrayList7.isEmpty()) {
                        if (i < arrayList6.size()) {
                            String str5 = (String) arrayList6.get(i);
                            t58 t58Var = u58Var.u0;
                            if (t58Var != null) {
                                t58Var.F(str5);
                                return;
                            }
                            u58Var.Q.getSearchField().setText(str5);
                            u58Var.Q.getSearchField().setSelection(str5.length());
                            u58Var.f0(u58Var.Q.getSearchField());
                            return;
                        } else if (i == arrayList6.size() + 1) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u58Var.getParentActivity());
                            alertDialog$Builder2.a.S = k96.M0(2131752044, null);
                            alertDialog$Builder2.a.U = k96.M0(2131752049, null);
                            alertDialog$Builder2.j(k96.M0(2131752087, null), new m58(u58Var, (byte) 0));
                            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                            hd hdVar = alertDialog$Builder2.a;
                            u58Var.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    arrayList7 = xl6Var.e;
                }
                if (i >= 0 && i < arrayList7.size()) {
                    r7 r7Var = u58Var.Q;
                    if (r7Var != null) {
                        gl.t1(r7Var.getSearchField());
                    }
                    if (u58Var.Z) {
                        u58Var.e0(view, arrayList7.get(i));
                        return;
                    }
                    byte b2 = u58Var.U;
                    if (b2 != 1) {
                        i6 = 3;
                        if (b2 != 3) {
                            if (b2 != 2) {
                                i6 = 10;
                                if (b2 != 10) {
                                    if (u58Var.V == null) {
                                        i8 = 4;
                                    }
                                    i6 = i8;
                                }
                            }
                            PhotoViewer.r0().T1(null, u58Var, null);
                            PhotoViewer r0 = PhotoViewer.r0();
                            int i15 = u58Var.I;
                            boolean z5 = u58Var.J;
                            r0.h = i15;
                            r0.n = z5;
                            PhotoViewer.r0().o1(arrayList7, i, i6, u58Var.m0, u58Var.y0, u58Var.V);
                            return;
                        }
                    }
                    i6 = 1;
                    PhotoViewer.r0().T1(null, u58Var, null);
                    PhotoViewer r02 = PhotoViewer.r0();
                    int i152 = u58Var.I;
                    boolean z52 = u58Var.J;
                    r02.h = i152;
                    r02.n = z52;
                    PhotoViewer.r0().o1(arrayList7, i, i6, u58Var.m0, u58Var.y0, u58Var.V);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList8 = photoViewer.f7;
                if (!arrayList8.isEmpty() && (i7 = photoViewer.O4) >= 0 && i7 < arrayList8.size()) {
                    Object obj2 = arrayList8.get(photoViewer.O4);
                    if (obj2 instanceof bm6) {
                        ((bm6) obj2).s = photoViewer.l0();
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
                ie8 ie8Var = (ie8) obj;
                boolean[] zArr = ie8Var.x;
                if (i == ie8Var.p0) {
                    ie8Var.g0();
                    return;
                } else if (view instanceof ahb) {
                    ahb ahbVar = (ahb) view;
                    boolean z6 = ie8Var.M;
                    dbb dbbVar = ie8Var.R;
                    if (dbbVar != null) {
                        dbbVar.e();
                    }
                    if (ie8Var.J) {
                        int i16 = -ie8Var.P;
                        ie8Var.P = i16;
                        gl.A3(i16, ahbVar, null);
                        pw0.APP_ERROR.a();
                        return;
                    }
                    if (i == ie8Var.s0) {
                        z2 = !ie8Var.H;
                        ie8Var.H = z2;
                    } else {
                        int i17 = ie8Var.v0;
                        if (i == i17) {
                            z2 = !ie8Var.I;
                            ie8Var.I = z2;
                        } else {
                            if (i == ie8Var.w0) {
                                z3 = !ie8Var.K;
                                ie8Var.K = z3;
                                ie8Var.u0();
                                int i18 = ie8Var.v0;
                                if (i18 >= 0 && i17 < 0) {
                                    ie8Var.b.i(i18);
                                } else if (i17 >= 0 && i18 < 0) {
                                    ie8Var.b.r(i17);
                                }
                            } else if (i == ie8Var.t0) {
                                boolean z7 = ie8Var.L;
                                z3 = !z7;
                                ie8Var.L = z3;
                                if (!z7 && ie8Var.M) {
                                    int i19 = ie8Var.k0;
                                    ie8Var.M = false;
                                    ie8Var.u0();
                                    s49 K2 = ie8Var.c.K(ie8Var.u0);
                                    if (K2 != null) {
                                        ((ahb) K2.a).setChecked(false);
                                    } else {
                                        ie8Var.b.g(ie8Var.u0);
                                    }
                                    ie8Var.b.q(i19, 2);
                                }
                            } else if (ie8Var.O == 0) {
                                z2 = !ie8Var.M;
                                ie8Var.M = z2;
                                int i20 = ie8Var.k0;
                                ie8Var.u0();
                                boolean z8 = ie8Var.M;
                                ge8 ge8Var = ie8Var.b;
                                if (z8) {
                                    ge8Var.p(ie8Var.k0, 2);
                                } else {
                                    ge8Var.q(i20, 2);
                                }
                                if (ie8Var.M && ie8Var.L) {
                                    ie8Var.L = false;
                                    s49 K3 = ie8Var.c.K(ie8Var.t0);
                                    if (K3 != null) {
                                        ((ahb) K3.a).setChecked(false);
                                    } else {
                                        ie8Var.b.g(ie8Var.t0);
                                    }
                                }
                                if (ie8Var.M) {
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
                    if (ie8Var.N && !ie8Var.M) {
                        ie8Var.c.getChildCount();
                        ie8Var.h.a();
                    }
                    for (int i22 = ie8Var.o0; i22 < ie8Var.o0 + ie8Var.E; i22++) {
                        s49 K4 = ie8Var.c.K(i22);
                        if (K4 != null) {
                            View view2 = K4.a;
                            if (view2 instanceof le8) {
                                le8 le8Var = (le8) view2;
                                le8Var.n(ie8Var.M, true);
                                le8Var.r.a(zArr[i22 - ie8Var.o0], z6);
                                if (le8Var.getTop() > gl.L(40.0f) && i == ie8Var.u0 && !ie8Var.N) {
                                    ie8Var.h.c(le8Var.getCheckBox());
                                    ie8Var.N = true;
                                }
                            }
                        }
                    }
                    ahbVar.setChecked(z2);
                    ie8Var.j0();
                    return;
                } else {
                    return;
                }
            case 21:
                ((PremiumPreviewFragment) obj).s0(i, view);
                return;
            case 22:
                ei8 ei8Var = (ei8) obj;
                PremiumPreviewFragment premiumPreviewFragment = ei8Var.n;
                ArrayList arrayList9 = premiumPreviewFragment.d;
                t98 t98Var = ei8Var.e;
                if (view.isEnabled() && (view instanceof ri8)) {
                    ri8 ri8Var = (ri8) view;
                    premiumPreviewFragment.e = arrayList9.indexOf(ri8Var.getTier());
                    premiumPreviewFragment.x0(true);
                    ri8Var.c(true, true);
                    for (int i23 = 0; i23 < t98Var.getChildCount(); i23++) {
                        View childAt = t98Var.getChildAt(i23);
                        if (childAt instanceof ri8) {
                            ri8 ri8Var2 = (ri8) childAt;
                            if (ri8Var2.getTier() != ri8Var.getTier()) {
                                ri8Var2.c(false, true);
                            }
                        }
                    }
                    for (int i24 = 0; i24 < t98Var.getHiddenChildCount(); i24++) {
                        View W = t98Var.W(i24);
                        if (W instanceof ri8) {
                            ri8 ri8Var3 = (ri8) W;
                            if (ri8Var3.getTier() != ri8Var.getTier()) {
                                ri8Var3.c(false, true);
                            }
                        }
                    }
                    for (int i25 = 0; i25 < t98Var.getCachedChildCount(); i25++) {
                        View P = t98Var.P(i25);
                        if (P instanceof ri8) {
                            ri8 ri8Var4 = (ri8) P;
                            if (ri8Var4.getTier() != ri8Var.getTier()) {
                                ri8Var4.c(false, true);
                            }
                        }
                    }
                    for (int i26 = 0; i26 < t98Var.getAttachedScrapChildCount(); i26++) {
                        View O = t98Var.O(i26);
                        if (O instanceof ri8) {
                            ri8 ri8Var5 = (ri8) O;
                            if (ri8Var5.getTier() != ri8Var.getTier()) {
                                ri8Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().p() || ((gi8Var = premiumPreviewFragment.f) != null && gi8Var.a.months < ((gi8) arrayList9.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z4 = true;
                    }
                    gl.R3(frameLayout, z4);
                    return;
                }
                return;
            case 23:
                dh8 dh8Var = (dh8) obj;
                if (view != null) {
                    dh8Var.z1(view, true);
                    dh8Var.l3 = false;
                    dh8Var.x0(0, view.getTop() - ((dh8Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), gl.H);
                    return;
                }
                return;
            case 24:
                ((PrivacyControlActivity) obj).G0(i, view);
                return;
            case 25:
                gk8 gk8Var = (gk8) obj;
                boolean z10 = gk8Var.E;
                if (i == gk8Var.x) {
                    hd hdVar2 = ij.L(gk8Var.getParentActivity(), k96.M0(2131747720, null), k96.M0(2131747721, null), k96.M0(2131751586, null), new am6(gk8Var, (byte) 13), null).a;
                    hdVar2.show();
                    hdVar2.h();
                    return;
                } else if (i == gk8Var.f) {
                    if (z10) {
                        ?? dVar2 = new d(null);
                        dVar2.d = new Paint();
                        dVar2.f = new gf3[2];
                        dVar2.x = true;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("onlySelect", true);
                        bundle2.putBoolean("checkCanWrite", false);
                        bundle2.putBoolean("resetDelegate", false);
                        bundle2.putInt("dialogsType", 9);
                        cj3 cj3Var2 = new cj3(bundle2);
                        dVar2.a = cj3Var2;
                        cj3Var2.E2 = new df3(dVar2);
                        cj3Var2.onFragmentCreate();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("onlyUsers", true);
                        bundle3.putBoolean("destroyAfterSelect", true);
                        bundle3.putBoolean("returnAsResult", true);
                        bundle3.putBoolean("disableSections", true);
                        bundle3.putBoolean("needFinishFragment", false);
                        bundle3.putBoolean("resetDelegate", false);
                        bundle3.putBoolean("allowSelf", false);
                        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
                        dVar2.b = contactsActivity;
                        contactsActivity.V = new df3(dVar2);
                        contactsActivity.onFragmentCreate();
                        gk8Var.presentFragment((d) dVar2);
                        return;
                    }
                    Bundle l = ir2.l("isNeverShare", true);
                    if (z10) {
                        l.putInt("chatAddType", 2);
                    }
                    qa5 qa5Var = new qa5(l);
                    qa5Var.x = new ek8(gk8Var);
                    gk8Var.presentFragment(qa5Var);
                    return;
                } else if (i >= gk8Var.r && i < gk8Var.s) {
                    if (z10) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", gk8Var.getMessagesController().x0.keyAt(i - gk8Var.r));
                        gk8Var.presentFragment(new ProfileActivity(bundle4, null));
                        return;
                    }
                    throw null;
                } else {
                    return;
                }
            case 26:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).y2(i);
                return;
            case 27:
                ((ProxyListActivity) obj).f0(i, view);
                return;
            case 28:
                dw8 dw8Var = (dw8) obj;
                if ((view instanceof mv8) && (document = ((mv8) view).e) != null) {
                    long j5 = document.id;
                    if (j5 != 0) {
                        gw8 gw8Var = dw8Var.a;
                        if (gw8Var.d != null) {
                            if (!gw8Var.getUserConfig().p() && ((ew8Var = gw8Var.h) == null || !ew8Var.I.contains(Long.valueOf(j5)))) {
                                vw8 vw8Var = gw8Var.d;
                                vw8Var.getClass();
                                vw8Var.d1(0, k96.M0(2131746282, null), k96.M0(2131746280, null));
                                vw8Var.i0();
                                return;
                            }
                            vw8 vw8Var2 = gw8Var.d;
                            vw8Var2.getClass();
                            String str6 = "c:" + j5;
                            HashMap hashMap = vw8Var2.K;
                            if (!hashMap.containsKey(str6)) {
                                vl l2 = vl.l(vw8Var2.b, 2, document);
                                l2.b(vw8Var2);
                                hashMap.put(str6, l2);
                            }
                            if (!str6.startsWith("c:")) {
                                str6 = str6.replace("️", "");
                            }
                            ArrayList arrayList10 = vw8Var2.J;
                            int indexOf2 = arrayList10.indexOf(str6);
                            if (indexOf2 >= 0) {
                                arrayList10.remove(indexOf2);
                            } else {
                                if (arrayList10.size() >= 6) {
                                    arrayList10.remove(0);
                                }
                                arrayList10.add(str6);
                            }
                            vw8Var2.c();
                            vw8Var2.i0();
                            ew8 ew8Var2 = gw8Var.h;
                            if (ew8Var2 != null) {
                                ArrayList a = ew8Var2.a();
                                a.remove(Long.valueOf(j5));
                                a.add(0, Long.valueOf(j5));
                                while (a.size() > 21) {
                                    tb4.v(1, a);
                                }
                                StringBuilder sb = new StringBuilder();
                                for (int i27 = 0; i27 < a.size(); i27++) {
                                    if (i27 > 0) {
                                        sb.append(',');
                                    }
                                    sb.append(a.get(i27));
                                }
                                na7.q1(ew8Var2.a).X3.edit().putString("qrAppliedEmoji", sb.toString()).apply();
                                ew8Var2.K = true;
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
                a09 a09Var = (a09) obj;
                ArrayList arrayList11 = a09Var.n;
                int d = a09Var.f.d(i);
                if (d == 0) {
                    zz8 zz8Var = a09Var.F;
                    if (zz8Var != null) {
                        zz8Var.l(k27.B1(((TLRPC.MessagePeerReaction) arrayList11.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList11.get(i));
                        return;
                    }
                    return;
                } else if (d == 1 && (xz8Var = a09Var.H) != null) {
                    xz8Var.c(a09Var.J);
                    return;
                } else {
                    return;
                }
        }
    }
}
