package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.p;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.ProfileActivity;
public final class u implements c39 {
    public final byte a;
    public final Object b;

    public u(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void d(int i, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.StickerSet stickerSet;
        int i2;
        hb0 hb0Var;
        TLRPC.Chat chat;
        String M0;
        String a0;
        cib cibVar;
        px2 px2Var;
        boolean[] zArr;
        a aVar;
        TLRPC.Document document;
        long longValue;
        vl vlVar;
        wjb resourceProvider;
        TLRPC.StickerSet stickerSet2;
        gd4 gd4Var;
        u21 b0;
        int i3;
        byte b = this.a;
        int i4 = 2;
        int i5 = -1;
        Object obj = null;
        TLRPC.Document document2 = null;
        TLRPC.BotInlineResult botInlineResult = null;
        r11 = null;
        r11 = null;
        mx2 O = null;
        obj = null;
        int i6 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((a1) obj2).O2.G(i - 1);
                return;
            case 1:
                ((e0) obj2).b2.G(i - 1);
                return;
            case 2:
                ((bc) obj2).G0(i);
                return;
            case 3:
                cs csVar = (cs) obj2;
                if (i >= 0 && i < csVar.h.size()) {
                    byte b2 = ((as) csVar.h.get(i)).d;
                    if (b2 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = csVar.d;
                        boolean z = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z;
                        ((ahb) view).setChecked(z);
                        csVar.c = true;
                        return;
                    } else if (b2 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = csVar.d;
                        boolean z2 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z2;
                        ((ahb) view).setChecked(z2);
                        csVar.c = true;
                        return;
                    } else if (b2 == 7) {
                        if (!csVar.getUserConfig().p() && !csVar.getMessagesController().k4.L0.f && !csVar.d.archive_and_mute_new_noncontact_peers) {
                            e21 e21Var = new e21(csVar.getParentActivity(), csVar.getResourceProvider());
                            e21Var.b.setText(gl.N2(k96.M0(2131743627, null), bkb.wj, 0, new b1(csVar, (byte) 18), null));
                            e21Var.b.setSingleLine(false);
                            e21Var.b.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
                            e21Var.a.setImageResource(2131232367);
                            m21.g(csVar, e21Var, 3500).j();
                            int i7 = -csVar.e;
                            csVar.e = i7;
                            gl.A3(i7, view, null);
                            pw0.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = csVar.d;
                        boolean z3 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z3;
                        ((ahb) view).setChecked(z3);
                        csVar.c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                hs hsVar = (hs) obj2;
                if (i >= hsVar.y && i < hsVar.E && hsVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hsVar.h.get(i - hsVar.y);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        stickerSet = stickerSetCovered.set;
                        tL_inputStickerSetShortName.id = stickerSet.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        stickerSet = stickerSetCovered.set;
                        tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSet.access_hash;
                    u0b u0bVar = new u0b(hsVar.getParentActivity(), hsVar, inputStickerSet, null, null, null);
                    u0bVar.W1 = new fs(hsVar, view, stickerSetCovered);
                    hsVar.showDialog(u0bVar);
                    return;
                }
                return;
            case 5:
                ((vl9) obj2).b0(i);
                return;
            case 6:
                ib0 ib0Var = (ib0) obj2;
                jr jrVar = ib0Var.i3;
                mb0 mb0Var = ib0Var.k3;
                if (view instanceof jb0) {
                    jb0 jb0Var = (jb0) view;
                    if (!jb0Var.d) {
                        hb0 hb0Var2 = jb0Var.a;
                        ib0Var.h3 = hb0Var2.a;
                        mb0Var.a.b(hb0Var2, false);
                        if (jrVar != null) {
                            jrVar.f();
                        }
                        mb0Var.r0();
                        return;
                    }
                }
                if (ib0Var.h3 != 1 && (hb0Var = ib0Var.j3) != null) {
                    ib0Var.h3 = 1;
                    mb0Var.a.b(hb0Var, true);
                    if (jrVar != null) {
                        jrVar.f();
                    }
                    mb0Var.r0();
                    return;
                } else if (mb0Var.T == null) {
                    if (!mb0Var.a.w) {
                        mb0Var.k0(true, true, true);
                    }
                    hb0 hb0Var3 = mb0Var.a.h;
                    boolean[] zArr2 = {false};
                    gl.U2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
                    ya0 ya0Var = new ya0(mb0Var, mb0Var.getParentActivity());
                    mb0Var.T = ya0Var;
                    ya0Var.K();
                    mb0Var.T.L0 = false;
                    mb0Var.h = true;
                    mb0Var.e.setBackground(new BitmapDrawable(mb0Var.getParentActivity().getResources(), gl.h2(12.0f, 10, mb0Var.fragmentView)));
                    mb0Var.h = false;
                    mb0Var.e.setVisibility(0);
                    mb0Var.e.setAlpha(0.0f);
                    mb0Var.f = true;
                    mb0Var.fragmentView.invalidate();
                    mb0Var.e.animate().setListener(new za0(mb0Var, (byte) 0)).alpha(1.0f).setDuration(200L).start();
                    mb0Var.Z = new Object();
                    p pVar = new p(mb0Var.getParentActivity(), false, new xa0(mb0Var, (byte) 2));
                    hb0 hb0Var4 = mb0Var.a.h;
                    if (hb0Var4 != null) {
                        hb0 hb0Var5 = mb0Var.Z;
                        int i8 = hb0Var4.f;
                        hb0Var5.f = i8;
                        i2 = 3;
                        pVar.e(i8, 3);
                        hb0 hb0Var6 = mb0Var.Z;
                        int i9 = mb0Var.a.h.e;
                        hb0Var6.e = i9;
                        pVar.e(i9, 2);
                        hb0 hb0Var7 = mb0Var.Z;
                        int i10 = mb0Var.a.h.d;
                        hb0Var7.d = i10;
                        pVar.e(i10, 1);
                        hb0 hb0Var8 = mb0Var.Z;
                        int i11 = mb0Var.a.h.c;
                        hb0Var8.c = i11;
                        pVar.e(i11, 0);
                    } else {
                        i2 = 3;
                    }
                    hb0 hb0Var9 = mb0Var.Z;
                    if (hb0Var9.f != 0) {
                        i4 = 4;
                    } else if (hb0Var9.e != 0) {
                        i4 = i2;
                    } else if (hb0Var9.d == 0) {
                        i4 = 1;
                    }
                    pVar.f(-1, 4, i4, false);
                    mb0Var.a.b(mb0Var.Z, true);
                    mb0Var.r0();
                    LinearLayout linearLayout = new LinearLayout(mb0Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, gl.L(8.0f), 0, 0);
                    linearLayout.addView(pVar);
                    FrameLayout frameLayout = new FrameLayout(mb0Var.getParentActivity());
                    frameLayout.setBackground(sjb.f(bkb.Ei, 8.0f));
                    TextView textView = new TextView(mb0Var.getParentActivity());
                    ir2.r(14.0f, 1, 2131745346, textView, null);
                    textView.setGravity(17);
                    textView.setTypeface(gl.o());
                    zkb.X(textView, bkb.Ii, null);
                    frameLayout.addView(textView, nme.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, nme.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new t(mb0Var, zArr2, (byte) 22));
                    ya0 ya0Var2 = mb0Var.T;
                    ya0Var2.O = linearLayout;
                    ya0Var2.Q0 = true;
                    ya0Var2.p0 = false;
                    ya0Var2.show();
                    mb0Var.isLightStatusBar();
                    return;
                } else {
                    return;
                }
            case 7:
                gr0 gr0Var = (gr0) obj2;
                kca kcaVar = gr0Var.a0;
                d dVar = kcaVar.a;
                if (view instanceof qfa) {
                    k27 messageObject = ((qfa) view).getMessageObject();
                    if (kcaVar.H.F1) {
                        if (kcaVar.c(messageObject)) {
                            kcaVar.g(messageObject);
                            return;
                        } else {
                            kcaVar.e(messageObject);
                            return;
                        }
                    }
                    m8b orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                    Context context = gr0Var.getContext();
                    int e1 = messageObject.e1();
                    s1b s1bVar = gr0Var.a;
                    p2b a = p2b.a(gr0Var.f);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                        i6 = gl.L(68.0f);
                    }
                    a.s += i6;
                    orCreateStoryViewer.G(context, e1, s1bVar, a);
                    return;
                }
                return;
            case 8:
                lh1 lh1Var = (lh1) obj2;
                ArrayList arrayList = lh1Var.c;
                rkb rkbVar = lh1Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    wd2 wd2Var = (wd2) arrayList.get(i);
                    lh1Var.a(wd2Var.a(), true);
                    if (view.getLeft() < gl.L(24.0f) + rkbVar.getPaddingLeft()) {
                        rkbVar.x0(-((gl.L(48.0f) + rkbVar.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (rkbVar.getMeasuredWidth() - rkbVar.getPaddingRight()) - gl.L(24.0f)) {
                        rkbVar.x0(de9.f(48.0f, rkbVar.getMeasuredWidth() - rkbVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    p8c p8cVar = lh1Var.r;
                    if (p8cVar != null) {
                        p8cVar.a(wd2Var.a());
                        return;
                    }
                    return;
                }
                return;
            case 9:
                p62 p62Var = (p62) obj2;
                m62 m62Var = p62Var.y;
                x02 x02Var = p62Var.b;
                w39 adapter = p62Var.s.getAdapter();
                n62 n62Var = p62Var.E;
                if (adapter == n62Var) {
                    ArrayList arrayList2 = n62Var.d;
                    int i12 = i - 1;
                    if (i12 >= 0 && i12 < arrayList2.size()) {
                        obj = arrayList2.get(i12);
                    }
                } else {
                    int S = m62Var.S(i);
                    int Q = m62Var.Q(i);
                    if (Q >= 0 && S >= 0) {
                        obj = m62Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (obj instanceof nx8) {
                    if (!y6c.h(x02Var.G3).p()) {
                        if (x02Var.Z1 != null) {
                            new jh8(x02Var.Z1, p62Var.getContext(), x02Var.G3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    nx8 nx8Var = (nx8) obj;
                    ij.X(x02Var.G3, x02Var.V0(), nx8Var.a(), new pz1(p62Var, nx8Var, (byte) 4));
                    return;
                }
                return;
            case 10:
                x92 x92Var = (x92) obj2;
                boolean z4 = x92Var.s;
                if (x92Var.getParentActivity() != null) {
                    w39 adapter2 = x92Var.b.getAdapter();
                    w92 w92Var = x92Var.e;
                    if (adapter2 == w92Var) {
                        chat = (TLRPC.Chat) w92Var.d.get(i);
                    } else {
                        int i13 = x92Var.H;
                        if (i >= i13 && i < x92Var.I) {
                            chat = (TLRPC.Chat) x92Var.w.get(i - i13);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z4 && x92Var.h.linked_chat_id == 0) {
                            x92Var.e0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.id);
                        x92Var.presentFragment(new mu1(bundle));
                        return;
                    } else if (i == x92Var.G) {
                        if (z4 && x92Var.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{x92Var.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = x92Var.f;
                            if (chat2 != null) {
                                bundle2.putString("title", k96.a0("GroupCreateDiscussionDefaultName", null, 2131749262, chat2.title));
                            }
                            wa5 wa5Var = new wa5(bundle2);
                            wa5Var.Z = new p92(x92Var);
                            x92Var.presentFragment(wa5Var);
                            return;
                        } else if (!x92Var.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) x92Var.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x92Var.getParentActivity());
                            if (z4) {
                                M0 = k96.M0(2131751359, null);
                                a0 = k96.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                M0 = k96.M0(2131751361, null);
                                a0 = k96.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.a.S = M0;
                            alertDialog$Builder.a.U = gl.S2(a0);
                            alertDialog$Builder.j(k96.M0(2131751362, null), new rh1(x92Var, (byte) 21));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            hd hdVar = alertDialog$Builder.a;
                            x92Var.showDialog(hdVar);
                            TextView textView2 = (TextView) hdVar.c(-1);
                            if (textView2 != null) {
                                zkb.X(textView2, bkb.p7, null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                oc2 oc2Var = (oc2) obj2;
                ArrayList arrayList3 = oc2Var.n;
                if (i > 2) {
                    va0 va0Var = (va0) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i - 3);
                    boolean contains = oc2Var.d.contains(tL_availableReaction.reaction);
                    boolean z5 = !contains;
                    ArrayList arrayList4 = oc2Var.d;
                    String str = tL_availableReaction.reaction;
                    if (!contains) {
                        arrayList4.add(str);
                    } else {
                        arrayList4.remove(str);
                        if (oc2Var.d.isEmpty()) {
                            nc2 nc2Var = oc2Var.h;
                            if (nc2Var != null) {
                                nc2Var.q(2, arrayList3.size() + 1);
                            }
                            oc2Var.Z(2, true);
                        }
                    }
                    Switch r0 = va0Var.c;
                    if (r0 != null) {
                        r0.c(z5, true);
                    }
                    wf2 wf2Var = va0Var.d;
                    if (wf2Var != null) {
                        wf2Var.a(z5, true);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                xd2 xd2Var = (xd2) obj2;
                o39 o39Var = xd2Var.v1;
                vd2 vd2Var = xd2Var.q1;
                if (vd2Var.d.get(i) != xd2Var.F1 && xd2Var.K1 == null) {
                    xd2Var.F1 = (wd2) vd2Var.d.get(i);
                    xd2Var.M0();
                    vd2Var.E(i);
                    xd2Var.b.postDelayed(new ef0(xd2Var, i, (byte) 2), 100L);
                    while (i6 < o39Var.getChildCount()) {
                        anb anbVar = (anb) o39Var.getChildAt(i6);
                        if (anbVar != view && (cibVar = anbVar.K) != null) {
                            gl.r(cibVar);
                            anbVar.K.run();
                        }
                        i6++;
                    }
                    if (!((wd2) vd2Var.d.get(i)).a.a) {
                        ((anb) view).d();
                    }
                    xd2Var.U0(true);
                    return;
                }
                return;
            case 13:
                mf2 mf2Var = (mf2) obj2;
                c4c G = mf2Var.Z1.G(i - 1);
                if (G != null) {
                    m41 m41Var = mf2Var.U1;
                    if (!m41Var.h(G)) {
                        int i14 = G.d;
                        if (i14 == -1) {
                            mf2Var.a2 = true;
                            m41Var.h = true;
                            mf2Var.Z1.O(true);
                            mf2Var.Y0(true);
                            return;
                        }
                        int i15 = mf2.f2;
                        if (i14 == -2) {
                            mf2Var.a2 = false;
                            m41Var.h = false;
                            mf2Var.Z1.O(true);
                            mf2Var.Y0(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                p8c p8cVar2 = ((jk2) obj2).c;
                if (p8cVar2 != null) {
                    p8cVar2.a((fk2) fk2.a().get(i));
                    return;
                }
                return;
            case 15:
                qm2 qm2Var = (qm2) obj2;
                int i16 = qm2Var.S1.G(i - 1).d;
                if (i16 == 151) {
                    qm2Var.Z0(false);
                    return;
                } else if (i16 == 150) {
                    qm2Var.Z0(true);
                    return;
                } else {
                    return;
                }
            case 16:
                tv2 tv2Var = (tv2) obj2;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((wv2) view).d;
                xv2 xv2Var = tv2Var.a;
                m43 reactionsWindow = xv2Var.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    a1b.c(null, xv2Var.c0, xv2Var.z.getContext(), new w72(tv2Var, (byte) 12));
                    return;
                }
                vv2 vv2Var = xv2Var.l;
                if (vv2Var != null) {
                    vv2Var.s(stickerSetCovered2.set, TextUtils.join("", xv2Var.o));
                }
                xv2Var.d();
                return;
            case 17:
                qx2 qx2Var = (qx2) obj2;
                if (qx2Var.f && qx2Var.e) {
                    v22 v22Var = qx2Var.d;
                    ArrayList arrayList5 = v22Var.e;
                    if (arrayList5 != null && i >= 0 && i < arrayList5.size()) {
                        O = (mx2) v22Var.e.get(i);
                    }
                } else {
                    int S2 = qx2Var.c.S(i);
                    int Q2 = qx2Var.c.Q(i);
                    if (Q2 >= 0 && S2 >= 0) {
                        O = qx2Var.c.O(S2, Q2);
                    } else {
                        return;
                    }
                }
                if (i >= 0) {
                    qx2Var.finishFragment();
                    if (O != null && (px2Var = qx2Var.r) != null) {
                        px2Var.z(O);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                o03 o03Var = (o03) obj2;
                o39 o39Var2 = o03Var.n1;
                if (i > 3) {
                    o03Var.Y1 = (TLRPC.Peer) o03Var.T1.get(i - 4);
                    if (view instanceof za5) {
                        ((za5) view).c(true, true);
                    }
                    for (int i17 = 0; i17 < o39Var2.getChildCount(); i17++) {
                        View childAt = o39Var2.getChildAt(i17);
                        if (childAt != view && (childAt instanceof za5)) {
                            ((za5) childAt).c(false, true);
                        }
                    }
                    return;
                }
                return;
            case 19:
                e83 e83Var = (e83) obj2;
                ArrayList arrayList6 = e83Var.k3;
                h83 h83Var = e83Var.w3;
                if ((view instanceof x73) && i >= 0 && i < arrayList6.size()) {
                    z73 z73Var = (z73) arrayList6.get(i);
                    if (z73Var != null) {
                        int i18 = z73Var.h;
                        if (i18 >= 0) {
                            e83Var.q3[i18] = !zArr[i18];
                            e83Var.D1(true);
                            return;
                        } else if (i18 == -2) {
                            h83Var.presentFragment(new DataAutoDownloadActivity(e83Var.g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof wgb) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h83Var.getParentActivity());
                    alertDialog$Builder2.a.S = k96.M0(2131745896, null);
                    alertDialog$Builder2.a.U = k96.M0(2131745897, null);
                    alertDialog$Builder2.j(k96.M0(2131745925, null), new a83(e83Var));
                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    h83Var.showDialog(hdVar2);
                    TextView textView3 = (TextView) hdVar2.c(-1);
                    if (textView3 != null) {
                        zkb.X(textView3, bkb.p7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                ((oh3) obj2).i((uf3) view, false);
                return;
            case 21:
                bl3 bl3Var = (bl3) obj2;
                if (view instanceof ee5) {
                    ee5 ee5Var = (ee5) view;
                    if (ee5Var.F) {
                        ji3 ji3Var = bl3Var.V;
                        if (ji3Var != null) {
                            ji3Var.a.e5(ee5Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                ji3 ji3Var2 = bl3Var.V;
                if (ji3Var2 != null) {
                    cj3 cj3Var = ji3Var2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (cj3Var.n2) {
                        if (cj3Var.D5(longValue2)) {
                            if (!cj3Var.K2.isEmpty()) {
                                cj3Var.k3(longValue2, cj3Var.y2(longValue2, null));
                                cj3Var.u5();
                                aVar = ((d) cj3Var).actionBar;
                                aVar.n(true);
                                return;
                            }
                            cj3Var.i3(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    if (cf3.D(longValue2)) {
                        bundle3.putLong("user_id", longValue2);
                    } else {
                        bundle3.putLong("chat_id", -longValue2);
                    }
                    cj3Var.d3();
                    if (gl.O1() && cj3Var.f0 != null) {
                        int i19 = 0;
                        while (true) {
                            bj3[] bj3VarArr = cj3Var.f0;
                            if (i19 < bj3VarArr.length) {
                                eh3 eh3Var = bj3VarArr[i19].d;
                                cj3Var.r2.a = longValue2;
                                eh3Var.s = longValue2;
                                i19++;
                            } else {
                                int i20 = na7.q5;
                                cj3Var.C5(512, true);
                            }
                        }
                    }
                    if (cj3Var.p2 != null) {
                        if (cj3Var.getMessagesController().A(bundle3, cj3Var, null, null)) {
                            cj3Var.getNotificationCenter().k(4, new Object[0]);
                            cj3Var.presentFragment(new mu1(bundle3));
                            return;
                        }
                        return;
                    } else if (cj3Var.getMessagesController().A(bundle3, cj3Var, null, null)) {
                        cj3Var.presentFragment(new mu1(bundle3));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                nv3 nv3Var = (nv3) obj2;
                ew3 ew3Var = nv3Var.r;
                Object E = nv3Var.c.E(i);
                if (E instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) E;
                    document = botInlineResult.document;
                } else if (E instanceof TLRPC.Document) {
                    document = (TLRPC.Document) E;
                } else {
                    return;
                }
                l8c l8cVar = ew3Var.y1;
                if (l8cVar != null) {
                    l8cVar.h(botInlineResult, document, Boolean.TRUE);
                }
                ew3Var.dismiss();
                return;
            case 23:
                tv3 tv3Var = (tv3) obj2;
                ew3 ew3Var2 = tv3Var.s;
                sv3 sv3Var = tv3Var.c;
                if (i >= 0) {
                    tv3Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList7 = sv3Var.s;
                        ArrayList arrayList8 = sv3Var.w;
                        if (i < arrayList7.size()) {
                            document2 = (TLRPC.Document) sv3Var.s.get(i);
                        }
                        if (document2 == ew3Var2.o1) {
                            r31 r31Var = ew3Var2.z1;
                            if (r31Var != null) {
                                r31Var.run();
                            }
                            ew3Var2.dismiss();
                            return;
                        }
                        if (i >= arrayList8.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList8.get(i)).longValue();
                        }
                        if (document2 == null && (view instanceof iv3) && (vlVar = ((iv3) view).d) != null) {
                            document2 = vlVar.e;
                        }
                        if (document2 == null && longValue != 0) {
                            document2 = vl.e(ew3Var2.a, longValue);
                        }
                        if (document2 != null) {
                            l8c l8cVar2 = ew3Var2.y1;
                            if (l8cVar2 != null) {
                                l8cVar2.h(sv3Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                            }
                            ew3Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                t14 t14Var = ((d04) obj2).G;
                int i21 = t14Var.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList9 = new ArrayList();
                    d dVar2 = t14Var.Z1;
                    ArrayList arrayList10 = hq6.d0(i21).t0[1];
                    while (i6 < arrayList10.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) arrayList10.get(i6);
                        if (stickerSetCovered4 != null && stickerSetCovered4.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered4.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList9.add(tL_inputStickerSetID);
                            if (stickerSetCovered3 != null && (stickerSet2 = stickerSetCovered3.set) != null && stickerSet2.id == stickerSetCovered4.set.id) {
                                i5 = i6;
                            }
                        }
                        i6++;
                    }
                    hq6.d0(i21).e1(true, true);
                    Context context2 = t14Var.getContext();
                    if (dVar2 == null) {
                        resourceProvider = t14Var.a2;
                    } else {
                        resourceProvider = dVar2.getResourceProvider();
                    }
                    qx3 qx3Var = new qx3(dVar2, context2, resourceProvider, arrayList9);
                    if (i5 >= 0) {
                        qx3Var.I1 = i5;
                    }
                    if (dVar2 != null) {
                        dVar2.showDialog(qx3Var);
                        return;
                    } else {
                        qx3Var.show();
                        return;
                    }
                }
                return;
            case 25:
                t14 t14Var2 = ((l14) obj2).w;
                t14Var2.u1.g(new d2c(t14Var2.getContext(), new oz3(t14Var2), t14Var2.y1, t14Var2.z1, t14Var2.A1, (TLRPC.StickerSetCovered) view.getTag(), t14Var2.a2));
                return;
            case 26:
                ((mc4) obj2).e0(i, view);
                return;
            case 27:
                pd4 pd4Var = (pd4) obj2;
                if (pd4Var.getParentActivity() != null && (gd4Var = (gd4) pd4Var.Q.get(i)) != null) {
                    View.OnClickListener onClickListener = gd4Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i22 = gd4Var.a;
                    if (i22 == 1) {
                        v6c v6cVar = (v6c) view;
                        pd4Var.A0(gd4Var, v6cVar.getName(), v6cVar.getCurrentObject(), gd4Var.g);
                        return;
                    } else if (i22 == 7) {
                        eu3 eu3Var = new eu3(pd4Var, gd4Var, (byte) 29);
                        if (pd4Var.c.x.f) {
                            pd4Var.x0(eu3Var, false);
                            return;
                        } else {
                            eu3Var.run();
                            return;
                        }
                    } else if (i22 == 8 || (i22 == 4 && gd4Var.k == 2131232035)) {
                        t97 t97Var = pd4Var.r;
                        pw0 pw0Var = pw0.APP_ERROR;
                        if (pd4Var.s && pd4Var.c.x.f) {
                            float f = -pd4Var.R;
                            pd4Var.R = f;
                            gl.A3(f, view, null);
                            pw0Var.a();
                            pd4Var.w = true;
                            je5 je5Var = pd4Var.S;
                            if ((je5Var == null || !je5Var.W) && (pd4Var.fragmentView instanceof FrameLayout)) {
                                je5 je5Var2 = new je5(pd4Var.getParentActivity(), 1);
                                je5Var2.p(true);
                                je5Var2.d = 2300L;
                                je5Var2.U = true;
                                je5Var2.e = true;
                                je5Var2.m(11.0f, 6.0f, 11.0f, 7.0f);
                                je5Var2.v0 = -gl.L(10.0f);
                                pd4Var.S = je5Var2;
                                je5Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                                je5Var2.k(pd4Var.getBaseSimpleGlass().c);
                                je5Var2.t(k96.M0(2131750763, null));
                                je5Var2.r0 = new hh(je5Var2, (byte) 2);
                                ((FrameLayout) pd4Var.fragmentView).addView(je5Var2, nme.e(-1, 150, 55));
                                je5Var2.x(pd4Var.c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(pd4Var.x) || !TextUtils.isEmpty(t97Var.b)) {
                            int i23 = pd4Var.E;
                            int i24 = na7.q5;
                            if ((i23 & (-1537)) == 0 && pd4Var.H.isEmpty() && !pd4Var.G.isEmpty()) {
                                pd4Var.x0(new sc4(pd4Var, (byte) 1), false);
                                return;
                            }
                        }
                        float f2 = -pd4Var.R;
                        pd4Var.R = f2;
                        gl.A3(f2, view, null);
                        pw0Var.a();
                        if (TextUtils.isEmpty(pd4Var.x) && TextUtils.isEmpty(t97Var.b)) {
                            b0 = u21.b0(pd4Var);
                            i3 = 2131750750;
                        } else {
                            int i25 = pd4Var.E;
                            int i26 = na7.q5;
                            if ((i25 & (-1537)) != 0) {
                                if (!pd4Var.H.isEmpty()) {
                                    b0 = u21.b0(pd4Var);
                                    i3 = 2131750747;
                                } else {
                                    b0 = u21.b0(pd4Var);
                                    i3 = 2131750748;
                                }
                            } else if (pd4Var.G.isEmpty()) {
                                b0 = u21.b0(pd4Var);
                                i3 = 2131750751;
                            } else {
                                b0 = u21.b0(pd4Var);
                                i3 = 2131750749;
                            }
                        }
                        yjb.x(null, i3, b0, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                cd4 cd4Var = (cd4) obj2;
                ArrayList arrayList11 = cd4Var.Z1;
                int i27 = i - 1;
                if (i27 >= 0 && i27 < arrayList11.size()) {
                    gd4 gd4Var2 = (gd4) arrayList11.get(i27);
                    int i28 = gd4Var2.a;
                    if (i28 == 7) {
                        cd4Var.dismiss();
                        cd4Var.r1.presentFragment(new mc4(cd4Var.T1, gd4Var2.m));
                        return;
                    } else if (i28 == 8) {
                        cd4Var.Y0();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
