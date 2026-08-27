package ag;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gh.y3;
import hh.ea;
import hh.fa;
import hh.oa;
import hh.x9;
import java.util.ArrayList;
import java.util.HashSet;
import jh.b6;
import jh.b7;
import jh.i9;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.ib0;
import org.telegram.ui.ow;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import org.telegram.ui.ys0;
import org.telegram.ui.yw;

public final class p0 implements pk0 {

    public final int f591a;

    public final Object f592b;

    public p0(Object obj, int i10) {
        this.f591a = i10;
        this.f592b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        n41 n41VarG;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        k5 k5Var;
        Object objO;
        switch (this.f591a) {
            case 0:
                i1.W((i1) this.f592b, view);
                break;
            case 1:
                w1 w1Var = (w1) this.f592b;
                if (view != null) {
                    w1Var.w1(view, true);
                    w1Var.Z2 = false;
                    w1Var.v0(0, view.getTop() - ((w1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                }
                break;
            case 2:
                ((p90) this.f592b).h(view);
                break;
            case 3:
                ((fh.v) this.f592b).h(view);
                break;
            case 4:
                y3 y3Var = (y3) this.f592b;
                lh.d dVar = y3Var.X;
                HashSet hashSet = y3Var.V;
                b51 b51Var = y3Var.Z;
                if (b51Var != null && (n41VarG = b51Var.G(i10 - 1)) != null) {
                    Object obj = n41VarG.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i11 = savedStarGift.msg_id;
                        long j10 = i11 == 0 ? savedStarGift.saved_id : i11;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((gh.b2) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((gh.b2) view).b(true, true);
                        }
                        dVar.setEnabled(hashSet.size() > 0);
                        dVar.c(hashSet.size(), true);
                    }
                }
                break;
            case 5:
                oa.x0((oa) this.f592b, i10);
                break;
            case 6:
                x9.P((x9) this.f592b, i10);
                break;
            case 7:
                ea.P((ea) this.f592b, i10);
                break;
            case 8:
                fa.P((fa) this.f592b, i10);
                break;
            case 9:
                ((yw) this.f592b).i((jh.o) view, false);
                break;
            case 10:
                kh.r rVar = (kh.r) this.f592b;
                vq0 vq0Var = rVar.S;
                org.telegram.ui.ActionBar.n2 n2Var = vq0Var.f15229a;
                if (view instanceof o7) {
                    MessageObject messageObject = ((o7) view).getMessageObject();
                    if (!vq0Var.C.f29163y1) {
                        i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                        Context context = rVar.getContext();
                        int id2 = messageObject.getId();
                        b6 b6Var = rVar.f15214a;
                        b7 b7VarA = b7.a(rVar.f15218f);
                        b7VarA.f13125s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f36022o1) ? AndroidUtilities.dp(68.0f) : 0;
                        orCreateStoryViewer.C(context, id2, b6Var, b7VarA);
                    } else if (!vq0Var.c(messageObject)) {
                        vq0Var.e(messageObject);
                    } else {
                        vq0Var.g(messageObject);
                    }
                }
                break;
            case 11:
                Utilities.Callback callback = ((lh.z) this.f592b).f17136c;
                if (callback != null) {
                    callback.run((lh.u) lh.u.a().get(i10));
                }
                break;
            case 12:
                lh.u1 u1Var = (lh.u1) this.f592b;
                lh.l2 l2Var = u1Var.f16901r;
                Object objF = u1Var.f16897c.F(i10);
                if (objF instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) objF;
                    document = botInlineResult.document;
                } else if (objF instanceof TLRPC.Document) {
                    document = (TLRPC.Document) objF;
                    botInlineResult = null;
                }
                Utilities.Callback3Return callback3Return = l2Var.f16294y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                l2Var.dismiss();
                break;
            case 13:
                lh.z1 z1Var = (lh.z1) this.f592b;
                lh.l2 l2Var2 = z1Var.f17179s;
                lh.y1 y1Var = z1Var.f17174c;
                if (i10 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f5793f != 4) {
                        ArrayList arrayList = y1Var.f17075s;
                        ArrayList arrayList2 = y1Var.v;
                        TLRPC.Document documentF = i10 >= arrayList.size() ? null : (TLRPC.Document) y1Var.f17075s.get(i10);
                        if (documentF == l2Var2.f16287e) {
                            qf.i iVar = l2Var2.A;
                            if (iVar != null) {
                                iVar.run();
                            }
                            l2Var2.dismiss();
                            break;
                        } else {
                            long jLongValue = i10 >= arrayList2.size() ? 0L : ((Long) arrayList2.get(i10)).longValue();
                            if (documentF == null && (view instanceof lh.n1) && (k5Var = ((lh.n1) view).f16415c) != null) {
                                documentF = k5Var.f29956e;
                            }
                            if (documentF == null && jLongValue != 0) {
                                documentF = k5.f(((org.telegram.ui.ActionBar.e3) l2Var2).currentAccount, jLongValue);
                            }
                            if (documentF != null) {
                                Utilities.Callback3Return callback3Return2 = l2Var2.f16294y;
                                if (callback3Return2 != null) {
                                    callback3Return2.run(y1Var.f17072f.get(Long.valueOf(documentF.f22386id)), documentF, Boolean.FALSE);
                                }
                                l2Var2.dismiss();
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                va vaVar = (va) this.f592b;
                yf.i0 i0Var = (yf.i0) yf.i0.c().get(i10);
                vaVar.f15971h1.setTypeface(i0Var.f49948a);
                yf.r0 r0VarE = yf.r0.e(vaVar.B1);
                String str = i0Var.f49948a;
                r0VarE.f50061j = str;
                r0VarE.f50054a.edit().putString("typeface", str).apply();
                zf.j jVar = vaVar.F0;
                if (jVar instanceof zf.v2) {
                    ((zf.v2) jVar).setTypeface(i0Var);
                }
                vaVar.P0(false);
                break;
            case 15:
                mh.g.x0((mh.g) this.f592b, i10);
                break;
            case 16:
                b51 b51Var2 = ((mh.f) this.f592b).X;
                if (b51Var2 != null) {
                    b51Var2.G(i10 - 1);
                    break;
                }
                break;
            case 17:
                nh.k.A0((nh.k) this.f592b, i10);
                break;
            case 18:
                pf.z zVar = (pf.z) this.f592b;
                if (view instanceof k4) {
                    k4 k4Var = (k4) view;
                    if (k4Var.A) {
                        rx rxVar = zVar.Q;
                        if (rxVar != null) {
                            rxVar.f42355a.N4(k4Var.getDialogId(), view);
                        }
                    }
                }
                rx rxVar2 = zVar.Q;
                if (rxVar2 != null) {
                    gy gyVar = rxVar2.f42355a;
                    long jLongValue2 = ((Long) view.getTag()).longValue();
                    if (!gyVar.f38537h2) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            bundle.putLong("user_id", jLongValue2);
                        } else {
                            bundle.putLong("chat_id", -jLongValue2);
                        }
                        gyVar.J3();
                        if (AndroidUtilities.isTablet() && gyVar.f38498a0 != null) {
                            int i12 = 0;
                            while (true) {
                                fy[] fyVarArr = gyVar.f38498a0;
                                if (i12 < fyVarArr.length) {
                                    ow owVar = fyVarArr[i12].d;
                                    gyVar.f38556l2.dialogId = jLongValue2;
                                    owVar.f45858s = jLongValue2;
                                    i12++;
                                } else {
                                    gyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (gyVar.f38547j2 == null) {
                            if (gyVar.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                                gyVar.presentFragment(new rn(bundle));
                            }
                        } else if (gyVar.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                            gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            gyVar.presentFragment(new rn(bundle));
                        }
                        break;
                    } else if (gyVar.h5(jLongValue2)) {
                        if (!gyVar.E2.isEmpty()) {
                            gyVar.P3(jLongValue2, gyVar.i3(jLongValue2, null));
                            gyVar.a5();
                            ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.h(true);
                        } else {
                            gyVar.O3(jLongValue2, 0L, true, null);
                        }
                        break;
                    }
                }
                break;
            case 19:
                qf.e0 e0Var = (qf.e0) this.f592b;
                qf.b0 b0Var = e0Var.f46282x;
                gi giVar = e0Var.f34900b;
                f2.q0 adapter = e0Var.f46280s.getAdapter();
                qf.c0 c0Var = e0Var.f46283y;
                if (adapter == c0Var) {
                    ArrayList arrayList3 = c0Var.d;
                    int i13 = i10 - 1;
                    objO = (i13 < 0 || i13 >= arrayList3.size()) ? null : arrayList3.get(i13);
                } else {
                    int iS = b0Var.S(i10);
                    int iQ = b0Var.Q(i10);
                    if (iQ >= 0 && iS >= 0) {
                        objO = b0Var.O(iS, iQ);
                    }
                }
                if (objO instanceof qf.p1) {
                    if (UserConfig.getInstance(giVar.F1).isPremium()) {
                        qf.p1 p1Var = (qf.p1) objO;
                        y4.a0(giVar.F1, p1Var.a(), giVar.n1(), new ib0(18, e0Var, p1Var));
                    } else if (giVar.f28635b0 != null) {
                        new g2(giVar.f28635b0, e0Var.getContext(), giVar.F1, true, 31, false, null).show();
                    }
                }
                break;
            case 20:
                qf.g0 g0Var = (qf.g0) this.f592b;
                n41 n41VarG2 = g0Var.Z.G(i10 - 1);
                if (n41VarG2 != null) {
                    qf.x xVar = g0Var.V;
                    if (!xVar.h(n41VarG2)) {
                        int i14 = n41VarG2.d;
                        int i15 = qf.g0.f46303c0;
                        if (i14 != -1) {
                            int i16 = qf.g0.f46304d0;
                            if (i14 == -2) {
                                g0Var.f46305a0 = false;
                                xVar.h = false;
                                g0Var.Z.N(true);
                                g0Var.T(true);
                            }
                        } else {
                            g0Var.f46305a0 = true;
                            xVar.h = true;
                            g0Var.Z.N(true);
                            g0Var.T(true);
                        }
                        break;
                    }
                }
                break;
            case 21:
                qh.a aVar = (qh.a) this.f592b;
                int i17 = aVar.T.G(i10 - 1).d;
                if (i17 == 151) {
                    aVar.Q(false);
                } else if (i17 == 150) {
                    aVar.Q(true);
                }
                break;
            case 22:
                vf.i iVar2 = (vf.i) this.f592b;
                Runnable runnable = ((vf.a) iVar2.A.get(i10)).f48883c;
                if (runnable != null) {
                    runnable.run();
                    iVar2.c(false);
                }
                break;
            case 23:
                ys0 ys0Var = (ys0) this.f592b;
                yf.i0 i0Var2 = (yf.i0) yf.i0.c().get(i10);
                ys0Var.f50529q1.setTypeface(i0Var2.f49948a);
                yf.r0 r0VarE2 = yf.r0.e(ys0Var.L1);
                String str2 = i0Var2.f49948a;
                r0VarE2.f50061j = str2;
                r0VarE2.f50054a.edit().putString("typeface", str2).apply();
                zf.j jVar2 = ys0Var.O0;
                if (jVar2 instanceof zf.v2) {
                    ((zf.v2) jVar2).setTypeface(i0Var2);
                }
                ys0Var.z0(false);
                break;
            default:
                zf.i1 i1Var = (zf.i1) this.f592b;
                i1Var.X2.accept(Integer.valueOf(i1Var.W2.b(i10)));
                yf.r0 r0Var = i1Var.W2;
                r0Var.f50056c.put(Integer.valueOf(r0Var.f50058f), Integer.valueOf(r0Var.b(i10)));
                r0Var.f50057e = true;
                break;
        }
    }
}
