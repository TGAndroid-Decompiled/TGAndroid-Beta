package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioTrack;
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
import nh.gb;
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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
public final class w2 implements Runnable {
    public final int f13016a;
    public final Object f13017b;
    public final Object f13018c;

    public w2(int i10, Object obj, Object obj2) {
        this.f13016a = i10;
        this.f13017b = obj;
        this.f13018c = obj2;
    }

    @Override
    public final void run() {
        tc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        TLRPC.TL_messageReactions tL_messageReactions2;
        org.telegram.ui.Components.y5[] y5VarArr;
        org.telegram.ui.Components.y5[] y5VarArr2;
        o3.t oVar;
        boolean z11;
        int i12;
        lh.d1 d1Var;
        long j10;
        int i13;
        int i14;
        nh.fb fbVar;
        lh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f13016a) {
            case 0:
                MessagesController.getInstance(((h5) this.f13017b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f13018c), false);
                return;
            case 1:
                h5 h5Var = (h5) this.f13017b;
                h5Var.getClass();
                ((boolean[]) this.f13018c)[0] = true;
                h5Var.f12173f0.setLoading(false);
                h5Var.w1();
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f13018c;
                ((h5) this.f13017b).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 3:
                h5 h5Var2 = (h5) this.f13017b;
                tc.a0((tn) this.f13018c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(h5Var2.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new t1(h5Var2, 8)).k(true);
                return;
            case 4:
                ((h5) this.f13017b).n2((CharSequence) this.f13018c);
                return;
            case 5:
                h5.I0((h5) this.f13017b, (TL_stars.TL_payments_uniqueStarGift) this.f13018c);
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13018c;
                ((org.telegram.ui.ActionBar.c2) this.f13017b).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = tc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = tc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    j7.l1.v(i11, a02, i10, 36);
                    return;
                }
                return;
            case 7:
                m5 m5Var = (m5) this.f13017b;
                tn tnVar = (tn) this.f13018c;
                org.telegram.ui.Cells.a0 a0Var = m5Var.f12455b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = m5Var.f12455b;
                    if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) a0Var2).getPrimaryMessageObject();
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
                    r7 r7Var = s7.y(messageObject.currentAccount, false).B;
                    if (r7Var != null) {
                        r7Var.b();
                    }
                    TLRPC.ChatFull chatFull = tnVar.V7;
                    Context context = m5Var.getContext();
                    int currentAccount = tnVar.getCurrentAccount();
                    long a2 = tnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    db dbVar = new db(context, currentAccount, a2, tnVar, messageObject2, arrayList2, z10, false, 0L, tnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = m5Var.f12455b;
                    dbVar.P = tnVar;
                    dbVar.Q = a0Var3;
                    dbVar.show();
                    return;
                }
                return;
            case 8:
                TLObject tLObject = (TLObject) this.f13018c;
                ag.i0 i0Var = (ag.i0) this.f13017b;
                if (tLObject instanceof TL_stars.StarGifts) {
                    i0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    i0Var.run(null);
                    return;
                }
            case 9:
                boolean[] zArr = (boolean[]) this.f13017b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f13018c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 10:
                k7 k7Var = (k7) this.f13017b;
                TLObject tLObject2 = (TLObject) this.f13018c;
                ArrayList arrayList3 = k7Var.f12387l;
                int i15 = k7Var.f12378a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i15).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i16 = 0;
                        while (i16 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i16)).pinned_to_top) {
                            i16++;
                        }
                        arrayList3.add(i16, savedStarGift);
                        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k7Var.f12379b), k7Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((MessagesController) this.f13017b).processUpdates((TLRPC.Updates) ((TLObject) this.f13018c), false);
                return;
            case 12:
                new tc(((org.telegram.ui.ActionBar.f3[]) this.f13017b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.f13018c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 13:
                db dbVar2 = (db) this.f13017b;
                dbVar2.N = true;
                dbVar2.o(new p7((r7) this.f13018c, 2));
                AndroidUtilities.runOnUIThread(new ja(dbVar2, 1), 240L);
                return;
            case 14:
                kg.s sVar = (kg.s) this.f13017b;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f13018c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f13859n.getText());
                for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = sVar.f13859n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        sVar.f13859n.getText().delete(spanStart, spanEnd);
                        int i17 = spanEnd - spanStart;
                        kg.p pVar = sVar.f13859n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i17;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 15:
                kg.s sVar2 = (kg.s) this.f13017b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f13018c;
                if (sVar2.M != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    kg.s0.f(-sVar2.I, sVar2.N, sVar2.M);
                    return;
                }
                String str = tL_error2.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.F, new Object[0]);
                }
                tc.a0(sVar2).t(str, null).j();
                return;
            case 16:
                org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) this.f13018c;
                kg.s sVar3 = ((kg.q) this.f13017b).a2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.f13859n.getText());
                for (org.telegram.ui.Components.y5 y5Var4 : (org.telegram.ui.Components.y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = sVar3.f13859n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
                        sVar3.f13859n.getText().delete(spanStart2, spanEnd2);
                        int i18 = spanEnd2 - spanStart2;
                        kg.p pVar2 = sVar3.f13859n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i18;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 17:
                kg.d0 d0Var = (kg.d0) this.f13017b;
                fk0 fk0Var = (fk0) this.f13018c;
                d0Var.f13690l = true;
                d0Var.f13681a.invalidate();
                fk0Var.X0 = false;
                fk0Var.invalidate();
                d0Var.c(true);
                return;
            case 18:
                kg.f0 f0Var = (kg.f0) this.f13017b;
                kg.b bVar = (kg.b) this.f13018c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 19:
                kg.r0 r0Var = (kg.r0) this.f13017b;
                kg.o0 o0Var = (kg.o0) this.f13018c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.f13790a;
                org.telegram.ui.Cells.a0 a0Var4 = r0Var.f13853z;
                if (com.google.android.recaptcha.internal.a.u(a0Var4)) {
                    ((org.telegram.ui.Cells.m4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 20:
                l3.o oVar2 = ((l3.n) this.f13017b).f14151b;
                int i19 = f5.d0.f6579a;
                k3.f fVar = ((j3.h0) oVar2).f10477a.f10594r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1012, new d3(k9, (String) this.f13018c, 21));
                return;
            case 21:
                AudioTrack audioTrack = (AudioTrack) this.f13017b;
                f5.c cVar = (f5.c) this.f13018c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (l3.k0.f14113d0) {
                        try {
                            int i20 = l3.k0.f14115f0 - 1;
                            l3.k0.f14115f0 = i20;
                            if (i20 == 0) {
                                l3.k0.f14114e0.shutdown();
                                l3.k0.f14114e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    cVar.c();
                    synchronized (l3.k0.f14113d0) {
                        try {
                            int i21 = l3.k0.f14115f0 - 1;
                            l3.k0.f14115f0 = i21;
                            if (i21 == 0) {
                                l3.k0.f14114e0.shutdown();
                                l3.k0.f14114e0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 22:
                l4.r0 r0Var2 = (l4.r0) this.f13017b;
                o3.t tVar = (o3.t) this.f13018c;
                if (r0Var2.D == null) {
                    oVar = tVar;
                } else {
                    oVar = new o3.o(-9223372036854775807L);
                }
                r0Var2.K = oVar;
                r0Var2.L = tVar.h();
                if (!r0Var2.R && tVar.h() == -9223372036854775807L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r0Var2.M = z11;
                if (z11) {
                    i12 = 7;
                } else {
                    i12 = 1;
                }
                r0Var2.N = i12;
                r0Var2.h.t(r0Var2.L, tVar.c(), r0Var2.M);
                if (!r0Var2.H) {
                    r0Var2.l();
                    return;
                }
                return;
            case 23:
                ((lh.i9) this.f13017b).H(ProfileActivity.m4(((lh.s0) this.f13018c).f16196c));
                return;
            case 24:
                lh.f2 f2Var = (lh.f2) this.f13017b;
                AndroidUtilities.addToClipboard(((lh.n0) this.f13018c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(f2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 25:
                lh.f2 f2Var2 = (lh.f2) this.f13017b;
                lh.s0 s0Var = (lh.s0) this.f13018c;
                long j11 = s0Var.f16196c;
                lh.d4 d4Var = f2Var2.f15589e0;
                if (j11 != UserConfig.getInstance(d4Var.f15545y2).getClientUserId() && ((d1Var = f2Var2.f15588d0.f15790w0) == null || j11 != DialogObject.getPeerDialogId(d1Var.i()))) {
                    if (d4Var.K3 != null) {
                        for (int i22 = 0; i22 < d4Var.K3.peers.size(); i22++) {
                            if (j11 != DialogObject.getPeerDialogId(d4Var.K3.peers.get(i22).peer)) {
                            }
                        }
                    }
                    Context context2 = f2Var2.getContext();
                    long j12 = s0Var.f16196c;
                    lh.z zVar = new lh.z(0, f2Var2, s0Var);
                    lh.b bVar2 = new lh.b();
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context2, bVar2, false, false);
                    f3Var.fixNavigationBar();
                    LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
                    TextView h = org.telegram.messenger.x3.h(context2, 1, 20.0f);
                    h.setTextColor(bVar2.C0(org.telegram.ui.ActionBar.g6.f23169j5));
                    h.setTypeface(AndroidUtilities.bold());
                    h.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    g10.addView(h, i7.f6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context2, bVar2);
                    k4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    g10.addView(k4Var, i7.f6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context2, bVar2, true);
                    hp checkBoxRound = y1Var.getCheckBoxRound();
                    int i23 = org.telegram.ui.ActionBar.g6.V6;
                    int i24 = org.telegram.ui.ActionBar.g6.f23118g7;
                    int i25 = org.telegram.ui.ActionBar.g6.f23190k7;
                    checkBoxRound.b(i23, i24, i25);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var2 = y1Var;
                                    y1Var2.c(!y1Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                                    y1Var3.c(!y1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i26 = org.telegram.ui.ActionBar.g6.f23152i6;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(bVar2.C0(i26), 2, -1));
                    g10.addView(y1Var, i7.f6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context2, bVar2, true);
                    y1Var2.getCheckBoxRound().b(i23, i24, i25);
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j12)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var22 = y1Var2;
                                    y1Var22.c(!y1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var2;
                                    y1Var3.c(!y1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var2;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    y1Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(bVar2.C0(i26), 2, -1));
                    g10.addView(y1Var2, i7.f6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context2, bVar2, true);
                    y1Var3.getCheckBoxRound().b(i23, i24, i25);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j12)), null, false, false, false);
                    y1Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var22 = y1Var3;
                                    y1Var22.c(!y1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var32 = y1Var3;
                                    y1Var32.c(!y1Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var3;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(bVar2.C0(i26), 2, -1));
                    g10.addView(y1Var3, i7.f6.n(-1, -2));
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context2, bVar2);
                    y8Var.setBackgroundColor(-16777216);
                    y8Var.setFixedSize(12);
                    g10.addView(y8Var, i7.f6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    nh.d dVar = new nh.d(context2, bVar2, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new lh.b0(y1Var, y1Var2, y1Var3, zVar, f3Var, 0));
                    frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, i7.f6.n(-1, -2));
                    f3Var.setCustomView(g10);
                    f3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = f2Var2.K;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f16194a));
                ConnectionsManager.getInstance(f2Var2.J).sendRequest(deletegroupcallmessages, null);
                f2Var2.c(s0Var.f16194a);
                return;
            case 26:
                lh.d1 d1Var2 = (lh.d1) this.f13017b;
                ArrayList arrayList4 = (ArrayList) this.f13018c;
                d1Var2.getClass();
                int size = arrayList4.size();
                int i27 = 0;
                while (i27 < size) {
                    Object obj = arrayList4.get(i27);
                    i27++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d1Var2.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f22409id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 27:
                ((lh.d1) this.f13017b).B.remove((String) this.f13018c);
                return;
            case 28:
                lh.d4 d4Var2 = (lh.d4) this.f13017b;
                nh.t3 t3Var = (nh.t3) this.f13018c;
                d4Var2.removeView(t3Var);
                if (d4Var2.Z1 == t3Var) {
                    d4Var2.Z1 = null;
                    return;
                }
                return;
            default:
                lh.d4 d4Var3 = (lh.d4) this.f13017b;
                gb E = gb.E((Activity) this.f13018c, d4Var3.f15545y2);
                lh.c4 c4Var = d4Var3.I2;
                if (c4Var != null && (h9Var = c4Var.f15427b) != null) {
                    j10 = h9Var.currentPosition;
                } else {
                    j10 = 0;
                }
                File h10 = d4Var3.K1.h();
                TL_stories.StoryItem storyItem = d4Var3.K1.f15374a;
                nh.o7 o7Var = new nh.o7();
                o7Var.f18282n = true;
                o7Var.f18294t = storyItem.media;
                int i28 = o7Var.f18254a;
                o7Var.f18288q = MessagesController.getInstance(i28).getPeer(storyItem.dialogId);
                o7Var.f18290r = storyItem.f22629id;
                o7Var.f18292s = storyItem.caption;
                o7Var.L = h10;
                o7Var.M = false;
                o7Var.f18278k0 = 720;
                o7Var.f18280l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    o7Var.K = false;
                    if (h10 != null) {
                        o7Var.h(h10.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    o7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i29);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    o7Var.f18278k0 = documentAttribute.f22399w;
                                    o7Var.f18280l0 = documentAttribute.h;
                                    o7Var.f18273i = documentAttribute.duration;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            o7Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i30 = 0; i30 < storyItem.media.document.thumbs.size(); i30++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i30);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    o7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i28).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        o7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                o7Var.A();
                o7Var.e(storyItem);
                nh.za d = nh.bb.d(d4Var3.F0);
                RectF rectF = E.D;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f17754f;
                int i31 = E.f17743c;
                if (!E.d) {
                    if (MessagesController.getInstance(i31).isFrozen()) {
                        org.telegram.ui.c.b(i31);
                    } else {
                        E.f17787q0 = false;
                        E.f17750e = false;
                        E.f17814x2 = false;
                        if (windowManager != null && (fbVar = E.f17777n) != null && fbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f17777n, layoutParams);
                            windowManager.addView(E.f17777n, layoutParams);
                            E.g0();
                        }
                        E.G1 = o7Var;
                        nh.f9.a(i31, o7Var);
                        nh.o7 o7Var2 = E.G1;
                        if (o7Var2 != null && o7Var2.K) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        E.K1 = i13;
                        E.f17781o0.f17598g = false;
                        if (d != null) {
                            E.B = d;
                            E.F = d.f17444a;
                            rectF.set(d.f17446c);
                            E.C = d.f17445b;
                            E.B.e();
                        } else {
                            E.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.C = AndroidUtilities.dp(8.0f);
                        }
                        E.f17790r.c();
                        nh.ta taVar = E.f17747d0;
                        int i32 = E.F;
                        if (i32 != 1 && i32 != 0) {
                            i14 = -14737633;
                        } else {
                            i14 = 0;
                        }
                        taVar.setBackgroundColor(i14);
                        E.f17790r.setTranslationX(0.0f);
                        E.f17790r.setTranslationY(0.0f);
                        E.f17790r.b(0.0f);
                        E.f17790r.setScaleX(1.0f);
                        E.f17790r.setScaleY(1.0f);
                        E.G = 0.0f;
                        AndroidUtilities.lockOrientation(E.f17739b, 1);
                        nh.o7 o7Var3 = E.G1;
                        if (o7Var3 != null) {
                            E.Y0.setText(o7Var3.C0);
                        }
                        E.L(new nh.g9(E, 7), j10);
                        E.X0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.f17791r0 = 0L;
                        E.f17795s0 = "";
                    }
                }
                E.M = new lh.v1(d4Var3, 12);
                E.N = new lh.a2(0, d4Var3, E);
                return;
        }
    }

    public w2(s7 s7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f13016a = 9;
        this.f13017b = zArr;
        this.f13018c = callback2;
    }

    public w2(TLObject tLObject, ag.i0 i0Var) {
        this.f13016a = 8;
        this.f13018c = tLObject;
        this.f13017b = i0Var;
    }
}
