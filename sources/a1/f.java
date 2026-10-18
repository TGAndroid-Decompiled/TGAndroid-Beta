package a1;

import ah.g1;
import ah.j1;
import ah.l1;
import ah.t0;
import ah.w;
import ah.w0;
import ah.y;
import ai.d2;
import ai.fa;
import ai.ga;
import ai.i0;
import ai.k7;
import ai.le;
import ai.p7;
import ai.r0;
import ai.y9;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.a2;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import i2.a0;
import i2.b0;
import i2.h0;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import v0.i;
public final class f implements Runnable {
    public final int f41a;
    public final Object f42b;
    public final Object f43c;

    public f(int i10, Object obj, Object obj2) {
        this.f41a = i10;
        this.f42b = obj;
        this.f43c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        xc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z12;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.f41a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i13 = 0;
        Object obj = this.f43c;
        Object obj2 = this.f42b;
        switch (i12) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) obj2, (Exception) obj);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) obj2, (p) obj);
                return;
            case 2:
                ((a3.f) ((qf.b) obj2).f44486c).h.onVideoSizeChanged((a2) obj);
                return;
            case 3:
                String str = m0.f8255a;
                s.i(((b0) ((a3.m0) ((s) obj2).f17129c)).f12324a.G, (i2.c) obj);
                return;
            case 4:
                a2 a2Var = (a2) obj;
                String str2 = m0.f8255a;
                h0 h0Var = ((b0) ((a3.m0) ((s) obj2).f17129c)).f12324a;
                h0Var.f12398k0 = a2Var;
                h0Var.f12401m.e(25, new a0(a2Var));
                return;
            case 5:
                String str3 = m0.f8255a;
                j2.f fVar = ((b0) ((a3.m0) ((s) obj2).f17129c)).f12324a.f12412s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new j2.c(p5, (Exception) obj, 0));
                return;
            case 6:
                String str4 = m0.f8255a;
                j2.f fVar2 = ((b0) ((a3.m0) ((s) obj2).f17129c)).f12324a.f12412s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1019, new j2.c(p9, (String) obj, 7));
                return;
            case 7:
                ah.a0 a0Var = (ah.a0) obj2;
                a6 a6Var = (a6) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var.f645n.getText());
                a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class);
                int length = a6VarArr.length;
                while (i13 < length) {
                    a6 a6Var2 = a6VarArr[i13];
                    if (a6Var2 == a6Var) {
                        int editTextSelectionEnd = a0Var.f645n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(a6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(a6Var2);
                        a0Var.f645n.getText().delete(spanStart, spanEnd);
                        int i14 = spanEnd - spanStart;
                        w wVar = a0Var.f645n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i14;
                        }
                        wVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i13++;
                }
                return;
            case 8:
                ah.a0 a0Var2 = (ah.a0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (a0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    l1.f(-a0Var2.M, a0Var2.R, a0Var2.Q);
                    return;
                }
                String str5 = tL_error.text;
                if (str5.equals("REACTIONS_TOO_MANY")) {
                    str5 = LocaleController.formatPluralString("ReactionMaxCountError", a0Var2.J, new Object[0]);
                }
                xc.a0(a0Var2).t(str5, null).j();
                return;
            case 9:
                a6 a6Var3 = (a6) obj;
                ah.a0 a0Var3 = ((y) obj2).f908e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a0Var3.f645n.getText());
                a6[] a6VarArr2 = (a6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), a6.class);
                int length2 = a6VarArr2.length;
                while (i13 < length2) {
                    a6 a6Var4 = a6VarArr2[i13];
                    if (a6Var4 == a6Var3) {
                        int editTextSelectionEnd2 = a0Var3.f645n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(a6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(a6Var4);
                        a0Var3.f645n.getText().delete(spanStart2, spanEnd2);
                        int i15 = spanEnd2 - spanStart2;
                        w wVar2 = a0Var3.f645n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i15;
                        }
                        wVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                    i13++;
                }
                return;
            case 10:
                t0 t0Var = (t0) obj2;
                cl0 cl0Var = (cl0) obj;
                t0Var.f878l = true;
                t0Var.f870a.invalidate();
                cl0Var.f25269b1 = false;
                cl0Var.invalidate();
                t0Var.c(true);
                return;
            case 11:
                w0 w0Var = (w0) obj2;
                ah.c cVar = (ah.c) obj;
                w0Var.getText().delete(w0Var.getText().getSpanStart(cVar), w0Var.getText().getSpanEnd(cVar));
                w0Var.setCursorVisible(true);
                w0Var.setLongClickable(true);
                return;
            case 12:
                j1 j1Var = (j1) obj2;
                g1 g1Var = (g1) obj;
                j1Var.getClass();
                TLRPC.ReactionCount reactionCount = g1Var.f742a;
                org.telegram.ui.Cells.a0 a0Var4 = j1Var.f814z;
                if (k3.s(a0Var4)) {
                    ((n4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                g1Var.Y.c(false);
                j1Var.S = null;
                j1Var.T = false;
                j1Var.U = null;
                return;
            case 13:
                ai.h0 h0Var2 = (ai.h0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = h0Var2.f1388a;
                ArrayList arrayList2 = h0Var2.e;
                h0Var2.f1393i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (h0Var2.f1390c <= 0) {
                        arrayList2.clear();
                    }
                    h0Var2.f1390c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < h0Var2.f1390c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    h0Var2.d = z10;
                } else {
                    h0Var2.h = true;
                    h0Var2.d = true;
                }
                h0Var2.f1392g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(h0Var2.f1389b));
                return;
            case 14:
                i0 i0Var = (i0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i17 = i0Var.f1454a;
                ArrayList arrayList3 = i0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (i0Var.f1456c <= 0) {
                        arrayList3.clear();
                    }
                    i0Var.f1456c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    i0Var.f1460j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < i0Var.f1456c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    i0Var.d = z11;
                } else {
                    i0Var.f1459i = true;
                    i0Var.d = true;
                }
                i0Var.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(i0Var.f1455b));
                return;
            case 15:
                k7.C0((k7) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 16:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ((b2) obj2).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = xc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = xc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    g0.q(i11, a02, i10, 36);
                    return;
                }
                return;
            case 17:
                k7.O0((k7) obj2, (Long) obj);
                return;
            case 18:
                k7 k7Var = (k7) obj2;
                if (!((ga) obj).e) {
                    qc Q = k7Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f29655t = true;
                    Q.j();
                    return;
                }
                k7Var.f1671k0.setLoading(false);
                k7Var.K1();
                return;
            case 19:
                MessagesController.getInstance(((k7) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 20:
                ((k7) obj2).getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                return;
            case 21:
                k7 k7Var2 = (k7) obj2;
                xc.a0((sn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(k7Var2.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new d2(k7Var2, 10)).k(true);
                return;
            case 22:
                k7 k7Var3 = (k7) obj2;
                k7Var3.getClass();
                ((boolean[]) obj)[0] = true;
                k7Var3.f1671k0.setLoading(false);
                k7Var3.K1();
                return;
            case 23:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((k7) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 24:
                ((k7) obj2).K2((CharSequence) obj);
                return;
            case 25:
                p7 p7Var = (p7) obj2;
                sn snVar = (sn) obj;
                org.telegram.ui.Cells.a0 a0Var5 = p7Var.f2015b;
                if (a0Var5 != null) {
                    try {
                        a0Var5.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    p7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var6 = p7Var.f2015b;
                    if (a0Var6 instanceof u1) {
                        messageObject = ((u1) a0Var6).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var6 instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) a0Var6).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    fa faVar = ga.y(messageObject2.currentAccount, false).B;
                    if (faVar != null) {
                        faVar.b();
                    }
                    TLRPC.ChatFull chatFull = snVar.Z7;
                    Context context = p7Var.getContext();
                    int currentAccount = snVar.getCurrentAccount();
                    long a2 = snVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    le leVar = new le(context, currentAccount, a2, snVar, messageObject2, arrayList4, z12, false, 0L, snVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var7 = p7Var.f2015b;
                    leVar.U = snVar;
                    leVar.V = a0Var7;
                    leVar.show();
                    return;
                }
                return;
            case 26:
                TLObject tLObject3 = (TLObject) obj2;
                r0 r0Var = (r0) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    r0Var.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    r0Var.run(null);
                    return;
                }
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                y9 y9Var = (y9) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = y9Var.f2498l;
                int i18 = y9Var.f2490a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i19 = 0;
                        while (i19 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i19)).pinned_to_top) {
                            i19++;
                        }
                        arrayList5.add(i19, savedStarGift);
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.f2491b), y9Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f(ga gaVar, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f41a = 27;
        this.f42b = zArr;
        this.f43c = callback2;
    }
}
