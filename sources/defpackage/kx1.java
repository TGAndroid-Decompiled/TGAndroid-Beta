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
public final class kx1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public kx1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        gm[] gmVarArr;
        gm[] gmVarArr2;
        Bitmap bitmap = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((ajc) this.b).a((kl3) this.c);
                return;
            case 1:
                c cVar = (c) this.b;
                cVar.getClass();
                gl.B2((hjc) this.c);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                chatActivityEnterView.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 2:
                ((e) this.b).onAnimationEnd((Animator) this.c);
                return;
            case 3:
                hq1 hq1Var = (hq1) this.c;
                ChatActivityEnterView chatActivityEnterView2 = ((l) this.b).Q0;
                chatActivityEnterView2.Y1 = chatActivityEnterView2.i1.getAudioRightMs() - chatActivityEnterView2.i1.getAudioLeftMs();
                MediaController w = MediaController.w();
                long audioLeftMs = chatActivityEnterView2.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView2.i1.getAudioRightMs();
                if (w.I1) {
                    u20 u20Var = w.G1;
                    if (u20Var != null) {
                        h30 h30Var = (h30) u20Var.e;
                        h30Var.getClass();
                        h30.q();
                        if (h30Var.G == 5) {
                            long j = h30Var.j();
                            long max = Math.max(0L, Math.min(j, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j, audioRightMs));
                            if (max2 - max >= Math.min(h30Var.c, j)) {
                                h30Var.r = max;
                                h30Var.s = max2;
                                y54 y54Var = h30Var.A;
                                if (y54Var != null) {
                                    y54Var.k1(max);
                                }
                                h30Var.f.getClass();
                                h30Var.m();
                                gl.d3(hq1Var);
                                return;
                            }
                        }
                    }
                    ug8.q(audioRightMs, ug8.o(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    gl.d3(hq1Var);
                    return;
                } else if (w.k1 == null) {
                    gl.d3(hq1Var);
                    return;
                } else {
                    w.N1.c(new dt4(w, new pl6(ba4.z(1), System.currentTimeMillis() + "_" + ba4.r(null, w.g1), (byte) 0), audioLeftMs, audioRightMs, hq1Var, (byte) 5));
                    return;
                }
            case 4:
                ((x02) this.b).b.removeView((je5) this.c);
                return;
            case 5:
                d dVar = (d) this.c;
                ((x02) this.b).a(true);
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!((x02) this.b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    gl.F3(editTextBoldCursor);
                    return;
                }
                return;
            case 7:
                x02 x02Var = (x02) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((q02) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                x02Var.x1(tL_attachMenuBot.bot_id, null, false, true);
                hq6 d0 = hq6.d0(x02Var.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
                if (tL_attachMenuBots != null) {
                    d0.getMessagesStorage().a.c(new o57(d0, tL_attachMenuBots, d0.a, d0.e, (byte) 7));
                    return;
                }
                return;
            case 8:
                x02 x02Var2 = (x02) this.b;
                hq6.d0(x02Var2.G3).G0(false, true, null);
                if (x02Var2.v2 == x02Var2.u2.get(((TLRPC.TL_attachMenuBot) this.c).bot_id)) {
                    x02Var2.A1(x02Var2.d2);
                    return;
                }
                return;
            case 9:
                h12 h12Var = (h12) this.b;
                h12Var.H = false;
                h12Var.I = (ArrayList) this.c;
                h12Var.T();
                return;
            case 10:
                s12 s12Var = (s12) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!s12Var.U) {
                    if (tL_error != null) {
                        s12Var.b.dismiss();
                        return;
                    } else {
                        gl.e3(s12Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 11:
                s12 s12Var2 = (s12) this.b;
                m21 Q = new u21(s12Var2.b.c, s12Var2.a).Q(2131623990, 36, gl.T2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 12:
                gl.d3(new kx1((j22) this.b, ((i22) this.c).run(), (byte) 13));
                return;
            case 13:
                ((j22) this.b).setStatus((CharSequence) this.c);
                return;
            case 14:
                c32 c32Var = (c32) this.b;
                String str = (String) this.c;
                c32Var.getClass();
                ArrayList arrayList = new ArrayList(c32Var.Y.w.e);
                if (c32Var.Y.w.f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) c32Var.Y.w.h);
                }
                Utilities.g.c(new qg(c32Var, str, !c32Var.S.isEmpty(), arrayList, (byte) 8));
                return;
            case 15:
                c32 c32Var2 = (c32) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                d32 d32Var = c32Var2.Y;
                boolean z3 = d32Var.c0;
                r22 r22Var = d32Var.r;
                if (z3) {
                    w39 adapter = r22Var.getAdapter();
                    c32 c32Var3 = d32Var.E;
                    if (adapter != c32Var3) {
                        r22Var.setAdapter(c32Var3);
                    }
                }
                c32Var2.s = arrayList2;
                c32Var2.f();
                return;
            case 16:
                x02 x02Var3 = ((r32) this.b).b;
                x02Var3.dismiss();
                x02Var3.Z1.presentFragment(mu1.U9(((TLRPC.User) this.c).id));
                return;
            case 17:
                ir2.v(null, 2131742958, new u21((r32) this.b, (wjb) this.c), 2131623994, 36);
                return;
            case 18:
                float[] fArr = (float[]) this.c;
                ((c42) this.b).g0(fArr[0], fArr[1]);
                return;
            case 19:
                p02 p02Var = (p02) this.c;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = p02Var.getCurrentItemTop();
                int listTopPadding = p02Var.getListTopPadding();
                s42 s42Var = ((ChatAttachAlertPhotoLayout) this.b).F;
                if (currentItemTop > gl.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                s42Var.scrollBy(0, listTopPadding);
                return;
            case 20:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                boolean z5 = ChatAttachAlertPhotoLayout.r1;
                b52 b52Var = ((ChatAttachAlertPhotoLayout) this.b).Q;
                if (b52Var != null) {
                    b52Var.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 21:
                p02 p02Var2 = (p02) this.c;
                int currentItemTop2 = p02Var2.getCurrentItemTop();
                int listTopPadding2 = p02Var2.getListTopPadding();
                fu fuVar = ((m52) this.b).r;
                if (currentItemTop2 > gl.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                fuVar.scrollBy(0, listTopPadding2);
                return;
            case 22:
                i8c i8cVar = (i8c) this.c;
                lx5 a = lx5.a(((String[]) this.b)[0], gl.L(26.0f), false);
                if (a == null) {
                    a = lx5.a(k96.M0(2131754004, null), gl.L(26.0f), false);
                } else {
                    z = false;
                }
                if (a != null) {
                    bitmap = a.a;
                }
                gl.d3(new mn6(i8cVar, bitmap, z, (byte) 13));
                return;
            case 23:
                c82 c82Var = (c82) this.b;
                gm gmVar = (gm) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c82Var.h.getText());
                for (gm gmVar2 : (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class)) {
                    if (gmVar2 == gmVar) {
                        int editTextSelectionEnd = c82Var.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(gmVar2);
                        int spanStart = spannableStringBuilder.getSpanStart(gmVar2);
                        c82Var.h.getText().delete(spanStart, spanEnd);
                        int i = spanEnd - spanStart;
                        z72 z72Var = c82Var.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i;
                        }
                        z72Var.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 24:
                c82 c82Var2 = (c82) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (c82Var2.X != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    k19.f(-c82Var2.T, c82Var2.Y, c82Var2.X);
                    return;
                }
                String str2 = tL_error2.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = k96.G(c82Var2.O, "ReactionMaxCountError", new Object[0]);
                }
                u21.b0(c82Var2).t(str2, null).j();
                return;
            case 25:
                gm gmVar3 = (gm) this.c;
                c82 c82Var3 = ((a82) this.b).g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(c82Var3.h.getText());
                for (gm gmVar4 : (gm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gm.class)) {
                    if (gmVar4 == gmVar3) {
                        int editTextSelectionEnd2 = c82Var3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(gmVar4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(gmVar4);
                        c82Var3.h.getText().delete(spanStart2, spanEnd2);
                        int i2 = spanEnd2 - spanStart2;
                        z72 z72Var2 = c82Var3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i2;
                        }
                        z72Var2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 26:
                p82 p82Var = (p82) this.b;
                p82Var.getClass();
                p82Var.presentFragment(uxa.d0((TLRPC.Chat) this.c, true));
                return;
            case 27:
                f92 f92Var = (f92) this.b;
                String str3 = (String) this.c;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = f92Var.getMessagesController().f1(f92Var.a0);
                f92Var.i0 = f92Var.getConnectionsManager().sendRequest(tL_channels_checkUsername, new en0(f92Var, str3, tL_channels_checkUsername, (byte) 18), 2);
                return;
            case 28:
                f92 f92Var2 = (f92) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                z2 = (tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) ? true : true;
                f92Var2.d0 = z2;
                if (!z2 && f92Var2.getUserConfig().p() && !f92Var2.e0 && f92Var2.y != null) {
                    f92Var2.e0 = true;
                    f92Var2.g0();
                    f92Var2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new q82(f92Var2, (byte) 1));
                    return;
                }
                return;
            default:
                ((g92) this.b).c.d();
                ((r31) this.c).run();
                return;
        }
    }
}
