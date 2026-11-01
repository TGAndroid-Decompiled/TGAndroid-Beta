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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.gw;
import org.telegram.messenger.hs;
import org.telegram.messenger.hw;
import org.telegram.messenger.i20;
import org.telegram.messenger.k1;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.qw;
import org.telegram.messenger.rz;
import org.telegram.messenger.sk;
import org.telegram.messenger.uz;
import org.telegram.messenger.video.o;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.messenger.y2;
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
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.i0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.voip.f0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.a40;
import org.telegram.ui.a70;
import org.telegram.ui.ao0;
import org.telegram.ui.d70;
import org.telegram.ui.gd1;
import org.telegram.ui.gx0;
import org.telegram.ui.hr0;
import org.telegram.ui.hx0;
import org.telegram.ui.jk0;
import org.telegram.ui.jl0;
import org.telegram.ui.jo0;
import org.telegram.ui.nf0;
import org.telegram.ui.of0;
import org.telegram.ui.oy;
import org.telegram.ui.s61;
import org.telegram.ui.sd1;
import org.telegram.ui.sn0;
import org.telegram.ui.un;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.wn0;
import org.telegram.ui.z;
import org.telegram.ui.zx;
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

    public f(int i10, kj kjVar) {
        this.f2783a = 24;
        this.f2784b = i10;
        this.f2785c = kjVar;
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
                ((un) obj).aa(i17);
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
                boolean z18 = ChatAttachAlertPhotoLayout.f23846q1;
                chatAttachAlertPhotoLayout.f30964b.R2.getActionBarMenuOnItemClick().b(i17);
                chatAttachAlertPhotoLayout.f23892x.U(null, null);
                return;
            case 7:
                ((a40) obj).f29859i1.x(i17, true);
                return;
            case 8:
                a40 a40Var = (a40) ((e1) obj).d;
                a40Var.J0(i17);
                a40Var.dismiss();
                return;
            case 9:
                ((n90) obj).R.g1(i17 + 8);
                return;
            case 10:
                jc0 jc0Var = (jc0) obj;
                if (jc0Var.e.getAdapter() instanceof ox) {
                    vy vyVar = ((ox) jc0Var.e.getAdapter()).f29241c;
                    if ((i17 != 1 && i17 != 2) || !vyVar.f32006w1) {
                        z10 = false;
                        if (i17 == 0 && vyVar.f32002v1) {
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
                EditTextBoldCursor editTextBoldCursor = h4Var.f26475j1;
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                h4Var.f26661k1.a(Integer.valueOf(i17), editTextBoldCursor.getText().toString());
                h4Var.dismiss();
                return;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i17, scrollSlidingTextTabStrip.f24166a.indexOfChild(view));
                return;
            case 13:
                final au0 au0Var = (au0) obj;
                vq0 vq0Var = au0Var.W;
                jt0 jt0Var = au0Var.T;
                p6 p6Var = au0Var.H1;
                long j11 = au0Var.l1;
                SparseArray[] sparseArrayArr = au0Var.f24502b1;
                org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
                if (i17 == 101) {
                    if (!au0.y0(au0Var.getSelectedTab()) && au0Var.getSelectedTab() != 13) {
                        if (au0Var.getSelectedTab() == 11) {
                            ArrayList arrayList = k2Var.getMessagesController().F1().f16121j;
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                long j12 = ((gw) arrayList.get(i18)).f15965a;
                                if (jt0Var.f27571x.contains(Long.valueOf(j12))) {
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
                                        if (i20.s(Z1)) {
                                            str = dd.L0(2131754252, null);
                                            z13 = z14;
                                        } else {
                                            str = i20.p(Z1);
                                            z13 = z14;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                            if (arrayList2.size() == 1) {
                                if (z13) {
                                    i13 = 2131752081;
                                } else {
                                    i13 = 2131752077;
                                }
                                G = dd.a0(null, null, i13, str);
                            } else {
                                G = dd.G(arrayList2.size(), "ClearHistoryTitleMultiple", new Object[0]);
                            }
                            x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = G;
                            if (arrayList2.size() == 1) {
                                if (z13) {
                                    i12 = 2131752082;
                                } else {
                                    i12 = 2131752083;
                                }
                                G2 = dd.a0(null, null, i12, str);
                            } else {
                                G2 = dd.G(arrayList2.size(), "ClearHistoryMessageMultiple", new Object[0]);
                            }
                            x1Var.T = G2;
                            alertDialog$Builder.k(dd.L0(2131746336, null), new u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i20) {
                                    int i21 = r3;
                                    ArrayList arrayList3 = arrayList2;
                                    au0 au0Var2 = au0Var;
                                    switch (i21) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = au0Var2.f24568x1;
                                            k2Var2.getMessagesController().O1().s(arrayList3, au0Var2.l1);
                                            cc.a0(k2Var2).Q(2131624050, 36, org.telegram.messenger.dd.G(arrayList3.size(), "StoriesDeleted", new Object[0])).j();
                                            au0Var2.U(false);
                                            return;
                                        default:
                                            au0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                                                au0Var2.f24568x1.getMessagesController().i0(((Long) arrayList3.get(i22)).longValue(), 0, null);
                                            }
                                            au0Var2.U(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.h(dd.L0(2131752589, null), null);
                            k2Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                a7.V(textView, t6.f21171q7, null);
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
                        s4.y(k2Var, user, L02, encryptedChat, null, au0Var.f24512e1, null, au0Var.f24502b1, null, 0, 0, null, new wp0(au0Var, 12), null, au0Var.H1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (au0Var.A0() && vq0Var != null && vq0Var.getCurrentList() != null) {
                            q4 currentList = vq0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i20 = 0; i20 < sparseArrayArr[0].size(); i20++) {
                                TL_stories.StoryItem storyItem = ((kj) sparseArrayArr[0].valueAt(i20)).f16694l;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                                if (arrayList3.size() > 1) {
                                    i11 = 2131751561;
                                } else {
                                    i11 = 2131751565;
                                }
                                String L04 = dd.L0(i11, null);
                                x1 x1Var2 = alertDialog$Builder2.f20135a;
                                x1Var2.R = L04;
                                x1Var2.T = dd.G(arrayList3.size(), "DeleteBotPreviewsSubtitle", new Object[0]);
                                alertDialog$Builder2.k(dd.L0(2131751599, null), new androidx.car.app.utils.a(au0Var, currentList, arrayList3, 26));
                                alertDialog$Builder2.h(dd.L0(2131752589, null), new au(25));
                                x1Var2.show();
                                x1Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList4 = new ArrayList();
                        for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                            TL_stories.StoryItem storyItem2 = ((kj) sparseArrayArr[0].valueAt(i21)).f16694l;
                            if (storyItem2 != null) {
                                arrayList4.add(storyItem2);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, au0Var.getContext(), p6Var);
                            if (arrayList4.size() > 1) {
                                i10 = 2131751490;
                            } else {
                                i10 = 2131751488;
                            }
                            String L05 = dd.L0(i10, null);
                            x1 x1Var3 = alertDialog$Builder3.f20135a;
                            x1Var3.R = L05;
                            x1Var3.T = dd.G(arrayList4.size(), "DeleteStoriesSubtitle", new Object[0]);
                            alertDialog$Builder3.k(dd.L0(2131751599, null), new u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i202) {
                                    int i212 = r3;
                                    ArrayList arrayList32 = arrayList4;
                                    au0 au0Var2 = au0Var;
                                    switch (i212) {
                                        case 0:
                                            org.telegram.ui.ActionBar.k2 k2Var2 = au0Var2.f24568x1;
                                            k2Var2.getMessagesController().O1().s(arrayList32, au0Var2.l1);
                                            cc.a0(k2Var2).Q(2131624050, 36, org.telegram.messenger.dd.G(arrayList32.size(), "StoriesDeleted", new Object[0])).j();
                                            au0Var2.U(false);
                                            return;
                                        default:
                                            au0Var2.getClass();
                                            for (int i22 = 0; i22 < arrayList32.size(); i22++) {
                                                au0Var2.f24568x1.getMessagesController().i0(((Long) arrayList32.get(i22)).longValue(), 0, null);
                                            }
                                            au0Var2.U(true);
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder3.h(dd.L0(2131752589, null), new au(26));
                            x1Var3.show();
                            x1Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i17 == 100) {
                    if (au0Var.f24519g1 != null) {
                        wp messagesController = k2Var.getMessagesController();
                        TLRPC.UserFull userFull = au0Var.f24519g1;
                        messagesController.getClass();
                        if (wp.I2(userFull)) {
                            q30 q30Var = au0Var.G1;
                            if (q30Var != null) {
                                q30Var.setText(dd.L0(2131750536, null));
                                au0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (au0Var.f24516f1 != null) {
                        TLRPC.Chat L06 = k2Var.getMessagesController().L0(Long.valueOf(au0Var.f24516f1.f19795id));
                        if (k2Var.getMessagesController().n2(L06)) {
                            q30 q30Var2 = au0Var.G1;
                            if (q30Var2 != null) {
                                if (w3.T(L06) && !L06.megagroup) {
                                    L0 = dd.L0(2131750538, null);
                                } else {
                                    L0 = dd.L0(2131750537, null);
                                }
                                q30Var2.setText(L0);
                                au0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (au0Var.t0()) {
                        q30 q30Var3 = au0Var.G1;
                        if (q30Var3 != null) {
                            q30Var3.setText(dd.L0(2131750539, "ForwardsRestrictedInfoBot"));
                            au0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    zx zxVar = new zx(bundle);
                    zxVar.C2 = new xp0(au0Var);
                    k2Var.presentFragment(zxVar);
                    return;
                } else if (i17 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        kj kjVar = (kj) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long B0 = kj.B0(kjVar.f16690k);
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
                        bundle2.putInt("message_id", kjVar.f1());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        un unVar = new un(bundle2);
                        unVar.f42011b8 = kjVar.f1();
                        long j13 = au0Var.F;
                        if (j13 != 0) {
                            gg.e.a(unVar, hs.a(B0, j13));
                            bundle2.putInt("message_id", kjVar.f1());
                        }
                        k2Var.presentFragment(unVar, false);
                        return;
                    }
                    return;
                } else if (i17 == 103 || i17 == 104) {
                    if (au0Var.getClosestTab() == 8) {
                        is0 is0Var = au0Var.f24511e0;
                        if (is0Var != null && is0Var.f32635s != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                                arrayList5.add(Integer.valueOf(((kj) sparseArrayArr[0].valueAt(i22)).f1()));
                            }
                            if (i17 != 103) {
                                z16 = false;
                            }
                            au0Var.b1(arrayList5, z16);
                            au0Var.U(false);
                            return;
                        }
                        return;
                    }
                    hw F1 = k2Var.getMessagesController().F1();
                    ArrayList arrayList6 = F1.f16121j;
                    ArrayList arrayList7 = new ArrayList();
                    for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                        long j14 = ((gw) arrayList6.get(i23)).f15965a;
                        if (jt0Var.f27571x.contains(Long.valueOf(j14))) {
                            arrayList7.add(Long.valueOf(j14));
                        }
                    }
                    if (i17 == 103) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!F1.n(arrayList7, z12, true)) {
                        k2Var.showDialog(new q0(33, k2Var.getCurrentAccount(), au0Var.getContext(), k2Var, null));
                    } else {
                        int i24 = 0;
                        while (true) {
                            ts0[] ts0VarArr = au0Var.m0;
                            if (i24 < ts0VarArr.length) {
                                ts0 ts0Var = ts0VarArr[i24];
                                if (ts0Var.E == 11) {
                                    ts0Var.f30723x.h1(0, 0);
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    au0Var.U(true);
                    return;
                } else {
                    return;
                }
            case 14:
                c61 c61Var = (c61) obj;
                int i25 = c61Var.f25036b.f24129i.f27048q;
                if (i25 == 2) {
                    if (((ApplicationLoaderImpl) w0.f18944a).q()) {
                        k1.e().b(false);
                    }
                    c61Var.updateAppUpdateViews(i17, true);
                    return;
                } else if (i25 == 3) {
                    if (((ApplicationLoaderImpl) w0.f18944a).q()) {
                        k1 e = k1.e();
                        if (e.f16544j) {
                            HttpGetFileTask httpGetFileTask = e.f16546l;
                            if (httpGetFileTask != null) {
                                httpGetFileTask.cancel(false);
                            }
                            e.f16544j = false;
                            at.e().k(293, new Object[0]);
                        }
                    }
                    c61Var.updateAppUpdateViews(i17, true);
                    return;
                } else {
                    File g10 = w0.f18944a.g();
                    if (g10 != null) {
                        org.telegram.messenger.i0.t2(g10, "Telegram.apk", "application/vnd.android.package-archive", c61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((f0) obj).f31474b.x(i17, true);
                return;
            case 16:
                sd1 sd1Var = (sd1) obj;
                if (sd1Var.U == null && view.getAlpha() != 0.0f) {
                    sd1Var.c(i17, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i17);
                return;
            case 18:
                oy oyVar = (oy) obj;
                if (oyVar.f40290n != null && i17 != oyVar.f40292s) {
                    b51 b51Var = oyVar.f40291r;
                    if (b51Var != null) {
                        b51Var.f24656z = i17;
                    }
                    oyVar.b(i17, true);
                    oyVar.f40290n.a(Integer.valueOf(i17));
                    return;
                }
                return;
            case 19:
                d70 d70Var = (d70) obj;
                d70Var.Q.dismiss();
                int i26 = d70Var.f36514c0;
                if (i26 >= 0) {
                    y2 y2Var = d70Var.f36515d0;
                    int[] iArr = y2Var.f19525c;
                    if (!y2Var.f19524b) {
                        y2Var.f19524b = true;
                        for (int i27 = 0; i27 < 4; i27++) {
                            iArr[i27] = uz.q().getInt(i0.a.i(i27, "keep_media_type_"), y2.b(i27));
                        }
                    }
                    iArr[i26] = i17;
                    uz.q().edit().putInt("keep_media_type_" + i26, i17).apply();
                    a70 a70Var = d70Var.f36516e0;
                    if (a70Var != null) {
                        a70Var.a(i17);
                        return;
                    }
                    return;
                }
                a70 a70Var2 = d70Var.f36516e0;
                if (a70Var2 != null) {
                    a70Var2.a(i17);
                    return;
                }
                return;
            case 20:
                of0 of0Var = (of0) obj;
                ValueAnimator valueAnimator = of0Var.f37789c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    gd1 gd1Var = of0Var.f37789c;
                    if (!gd1Var.H) {
                        if (gd1Var.getCurrentPosition() == i17) {
                            org.telegram.ui.ActionBar.k2 c02 = of0Var.c0();
                            if (c02 instanceof nf0) {
                                ((nf0) c02).w();
                                return;
                            }
                            return;
                        }
                        of0Var.s0(i17, true);
                        of0Var.f37789c.E(i17);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                jl0 jl0Var = (jl0) obj;
                jk0 jk0Var = jl0Var.D1;
                jl0Var.S0 = i17;
                if (i17 == 1) {
                    jl0Var.f38429i0 = jl0Var.f38425g0;
                } else if (i17 == 4) {
                    jl0Var.f38429i0 = jl0Var.f38427h0;
                } else if (i17 == 2) {
                    jl0Var.f38429i0 = jl0Var.f38420e0;
                } else if (i17 == 3) {
                    jl0Var.f38429i0 = jl0Var.f38423f0;
                } else {
                    jl0Var.f38429i0 = jl0Var.f38418d0;
                }
                qw qwVar = (qw) view.getTag();
                PhotoViewer.v1().N2(null, jl0Var, null);
                if (i17 == 1) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(jl0Var.f38432j1);
                    PhotoViewer.v1().f2(arrayList8, 0, jk0Var);
                    return;
                } else if (i17 == 2) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(jl0Var.l1);
                    PhotoViewer.v1().f2(arrayList9, 0, jk0Var);
                    return;
                } else if (i17 == 3) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(jl0Var.f38436m1);
                    PhotoViewer.v1().f2(arrayList10, 0, jk0Var);
                    return;
                } else if (i17 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList11 = jl0Var.f38430i1;
                    v12.f2(arrayList11, arrayList11.indexOf(qwVar), jk0Var);
                    return;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList12 = jl0Var.f38434k1;
                    v13.f2(arrayList12, arrayList12.indexOf(qwVar), jk0Var);
                    return;
                }
            case 22:
                wn0 wn0Var = (wn0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = wn0Var.I;
                if (k1Var != null && k1Var.isShowing()) {
                    wn0Var.I.d(true);
                }
                if (i17 == 0) {
                    s4.K(wn0Var.getParentActivity(), wn0Var.F.a(), new sn0(wn0Var, 2));
                    return;
                }
                wn0Var.a0(wn0Var.f43132b, wn0Var.f43133c, true, 0);
                wn0Var.finishFragment();
                return;
            case 23:
                jo0 jo0Var = (jo0) obj;
                org.telegram.ui.ActionBar.k1 k1Var2 = jo0Var.m0;
                if (k1Var2 != null && k1Var2.isShowing()) {
                    jo0Var.m0.d(true);
                }
                if (i17 == 0) {
                    s4.K(jo0Var.getParentActivity(), jo0Var.U.a(), new ao0(jo0Var, 1));
                    return;
                } else {
                    jo0Var.j0(0, true);
                    return;
                }
            case 24:
                kj kjVar2 = (kj) obj;
                int i28 = PopupNotificationActivity.f33684b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.i0.g3(new sk(rz.C(i17), kj.B0(kjVar2.f16690k), kjVar2.f1(), keyboardButtonProto.getData(), 10));
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i17 == 0) {
                    hx0 hx0Var = profileActivity.N;
                    if (!hx0Var.E1) {
                        if (au0.G0(hx0Var.getClosestTab())) {
                            hx0 hx0Var2 = profileActivity.N;
                            profileActivity.N.W0(profileActivity, profileActivity.a(), hx0Var2.s1(hx0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().T4()) {
                            profileActivity.showDialog(new i1((org.telegram.ui.ActionBar.k2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                            o8 D = o8.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f51697y = new gx0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (au0.G0(profileActivity.N.getClosestTab())) {
                    long a2 = profileActivity.a();
                    hx0 hx0Var3 = profileActivity.N;
                    int s12 = hx0Var3.s1(hx0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().O1().w(s12, a2);
                    o oVar = profileActivity.f33948x5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.f33948x5 = null;
                    }
                    wb.e();
                    ArrayList arrayList13 = new ArrayList();
                    SparseArray<kj> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i29 = 0; i29 < actionModeSelected.size(); i29++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected.valueAt(i29).f16694l;
                            if (storyItem3 != null) {
                                arrayList13.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.N.U(false);
                    if (!arrayList13.isEmpty()) {
                        z zVar = new z(profileActivity, a2, s12, arrayList13);
                        profileActivity.getMessagesController().O1().f0(s12, a2, arrayList13);
                        cc.a0(profileActivity).K(2131623979, org.telegram.messenger.i0.W2(dd.G(arrayList13.size(), "StoryRemovedFromAlbumTitle", w9)), dd.L0(2131743910, null), zVar).j();
                        return;
                    }
                    return;
                }
                long e7 = profileActivity.getUserConfig().e();
                o oVar2 = profileActivity.f33948x5;
                if (oVar2 != null) {
                    oVar2.run();
                    profileActivity.f33948x5 = null;
                }
                wb.e();
                if (profileActivity.N.getClosestTab() == 9) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ArrayList arrayList14 = new ArrayList();
                SparseArray<kj> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i14 = 0;
                    for (int i30 = 0; i30 < actionModeSelected2.size(); i30++) {
                        TL_stories.StoryItem storyItem4 = actionModeSelected2.valueAt(i30).f16694l;
                        if (storyItem4 != null) {
                            arrayList14.add(storyItem4);
                            i14++;
                        }
                    }
                } else {
                    i14 = 0;
                }
                profileActivity.N.U(false);
                if (z15) {
                    profileActivity.N.g1(8);
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
                    profileActivity.f33948x5 = new o(profileActivity, e7, arrayList14, z19);
                    org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(profileActivity, zArr3, arrayList14, zArr2, e7, 7);
                    if (z19) {
                        j10 = cc.a0(profileActivity).L(2131623989, dd.G(i14, "StorySavedTitle", new Object[0]), dd.L0(2131744510, null), dd.L0(2131743910, null), gVar).j();
                    } else {
                        j10 = cc.a0(profileActivity).J(2131623979, dd.G(i14, "StoryArchived", new Object[0]), dd.L0(2131743910, null), 5000, false, gVar).j();
                    }
                    j10.v = new hr0(16, profileActivity, zArr3);
                    return;
                }
                return;
            case 26:
                s61 s61Var = (s61) obj;
                s61Var.f41247h0.E(i17);
                s61Var.p0(i17, true);
                return;
            case 27:
                ra raVar = (ra) obj;
                EditText editText = raVar.f35159a;
                TextView[] textViewArr = raVar.N;
                TextView textView2 = textViewArr[i17];
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    String charSequence = textViewArr[i17].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    raVar.a();
                    raVar.a();
                    Runnable runnable = raVar.f35164r;
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
                ArrayList arrayList15 = g0Var.f45734n;
                if (i17 >= 0 && i17 < arrayList15.size()) {
                    g0Var.f45737w = true;
                    g0Var.h.a(i17, true);
                    int i32 = ((qh.o) arrayList15.get(i17)).d;
                    int L08 = rVar.L0();
                    if ((rVar.m(i32) == null && Math.abs(i32 - L08) > g0Var.f45735r * 9) || !uz.c()) {
                        g0Var.f45732c.C0();
                        wj0 wj0Var = g0Var.f45733f;
                        if (L08 < i32) {
                            i16 = 0;
                        }
                        wj0Var.f32267b = i16;
                        wj0Var.d(i32, 0, false, false);
                        return;
                    }
                    b0 b0Var = new b0(g0Var.getContext());
                    b0Var.f48056a = ((qh.o) arrayList15.get(i17)).d;
                    rVar.w0(b0Var);
                    return;
                }
                return;
            default:
                s0 s0Var = ((t0) obj).f47483b2;
                int i33 = s0.f47440w;
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
