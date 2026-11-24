package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z;
public final class rc1 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public rc1(q23 q23Var, Context context, hjb hjbVar) {
        this.a = (byte) 26;
        this.b = context;
        this.c = hjbVar;
    }

    @Override
    public final void onClick(View view) {
        int[] iArr;
        String G;
        u69 T;
        int b;
        int i;
        String G2;
        boolean z;
        View view2;
        FrameLayout frameLayout;
        int length;
        View view3;
        ef3 ef3Var;
        byte b2 = this.a;
        int i2 = 2;
        ?? r10 = 0;
        boolean z2 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                tc1 tc1Var = (tc1) obj2;
                z zVar = (z) obj;
                bu5 bu5Var = tc1Var.X0;
                if (bu5Var != null && bu5Var.E()) {
                    tc1Var.X0.u();
                    tc1Var.X0 = null;
                    return;
                }
                tc1Var.d1.f(true);
                bu5 G3 = bu5.G(zVar, new r63(), tc1Var.V0);
                tc1Var.X0 = G3;
                G3.s = (short) 0;
                G3.o(13, gm.L(200.0f), jb6.M0(2131743820, null));
                tc1Var.X0.j();
                for (int i3 : tc1Var.c1) {
                    if (i3 == 0) {
                        G = jb6.M0(2131743821, null);
                    } else if (i3 == Integer.MAX_VALUE) {
                        G = jb6.M0(2131743819, null);
                    } else {
                        G = jb6.G(i3, "Seconds", new Object[0]);
                    }
                    tc1Var.X0.b(0, G, new eh(tc1Var, i3, (byte) 10), false);
                    if (tc1Var.b1 == i3) {
                        tc1Var.X0.M();
                    }
                }
                tc1Var.X0.a0();
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((my0) obj2).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.S2(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 2:
                u00 u00Var = (u00) obj2;
                Runnable runnable = (Runnable) obj;
                bka bkaVar = (bka) u00Var.d;
                if (bkaVar.I) {
                    u00Var.w = runnable;
                    bkaVar.a(true);
                    return;
                }
                return;
            case 3:
                ik1 ik1Var = (ik1) obj2;
                xza xzaVar = (xza) obj;
                b61 b61Var = ik1Var.A0;
                if (view.isEnabled() && !b61Var.R) {
                    xj1 xj1Var = ik1Var.G0;
                    if (xj1Var == null || !xj1Var.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        oj1 oj1Var = new oj1(ik1Var, twoStepVerificationActivity, (byte) 0);
                        twoStepVerificationActivity.a0 = (byte) 1;
                        twoStepVerificationActivity.c0 = oj1Var;
                        b61Var.setLoading(true);
                        twoStepVerificationActivity.x0(new pj1(ik1Var, xzaVar, twoStepVerificationActivity, (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                l11.u((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 5:
                yv1 yv1Var = (yv1) obj2;
                hs6 mediaDataController = yv1Var.getMediaDataController();
                TLRPC.Document F0 = ((k47) obj).F0();
                if (F0 == null) {
                    mediaDataController.getClass();
                } else {
                    if (mediaDataController.A0.c(F0.id) == null) {
                        if (F0.size > oc7.r1(mediaDataController.currentAccount).l4.R0.f()) {
                            nm7.e().k(297, 4, jb6.a0("TooLargeError", null, 2131743728, new Object[0]), jb6.a0("ErrorRingtoneSizeTooBig", null, 2131751039, Integer.valueOf(oc7.r1(z8c.t0).l4.R0.f() / 1024)));
                        } else {
                            for (int i4 = 0; i4 < F0.attributes.size(); i4++) {
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i4);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > oc7.r1(mediaDataController.currentAccount).l4.S0.f()) {
                                    nm7.e().k(297, 4, jb6.a0("TooLongError", null, 2131743727, new Object[0]), jb6.a0("ErrorRingtoneDurationTooLong", null, 2131751041, Integer.valueOf(oc7.r1(z8c.t0).l4.S0.f())));
                                }
                            }
                            TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            saveringtone.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.file_reference = F0.file_reference;
                            tL_inputDocument.access_hash = F0.access_hash;
                            ConnectionsManager.getInstance(mediaDataController.currentAccount).sendRequest(saveringtone, new cx3(mediaDataController, F0, (byte) 25));
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    yv1Var.i6();
                    UndoView undoView = yv1Var.N3;
                    if (undoView != null) {
                        long j = yv1Var.l6;
                        int i5 = UndoView.j0;
                        undoView.j(83, j, new iy(yv1Var, (byte) 1));
                    }
                }
                yv1Var.N5(true);
                return;
            case 6:
                ((yv1) obj2).K9((String) obj);
                return;
            case 7:
                ((yv1) obj2).L9((bu5) obj);
                return;
            case 8:
                oh2 oh2Var = (oh2) obj2;
                boolean z3 = !oh2Var.b();
                oh2Var.c(z3, true);
                ((AtomicBoolean) obj).set(z3);
                return;
            case 9:
                ((yv1) obj2).Q8((Context) obj);
                return;
            case 10:
                ((n52) obj2).W((ylb) obj);
                return;
            case 11:
                v72 v72Var = (v72) ((s30) obj2).e;
                smb smbVar = v72Var.s;
                View F = smbVar.F((t72) obj);
                if (F == null) {
                    T = null;
                } else {
                    T = smbVar.T(F);
                }
                if (T != null && (b = T.b() - v72Var.u0) >= 0 && b < v72Var.L.length) {
                    v72Var.e0(b);
                    return;
                }
                return;
            case 12:
                z82 z82Var = (z82) obj2;
                ylb ylbVar = (ylb) obj;
                yv1 yv1Var2 = z82Var.H;
                if (z82Var.U) {
                    yv1Var2.showDialog(ik.S(z82Var.getContext(), yv1Var2.h, ylbVar).a);
                    return;
                }
                v82 v82Var = z82Var.e;
                if (yv1Var2.getParentActivity() != null) {
                    TLRPC.Chat chat = yv1Var2.e;
                    if (chat != null && !sd2.y(13, chat)) {
                        if (z82Var.a.f && yv1Var2.getParentActivity() != null && yv1Var2.fragmentView != null && yv1Var2.r8 != null) {
                            if (yv1Var2.D2 == null) {
                                hg5 x4 = yv1Var2.x4(310.0f, 1, -1, false);
                                yv1Var2.D2 = x4;
                                x4.d = 4000L;
                            }
                            int i6 = yv1Var2.r8.ttl_period;
                            if (i6 > 86400) {
                                G2 = jb6.G(i6 / 86400, "Days", new Object[0]);
                            } else if (i6 >= 3600) {
                                G2 = jb6.G(i6 / 3600, "Hours", new Object[0]);
                            } else if (i6 >= 60) {
                                G2 = jb6.G(i6 / 60, "Minutes", new Object[0]);
                            } else {
                                G2 = jb6.G(i6, "Seconds", new Object[0]);
                            }
                            yv1Var2.D2.t(jb6.a0("AutoDeleteSetInfo", null, 2131753809, G2));
                            yv1Var2.D2.x(yv1Var2.p1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = yv1Var2.r8;
                    TLRPC.UserFull userFull = yv1Var2.s8;
                    if (userFull != null) {
                        i = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i = chatFull.ttl_period;
                    } else {
                        i = 0;
                    }
                    trc trcVar = new trc(z82Var.getContext(), null, new w82(z82Var, r4), true, 0, z82Var.e0);
                    trcVar.B(i);
                    x82 x82Var = new x82(z82Var, (ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b);
                    m8[] m8VarArr = {x82Var};
                    x82Var.e = true;
                    x82Var.c = (short) 220;
                    x82Var.setOutsideTouchable(true);
                    m8VarArr[0].setClippingEnabled(true);
                    m8VarArr[0].setAnimationStyle(2131755192);
                    m8VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) trcVar.b).measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
                    m8VarArr[0].setInputMethodMode(2);
                    m8VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m8VarArr[0].showAtLocation(v82Var, 0, (int) (z82Var.getX() + v82Var.getX()), (int) v82Var.getY());
                    yv1Var2.y6(false, true, 0.2f);
                    return;
                }
                return;
            case 13:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                c92 c92Var = ((d92) obj2).w;
                if (c92Var != null) {
                    ap0 ap0Var = ((so0) c92Var).a;
                    ap0Var.X1.remove(chat2);
                    ap0Var.f1(true, true);
                    return;
                }
                return;
            case 14:
                ba2 ba2Var = (ba2) obj2;
                Context context = (Context) obj;
                k6d k6dVar = new k6d(context, (ylb) null);
                Object obj3 = k6dVar.b;
                ((my0) obj3).v0 = false;
                LinearLayout i7 = hg9.i(context, 1);
                jf5 jf5Var = new jf5(context, cmb.m5, 23, 15, false, null);
                jf5Var.setHeight(47);
                jf5Var.setText(jb6.M0(2131752170, "ChatHistory"));
                i7.addView(jf5Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                i7.addView(linearLayout, qoe.o(-1, -2));
                v09[] v09VarArr = new v09[2];
                int i8 = 0;
                while (i8 < i2) {
                    v09 v09Var = new v09(context, true);
                    v09VarArr[i8] = v09Var;
                    v09Var.setTag(Integer.valueOf(i8));
                    anb.R(v09VarArr[i8], cmb.L0(false), r10, anb.M(cmb.h6), r10);
                    if (i8 == 0) {
                        v09VarArr[i8].b(jb6.M0(2131752165, "ChatHistoryVisible"), jb6.M0(2131752164, "ChatHistoryVisibleInfo"), true, !ba2Var.K0);
                    } else if (sd2.T(ba2Var.x0)) {
                        v09VarArr[i8].b(jb6.M0(2131752169, "ChatHistoryHidden"), jb6.M0(2131752168, "ChatHistoryHiddenInfo"), false, ba2Var.K0);
                    } else {
                        v09VarArr[i8].b(jb6.M0(2131752169, "ChatHistoryHidden"), jb6.M0(2131752167, "ChatHistoryHiddenInfo2"), false, ba2Var.K0);
                    }
                    linearLayout.addView(v09VarArr[i8], qoe.o(-1, -2));
                    v09VarArr[i8].setOnClickListener(new b0(ba2Var, v09VarArr, k6dVar, (byte) 22));
                    i8++;
                    i2 = 2;
                    r10 = 0;
                }
                my0 my0Var = (my0) obj3;
                my0Var.O = i7;
                ba2Var.showDialog(my0Var);
                return;
            case 15:
                ((ba2) obj2).h0((FrameLayout) obj, view);
                return;
            case 16:
                TLRPC.Document document = (TLRPC.Document) obj;
                ta2 ta2Var = ((ua2) obj2).d;
                if (ta2Var != null) {
                    ta2Var.b(document);
                    return;
                }
                return;
            case 17:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                ta2 ta2Var2 = ((a51) obj2).d;
                if (ta2Var2 != null) {
                    ta2Var2.b(document2);
                    return;
                }
                return;
            case 18:
                ((ke2) obj2).h0((k6d) obj, view);
                return;
            case 19:
                if2 if2Var = (if2) obj2;
                yv1 yv1Var3 = (yv1) obj;
                if (if2Var.p1 != null) {
                    if2Var.p1 = null;
                    if2Var.dismiss();
                    uf2.e(if2Var.a).a(yv1Var3.a(), true, false);
                    return;
                }
                if2Var.dismiss();
                return;
            case 20:
                yg2 yg2Var = (yg2) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                t51 t51Var = yg2Var.U1;
                b61 b61Var2 = yg2Var.Y1;
                if (!b61Var2.R) {
                    b61Var2.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = oc7.r1(yg2Var.a).n1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = t51Var.b();
                    ConnectionsManager.getInstance(yg2Var.a).sendRequest(updateconnectedbot, new eo0(yg2Var, tL_connectedBot, t51Var.c(), (byte) 19));
                    return;
                }
                return;
            case 21:
                ln2 ln2Var = (ln2) obj2;
                Context context2 = (Context) obj;
                ry ryVar = ln2Var.r1;
                switch (ryVar.a) {
                    case 5:
                        z = ryVar.b;
                        break;
                    default:
                        z = ryVar.b;
                        break;
                }
                if (!z) {
                    ry ryVar2 = ln2Var.r1;
                    switch (ryVar2.a) {
                        case 5:
                            view2 = (sa8) ryVar2.d;
                            break;
                        default:
                            view2 = (z8b) ryVar2.d;
                            break;
                    }
                    Bitmap H3 = gm.H3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(H3.getWidth(), H3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    ry ryVar3 = ln2Var.r1;
                    switch (ryVar3.a) {
                        case 5:
                            ly5 ly5Var = ((sa8) ryVar3.d).M0;
                            Matrix matrix = ly5Var.getMatrix();
                            canvas.save();
                            canvas.translate(ly5Var.getX(), ly5Var.getY());
                            canvas.concat(matrix);
                            Bitmap bitmap = (Bitmap) ryVar3.c;
                            canvas.scale(ly5Var.getWidth() / bitmap.getWidth(), ly5Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(H3, 0.0f, 0.0f, (Paint) null);
                            H3.recycle();
                            bn2 bn2Var = new bn2(ln2Var, context2, createBitmap);
                            ry ryVar4 = ln2Var.r1;
                            switch (ryVar4.a) {
                                case 5:
                                    frameLayout = ((sa8) ryVar4.d).U0;
                                    break;
                                default:
                                    frameLayout = ((z8b) ryVar4.d).L0;
                                    break;
                            }
                            frameLayout.addView(bn2Var, qoe.c(-1.0f, -1));
                            ry ryVar5 = ln2Var.r1;
                            Objects.requireNonNull(ryVar5);
                            bn2Var.setColorListener(new gx(ryVar5, (byte) 7));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(d53.f);
                            duration.addUpdateListener(new fx7(bn2Var, (byte) 10));
                            duration.start();
                            ry ryVar6 = ln2Var.r1;
                            switch (ryVar6.a) {
                                case 5:
                                    ryVar6.b = true;
                                    break;
                                default:
                                    ryVar6.b = true;
                                    break;
                            }
                            ln2Var.dismiss();
                            return;
                        default:
                            sv7 sv7Var = ((z8b) ryVar3.d).E0;
                            Matrix matrix2 = sv7Var.getMatrix();
                            canvas.save();
                            canvas.translate(sv7Var.getX(), sv7Var.getY());
                            canvas.concat(matrix2);
                            sv7Var.getWidth();
                            throw null;
                    }
                }
                return;
            case 22:
                ((Runnable) obj).run();
                ((qo2) obj2).dismiss();
                return;
            case 23:
                tu2 tu2Var = (tu2) obj2;
                tu2Var.showDialog((my0) ik.l(tu2Var.getParentActivity(), jb6.a0(null, null, 2131743363, m9c.l((TLRPC.User) obj)), jb6.M0(2131743364, null), null, new mf2(tu2Var, (byte) 27), null, false, false, tu2Var.r).b);
                return;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                hx2 hx2Var = ((dx2) obj2).a;
                if (hx2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList.get(intValue)).intValue() == 0) {
                        fx2 fx2Var = hx2Var.l;
                        Object obj4 = hx2Var.W;
                        if (obj4 == null) {
                            obj4 = hx2Var.Z;
                        }
                        fx2Var.u(obj4, hx2Var.b0, true, 0, 0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                        fx2 fx2Var2 = hx2Var.l;
                        Object obj5 = hx2Var.W;
                        if (obj5 == null) {
                            obj5 = hx2Var.Z;
                        }
                        fx2Var2.u(obj5, hx2Var.b0, false, 0, 0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                        hs6 d0 = hs6.d0(hx2Var.r);
                        TLRPC.Document document3 = hx2Var.W;
                        int size = d0.j0.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size) {
                                if (((TLRPC.Document) d0.j0.get(i9)).id == document3.id) {
                                    d0.j0.remove(i9);
                                } else {
                                    i9++;
                                }
                            }
                        }
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveGif.id = tL_inputDocument2;
                        tL_inputDocument2.id = document3.id;
                        tL_inputDocument2.access_hash = document3.access_hash;
                        byte[] bArr = document3.file_reference;
                        tL_inputDocument2.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveGif.unsave = true;
                        d0.getConnectionsManager().sendRequest(tL_messages_saveGif, new cx3(d0, tL_messages_saveGif, (byte) 24));
                        d0.getMessagesStorage().a.c(new cp6(d0, document3, (byte) 1));
                        hx2Var.l.O();
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                        hs6.d0(hx2Var.r).c(hx2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                        oc7.r1(hx2Var.r).y4("gif", hx2Var.W);
                        hx2Var.l.O();
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                        TLRPC.Document document4 = hx2Var.W;
                        TLRPC.BotInlineResult botInlineResult = hx2Var.Z;
                        Object obj6 = hx2Var.b0;
                        fx2 fx2Var3 = hx2Var.l;
                        ik.J(hx2Var.w, fx2Var3.a(), new lu(fx2Var3, document4, botInlineResult, obj6, (byte) 7), hx2Var.c0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 11) {
                        fx2 fx2Var4 = hx2Var.l;
                        Object obj7 = hx2Var.W;
                        if (obj7 == null) {
                            obj7 = hx2Var.Z;
                        }
                        fx2Var4.K(obj7, hx2Var.b0);
                    }
                    hx2Var.d();
                    return;
                }
                return;
            case 25:
                r23 r23Var = (r23) obj2;
                r23Var.U1 = oc7.r1(r23Var.a).i1(k47.B1((TLRPC.Peer) obj));
                r23Var.dismiss();
                return;
            case 26:
                Context context3 = (Context) obj2;
                gm.g(((hjb) obj).a.getText().toString());
                if (gm.C3()) {
                    Toast.makeText(context3, jb6.M0(2131743879, null), 0).show();
                    return;
                }
                return;
            case 27:
                d63 d63Var = (d63) obj2;
                String str = (String) obj;
                if (d63Var.b == null && (view3 = d63Var.d) != null) {
                    View findFocus = view3.findFocus();
                    if (findFocus instanceof EditText) {
                        d63Var.b = (EditText) findFocus;
                    }
                }
                if (d63Var.b != null) {
                    try {
                        d63Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = d63Var.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = d63Var.b.getText();
                    if (d63Var.b.getSelectionEnd() == d63Var.b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + d63Var.b.getSelectionStart();
                    }
                    if (d63Var.b.getSelectionStart() != -1 && d63Var.b.getSelectionEnd() != -1) {
                        EditText editText2 = d63Var.b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), d63Var.b.getSelectionEnd(), str));
                        EditText editText3 = d63Var.b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        d63Var.b.setText(str);
                        EditText editText4 = d63Var.b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = d63Var.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ef3 ef3Var2 = (ef3) obj2;
                df3 df3Var = (df3) obj;
                ef3Var2.S0();
                df3Var.f = !df3Var.f;
                df3Var.j.S1.O(true);
                ef3Var2.D0();
                return;
            default:
                ((ef3) obj2).w2 = !ef3Var.w2;
                ((l7c) obj).O(true);
                return;
        }
    }

    public rc1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
