package bh;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bi.k2;
import java.io.File;
import java.util.ArrayList;
import kg.e1;
import kg.i1;
import kg.q0;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.cd;
import org.telegram.messenger.fw;
import org.telegram.messenger.gs;
import org.telegram.messenger.gw;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k1;
import org.telegram.messenger.o5;
import org.telegram.messenger.pw;
import org.telegram.messenger.qz;
import org.telegram.messenger.rk;
import org.telegram.messenger.tz;
import org.telegram.messenger.video.o;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.messenger.y2;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.voip.e0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.a70;
import org.telegram.ui.ay;
import org.telegram.ui.b40;
import org.telegram.ui.co0;
import org.telegram.ui.d70;
import org.telegram.ui.et0;
import org.telegram.ui.hx0;
import org.telegram.ui.id1;
import org.telegram.ui.ix0;
import org.telegram.ui.lk0;
import org.telegram.ui.ll0;
import org.telegram.ui.lo0;
import org.telegram.ui.of0;
import org.telegram.ui.pf0;
import org.telegram.ui.py;
import org.telegram.ui.u61;
import org.telegram.ui.ud1;
import org.telegram.ui.un;
import org.telegram.ui.un0;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yn0;
import org.telegram.ui.z;
import qh.g0;
import qh.q;
import rh.s0;
import rh.t0;
import s4.b0;
import s4.r;
import th.q4;
import vh.o8;
public final class f implements View.OnClickListener {
    public final int f2783a;
    public final int f2784b;
    public final Object f2785c;

    public f(int i10, jj jjVar) {
        this.f2783a = 24;
        this.f2784b = i10;
        this.f2785c = jjVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        String L0;
        int i10;
        int i11;
        TLRPC.Chat L02;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z13;
        String G;
        String G2;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        wb j10;
        int i15 = this.f2783a;
        boolean z16 = true;
        int i16 = 1;
        char c10 = 1;
        int i17 = this.f2784b;
        Object obj = this.f2785c;
        switch (i15) {
            case 0:
                View.OnClickListener onClickListener = ((h) obj).f2787b[i17];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                a aVar = ((k) obj).h;
                if (aVar != null) {
                    aVar.d(i17);
                    return;
                }
                return;
            case 2:
                ((k2) obj).P.b4(i17);
                return;
            case 3:
                ((un) obj).V9(i17);
                return;
            case 4:
                i0 i0Var = (i0) obj;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            i0Var.X1 = !i0Var.X1;
                        }
                    } else {
                        i0Var.W1 = !i0Var.W1;
                    }
                } else {
                    i0Var.V1 = !i0Var.V1;
                }
                i0Var.P1.O(true);
                i0Var.I0();
                return;
            case 5:
                boolean[] zArr = (boolean[]) obj;
                boolean z17 = !zArr[i17];
                zArr[i17] = z17;
                ((c2) view).c(z17, true);
                return;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z18 = ChatAttachAlertPhotoLayout.f23845q1;
                chatAttachAlertPhotoLayout.f30947b.R2.getActionBarMenuOnItemClick().b(i17);
                chatAttachAlertPhotoLayout.f23891x.U(null, null);
                return;
            case 7:
                ((b40) obj).f29803i1.x(i17, true);
                return;
            case 8:
                b40 b40Var = (b40) ((e1) obj).d;
                b40Var.J0(i17);
                b40Var.dismiss();
                return;
            case 9:
                ((n90) obj).R.f1(i17 + 8);
                return;
            case 10:
                jc0 jc0Var = (jc0) obj;
                if (jc0Var.e.getAdapter() instanceof ox) {
                    vy vyVar = ((ox) jc0Var.e.getAdapter()).f29204c;
                    if ((i17 != 1 && i17 != 2) || !vyVar.f31928w1) {
                        z10 = false;
                        if (i17 == 0 && vyVar.f31924v1) {
                            vyVar.Q(true, true, false);
                            return;
                        }
                    } else {
                        if (i17 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        vyVar.Q(true, false, z11);
                        return;
                    }
                } else {
                    z10 = false;
                }
                jc0Var.e.x(i17, z10);
                return;
            case 11:
                h4 h4Var = (h4) obj;
                EditTextBoldCursor editTextBoldCursor = h4Var.f26102j1;
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                h4Var.f26612k1.a(Integer.valueOf(i17), editTextBoldCursor.getText().toString());
                h4Var.dismiss();
                return;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i17, scrollSlidingTextTabStrip.f24165a.indexOfChild(view));
                return;
            case 13:
                final zt0 zt0Var = (zt0) obj;
                uq0 uq0Var = zt0Var.W;
                it0 it0Var = zt0Var.T;
                p6 p6Var = zt0Var.H1;
                long j11 = zt0Var.l1;
                SparseArray[] sparseArrayArr = zt0Var.f33174b1;
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
                if (i17 == 101) {
                    if (!zt0.x0(zt0Var.getSelectedTab()) && zt0Var.getSelectedTab() != 13) {
                        if (zt0Var.getSelectedTab() == 11) {
                            ArrayList arrayList = k2Var.getMessagesController().F1().f15772j;
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                long j12 = ((fw) arrayList.get(i18)).f15624a;
                                if (it0Var.f27083x.contains(Long.valueOf(j12))) {
                                    arrayList2.add(Long.valueOf(j12));
                                }
                            }
                            String str = "";
                            if (!arrayList2.isEmpty()) {
                                Long l4 = (Long) arrayList2.get(0);
                                long longValue = l4.longValue();
                                if (longValue == k2Var.getUserConfig().e()) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i19 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z13 = z14;
                                if (i19 < 0) {
                                    TLRPC.Chat L03 = k2Var.getMessagesController().L0(Long.valueOf(-longValue));
                                    z13 = z14;
                                    if (L03 != null) {
                                        str = L03.title;
                                        z13 = z14;
                                    }
                                } else if (i19 >= 0) {
                                    TLRPC.User Z1 = k2Var.getMessagesController().Z1(l4);
                                    z13 = z14;
                                    if (Z1 != null) {
                                        if (h20.s(Z1)) {
                                            str = cd.L0(2131754252, null);
                                            z13 = z14;
                                        } else {
                                            str = h20.p(Z1);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                            if (arrayList2.size() == 1) {
                                if (z13) {
                                    i13 = 2131752081;
                                } else {
                                    i13 = 2131752077;
                                }
                                G = cd.a0(null, null, i13, str);
                            } else {
                                G = cd.G(arrayList2.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = G;
                            if (arrayList2.size() == 1) {
                                if (z13) {
                                    i12 = 2131752082;
                                } else {
                                    i12 = 2131752083;
                                }
                                G2 = cd.a0(null, null, i12, str);
                            } else {
                                G2 = cd.G(arrayList2.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            x1Var.T = G2;
                            alertDialog$Builder.k(cd.L0(2131746336, null), new u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList3 = arrayList2;
                                    zt0 zt0Var2 = zt0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var2.f33240x1;
                                            k2Var2.getMessagesController().O1().s(arrayList3, zt0Var2.l1);
                                            cc.a0(k2Var2).Q(2131624050, 36, org.telegram.messenger.cd.G(arrayList3.size(), "StoriesDeleted", new Object[0])).j();
                                            zt0Var2.T(false);
                                            return;
                                        default:
                                            zt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                                                zt0Var2.f33240x1.getMessagesController().i0(((Long) arrayList3.get(i22)).longValue(), 0, null);
                                            }
                                            zt0Var2.T(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            k2Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                a7.V(textView, t6.f21170q7, null);
                                return;
                            }
                            return;
                        }
                        if (o5.C(j11)) {
                            encryptedChat = k2Var.getMessagesController().Z0(Integer.valueOf((int) (j11 & 4294967295L)));
                            user = null;
                            L02 = null;
                        } else if (o5.E(j11)) {
                            user = k2Var.getMessagesController().Z1(Long.valueOf(j11));
                            L02 = null;
                            encryptedChat = null;
                        } else {
                            L02 = k2Var.getMessagesController().L0(Long.valueOf(-j11));
                            user = null;
                            encryptedChat = null;
                        }
                        s4.y(k2Var, user, L02, encryptedChat, null, zt0Var.f33184e1, null, zt0Var.f33174b1, null, 0, 0, null, new vp0(zt0Var, 12), null, zt0Var.H1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (zt0Var.z0() && uq0Var != null && uq0Var.getCurrentList() != null) {
                            q4 currentList = uq0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((jj) sparseArrayArr[0].valueAt(i20)).f16341l;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                                if (arrayList3.size() > 1) {
                                    i11 = 2131751561;
                                } else {
                                    i11 = 2131751565;
                                }
                                String L04 = cd.L0(i11, null);
                                x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.R = L04;
                                x1Var2.T = cd.G(arrayList3.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(cd.L0(2131751599, null), new androidx.car.app.utils.a(zt0Var, currentList, arrayList3, 26));
                                alertDialog$Builder2.h(cd.L0(2131752589, null), new au(25));
                                x1Var2.show();
                                x1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList4 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((jj) sparseArrayArr[0].valueAt(i21)).f16341l;
                            if (storyItem2 != null) {
                                arrayList4.add(storyItem2);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, zt0Var.getContext(), p6Var);
                            if (arrayList4.size() > 1) {
                                i10 = 2131751490;
                            } else {
                                i10 = 2131751488;
                            }
                            String L05 = cd.L0(i10, null);
                            x1 x1Var3 = alertDialog$Builder3.f20134a;
                            x1Var3.R = L05;
                            x1Var3.T = cd.G(arrayList4.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(cd.L0(2131751599, null), new u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList32 = arrayList4;
                                    zt0 zt0Var2 = zt0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var2.f33240x1;
                                            k2Var2.getMessagesController().O1().s(arrayList32, zt0Var2.l1);
                                            cc.a0(k2Var2).Q(2131624050, 36, org.telegram.messenger.cd.G(arrayList32.size(), "StoriesDeleted", new Object[0])).j();
                                            zt0Var2.T(false);
                                            return;
                                        default:
                                            zt0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList32.size(); i22++) {
                                                zt0Var2.f33240x1.getMessagesController().i0(((Long) arrayList32.get(i22)).longValue(), 0, null);
                                            }
                                            zt0Var2.T(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(cd.L0(2131752589, null), new au(26));
                            x1Var3.show();
                            x1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i17 == 100) {
                    if (zt0Var.f33191g1 != null) {
                        vp messagesController = k2Var.getMessagesController();
                        TLRPC.UserFull userFull = zt0Var.f33191g1;
                        messagesController.getClass();
                        if (vp.I2(userFull)) {
                            q30 q30Var = zt0Var.G1;
                            if (q30Var != null) {
                                q30Var.setText(cd.L0(2131750536, null));
                                zt0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (zt0Var.f33188f1 != null) {
                        TLRPC.Chat L06 = k2Var.getMessagesController().L0(Long.valueOf(zt0Var.f33188f1.f19794id));
                        if (k2Var.getMessagesController().n2(L06)) {
                            q30 q30Var2 = zt0Var.G1;
                            if (q30Var2 != null) {
                                if (w3.T(L06) && !L06.megagroup) {
                                    L0 = cd.L0(2131750538, null);
                                } else {
                                    L0 = cd.L0(2131750537, null);
                                }
                                q30Var2.setText(L0);
                                zt0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (zt0Var.s0()) {
                        q30 q30Var3 = zt0Var.G1;
                        if (q30Var3 != null) {
                            q30Var3.setText(cd.L0(2131750539, "ForwardsRestrictedInfoBot"));
                            zt0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    ay ayVar = new ay(bundle);
                    ayVar.C2 = new wp0(zt0Var);
                    k2Var.presentFragment(ayVar);
                    return;
                } else if (i17 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        jj jjVar = (jj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = jj.B0(jjVar.f16337k);
                        if (o5.C(B0)) {
                            bundle2.putInt("enc_id", (int) (B0 & 4294967295L));
                        } else if (o5.E(B0)) {
                            bundle2.putLong("user_id", B0);
                        } else {
                            TLRPC.Chat L07 = k2Var.getMessagesController().L0(Long.valueOf(-B0));
                            if (L07 != null && L07.migrated_to != null) {
                                bundle2.putLong("migrated_to", B0);
                                B0 = -L07.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -B0);
                        }
                        bundle2.putInt("message_id", jjVar.f1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        un unVar = new un(bundle2);
                        unVar.f42200b8 = jjVar.f1();
                        long j13 = zt0Var.F;
                        if (j13 != 0) {
                            gg.e.a(unVar, gs.a(B0, j13));
                            bundle2.putInt("message_id", jjVar.f1());
                        }
                        k2Var.presentFragment(unVar, false);
                        return;
                    }
                    return;
                } else if (i17 == 103 || i17 == 104) {
                    if (zt0Var.getClosestTab() == 8) {
                        hs0 hs0Var = zt0Var.f33183e0;
                        if (hs0Var != null && hs0Var.f32251s != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList5.add(Integer.valueOf(((jj) sparseArrayArr[0].valueAt(i22)).f1()));
                            }
                            if (i17 != 103) {
                                z16 = false;
                            }
                            zt0Var.a1(arrayList5, z16);
                            zt0Var.T(false);
                            return;
                        }
                        return;
                    }
                    gw F1 = k2Var.getMessagesController().F1();
                    ArrayList arrayList6 = F1.f15772j;
                    ArrayList arrayList7 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                        long j14 = ((fw) arrayList6.get(i23)).f15624a;
                        if (it0Var.f27083x.contains(Long.valueOf(j14))) {
                            arrayList7.add(Long.valueOf(j14));
                        }
                    }
                    if (i17 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!F1.n(arrayList7, z12, true)) {
                        k2Var.showDialog(new q0(33, k2Var.getCurrentAccount(), zt0Var.getContext(), k2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            ss0[] ss0VarArr = zt0Var.m0;
                            if (i24 < ss0VarArr.length) {
                                ss0 ss0Var = ss0VarArr[i24];
                                if (ss0Var.E == 11) {
                                    ss0Var.f30356x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    zt0Var.T(true);
                    return;
                } else {
                    return;
                }
            case 14:
                b61 b61Var = (b61) obj;
                int i25 = b61Var.f24556b.f24128i.f26933q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) w0.f19024a).q()) {
                        k1.e().b(false);
                    }
                    b61Var.updateAppUpdateViews(i17, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) w0.f19024a).q()) {
                        k1 e = k1.e();
                        if (e.f16510j) {
                            HttpGetFileTask httpGetFileTask = e.f16512l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e.f16510j = false;
                            zs.e().k(293, new Object[0]);
                        }
                    }
                    b61Var.updateAppUpdateViews(i17, true);
                    return;
                } else {
                    File g10 = w0.f19024a.g();
                    if (g10 != null) {
                        org.telegram.messenger.i0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", b61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((e0) obj).f31396b.x(i17, true);
                return;
            case 16:
                ud1 ud1Var = (ud1) obj;
                if (ud1Var.U == null && view.getAlpha() != 0.0f) {
                    ud1Var.c(i17, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i17);
                return;
            case 18:
                py pyVar = (py) obj;
                if (pyVar.f40809n != null && i17 != pyVar.f40811s) {
                    a51 a51Var = pyVar.f40810r;
                    if (a51Var != null) {
                        a51Var.f24305z = i17;
                    }
                    pyVar.b(i17, true);
                    pyVar.f40809n.a(Integer.valueOf(i17));
                    return;
                }
                return;
            case 19:
                d70 d70Var = (d70) obj;
                d70Var.Q.dismiss();
                int i26 = d70Var.f36636c0;
                if (i26 >= 0) {
                    y2 y2Var = d70Var.f36637d0;
                    int[] iArr = y2Var.f19330c;
                    if (!y2Var.f19329b) {
                        y2Var.f19329b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = tz.q().getInt(i0.a.i(i27, "keep_media_type_"), y2.b(i27));
                        }
                    }
                    iArr[i26] = i17;
                    tz.q().edit().putInt("keep_media_type_" + i26, i17).apply();
                    a70 a70Var = d70Var.f36638e0;
                    if (a70Var != null) {
                        a70Var.a(i17);
                        return;
                    }
                    return;
                }
                a70 a70Var2 = d70Var.f36638e0;
                if (a70Var2 != null) {
                    a70Var2.a(i17);
                    return;
                }
                return;
            case 20:
                pf0 pf0Var = (pf0) obj;
                ValueAnimator valueAnimator = pf0Var.f38499c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    id1 id1Var = pf0Var.f38499c;
                    if (!id1Var.H) {
                        if (id1Var.getCurrentPosition() == i17) {
                            org.telegram.ui.ActionBar.k2 b02 = pf0Var.b0();
                            if (b02 instanceof of0) {
                                ((of0) b02).u();
                                return;
                            }
                            return;
                        }
                        pf0Var.r0(i17, true);
                        pf0Var.f38499c.E(i17);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ll0 ll0Var = (ll0) obj;
                lk0 lk0Var = ll0Var.D1;
                ll0Var.S0 = i17;
                if (i17 == 1) {
                    ll0Var.f39277i0 = ll0Var.f39273g0;
                } else if (i17 == 4) {
                    ll0Var.f39277i0 = ll0Var.f39275h0;
                } else if (i17 == 2) {
                    ll0Var.f39277i0 = ll0Var.f39268e0;
                } else if (i17 == 3) {
                    ll0Var.f39277i0 = ll0Var.f39271f0;
                } else {
                    ll0Var.f39277i0 = ll0Var.f39266d0;
                }
                pw pwVar = (pw) view.getTag();
                PhotoViewer.v1().N2(null, ll0Var, null);
                if (i17 == 1) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(ll0Var.f39280j1);
                    PhotoViewer.v1().f2(arrayList8, 0, lk0Var);
                    return;
                } else if (i17 == 2) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(ll0Var.l1);
                    PhotoViewer.v1().f2(arrayList9, 0, lk0Var);
                    return;
                } else if (i17 == 3) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(ll0Var.f39284m1);
                    PhotoViewer.v1().f2(arrayList10, 0, lk0Var);
                    return;
                } else if (i17 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList11 = ll0Var.f39278i1;
                    v12.f2(arrayList11, arrayList11.indexOf(pwVar), lk0Var);
                    return;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList12 = ll0Var.f39282k1;
                    v13.f2(arrayList12, arrayList12.indexOf(pwVar), lk0Var);
                    return;
                }
            case 22:
                yn0 yn0Var = (yn0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = yn0Var.I;
                if (k1Var != null && k1Var.isShowing()) {
                    yn0Var.I.d(true);
                }
                if (i17 == 0) {
                    s4.K(yn0Var.getParentActivity(), yn0Var.F.a(), new un0(yn0Var, 2));
                    return;
                }
                yn0Var.Z(yn0Var.f43865b, yn0Var.f43866c, true, 0);
                yn0Var.finishFragment();
                return;
            case 23:
                lo0 lo0Var = (lo0) obj;
                org.telegram.ui.ActionBar.k1 k1Var2 = lo0Var.m0;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    lo0Var.m0.d(true);
                }
                if (i17 == 0) {
                    s4.K(lo0Var.getParentActivity(), lo0Var.U.a(), new co0(lo0Var, 1));
                    return;
                } else {
                    lo0Var.i0(0, true);
                    return;
                }
            case 24:
                jj jjVar2 = (jj) obj;
                int i28 = PopupNotificationActivity.f33677b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.i0.g3(new rk(qz.C(i17), jj.B0(jjVar2.f16337k), jjVar2.f1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i17 == 0) {
                    ix0 ix0Var = profileActivity.N;
                    if (!ix0Var.E1) {
                        if (zt0.F0(ix0Var.getClosestTab())) {
                            ix0 ix0Var2 = profileActivity.N;
                            profileActivity.N.V0(profileActivity, profileActivity.a(), ix0Var2.r1(ix0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().T4()) {
                            profileActivity.showDialog(new i1((org.telegram.ui.ActionBar.k2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                            o8 D = o8.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f51682y = new hx0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (zt0.F0(profileActivity.N.getClosestTab())) {
                    long a2 = profileActivity.a();
                    ix0 ix0Var3 = profileActivity.N;
                    int r12 = ix0Var3.r1(ix0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().O1().w(r12, a2);
                    o oVar = profileActivity.f33941x5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.f33941x5 = null;
                    }
                    wb.e();
                    ArrayList arrayList13 = new ArrayList();
                    SparseArray<jj> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i29 = 0; i29 < actionModeSelected.size(); i29++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected.valueAt(i29).f16341l;
                            if (storyItem3 != null) {
                                arrayList13.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.N.T(false);
                    if (!arrayList13.isEmpty()) {
                        z zVar = new z(profileActivity, a2, r12, arrayList13);
                        profileActivity.getMessagesController().O1().f0(r12, a2, arrayList13);
                        cc.a0(profileActivity).K(2131623979, org.telegram.messenger.i0.W2(cd.G(arrayList13.size(), "StoryRemovedFromAlbumTitle", w9)), cd.L0(2131743910, null), zVar).j();
                        return;
                    }
                    return;
                }
                long e7 = profileActivity.getUserConfig().e();
                o oVar2 = profileActivity.f33941x5;
                if (oVar2 != null) {
                    oVar2.run();
                    profileActivity.f33941x5 = null;
                }
                wb.e();
                if (profileActivity.N.getClosestTab() == 9) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ArrayList arrayList14 = new ArrayList();
                SparseArray<jj> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i14 = 0;
                    for (int i30 = 0; i30 < actionModeSelected2.size(); i30++) {
                        TL_stories.StoryItem storyItem4 = actionModeSelected2.valueAt(i30).f16341l;
                        if (storyItem4 != null) {
                            arrayList14.add(storyItem4);
                            i14++;
                        }
                    }
                } else {
                    i14 = 0;
                }
                profileActivity.N.T(false);
                if (z15) {
                    profileActivity.N.f1(8);
                }
                if (!arrayList14.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList14.size()];
                    for (int i31 = 0; i31 < arrayList14.size(); i31++) {
                        TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList14.get(i31);
                        zArr2[i31] = storyItem5.pinned;
                        storyItem5.pinned = z15;
                    }
                    profileActivity.getMessagesController().O1().q0(e7, arrayList14, false);
                    boolean[] zArr3 = {false};
                    boolean z19 = z15;
                    profileActivity.f33941x5 = new o(profileActivity, e7, arrayList14, z19);
                    org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(profileActivity, zArr3, arrayList14, zArr2, e7, 7);
                    if (z19) {
                        j10 = cc.a0(profileActivity).L(2131623989, cd.G(i14, "StorySavedTitle", new Object[0]), cd.L0(2131744510, null), cd.L0(2131743910, null), gVar).j();
                    } else {
                        j10 = cc.a0(profileActivity).J(2131623979, cd.G(i14, "StoryArchived", new Object[0]), cd.L0(2131743910, null), 5000, false, gVar).j();
                    }
                    j10.v = new et0(15, profileActivity, zArr3);
                    return;
                }
                return;
            case 26:
                u61 u61Var = (u61) obj;
                u61Var.f42034h0.E(i17);
                u61Var.o0(i17, true);
                return;
            case 27:
                ra raVar = (ra) obj;
                EditText editText = raVar.f35154a;
                TextView[] textViewArr = raVar.N;
                TextView textView2 = textViewArr[i17];
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    String charSequence = textViewArr[i17].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    raVar.a();
                    raVar.a();
                    Runnable runnable = raVar.f35159r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                g0 g0Var = ((q) obj).h;
                r rVar = g0Var.d;
                ArrayList arrayList15 = g0Var.f45723n;
                if (i17 >= 0 && i17 < arrayList15.size()) {
                    g0Var.f45726w = true;
                    g0Var.h.a(i17, true);
                    int i32 = ((qh.o) arrayList15.get(i17)).d;
                    int L08 = rVar.L0();
                    if ((rVar.m(i32) == null && Math.abs(i32 - L08) > g0Var.f45724r * 9) || !tz.c()) {
                        g0Var.f45721c.C0();
                        vj0 vj0Var = g0Var.f45722f;
                        if (L08 < i32) {
                            i16 = 0;
                        }
                        vj0Var.f31273b = i16;
                        vj0Var.d(i32, 0, false, false);
                        return;
                    }
                    b0 b0Var = new b0(g0Var.getContext());
                    b0Var.f48045a = ((qh.o) arrayList15.get(i17)).d;
                    rVar.w0(b0Var);
                    return;
                }
                return;
            default:
                s0 s0Var = ((t0) obj).f47471b2;
                int i33 = s0.f47428w;
                s0Var.a(i17);
                return;
        }
    }

    public f(Object obj, int i10, int i11) {
        this.f2783a = i11;
        this.f2785c = obj;
        this.f2784b = i10;
    }
}
