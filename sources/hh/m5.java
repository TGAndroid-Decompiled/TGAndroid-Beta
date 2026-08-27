package hh;

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
import java.util.List;
import lh.nb;
import lh.rb;
import lh.sb;
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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class m5 implements Runnable {

    public final int f9730a;

    public final Object f9731b;

    public final Object f9732c;

    public m5(int i10, Object obj, Object obj2) {
        this.f9730a = i10;
        this.f9731b = obj;
        this.f9732c = obj2;
    }

    @Override
    public final void run() {
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        jh.d1 d1Var;
        rb rbVar;
        jh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        str = null;
        String str = null;
        arrayList = null;
        arrayList = null;
        arrayList = null;
        final int i10 = 0;
        switch (this.f9730a) {
            case 0:
                o5 o5Var = (o5) this.f9731b;
                rn rnVar = (rn) this.f9732c;
                org.telegram.ui.Cells.a0 a0Var = o5Var.f9827b;
                if (a0Var == null) {
                    return;
                }
                try {
                    a0Var.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                }
                o5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.a0 a0Var2 = o5Var.f9827b;
                if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) a0Var2).getPrimaryMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                } else {
                    if (!(a0Var2 instanceof org.telegram.ui.Cells.v0) || (messageObject = ((org.telegram.ui.Cells.v0) a0Var2).getMessageObject()) == null) {
                        return;
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                        arrayList = tL_messageReactions.top_reactors;
                    }
                }
                ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                t7 t7Var = u7.y(messageObject.currentAccount, false).B;
                if (t7Var != null) {
                    t7Var.b();
                }
                TLRPC.ChatFull chatFull = rnVar.V7;
                MessageObject messageObject2 = messageObject;
                jb jbVar = new jb(o5Var.getContext(), rnVar.getCurrentAccount(), rnVar.a(), rnVar, messageObject2, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, rnVar.getResourceProvider());
                messageObject2.getId();
                org.telegram.ui.Cells.a0 a0Var3 = o5Var.f9827b;
                jbVar.P = rnVar;
                jbVar.Q = a0Var3;
                jbVar.show();
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f9731b;
                ag.n0 n0Var = (ag.n0) this.f9732c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    n0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    n0Var.run(null);
                    return;
                }
            case 2:
                boolean[] zArr = (boolean[]) this.f9731b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f9732c;
                if (zArr[0]) {
                    return;
                }
                callback2.run("cancelled", 0L);
                zArr[0] = true;
                return;
            case 3:
                m7 m7Var = (m7) this.f9731b;
                TLObject tLObject2 = (TLObject) this.f9732c;
                ArrayList arrayList3 = m7Var.f9753l;
                int i11 = m7Var.f9744a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i11).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i11).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i12 = 0;
                        while (i12 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i12)).pinned_to_top) {
                            i12++;
                        }
                        arrayList3.add(i12, savedStarGift);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.f9745b), m7Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((MessagesController) this.f9731b).processUpdates((TLRPC.Updates) ((TLObject) this.f9732c), false);
                return;
            case 5:
                new mc(((org.telegram.ui.ActionBar.e3[]) this.f9731b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.f9732c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 6:
                jb jbVar2 = (jb) this.f9731b;
                t7 t7Var2 = (t7) this.f9732c;
                jbVar2.N = true;
                jbVar2.p(new r7(t7Var2, 2));
                AndroidUtilities.runOnUIThread(new pa(jbVar2, 1), 240L);
                return;
            case 7:
                ig.s sVar = (ig.s) this.f9731b;
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.f9732c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f11446n.getText());
                for (org.telegram.ui.Components.t5 t5Var2 : (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class)) {
                    if (t5Var2 == t5Var) {
                        int editTextSelectionEnd = sVar.f11446n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(t5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(t5Var2);
                        sVar.f11446n.getText().delete(spanStart, spanEnd);
                        int i13 = spanEnd - spanStart;
                        ig.p pVar = sVar.f11446n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i13;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 8:
                ig.s sVar2 = (ig.s) this.f9731b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9732c;
                if (sVar2.M != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    ig.s0.f(-sVar2.I, sVar2.N, sVar2.M);
                    return;
                }
                String pluralString = tL_error.text;
                if (pluralString.equals("REACTIONS_TOO_MANY")) {
                    pluralString = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.F, new Object[0]);
                }
                mc.a0(sVar2).t(pluralString, null).j();
                return;
            case 9:
                ig.q qVar = (ig.q) this.f9731b;
                org.telegram.ui.Components.t5 t5Var3 = (org.telegram.ui.Components.t5) this.f9732c;
                ig.s sVar3 = qVar.a2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.f11446n.getText());
                for (org.telegram.ui.Components.t5 t5Var4 : (org.telegram.ui.Components.t5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.t5.class)) {
                    if (t5Var4 == t5Var3) {
                        int editTextSelectionEnd2 = sVar3.f11446n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(t5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(t5Var4);
                        sVar3.f11446n.getText().delete(spanStart2, spanEnd2);
                        int i14 = spanEnd2 - spanStart2;
                        ig.p pVar2 = sVar3.f11446n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i14;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 10:
                ig.d0 d0Var = (ig.d0) this.f9731b;
                wj0 wj0Var = (wj0) this.f9732c;
                d0Var.f11277l = true;
                d0Var.f11268a.invalidate();
                wj0Var.X0 = false;
                wj0Var.invalidate();
                d0Var.c(true);
                return;
            case 11:
                ig.f0 f0Var = (ig.f0) this.f9731b;
                ig.b bVar = (ig.b) this.f9732c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 12:
                ig.r0 r0Var = (ig.r0) this.f9731b;
                ig.o0 o0Var = (ig.o0) this.f9732c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.f11377a;
                org.telegram.ui.Cells.a0 a0Var4 = r0Var.f11440z;
                if (com.google.android.recaptcha.internal.a.u(a0Var4)) {
                    ((org.telegram.ui.Cells.l4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 13:
                j3.n nVar = (j3.n) this.f9731b;
                String str2 = (String) this.f9732c;
                j3.o oVar = nVar.f12392b;
                int i15 = d5.g0.f4795a;
                i3.f fVar = ((h3.h0) oVar).f7870a.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 1012, new h3.q2(aVarK, str2, 28));
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.f9731b;
                d5.c cVar = (d5.c) this.f9732c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (j3.j0.f12351d0) {
                        try {
                            int i16 = j3.j0.f12353f0 - 1;
                            j3.j0.f12353f0 = i16;
                            if (i16 == 0) {
                                j3.j0.f12352e0.shutdown();
                                j3.j0.f12352e0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    cVar.c();
                    synchronized (j3.j0.f12351d0) {
                        try {
                            int i17 = j3.j0.f12353f0 - 1;
                            j3.j0.f12353f0 = i17;
                            if (i17 == 0) {
                                j3.j0.f12352e0.shutdown();
                                j3.j0.f12352e0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 15:
                j4.r0 r0Var2 = (j4.r0) this.f9731b;
                m3.t tVar = (m3.t) this.f9732c;
                r0Var2.J = r0Var2.C == null ? tVar : new m3.o(-9223372036854775807L);
                r0Var2.K = tVar.i();
                boolean z10 = !r0Var2.Q && tVar.i() == -9223372036854775807L;
                r0Var2.L = z10;
                r0Var2.M = z10 ? 7 : 1;
                r0Var2.h.t(r0Var2.K, tVar.e(), r0Var2.L);
                if (r0Var2.G) {
                    return;
                }
                r0Var2.k();
                return;
            case 16:
                ((jh.i9) this.f9731b).H(ProfileActivity.m4(((jh.s0) this.f9732c).f13931c));
                return;
            case 17:
                jh.g2 g2Var = (jh.g2) this.f9731b;
                AndroidUtilities.addToClipboard(((jh.n0) this.f9732c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(g2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 18:
                jh.g2 g2Var2 = (jh.g2) this.f9731b;
                jh.s0 s0Var = (jh.s0) this.f9732c;
                long j10 = s0Var.f13931c;
                jh.e4 e4Var = g2Var2.f13350e0;
                if (j10 != UserConfig.getInstance(e4Var.f13296y2).getClientUserId() && ((d1Var = g2Var2.f13349d0.f13512w0) == null || j10 != DialogObject.getPeerDialogId(d1Var.i()))) {
                    if (e4Var.K3 != null) {
                        for (int i18 = 0; i18 < e4Var.K3.peers.size(); i18++) {
                            if (j10 != DialogObject.getPeerDialogId(e4Var.K3.peers.get(i18).peer)) {
                            }
                        }
                    }
                    Context context = g2Var2.getContext();
                    long j11 = s0Var.f13931c;
                    jh.z zVar = new jh.z(i10, g2Var2, s0Var);
                    jh.i0 i0Var = new jh.i0();
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, i0Var, false, false);
                    e3Var.fixNavigationBar();
                    LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                    TextView textViewH = org.telegram.messenger.y1.h(context, 1, 20.0f);
                    textViewH.setTextColor(i0Var.N0(org.telegram.ui.ActionBar.g6.f23161j5));
                    textViewH.setTypeface(AndroidUtilities.bold());
                    textViewH.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    linearLayoutG.addView(textViewH, h7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, i0Var);
                    j4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    linearLayoutG.addView(j4Var, h7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    bp checkBoxRound = y1Var.getCheckBoxRound();
                    int i19 = org.telegram.ui.ActionBar.g6.V6;
                    int i20 = org.telegram.ui.ActionBar.g6.f23109g7;
                    int i21 = org.telegram.ui.ActionBar.g6.f23182k7;
                    checkBoxRound.b(i19, i20, i21);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var2 = y1Var;
                                    y1Var2.c(!y1Var2.b(), true);
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                                    y1Var3.c(!y1Var3.b(), true);
                                    break;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var;
                                    y1Var4.c(!y1Var4.b(), true);
                                    break;
                            }
                        }
                    });
                    int i22 = org.telegram.ui.ActionBar.g6.f23144i6;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    linearLayoutG.addView(y1Var, h7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    y1Var2.getCheckBoxRound().b(i19, i20, i21);
                    final int i23 = 1;
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var2;
                                    y1Var3.c(!y1Var3.b(), true);
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var2;
                                    y1Var4.c(!y1Var4.b(), true);
                                    break;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var5 = y1Var2;
                                    y1Var5.c(!y1Var5.b(), true);
                                    break;
                            }
                        }
                    });
                    y1Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    linearLayoutG.addView(y1Var2, h7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    y1Var3.getCheckBoxRound().b(i19, i20, i21);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i24 = 2;
                    y1Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var3;
                                    y1Var4.c(!y1Var4.b(), true);
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var5 = y1Var3;
                                    y1Var5.c(!y1Var5.b(), true);
                                    break;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var6 = y1Var3;
                                    y1Var6.c(!y1Var6.b(), true);
                                    break;
                            }
                        }
                    });
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    linearLayoutG.addView(y1Var3, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, i0Var);
                    x8Var.setBackgroundColor(-16777216);
                    x8Var.setFixedSize(12);
                    linearLayoutG.addView(x8Var, h7.z5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    lh.d dVar = new lh.d(context, i0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new jh.b0(y1Var, y1Var2, y1Var3, zVar, e3Var, 0));
                    frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    linearLayoutG.addView(frameLayout, h7.z5.n(-1, -2));
                    e3Var.setCustomView(linearLayoutG);
                    e3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = g2Var2.K;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f13929a));
                ConnectionsManager.getInstance(g2Var2.J).sendRequest(deletegroupcallmessages, null);
                g2Var2.c(s0Var.f13929a);
                return;
            case 19:
                jh.d1 d1Var2 = (jh.d1) this.f9731b;
                ArrayList arrayList4 = (ArrayList) this.f9732c;
                d1Var2.getClass();
                int size = arrayList4.size();
                int i25 = 0;
                while (i25 < size) {
                    Object obj = arrayList4.get(i25);
                    i25++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d1Var2.f13177e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f22397id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 20:
                ((jh.d1) this.f9731b).B.remove((String) this.f9732c);
                return;
            case 21:
                jh.e4 e4Var2 = (jh.e4) this.f9731b;
                lh.w3 w3Var = (lh.w3) this.f9732c;
                e4Var2.removeView(w3Var);
                if (e4Var2.Z1 == w3Var) {
                    e4Var2.Z1 = null;
                    return;
                }
                return;
            case 22:
                jh.e4 e4Var3 = (jh.e4) this.f9731b;
                sb sbVarE = sb.E((Activity) this.f9732c, e4Var3.f13296y2);
                jh.d4 d4Var = e4Var3.I2;
                long j12 = (d4Var == null || (h9Var = d4Var.f13192b) == null) ? 0L : h9Var.currentPosition;
                File fileH = e4Var3.K1.h();
                TL_stories.StoryItem storyItem = e4Var3.K1.f13141a;
                lh.z7 z7Var = new lh.z7();
                z7Var.f17221n = true;
                z7Var.f17233t = storyItem.media;
                int i26 = z7Var.f17193a;
                z7Var.f17227q = MessagesController.getInstance(i26).getPeer(storyItem.dialogId);
                z7Var.f17229r = storyItem.f22617id;
                z7Var.f17231s = storyItem.caption;
                z7Var.L = fileH;
                z7Var.M = false;
                z7Var.f17217k0 = 720;
                z7Var.f17219l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    z7Var.K = false;
                    if (fileH != null) {
                        z7Var.h(fileH.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    z7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        for (int i27 = 0; i27 < storyItem.media.document.attributes.size(); i27++) {
                            TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i27);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                z7Var.f17217k0 = documentAttribute.f22387w;
                                z7Var.f17219l0 = documentAttribute.h;
                                z7Var.f17212i = documentAttribute.duration;
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str3 = storyItem.firstFramePath;
                        if (str3 != null) {
                            z7Var.N = str3;
                        } else if (document2.thumbs != null) {
                            for (int i28 = 0; i28 < storyItem.media.document.thumbs.size(); i28++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i28);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    z7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i26).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        z7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                z7Var.A();
                z7Var.e(storyItem);
                lh.lb lbVarD = nb.d(e4Var3.F0);
                RectF rectF = sbVarE.D;
                WindowManager.LayoutParams layoutParams = sbVarE.h;
                WindowManager windowManager = sbVarE.f16760f;
                int i29 = sbVarE.f16749c;
                if (!sbVarE.d) {
                    if (MessagesController.getInstance(i29).isFrozen()) {
                        org.telegram.ui.b.b(i29);
                    } else {
                        sbVarE.f16793q0 = false;
                        sbVarE.f16756e = false;
                        sbVarE.f16820x2 = false;
                        if (windowManager != null && (rbVar = sbVarE.f16783n) != null && rbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, sbVarE.f16783n, layoutParams);
                            windowManager.addView(sbVarE.f16783n, layoutParams);
                            sbVarE.g0();
                        }
                        sbVarE.G1 = z7Var;
                        lh.r9.a(i29, z7Var);
                        lh.z7 z7Var2 = sbVarE.G1;
                        sbVarE.K1 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
                        sbVarE.f16787o0.f16531g = false;
                        if (lbVarD != null) {
                            sbVarE.B = lbVarD;
                            sbVarE.F = lbVarD.f16454a;
                            rectF.set(lbVarD.f16456c);
                            sbVarE.C = lbVarD.f16455b;
                            sbVarE.B.e();
                        } else {
                            sbVarE.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            sbVarE.C = AndroidUtilities.dp(8.0f);
                        }
                        sbVarE.f16796r.c();
                        lh.fb fbVar = sbVarE.f16753d0;
                        int i30 = sbVarE.F;
                        fbVar.setBackgroundColor((i30 == 1 || i30 == 0) ? 0 : -14737633);
                        sbVarE.f16796r.setTranslationX(0.0f);
                        sbVarE.f16796r.setTranslationY(0.0f);
                        sbVarE.f16796r.b(0.0f);
                        sbVarE.f16796r.setScaleX(1.0f);
                        sbVarE.f16796r.setScaleY(1.0f);
                        sbVarE.G = 0.0f;
                        AndroidUtilities.lockOrientation(sbVarE.f16745b, 1);
                        lh.z7 z7Var3 = sbVarE.G1;
                        if (z7Var3 != null) {
                            sbVarE.Y0.setText(z7Var3.C0);
                        }
                        sbVarE.L(new lh.s9(sbVarE, 7), j12);
                        sbVarE.X0.b(true, false);
                        sbVarE.K(1, false);
                        sbVarE.l0(-1, false, false);
                        sbVarE.e();
                        sbVarE.f16797r0 = 0L;
                        sbVarE.f16801s0 = "";
                    }
                }
                sbVarE.M = new jh.v1(e4Var3, 12);
                sbVarE.N = new jh.b2(i10, e4Var3, sbVarE);
                return;
            case 23:
                jh.x3 x3Var = (jh.x3) this.f9731b;
                jh.i9 i9Var = (jh.i9) this.f9732c;
                x3Var.getClass();
                ((jh.z8) x3Var.f14128l.M1).h(new ag.g2(i9Var.f13478f, 14, false));
                return;
            case 24:
                jh.n4 n4Var = (jh.n4) this.f9731b;
                String str4 = (String) this.f9732c;
                n4Var.h = null;
                jh.c5 c5Var = n4Var.f13697n;
                c5Var.M = false;
                c5Var.K.f13747c = str4.toLowerCase();
                jh.c5.b(c5Var);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.f9731b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9732c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error2 == null));
                    return;
                }
                return;
            case 26:
                jh.d6 d6Var = (jh.d6) this.f9731b;
                TLObject tLObject3 = (TLObject) this.f9732c;
                jh.g6 g6Var = d6Var.f13548q;
                int i31 = d6Var.f13536c;
                ArrayList arrayList5 = d6Var.f13540i;
                d6Var.I = 0;
                if (tLObject3 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject3;
                    MessagesController.getInstance(i31).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i31).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList6 = tL_foundStories.stories;
                    int size2 = arrayList6.size();
                    int i32 = 0;
                    while (i32 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList6.get(i32);
                        i32++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList5.size();
                        MessageObject messageObject3 = new MessageObject(i31, tL_foundStory2.storyItem);
                        messageObject3.generateThumbs(false);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(Integer.valueOf(arrayList5.size()));
                        d6Var.F.add(arrayList7);
                        arrayList5.add(messageObject3);
                    }
                    d6Var.J = Math.max(arrayList5.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d6Var.J = arrayList5.size();
                    }
                    if (arrayList5.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d6Var.H = str;
                    d6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(g6Var);
                    AndroidUtilities.runOnUIThread(g6Var);
                    return;
                }
                return;
            case 27:
                jh.f6 f6Var = (jh.f6) this.f9731b;
                List list = (List) this.f9732c;
                ArrayList arrayList8 = f6Var.h;
                arrayList8.clear();
                arrayList8.addAll(list);
                f6Var.d = true;
                f6Var.f13326e = false;
                f6Var.d();
                NotificationCenter.getInstance(f6Var.f13323a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f6Var.f13324b), f6Var);
                return;
            case 28:
                jh.f6 f6Var2 = (jh.f6) this.f9731b;
                TLObject tLObject4 = (TLObject) this.f9732c;
                ArrayList arrayList9 = f6Var2.f13328g;
                ArrayList arrayList10 = f6Var2.h;
                if (!(tLObject4 instanceof TL_stories.TL_albums)) {
                    if (tLObject4 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList10.clear();
                        arrayList10.addAll(arrayList9);
                        f6Var2.f13327f = true;
                        f6Var2.f13326e = false;
                        NotificationCenter.getInstance(f6Var2.f13323a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f6Var2.f13324b), f6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject4;
                ArrayList arrayList11 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList12 = tL_albums.albums;
                int size3 = arrayList12.size();
                int i33 = 0;
                while (i33 < size3) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList12.get(i33);
                    i33++;
                    arrayList11.add(jh.k6.a(tL_storyAlbum));
                }
                arrayList10.clear();
                arrayList10.addAll(arrayList11);
                arrayList9.clear();
                arrayList9.addAll(arrayList11);
                f6Var2.f13327f = true;
                f6Var2.f13326e = false;
                f6Var2.f(true);
                return;
            default:
                jh.j6 j6Var = (jh.j6) this.f9731b;
                Utilities.Callback callback3 = (Utilities.Callback) this.f9732c;
                j6Var.getClass();
                callback3.run(j6Var);
                return;
        }
    }

    public m5(u7 u7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f9730a = 2;
        this.f9731b = zArr;
        this.f9732c = callback2;
    }
}
