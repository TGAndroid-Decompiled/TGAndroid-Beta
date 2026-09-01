package mh;

import android.content.Context;
import android.database.SQLException;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class m2 implements Runnable {
    public final int f14442a;
    public final Object f14443b;
    public final Object f14444c;

    public m2(int i10, Object obj, Object obj2) {
        this.f14442a = i10;
        this.f14443b = obj;
        this.f14444c = obj2;
    }

    @Override
    public final void run() {
        qc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z4;
        TLRPC.TL_messageReactions tL_messageReactions2;
        org.telegram.ui.Components.u5[] u5VarArr;
        org.telegram.ui.Components.u5[] u5VarArr2;
        r3.s nVar;
        boolean z10;
        int i12;
        oh.e1 e1Var;
        int i13 = this.f14442a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        Object obj = this.f14444c;
        Object obj2 = this.f14443b;
        switch (i13) {
            case 0:
                g5 g5Var = (g5) obj2;
                if (!((t7) obj).f14831e) {
                    ic Q = g5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27755t = true;
                    Q.j();
                    return;
                }
                g5Var.f14095g0.setLoading(false);
                g5Var.w1();
                return;
            case 1:
                ((g5) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 2:
                MessagesController.getInstance(((g5) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 3:
                g5 g5Var2 = (g5) obj2;
                g5Var2.getClass();
                ((boolean[]) obj)[0] = true;
                g5Var2.f14095g0.setLoading(false);
                g5Var2.w1();
                return;
            case 4:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((g5) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 5:
                g5 g5Var3 = (g5) obj2;
                qc.a0((xn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(g5Var3.U))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new s1(g5Var3, 8)).k(true);
                return;
            case 6:
                ((g5) obj2).n2((CharSequence) obj);
                return;
            case 7:
                g5.I0((g5) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 8:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.d2) obj2).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = qc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = qc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    l.d.v(i11, a02, i10, 36);
                    return;
                }
                return;
            case 9:
                l5 l5Var = (l5) obj2;
                xn xnVar = (xn) obj;
                org.telegram.ui.Cells.a0 a0Var = l5Var.f14383b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = l5Var.f14383b;
                    if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    s7 s7Var = t7.y(messageObject.currentAccount, false).B;
                    if (s7Var != null) {
                        s7Var.b();
                    }
                    TLRPC.ChatFull chatFull = xnVar.W7;
                    Context context = l5Var.getContext();
                    int currentAccount = xnVar.getCurrentAccount();
                    long a2 = xnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    eb ebVar = new eb(context, currentAccount, a2, xnVar, messageObject2, arrayList2, z4, false, 0L, xnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = l5Var.f14383b;
                    ebVar.Q = xnVar;
                    ebVar.R = a0Var3;
                    ebVar.show();
                    return;
                }
                return;
            case 10:
                TLObject tLObject = (TLObject) obj2;
                dg.h0 h0Var = (dg.h0) obj;
                if (tLObject instanceof TL_stars.StarGifts) {
                    h0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    h0Var.run(null);
                    return;
                }
            case 11:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                l7 l7Var = (l7) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = l7Var.f14405l;
                int i14 = l7Var.f14396a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i15 = 0;
                        while (i15 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i15)).pinned_to_top) {
                            i15++;
                        }
                        arrayList3.add(i15, savedStarGift);
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f14397b), l7Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 14:
                new qc(((org.telegram.ui.ActionBar.h3[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.g6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 15:
                eb ebVar2 = (eb) obj2;
                ebVar2.O = true;
                ebVar2.o(new q7((s7) obj, 2));
                AndroidUtilities.runOnUIThread(new ka(ebVar2, 1), 240L);
                return;
            case 16:
                ng.s sVar = (ng.s) obj2;
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f16212n.getText());
                for (org.telegram.ui.Components.u5 u5Var2 : (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var2 == u5Var) {
                        int editTextSelectionEnd = sVar.f16212n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(u5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(u5Var2);
                        sVar.f16212n.getText().delete(spanStart, spanEnd);
                        int i16 = spanEnd - spanStart;
                        ng.p pVar = sVar.f16212n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i16;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 17:
                ng.s sVar2 = (ng.s) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (sVar2.N != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    ng.s0.f(-sVar2.J, sVar2.O, sVar2.N);
                    return;
                }
                String str = tL_error2.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.G, new Object[0]);
                }
                qc.a0(sVar2).t(str, null).j();
                return;
            case 18:
                org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) obj;
                ng.s sVar3 = ((ng.q) obj2).f16173b2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.f16212n.getText());
                for (org.telegram.ui.Components.u5 u5Var4 : (org.telegram.ui.Components.u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var4 == u5Var3) {
                        int editTextSelectionEnd2 = sVar3.f16212n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(u5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(u5Var4);
                        sVar3.f16212n.getText().delete(spanStart2, spanEnd2);
                        int i17 = spanEnd2 - spanStart2;
                        ng.p pVar2 = sVar3.f16212n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i17;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 19:
                ng.d0 d0Var = (ng.d0) obj2;
                rk0 rk0Var = (rk0) obj;
                d0Var.f16042l = true;
                d0Var.f16033a.invalidate();
                rk0Var.Y0 = false;
                rk0Var.invalidate();
                d0Var.c(true);
                return;
            case 20:
                ng.f0 f0Var = (ng.f0) obj2;
                ng.b bVar = (ng.b) obj;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 21:
                ng.r0 r0Var = (ng.r0) obj2;
                ng.o0 o0Var = (ng.o0) obj;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.f16142a;
                org.telegram.ui.Cells.a0 a0Var4 = r0Var.f16206z;
                if (e2.c.s(a0Var4)) {
                    ((org.telegram.ui.Cells.o4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 22:
                o3.d dVar = (o3.d) obj2;
                j3.n0 n0Var = (j3.n0) obj;
                o3.e eVar = dVar.d;
                if (eVar.B != 0 && !dVar.f16385c) {
                    Looper looper = eVar.F;
                    looper.getClass();
                    dVar.f16384b = eVar.d(looper, dVar.f16383a, n0Var, false);
                    eVar.f16395x.add(dVar);
                    return;
                }
                return;
            case 23:
                o4.e0 e0Var = (o4.e0) obj2;
                r3.s sVar4 = (r3.s) obj;
                if (e0Var.E == null) {
                    nVar = sVar4;
                } else {
                    nVar = new r3.n(-9223372036854775807L);
                }
                e0Var.L = nVar;
                e0Var.M = sVar4.g();
                if (!e0Var.S && sVar4.g() == -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e0Var.N = z10;
                if (z10) {
                    i12 = 7;
                } else {
                    i12 = 1;
                }
                e0Var.O = i12;
                e0Var.h.t(e0Var.M, sVar4.c(), e0Var.N);
                if (!e0Var.I) {
                    e0Var.v();
                    return;
                }
                return;
            case 24:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    y2.q.a().d.e(((o9.c) obj2).h.f50709a.b(v2.d.f48852c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 25:
                ((oh.i9) obj2).H(ProfileActivity.m4(((oh.t0) obj).f17757c));
                return;
            case 26:
                oh.h2 h2Var = (oh.h2) obj2;
                AndroidUtilities.addToClipboard(((oh.o0) obj).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(h2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 27:
                oh.h2 h2Var2 = (oh.h2) obj2;
                oh.t0 t0Var = (oh.t0) obj;
                long j10 = t0Var.f17757c;
                oh.f4 f4Var = h2Var2.f17175f0;
                if (j10 != UserConfig.getInstance(f4Var.f17133z2).getClientUserId() && ((e1Var = h2Var2.f17174e0.f17303x0) == null || j10 != DialogObject.getPeerDialogId(e1Var.i()))) {
                    if (f4Var.L3 != null) {
                        for (int i18 = 0; i18 < f4Var.L3.peers.size(); i18++) {
                            if (j10 != DialogObject.getPeerDialogId(f4Var.L3.peers.get(i18).peer)) {
                            }
                        }
                    }
                    Context context2 = h2Var2.getContext();
                    long j11 = t0Var.f17757c;
                    oh.z zVar = new oh.z(0, h2Var2, t0Var);
                    oh.b bVar2 = new oh.b();
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context2, bVar2, false, false);
                    h3Var.fixNavigationBar();
                    LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
                    TextView g10 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
                    g10.setTextColor(bVar2.B0(org.telegram.ui.ActionBar.k6.f21766j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f10.addView(g10, k7.c6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, bVar2);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f10.addView(m4Var, k7.c6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    np checkBoxRound = z1Var.getCheckBoxRound();
                    int i19 = org.telegram.ui.ActionBar.k6.V6;
                    int i20 = org.telegram.ui.ActionBar.k6.f21715g7;
                    int i21 = org.telegram.ui.ActionBar.k6.f21786k7;
                    checkBoxRound.b(i19, i20, i21);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var2 = z1Var;
                                    z1Var2.c(!z1Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var3 = z1Var;
                                    z1Var3.c(!z1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i22 = org.telegram.ui.ActionBar.k6.f21750i6;
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.f0(bVar2.B0(i22), 2, -1));
                    f10.addView(z1Var, k7.c6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    z1Var2.getCheckBoxRound().b(i19, i20, i21);
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var22 = z1Var2;
                                    z1Var22.c(!z1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var3 = z1Var2;
                                    z1Var3.c(!z1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var2;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    z1Var2.setBackground(org.telegram.ui.ActionBar.k6.f0(bVar2.B0(i22), 2, -1));
                    f10.addView(z1Var2, k7.c6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var3 = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    z1Var3.getCheckBoxRound().b(i19, i20, i21);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    z1Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var22 = z1Var3;
                                    z1Var22.c(!z1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var32 = z1Var3;
                                    z1Var32.c(!z1Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var3;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    z1Var3.setBackground(org.telegram.ui.ActionBar.k6.f0(bVar2.B0(i22), 2, -1));
                    f10.addView(z1Var3, k7.c6.n(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, bVar2);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    f10.addView(a9Var, k7.c6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    qh.d dVar2 = new qh.d(context2, bVar2, true);
                    dVar2.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar2.setOnClickListener(new oh.b0(z1Var, z1Var2, z1Var3, zVar, h3Var, 0));
                    frameLayout.addView(dVar2, k7.c6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, k7.c6.n(-1, -2));
                    h3Var.setCustomView(f10);
                    h3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = h2Var2.L;
                deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.f17755a));
                ConnectionsManager.getInstance(h2Var2.K).sendRequest(deletegroupcallmessages, null);
                h2Var2.c(t0Var.f17755a);
                return;
            case 28:
                oh.e1 e1Var2 = (oh.e1) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                e1Var2.getClass();
                int size = arrayList4.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj3 = arrayList4.get(i23);
                    i23++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj3;
                    NotificationCenter.getInstance(e1Var2.f17005e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f20860id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            default:
                ((oh.e1) obj2).C.remove((String) obj);
                return;
        }
    }

    public m2(t7 t7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f14442a = 11;
        this.f14443b = zArr;
        this.f14444c = callback2;
    }
}
