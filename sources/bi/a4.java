package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class a4 implements Runnable {
    public final int f3443a;
    public final Object f3444b;
    public final Object f3445c;

    public a4(int i7, Object obj, Object obj2) {
        this.f3443a = i7;
        this.f3444b = obj;
        this.f3445c = obj2;
    }

    @Override
    public final void run() {
        ij messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z9;
        TLRPC.TL_messageReactions tL_messageReactions2;
        org.telegram.ui.Components.r5[] r5VarArr;
        org.telegram.ui.Components.r5[] r5VarArr2;
        di.g1 g1Var;
        int i7 = this.f3443a;
        Object obj = this.f3445c;
        Object obj2 = this.f3444b;
        switch (i7) {
            case 0:
                ((k7) obj2).k().f0((TLRPC.TL_error) obj, false);
                return;
            case 1:
                k7 k7Var = (k7) obj2;
                org.telegram.ui.Components.hc.a0((an) obj).L(2131624033, org.telegram.messenger.hd.M0(2131745097, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745095, org.telegram.messenger.m5.t(k7Var.P1))), org.telegram.messenger.hd.M0(2131745096, null), new z1(k7Var, 8)).k(true);
                return;
            case 2:
                k7 k7Var2 = (k7) obj2;
                k7Var2.getClass();
                ((boolean[]) obj)[0] = true;
                k7Var2.f4168c2.setLoading(false);
                k7Var2.t1();
                return;
            case 3:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131749617, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((k7) obj2).k(), 2131624051, 36);
                return;
            case 4:
                ((k7) obj2).o2((CharSequence) obj);
                return;
            case 5:
                p7 p7Var = (p7) obj2;
                an anVar = (an) obj;
                org.telegram.ui.Cells.z zVar = p7Var.f4519b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    p7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = p7Var.f4519b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f23237k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f23237k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    ca caVar = ea.y(messageObject.I1, false).B;
                    if (caVar != null) {
                        caVar.b();
                    }
                    TLRPC.ChatFull chatFull = anVar.f43892p8;
                    Context context = p7Var.getContext();
                    int currentAccount = anVar.getCurrentAccount();
                    long a10 = anVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    ij ijVar = messageObject;
                    ce ceVar = new ce(context, currentAccount, a10, anVar, ijVar, arrayList2, z9, false, 0L, anVar.getResourceProvider());
                    ijVar.f1();
                    org.telegram.ui.Cells.z zVar3 = p7Var.f4519b;
                    ceVar.M1 = anVar;
                    ceVar.N1 = zVar3;
                    ceVar.show();
                    return;
                }
                return;
            case 6:
                TLObject tLObject = (TLObject) obj2;
                ai.i iVar = (ai.i) obj;
                if (tLObject instanceof TL_stars.StarGifts) {
                    iVar.a((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    iVar.a(null);
                    return;
                }
            case 7:
                boolean[] zArr = (boolean[]) obj2;
                v10 v10Var = (v10) obj;
                if (!zArr[0]) {
                    v10Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 8:
                v9 v9Var = (v9) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = v9Var.f4915l;
                int i10 = v9Var.f4906a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    qp.s1(i10).Y3(tL_payments_savedStarGifts.users, false);
                    qp.s1(i10).S3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i11 = 0;
                        while (i11 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i11)).pinned_to_top) {
                            i11++;
                        }
                        arrayList3.add(i11, savedStarGift);
                        qs.f(i10).k(230, Long.valueOf(v9Var.f4907b), v9Var);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((qp) obj2).O3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 10:
                new org.telegram.ui.Components.hc(((org.telegram.ui.ActionBar.v2[]) obj2)[0].E, (org.telegram.ui.ActionBar.f6) obj).Q(2131623993, 36, org.telegram.messenger.hd.M0(2131744948, null)).k(false);
                return;
            case 11:
                ce ceVar2 = (ce) obj2;
                ceVar2.K1 = true;
                ceVar2.J0(new aa((ca) obj, 2));
                org.telegram.messenger.g0.i3(new ed(ceVar2, 1), 240L);
                return;
            case 12:
                ((c1.e) obj2).f().a(((kotlin.jvm.internal.r) obj).f17612a);
                return;
            case 13:
                ((c1.e) obj2).f().a((w0.h) obj);
                return;
            case 14:
                ((c1.e) obj2).f().onResult((v0.o) obj);
                return;
            case 15:
                ch.o oVar = (ch.o) obj2;
                org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                for (org.telegram.ui.Components.r5 r5Var2 : (org.telegram.ui.Components.r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.r5.class)) {
                    if (r5Var2 == r5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(r5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(r5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i12 = spanEnd - spanStart;
                        ch.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i12;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 16:
                ch.o oVar2 = (ch.o) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (oVar2.W != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    ch.q0.f(-oVar2.S, oVar2.X, oVar2.W);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = org.telegram.messenger.hd.G(oVar2.N, "ReactionMaxCountError", new Object[0]);
                }
                org.telegram.ui.Components.hc.a0(oVar2).t(str, null).j();
                return;
            case 17:
                org.telegram.ui.Components.r5 r5Var3 = (org.telegram.ui.Components.r5) obj;
                ch.o oVar3 = ((ch.m) obj2).f6308f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (org.telegram.ui.Components.r5 r5Var4 : (org.telegram.ui.Components.r5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.r5.class)) {
                    if (r5Var4 == r5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(r5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(r5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i13 = spanEnd2 - spanStart2;
                        ch.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i13;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 18:
                ch.b0 b0Var = (ch.b0) obj2;
                ii0 ii0Var = (ii0) obj;
                b0Var.f6192l = true;
                b0Var.f6183a.invalidate();
                ii0Var.f34650c1 = false;
                ii0Var.invalidate();
                b0Var.c(true);
                return;
            case 19:
                ch.d0 d0Var = (ch.d0) obj2;
                ch.b bVar = (ch.b) obj;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            case 20:
                ch.p0 p0Var = (ch.p0) obj2;
                ch.m0 m0Var = (ch.m0) obj;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f6309a;
                org.telegram.ui.Cells.z zVar4 = p0Var.f6379w;
                if (com.google.android.recaptcha.internal.a.u(zVar4)) {
                    ((org.telegram.ui.Cells.p4) zVar4).e(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.X.c(false);
                p0Var.P = null;
                p0Var.Q = false;
                p0Var.R = null;
                return;
            case 21:
                v0.f fVar = (v0.f) obj;
                v0.g gVar = ((d1.e) obj2).f7941f;
                if (gVar != null) {
                    gVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 22:
                ((d3.e) ((q4.q) obj2).f53687c).h.a((e2.x1) obj);
                return;
            case 23:
                String str2 = h2.m0.f14112a;
                j2.n.U(((l2.c0) ((d3.h0) ((wf.b) obj2).f57539c)).f17771a.G, (l2.c) obj);
                return;
            case 24:
                e2.x1 x1Var = (e2.x1) obj;
                String str3 = h2.m0.f14112a;
                l2.i0 i0Var = ((l2.c0) ((d3.h0) ((wf.b) obj2).f57539c)).f17771a;
                i0Var.f17867k0 = x1Var;
                i0Var.f17870m.e(25, new l2.b0(x1Var));
                return;
            case 25:
                String str4 = h2.m0.f14112a;
                m2.e eVar = ((l2.c0) ((d3.h0) ((wf.b) obj2).f57539c)).f17771a.f17881s;
                m2.a U = eVar.U();
                eVar.V(U, 1030, new hi.x3(U, (Exception) obj, 26));
                return;
            case 26:
                String str5 = h2.m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((d3.h0) ((wf.b) obj2).f57539c)).f17771a.f17881s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1019, new m2.c(U2, (String) obj, 3));
                return;
            case 27:
                ((di.p9) obj2).N(ProfileActivity.A4(((di.s0) obj).f9738c));
                return;
            case 28:
                di.g2 g2Var = (di.g2) obj2;
                org.telegram.messenger.g0.g(((di.n0) obj).f9384w);
                if (org.telegram.messenger.g0.I3()) {
                    Toast.makeText(g2Var.getContext(), org.telegram.messenger.hd.M0(2131744195, null), 0).show();
                    return;
                }
                return;
            default:
                di.g2 g2Var2 = (di.g2) obj2;
                di.s0 s0Var = (di.s0) obj;
                long j3 = s0Var.f9738c;
                di.i4 i4Var = g2Var2.f9034i0;
                if (j3 != p10.i(i4Var.f9168l2).e() && ((g1Var = g2Var2.f9033h0.A0) == null || j3 != org.telegram.messenger.m5.o(g1Var.i()))) {
                    if (i4Var.f9215x3 != null) {
                        for (int i14 = 0; i14 < i4Var.f9215x3.peers.size(); i14++) {
                            if (j3 != org.telegram.messenger.m5.o(i4Var.f9215x3.peers.get(i14).peer)) {
                            }
                        }
                    }
                    Context context2 = g2Var2.getContext();
                    long j10 = s0Var.f9738c;
                    di.b0 b0Var2 = new di.b0(0, g2Var2, s0Var);
                    di.i0 i0Var2 = new di.i0(1);
                    org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context2, (org.telegram.ui.ActionBar.f6) i0Var2, false);
                    v2Var.N();
                    LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                    TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.f27956j5, i0Var2);
                    g10.setTypeface(org.telegram.messenger.g0.o());
                    g10.setText(org.telegram.messenger.hd.M0(2131751497, null));
                    f10.addView(g10, c8.ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i0Var2);
                    n4Var.setText(org.telegram.messenger.hd.M0(2131751594, null));
                    f10.addView(n4Var, c8.ha.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var2);
                    wo checkBoxRound = c2Var.getCheckBoxRound();
                    int i15 = org.telegram.ui.ActionBar.k6.V6;
                    int i16 = org.telegram.ui.ActionBar.k6.f27904g7;
                    int i17 = org.telegram.ui.ActionBar.k6.f27978k7;
                    checkBoxRound.b(i15, i16, i17);
                    c2Var.e(org.telegram.messenger.hd.M0(2131751503, null), null, false, true, false);
                    c2Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var2 = c2Var;
                                    c2Var2.c(!c2Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                    c2Var3.c(!c2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i18 = org.telegram.ui.ActionBar.k6.f27940i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, i0Var2), 2, -1);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
                    c2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, i0Var2);
                    f10.addView(c2Var, c8.ha.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var2);
                    c2Var2.getCheckBoxRound().b(i15, i16, i17);
                    c2Var2.e(org.telegram.messenger.hd.a0(null, null, 2131751588, org.telegram.messenger.m5.l(p10.f24459s0, j10)), null, false, true, false);
                    c2Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var22 = c2Var2;
                                    c2Var22.c(!c2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var2;
                                    c2Var3.c(!c2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var2;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, i0Var2), 2, -1);
                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
                    c2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.r6.k(c2Var2, h03, null, N2, i0Var2);
                    f10.addView(c2Var2, c8.ha.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(context2, 4, 21, true, i0Var2);
                    c2Var3.getCheckBoxRound().b(i15, i16, i17);
                    c2Var3.e(org.telegram.messenger.hd.a0(null, null, 2131751569, org.telegram.messenger.m5.l(p10.f24459s0, j10)), null, false, false, false);
                    c2Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var22 = c2Var3;
                                    c2Var22.c(!c2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var32 = c2Var3;
                                    c2Var32.c(!c2Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var3;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, i0Var2), 2, -1);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i18);
                    c2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.r6.k(c2Var3, h04, null, N3, i0Var2);
                    f10.addView(c2Var3, c8.ha.o(-1, -2));
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context2, i0Var2);
                    z8Var.setBackgroundColor(-16777216);
                    z8Var.setFixedSize(12);
                    f10.addView(z8Var, c8.ha.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    fi.d dVar = new fi.d(context2, i0Var2, true);
                    dVar.i(org.telegram.messenger.hd.M0(2131751514, null), false, true);
                    dVar.setOnClickListener(new di.d0(c2Var, c2Var2, c2Var3, b0Var2, v2Var, 0));
                    frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, c8.ha.o(-1, -2));
                    v2Var.N = f10;
                    v2Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = g2Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f9736a));
                ConnectionsManager.getInstance(g2Var2.N).sendRequest(deletegroupcallmessages, null);
                g2Var2.c(s0Var.f9736a);
                return;
        }
    }

    public a4(ea eaVar, boolean[] zArr, v10 v10Var) {
        this.f3443a = 7;
        this.f3444b = zArr;
        this.f3445c = v10Var;
    }
}
