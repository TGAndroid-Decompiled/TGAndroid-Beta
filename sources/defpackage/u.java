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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.p;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.ProfileActivity;
public final class u implements f59 {
    public final byte a;
    public final Object b;

    public u(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        gf4 gf4Var;
        qf4 qf4Var = (qf4) this.b;
        if (qf4Var.getParentActivity() != null && (gf4Var = (gf4) qf4Var.Q.get(i)) != null) {
            View.OnClickListener onClickListener = gf4Var.c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            int i2 = gf4Var.a;
            if (i2 == 1) {
                w8c w8cVar = (w8c) view;
                qf4Var.B0(gf4Var, w8cVar.getName(), w8cVar.getCurrentObject(), gf4Var.g);
            } else if (i2 == 7) {
                ve4 ve4Var = new ve4(qf4Var, gf4Var, (byte) 0);
                if (qf4Var.c.x.f) {
                    qf4Var.y0(ve4Var, false);
                } else {
                    ve4Var.run();
                }
            } else if (i2 == 8 || (i2 == 4 && gf4Var.k == 2131232036)) {
                ub7 ub7Var = qf4Var.r;
                boolean z = qf4Var.s;
                xx0 xx0Var = xx0.APP_ERROR;
                if (z && qf4Var.c.x.f) {
                    float f = -qf4Var.R;
                    qf4Var.R = f;
                    gm.A3(f, view, null);
                    xx0Var.a();
                    qf4Var.w = true;
                    hg5 hg5Var = qf4Var.S;
                    if ((hg5Var != null && hg5Var.W) || !(qf4Var.fragmentView instanceof FrameLayout)) {
                        return;
                    }
                    hg5 hg5Var2 = new hg5(qf4Var.getParentActivity(), 1);
                    hg5Var2.p(true);
                    hg5Var2.d = 2300L;
                    hg5Var2.U = true;
                    hg5Var2.e = true;
                    hg5Var2.m(11.0f, 6.0f, 11.0f, 7.0f);
                    hg5Var2.v0 = -gm.L(10.0f);
                    qf4Var.S = hg5Var2;
                    hg5Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                    hg5Var2.k(qf4Var.getBaseSimpleGlass().c);
                    hg5Var2.t(jb6.M0(2131750712, null));
                    hg5Var2.r0 = new hi(hg5Var2, (byte) 2);
                    ((FrameLayout) qf4Var.fragmentView).addView(hg5Var2, qoe.e(-1, 150, 55));
                    hg5Var2.x(qf4Var.c, true);
                    return;
                }
                if (!TextUtils.isEmpty(qf4Var.x) || !TextUtils.isEmpty(ub7Var.b)) {
                    int i3 = qf4Var.E;
                    int i4 = oc7.s5;
                    if ((i3 & (-1537)) == 0 && qf4Var.H.isEmpty() && !qf4Var.G.isEmpty()) {
                        qf4Var.y0(new se4(qf4Var, (byte) 1), false);
                        return;
                    }
                }
                float f2 = -qf4Var.R;
                qf4Var.R = f2;
                gm.A3(f2, view, null);
                xx0Var.a();
                if (TextUtils.isEmpty(qf4Var.x) && TextUtils.isEmpty(ub7Var.b)) {
                    mlb.y(null, 2131750699, c41.b0(qf4Var), null);
                    return;
                }
                int i5 = qf4Var.E;
                int i6 = oc7.s5;
                if ((i5 & (-1537)) != 0) {
                    if (!qf4Var.H.isEmpty()) {
                        mlb.y(null, 2131750696, c41.b0(qf4Var), null);
                    } else {
                        mlb.y(null, 2131750697, c41.b0(qf4Var), null);
                    }
                } else if (qf4Var.G.isEmpty()) {
                    mlb.y(null, 2131750700, c41.b0(qf4Var), null);
                } else {
                    mlb.y(null, 2131750698, c41.b0(qf4Var), null);
                }
            }
        }
    }

    @Override
    public final void g(int i, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.StickerSet stickerSet;
        hc0 hc0Var;
        TLRPC.Chat chat;
        String M0;
        String a0;
        zcb zcbVar;
        zy2 zy2Var;
        boolean[] zArr;
        a aVar;
        TLRPC.Document document;
        long longValue;
        vm vmVar;
        ylb resourceProvider;
        TLRPC.StickerSet stickerSet2;
        int i2 = 3;
        int i3 = 4;
        int i4 = -1;
        Object obj = null;
        TLRPC.Document document2 = null;
        TLRPC.BotInlineResult botInlineResult = null;
        r15 = null;
        r15 = null;
        wy2 O = null;
        obj = null;
        int i5 = 0;
        switch (this.a) {
            case 0:
                ((a1) this.b).O2.G(i - 1);
                return;
            case 1:
                ((e0) this.b).b2.G(i - 1);
                return;
            case 2:
                ((bc) this.b).H0(i);
                return;
            case 3:
                ad adVar = ((wc) this.b).s;
                wc wcVar = adVar.E;
                if (i >= 0) {
                    ArrayList arrayList = adVar.S;
                    if (i < arrayList.size() && ((xc) arrayList.get(i)).b != null) {
                        TL_agent.agentModel agentmodel = ((xc) arrayList.get(i)).b;
                        mc mcVar = adVar.y;
                        bka bkaVar = adVar.c;
                        if (bkaVar.I) {
                            TL_agent.settings settingsVar = mcVar.d;
                            int i6 = mcVar.a;
                            String str = adVar.F;
                            if (!TextUtils.isEmpty(str) && agentmodel != null && !TextUtils.isEmpty(agentmodel.id)) {
                                ArrayList e = mcVar.e(str);
                                for (int size = e.size() - 1; size >= 0; size--) {
                                    if (TextUtils.equals(((TL_agent.agentModel) e.get(size)).id, agentmodel.id)) {
                                        e.remove(size);
                                    }
                                }
                                e.add(0, agentmodel);
                                while (e.size() > 4) {
                                    td4.w(1, e);
                                }
                                int size2 = e.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj2 = e.get(i7);
                                    i7++;
                                    i3 += ((TL_agent.agentModel) obj2).getObjectSize();
                                }
                                SerializedData serializedData = new SerializedData(i3);
                                serializedData.writeInt32(e.size());
                                int size3 = e.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Object obj3 = e.get(i8);
                                    i8++;
                                    ((TL_agent.agentModel) obj3).serializeToStream(serializedData);
                                }
                                String f = Utilities.f(serializedData.toByteArray());
                                serializedData.cleanup();
                                oc7.r1(i6).X3.edit().putString("agentRecentModels_" + str, f).apply();
                            }
                            if (settingsVar == null || !TextUtils.equals(settingsVar.model, agentmodel.id)) {
                                adVar.M = agentmodel.id;
                                wcVar.c.f();
                                TL_agent.settings settingsVar2 = mcVar.d;
                                if (settingsVar2 != null) {
                                    settingsVar2.model = agentmodel.id;
                                    settingsVar2.model_name = agentmodel.name;
                                    settingsVar2.effort_supported = agentmodel.effort_supported;
                                    mcVar.i();
                                }
                                TL_agent.setModel setmodel = new TL_agent.setModel();
                                setmodel.model = agentmodel.id;
                                ConnectionsManager.getInstance(i6).sendRequestTyped(setmodel, new kc((byte) 0), new lc(mcVar, (byte) 5));
                            }
                            if (wcVar.a.isFocused()) {
                                gm.t1(wcVar.a);
                            }
                            bkaVar.a(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ct ctVar = (ct) this.b;
                if (i >= 0 && i < ctVar.h.size()) {
                    byte b = ((at) ctVar.h.get(i)).d;
                    if (b == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = ctVar.d;
                        boolean z = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z;
                        ((bjb) view).setChecked(z);
                        ctVar.c = true;
                        return;
                    } else if (b == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = ctVar.d;
                        boolean z2 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z2;
                        ((bjb) view).setChecked(z2);
                        ctVar.c = true;
                        return;
                    } else if (b == 7) {
                        if (!ctVar.getUserConfig().p() && !ctVar.getMessagesController().l4.L0.f && !ctVar.d.archive_and_mute_new_noncontact_peers) {
                            m31 m31Var = new m31(ctVar.getParentActivity(), ctVar.getResourceProvider());
                            m31Var.b.setText(gm.N2(jb6.M0(2131743553, null), cmb.wj, 0, new b1(ctVar, (byte) 20), null));
                            m31Var.b.setSingleLine(false);
                            m31Var.b.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
                            m31Var.a.setImageResource(2131232368);
                            u31.g(ctVar, m31Var, 3500).j();
                            int i9 = -ctVar.e;
                            ctVar.e = i9;
                            gm.A3(i9, view, null);
                            xx0.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = ctVar.d;
                        boolean z3 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z3;
                        ((bjb) view).setChecked(z3);
                        ctVar.c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                ht htVar = (ht) this.b;
                if (i >= htVar.y && i < htVar.E && htVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) htVar.h.get(i - htVar.y);
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
                    x2b x2bVar = new x2b(htVar.getParentActivity(), htVar, inputStickerSet, null, null, null);
                    x2bVar.W1 = new ft(htVar, view, stickerSetCovered);
                    htVar.showDialog(x2bVar);
                    return;
                }
                return;
            case 6:
                ((vn9) this.b).c0(i);
                return;
            case 7:
                ic0 ic0Var = (ic0) this.b;
                js jsVar = ic0Var.i3;
                mc0 mc0Var = ic0Var.k3;
                if (view instanceof jc0) {
                    jc0 jc0Var = (jc0) view;
                    if (!jc0Var.d) {
                        hc0 hc0Var2 = jc0Var.a;
                        ic0Var.h3 = hc0Var2.a;
                        mc0Var.a.b(hc0Var2, false);
                        if (jsVar != null) {
                            jsVar.f();
                        }
                        mc0Var.s0();
                        return;
                    }
                }
                if (ic0Var.h3 != 1 && (hc0Var = ic0Var.j3) != null) {
                    ic0Var.h3 = 1;
                    mc0Var.a.b(hc0Var, true);
                    if (jsVar != null) {
                        jsVar.f();
                    }
                    mc0Var.s0();
                    return;
                } else if (mc0Var.T == null) {
                    if (!mc0Var.a.w) {
                        mc0Var.l0(true, true, true);
                    }
                    hc0 hc0Var3 = mc0Var.a.h;
                    boolean[] zArr2 = {false};
                    gm.U2(mc0Var.getParentActivity(), mc0Var.getClassGuid());
                    yb0 yb0Var = new yb0(mc0Var, mc0Var.getParentActivity());
                    mc0Var.T = yb0Var;
                    yb0Var.J();
                    mc0Var.T.L0 = false;
                    mc0Var.h = true;
                    mc0Var.e.setBackground(new BitmapDrawable(mc0Var.getParentActivity().getResources(), gm.h2(12.0f, 10, mc0Var.fragmentView)));
                    mc0Var.h = false;
                    mc0Var.e.setVisibility(0);
                    mc0Var.e.setAlpha(0.0f);
                    mc0Var.f = true;
                    mc0Var.fragmentView.invalidate();
                    mc0Var.e.animate().setListener(new zb0(mc0Var, (byte) 0)).alpha(1.0f).setDuration(200L).start();
                    mc0Var.Z = new Object();
                    p pVar = new p(mc0Var.getParentActivity(), false, new xb0(mc0Var, (byte) 2));
                    hc0 hc0Var4 = mc0Var.a.h;
                    if (hc0Var4 != null) {
                        hc0 hc0Var5 = mc0Var.Z;
                        int i10 = hc0Var4.f;
                        hc0Var5.f = i10;
                        pVar.e(i10, 3);
                        hc0 hc0Var6 = mc0Var.Z;
                        int i11 = mc0Var.a.h.e;
                        hc0Var6.e = i11;
                        pVar.e(i11, 2);
                        hc0 hc0Var7 = mc0Var.Z;
                        int i12 = mc0Var.a.h.d;
                        hc0Var7.d = i12;
                        pVar.e(i12, 1);
                        hc0 hc0Var8 = mc0Var.Z;
                        int i13 = mc0Var.a.h.c;
                        hc0Var8.c = i13;
                        pVar.e(i13, 0);
                    }
                    hc0 hc0Var9 = mc0Var.Z;
                    if (hc0Var9.f != 0) {
                        i2 = 4;
                    } else if (hc0Var9.e == 0) {
                        if (hc0Var9.d != 0) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                    }
                    pVar.f(-1, 4, i2, false);
                    mc0Var.a.b(mc0Var.Z, true);
                    mc0Var.s0();
                    LinearLayout linearLayout = new LinearLayout(mc0Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, gm.L(8.0f), 0, 0);
                    linearLayout.addView(pVar);
                    FrameLayout frameLayout = new FrameLayout(mc0Var.getParentActivity());
                    frameLayout.setBackground(ulb.f(cmb.Ei, 8.0f));
                    TextView textView = new TextView(mc0Var.getParentActivity());
                    ts2.q(14.0f, 1, 2131745272, textView, null);
                    textView.setGravity(17);
                    textView.setTypeface(gm.o());
                    anb.X(textView, cmb.Ii, null);
                    frameLayout.addView(textView, qoe.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, qoe.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new t(mc0Var, zArr2, (byte) 22));
                    yb0 yb0Var2 = mc0Var.T;
                    yb0Var2.O = linearLayout;
                    yb0Var2.Q0 = true;
                    yb0Var2.p0 = false;
                    yb0Var2.show();
                    mc0Var.isLightStatusBar();
                    return;
                } else {
                    return;
                }
            case 8:
                gs0 gs0Var = (gs0) this.b;
                kea keaVar = gs0Var.a0;
                d dVar = keaVar.a;
                if (view instanceof sha) {
                    k47 messageObject = ((sha) view).getMessageObject();
                    if (keaVar.H.F1) {
                        if (keaVar.c(messageObject)) {
                            keaVar.g(messageObject);
                            return;
                        } else {
                            keaVar.e(messageObject);
                            return;
                        }
                    }
                    oab orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                    Context context = gs0Var.getContext();
                    int e1 = messageObject.e1();
                    t3b t3bVar = gs0Var.a;
                    q4b a = q4b.a(gs0Var.f);
                    if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                        i5 = gm.L(68.0f);
                    }
                    a.s += i5;
                    orCreateStoryViewer.G(context, e1, t3bVar, a);
                    return;
                }
                return;
            case 9:
                ti1 ti1Var = (ti1) this.b;
                ArrayList arrayList2 = ti1Var.c;
                smb smbVar = ti1Var.d;
                if (i >= 0 && i < arrayList2.size()) {
                    hf2 hf2Var = (hf2) arrayList2.get(i);
                    ti1Var.a(hf2Var.a(), true);
                    if (view.getLeft() < gm.L(24.0f) + smbVar.getPaddingLeft()) {
                        smbVar.x0(-((gm.L(48.0f) + smbVar.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (smbVar.getMeasuredWidth() - smbVar.getPaddingRight()) - gm.L(24.0f)) {
                        smbVar.x0(hg9.f(48.0f, smbVar.getMeasuredWidth() - smbVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    qac qacVar = ti1Var.r;
                    if (qacVar != null) {
                        qacVar.a(hf2Var.a());
                        return;
                    }
                    return;
                }
                return;
            case 10:
                a82 a82Var = (a82) this.b;
                x72 x72Var = a82Var.y;
                i22 i22Var = a82Var.b;
                y59 adapter = a82Var.s.getAdapter();
                y72 y72Var = a82Var.E;
                if (adapter == y72Var) {
                    ArrayList arrayList3 = y72Var.d;
                    int i14 = i - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        obj = arrayList3.get(i14);
                    }
                } else {
                    int S = x72Var.S(i);
                    int Q = x72Var.Q(i);
                    if (Q >= 0 && S >= 0) {
                        obj = x72Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (obj instanceof oz8) {
                    if (!z8c.h(i22Var.G3).p()) {
                        if (i22Var.Z1 != null) {
                            new kj8(i22Var.Z1, a82Var.getContext(), i22Var.G3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    oz8 oz8Var = (oz8) obj;
                    ik.X(i22Var.G3, i22Var.V0(), oz8Var.a(), new qy1(a82Var, oz8Var, (byte) 5));
                    return;
                }
                return;
            case 11:
                ib2 ib2Var = (ib2) this.b;
                boolean z4 = ib2Var.s;
                if (ib2Var.getParentActivity() != null) {
                    y59 adapter2 = ib2Var.b.getAdapter();
                    hb2 hb2Var = ib2Var.e;
                    if (adapter2 == hb2Var) {
                        chat = (TLRPC.Chat) hb2Var.d.get(i);
                    } else {
                        int i15 = ib2Var.H;
                        if (i >= i15 && i < ib2Var.I) {
                            chat = (TLRPC.Chat) ib2Var.w.get(i - i15);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z4 && ib2Var.h.linked_chat_id == 0) {
                            ib2Var.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.id);
                        ib2Var.presentFragment(new yv1(bundle));
                        return;
                    } else if (i == ib2Var.G) {
                        if (z4 && ib2Var.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ib2Var.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ib2Var.f;
                            if (chat2 != null) {
                                bundle2.putString("title", jb6.a0("GroupCreateDiscussionDefaultName", null, 2131749211, chat2.title));
                            }
                            uc5 uc5Var = new uc5(bundle2);
                            uc5Var.Z = new ab2(ib2Var);
                            ib2Var.presentFragment(uc5Var);
                            return;
                        } else if (!ib2Var.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ib2Var.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ib2Var.getParentActivity());
                            if (z4) {
                                M0 = jb6.M0(2131751308, null);
                                a0 = jb6.a0("DiscussionUnlinkChannelAlert", null, 2131751309, chat3.title);
                            } else {
                                M0 = jb6.M0(2131751310, null);
                                a0 = jb6.a0("DiscussionUnlinkGroupAlert", null, 2131751307, chat3.title);
                            }
                            alertDialog$Builder.a.S = M0;
                            alertDialog$Builder.a.U = gm.S2(a0);
                            alertDialog$Builder.j(jb6.M0(2131751311, null), new cd1(ib2Var, (byte) 24));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            he heVar = alertDialog$Builder.a;
                            ib2Var.showDialog(heVar);
                            TextView textView2 = (TextView) heVar.c(-1);
                            if (textView2 != null) {
                                anb.X(textView2, cmb.p7, null);
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
            case 12:
                zd2 zd2Var = (zd2) this.b;
                ArrayList arrayList4 = zd2Var.n;
                if (i > 2) {
                    vb0 vb0Var = (vb0) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList4.get(i - 3);
                    boolean contains = zd2Var.d.contains(tL_availableReaction.reaction);
                    boolean z5 = !contains;
                    ArrayList arrayList5 = zd2Var.d;
                    String str2 = tL_availableReaction.reaction;
                    if (!contains) {
                        arrayList5.add(str2);
                    } else {
                        arrayList5.remove(str2);
                        if (zd2Var.d.isEmpty()) {
                            yd2 yd2Var = zd2Var.h;
                            if (yd2Var != null) {
                                yd2Var.q(2, arrayList4.size() + 1);
                            }
                            zd2Var.a0(2, true);
                        }
                    }
                    Switch r0 = vb0Var.c;
                    if (r0 != null) {
                        r0.c(z5, true);
                    }
                    jh2 jh2Var = vb0Var.d;
                    if (jh2Var != null) {
                        jh2Var.a(z5, true);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                if2 if2Var = (if2) this.b;
                r59 r59Var = if2Var.v1;
                gf2 gf2Var = if2Var.q1;
                if (gf2Var.d.get(i) != if2Var.F1 && if2Var.K1 == null) {
                    if2Var.F1 = (hf2) gf2Var.d.get(i);
                    if2Var.M0();
                    gf2Var.E(i);
                    if2Var.b.postDelayed(new eg0(if2Var, i, (byte) 2), 100L);
                    while (i5 < r59Var.getChildCount()) {
                        bpb bpbVar = (bpb) r59Var.getChildAt(i5);
                        if (bpbVar != view && (zcbVar = bpbVar.K) != null) {
                            gm.r(zcbVar);
                            bpbVar.K.run();
                        }
                        i5++;
                    }
                    if (!((hf2) gf2Var.d.get(i)).a.a) {
                        ((bpb) view).d();
                    }
                    if2Var.U0(true);
                    return;
                }
                return;
            case 14:
                yg2 yg2Var = (yg2) this.b;
                c6c G = yg2Var.Z1.G(i - 1);
                if (G != null) {
                    t51 t51Var = yg2Var.U1;
                    if (!t51Var.h(G)) {
                        int i16 = G.d;
                        if (i16 == -1) {
                            yg2Var.a2 = true;
                            t51Var.h = true;
                            yg2Var.Z1.O(true);
                            yg2Var.Y0(true);
                            return;
                        }
                        int i17 = yg2.f2;
                        if (i16 == -2) {
                            yg2Var.a2 = false;
                            t51Var.h = false;
                            yg2Var.Z1.O(true);
                            yg2Var.Y0(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                qac qacVar2 = ((wl2) this.b).c;
                if (qacVar2 != null) {
                    qacVar2.a((sl2) sl2.a().get(i));
                    return;
                }
                return;
            case 16:
                co2 co2Var = (co2) this.b;
                int i18 = co2Var.S1.G(i - 1).d;
                if (i18 == 151) {
                    co2Var.Z0(false);
                    return;
                } else if (i18 == 150) {
                    co2Var.Z0(true);
                    return;
                } else {
                    return;
                }
            case 17:
                dx2 dx2Var = (dx2) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gx2) view).d;
                hx2 hx2Var = dx2Var.a;
                x53 reactionsWindow = hx2Var.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    c3b.c(null, hx2Var.c0, hx2Var.z.getContext(), new h92(dx2Var, (byte) 12));
                    return;
                }
                fx2 fx2Var = hx2Var.l;
                if (fx2Var != null) {
                    fx2Var.s(stickerSetCovered2.set, TextUtils.join("", hx2Var.o));
                }
                hx2Var.d();
                return;
            case 18:
                az2 az2Var = (az2) this.b;
                if (az2Var.f && az2Var.e) {
                    h42 h42Var = az2Var.d;
                    ArrayList arrayList6 = h42Var.e;
                    if (arrayList6 != null && i >= 0 && i < arrayList6.size()) {
                        O = (wy2) h42Var.e.get(i);
                    }
                } else {
                    int S2 = az2Var.c.S(i);
                    int Q2 = az2Var.c.Q(i);
                    if (Q2 >= 0 && S2 >= 0) {
                        O = az2Var.c.O(S2, Q2);
                    } else {
                        return;
                    }
                }
                if (i >= 0) {
                    az2Var.finishFragment();
                    if (O != null && (zy2Var = az2Var.r) != null) {
                        zy2Var.g(O);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                a23 a23Var = (a23) this.b;
                r59 r59Var2 = a23Var.n1;
                if (i > 3) {
                    a23Var.Y1 = (TLRPC.Peer) a23Var.T1.get(i - 4);
                    if (view instanceof xc5) {
                        ((xc5) view).c(true, true);
                    }
                    for (int i19 = 0; i19 < r59Var2.getChildCount(); i19++) {
                        View childAt = r59Var2.getChildAt(i19);
                        if (childAt != view && (childAt instanceof xc5)) {
                            ((xc5) childAt).c(false, true);
                        }
                    }
                    return;
                }
                return;
            case 20:
                q93 q93Var = (q93) this.b;
                ArrayList arrayList7 = q93Var.k3;
                t93 t93Var = q93Var.w3;
                if ((view instanceof j93) && i >= 0 && i < arrayList7.size()) {
                    l93 l93Var = (l93) arrayList7.get(i);
                    if (l93Var != null) {
                        int i20 = l93Var.h;
                        if (i20 >= 0) {
                            q93Var.q3[i20] = !zArr[i20];
                            q93Var.D1(true);
                            return;
                        } else if (i20 == -2) {
                            t93Var.presentFragment(new DataAutoDownloadActivity(q93Var.g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof xib) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t93Var.getParentActivity());
                    alertDialog$Builder2.a.S = jb6.M0(2131745822, null);
                    alertDialog$Builder2.a.U = jb6.M0(2131745823, null);
                    alertDialog$Builder2.j(jb6.M0(2131745851, null), new m93(q93Var));
                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                    he heVar2 = alertDialog$Builder2.a;
                    t93Var.showDialog(heVar2);
                    TextView textView3 = (TextView) heVar2.c(-1);
                    if (textView3 != null) {
                        anb.X(textView3, cmb.p7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                ((aj3) this.b).i((hh3) view, false);
                return;
            case 22:
                mm3 mm3Var = (mm3) this.b;
                if (view instanceof cg5) {
                    cg5 cg5Var = (cg5) view;
                    if (cg5Var.F) {
                        uj3 uj3Var = mm3Var.V;
                        if (uj3Var != null) {
                            uj3Var.a.i5(cg5Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                uj3 uj3Var2 = mm3Var.V;
                if (uj3Var2 != null) {
                    nk3 nk3Var = uj3Var2.a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (nk3Var.n2) {
                        if (nk3Var.H5(longValue2)) {
                            if (!nk3Var.K2.isEmpty()) {
                                nk3Var.m3(longValue2, nk3Var.A2(longValue2, null));
                                nk3Var.y5();
                                aVar = ((d) nk3Var).actionBar;
                                aVar.o(true);
                                return;
                            }
                            nk3Var.k3(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    if (pg3.D(longValue2)) {
                        bundle3.putLong("user_id", longValue2);
                    } else {
                        bundle3.putLong("chat_id", -longValue2);
                    }
                    nk3Var.f3();
                    if (gm.O1() && nk3Var.f0 != null) {
                        int i21 = 0;
                        while (true) {
                            mk3[] mk3VarArr = nk3Var.f0;
                            if (i21 < mk3VarArr.length) {
                                qi3 qi3Var = mk3VarArr[i21].d;
                                nk3Var.r2.a = longValue2;
                                qi3Var.s = longValue2;
                                i21++;
                            } else {
                                int i22 = oc7.s5;
                                nk3Var.G5(512, true);
                            }
                        }
                    }
                    if (nk3Var.p2 != null) {
                        if (nk3Var.getMessagesController().A(bundle3, nk3Var, null, null)) {
                            nk3Var.getNotificationCenter().k(4, new Object[0]);
                            nk3Var.presentFragment(new yv1(bundle3));
                            return;
                        }
                        return;
                    } else if (nk3Var.getMessagesController().A(bundle3, nk3Var, null, null)) {
                        nk3Var.presentFragment(new yv1(bundle3));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                yw3 yw3Var = (yw3) this.b;
                px3 px3Var = yw3Var.r;
                Object E = yw3Var.c.E(i);
                if (E instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) E;
                    document = botInlineResult.document;
                } else if (E instanceof TLRPC.Document) {
                    document = (TLRPC.Document) E;
                } else {
                    return;
                }
                mac macVar = px3Var.y1;
                if (macVar != null) {
                    macVar.h(botInlineResult, document, Boolean.TRUE);
                }
                px3Var.dismiss();
                return;
            case 24:
                ex3 ex3Var = (ex3) this.b;
                px3 px3Var2 = ex3Var.s;
                dx3 dx3Var = ex3Var.c;
                if (i >= 0) {
                    ex3Var.d.getClass();
                    if (RecyclerView.U(view).f != 4) {
                        ArrayList arrayList8 = dx3Var.s;
                        ArrayList arrayList9 = dx3Var.w;
                        if (i < arrayList8.size()) {
                            document2 = (TLRPC.Document) dx3Var.s.get(i);
                        }
                        if (document2 == px3Var2.o1) {
                            y41 y41Var = px3Var2.z1;
                            if (y41Var != null) {
                                y41Var.run();
                            }
                            px3Var2.dismiss();
                            return;
                        }
                        if (i >= arrayList9.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList9.get(i)).longValue();
                        }
                        if (document2 == null && (view instanceof tw3) && (vmVar = ((tw3) view).d) != null) {
                            document2 = vmVar.e;
                        }
                        if (document2 == null && longValue != 0) {
                            document2 = vm.e(px3Var2.a, longValue);
                        }
                        if (document2 != null) {
                            mac macVar2 = px3Var2.y1;
                            if (macVar2 != null) {
                                macVar2.h(dx3Var.f.get(Long.valueOf(document2.id)), document2, Boolean.FALSE);
                            }
                            px3Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
                e34 e34Var = ((o14) this.b).G;
                int i23 = e34Var.d1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered3 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList10 = new ArrayList();
                    d dVar2 = e34Var.Z1;
                    ArrayList arrayList11 = hs6.d0(i23).t0[1];
                    while (i5 < arrayList11.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) arrayList11.get(i5);
                        if (stickerSetCovered4 != null && stickerSetCovered4.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet3 = stickerSetCovered4.set;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            arrayList10.add(tL_inputStickerSetID);
                            if (stickerSetCovered3 != null && (stickerSet2 = stickerSetCovered3.set) != null && stickerSet2.id == stickerSetCovered4.set.id) {
                                i4 = i5;
                            }
                        }
                        i5++;
                    }
                    hs6.d0(i23).e1(true, true);
                    Context context2 = e34Var.getContext();
                    if (dVar2 == null) {
                        resourceProvider = e34Var.a2;
                    } else {
                        resourceProvider = dVar2.getResourceProvider();
                    }
                    az3 az3Var = new az3(dVar2, context2, resourceProvider, arrayList10);
                    if (i4 >= 0) {
                        az3Var.I1 = i4;
                    }
                    if (dVar2 != null) {
                        dVar2.showDialog(az3Var);
                        return;
                    } else {
                        az3Var.show();
                        return;
                    }
                }
                return;
            case 26:
                e34 e34Var2 = ((w24) this.b).w;
                e34Var2.u1.g(new d4c(e34Var2.getContext(), new y04(e34Var2), e34Var2.y1, e34Var2.z1, e34Var2.A1, (TLRPC.StickerSetCovered) view.getTag(), e34Var2.a2));
                return;
            case 27:
                ((me4) this.b).f0(i, view);
                return;
            case 28:
                a(i, view);
                return;
            default:
                cf4 cf4Var = (cf4) this.b;
                ArrayList arrayList12 = cf4Var.Z1;
                int i24 = i - 1;
                if (i24 >= 0 && i24 < arrayList12.size()) {
                    gf4 gf4Var = (gf4) arrayList12.get(i24);
                    int i25 = gf4Var.a;
                    if (i25 == 7) {
                        cf4Var.dismiss();
                        cf4Var.r1.presentFragment(new me4(cf4Var.T1, gf4Var.m));
                        return;
                    } else if (i25 == 8) {
                        cf4Var.Y0();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
