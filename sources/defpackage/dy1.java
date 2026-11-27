package defpackage;

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Components.f;
import org.telegram.ui.Components.l;
import org.telegram.ui.PremiumPreviewFragment;
public final class dy1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public dy1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        hm[] hmVarArr;
        hm[] hmVarArr2;
        boolean z = false;
        switch (this.a) {
            case 0:
                ((mnc) this.b).a((cm3) this.c);
                return;
            case 1:
                c cVar = (c) this.b;
                cVar.getClass();
                hl.B2((tnc) this.c);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                chatActivityEnterView.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 2:
                ((f) this.b).onAnimationEnd((Animator) this.c);
                return;
            case 3:
                go1 go1Var = (go1) this.c;
                ChatActivityEnterView chatActivityEnterView2 = ((l) this.b).U0;
                chatActivityEnterView2.X1 = chatActivityEnterView2.i1.getAudioRightMs() - chatActivityEnterView2.i1.getAudioLeftMs();
                MediaController z2 = MediaController.z();
                long audioLeftMs = chatActivityEnterView2.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView2.i1.getAudioRightMs();
                if (z2.I1) {
                    v20 v20Var = z2.G1;
                    if (v20Var != null) {
                        i30 i30Var = v20Var.b;
                        i30Var.getClass();
                        i30.q();
                        if (i30Var.G == 5) {
                            long j = i30Var.j();
                            long max = Math.max(0L, Math.min(j, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j, audioRightMs));
                            if (max2 - max >= Math.min(i30Var.c, j)) {
                                i30Var.r = max;
                                i30Var.s = max2;
                                s64 s64Var = i30Var.A;
                                if (s64Var != null) {
                                    s64Var.k1(max);
                                }
                                i30Var.f.getClass();
                                i30Var.m();
                                hl.c3(go1Var);
                                return;
                            }
                        }
                    }
                    ik8.q(audioRightMs, ik8.o(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    hl.c3(go1Var);
                    return;
                } else if (z2.k1 == null) {
                    hl.c3(go1Var);
                    return;
                } else {
                    z2.N1.c(new hv4(z2, new vn6(xb4.z(1), System.currentTimeMillis() + "_" + xb4.r(null, z2.g1), (byte) 0), audioLeftMs, audioRightMs, go1Var, (byte) 5));
                    return;
                }
            case 4:
                ((n12) this.b).b.removeView((kg5) this.c);
                return;
            case 5:
                e eVar = (e) this.c;
                ((n12) this.b).a(true);
                if (eVar != null) {
                    eVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!((n12) this.b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    hl.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 7:
                n12 n12Var = (n12) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((g12) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                n12Var.y1(tL_attachMenuBot.bot_id, null, false, true);
                ls6 d0 = ls6.d0(n12Var.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
                if (tL_attachMenuBots != null) {
                    d0.getMessagesStorage().a.c(new r77(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
                    return;
                }
                return;
            case 8:
                n12 n12Var2 = (n12) this.b;
                ls6.d0(n12Var2.G3).G0(false, true, null);
                if (n12Var2.v2 == n12Var2.u2.get(((TLRPC.TL_attachMenuBot) this.c).bot_id)) {
                    n12Var2.B1(n12Var2.d2);
                    return;
                }
                return;
            case 9:
                x12 x12Var = (x12) this.b;
                x12Var.H = false;
                x12Var.I = (ArrayList) this.c;
                x12Var.S();
                return;
            case 10:
                j22 j22Var = (j22) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!j22Var.U) {
                    if (tL_error != null) {
                        j22Var.b.dismiss();
                        return;
                    } else {
                        hl.d3(j22Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 11:
                j22 j22Var2 = (j22) this.b;
                v21 Q = new d31(j22Var2.b.c, j22Var2.a).Q(2131623990, 36, hl.S2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 12:
                hl.c3(new dy1((a32) this.b, ((z22) this.c).run(), (byte) 13));
                return;
            case 13:
                ((a32) this.b).setStatus((CharSequence) this.c);
                return;
            case 14:
                t32 t32Var = (t32) this.b;
                String str = (String) this.c;
                t32Var.getClass();
                ArrayList arrayList = new ArrayList(t32Var.Y.w.e);
                if (t32Var.Y.w.f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) t32Var.Y.w.h);
                }
                Utilities.g.c(new lg(t32Var, str, !t32Var.S.isEmpty(), arrayList, (byte) 8));
                return;
            case 15:
                t32 t32Var2 = (t32) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                u32 u32Var = t32Var2.Y;
                boolean z3 = u32Var.c0;
                i32 i32Var = u32Var.r;
                if (z3) {
                    j79 adapter = i32Var.getAdapter();
                    t32 t32Var3 = u32Var.E;
                    if (adapter != t32Var3) {
                        i32Var.setAdapter(t32Var3);
                    }
                }
                t32Var2.s = arrayList2;
                t32Var2.f();
                return;
            case 16:
                n12 n12Var3 = ((h42) this.b).b;
                n12Var3.dismiss();
                n12Var3.Z1.presentFragment(zu1.ha(((TLRPC.User) this.c).id));
                return;
            case 17:
                bs2.v(null, 2131742852, new d31((h42) this.b, (vnb) this.c), 2131623994, 36);
                return;
            case 18:
                float[] fArr = (float[]) this.c;
                ((s42) this.b).f0(fArr[0], fArr[1]);
                return;
            case 19:
                f12 f12Var = (f12) this.c;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = f12Var.getCurrentItemTop();
                int listTopPadding = f12Var.getListTopPadding();
                i52 i52Var = ((ChatAttachAlertPhotoLayout) this.b).F;
                if (currentItemTop > hl.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                i52Var.scrollBy(0, listTopPadding);
                return;
            case 20:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                boolean z5 = ChatAttachAlertPhotoLayout.r1;
                r52 r52Var = ((ChatAttachAlertPhotoLayout) this.b).Q;
                if (r52Var != null) {
                    r52Var.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 21:
                f12 f12Var2 = (f12) this.c;
                int currentItemTop2 = f12Var2.getCurrentItemTop();
                int listTopPadding2 = f12Var2.getListTopPadding();
                gu guVar = ((c62) this.b).r;
                if (currentItemTop2 > hl.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                guVar.scrollBy(0, listTopPadding2);
                return;
            case 22:
                t82 t82Var = (t82) this.b;
                hm hmVar = (hm) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t82Var.h.getText());
                for (hm hmVar2 : (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class)) {
                    if (hmVar2 == hmVar) {
                        int editTextSelectionEnd = t82Var.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(hmVar2);
                        int spanStart = spannableStringBuilder.getSpanStart(hmVar2);
                        t82Var.h.getText().delete(spanStart, spanEnd);
                        int i = spanEnd - spanStart;
                        q82 q82Var = t82Var.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i;
                        }
                        q82Var.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 23:
                t82 t82Var2 = (t82) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (t82Var2.X != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    z49.f(-t82Var2.T, t82Var2.Y, t82Var2.X);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = ob6.G(t82Var2.O, "ReactionMaxCountError", new Object[0]);
                }
                d31.b0(t82Var2).t(str2, null).j();
                return;
            case 24:
                hm hmVar3 = (hm) this.c;
                t82 t82Var3 = ((r82) this.b).g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(t82Var3.h.getText());
                for (hm hmVar4 : (hm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), hm.class)) {
                    if (hmVar4 == hmVar3) {
                        int editTextSelectionEnd2 = t82Var3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(hmVar4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(hmVar4);
                        t82Var3.h.getText().delete(spanStart2, spanEnd2);
                        int i2 = spanEnd2 - spanStart2;
                        q82 q82Var2 = t82Var3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i2;
                        }
                        q82Var2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 25:
                g92 g92Var = (g92) this.b;
                g92Var.getClass();
                g92Var.presentFragment(w1b.d0((TLRPC.Chat) this.c, true));
                return;
            case 26:
                v92 v92Var = (v92) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                z = (tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                v92Var.d0 = z;
                if (!z && v92Var.getUserConfig().p() && !v92Var.e0 && v92Var.y != null) {
                    v92Var.e0 = true;
                    v92Var.g0();
                    v92Var.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new h92(v92Var, (byte) 1));
                    return;
                }
                return;
            case 27:
                v92 v92Var2 = (v92) this.b;
                String str3 = (String) this.c;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = v92Var2.getMessagesController().h1(v92Var2.a0);
                v92Var2.i0 = v92Var2.getConnectionsManager().sendRequest(tL_channels_checkUsername, new fn0(v92Var2, str3, tL_channels_checkUsername, (byte) 18), 2);
                return;
            case 28:
                ((w92) this.b).c.d();
                ((z31) this.c).run();
                return;
            default:
                ((na2) this.b).Y((id[]) this.c);
                return;
        }
    }
}
