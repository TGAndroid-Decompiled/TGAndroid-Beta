package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
public final class xf3 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public xf3(cs5 cs5Var, Runnable runnable, byte b) {
        this.a = b;
        this.c = cs5Var;
        this.b = runnable;
    }

    @Override
    public final void onClick(View view) {
        s49 T;
        long j;
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList arrayList2;
        akb O0;
        int i;
        int i2;
        boolean z;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((cs5) this.c).u();
                ((cj3) this.b).presentFragment(new ProxyListActivity());
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                return;
            case 2:
                cj3 cj3Var = (cj3) this.b;
                cj3Var.G4((ArrayList) this.c, 102, false, false, null);
                cj3Var.finishPreviewFragment();
                return;
            case 3:
                ((cj3) this.b).O3((hd[]) this.c);
                return;
            case 4:
                ((cj3) this.b).k4((mj0) this.c);
                return;
            case 5:
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (((dk3) this.b).getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                ((i61) this.b).dismiss();
                ((d) this.c).presentFragment(new r61());
                return;
            case 7:
                qx3 qx3Var = (qx3) this.b;
                gm gmVar = (gm) this.c;
                m8 m8Var = qx3Var.A1;
                if (m8Var != null) {
                    m8Var.d(true);
                    qx3Var.A1 = null;
                    SpannableString spannableString = new SpannableString(k27.U(vl.e(qx3Var.a, gmVar.getDocumentId())));
                    spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                    if (gl.g(spannableString)) {
                        new u21((FrameLayout) qx3Var.b, qx3Var.J0).i(k96.M0(2131751172, null)).j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                l14 l14Var = (l14) this.b;
                vza vzaVar = (vza) this.c;
                t14 t14Var = l14Var.w;
                bz3 bz3Var = t14Var.E0;
                if (bz3Var.indexOfChild(vzaVar) != -1 && (T = bz3Var.T(vzaVar)) != null) {
                    if (T.b() == t14Var.g1) {
                        if (t14Var.i1 != null) {
                            u04 u04Var = t14Var.u1;
                            if (u04Var != null) {
                                u04Var.y(t14Var.K1.id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = na7.q1(t14Var.d1).Y3.edit();
                        String str = "group_hide_stickers_" + t14Var.K1.id;
                        TLRPC.StickerSet stickerSet = t14Var.K1.stickerset;
                        if (stickerSet != null) {
                            j = stickerSet.id;
                        } else {
                            j = 0;
                        }
                        edit.putLong(str, j).apply();
                        t14Var.Y(false);
                        l14 l14Var2 = t14Var.z0;
                        if (l14Var2 != null) {
                            l14Var2.f();
                            return;
                        }
                        return;
                    } else if (l14Var.h.get(T.b()) == t14Var.k1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l14Var.c);
                        alertDialog$Builder.a.S = k96.M0(2131752051, null);
                        alertDialog$Builder.a.U = k96.M0(2131752052, null);
                        alertDialog$Builder.j(k96.M0(2131752087, null), new kx3(l14Var, (byte) 2));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.show();
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
                return;
            case 9:
                kf4 kf4Var = (kf4) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((lf4) this.c).getSuggestedFilter();
                t97 t97Var = new t97();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                t97Var.b = tL_textWithEntities.text;
                t97Var.c = tL_textWithEntities.entities;
                t97Var.a = 2;
                while (kf4Var.e.getMessagesController().J0.get(t97Var.a) != null) {
                    t97Var.a++;
                }
                t97Var.f = kf4Var.e.getMessagesController().R0().size();
                t97Var.d = -1;
                t97Var.e = -1;
                int i3 = 0;
                while (true) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    if (i3 < 2) {
                        if (i3 == 0) {
                            arrayList = dialogFilter.include_peers;
                            arrayList2 = t97Var.h;
                        } else {
                            arrayList = dialogFilter.exclude_peers;
                            arrayList2 = t97Var.i;
                        }
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            TLRPC.InputPeer inputPeer = arrayList.get(i4);
                            long j2 = inputPeer.user_id;
                            if (j2 == 0) {
                                long j3 = inputPeer.chat_id;
                                if (j3 == 0) {
                                    j3 = inputPeer.channel_id;
                                }
                                j2 = -j3;
                            }
                            i4 = mue.c(i4, 1, j2, arrayList2);
                        }
                        i3++;
                    } else {
                        if (dialogFilter.groups) {
                            int i5 = t97Var.g;
                            int i6 = na7.q5;
                            t97Var.g = i5 | 4;
                        }
                        if (dialogFilter.bots) {
                            int i7 = t97Var.g;
                            int i8 = na7.q5;
                            t97Var.g = i7 | 16;
                        }
                        if (dialogFilter.contacts) {
                            int i9 = t97Var.g;
                            int i10 = na7.q5;
                            t97Var.g = i9 | 1;
                        }
                        if (dialogFilter.non_contacts) {
                            int i11 = t97Var.g;
                            int i12 = na7.q5;
                            t97Var.g = i11 | 2;
                        }
                        if (dialogFilter.broadcasts) {
                            int i13 = t97Var.g;
                            int i14 = na7.q5;
                            t97Var.g = i13 | 8;
                        }
                        if (dialogFilter.exclude_archived) {
                            int i15 = t97Var.g;
                            int i16 = na7.q5;
                            t97Var.g = i15 | 128;
                        }
                        if (dialogFilter.exclude_read) {
                            int i17 = t97Var.g;
                            int i18 = na7.q5;
                            t97Var.g = i17 | 64;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i19 = t97Var.g;
                            int i20 = na7.q5;
                            t97Var.g = i19 | 32;
                        }
                        pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, t97Var.j, true, true, true, true, true, kf4Var.e, new vc4(kf4Var, suggestedFilter, (byte) 7));
                        return;
                    }
                }
            case 10:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.W0;
                float x = MediaController.w().x(fragmentContextView.W);
                int i21 = 0;
                while (true) {
                    if (i21 < 3) {
                        if (x - 0.1f > fArr[i21]) {
                            i21++;
                        }
                    } else {
                        i21 = -1;
                    }
                }
                int i22 = i21 + 1;
                if (i22 >= 3) {
                    i22 = 0;
                }
                float f = fArr[i22];
                MediaController.w().l0(fragmentContextView.W, f);
                fragmentContextView.l(x, f, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    le5 le5Var = le5.w;
                    if (le5Var.c()) {
                        le5Var.b();
                        d dVar = fragmentContextView.h;
                        if (dVar != null && fragmentContextView.C0 != null) {
                            je5 je5Var = new je5(fragmentContextView.getContext(), 1);
                            je5Var.p(true);
                            je5Var.d = 2300L;
                            je5Var.U = true;
                            je5Var.e = true;
                            je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                            je5Var.v0 = -gl.L(6.0f);
                            fragmentContextView.B0 = je5Var;
                            je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            if (dVar instanceof mu1) {
                                je5Var.k(((mu1) dVar).L);
                            }
                            je5Var.t(k96.M0(2131745032, null));
                            je5Var.r0 = new hh(je5Var, (byte) 3);
                            fragmentContextView.C0.addView(je5Var, nme.e(-1, 150, 55));
                            je5Var.x(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 11:
                no4 no4Var = (no4) this.b;
                q7 q7Var = (q7) this.c;
                int indexOf = no4Var.G.indexOf(q7Var.getFilter());
                if (no4Var.J != indexOf) {
                    no4Var.J = indexOf;
                    no4Var.e();
                    return;
                } else if (q7Var.getFilter().h) {
                    if (!q7Var.a.f) {
                        q7Var.setSelectedForDelete(true);
                        return;
                    }
                    rf4 filter = q7Var.getFilter();
                    no4Var.f(filter);
                    mo4 mo4Var = no4Var.I;
                    if (mo4Var != null) {
                        ((di3) mo4Var).a(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 12:
                d01.t((Activity) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                return;
            case 13:
                ((rg) this.b).run();
                ((fx0) this.c).dismiss();
                return;
            case 14:
                ((be2) this.c).a(Long.valueOf(((fr4) this.b).d));
                return;
            case 15:
                sr4 sr4Var = (sr4) this.b;
                sr4Var.e((xl6) this.c, false);
                sr4Var.G.p();
                return;
            case 16:
                final nt4 nt4Var = (nt4) this.b;
                final n8 n8Var = (n8) this.c;
                if (nt4Var.d) {
                    if (!n8Var.a.R) {
                        n8Var.b(true);
                        String str2 = nt4Var.h;
                        p8c p8cVar = new p8c() {
                            @Override
                            public final void a(Object obj) {
                                byte b = r3;
                                n8 n8Var2 = n8Var;
                                nt4 nt4Var2 = nt4Var;
                                switch (b) {
                                    case 0:
                                        Void r5 = (Void) obj;
                                        n8Var2.b(false);
                                        ot4 ot4Var = (ot4) nt4Var2;
                                        gl.d3(new s54(ot4Var, (byte) 28), 200L);
                                        ot4Var.r.dismiss();
                                        return;
                                    default:
                                        n8Var2.b(false);
                                        ym0.c((TLRPC.TL_error) obj, nt4Var2.n, nt4Var2.c, new lt4(nt4Var2, (byte) 1));
                                        return;
                                }
                            }
                        };
                        p8c p8cVar2 = new p8c() {
                            @Override
                            public final void a(Object obj) {
                                byte b = r3;
                                n8 n8Var2 = n8Var;
                                nt4 nt4Var2 = nt4Var;
                                switch (b) {
                                    case 0:
                                        Void r5 = (Void) obj;
                                        n8Var2.b(false);
                                        ot4 ot4Var = (ot4) nt4Var2;
                                        gl.d3(new s54(ot4Var, (byte) 28), 200L);
                                        ot4Var.r.dismiss();
                                        return;
                                    default:
                                        n8Var2.b(false);
                                        ym0.c((TLRPC.TL_error) obj, nt4Var2.n, nt4Var2.c, new lt4(nt4Var2, (byte) 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str2;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new hn0(p8cVar2, p8cVar, (byte) 0), 2);
                        return;
                    }
                    return;
                }
                ((ot4) nt4Var).r.dismiss();
                return;
            case 17:
                final xu4 xu4Var = (xu4) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                cs5 G = cs5.G(xu4Var.c, xu4Var.J0, (View) view.getParent());
                G.b(2131232587, k96.M0(2131745409, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        xu4 xu4Var2 = xu4Var;
                        switch (b) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                mu1 mu1Var = new mu1(bundle);
                                d dVar2 = xu4Var2.r1;
                                if (dVar2 != null) {
                                    dVar2.presentFragment(mu1Var);
                                    return;
                                }
                                d S = LaunchActivity.S();
                                if (S != 0) {
                                    ?? obj = new Object();
                                    obj.a = true;
                                    S.showAsSheet(mu1Var, obj);
                                    return;
                                }
                                return;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar3 = xu4Var2.r1;
                                if (dVar3 != null) {
                                    dVar3.presentFragment(profileActivity);
                                    return;
                                }
                                d S2 = LaunchActivity.S();
                                if (S2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.a = true;
                                    S2.showAsSheet(profileActivity, obj2);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.b(2131232271, k96.M0(2131747593, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        TLRPC.User user2 = user;
                        xu4 xu4Var2 = xu4Var;
                        switch (b) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                mu1 mu1Var = new mu1(bundle);
                                d dVar2 = xu4Var2.r1;
                                if (dVar2 != null) {
                                    dVar2.presentFragment(mu1Var);
                                    return;
                                }
                                d S = LaunchActivity.S();
                                if (S != 0) {
                                    ?? obj = new Object();
                                    obj.a = true;
                                    S.showAsSheet(mu1Var, obj);
                                    return;
                                }
                                return;
                            default:
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("user_id", user2.id);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                d dVar3 = xu4Var2.r1;
                                if (dVar3 != null) {
                                    dVar3.presentFragment(profileActivity);
                                    return;
                                }
                                d S2 = LaunchActivity.S();
                                if (S2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.a = true;
                                    S2.showAsSheet(profileActivity, obj2);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.a0();
                return;
            case 18:
                ki7 ki7Var = (ki7) this.c;
                if (!((s25) this.b).m) {
                    ki7Var.dismiss();
                    return;
                }
                return;
            case 19:
                cj7 cj7Var = (cj7) this.c;
                if (!((u41) this.b).R) {
                    cj7Var.dismiss();
                    return;
                }
                return;
            case 20:
                TextView textView2 = (TextView) this.c;
                h75 h75Var = ((v45) this.b).F;
                fc2 fc2Var = h75Var.T2;
                if (fc2Var != null && fc2Var.w) {
                    h75Var.B1(textView2);
                    return;
                }
                return;
            case 21:
                new v65((LaunchActivity) this.c, (sb) this.b).show();
                return;
            case 22:
                h75 h75Var2 = (h75) this.c;
                fc2 fc2Var2 = ((e55) this.b).j0;
                if (fc2Var2 != null && fc2Var2.b.rtmp_stream) {
                    sn9.d(h75Var2.b2);
                    return;
                }
                o85.g0 = false;
                h75Var2.dismiss();
                return;
            case 23:
                ((rc2) this.c).run();
                ((wb5) this.b).dismiss();
                return;
            case 24:
                wp5 wp5Var = (wp5) this.b;
                ry8 ry8Var = (ry8) this.c;
                if (!cj3.C4) {
                    cj3.C4 = true;
                    boolean o = bkb.I.o();
                    boolean z3 = !o;
                    if (!o) {
                        O0 = bkb.O0("Night");
                    } else {
                        O0 = bkb.O0("Blue");
                    }
                    bkb.o = 0;
                    bkb.u1();
                    bkb.A();
                    oy8 oy8Var = wp5Var.w;
                    if (!o) {
                        i = oy8Var.e[0] - 1;
                    } else {
                        i = 0;
                    }
                    oy8Var.K(i);
                    ry8Var.d();
                    ry8Var.getLocationInWindow(r1);
                    int[] iArr = {(ry8Var.getMeasuredWidth() / 2) + iArr[0], (ry8Var.getMeasuredHeight() / 2) + iArr[1]};
                    kk7.e().k(273, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z3), ry8Var);
                    if (!o) {
                        i2 = 2131754750;
                    } else {
                        i2 = 2131754749;
                    }
                    ry8Var.setContentDescription(k96.M0(i2, null));
                    return;
                }
                return;
            case 25:
                ((cs5) this.c).u();
                ((go6) this.b).run();
                return;
            case 26:
                cs5 cs5Var = (cs5) this.c;
                ((og3) this.b).run();
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
            case 27:
                xt5 xt5Var = (xt5) this.b;
                vt5 vt5Var = (vt5) this.c;
                TLRPC.InputPeer h1 = na7.q1(xt5Var.a).h1(k27.B1(xt5Var.w1));
                if (xt5Var.v1 == 2) {
                    if (xt5Var.w1 != xt5Var.x1) {
                        if (xt5Var.s1.size() <= 1) {
                            z2 = false;
                        }
                        vt5Var.a(h1, z2, false, false);
                    }
                } else {
                    xt5Var.y1 = h1;
                }
                xt5Var.dismiss();
                return;
            case 28:
                jv5 jv5Var = (jv5) this.b;
                d dVar2 = (d) this.c;
                jv5Var.R.dismiss();
                if (jv5Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i23 = jv5Var.d0;
                    if (i23 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i23 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    cj3 cj3Var2 = new cj3(bundle);
                    cj3Var2.E2 = new h45(jv5Var, cj3Var2, (byte) 4);
                    dVar2.presentFragment(cj3Var2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", jv5Var.d0);
                v51 v51Var = new v51(bundle2);
                v51Var.d = jv5Var.g0;
                v51Var.Y();
                dVar2.presentFragment(v51Var);
                return;
            default:
                xw5[] xw5VarArr = (xw5[]) this.c;
                String str3 = LaunchActivity.C1;
                Integer num = (Integer) view.getTag();
                ((i96[]) this.b)[0] = ((xw5) view).getCurrentLocale();
                for (int i24 = 0; i24 < 2; i24++) {
                    xw5 xw5Var = xw5VarArr[i24];
                    if (i24 == num.intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xw5Var.a.a(z, true);
                }
                return;
        }
    }

    public xf3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
