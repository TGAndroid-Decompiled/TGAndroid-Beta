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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z;
public final class sb1 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public sb1(x13 x13Var, Context context, clb clbVar) {
        this.a = (byte) 27;
        this.b = context;
        this.c = clbVar;
    }

    @Override
    public final void onClick(View view) {
        int[] iArr;
        String G;
        int b;
        int i;
        String G2;
        boolean z;
        View view2;
        FrameLayout frameLayout;
        int length;
        View view3;
        byte b2 = this.a;
        f89 f89Var = null;
        boolean z2 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                ub1 ub1Var = (ub1) obj2;
                z zVar = (z) obj;
                fu5 fu5Var = ub1Var.X0;
                if (fu5Var != null && fu5Var.E()) {
                    ub1Var.X0.u();
                    ub1Var.X0 = null;
                    return;
                }
                ub1Var.d1.f(true);
                fu5 G3 = fu5.G(zVar, new x53(), ub1Var.V0);
                ub1Var.X0 = G3;
                G3.s = (short) 0;
                G3.o(13, hl.L(200.0f), ob6.M0(2131743788, null));
                ub1Var.X0.j();
                for (int i2 : ub1Var.c1) {
                    if (i2 == 0) {
                        G = ob6.M0(2131743789, null);
                    } else if (i2 == Integer.MAX_VALUE) {
                        G = ob6.M0(2131743787, null);
                    } else {
                        G = ob6.G(i2, "Seconds", new Object[0]);
                    }
                    ub1Var.X0.b(0, G, new zd(ub1Var, i2, (byte) 10), false);
                    if (ub1Var.b1 == i2) {
                        ub1Var.X0.M();
                    }
                }
                ub1Var.X0.a0();
                return;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((nx0) obj2).dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.Q2(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 2:
                vz vzVar = (vz) obj2;
                Runnable runnable = (Runnable) obj;
                ula ulaVar = (ula) vzVar.d;
                if (ulaVar.I) {
                    vzVar.w = runnable;
                    ulaVar.a(true);
                    return;
                }
                return;
            case 3:
                ij1 ij1Var = (ij1) obj2;
                w1b w1bVar = (w1b) obj;
                c51 c51Var = ij1Var.A0;
                if (view.isEnabled() && !c51Var.R) {
                    xi1 xi1Var = ij1Var.G0;
                    if (xi1Var == null || !xi1Var.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        pi1 pi1Var = new pi1(ij1Var, twoStepVerificationActivity, (byte) 0);
                        twoStepVerificationActivity.a0 = (byte) 1;
                        twoStepVerificationActivity.c0 = pi1Var;
                        c51Var.setLoading(true);
                        twoStepVerificationActivity.x0(new qi1(ij1Var, w1bVar, twoStepVerificationActivity, (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m01.u((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 5:
                ((zu1) obj2).L9((String) obj);
                return;
            case 6:
                ((zu1) obj2).M9((fu5) obj);
                return;
            case 7:
                sg2 sg2Var = (sg2) obj2;
                boolean z3 = !sg2Var.b();
                sg2Var.c(z3, true);
                ((AtomicBoolean) obj).set(z3);
                return;
            case 8:
                zu1 zu1Var = (zu1) obj2;
                ls6 mediaDataController = zu1Var.getMediaDataController();
                TLRPC.Document F0 = ((r47) obj).F0();
                if (F0 == null) {
                    mediaDataController.getClass();
                } else {
                    if (mediaDataController.A0.c(F0.id) == null) {
                        if (F0.size > uc7.s1(mediaDataController.currentAccount).k4.Z0.f()) {
                            jn7.e().k(296, 4, ob6.a0("TooLargeError", null, 2131743696, new Object[0]), ob6.a0("ErrorRingtoneSizeTooBig", null, 2131751067, Integer.valueOf(uc7.s1(yac.t0).k4.Z0.f() / 1024)));
                        } else {
                            for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > uc7.s1(mediaDataController.currentAccount).k4.a1.f()) {
                                    jn7.e().k(296, 4, ob6.a0("TooLongError", null, 2131743695, new Object[0]), ob6.a0("ErrorRingtoneDurationTooLong", null, 2131751069, Integer.valueOf(uc7.s1(yac.t0).k4.a1.f())));
                                }
                            }
                            TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            saveringtone.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.file_reference = F0.file_reference;
                            tL_inputDocument.access_hash = F0.access_hash;
                            ConnectionsManager.getInstance(mediaDataController.currentAccount).sendRequest(saveringtone, new mw3(mediaDataController, F0, (byte) 25));
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    zu1Var.i6();
                    UndoView undoView = zu1Var.N3;
                    if (undoView != null) {
                        long j = zu1Var.l6;
                        int i4 = UndoView.j0;
                        undoView.j(83, j, new ix(zu1Var, (byte) 1));
                    }
                }
                zu1Var.M5(true);
                return;
            case 9:
                ((zu1) obj2).R8((Context) obj);
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i5 = ChatActivityEnterView.X7;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (vnb) obj, chatActivityEnterView.getContext());
                String M0 = ob6.M0(2131754029, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131754030, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new ew1(chatActivityEnterView));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 11:
                ((s42) obj2).V((vnb) obj);
                return;
            case 12:
                a72 a72Var = (a72) ((t20) obj2).e;
                qob qobVar = a72Var.s;
                View G4 = qobVar.G((y62) obj);
                if (G4 != null) {
                    f89Var = qobVar.U(G4);
                }
                if (f89Var != null && (b = f89Var.b() - a72Var.u0) >= 0 && b < a72Var.L.length) {
                    a72Var.d0(b);
                    return;
                }
                return;
            case 13:
                f82 f82Var = (f82) obj2;
                vnb vnbVar = (vnb) obj;
                zu1 zu1Var2 = f82Var.H;
                if (f82Var.U) {
                    zu1Var2.showDialog(jj.S(f82Var.getContext(), zu1Var2.h, vnbVar).a);
                    return;
                }
                b82 b82Var = f82Var.e;
                if (zu1Var2.getParentActivity() != null) {
                    TLRPC.Chat chat = zu1Var2.e;
                    if (chat != null && !xc2.y(13, chat)) {
                        if (f82Var.a.f && zu1Var2.getParentActivity() != null && zu1Var2.fragmentView != null && zu1Var2.r8 != null) {
                            if (zu1Var2.D2 == null) {
                                kg5 x4 = zu1Var2.x4(310.0f, 1, -1, false);
                                zu1Var2.D2 = x4;
                                x4.d = 4000L;
                            }
                            int i6 = zu1Var2.r8.ttl_period;
                            if (i6 > 86400) {
                                G2 = ob6.G(i6 / 86400, "Days", new Object[0]);
                            } else if (i6 >= 3600) {
                                G2 = ob6.G(i6 / 3600, "Hours", new Object[0]);
                            } else if (i6 >= 60) {
                                G2 = ob6.G(i6 / 60, "Minutes", new Object[0]);
                            } else {
                                G2 = ob6.G(i6, "Seconds", new Object[0]);
                            }
                            zu1Var2.D2.t(ob6.a0("AutoDeleteSetInfo", null, 2131753837, G2));
                            zu1Var2.D2.x(zu1Var2.p1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = zu1Var2.r8;
                    TLRPC.UserFull userFull = zu1Var2.s8;
                    if (userFull != null) {
                        i = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i = chatFull.ttl_period;
                    } else {
                        i = 0;
                    }
                    guc gucVar = new guc(f82Var.getContext(), null, new c82(f82Var, r4), true, 0, f82Var.e0);
                    gucVar.B(i);
                    d82 d82Var = new d82(f82Var, (ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b);
                    n8[] n8VarArr = {d82Var};
                    d82Var.e = true;
                    d82Var.c = (short) 220;
                    d82Var.setOutsideTouchable(true);
                    n8VarArr[0].setClippingEnabled(true);
                    n8VarArr[0].setAnimationStyle(2131755192);
                    n8VarArr[0].setFocusable(true);
                    ((ActionBarPopupWindow$ActionBarPopupWindowLayout) gucVar.b).measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
                    n8VarArr[0].setInputMethodMode(2);
                    n8VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n8VarArr[0].showAtLocation(b82Var, 0, (int) (f82Var.getX() + b82Var.getX()), (int) b82Var.getY());
                    zu1Var2.y6(false, true, 0.2f);
                    return;
                }
                return;
            case 14:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                i82 i82Var = ((j82) obj2).w;
                if (i82Var != null) {
                    ao0 ao0Var = ((sn0) i82Var).a;
                    ao0Var.X1.remove(chat2);
                    ao0Var.g1(true, true);
                    return;
                }
                return;
            case 15:
                g92 g92Var = (g92) obj2;
                Context context = (Context) obj;
                z8d z8dVar = new z8d(context, (vnb) null);
                ((nx0) z8dVar.b).v0 = false;
                LinearLayout j2 = uh9.j(context, 1);
                mf5 mf5Var = new mf5(context, aob.n5, 23, 15, false, null);
                mf5Var.setHeight(47);
                mf5Var.setText(ob6.M0(2131752198, "ChatHistory"));
                j2.addView(mf5Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                j2.addView(linearLayout, tre.o(-1, -2));
                h29[] h29VarArr = new h29[2];
                int i7 = 0;
                for (int i8 = 2; i7 < i8; i8 = 2) {
                    h29 h29Var = new h29(context, true);
                    h29VarArr[i7] = h29Var;
                    h29Var.setTag(Integer.valueOf(i7));
                    yob.R(h29VarArr[i7], aob.L0(false), null, yob.M(aob.i6), null);
                    if (i7 == 0) {
                        h29VarArr[i7].b(ob6.M0(2131752193, "ChatHistoryVisible"), ob6.M0(2131752192, "ChatHistoryVisibleInfo"), true, !g92Var.K0);
                    } else if (xc2.T(g92Var.x0)) {
                        h29VarArr[i7].b(ob6.M0(2131752197, "ChatHistoryHidden"), ob6.M0(2131752196, "ChatHistoryHiddenInfo"), false, g92Var.K0);
                    } else {
                        h29VarArr[i7].b(ob6.M0(2131752197, "ChatHistoryHidden"), ob6.M0(2131752195, "ChatHistoryHiddenInfo2"), false, g92Var.K0);
                    }
                    linearLayout.addView(h29VarArr[i7], tre.o(-1, -2));
                    h29VarArr[i7].setOnClickListener(new c0(g92Var, h29VarArr, z8dVar, (byte) 22));
                    i7++;
                }
                nx0 nx0Var = (nx0) z8dVar.b;
                nx0Var.O = j2;
                g92Var.showDialog(nx0Var);
                return;
            case 16:
                ((g92) obj2).g0((FrameLayout) obj, view);
                return;
            case 17:
                TLRPC.Document document = (TLRPC.Document) obj;
                x92 x92Var = ((y92) obj2).d;
                if (x92Var != null) {
                    x92Var.b(document);
                    return;
                }
                return;
            case 18:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                x92 x92Var2 = ((b41) obj2).d;
                if (x92Var2 != null) {
                    x92Var2.b(document2);
                    return;
                }
                return;
            case 19:
                ((pd2) obj2).g0((z8d) obj, view);
                return;
            case 20:
                oe2 oe2Var = (oe2) obj2;
                zu1 zu1Var3 = (zu1) obj;
                if (oe2Var.p1 != null) {
                    oe2Var.p1 = null;
                    oe2Var.dismiss();
                    af2.e(oe2Var.a).a(zu1Var3.a(), true, false);
                    return;
                }
                oe2Var.dismiss();
                return;
            case 21:
                dg2 dg2Var = (dg2) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                u41 u41Var = dg2Var.U1;
                c51 c51Var2 = dg2Var.Y1;
                if (!c51Var2.R) {
                    c51Var2.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = uc7.s1(dg2Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = u41Var.b();
                    ConnectionsManager.getInstance(dg2Var.a).sendRequest(updateconnectedbot, new fn0(dg2Var, tL_connectedBot, u41Var.c(), (byte) 19));
                    return;
                }
                return;
            case 22:
                sm2 sm2Var = (sm2) obj2;
                Context context2 = (Context) obj;
                rx rxVar = sm2Var.r1;
                switch (rxVar.a) {
                    case 6:
                        z = rxVar.b;
                        break;
                    default:
                        z = rxVar.b;
                        break;
                }
                if (!z) {
                    rx rxVar2 = sm2Var.r1;
                    switch (rxVar2.a) {
                        case 6:
                            view2 = (hc8) rxVar2.d;
                            break;
                        default:
                            view2 = (vab) rxVar2.d;
                            break;
                    }
                    Bitmap H3 = hl.H3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(H3.getWidth(), H3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    rx rxVar3 = sm2Var.r1;
                    switch (rxVar3.a) {
                        case 6:
                            qy5 qy5Var = ((hc8) rxVar3.d).G0;
                            Matrix matrix = qy5Var.getMatrix();
                            canvas.save();
                            canvas.translate(qy5Var.getX(), qy5Var.getY());
                            canvas.concat(matrix);
                            Bitmap bitmap = (Bitmap) rxVar3.c;
                            canvas.scale(qy5Var.getWidth() / bitmap.getWidth(), qy5Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(H3, 0.0f, 0.0f, (Paint) null);
                            H3.recycle();
                            im2 im2Var = new im2(sm2Var, context2, createBitmap);
                            rx rxVar4 = sm2Var.r1;
                            switch (rxVar4.a) {
                                case 6:
                                    frameLayout = ((hc8) rxVar4.d).O0;
                                    break;
                                default:
                                    frameLayout = ((vab) rxVar4.d).F0;
                                    break;
                            }
                            frameLayout.addView(im2Var, tre.c(-1.0f, -1));
                            rx rxVar5 = sm2Var.r1;
                            Objects.requireNonNull(rxVar5);
                            im2Var.setColorListener(new hw(rxVar5, (byte) 7));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(k43.f);
                            duration.addUpdateListener(new pv7(im2Var, (byte) 11));
                            duration.start();
                            rx rxVar6 = sm2Var.r1;
                            switch (rxVar6.a) {
                                case 6:
                                    rxVar6.b = true;
                                    break;
                                default:
                                    rxVar6.b = true;
                                    break;
                            }
                            sm2Var.dismiss();
                            return;
                        default:
                            yw7 yw7Var = ((vab) rxVar3.d).y0;
                            Matrix matrix2 = yw7Var.getMatrix();
                            canvas.save();
                            canvas.translate(yw7Var.getX(), yw7Var.getY());
                            canvas.concat(matrix2);
                            yw7Var.getWidth();
                            throw null;
                    }
                }
                return;
            case 23:
                ((Runnable) obj).run();
                ((yn2) obj2).dismiss();
                return;
            case 24:
                cu2 cu2Var = (cu2) obj2;
                cu2Var.showDialog((nx0) jj.l(cu2Var.getParentActivity(), ob6.a0(null, null, 2131743331, lbc.l((TLRPC.User) obj)), ob6.M0(2131743332, null), null, new te2(cu2Var, (byte) 27), null, false, false, cu2Var.r).b);
                return;
            case 25:
                ArrayList arrayList = (ArrayList) obj;
                rw2 rw2Var = ((nw2) obj2).a;
                if (rw2Var.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList.get(intValue)).intValue() == 0) {
                        pw2 pw2Var = rw2Var.l;
                        Object obj3 = rw2Var.W;
                        if (obj3 == null) {
                            obj3 = rw2Var.Z;
                        }
                        pw2Var.v(obj3, rw2Var.b0, true, 0, 0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                        pw2 pw2Var2 = rw2Var.l;
                        Object obj4 = rw2Var.W;
                        if (obj4 == null) {
                            obj4 = rw2Var.Z;
                        }
                        pw2Var2.v(obj4, rw2Var.b0, false, 0, 0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                        ls6 d0 = ls6.d0(rw2Var.r);
                        TLRPC.Document document3 = rw2Var.W;
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
                        d0.getConnectionsManager().sendRequest(tL_messages_saveGif, new mw3(d0, tL_messages_saveGif, (byte) 24));
                        d0.getMessagesStorage().a.c(new lp6(d0, document3, (byte) 0));
                        rw2Var.l.O();
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                        ls6.d0(rw2Var.r).c(rw2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                        uc7.s1(rw2Var.r).E4("gif", rw2Var.W);
                        rw2Var.l.O();
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                        TLRPC.Document document4 = rw2Var.W;
                        TLRPC.BotInlineResult botInlineResult = rw2Var.Z;
                        Object obj5 = rw2Var.b0;
                        pw2 pw2Var3 = rw2Var.l;
                        jj.J(rw2Var.w, pw2Var3.a(), new pt(pw2Var3, document4, botInlineResult, obj5, (byte) 7), rw2Var.c0);
                    } else if (((Integer) arrayList.get(intValue)).intValue() == 11) {
                        pw2 pw2Var4 = rw2Var.l;
                        Object obj6 = rw2Var.W;
                        if (obj6 == null) {
                            obj6 = rw2Var.Z;
                        }
                        pw2Var4.L(obj6, rw2Var.b0);
                    }
                    rw2Var.d();
                    return;
                }
                return;
            case 26:
                y13 y13Var = (y13) obj2;
                y13Var.U1 = uc7.s1(y13Var.a).j1(r47.B1((TLRPC.Peer) obj));
                y13Var.dismiss();
                return;
            case 27:
                Context context3 = (Context) obj2;
                hl.g(((clb) obj).a.getText().toString());
                if (hl.C3()) {
                    Toast.makeText(context3, ob6.M0(2131743847, null), 0).show();
                    return;
                }
                return;
            case 28:
                k53 k53Var = (k53) obj2;
                String str = (String) obj;
                if (k53Var.b == null && (view3 = k53Var.d) != null) {
                    View findFocus = view3.findFocus();
                    if (findFocus instanceof EditText) {
                        k53Var.b = (EditText) findFocus;
                    }
                }
                if (k53Var.b != null) {
                    try {
                        k53Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = k53Var.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = k53Var.b.getText();
                    if (k53Var.b.getSelectionEnd() == k53Var.b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + k53Var.b.getSelectionStart();
                    }
                    if (k53Var.b.getSelectionStart() != -1 && k53Var.b.getSelectionEnd() != -1) {
                        EditText editText2 = k53Var.b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), k53Var.b.getSelectionEnd(), str));
                        EditText editText3 = k53Var.b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        k53Var.b.setText(str);
                        EditText editText4 = k53Var.b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = k53Var.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                me3 me3Var = (me3) obj2;
                le3 le3Var = (le3) obj;
                me3Var.T0();
                le3Var.f = !le3Var.f;
                le3Var.j.S1.O(true);
                me3Var.E0();
                return;
        }
    }

    public sb1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
