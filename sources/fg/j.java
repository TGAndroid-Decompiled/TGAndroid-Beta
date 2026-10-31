package fg;

import ag.u2;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jg.b1;
import li.r0;
import li.s0;
import li.v0;
import mg.c2;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bu;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.i0;
import org.telegram.messenger.nd;
import org.telegram.messenger.qi;
import org.telegram.messenger.sc;
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.messenger.we;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.l5;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.w5;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y5;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.es0;
import org.telegram.ui.f50;
import org.telegram.ui.jf0;
import org.telegram.ui.jo0;
import org.telegram.ui.l01;
import org.telegram.ui.lo0;
import org.telegram.ui.rj0;
import org.telegram.ui.tj0;
import org.telegram.ui.tt;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
import org.telegram.ui.yn0;
import s4.c1;
import s4.o0;
public final class j extends sk0 {
    public final int f7079c;
    public final Object d;
    public final Object e;

    public j(int i10, Object obj, Object obj2) {
        this.f7079c = i10;
        this.e = obj;
        this.d = obj2;
    }

    private final void G(s4.c1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: fg.j.G(s4.c1, int):void");
    }

    private final void H(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: fg.j.H(s4.c1, int):void");
    }

    private final void I(c1 c1Var, int i10) {
        boolean P1;
        boolean z10;
        lo0 lo0Var = (lo0) this.e;
        we weVar = lo0Var.J;
        ArrayList arrayList = lo0Var.f39343n;
        ArrayList arrayList2 = lo0Var.f39331c;
        HashMap hashMap = lo0Var.f39329b;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        p8 p8Var = (p8) view;
                        if (i10 < arrayList.size()) {
                            p8Var.o(2131232326, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            p8Var.o(2131232093, cd.L0(2131752067, null), false);
                            return;
                        }
                    }
                    return;
                }
                ef efVar = (ef) weVar.e.get(i10);
                l7 l7Var = (l7) view;
                l7Var.setPhotoEntry(efVar);
                l7Var.b(hashMap.containsKey(Integer.valueOf(efVar.C)), false);
                l7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = lo0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        v5 v5Var = (v5) view;
        v5Var.setItemSize(lo0Var.R);
        g9 imageView = v5Var.getImageView();
        v5Var.setTag(Integer.valueOf(i10));
        imageView.r();
        if (weVar != null) {
            ef efVar2 = (ef) weVar.e.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            v5Var.d(efVar2, z10, true, false, false);
            int i14 = efVar2.C;
            if (lo0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(i14));
            }
            v5Var.b(i12, hashMap.containsKey(Integer.valueOf(i14)), false);
            P1 = PhotoViewer.P1(efVar2.I);
        } else {
            hf hfVar = (hf) lo0Var.f39335f.get(i10);
            v5Var.e(hfVar);
            v5Var.getVideoInfoContainer().setVisibility(4);
            if (lo0Var.e) {
                i12 = arrayList2.indexOf(hfVar.B);
            }
            v5Var.b(i12, hashMap.containsKey(hfVar.B), false);
            P1 = PhotoViewer.P1(hfVar.g());
        }
        imageView.getImageReceiver().O0(!P1, true);
        v5Var.getCheckBox().setVisibility((lo0Var.T != 0 || P1) ? 8 : 8);
    }

    private final void J(c1 c1Var, int i10) {
        int i11;
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        b6 b6Var = (b6) c1Var.f47898a;
        int L = i0.L(85.0f);
        if (i10 != 0) {
            i11 = i0.L(6.0f);
        } else {
            i11 = 0;
        }
        b6Var.f21730f = L;
        ep epVar = b6Var.f21729c;
        g9 g9Var = b6Var.f21727a;
        b1 b1Var = b6Var.e;
        b6Var.h = i11;
        ((FrameLayout.LayoutParams) b6Var.f21728b.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) g9Var.getLayoutParams()).rightMargin = i11;
        ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).rightMargin = i11;
        g9Var.r();
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (obj instanceof ef) {
            ef efVar = (ef) obj;
            int i12 = efVar.C;
            String str = efVar.I;
            b6Var.setTag(efVar);
            b1Var.setVisibility(4);
            String str2 = efVar.f19508c;
            if (str2 != null) {
                g9Var.h(str2, null, context.getResources().getDrawable(2131232449));
            } else if (str != null) {
                g9Var.s(efVar.J, efVar.K, true);
                if (efVar.f19507b && !efVar.d()) {
                    b1Var.setVisibility(0);
                    b6Var.d.setText(i0.g0(efVar.E, false, false));
                    g9Var.h("vthumb://" + i12 + ":" + str, null, context.getResources().getDrawable(2131232449));
                } else {
                    g9Var.h("thumb://" + i12 + ":" + str, null, context.getResources().getDrawable(2131232449));
                }
            } else {
                g9Var.setImageResource(2131232449);
            }
            epVar.f25836a.f(-1, true, false);
            epVar.setVisibility(0);
        } else if (obj instanceof hf) {
            hf hfVar = (hf) obj;
            b6Var.setTag(hfVar);
            b6Var.setImage(hfVar);
            b1Var.setVisibility(4);
            epVar.f25836a.f(-1, true, false);
            epVar.setVisibility(0);
        }
    }

    private final void K(c1 c1Var, int i10) {
        boolean z10;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        ArrayList arrayList2 = proxyListActivity.F;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z11 = true;
        switch (i11) {
            case 1:
                x9 x9Var = (x9) view;
                a7.V(x9Var.getTextView(), t6.G6, null);
                if (i10 == ProxyListActivity.e0(proxyListActivity)) {
                    String L0 = cd.L0(2131754391, null);
                    if (proxyListActivity.D == -1) {
                        z11 = false;
                    }
                    x9Var.b(L0, z11);
                    return;
                } else if (i10 == proxyListActivity.D) {
                    a7.V(x9Var.getTextView(), t6.f21153p7, null);
                    x9Var.b(cd.L0(2131751581, null), false);
                    return;
                } else {
                    return;
                }
            case 2:
                p4 p4Var = (p4) view;
                if (i10 == proxyListActivity.h) {
                    p4Var.setText(cd.L0(2131746620, null));
                    return;
                }
                return;
            case 3:
                t8 t8Var = (t8) view;
                if (i10 == ProxyListActivity.f0(proxyListActivity)) {
                    String L02 = cd.L0(2131743809, null);
                    boolean z12 = proxyListActivity.d;
                    if (proxyListActivity.f33964w == -1) {
                        z11 = false;
                    }
                    t8Var.f(L02, z12, z11);
                    return;
                } else if (i10 == proxyListActivity.f33964w) {
                    t8Var.f(cd.L0(2131743811, null), tz.f18133a1, true);
                    return;
                } else {
                    return;
                }
            case 4:
                b9 b9Var = (b9) view;
                if (i10 == proxyListActivity.f33966y) {
                    b9Var.setText(cd.L0(2131746618, null));
                    return;
                }
                return;
            case 5:
                cz0 cz0Var = (cz0) view;
                sz szVar = (sz) arrayList2.get(i10 - proxyListActivity.f33961n);
                cz0Var.setProxy(szVar);
                if (tz.B1 == szVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cz0Var.setChecked(z10);
                boolean contains = arrayList.contains(arrayList2.get(i10 - proxyListActivity.f33961n));
                cz0Var.h = contains;
                cz0Var.f36577f.a(contains, false);
                cz0Var.a(!arrayList.isEmpty(), false);
                return;
            case 6:
                if (i10 == proxyListActivity.f33965x) {
                    yu0 yu0Var = (yu0) view;
                    ArrayList arrayList3 = new ArrayList(bu.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        strArr[i12] = cd.a0(null, null, 2131746617, arrayList3.get(i12));
                    }
                    yu0Var.setCallback(new z11(25));
                    yu0Var.b(tz.f18136b1, null, strArr);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void L(c1 c1Var, int i10) {
        String L0;
        String L02;
        boolean z10;
        String L03;
        boolean d = j50.d(l01.c0((l01) this.e));
        int i11 = c1Var.f47901f;
        if (i11 == 0) {
            p4 p4Var = (p4) c1Var.f47898a;
            if (i10 == 0) {
                L03 = cd.L0(2131746005, null);
            } else {
                L03 = cd.L0(2131746009, null);
            }
            p4Var.setText(L03);
        } else if (i11 == 1) {
            t8 t8Var = (t8) c1Var.f47898a;
            if (i10 != 1 && !d) {
                z10 = false;
            } else {
                z10 = true;
            }
            t8Var.setEnabled(z10);
            if (i10 == 1) {
                t8Var.f(cd.L0(2131746001, null), d, false);
                return;
            }
            String L04 = cd.L0(2131746008, null);
            mi.a aVar = mi.e.f13389i;
            aVar.a();
            t8Var.f(L04, aVar.d, false);
        } else if (i11 == 2) {
            x9 x9Var = (x9) c1Var.f47898a;
            x9Var.setEnabled(d);
            if (i10 == 2) {
                x9Var.c(cd.L0(2131746003, null), a1.g.p(new StringBuilder(), ((v0) mi.e.e.a()).f12297a, "p"), false, true);
            } else if (i10 == 3) {
                String L05 = cd.L0(2131746013, null);
                r0 r0Var = (r0) mi.e.f13387f.a();
                if (r0Var == r0.f12236a) {
                    L02 = cd.L0(2131746012, null);
                } else if (r0Var == r0.f12237b) {
                    L02 = cd.L0(2131746010, null);
                } else {
                    L02 = cd.L0(2131746011, null);
                }
                x9Var.c(L05, L02, false, true);
            } else if (i10 == 4) {
                x9Var.c(cd.L0(2131746006, null), a1.g.p(new StringBuilder(), ((s0) mi.e.f13388g.a()).f12244a, " FPS"), false, true);
            } else {
                x9Var.c(cd.L0(2131746014, null), l01.e0(mi.e.h.a()), false, false);
            }
        } else {
            b9 b9Var = (b9) c1Var.f47898a;
            if (i10 == 6) {
                L0 = cd.L0(2131746004, null);
            } else {
                L0 = cd.L0(2131746007, null);
            }
            b9Var.setText(L0);
        }
    }

    @Override
    public final boolean D(c1 c1Var) {
        switch (this.f7079c) {
            case 0:
                if (m1.j.d(3)[c1Var.f47901f] == 1) {
                    return true;
                }
                return false;
            case 1:
                int b10 = c1Var.b();
                if (b10 == 1) {
                    return true;
                }
                if (MediaController.s0(l01.b0((l01) this.e)) && b10 == 2) {
                    return true;
                }
                return false;
            case 2:
                int b11 = c1Var.b();
                jn jnVar = (jn) this.e;
                if (b11 != jnVar.f27448u0 && b11 != jnVar.G0 && b11 != jnVar.B0 && b11 != jnVar.F0 && b11 != jnVar.C0 && b11 != jnVar.H0 && b11 != jnVar.D0 && b11 != jnVar.E0 && b11 != jnVar.I0 && b11 != jnVar.J0 && b11 != jnVar.N0.f3775a && b11 != jnVar.M0.f3775a && b11 != jnVar.L0) {
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                if (c1Var.f47901f == 0) {
                    return true;
                }
                return false;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                int b12 = c1Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                if (b12 != DataAutoDownloadActivity.m0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.f0(dataAutoDownloadActivity) && b12 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity)) {
                    return false;
                }
                return true;
            case 10:
                int b13 = c1Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (b13 != dataSettingsActivity.e && b13 != dataSettingsActivity.f33314f && b13 != dataSettingsActivity.h && b13 != dataSettingsActivity.f33317s && b13 != DataSettingsActivity.b0(dataSettingsActivity) && b13 != dataSettingsActivity.f33318w && b13 != DataSettingsActivity.c0(dataSettingsActivity) && b13 != DataSettingsActivity.d0(dataSettingsActivity) && b13 != dataSettingsActivity.E && b13 != dataSettingsActivity.D && b13 != dataSettingsActivity.F && b13 != dataSettingsActivity.G && b13 != dataSettingsActivity.K && b13 != dataSettingsActivity.J && b13 != dataSettingsActivity.f33315n && b13 != DataSettingsActivity.g0(dataSettingsActivity) && b13 != DataSettingsActivity.e0(dataSettingsActivity) && b13 != DataSettingsActivity.i0(dataSettingsActivity) && b13 != DataSettingsActivity.a0(dataSettingsActivity)) {
                    return false;
                }
                return true;
            case 11:
                int b14 = c1Var.b();
                jf0 jf0Var = (jf0) this.e;
                if (b14 != jf0Var.f38514c && b14 != jf0Var.d && b14 != jf0Var.e && b14 != jf0Var.f38515f && b14 != jf0Var.h && b14 != jf0Var.f38517r) {
                    return false;
                }
                return true;
            case 12:
                int b15 = c1Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                if (b15 != notificationsSettingsActivity.f33416y && b15 != notificationsSettingsActivity.D && b15 != notificationsSettingsActivity.E && b15 != notificationsSettingsActivity.K && b15 != notificationsSettingsActivity.M && b15 != notificationsSettingsActivity.S && b15 != notificationsSettingsActivity.N && b15 != notificationsSettingsActivity.L && b15 != notificationsSettingsActivity.R && b15 != notificationsSettingsActivity.F && b15 != notificationsSettingsActivity.G && b15 != notificationsSettingsActivity.O && b15 != notificationsSettingsActivity.f33412r && b15 != notificationsSettingsActivity.f33413s && b15 != notificationsSettingsActivity.T && b15 != notificationsSettingsActivity.J) {
                    return true;
                }
                return false;
            case 13:
                int b16 = c1Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                if (b16 != PasscodeActivity.b0(passcodeActivity) && b16 != PasscodeActivity.c0(passcodeActivity) && b16 != passcodeActivity.N && b16 != PasscodeActivity.d0(passcodeActivity) && b16 != PasscodeActivity.e0(passcodeActivity) && b16 != passcodeActivity.J && b16 != passcodeActivity.K) {
                    return false;
                }
                return true;
            case 14:
                return true;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                if (lo0Var.J == null && (!TextUtils.isEmpty(lo0Var.f39355w) ? c1Var.b() >= lo0Var.f39335f.size() : c1Var.f47901f != 3)) {
                    return false;
                }
                return true;
            case 16:
                return false;
            case 17:
                int b17 = c1Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (b17 != ProxyListActivity.f0(proxyListActivity) && b17 != proxyListActivity.f33964w && b17 != ProxyListActivity.e0(proxyListActivity) && b17 != proxyListActivity.D && (b17 < proxyListActivity.f33961n || b17 >= proxyListActivity.f33962r)) {
                    return false;
                }
                return true;
            case 18:
                int b18 = c1Var.b();
                if (b18 == 1) {
                    return true;
                }
                if (j50.d(l01.a0((l01) this.e)) && (b18 == 2 || b18 == 3 || b18 == 4 || b18 == 5 || b18 == 8)) {
                    return true;
                }
                return false;
            default:
                if (c1Var.f47901f != 1) {
                    return true;
                }
                return false;
        }
    }

    public void E() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.E.size();
        boolean s10 = ProxyListActivity.a0(proxyListActivity).s();
        if (size > 0) {
            ProxyListActivity.b0(proxyListActivity).y(size, s10);
            if (!s10) {
                ProxyListActivity.c0(proxyListActivity).C();
                int i10 = proxyListActivity.f33961n;
                n(i10, proxyListActivity.f33962r - i10, 2);
            }
        } else if (s10) {
            ProxyListActivity.d0(proxyListActivity).r();
            int i11 = proxyListActivity.f33961n;
            n(i11, proxyListActivity.f33962r - i11, 2);
        }
    }

    public void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.E.clear();
        int i10 = proxyListActivity.f33961n;
        n(i10, proxyListActivity.f33962r - i10, 1);
        E();
    }

    public void M(int i10) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.E;
        int i11 = proxyListActivity.f33961n;
        if (i10 >= i11 && i10 < proxyListActivity.f33962r) {
            sz szVar = (sz) proxyListActivity.F.get(i10 - i11);
            if (arrayList.contains(szVar)) {
                arrayList.remove(szVar);
            } else {
                arrayList.add(szVar);
            }
            h(i10, 1);
            E();
        }
    }

    @Override
    public final int b() {
        switch (this.f7079c) {
            case 0:
                return ((l) this.e).E.size();
            case 1:
                return 4;
            case 2:
                return ((jn) this.e).Q0;
            case 3:
                return ((org.telegram.ui.Components.tz) this.e).h.size();
            case 4:
                int size = ((uz) this.e).f31098r1.size();
                if (size < 10) {
                    return size + 1;
                }
                return size;
            case 5:
                return ((oe0) this.e).F;
            case 6:
                return nd.g() + 1;
            case 7:
                ArrayList arrayList = ((sx0) this.d).f30382x;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 8:
                return ((v71) this.e).h.size();
            case 9:
                return ((DataAutoDownloadActivity) this.e).f33310y;
            case 10:
                return ((DataSettingsActivity) this.e).T;
            case 11:
                return ((jf0) this.e).f38519w;
            case 12:
                return ((NotificationsSettingsActivity) this.e).U;
            case 13:
                return ((PasscodeActivity) this.e).P;
            case 14:
                yn0 yn0Var = (yn0) this.e;
                ArrayList arrayList2 = yn0Var.d;
                if (arrayList2 != null) {
                    return (int) Math.ceil(arrayList2.size() / yn0Var.f43867f);
                }
                return 0;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                we weVar = lo0Var.J;
                if (weVar == null) {
                    if (lo0Var.f39335f.isEmpty()) {
                        if (!TextUtils.isEmpty(lo0Var.f39355w) || lo0Var.f39343n.isEmpty()) {
                            return 0;
                        }
                        return lo0Var.f39343n.size() + 2;
                    }
                    return lo0Var.f39335f.size() + (!lo0Var.f39350s ? 1 : 0);
                }
                return weVar.e.size();
            case 16:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                es0 es0Var = photoViewer.d;
                if (es0Var != null && es0Var.c() != null) {
                    return photoViewer.d.c().size();
                }
                return 0;
            case 17:
                return ((ProxyListActivity) this.e).e;
            case 18:
                return 7;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override
    public long c(int i10) {
        int i11;
        switch (this.f7079c) {
            case 3:
                i11 = ((org.telegram.ui.Components.tz) this.e).f30715k0.get(i10);
                break;
            case 5:
                return i10;
            case 7:
                ArrayList arrayList = ((sx0) this.d).f30382x;
                if (arrayList == null) {
                    return 0L;
                }
                return ((qi) arrayList.get(i10)).f17590a.hashCode();
            case 8:
                i11 = ((s71) ((v71) this.e).h.get(i10)).f30173a;
                break;
            case 15:
                return i10;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i10 == proxyListActivity.f33960f) {
                    return -1L;
                }
                if (i10 == proxyListActivity.f33963s) {
                    return -2L;
                }
                if (i10 == ProxyListActivity.e0(proxyListActivity)) {
                    return -3L;
                }
                if (i10 == ProxyListActivity.f0(proxyListActivity)) {
                    return -4L;
                }
                if (i10 == proxyListActivity.h) {
                    return -6L;
                }
                if (i10 == proxyListActivity.D) {
                    return -8L;
                }
                if (i10 == proxyListActivity.f33964w) {
                    return -9L;
                }
                if (i10 == proxyListActivity.f33965x) {
                    return -10L;
                }
                if (i10 == proxyListActivity.f33966y) {
                    return -11L;
                }
                int i12 = proxyListActivity.f33961n;
                if (i10 >= i12 && i10 < proxyListActivity.f33962r) {
                    return ((sz) proxyListActivity.F.get(i10 - i12)).hashCode();
                }
                return -7L;
            default:
                return super.c(i10);
        }
        return i11;
    }

    @Override
    public int d(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        switch (this.f7079c) {
            case 0:
                return m1.j.c(((a) ((l) this.e).E.get(i10)).f7058b);
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                int i28 = 1;
                if (i10 != 1) {
                    i28 = 2;
                    if (i10 != 2) {
                        return 3;
                    }
                }
                return i28;
            case 2:
                jn jnVar = (jn) this.e;
                if (i10 != jnVar.B0 && i10 != jnVar.F0 && i10 != jnVar.G0 && i10 != jnVar.C0 && i10 != jnVar.D0 && i10 != jnVar.E0 && i10 != jnVar.H0 && i10 != jnVar.M0.f3775a && i10 != jnVar.N0.f3775a) {
                    if (i10 != jnVar.f27432l0 && i10 != jnVar.f27446s0 && i10 != jnVar.f27451w0 && i10 != jnVar.f27437o0) {
                        if (i10 == jnVar.f27444r0) {
                            return 1;
                        }
                        if (i10 != jnVar.f27449v0 && i10 != jnVar.f27453x0 && i10 != jnVar.f27441q0 && i10 != jnVar.K0) {
                            if (i10 != jnVar.f27448u0 && i10 != jnVar.I0 && i10 != jnVar.L0) {
                                if (i10 == jnVar.m0) {
                                    return 4;
                                }
                                if (i10 == jnVar.f27435n0) {
                                    return 11;
                                }
                                if (i10 == jnVar.f27439p0) {
                                    return 7;
                                }
                                if (i10 != jnVar.f27455y0 && i10 != jnVar.f27456z0 && i10 != jnVar.J0) {
                                    if (i10 == jnVar.A0) {
                                        return 8;
                                    }
                                    if (i10 == 0) {
                                        return 9;
                                    }
                                    return 5;
                                }
                                return 6;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 0;
                }
                return 10;
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                oe0 oe0Var = (oe0) this.e;
                if (i10 != oe0Var.D && i10 != oe0Var.E) {
                    return 0;
                }
                return 1;
            case 6:
                if (i10 == 0) {
                    return 1;
                }
                return 0;
            case 7:
            default:
                return super.d(i10);
            case 8:
                return 0;
            case 9:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.e;
                if (i10 == DataAutoDownloadActivity.b0(dataAutoDownloadActivity)) {
                    return 0;
                }
                if (i10 == dataAutoDownloadActivity.f33307s) {
                    return 1;
                }
                if (i10 != dataAutoDownloadActivity.f33306r && i10 != dataAutoDownloadActivity.f33308w) {
                    if (i10 == DataAutoDownloadActivity.g0(dataAutoDownloadActivity)) {
                        return 3;
                    }
                    if (i10 != DataAutoDownloadActivity.m0(dataAutoDownloadActivity) && i10 != DataAutoDownloadActivity.n0(dataAutoDownloadActivity) && i10 != DataAutoDownloadActivity.f0(dataAutoDownloadActivity) && i10 != DataAutoDownloadActivity.o0(dataAutoDownloadActivity)) {
                        return 5;
                    }
                    return 4;
                }
                return 2;
            case 10:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.e;
                if (i10 != dataSettingsActivity.f33316r && i10 != dataSettingsActivity.f33319x && i10 != dataSettingsActivity.N && i10 != dataSettingsActivity.P && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.Q && i10 != dataSettingsActivity.S) {
                    if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f33320y && i10 != dataSettingsActivity.M && i10 != 0 && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.R) {
                        if (i10 != dataSettingsActivity.E && i10 != dataSettingsActivity.D && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.J && i10 != dataSettingsActivity.K) {
                            if (i10 == dataSettingsActivity.H) {
                                return 4;
                            }
                            if (i10 != dataSettingsActivity.e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f33314f && i10 != DataSettingsActivity.g0(dataSettingsActivity) && i10 != DataSettingsActivity.e0(dataSettingsActivity) && i10 != DataSettingsActivity.i0(dataSettingsActivity)) {
                                if (i10 != dataSettingsActivity.f33317s && i10 != dataSettingsActivity.f33318w && i10 != dataSettingsActivity.f33315n) {
                                    return 1;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 0;
            case 11:
                jf0 jf0Var = (jf0) this.e;
                jf0Var.getClass();
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != jf0Var.f38514c && i10 != jf0Var.d && i10 != jf0Var.e && i10 != jf0Var.f38515f && i10 != jf0Var.h) {
                    if (i10 == jf0Var.f38516n) {
                        return 2;
                    }
                    if (i10 == jf0Var.f38517r) {
                        return 3;
                    }
                    return 4;
                }
                return 1;
            case 12:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                if (i10 != notificationsSettingsActivity.K && i10 != notificationsSettingsActivity.M && i10 != notificationsSettingsActivity.S && i10 != notificationsSettingsActivity.G && i10 != notificationsSettingsActivity.N && i10 != notificationsSettingsActivity.E && i10 != notificationsSettingsActivity.f33416y && i10 != notificationsSettingsActivity.f33412r) {
                    i11 = notificationsSettingsActivity.inappSoundRow;
                    if (i10 != i11) {
                        i12 = notificationsSettingsActivity.inappVibrateRow;
                        if (i10 != i12 && i10 != notificationsSettingsActivity.f33415x) {
                            i13 = notificationsSettingsActivity.inappPreviewRow;
                            if (i10 != i13) {
                                i14 = notificationsSettingsActivity.contactJoinedRow;
                                if (i10 != i14) {
                                    i15 = notificationsSettingsActivity.pinnedMessageRow;
                                    if (i10 != i15 && i10 != notificationsSettingsActivity.f33414w) {
                                        i16 = notificationsSettingsActivity.badgeNumberMutedRow;
                                        if (i10 != i16) {
                                            i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                            if (i10 != i17) {
                                                i18 = notificationsSettingsActivity.badgeNumberShowRow;
                                                if (i10 != i18) {
                                                    i19 = notificationsSettingsActivity.inappPriorityRow;
                                                    if (i10 != i19) {
                                                        i20 = notificationsSettingsActivity.inchatSoundRow;
                                                        if (i10 != i20 && i10 != notificationsSettingsActivity.P) {
                                                            i21 = notificationsSettingsActivity.accountsAllRow;
                                                            if (i10 != i21) {
                                                                i22 = notificationsSettingsActivity.resetNotificationsRow;
                                                                if (i10 != i22) {
                                                                    i23 = notificationsSettingsActivity.privateRow;
                                                                    if (i10 != i23) {
                                                                        i24 = notificationsSettingsActivity.groupRow;
                                                                        if (i10 != i24) {
                                                                            i25 = notificationsSettingsActivity.channelsRow;
                                                                            if (i10 != i25) {
                                                                                i26 = notificationsSettingsActivity.storiesRow;
                                                                                if (i10 != i26) {
                                                                                    i27 = notificationsSettingsActivity.reactionsRow;
                                                                                    if (i10 != i27) {
                                                                                        if (i10 != notificationsSettingsActivity.J && i10 != notificationsSettingsActivity.D && i10 != notificationsSettingsActivity.L && i10 != notificationsSettingsActivity.R && i10 != notificationsSettingsActivity.F && i10 != notificationsSettingsActivity.O && i10 != notificationsSettingsActivity.T) {
                                                                                            if (i10 == notificationsSettingsActivity.f33413s) {
                                                                                                return 6;
                                                                                            }
                                                                                            return 5;
                                                                                        }
                                                                                        return 4;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return 3;
                                                                }
                                                                return 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
                if (i10 != PasscodeActivity.b0(passcodeActivity) && i10 != passcodeActivity.N && i10 != passcodeActivity.K && i10 != passcodeActivity.J) {
                    if (i10 != PasscodeActivity.d0(passcodeActivity) && i10 != PasscodeActivity.c0(passcodeActivity) && i10 != PasscodeActivity.e0(passcodeActivity)) {
                        if (i10 != passcodeActivity.H && i10 != passcodeActivity.O && i10 != passcodeActivity.G && i10 != passcodeActivity.L) {
                            if (i10 != passcodeActivity.M && i10 != passcodeActivity.I) {
                                if (i10 == 0) {
                                    return 4;
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 2;
                        }
                    } else {
                        return 1;
                    }
                }
                return 0;
            case 14:
                return 0;
            case 15:
                lo0 lo0Var = (lo0) this.e;
                if (lo0Var.Y) {
                    return 2;
                }
                if (lo0Var.J == null) {
                    if (lo0Var.f39335f.isEmpty()) {
                        if (i10 == lo0Var.f39343n.size()) {
                            return 4;
                        }
                        return 3;
                    } else if (i10 >= lo0Var.f39335f.size()) {
                        return 1;
                    }
                }
                return 0;
            case 16:
                return 0;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                if (i10 != proxyListActivity.f33960f && i10 != proxyListActivity.f33963s) {
                    if (i10 != ProxyListActivity.e0(proxyListActivity) && i10 != proxyListActivity.D) {
                        if (i10 != ProxyListActivity.f0(proxyListActivity) && i10 != proxyListActivity.f33964w) {
                            if (i10 == proxyListActivity.h) {
                                return 2;
                            }
                            if (i10 == proxyListActivity.f33965x) {
                                return 6;
                            }
                            if (i10 >= proxyListActivity.f33961n && i10 < proxyListActivity.f33962r) {
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 1;
                }
                return 0;
            case 18:
                if (i10 != 0 && i10 != 7) {
                    if (i10 == 1 || i10 == 8) {
                        return 1;
                    }
                    if (i10 != 6 && i10 != 9) {
                        return 2;
                    }
                    return 3;
                }
                return 0;
            case 19:
                if (i10 == ((ArrayList) this.e).size()) {
                    return 1;
                }
                return 0;
        }
    }

    @Override
    public final void t(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: fg.j.t(s4.c1, int):void");
    }

    @Override
    public void v(c1 c1Var, int i10, List list) {
        boolean contains;
        switch (this.f7079c) {
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.E;
                int i11 = c1Var.f47901f;
                View view = c1Var.f47898a;
                if (i11 == 5 && !list.isEmpty()) {
                    cz0 cz0Var = (cz0) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.F.get(i10 - proxyListActivity.f33961n))) != cz0Var.h) {
                        cz0Var.h = contains;
                        cz0Var.f36577f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        cz0Var.a(!arrayList.isEmpty(), true);
                        return;
                    }
                    return;
                } else if (c1Var.f47901f == 3 && list.contains(0)) {
                    t8 t8Var = (t8) view;
                    if (i10 == ProxyListActivity.f0(proxyListActivity)) {
                        t8Var.setChecked(proxyListActivity.d);
                        return;
                    } else if (i10 == proxyListActivity.f33964w) {
                        t8Var.setChecked(tz.f18133a1);
                        return;
                    } else {
                        return;
                    }
                } else {
                    t(c1Var, i10);
                    return;
                }
            default:
                super.v(c1Var, i10, list);
                return;
        }
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        x9 x9Var;
        int i11;
        int i12;
        gn gnVar;
        hn hnVar;
        w5 w5Var;
        FrameLayout frameLayout2;
        yu0 yu0Var;
        View c7Var;
        a9 a9Var;
        View p4Var;
        p6 p6Var;
        p6 p6Var2;
        p6 p6Var3;
        p6 p6Var4;
        p6 p6Var5;
        View t8Var;
        p8 p8Var;
        View c7Var2;
        x9 x9Var2;
        View v4Var;
        int i13 = this.f7079c;
        int i14 = 8;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i13) {
            case 0:
                Context context = (Context) obj2;
                int c10 = m1.j.c(m1.j.d(3)[i10]);
                if (c10 != 1) {
                    if (c10 != 2) {
                        frameLayout = new r1(context, null);
                    } else {
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout3.h = textPaint;
                        textPaint.setTextSize(i0.L(16.0f));
                        nn0 nn0Var = new nn0(context);
                        frameLayout3.f7080a = nn0Var;
                        nn0Var.setReportChanges(true);
                        nn0Var.setDelegate(new a6.i(frameLayout3, 22));
                        nn0Var.setImportantForAccessibility(2);
                        frameLayout3.addView(nn0Var, w7.b6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout = new p4(context);
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new c1(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                if (i10 == 0) {
                    x9Var = new p4(context2);
                } else if (i10 == 1) {
                    x9Var = new t8(context2);
                } else if (i10 == 2) {
                    x9 x9Var3 = new x9(context2);
                    x9Var3.setCanDisable(true);
                    x9Var = x9Var3;
                } else {
                    x9Var = new b9(context2);
                }
                x9Var.setLayoutParams(new o0(-1, -2));
                return new c1(x9Var);
            case 2:
                Context context3 = (Context) obj2;
                jn jnVar = (jn) obj;
                boolean z10 = jnVar.f27434n;
                p6 p6Var6 = jnVar.f30946a;
                switch (i10) {
                    case 0:
                        i11 = -2;
                        gnVar = new p4((Context) obj2, t6.L6, 21, 15, false, jnVar.f30946a);
                        break;
                    case 1:
                        i11 = -2;
                        View c7Var3 = new c7(context3, (f1) null);
                        new eq(new ColorDrawable(t6.w0(t6.f20872a7, p6Var6)), t6.Y0(context3, 2131231230, t6.f20892b7)).f25847x = true;
                        gnVar = c7Var3;
                        break;
                    case 2:
                        i11 = -2;
                        gnVar = new b9(context3, p6Var6);
                        break;
                    case 3:
                        i11 = -2;
                        gnVar = new p8(context3, p6Var6);
                        break;
                    case 4:
                    case 11:
                        i11 = -2;
                        en enVar = new en(this, (Context) obj2, jnVar.I ? 1 : 0, jnVar.f30946a, i10);
                        if (i10 == 11 && !z10) {
                            enVar.setTextRight(98);
                            enVar.a().setOnClickListener(new View.OnClickListener(this) {
                                public final fg.j f25107b;

                                {
                                    this.f25107b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            jn.R((jn) this.f25107b.e, -2);
                                            return;
                                        case 1:
                                            jn.R((jn) this.f25107b.e, -3);
                                            return;
                                        default:
                                            ((jn) this.f25107b.e).a0(view, (org.telegram.ui.Cells.e6) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        enVar.c();
                        enVar.setIconsColor(t6.f21135o7);
                        enVar.b(new fn(this, enVar, i10));
                        gnVar = enVar;
                        break;
                    case 5:
                    default:
                        Context context4 = (Context) obj2;
                        boolean z11 = jnVar.I;
                        ?? r42 = new View.OnClickListener(this) {
                            public final fg.j f25107b;

                            {
                                this.f25107b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        jn.R((jn) this.f25107b.e, -2);
                                        return;
                                    case 1:
                                        jn.R((jn) this.f25107b.e, -3);
                                        return;
                                    default:
                                        ((jn) this.f25107b.e).a0(view, (org.telegram.ui.Cells.e6) view.getParent(), true);
                                        return;
                                }
                            }
                        };
                        p6 p6Var7 = jnVar.f30946a;
                        i12 = -2;
                        hn hnVar2 = new hn(this, context4, z11 ? 1 : 0, r42, p6Var7);
                        if (!z10) {
                            hnVar2.setTextRight(140);
                            hnVar2.a().setOnClickListener(new ud(24, this, hnVar2));
                        }
                        int i15 = t6.f21135o7;
                        hnVar2.setIconsColor(i15);
                        ep epVar = hnVar2.f21863r;
                        if (epVar != null) {
                            epVar.getCheckBoxBase().i(i0.L(6.0f));
                            CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
                            float f7 = hnVar2.f21858a.e;
                            if (checkBoxBase.f23924w != f7) {
                                checkBoxBase.f23924w = f7;
                                checkBoxBase.b();
                            }
                        }
                        hnVar2.getCheckBox().b(-1, i15, t6.f21059k7);
                        hnVar2.b(new u2(this, hnVar2, false, 4));
                        hnVar2.setShowNextButton(true);
                        EditTextBoldCursor textView = hnVar2.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new xd(2, this, hnVar2));
                        textView.setOnKeyListener(new dn(hnVar2, 0));
                        hnVar = hnVar2;
                        i11 = i12;
                        gnVar = hnVar;
                        break;
                    case 6:
                        i11 = -2;
                        gnVar = new t8(context3, p6Var6);
                        break;
                    case 7:
                        i11 = -2;
                        gn gnVar2 = new gn(this, context3, jnVar.I ? 1 : 0);
                        gnVar2.c();
                        if (!z10) {
                            gnVar2.setTextRight(98);
                            gnVar2.a().setOnClickListener(new View.OnClickListener(this) {
                                public final fg.j f25107b;

                                {
                                    this.f25107b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (r2) {
                                        case 0:
                                            jn.R((jn) this.f25107b.e, -2);
                                            return;
                                        case 1:
                                            jn.R((jn) this.f25107b.e, -3);
                                            return;
                                        default:
                                            ((jn) this.f25107b.e).a0(view, (org.telegram.ui.Cells.e6) view.getParent(), true);
                                            return;
                                    }
                                }
                            });
                        }
                        gnVar2.setIconsColor(t6.f21135o7);
                        gnVar2.b(new u2(this, gnVar2, false, 3));
                        gnVar = gnVar2;
                        break;
                    case 8:
                        i12 = -2;
                        View bnVar = new bn(context3, 0);
                        bnVar.setTag(-33024);
                        hnVar = bnVar;
                        i11 = i12;
                        gnVar = hnVar;
                        break;
                    case 9:
                        i12 = -2;
                        View t0Var = new t0(this, context3, 10);
                        t0Var.setTag(-33024);
                        hnVar = t0Var;
                        i11 = i12;
                        gnVar = hnVar;
                        break;
                    case 10:
                        i12 = -2;
                        c6 c6Var = new c6(context3, p6Var6);
                        c6Var.getCheckBox().setIcon(2131232512);
                        hnVar = c6Var;
                        i11 = i12;
                        gnVar = hnVar;
                        break;
                }
                return sc.e.o(gnVar, gnVar, -1, i11);
            case 3:
                return new c1(new rz((org.telegram.ui.Components.tz) obj, (Context) obj2));
            case 4:
                s2 s2Var = new s2(0, (Context) obj2, null);
                s2Var.setBackground(null);
                s2Var.setLayoutParams(new o0(-1, -2));
                return new c1(s2Var);
            case 5:
                Context context5 = (Context) obj2;
                if (i10 == 0) {
                    p6 p6Var8 = ((oe0) obj).I0;
                    ?? frameLayout4 = new FrameLayout(context5);
                    frameLayout4.e = new c2((Object) frameLayout4, 18);
                    TextView textView2 = new TextView(context5);
                    frameLayout4.f23581a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    frameLayout4.addView(textView2, w7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context5);
                    frameLayout4.f23582b = textView3;
                    a7.V(textView3, t6.f21125ng, p6Var8);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    frameLayout4.addView(textView3, w7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    ?? view = new View(context5);
                    Paint paint = new Paint();
                    view.f25397a = paint;
                    Paint paint2 = new Paint(1);
                    view.f25398b = paint2;
                    view.f25399c = i0.L(16.0f);
                    view.d = 0;
                    view.e = 0.0f;
                    view.f25400f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    frameLayout4.f23583c = view;
                    frameLayout4.addView(view, w7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    frameLayout4.setSeekBarDelegate(new px(this, 11));
                    w5Var = frameLayout4;
                } else {
                    w5 w5Var2 = new w5(context5);
                    w5Var2.setOnClickListener(new db0(this, 3));
                    w5Var = w5Var2;
                }
                return new c1(w5Var);
            case 6:
                Context context6 = (Context) obj2;
                du0 du0Var = (du0) obj;
                if (i10 != 0) {
                    FrameLayout a5Var = new a5(context6, 23);
                    a5Var.setWillNotDraw(false);
                    du0Var.l1 = new TextView(context6);
                    a7.V(du0Var.l1, t6.J5, du0Var.I0);
                    du0Var.l1.setTextSize(1, 14.0f);
                    du0Var.l1.setGravity(17);
                    du0Var.l1.setPadding(0, 0, 0, i0.L(8.0f));
                    a5Var.addView(du0Var.l1, w7.b6.c(40.0f, -1));
                    frameLayout2 = a5Var;
                } else {
                    frameLayout2 = new v7(54, context6, du0Var.I0, false);
                }
                return new c1(frameLayout2);
            case 7:
                return new c1(new rx0((sx0) obj, ((sx0) obj2).getContext()));
            case 8:
                return new c1(new t71((v71) obj, (Context) obj2));
            case 9:
                Context context7 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    yu0Var = new b9(context7);
                                } else {
                                    yu0Var = new l5(context7);
                                }
                            } else {
                                yu0 yu0Var2 = new yu0(context7, null);
                                yu0Var2.setCallback(new tt(this, 2));
                                yu0Var = yu0Var2;
                            }
                        } else {
                            yu0Var = new p4(context7);
                        }
                    } else {
                        yu0Var = new c7(context7, (f1) null);
                    }
                } else {
                    t8 t8Var2 = new t8(context7);
                    t8Var2.d(t6.f20985g6, t6.O6, t6.P6, t6.Q6, t6.R6);
                    t8Var2.setTypeface(i0.o());
                    t8Var2.setHeight(56);
                    yu0Var = t8Var2;
                }
                return sc.e.o(yu0Var, yu0Var, -1, -2);
            case 10:
                Context context8 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        c7Var = new p8(context8);
                                    } else {
                                        c7Var = new l5(context8);
                                    }
                                } else {
                                    c7Var = new b9(context8);
                                }
                            } else {
                                c7Var = new t8(context8);
                            }
                        } else {
                            c7Var = new p4(context8, 22);
                        }
                    } else {
                        c7Var = new x9(context8);
                    }
                } else {
                    c7Var = new c7(context8, (f1) null);
                }
                return sc.e.o(c7Var, c7Var, -1, -2);
            case 11:
                Context context9 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                a9Var = new b9(context9);
                            } else {
                                View x9Var4 = new x9(context9);
                                a7.i(t6.f20929d6, x9Var4, null);
                                a9Var = x9Var4;
                            }
                        } else {
                            a9Var = new c7(context9, (f1) null);
                        }
                    } else {
                        a9 a9Var2 = new a9(context9);
                        a9Var2.setMultilineDetail(true);
                        a7.i(t6.f20929d6, a9Var2, null);
                        a9Var = a9Var2;
                    }
                } else {
                    View p4Var2 = new p4(context9);
                    a7.i(t6.f20929d6, p4Var2, null);
                    a9Var = p4Var2;
                }
                return sc.e.o(a9Var, a9Var, -1, -2);
            case 12:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context10 = (Context) obj2;
                if (i10 == 0) {
                    p6Var = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new p4(context10, p6Var);
                } else if (i10 == 1) {
                    p6Var2 = ((k2) notificationsSettingsActivity).resourceProvider;
                    p4Var = new t8(context10, p6Var2);
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        p6Var3 = ((k2) notificationsSettingsActivity).resourceProvider;
                        p4Var = new l5(21, 64, (Context) obj2, p6Var3, true);
                    } else if (i10 != 4) {
                        if (i10 != 5) {
                            p6Var5 = ((k2) notificationsSettingsActivity).resourceProvider;
                            p4Var = new b9(context10, p6Var5);
                        } else {
                            p6Var4 = ((k2) notificationsSettingsActivity).resourceProvider;
                            p4Var = new x9(0, context10, p6Var4);
                        }
                    } else {
                        p4Var = new c7(context10, (f1) null);
                    }
                } else {
                    p4Var = new a9(context10);
                }
                return new c1(p4Var);
            case 13:
                Context context11 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                t8Var = new b9(context11);
                            } else {
                                t8Var = new rj0(context11);
                                t8Var.setTag(-33024);
                            }
                        } else {
                            t8Var = new p4(context11);
                        }
                    } else {
                        t8Var = new x9(context11);
                    }
                } else {
                    t8Var = new t8(context11);
                }
                return new c1(t8Var);
            case 14:
                Context context12 = (Context) obj2;
                ?? frameLayout5 = new FrameLayout(context12);
                frameLayout5.e = new Paint();
                frameLayout5.f21676b = new we[4];
                frameLayout5.f21675a = new y5[4];
                for (int i16 = 0; i16 < 4; i16++) {
                    frameLayout5.f21675a[i16] = new y5((a6) frameLayout5, context12);
                    frameLayout5.addView(frameLayout5.f21675a[i16]);
                    frameLayout5.f21675a[i16].setVisibility(4);
                    frameLayout5.f21675a[i16].setTag(Integer.valueOf(i16));
                    frameLayout5.f21675a[i16].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout5, 9));
                }
                frameLayout5.setDelegate(new tj0(this, 1));
                return new c1(frameLayout5);
            case 15:
                lo0 lo0Var = (lo0) obj;
                boolean z12 = lo0Var.f39349r0;
                Context context13 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                g3 g3Var = new g3(context13, null);
                                g3Var.setForceDarkTheme(z12);
                                p8Var = g3Var;
                            } else {
                                p8 p8Var2 = new p8(23, context13, true);
                                p8Var2.setLayoutParams(new o0(-1, -2));
                                if (z12) {
                                    a7.Y(p8Var2.f22457a, lo0Var.f39354v0, null);
                                    a7.t(p8Var2.e, t6.f20976fh, null, PorterDuff.Mode.MULTIPLY);
                                }
                                p8Var = p8Var2;
                            }
                        } else {
                            p8Var = new l7(1, context13, null);
                        }
                    } else {
                        ViewGroup frameLayout6 = new FrameLayout(context13);
                        frameLayout6.setLayoutParams(new o0(-1, -2));
                        RadialProgressView radialProgressView = new RadialProgressView(context13, null);
                        radialProgressView.setProgressColor(-11371101);
                        frameLayout6.addView(radialProgressView, w7.b6.c(-1.0f, -1));
                        p8Var = frameLayout6;
                    }
                } else {
                    v5 v5Var = new v5(context13, null);
                    v5Var.setDelegate(new jo0(this));
                    FrameLayout checkFrame = v5Var.getCheckFrame();
                    if (lo0Var.T == 0) {
                        i14 = 0;
                    }
                    checkFrame.setVisibility(i14);
                    p8Var = v5Var;
                }
                return new c1(p8Var);
            case 16:
                Context context14 = (Context) obj2;
                ?? frameLayout7 = new FrameLayout(context14);
                new Paint();
                frameLayout7.setWillNotDraw(false);
                g9 g9Var = new g9(context14);
                frameLayout7.f21727a = g9Var;
                g9Var.setRoundRadius(i0.L(4.0f));
                frameLayout7.addView(g9Var, w7.b6.c(-1.0f, -1));
                FrameLayout frameLayout8 = new FrameLayout(context14);
                frameLayout7.f21728b = frameLayout8;
                frameLayout7.addView(frameLayout8, w7.b6.e(42, 42, 53));
                b1 b1Var = new b1(context14);
                b1Var.d = new Path();
                b1Var.f9896c = new float[8];
                b1Var.f9895b = new RectF();
                b1Var.e = new Paint(1);
                frameLayout7.e = b1Var;
                b1Var.setWillNotDraw(false);
                b1Var.setPadding(i0.L(3.0f), 0, i0.L(3.0f), 0);
                frameLayout7.addView(b1Var, w7.b6.e(-1, 16, 83));
                b1Var.addView(z20.e(context14, 2131231464), w7.b6.e(-2, -2, 19));
                TextView textView4 = new TextView(context14);
                frameLayout7.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                b1Var.addView(textView4, w7.b6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                ep epVar2 = new ep(24, context14, null);
                frameLayout7.f21729c = epVar2;
                epVar2.setDrawBackgroundAsArc(11);
                epVar2.b(t6.W9, t6.X9, t6.V9);
                frameLayout7.addView(epVar2, w7.b6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                epVar2.setVisibility(0);
                frameLayout7.setFocusable(true);
                frameLayout8.setOnClickListener(new f50(this, 21));
                return new c1(frameLayout7);
            case 17:
                Context context15 = (Context) obj2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 6) {
                                        c7Var2 = new cz0((ProxyListActivity) obj, context15);
                                        a7.i(t6.f20929d6, c7Var2, null);
                                    } else {
                                        c7Var2 = new yu0(context15, null);
                                        a7.i(t6.f20929d6, c7Var2, null);
                                    }
                                } else {
                                    c7Var2 = new b9(context15);
                                }
                            } else {
                                c7Var2 = new t8(context15);
                                a7.i(t6.f20929d6, c7Var2, null);
                            }
                        } else {
                            c7Var2 = new p4(context15);
                            a7.i(t6.f20929d6, c7Var2, null);
                        }
                    } else {
                        c7Var2 = new x9(context15);
                        a7.i(t6.f20929d6, c7Var2, null);
                    }
                } else {
                    c7Var2 = new c7(context15, (f1) null);
                }
                return sc.e.o(c7Var2, c7Var2, -1, -2);
            case 18:
                Context context16 = (Context) obj2;
                if (i10 == 0) {
                    x9Var2 = new p4(context16);
                } else if (i10 == 1) {
                    x9Var2 = new t8(context16);
                } else if (i10 == 2) {
                    x9 x9Var5 = new x9(context16);
                    x9Var5.setCanDisable(true);
                    x9Var2 = x9Var5;
                } else {
                    x9Var2 = new b9(context16);
                }
                x9Var2.setLayoutParams(new o0(-1, -2));
                return new c1(x9Var2);
            default:
                Context context17 = (Context) obj2;
                if (i10 == 0) {
                    v4Var = new v2(context17, false);
                } else {
                    v4Var = new v4(context17);
                }
                v4Var.setLayoutParams(new o0(-1, -2));
                return new c1(v4Var);
        }
    }

    @Override
    public void y(c1 c1Var) {
        int i10;
        int i11;
        int i12 = this.f7079c;
        Object obj = this.e;
        switch (i12) {
            case 2:
                jn jnVar = (jn) obj;
                ih.g gVar = jnVar.f27433m1;
                boolean z10 = jnVar.f27434n;
                int i13 = c1Var.f47901f;
                View view = c1Var.f47898a;
                CharSequence charSequence = "";
                if (i13 == 4) {
                    e6 e6Var = (e6) view;
                    e6Var.setTag(1);
                    CharSequence charSequence2 = jnVar.N;
                    if (charSequence2 != null) {
                        charSequence = charSequence2;
                    }
                    if (z10) {
                        i11 = 2131744078;
                    } else {
                        i11 = 2131746463;
                    }
                    e6Var.n(charSequence, cd.L0(i11, null), true);
                    e6Var.setTag(null);
                    jn.O(jnVar, view, c1Var.b());
                    return;
                } else if (i13 == 11) {
                    e6 e6Var2 = (e6) view;
                    e6Var2.setTag(1);
                    CharSequence charSequence3 = jnVar.O;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                    e6Var2.n(charSequence, cd.L0(2131746464, null), false);
                    e6Var2.setTag(null);
                    e6Var2.e.b(gVar.b(-2), false);
                    jn.O(jnVar, view, c1Var.b());
                    return;
                } else if (i13 == 5) {
                    int b10 = c1Var.b();
                    e6 e6Var3 = (e6) view;
                    e6Var3.setTag(1);
                    e6Var3.f21858a.a(jnVar.f27412b0, false);
                    int i14 = b10 - jnVar.f27447t0;
                    CharSequence charSequence4 = jnVar.K[i14];
                    if (z10) {
                        i10 = 2131744080;
                    } else {
                        i10 = 2131747790;
                    }
                    e6Var3.n(charSequence4, cd.L0(i10, null), true);
                    e6Var3.setTag(null);
                    if (jnVar.f27430k0 == b10) {
                        EditTextBoldCursor textView = e6Var3.getTextView();
                        textView.requestFocus();
                        i0.J3(textView);
                        jnVar.f27430k0 = -1;
                    }
                    if (!z10) {
                        e6Var3.e.b(gVar.b(i14), false);
                    }
                    jn.O(jnVar, view, b10);
                    return;
                } else if (i13 == 7) {
                    e6 e6Var4 = (e6) view;
                    e6Var4.setTag(1);
                    CharSequence charSequence5 = jnVar.P;
                    if (charSequence5 != null) {
                        charSequence = charSequence5;
                    }
                    e6Var4.n(charSequence, cd.L0(2131754474, null), false);
                    e6Var4.setTag(null);
                    if (!z10) {
                        e6Var4.e.b(gVar.b(-3), false);
                    }
                    jn.O(jnVar, view, c1Var.b());
                    return;
                } else {
                    return;
                }
            case 10:
                if (c1Var.f47901f == 3) {
                    t8 t8Var = (t8) c1Var.f47898a;
                    int b11 = c1Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b11 == dataSettingsActivity.E) {
                        t8Var.setChecked(tz.E0);
                        return;
                    } else if (b11 == dataSettingsActivity.D) {
                        t8Var.setChecked(tz.B0);
                        return;
                    } else if (b11 == dataSettingsActivity.F) {
                        t8Var.setChecked(tz.C0);
                        return;
                    } else if (b11 == dataSettingsActivity.G) {
                        t8Var.setChecked(tz.D0);
                        return;
                    } else if (b11 == dataSettingsActivity.J) {
                        int i15 = tz.f18131a;
                        t8Var.setChecked(sc.e(2048));
                        return;
                    } else if (b11 == dataSettingsActivity.K) {
                        int i16 = tz.f18131a;
                        t8Var.setChecked(sc.e(1024));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (c1Var.f47901f == 3) {
                    t8 t8Var2 = (t8) c1Var.f47898a;
                    int b12 = c1Var.b();
                    if (b12 == ProxyListActivity.f0(proxyListActivity)) {
                        t8Var2.setChecked(proxyListActivity.d);
                        return;
                    } else if (b12 == proxyListActivity.f33964w) {
                        t8Var2.setChecked(tz.f18133a1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(c1 c1Var) {
        switch (this.f7079c) {
            case 2:
                jn jnVar = (jn) this.e;
                int i10 = c1Var.f47901f;
                if (i10 == 4 || i10 == 11 || i10 == 5) {
                    EditTextBoldCursor textView = ((e6) c1Var.f47898a).getTextView();
                    if (textView.isFocused()) {
                        if (jnVar.I) {
                            an anVar = jnVar.f27454y;
                            if (anVar != null) {
                                anVar.f();
                            }
                            jnVar.c0(true);
                        }
                        jnVar.f27423g1 = null;
                        textView.clearFocus();
                        i0.v1(textView);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public j(l lVar, LaunchActivity launchActivity) {
        this.f7079c = 0;
        this.e = lVar;
        this.d = launchActivity;
    }

    public j(Context context) {
        this.f7079c = 19;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        q2 q2Var = new q2();
        q2Var.f22812a = cd.L0(2131744196, null);
        q2Var.f22813b = cd.L0(2131744188, null);
        q2Var.f22814c = 0;
        q2Var.d = 0;
        q2Var.e = true;
        q2Var.f22815f = false;
        q2Var.f22816g = 0;
        q2Var.h = currentTimeMillis;
        q2Var.f22817i = false;
        q2Var.f22818j = false;
        q2Var.f22819k = 2;
        arrayList.add(q2Var);
        q2 q2Var2 = new q2();
        q2Var2.f22812a = cd.L0(2131744195, null);
        q2Var2.f22813b = cd.L0(2131744187, null);
        q2Var2.f22814c = 1;
        q2Var2.d = 2;
        q2Var2.e = false;
        q2Var2.f22815f = false;
        q2Var2.f22816g = 0;
        q2Var2.h = currentTimeMillis - 3600;
        q2Var2.f22817i = false;
        q2Var2.f22818j = false;
        q2Var2.f22819k = -1;
        arrayList.add(q2Var2);
        q2 q2Var3 = new q2();
        q2Var3.f22812a = cd.L0(2131744194, null);
        q2Var3.f22813b = cd.L0(2131744186, null);
        q2Var3.f22814c = 2;
        q2Var3.d = 3;
        q2Var3.e = false;
        q2Var3.f22815f = true;
        q2Var3.f22816g = 0;
        q2Var3.h = currentTimeMillis - 7200;
        q2Var3.f22817i = false;
        q2Var3.f22818j = true;
        q2Var3.f22819k = -1;
        arrayList.add(q2Var3);
        q2 q2Var4 = new q2();
        q2Var4.f22812a = cd.L0(2131744193, null);
        q2Var4.f22813b = cd.L0(2131744185, null);
        q2Var4.f22814c = 3;
        q2Var4.d = 0;
        q2Var4.e = false;
        q2Var4.f22815f = false;
        q2Var4.f22816g = 2;
        q2Var4.h = currentTimeMillis - 10800;
        q2Var4.f22817i = false;
        q2Var4.f22818j = false;
        q2Var4.f22819k = -1;
        arrayList.add(q2Var4);
        q2 q2Var5 = new q2();
        q2Var5.f22812a = cd.L0(2131744192, null);
        q2Var5.f22813b = cd.L0(2131744184, null);
        q2Var5.f22814c = 4;
        q2Var5.d = 0;
        q2Var5.e = false;
        q2Var5.f22815f = false;
        q2Var5.f22816g = 1;
        q2Var5.h = currentTimeMillis - 14400;
        q2Var5.f22817i = false;
        q2Var5.f22818j = false;
        q2Var5.f22819k = 2;
        arrayList.add(q2Var5);
        q2 q2Var6 = new q2();
        q2Var6.f22812a = cd.L0(2131744191, null);
        q2Var6.f22813b = cd.L0(2131744183, null);
        q2Var6.f22814c = 5;
        q2Var6.d = 0;
        q2Var6.e = false;
        q2Var6.f22815f = false;
        q2Var6.f22816g = 0;
        q2Var6.h = currentTimeMillis - 18000;
        q2Var6.f22817i = false;
        q2Var6.f22818j = false;
        q2Var6.f22819k = -1;
        arrayList.add(q2Var6);
        q2 q2Var7 = new q2();
        q2Var7.f22812a = cd.L0(2131744190, null);
        q2Var7.f22813b = cd.L0(2131744182, null);
        q2Var7.f22814c = 6;
        q2Var7.d = 0;
        q2Var7.e = false;
        q2Var7.f22815f = false;
        q2Var7.f22816g = 0;
        q2Var7.h = currentTimeMillis - 21600;
        q2Var7.f22817i = true;
        q2Var7.f22818j = false;
        q2Var7.f22819k = -1;
        arrayList.add(q2Var7);
        q2 q2Var8 = new q2();
        q2Var8.f22812a = cd.L0(2131744189, null);
        q2Var8.f22813b = cd.L0(2131744181, null);
        q2Var8.f22814c = 0;
        q2Var8.d = 0;
        q2Var8.e = false;
        q2Var8.f22815f = false;
        q2Var8.f22816g = 0;
        q2Var8.h = currentTimeMillis - 25200;
        q2Var8.f22817i = true;
        q2Var8.f22818j = false;
        q2Var8.f22819k = -1;
        arrayList.add(q2Var8);
    }

    public j(ProxyListActivity proxyListActivity, Context context) {
        this.f7079c = 17;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
