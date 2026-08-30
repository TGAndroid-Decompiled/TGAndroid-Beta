package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class n2 implements Runnable {
    public final int f12831a;
    public final Object f12832b;
    public final Object f12833c;

    public n2(int i10, Object obj, Object obj2) {
        this.f12831a = i10;
        this.f12832b = obj;
        this.f12833c = obj2;
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
        nh.e1 e1Var;
        long j10;
        int i12;
        int i13;
        ph.ca caVar;
        nh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f12831a) {
            case 0:
                g5 g5Var = (g5) this.f12832b;
                if (!((t7) this.f12833c).e) {
                    ic Q = g5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f25682t = true;
                    Q.j();
                    return;
                }
                g5Var.f12478g0.setLoading(false);
                g5Var.w1();
                return;
            case 1:
                ((g5) this.f12832b).getBulletinFactory().d0((TLRPC.TL_error) this.f12833c, false);
                return;
            case 2:
                MessagesController.getInstance(((g5) this.f12832b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f12833c), false);
                return;
            case 3:
                g5 g5Var2 = (g5) this.f12832b;
                g5Var2.getClass();
                ((boolean[]) this.f12833c)[0] = true;
                g5Var2.f12478g0.setLoading(false);
                g5Var2.w1();
                return;
            case 4:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f12833c;
                ((g5) this.f12832b).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 5:
                g5 g5Var3 = (g5) this.f12832b;
                qc.a0((xn) this.f12833c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(g5Var3.U))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new t1(g5Var3, 8)).k(true);
                return;
            case 6:
                ((g5) this.f12832b).n2((CharSequence) this.f12833c);
                return;
            case 7:
                g5.I0((g5) this.f12832b, (TL_stars.TL_payments_uniqueStarGift) this.f12833c);
                return;
            case 8:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12833c;
                ((org.telegram.ui.ActionBar.d2) this.f12832b).dismiss();
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
                    kh.a2.v(i11, a02, i10, 36);
                    return;
                }
                return;
            case 9:
                l5 l5Var = (l5) this.f12832b;
                xn xnVar = (xn) this.f12833c;
                org.telegram.ui.Cells.a0 a0Var = l5Var.f12752b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = l5Var.f12752b;
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
                    org.telegram.ui.Cells.a0 a0Var3 = l5Var.f12752b;
                    ebVar.Q = xnVar;
                    ebVar.R = a0Var3;
                    ebVar.show();
                    return;
                }
                return;
            case 10:
                TLObject tLObject = (TLObject) this.f12832b;
                cg.h0 h0Var = (cg.h0) this.f12833c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    h0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    h0Var.run(null);
                    return;
                }
            case 11:
                boolean[] zArr = (boolean[]) this.f12832b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f12833c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                l7 l7Var = (l7) this.f12832b;
                TLObject tLObject2 = (TLObject) this.f12833c;
                ArrayList arrayList3 = l7Var.f12772l;
                int i14 = l7Var.f12764a;
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
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.f12765b), l7Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((MessagesController) this.f12832b).processUpdates((TLRPC.Updates) ((TLObject) this.f12833c), false);
                return;
            case 14:
                new qc(((org.telegram.ui.ActionBar.g3[]) this.f12832b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.f12833c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 15:
                eb ebVar2 = (eb) this.f12832b;
                ebVar2.O = true;
                ebVar2.o(new q7((s7) this.f12833c, 2));
                AndroidUtilities.runOnUIThread(new ka(ebVar2, 1), 240L);
                return;
            case 16:
                mg.s sVar = (mg.s) this.f12832b;
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.f12833c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f14139n.getText());
                for (org.telegram.ui.Components.u5 u5Var2 : (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var2 == u5Var) {
                        int editTextSelectionEnd = sVar.f14139n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(u5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(u5Var2);
                        sVar.f14139n.getText().delete(spanStart, spanEnd);
                        int i16 = spanEnd - spanStart;
                        mg.p pVar = sVar.f14139n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i16;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 17:
                mg.s sVar2 = (mg.s) this.f12832b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12833c;
                if (sVar2.N != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    mg.s0.f(-sVar2.J, sVar2.O, sVar2.N);
                    return;
                }
                String str = tL_error2.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.G, new Object[0]);
                }
                qc.a0(sVar2).t(str, null).j();
                return;
            case 18:
                org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) this.f12833c;
                mg.s sVar3 = ((mg.q) this.f12832b).f14103b2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.f14139n.getText());
                for (org.telegram.ui.Components.u5 u5Var4 : (org.telegram.ui.Components.u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var4 == u5Var3) {
                        int editTextSelectionEnd2 = sVar3.f14139n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(u5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(u5Var4);
                        sVar3.f14139n.getText().delete(spanStart2, spanEnd2);
                        int i17 = spanEnd2 - spanStart2;
                        mg.p pVar2 = sVar3.f14139n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i17;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 19:
                mg.d0 d0Var = (mg.d0) this.f12832b;
                pk0 pk0Var = (pk0) this.f12833c;
                d0Var.f13980l = true;
                d0Var.f13972a.invalidate();
                pk0Var.Y0 = false;
                pk0Var.invalidate();
                d0Var.c(true);
                return;
            case 20:
                mg.f0 f0Var = (mg.f0) this.f12832b;
                mg.b bVar = (mg.b) this.f12833c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 21:
                mg.r0 r0Var = (mg.r0) this.f12832b;
                mg.o0 o0Var = (mg.o0) this.f12833c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.f14073a;
                org.telegram.ui.Cells.a0 a0Var4 = r0Var.f14134z;
                if (e2.c.s(a0Var4)) {
                    ((org.telegram.ui.Cells.o4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 22:
                ((nh.i9) this.f12832b).H(ProfileActivity.m4(((nh.t0) this.f12833c).f15898c));
                return;
            case 23:
                nh.g2 g2Var = (nh.g2) this.f12832b;
                AndroidUtilities.addToClipboard(((nh.o0) this.f12833c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(g2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 24:
                nh.g2 g2Var2 = (nh.g2) this.f12832b;
                nh.t0 t0Var = (nh.t0) this.f12833c;
                long j11 = t0Var.f15898c;
                nh.d4 d4Var = g2Var2.f15346f0;
                if (j11 != UserConfig.getInstance(d4Var.f15263z2).getClientUserId() && ((e1Var = g2Var2.f15345e0.f15498x0) == null || j11 != DialogObject.getPeerDialogId(e1Var.i()))) {
                    if (d4Var.L3 != null) {
                        for (int i18 = 0; i18 < d4Var.L3.peers.size(); i18++) {
                            if (j11 != DialogObject.getPeerDialogId(d4Var.L3.peers.get(i18).peer)) {
                            }
                        }
                    }
                    Context context2 = g2Var2.getContext();
                    long j12 = t0Var.f15898c;
                    nh.a0 a0Var5 = new nh.a0(0, g2Var2, t0Var);
                    nh.b bVar2 = new nh.b();
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context2, bVar2, false, false);
                    g3Var.fixNavigationBar();
                    LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
                    TextView g10 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
                    g10.setTextColor(bVar2.x0(org.telegram.ui.ActionBar.j6.f20012j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f10.addView(g10, k7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, bVar2);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f10.addView(m4Var, k7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    lp checkBoxRound = z1Var.getCheckBoxRound();
                    int i19 = org.telegram.ui.ActionBar.j6.V6;
                    int i20 = org.telegram.ui.ActionBar.j6.f19961g7;
                    int i21 = org.telegram.ui.ActionBar.j6.f20032k7;
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
                    int i22 = org.telegram.ui.ActionBar.j6.f19996i6;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(bVar2.x0(i22), 2, -1));
                    f10.addView(z1Var, k7.b6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    z1Var2.getCheckBoxRound().b(i19, i20, i21);
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j12)), null, false, true, false);
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
                    z1Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(bVar2.x0(i22), 2, -1));
                    f10.addView(z1Var2, k7.b6.n(-1, -2));
                    final org.telegram.ui.Cells.z1 z1Var3 = new org.telegram.ui.Cells.z1(4, 21, context2, bVar2, true);
                    z1Var3.getCheckBoxRound().b(i19, i20, i21);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j12)), null, false, false, false);
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
                    z1Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(bVar2.x0(i22), 2, -1));
                    f10.addView(z1Var3, k7.b6.n(-1, -2));
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, bVar2);
                    a9Var.setBackgroundColor(-16777216);
                    a9Var.setFixedSize(12);
                    f10.addView(a9Var, k7.b6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    ph.d dVar = new ph.d(context2, bVar2, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new nh.c0(z1Var, z1Var2, z1Var3, a0Var5, g3Var, 0));
                    frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, k7.b6.n(-1, -2));
                    g3Var.setCustomView(f10);
                    g3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = g2Var2.L;
                deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.f15896a));
                ConnectionsManager.getInstance(g2Var2.K).sendRequest(deletegroupcallmessages, null);
                g2Var2.c(t0Var.f15896a);
                return;
            case 25:
                nh.e1 e1Var2 = (nh.e1) this.f12832b;
                ArrayList arrayList4 = (ArrayList) this.f12833c;
                e1Var2.getClass();
                int size = arrayList4.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj = arrayList4.get(i23);
                    i23++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(e1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f19201id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 26:
                ((nh.e1) this.f12832b).C.remove((String) this.f12833c);
                return;
            case 27:
                nh.d4 d4Var2 = (nh.d4) this.f12832b;
                ph.f3 f3Var = (ph.f3) this.f12833c;
                d4Var2.removeView(f3Var);
                if (d4Var2.a2 == f3Var) {
                    d4Var2.a2 = null;
                    return;
                }
                return;
            case 28:
                nh.d4 d4Var3 = (nh.d4) this.f12832b;
                ph.da E = ph.da.E((Activity) this.f12833c, d4Var3.f15263z2);
                nh.c4 c4Var = d4Var3.J2;
                if (c4Var != null && (h9Var = c4Var.f15142b) != null) {
                    j10 = h9Var.currentPosition;
                } else {
                    j10 = 0;
                }
                File h = d4Var3.L1.h();
                TL_stories.StoryItem storyItem = d4Var3.L1.f15111a;
                ph.u6 u6Var = new ph.u6();
                u6Var.f42425n = true;
                u6Var.f42437t = storyItem.media;
                int i24 = u6Var.f42398a;
                u6Var.f42431q = MessagesController.getInstance(i24).getPeer(storyItem.dialogId);
                u6Var.f42433r = storyItem.f19419id;
                u6Var.f42435s = storyItem.caption;
                u6Var.L = h;
                u6Var.M = false;
                u6Var.f42421k0 = 720;
                u6Var.f42423l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    u6Var.K = false;
                    if (h != null) {
                        u6Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    u6Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i25);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    u6Var.f42421k0 = documentAttribute.f19191w;
                                    u6Var.f42423l0 = documentAttribute.h;
                                    u6Var.f42416i = documentAttribute.duration;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            u6Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i26 = 0; i26 < storyItem.media.document.thumbs.size(); i26++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i26);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    u6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i24).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        u6Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                u6Var.A();
                u6Var.e(storyItem);
                ph.w9 d = ph.y9.d(d4Var3.G0);
                RectF rectF = E.E;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f41489f;
                int i27 = E.f41479c;
                if (!E.d) {
                    if (MessagesController.getInstance(i27).isFrozen()) {
                        org.telegram.ui.c.b(i27);
                    } else {
                        E.f41526r0 = false;
                        E.e = false;
                        E.f41553y2 = false;
                        if (windowManager != null && (caVar = E.f41512n) != null && caVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f41512n, layoutParams);
                            windowManager.addView(E.f41512n, layoutParams);
                            E.g0();
                        }
                        E.H1 = u6Var;
                        ph.g8.a(i27, u6Var);
                        ph.u6 u6Var2 = E.H1;
                        if (u6Var2 != null && u6Var2.K) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        E.L1 = i12;
                        E.f41519p0.f41859g = false;
                        if (d != null) {
                            E.C = d;
                            E.G = d.f42631a;
                            rectF.set(d.f42633c);
                            E.D = d.f42632b;
                            E.C.e();
                        } else {
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                        }
                        E.f41525r.c();
                        ph.p9 p9Var = E.f41486e0;
                        int i28 = E.G;
                        if (i28 != 1 && i28 != 0) {
                            i13 = -14737633;
                        } else {
                            i13 = 0;
                        }
                        p9Var.setBackgroundColor(i13);
                        E.f41525r.setTranslationX(0.0f);
                        E.f41525r.setTranslationY(0.0f);
                        E.f41525r.b(0.0f);
                        E.f41525r.setScaleX(1.0f);
                        E.f41525r.setScaleY(1.0f);
                        E.H = 0.0f;
                        AndroidUtilities.lockOrientation(E.f41475b, 1);
                        ph.u6 u6Var3 = E.H1;
                        if (u6Var3 != null) {
                            E.Z0.setText(u6Var3.C0);
                        }
                        E.L(new ph.h8(E, 7), j10);
                        E.Y0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.f41530s0 = 0L;
                        E.f41533t0 = "";
                    }
                }
                E.N = new nh.w1(d4Var3, 12);
                E.O = new nh.b2(0, d4Var3, E);
                return;
            default:
                nh.w3 w3Var = (nh.w3) this.f12832b;
                w3Var.getClass();
                ((nh.z8) w3Var.f16027l.N1).h(new eg.o1(((nh.i9) this.f12833c).f15461f, 14, false));
                return;
        }
    }

    public n2(t7 t7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f12831a = 11;
        this.f12832b = zArr;
        this.f12833c = callback2;
    }
}
