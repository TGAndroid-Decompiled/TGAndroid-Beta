package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Components.e;
import org.telegram.ui.Components.l;
import org.telegram.ui.PremiumPreviewFragment;
public final class lx1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public lx1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        gn[] gnVarArr;
        gn[] gnVarArr2;
        Bitmap bitmap = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                int i = ChatActivityEnterView.z7;
                chatActivityEnterView.setFieldText((CharSequence) this.c);
                chatActivityEnterView.a0 = null;
                return;
            case 1:
                ((alc) this.b).a((vm3) this.c);
                return;
            case 2:
                c cVar = (c) this.b;
                cVar.getClass();
                gm.B2((hlc) this.c);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                chatActivityEnterView2.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 3:
                ((e) this.b).onAnimationEnd((Animator) this.c);
                return;
            case 4:
                fo1 fo1Var = (fo1) this.c;
                ChatActivityEnterView chatActivityEnterView3 = ((l) this.b).Q0;
                chatActivityEnterView3.Y1 = chatActivityEnterView3.i1.getAudioRightMs() - chatActivityEnterView3.i1.getAudioLeftMs();
                MediaController w = MediaController.w();
                long audioLeftMs = chatActivityEnterView3.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView3.i1.getAudioRightMs();
                if (w.I1) {
                    u30 u30Var = w.G1;
                    if (u30Var != null) {
                        h40 h40Var = (h40) u30Var.e;
                        h40Var.getClass();
                        h40.q();
                        if (h40Var.G == 5) {
                            long j = h40Var.j();
                            long max = Math.max(0L, Math.min(j, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j, audioRightMs));
                            if (max2 - max >= Math.min(h40Var.c, j)) {
                                h40Var.r = max;
                                h40Var.s = max2;
                                h74 h74Var = h40Var.A;
                                if (h74Var != null) {
                                    h74Var.k1(max);
                                }
                                h40Var.f.getClass();
                                h40Var.m();
                                gm.c3(fo1Var);
                                return;
                            }
                        }
                    }
                    wi8.q(audioRightMs, wi8.o(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    gm.c3(fo1Var);
                    return;
                } else if (w.k1 == null) {
                    gm.c3(fo1Var);
                    return;
                } else {
                    w.N1.c(new ev4(w, new rn6(bc4.z(1), System.currentTimeMillis() + "_" + bc4.r(null, w.g1), (byte) 0), audioLeftMs, audioRightMs, fo1Var, (byte) 5));
                    return;
                }
            case 5:
                ((i22) this.b).b.removeView((hg5) this.c);
                return;
            case 6:
                d dVar = (d) this.c;
                ((i22) this.b).a(true);
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!((i22) this.b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    gm.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                i22 i22Var = (i22) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((b22) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                i22Var.x1(tL_attachMenuBot.bot_id, null, false, true);
                hs6 d0 = hs6.d0(i22Var.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
                if (tL_attachMenuBots != null) {
                    d0.getMessagesStorage().a.c(new o77(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
                    return;
                }
                return;
            case 9:
                i22 i22Var2 = (i22) this.b;
                hs6.d0(i22Var2.G3).G0(false, true, null);
                if (i22Var2.v2 == i22Var2.u2.get(((TLRPC.TL_attachMenuBot) this.c).bot_id)) {
                    i22Var2.A1(i22Var2.d2);
                    return;
                }
                return;
            case 10:
                s22 s22Var = (s22) this.b;
                s22Var.H = false;
                s22Var.I = (ArrayList) this.c;
                s22Var.S();
                return;
            case 11:
                e32 e32Var = (e32) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!e32Var.U) {
                    if (tL_error != null) {
                        e32Var.b.dismiss();
                        return;
                    } else {
                        gm.d3(e32Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 12:
                e32 e32Var2 = (e32) this.b;
                u31 Q = new c41(e32Var2.b.c, e32Var2.a).Q(2131623990, 36, gm.S2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 13:
                gm.c3(new lx1((v32) this.b, ((u32) this.c).run(), (byte) 14));
                return;
            case 14:
                ((v32) this.b).setStatus((CharSequence) this.c);
                return;
            case 15:
                o42 o42Var = (o42) this.b;
                String str = (String) this.c;
                o42Var.getClass();
                ArrayList arrayList = new ArrayList(o42Var.Y.w.e);
                if (o42Var.Y.w.f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) o42Var.Y.w.h);
                }
                Utilities.g.c(new rh(o42Var, str, !o42Var.S.isEmpty(), arrayList, (byte) 8));
                return;
            case 16:
                o42 o42Var2 = (o42) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                p42 p42Var = o42Var2.Y;
                boolean z3 = p42Var.c0;
                d42 d42Var = p42Var.r;
                if (z3) {
                    y59 adapter = d42Var.getAdapter();
                    o42 o42Var3 = p42Var.E;
                    if (adapter != o42Var3) {
                        d42Var.setAdapter(o42Var3);
                    }
                }
                o42Var2.s = arrayList2;
                o42Var2.f();
                return;
            case 17:
                i22 i22Var3 = ((c52) this.b).b;
                i22Var3.dismiss();
                i22Var3.Z1.presentFragment(yv1.ga(((TLRPC.User) this.c).id));
                return;
            case 18:
                ts2.u(null, 2131742884, new c41((c52) this.b, (ylb) this.c), 2131623994, 36);
                return;
            case 19:
                float[] fArr = (float[]) this.c;
                ((n52) this.b).g0(fArr[0], fArr[1]);
                return;
            case 20:
                a22 a22Var = (a22) this.c;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = a22Var.getCurrentItemTop();
                int listTopPadding = a22Var.getListTopPadding();
                d62 d62Var = ((ChatAttachAlertPhotoLayout) this.b).F;
                if (currentItemTop > gm.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                d62Var.scrollBy(0, listTopPadding);
                return;
            case 21:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                boolean z5 = ChatAttachAlertPhotoLayout.r1;
                m62 m62Var = ((ChatAttachAlertPhotoLayout) this.b).Q;
                if (m62Var != null) {
                    m62Var.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 22:
                a22 a22Var2 = (a22) this.c;
                int currentItemTop2 = a22Var2.getCurrentItemTop();
                int listTopPadding2 = a22Var2.getListTopPadding();
                fv fvVar = ((x62) this.b).r;
                if (currentItemTop2 > gm.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                fvVar.scrollBy(0, listTopPadding2);
                return;
            case 23:
                jac jacVar = (jac) this.c;
                lz5 a = lz5.a(((String[]) this.b)[0], gm.L(26.0f), false);
                if (a == null) {
                    a = lz5.a(jb6.M0(2131753972, null), gm.L(26.0f), false);
                } else {
                    z = false;
                }
                if (a != null) {
                    bitmap = a.a;
                }
                gm.c3(new np6(jacVar, bitmap, z, (byte) 13));
                return;
            case 24:
                n92 n92Var = (n92) this.b;
                gn gnVar = (gn) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n92Var.h.getText());
                for (gn gnVar2 : (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class)) {
                    if (gnVar2 == gnVar) {
                        int editTextSelectionEnd = n92Var.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(gnVar2);
                        int spanStart = spannableStringBuilder.getSpanStart(gnVar2);
                        n92Var.h.getText().delete(spanStart, spanEnd);
                        int i2 = spanEnd - spanStart;
                        k92 k92Var = n92Var.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i2;
                        }
                        k92Var.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 25:
                n92 n92Var2 = (n92) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (n92Var2.X != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    n39.f(-n92Var2.T, n92Var2.Y, n92Var2.X);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = jb6.G(n92Var2.O, "ReactionMaxCountError", new Object[0]);
                }
                c41.b0(n92Var2).t(str2, null).j();
                return;
            case 26:
                gn gnVar3 = (gn) this.c;
                n92 n92Var3 = ((l92) this.b).g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n92Var3.h.getText());
                for (gn gnVar4 : (gn[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gn.class)) {
                    if (gnVar4 == gnVar3) {
                        int editTextSelectionEnd2 = n92Var3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(gnVar4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(gnVar4);
                        n92Var3.h.getText().delete(spanStart2, spanEnd2);
                        int i3 = spanEnd2 - spanStart2;
                        k92 k92Var2 = n92Var3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i3;
                        }
                        k92Var2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 27:
                ba2 ba2Var = (ba2) this.b;
                ba2Var.getClass();
                ba2Var.presentFragment(xza.e0((TLRPC.Chat) this.c, true));
                return;
            case 28:
                qa2 qa2Var = (qa2) this.b;
                String str3 = (String) this.c;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = qa2Var.getMessagesController().g1(qa2Var.a0);
                qa2Var.i0 = qa2Var.getConnectionsManager().sendRequest(tL_channels_checkUsername, new eo0(qa2Var, str3, tL_channels_checkUsername, (byte) 18), 2);
                return;
            default:
                qa2 qa2Var2 = (qa2) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                z2 = (tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                qa2Var2.d0 = z2;
                if (!z2 && qa2Var2.getUserConfig().p() && !qa2Var2.e0 && qa2Var2.y != null) {
                    qa2Var2.e0 = true;
                    qa2Var2.h0();
                    qa2Var2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ca2(qa2Var2, (byte) 1));
                    return;
                }
                return;
        }
    }
}
