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
public final class kg4 implements f59 {
    public final byte a;
    public final Object b;

    public kg4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void g(int i, View view) {
        ub7 ub7Var;
        boolean z;
        ub7 ub7Var2;
        int i2;
        int i3;
        int i4;
        String M0;
        String str;
        u31 K;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        ik8 ik8Var;
        TLRPC.Document document;
        gy8 gy8Var;
        byte b = this.a;
        int i8 = 10;
        String str2 = "";
        long j = 0;
        boolean z4 = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ch4 ch4Var = (ch4) obj;
                if (view instanceof ida) {
                    ch4Var.e(i, view, ((ida) view).getMessage(), 0);
                    return;
                } else if (view instanceof lda) {
                    ch4Var.e(i, view, ((lda) view).getMessage(), 0);
                    return;
                } else if (view instanceof eda) {
                    ch4Var.e(i, view, ((eda) view).getMessage(), 0);
                    return;
                } else if (view instanceof lx2) {
                    ch4Var.e(i, view, ((lx2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof hg3) {
                    ch4Var.e(i, view, ((hg3) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 1:
                dh4 dh4Var = (dh4) obj;
                wm2 wm2Var = dh4Var.t1;
                ArrayList arrayList = ((dh4) dh4Var.n1.e).u1;
                if (i < arrayList.size()) {
                    ub7Var = (ub7) arrayList.get(i);
                } else {
                    ub7Var = null;
                }
                if (view instanceof gy0) {
                    z = ((gy0) view).e;
                } else {
                    z = false;
                }
                nk3 nk3Var = (nk3) ((fh2) wm2Var.b).b;
                ArrayList arrayList2 = nk3Var.K2;
                ArrayList D0 = dh4.D0(nk3Var, ub7Var, arrayList2, true, false);
                if (!z) {
                    if (ub7Var != null) {
                        i2 = ub7Var.h.size();
                    } else {
                        i2 = 0;
                    }
                    int size = D0.size() + i2;
                    if ((size > nk3Var.getMessagesController().l4.b1.f() && !nk3Var.getUserConfig().p()) || size > nk3Var.getMessagesController().l4.c1.f()) {
                        Context context = nk3Var.fragmentView.getContext();
                        i3 = ((d) nk3Var).currentAccount;
                        nk3Var.showDialog(new i46(4, i3, null, context, nk3Var));
                        dh4Var.dismiss();
                        return;
                    }
                }
                if (ub7Var != null) {
                    LongSparseIntArray longSparseIntArray = ub7Var.j;
                    if (z) {
                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                            ub7Var.i.add((Long) arrayList2.get(i9));
                            ub7Var.h.remove(arrayList2.get(i9));
                        }
                        ub7 ub7Var3 = ub7Var;
                        qf4.z0(ub7Var3, ub7Var.g, ub7Var.b, ub7Var.c, ub7Var.n, ub7Var.m, ub7Var.h, ub7Var.i, longSparseIntArray, false, false, true, true, false, nk3Var, null);
                        if (arrayList2.size() == 1) {
                            j = ((Long) arrayList2.get(0)).longValue();
                        }
                        long j2 = j;
                        UndoView w3 = nk3Var.w3();
                        if (w3 != null) {
                            w3.k(j2, 21, Integer.valueOf(arrayList2.size()), ub7Var3, null, null);
                        }
                        nk3Var = nk3Var;
                    } else {
                        ub7 ub7Var4 = ub7Var;
                        if (!D0.isEmpty()) {
                            for (int i10 = 0; i10 < D0.size(); i10++) {
                                ub7Var4.i.remove(D0.get(i10));
                            }
                            ub7Var4.h.addAll(D0);
                            ub7Var2 = ub7Var4;
                            qf4.z0(ub7Var2, ub7Var4.g, ub7Var4.b, ub7Var4.c, ub7Var4.n, ub7Var4.m, ub7Var4.h, ub7Var4.i, longSparseIntArray, false, false, true, true, false, nk3Var, null);
                        } else {
                            ub7Var2 = ub7Var4;
                        }
                        nk3Var = nk3Var;
                        if (D0.size() == 1) {
                            j = ((Long) D0.get(0)).longValue();
                        }
                        long j3 = j;
                        ub7 ub7Var5 = ub7Var2;
                        UndoView w32 = nk3Var.w3();
                        if (w32 != null) {
                            w32.k(j3, 20, Integer.valueOf(D0.size()), ub7Var5, null, null);
                        }
                    }
                } else {
                    nk3Var.presentFragment(new qf4(null, D0));
                }
                nk3Var.A3(true);
                dh4Var.dismiss();
                return;
            case 2:
                ll4 ll4Var = (ll4) obj;
                Runnable runnable = ((dl4) ll4Var.F.get(i)).c;
                if (runnable != null) {
                    runnable.run();
                    ll4Var.c(false);
                    return;
                }
                return;
            case 3:
                ln4 ln4Var = (ln4) obj;
                ArrayList arrayList3 = ln4Var.b2;
                ArrayList arrayList4 = ln4Var.d2;
                if ((view instanceof xc5) && (i4 = (i - 1) - ln4Var.m2) >= 0 && i4 < arrayList3.size()) {
                    long n = pg3.n((TLRPC.Peer) arrayList3.get(i4));
                    if (arrayList4.contains(Long.valueOf(n))) {
                        if (ln4Var.c2.contains(Long.valueOf(n))) {
                            int i11 = -ln4Var.x2;
                            ln4Var.x2 = i11;
                            gm.A3(i11, view, null);
                            xx0.APP_ERROR.a();
                            ArrayList arrayList5 = new ArrayList();
                            int i12 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                            d dVar = ln4Var.r1;
                            if (i12 >= 0) {
                                arrayList5.add(dVar.getMessagesController().W1(Long.valueOf(n)));
                                str = "beep boop.";
                            } else {
                                TLRPC.Chat L0 = dVar.getMessagesController().L0(Long.valueOf(-n));
                                if (sd2.V(L0)) {
                                    M0 = jb6.M0(2131750608, null);
                                } else {
                                    M0 = jb6.M0(2131750609, null);
                                }
                                arrayList5.add(L0);
                                str = M0;
                            }
                            if (ln4Var.y2 != n || System.currentTimeMillis() - ln4Var.z2 > 1500) {
                                ln4Var.y2 = n;
                                ln4Var.z2 = System.currentTimeMillis();
                                u31 g = new c41(ln4Var.f2, null).g(str, arrayList5);
                                g.j = 1500;
                                g.j();
                                return;
                            }
                            return;
                        }
                        arrayList4.remove(Long.valueOf(n));
                        ((xc5) view).c(false, true);
                    } else {
                        arrayList4.add(Long.valueOf(n));
                        ((xc5) view).c(true, true);
                    }
                    ln4Var.c1(true);
                    ln4Var.d1();
                    ln4Var.Y0(false);
                    return;
                }
                return;
            case 4:
                zc5 zc5Var = (zc5) obj;
                if (zc5Var.getParentActivity() != null) {
                    if (i != zc5Var.n && i != 0) {
                        if (i == zc5Var.s) {
                            if (zc5Var.f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", zc5Var.f.link);
                                    zc5Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131748867, null)), 500);
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i == zc5Var.r) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zc5Var.getParentActivity());
                            alertDialog$Builder.a.U = jb6.M0(2131745759, null);
                            alertDialog$Builder.a.S = jb6.M0(2131745756, null);
                            alertDialog$Builder.j(jb6.M0(2131745757, null), new wx4(zc5Var, (byte) 10));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            zc5Var.showDialog(alertDialog$Builder.a);
                            return;
                        } else {
                            return;
                        }
                    } else if (zc5Var.f != null) {
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zc5Var.f.link));
                            c41.j(zc5Var).j();
                            return;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                ((kd5) obj).f0(i, view);
                return;
            case 6:
                pd5 pd5Var = (pd5) obj;
                if (i == pd5Var.c2) {
                    pd5Var.a2.a.a1(true);
                    pd5Var.dismiss();
                    return;
                } else if (view instanceof ij6) {
                    ij6 ij6Var = (ij6) view;
                    if (!pd5Var.Z1.contains(Long.valueOf(ij6Var.getUserId()))) {
                        pd5Var.a2.a.e1(ij6Var.getUserId(), true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                ((es5) obj).e0(i, view);
                return;
            case 8:
                sa8 sa8Var = (sa8) obj;
                ru7 ru7Var = (ru7) ru7.a().get(i);
                sa8Var.k1.setTypeface(ru7Var.a);
                m58 e3 = m58.e(sa8Var.F1);
                String str3 = ru7Var.a;
                e3.j = str3;
                e3.a.edit().putString("typeface", str3).apply();
                w44 w44Var = sa8Var.I0;
                if (w44Var instanceof xjb) {
                    ((xjb) w44Var).setTypeface(ru7Var);
                }
                sa8Var.B0(false);
                return;
            case 9:
                ((LanguageSelectActivity) obj).i0(i, view);
                return;
            case 10:
                i46 i46Var = (i46) obj;
                HashSet hashSet = i46Var.t2;
                if (view instanceof jb) {
                    jb jbVar = (jb) view;
                    TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    jbVar.r.a(hashSet.contains(currentChannel), true);
                    i46Var.v1();
                    return;
                } else if (view instanceof xc5) {
                    if (i46Var.T1 || ((i5 = i46Var.c2) != 11 && i5 != 34)) {
                        xc5 xc5Var = (xc5) view;
                        Object object = xc5Var.getObject();
                        if (xc5Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j4 = ((TLRPC.User) object).id;
                                int i13 = -i46Var.P2;
                                i46Var.P2 = i13;
                                gm.A3(i13, xc5Var, null);
                                xx0.APP_ERROR.a();
                                if (j4 >= 0) {
                                    str2 = m9c.l(oc7.r1(i46Var.a).W1(Long.valueOf(j4)));
                                }
                                boolean H3 = oc7.r1(i46Var.a).H3();
                                ViewGroup viewGroup = i46Var.b;
                                if (H3) {
                                    K = new c41((FrameLayout) viewGroup, i46Var.J0).Q(2131624211, 36, gm.S2(jb6.a0(null, null, 2131743447, str2)));
                                } else {
                                    K = new c41((FrameLayout) viewGroup, i46Var.J0).K(2131624211, gm.S2(jb6.a0(null, null, 2131743447, str2)), jb6.M0(2131743446, null), new s36(i46Var, (byte) 0));
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
                        xc5Var.c(hashSet.contains(object), true);
                        i46Var.v1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 11:
            case 12:
                ((m07) obj).h(view);
                return;
            case 13:
                ((j67) obj).onBackPressed();
                return;
            case 14:
                t67 t67Var = (t67) obj;
                int i14 = t67Var.J;
                if (i >= i14 && i < t67Var.K) {
                    k47 k47Var = (k47) t67Var.y.get(i - i14);
                    if (k47Var.w4()) {
                        if (!t67Var.d0(k47Var)) {
                            t67Var.getOrCreateStoryViewer().J(t67Var.getParentActivity(), k47Var.l, q4b.a(t67Var.f));
                            return;
                        }
                        return;
                    }
                    long B0 = k47.B0(k47Var.k);
                    Bundle bundle = new Bundle();
                    if (pg3.D(B0)) {
                        bundle.putLong("user_id", B0);
                    } else {
                        bundle.putLong("chat_id", -B0);
                    }
                    bundle.putInt("message_id", k47Var.e1());
                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (t67Var.getMessagesController().A(bundle, t67Var, null, null)) {
                        t67Var.presentFragment(new yv1(bundle));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                bu7 bu7Var = (bu7) obj;
                bu7Var.j3.accept(Integer.valueOf(bu7Var.i3.b(i)));
                m58 m58Var = bu7Var.i3;
                m58Var.c.put(Integer.valueOf(m58Var.f), Integer.valueOf(m58Var.b(i)));
                m58Var.e = true;
                return;
            case 16:
                z8b z8bVar = (z8b) obj;
                ru7 ru7Var2 = (ru7) ru7.a().get(i);
                z8bVar.b1.setTypeface(ru7Var2.a);
                m58 e4 = m58.e(z8bVar.v1);
                String str4 = ru7Var2.a;
                e4.j = str4;
                e4.a.edit().putString("typeface", str4).apply();
                w44 w44Var2 = z8bVar.z0;
                if (w44Var2 instanceof xjb) {
                    ((xjb) w44Var2).setTypeface(ru7Var2);
                }
                z8bVar.P0(false);
                return;
            case 17:
                ((PasscodeActivity) obj).s0(i, view);
                return;
            case 18:
                c38 c38Var = (c38) obj;
                c38Var.a(i, true);
                o28 o28Var = c38Var.h;
                if (o28Var != null) {
                    o28Var.a(Integer.valueOf(i));
                    return;
                }
                return;
            case 19:
                w78 w78Var = (w78) obj;
                ArrayList arrayList6 = w78Var.n;
                ArrayList arrayList7 = w78Var.f;
                yn6 yn6Var = w78Var.K;
                if (yn6Var == null) {
                    if (arrayList7.isEmpty()) {
                        if (i < arrayList6.size()) {
                            String str5 = (String) arrayList6.get(i);
                            v78 v78Var = w78Var.u0;
                            if (v78Var != null) {
                                v78Var.H(str5);
                                return;
                            }
                            w78Var.Q.getSearchField().setText(str5);
                            w78Var.Q.getSearchField().setSelection(str5.length());
                            w78Var.g0(w78Var.Q.getSearchField());
                            return;
                        } else if (i == arrayList6.size() + 1) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w78Var.getParentActivity());
                            alertDialog$Builder2.a.S = jb6.M0(2131751993, null);
                            alertDialog$Builder2.a.U = jb6.M0(2131751998, null);
                            alertDialog$Builder2.j(jb6.M0(2131752036, null), new o78(w78Var, (byte) 0));
                            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                            he heVar = alertDialog$Builder2.a;
                            w78Var.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    arrayList7 = yn6Var.e;
                }
                if (i >= 0 && i < arrayList7.size()) {
                    r7 r7Var = w78Var.Q;
                    if (r7Var != null) {
                        gm.t1(r7Var.getSearchField());
                    }
                    if (w78Var.Z) {
                        w78Var.f0(view, arrayList7.get(i));
                        return;
                    }
                    byte b2 = w78Var.U;
                    if (b2 != 1) {
                        i6 = 3;
                        if (b2 != 3) {
                            if (b2 != 2) {
                                if (b2 != 10) {
                                    if (w78Var.V == null) {
                                        i8 = 4;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                                i6 = i8;
                            }
                            PhotoViewer.r0().T1(null, w78Var, null);
                            PhotoViewer r0 = PhotoViewer.r0();
                            int i15 = w78Var.I;
                            boolean z5 = w78Var.J;
                            r0.h = i15;
                            r0.n = z5;
                            PhotoViewer.r0().o1(arrayList7, i, i6, w78Var.m0, w78Var.y0, w78Var.V);
                            return;
                        }
                    }
                    i6 = 1;
                    PhotoViewer.r0().T1(null, w78Var, null);
                    PhotoViewer r02 = PhotoViewer.r0();
                    int i152 = w78Var.I;
                    boolean z52 = w78Var.J;
                    r02.h = i152;
                    r02.n = z52;
                    PhotoViewer.r0().o1(arrayList7, i, i6, w78Var.m0, w78Var.y0, w78Var.V);
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList8 = photoViewer.f7;
                if (!arrayList8.isEmpty() && (i7 = photoViewer.O4) >= 0 && i7 < arrayList8.size()) {
                    Object obj2 = arrayList8.get(photoViewer.O4);
                    if (obj2 instanceof co6) {
                        ((co6) obj2).s = photoViewer.l0();
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
            case 21:
                kg8 kg8Var = (kg8) obj;
                boolean[] zArr = kg8Var.x;
                if (i == kg8Var.p0) {
                    kg8Var.h0();
                    return;
                } else if (view instanceof bjb) {
                    bjb bjbVar = (bjb) view;
                    boolean z6 = kg8Var.M;
                    fdb fdbVar = kg8Var.R;
                    if (fdbVar != null) {
                        fdbVar.e();
                    }
                    if (kg8Var.J) {
                        int i16 = -kg8Var.P;
                        kg8Var.P = i16;
                        gm.A3(i16, bjbVar, null);
                        xx0.APP_ERROR.a();
                        return;
                    }
                    if (i == kg8Var.s0) {
                        z2 = !kg8Var.H;
                        kg8Var.H = z2;
                    } else {
                        int i17 = kg8Var.v0;
                        if (i == i17) {
                            z2 = !kg8Var.I;
                            kg8Var.I = z2;
                        } else {
                            if (i == kg8Var.w0) {
                                z3 = !kg8Var.K;
                                kg8Var.K = z3;
                                kg8Var.v0();
                                int i18 = kg8Var.v0;
                                if (i18 >= 0 && i17 < 0) {
                                    kg8Var.b.i(i18);
                                } else if (i17 >= 0 && i18 < 0) {
                                    kg8Var.b.s(i17);
                                }
                            } else if (i == kg8Var.t0) {
                                boolean z7 = kg8Var.L;
                                z3 = !z7;
                                kg8Var.L = z3;
                                if (!z7 && kg8Var.M) {
                                    int i19 = kg8Var.k0;
                                    kg8Var.M = false;
                                    kg8Var.v0();
                                    u69 K2 = kg8Var.c.K(kg8Var.u0);
                                    if (K2 != null) {
                                        ((bjb) K2.a).setChecked(false);
                                    } else {
                                        kg8Var.b.g(kg8Var.u0);
                                    }
                                    kg8Var.b.q(i19, 2);
                                }
                            } else if (kg8Var.O == 0) {
                                z2 = !kg8Var.M;
                                kg8Var.M = z2;
                                int i20 = kg8Var.k0;
                                kg8Var.v0();
                                boolean z8 = kg8Var.M;
                                ig8 ig8Var = kg8Var.b;
                                if (z8) {
                                    ig8Var.p(kg8Var.k0, 2);
                                } else {
                                    ig8Var.q(i20, 2);
                                }
                                if (kg8Var.M && kg8Var.L) {
                                    kg8Var.L = false;
                                    u69 K3 = kg8Var.c.K(kg8Var.t0);
                                    if (K3 != null) {
                                        ((bjb) K3.a).setChecked(false);
                                    } else {
                                        kg8Var.b.g(kg8Var.t0);
                                    }
                                }
                                if (kg8Var.M) {
                                    boolean z9 = false;
                                    for (int i21 = 0; i21 < zArr.length; i21++) {
                                        if (z9) {
                                            zArr[i21] = false;
                                        } else if (zArr[i21]) {
                                            z9 = true;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                            z2 = z3;
                        }
                    }
                    if (kg8Var.N && !kg8Var.M) {
                        kg8Var.c.getChildCount();
                        kg8Var.h.a();
                    }
                    for (int i22 = kg8Var.o0; i22 < kg8Var.o0 + kg8Var.E; i22++) {
                        u69 K4 = kg8Var.c.K(i22);
                        if (K4 != null) {
                            View view2 = K4.a;
                            if (view2 instanceof ng8) {
                                ng8 ng8Var = (ng8) view2;
                                ng8Var.n(kg8Var.M, true);
                                ng8Var.r.a(zArr[i22 - kg8Var.o0], z6);
                                if (ng8Var.getTop() > gm.L(40.0f) && i == kg8Var.u0 && !kg8Var.N) {
                                    kg8Var.h.c(ng8Var.getCheckBox());
                                    kg8Var.N = true;
                                }
                            }
                        }
                    }
                    bjbVar.setChecked(z2);
                    kg8Var.k0();
                    return;
                } else {
                    return;
                }
            case 22:
                ((PremiumPreviewFragment) obj).t0(i, view);
                return;
            case 23:
                gk8 gk8Var = (gk8) obj;
                PremiumPreviewFragment premiumPreviewFragment = gk8Var.n;
                ArrayList arrayList9 = premiumPreviewFragment.d;
                ub8 ub8Var = gk8Var.e;
                if (view.isEnabled() && (view instanceof tk8)) {
                    tk8 tk8Var = (tk8) view;
                    premiumPreviewFragment.e = arrayList9.indexOf(tk8Var.getTier());
                    premiumPreviewFragment.y0(true);
                    tk8Var.c(true, true);
                    for (int i23 = 0; i23 < ub8Var.getChildCount(); i23++) {
                        View childAt = ub8Var.getChildAt(i23);
                        if (childAt instanceof tk8) {
                            tk8 tk8Var2 = (tk8) childAt;
                            if (tk8Var2.getTier() != tk8Var.getTier()) {
                                tk8Var2.c(false, true);
                            }
                        }
                    }
                    for (int i24 = 0; i24 < ub8Var.getHiddenChildCount(); i24++) {
                        View W = ub8Var.W(i24);
                        if (W instanceof tk8) {
                            tk8 tk8Var3 = (tk8) W;
                            if (tk8Var3.getTier() != tk8Var.getTier()) {
                                tk8Var3.c(false, true);
                            }
                        }
                    }
                    for (int i25 = 0; i25 < ub8Var.getCachedChildCount(); i25++) {
                        View P = ub8Var.P(i25);
                        if (P instanceof tk8) {
                            tk8 tk8Var4 = (tk8) P;
                            if (tk8Var4.getTier() != tk8Var.getTier()) {
                                tk8Var4.c(false, true);
                            }
                        }
                    }
                    for (int i26 = 0; i26 < ub8Var.getAttachedScrapChildCount(); i26++) {
                        View O = ub8Var.O(i26);
                        if (O instanceof tk8) {
                            tk8 tk8Var5 = (tk8) O;
                            if (tk8Var5.getTier() != tk8Var.getTier()) {
                                tk8Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (premiumPreviewFragment.getUserConfig().p() && ((ik8Var = premiumPreviewFragment.f) == null || ik8Var.a.months >= ((ik8) arrayList9.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.q0)) {
                        z4 = false;
                    }
                    gm.R3(frameLayout, z4);
                    return;
                }
                return;
            case 24:
                fj8 fj8Var = (fj8) obj;
                if (view != null) {
                    fj8Var.z1(view, true);
                    fj8Var.l3 = false;
                    fj8Var.x0(0, view.getTop() - ((fj8Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), gm.H);
                    return;
                }
                return;
            case 25:
                ((PrivacyControlActivity) obj).H0(i, view);
                return;
            case 26:
                km8 km8Var = (km8) obj;
                boolean z10 = km8Var.E;
                if (i == km8Var.x) {
                    he heVar2 = ik.L(km8Var.getParentActivity(), jb6.M0(2131747646, null), jb6.M0(2131747647, null), jb6.M0(2131751535, null), new bo6(km8Var, (byte) 13), null).a;
                    heVar2.show();
                    heVar2.h();
                    return;
                } else if (i == km8Var.f) {
                    if (z10) {
                        ?? dVar2 = new d(null);
                        dVar2.d = new Paint();
                        dVar2.f = new tg3[2];
                        dVar2.x = true;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("onlySelect", true);
                        bundle2.putBoolean("checkCanWrite", false);
                        bundle2.putBoolean("resetDelegate", false);
                        bundle2.putInt("dialogsType", 9);
                        nk3 nk3Var2 = new nk3(bundle2);
                        dVar2.a = nk3Var2;
                        nk3Var2.E2 = new qg3(dVar2);
                        nk3Var2.onFragmentCreate();
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
                        contactsActivity.V = new qg3(dVar2);
                        contactsActivity.onFragmentCreate();
                        km8Var.presentFragment((d) dVar2);
                        return;
                    }
                    Bundle l = ts2.l("isNeverShare", true);
                    if (z10) {
                        l.putInt("chatAddType", 2);
                    }
                    oc5 oc5Var = new oc5(l);
                    oc5Var.x = new hm8(km8Var);
                    km8Var.presentFragment(oc5Var);
                    return;
                } else if (i >= km8Var.r && i < km8Var.s) {
                    if (z10) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("user_id", km8Var.getMessagesController().x0.keyAt(i - km8Var.r));
                        km8Var.presentFragment(new ProfileActivity(bundle4, null));
                        return;
                    }
                    throw null;
                } else {
                    return;
                }
            case 27:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj).B2(i);
                return;
            case 28:
                ((ProxyListActivity) obj).g0(i, view);
                return;
            default:
                fy8 fy8Var = (fy8) obj;
                if ((view instanceof nx8) && (document = ((nx8) view).e) != null) {
                    long j5 = document.id;
                    if (j5 != 0) {
                        iy8 iy8Var = fy8Var.a;
                        if (iy8Var.d != null) {
                            if (!iy8Var.getUserConfig().p() && ((gy8Var = iy8Var.h) == null || !gy8Var.I.contains(Long.valueOf(j5)))) {
                                wy8 wy8Var = iy8Var.d;
                                wy8Var.getClass();
                                wy8Var.d1(0, jb6.M0(2131746208, null), jb6.M0(2131746206, null));
                                wy8Var.i0();
                                return;
                            }
                            wy8 wy8Var2 = iy8Var.d;
                            wy8Var2.getClass();
                            String str6 = "c:" + j5;
                            HashMap hashMap = wy8Var2.K;
                            if (!hashMap.containsKey(str6)) {
                                vm l2 = vm.l(wy8Var2.b, 2, document);
                                l2.b(wy8Var2);
                                hashMap.put(str6, l2);
                            }
                            if (!str6.startsWith("c:")) {
                                str6 = str6.replace("️", "");
                            }
                            ArrayList arrayList10 = wy8Var2.J;
                            int indexOf2 = arrayList10.indexOf(str6);
                            if (indexOf2 >= 0) {
                                arrayList10.remove(indexOf2);
                            } else {
                                if (arrayList10.size() >= 6) {
                                    arrayList10.remove(0);
                                }
                                arrayList10.add(str6);
                            }
                            wy8Var2.c();
                            wy8Var2.i0();
                            gy8 gy8Var2 = iy8Var.h;
                            if (gy8Var2 != null) {
                                ArrayList a = gy8Var2.a();
                                a.remove(Long.valueOf(j5));
                                a.add(0, Long.valueOf(j5));
                                while (a.size() > 21) {
                                    td4.w(1, a);
                                }
                                StringBuilder sb = new StringBuilder();
                                for (int i27 = 0; i27 < a.size(); i27++) {
                                    if (i27 > 0) {
                                        sb.append(',');
                                    }
                                    sb.append(a.get(i27));
                                }
                                oc7.r1(gy8Var2.a).X3.edit().putString("qrAppliedEmoji", sb.toString()).apply();
                                gy8Var2.K = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
