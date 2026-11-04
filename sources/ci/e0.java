package ci;

import android.content.Context;
import android.media.AudioManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.li0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class e0 implements Runnable {
    public final int f4995a;
    public final Object f4996b;
    public final Object f4997c;

    public e0(int i3, Object obj, Object obj2) {
        this.f4995a = i3;
        this.f4997c = obj;
        this.f4996b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.fc a02;
        int i3;
        String str;
        String a03;
        TLRPC.Chat M0;
        zi messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z12;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i10 = this.f4995a;
        int i11 = 2131624011;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i12 = 0;
        Object obj = this.f4996b;
        Object obj2 = this.f4997c;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = f0Var.f5060a;
                ArrayList arrayList2 = f0Var.f5063e;
                f0Var.f5066i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    hp.s1(i13).Y3(connectedstarrefbots.users, false);
                    if (f0Var.f5062c <= 0) {
                        arrayList2.clear();
                    }
                    f0Var.f5062c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < f0Var.f5062c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    f0Var.d = z10;
                } else {
                    f0Var.h = true;
                    f0Var.d = true;
                }
                f0Var.f5065g = false;
                hs.f(i13).k(236, Long.valueOf(f0Var.f5061b));
                return;
            case 1:
                g0 g0Var = (g0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i14 = g0Var.f5148a;
                ArrayList arrayList3 = g0Var.f5151e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    hp.s1(i14).Y3(suggestedstarrefbots.users, false);
                    if (g0Var.f5150c <= 0) {
                        arrayList3.clear();
                    }
                    g0Var.f5150c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    g0Var.f5155j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < g0Var.f5150c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    g0Var.d = z11;
                } else {
                    g0Var.f5154i = true;
                    g0Var.d = true;
                }
                g0Var.h = false;
                hs.f(i14).k(235, Long.valueOf(g0Var.f5149b));
                return;
            case 2:
                l6.g1((l6) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.s1) obj2).dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = org.telegram.ui.Components.fc.a0(T);
                        i11 = 2131624020;
                        i3 = 2131743890;
                    } else {
                        a02 = org.telegram.ui.Components.fc.a0(T);
                        i3 = 2131743891;
                    }
                    org.telegram.messenger.k5.o(null, i3, a02, i11, 36);
                    return;
                }
                return;
            case 4:
                l6 l6Var = (l6) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() < 0 && (M0 = hp.s1(l6Var.f28583a).M0(Long.valueOf(-l10.longValue()))) != null) {
                    str = M0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.fc k10 = l6Var.k();
                if (TextUtils.isEmpty(str)) {
                    a03 = bd.M0(2131749624, null);
                } else {
                    a03 = bd.a0(null, null, 2131749625, str);
                }
                org.telegram.ui.Components.ac Q = k10.Q(2131623989, 36, org.telegram.messenger.g0.X2(a03));
                Q.f31802t = true;
                Q.j();
                return;
            case 5:
                l6 l6Var2 = (l6) obj2;
                if (!((e9) obj).f5032e) {
                    org.telegram.ui.Components.ac Q2 = l6Var2.k().Q(2131624011, 36, bd.a0(null, null, 2131743888, "NO_BALANCE"));
                    Q2.f31802t = true;
                    Q2.j();
                    return;
                }
                l6Var2.f5451d2.setLoading(false);
                l6Var2.t1();
                return;
            case 6:
                hp.s1(((l6) obj2).f28583a).O3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 7:
                ((l6) obj2).k().f0((TLRPC.TL_error) obj, false);
                return;
            case 8:
                l6 l6Var3 = (l6) obj2;
                org.telegram.ui.Components.fc.a0((wm) obj).L(2131624033, bd.M0(2131745106, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131745104, org.telegram.messenger.m5.t(l6Var3.Q1))), bd.M0(2131745105, null), new s1(l6Var3, 8)).k(true);
                return;
            case 9:
                l6 l6Var4 = (l6) obj2;
                l6Var4.getClass();
                ((boolean[]) obj)[0] = true;
                l6Var4.f5451d2.setLoading(false);
                l6Var4.t1();
                return;
            case 10:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131749626, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((l6) obj2).k(), 2131624051, 36);
                return;
            case 11:
                ((l6) obj2).o2((CharSequence) obj);
                return;
            case 12:
                q6 q6Var = (q6) obj2;
                wm wmVar = (wm) obj;
                org.telegram.ui.Cells.z zVar = q6Var.f5833b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    q6Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = q6Var.f5833b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f26868k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f26868k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    c9 c9Var = e9.y(messageObject.I1, false).B;
                    if (c9Var != null) {
                        c9Var.b();
                    }
                    TLRPC.ChatFull chatFull = wmVar.f51453q8;
                    Context context = q6Var.getContext();
                    int currentAccount = wmVar.getCurrentAccount();
                    long a10 = wmVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    zi ziVar = messageObject;
                    tc tcVar = new tc(context, currentAccount, a10, wmVar, ziVar, arrayList4, z12, false, 0L, wmVar.getResourceProvider());
                    ziVar.f1();
                    org.telegram.ui.Cells.z zVar3 = q6Var.f5833b;
                    tcVar.N1 = wmVar;
                    tcVar.O1 = zVar3;
                    tcVar.show();
                    return;
                }
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                ai.v2 v2Var = (ai.v2) obj2;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    v2Var.a((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    v2Var.a(null);
                    return;
                }
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                n10 n10Var = (n10) obj;
                if (!zArr[0]) {
                    n10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 15:
                v8 v8Var = (v8) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = v8Var.f6203l;
                int i15 = v8Var.f6194a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    hp.s1(i15).Y3(tL_payments_savedStarGifts.users, false);
                    hp.s1(i15).S3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i16 = 0;
                        while (i16 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i16)).pinned_to_top) {
                            i16++;
                        }
                        arrayList5.add(i16, savedStarGift);
                        hs.f(i15).k(230, Long.valueOf(v8Var.f6195b), v8Var);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((hp) obj2).O3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 17:
                new org.telegram.ui.Components.fc(((org.telegram.ui.ActionBar.t2[]) obj2)[0].F, (org.telegram.ui.ActionBar.e6) obj).Q(2131623993, 36, bd.M0(2131744957, null)).k(false);
                return;
            case 18:
                tc tcVar2 = (tc) obj2;
                tcVar2.L1 = true;
                tcVar2.J0(new a9((c9) obj, 2));
                org.telegram.messenger.g0.i3(new xb(tcVar2, 1), 240L);
                return;
            case 19:
                v0.f fVar = (v0.f) obj;
                v0.h hVar = ((d1.e) obj2).f7996f;
                if (hVar != null) {
                    hVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 20:
                dh.o oVar = (dh.o) obj2;
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p5.class);
                int length = p5VarArr.length;
                while (i12 < length) {
                    org.telegram.ui.Components.p5 p5Var2 = p5VarArr[i12];
                    if (p5Var2 == p5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(p5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(p5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i17 = spanEnd - spanStart;
                        dh.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i17;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i12++;
                }
                return;
            case 21:
                dh.o oVar2 = (dh.o) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (oVar2.X != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    dh.p0.f(-oVar2.T, oVar2.Y, oVar2.X);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = bd.G(oVar2.O, "ReactionMaxCountError", new Object[0]);
                }
                org.telegram.ui.Components.fc.a0(oVar2).t(str2, null).j();
                return;
            case 22:
                org.telegram.ui.Components.p5 p5Var3 = (org.telegram.ui.Components.p5) obj;
                dh.o oVar3 = ((dh.m) obj2).f9090g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                org.telegram.ui.Components.p5[] p5VarArr2 = (org.telegram.ui.Components.p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.p5.class);
                int length2 = p5VarArr2.length;
                while (i12 < length2) {
                    org.telegram.ui.Components.p5 p5Var4 = p5VarArr2[i12];
                    if (p5Var4 == p5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(p5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(p5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i18 = spanEnd2 - spanStart2;
                        dh.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i18;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                    i12++;
                }
                return;
            case 23:
                dh.a0 a0Var = (dh.a0) obj2;
                li0 li0Var = (li0) obj;
                a0Var.f8940l = true;
                a0Var.f8931a.invalidate();
                li0Var.f35743d1 = false;
                li0Var.invalidate();
                a0Var.c(true);
                return;
            case 24:
                dh.c0 c0Var = (dh.c0) obj2;
                dh.b bVar = (dh.b) obj;
                c0Var.getText().delete(c0Var.getText().getSpanStart(bVar), c0Var.getText().getSpanEnd(bVar));
                c0Var.setCursorVisible(true);
                c0Var.setLongClickable(true);
                return;
            case 25:
                dh.o0 o0Var = (dh.o0) obj2;
                dh.l0 l0Var = (dh.l0) obj;
                o0Var.getClass();
                TLRPC.ReactionCount reactionCount = l0Var.f9060a;
                org.telegram.ui.Cells.z zVar4 = o0Var.f9131w;
                if (com.google.android.recaptcha.internal.a.u(zVar4)) {
                    ((org.telegram.ui.Cells.p4) zVar4).e(reactionCount, true, 0.0f, 0.0f);
                }
                l0Var.X.c(false);
                o0Var.P = null;
                o0Var.Q = false;
                o0Var.R = null;
                return;
            case 26:
                ((v0.h) obj2).a((w0.d) obj);
                return;
            case 27:
                ((v0.h) obj2).onResult((v0.f) obj);
                return;
            case 28:
                v0.c cVar = (v0.c) obj;
                v0.h hVar2 = ((e1.d) obj2).f9323f;
                if (hVar2 != null) {
                    hVar2.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            default:
                e2.h.f9348a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((g2.j) obj).e();
                return;
        }
    }

    public e0(e9 e9Var, boolean[] zArr, n10 n10Var) {
        this.f4995a = 14;
        this.f4997c = zArr;
        this.f4996b = n10Var;
    }

    public e0(TLObject tLObject, ai.v2 v2Var) {
        this.f4995a = 13;
        this.f4996b = tLObject;
        this.f4997c = v2Var;
    }
}
