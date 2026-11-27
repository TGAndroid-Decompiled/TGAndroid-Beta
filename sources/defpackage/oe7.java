package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.webrtc.SurfaceTextureHelper;
public final class oe7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public oe7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        ad8 ad8Var;
        String str;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i2;
        vnc vncVar;
        int i3 = -1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((cn1) this.c).a(this.b);
                return;
            case 1:
                int i5 = this.b;
                lm7 lm7Var = (lm7) ((bn0) this.c).c;
                lm7Var.w0(i5, true);
                if (i5 == 0) {
                    lm7Var.u0();
                    return;
                }
                return;
            case 2:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.c;
                int i6 = this.b;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i6);
                return;
            case 3:
                ((rq7) this.c).a(Integer.valueOf(this.b));
                return;
            case 4:
                ((ot7) this.c).G0(this.b);
                return;
            case 5:
                int i7 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(i7).n);
                ((wk5) this.c).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i8 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i9 = i8 + 1;
                if (i9 < 6 && (ad8Var = photoViewer.f0) != null) {
                    ad8Var.invalidate();
                    hl.d3(new oe7(photoViewer, i9, (byte) 6), 100L);
                    return;
                }
                return;
            case 7:
                pd8 pd8Var = (pd8) this.c;
                int i10 = this.b;
                nc8 nc8Var = pd8Var.a;
                TextView textView = nc8Var.e;
                tb tbVar = nc8Var.h;
                RadialProgressView radialProgressView = nc8Var.n;
                TextView textView2 = nc8Var.d;
                textView.setVisibility(8);
                nc8Var.f.setVisibility(8);
                LinearLayout linearLayout = nc8Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new od8(pd8Var, (byte) 0));
                }
                if (tbVar.getAlpha() == 1.0f) {
                    tbVar.animate().cancel();
                    tbVar.animate().alpha(0.0f).setDuration(150L).setListener(new od8(pd8Var, (byte) 1));
                }
                if (i10 != 2) {
                    if (i10 != 5) {
                        if (i10 != 150) {
                            if (i10 != 100) {
                                if (i10 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(ob6.M0(2131742462, null));
                                return;
                            }
                        }
                        textView2.setText(ob6.M0(2131742463, null));
                        textView.setText(ob6.M0(2131742461, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new am7(pd8Var, (byte) 18));
                        return;
                    }
                    textView2.setText(ob6.M0(2131742465, null));
                    return;
                }
                textView2.setText(ob6.M0(2131742464, null));
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i11 = this.b;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131746374, null);
                alertDialog$Builder.a.U = ob6.M0(2131746375, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new wg(profileActivity, i11, (byte) 19));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 9:
                vr8 vr8Var = (vr8) this.c;
                int i12 = this.b;
                vr8Var.h.e.getNotificationCenter().n(vr8Var.h.e, 108);
                ProfileActivity profileActivity2 = vr8Var.h.e;
                if (i12 == 2) {
                    profileActivity2.getMessagesController().v4(0L, "PREMIUM_GRACE");
                    m01.u(vr8Var.getContext(), vr8Var.h.e.getMessagesController().l4.w2.f);
                } else {
                    uc7 messagesController = profileActivity2.getMessagesController();
                    if (i12 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.v4(0L, str);
                }
                vr8Var.h.e.getNotificationCenter().b(vr8Var.h.e, 108);
                vr8Var.h.e.Z3(false, false);
                return;
            case 10:
                ox8 ox8Var = (ox8) this.c;
                int i13 = this.b;
                hl.t1(ox8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = ox8Var.a;
                    if (i4 < editTextBoldCursorArr.length) {
                        if (i4 != 0 && ((i13 != 3 || i4 != 4) && ((i13 != 2 || (i4 != 4 && i4 != 1)) && (i13 != 1 || (i4 != 1 && i4 != 2 && i4 != 3))))) {
                            editTextBoldCursorArr[i4].setText((CharSequence) null);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
                break;
            case 11:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 12:
                a29 a29Var = (a29) this.c;
                int i14 = this.b;
                a29Var.W0 = false;
                if (a29Var.X0) {
                    a29Var.x(true);
                    return;
                }
                a29Var.b1 = i14;
                a29Var.D();
                a29Var.s();
                return;
            case 13:
                int i15 = this.b;
                p66 p66Var = ((i59) this.c).e;
                try {
                    if (p66Var.getLayout().getLineForOffset(i15) == 0) {
                        p66Var.getEditableText().insert(i15, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 14:
                cf9 cf9Var = (cf9) this.c;
                int i16 = this.b;
                ff9 ff9Var = cf9Var.f;
                if (cf9Var.c && ff9Var.F != null && ff9Var.a != null) {
                    cf9Var.d = true;
                    cf9Var.a.m(false);
                    try {
                        cf9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    df9 df9Var = ff9Var.F;
                    mk0 mk0Var = ff9Var.a;
                    pi9 pi9Var = ((hi9) df9Var).a;
                    pi9Var.l3(false);
                    pi9Var.p3.S(new mi9(pi9Var, mk0Var, i16), cf9Var);
                    return;
                }
                return;
            case 15:
                int i17 = this.b;
                ho9 ho9Var = ((xn9) this.c).N;
                if (ho9Var != null && ho9Var.s != (i = ((i17 % 360) + 360) % 360)) {
                    ho9Var.s = i;
                    ho9Var.v();
                    return;
                }
                return;
            case 16:
                int i18 = this.b;
                k5 k5Var = (k5) this.c;
                try {
                    if (i18 == 1) {
                        jn7.e().k(296, 1, ob6.M0(2131743488, null));
                    } else if (i18 == 2) {
                        jn7.f(k5Var.a).k(315, 6);
                    } else {
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 17:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.q0();
                xaa xaaVar = sessionsActivity.a;
                if (xaaVar != null) {
                    xaaVar.f();
                    return;
                }
                return;
            case 18:
                ConnectionsManager.getInstance(((jxa) this.c).a).cancelRequest(this.b, true);
                return;
            case 19:
                jn7.f(this.b).k(218, Boolean.FALSE);
                ((k3b) this.c).h();
                return;
            case 20:
                c6b c6bVar = (c6b) this.c;
                int i19 = this.b;
                ArrayList arrayList3 = c6bVar.g;
                c6bVar.u(arrayList3);
                jz0 jz0Var = c6bVar.J;
                Collections.sort(arrayList3, jz0Var);
                ArrayList arrayList4 = c6bVar.h;
                c6bVar.u(arrayList4);
                Collections.sort(arrayList4, jz0Var);
                jn7.f(i19).k(328, new Object[0]);
                return;
            case 21:
                sbb sbbVar = (sbb) this.c;
                int i20 = this.b;
                int i21 = sbbVar.c;
                sbbVar.j();
                sbbVar.Y1 = false;
                c8b c8bVar = sbbVar.L1;
                File file = c8bVar.O0;
                if (file != null) {
                    file.delete();
                    c8bVar = sbbVar.L1;
                    c8bVar.O0 = null;
                }
                sbbVar.V(c8bVar, true);
                CharSequence[] charSequenceArr = {sbbVar.d1.getText()};
                if (uc7.s1(i21).l5()) {
                    arrayList = ls6.d0(i21).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {sbbVar.L1.C0};
                if (uc7.s1(i21).l5()) {
                    arrayList2 = ls6.d0(i21).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                c8b c8bVar2 = sbbVar.L1;
                if (TextUtils.equals(c8bVar2.C0, charSequenceArr[0]) && ls6.M(arrayList, arrayList2)) {
                    z = false;
                } else {
                    z = true;
                }
                c8bVar2.k = z;
                sbbVar.L1.C0 = new SpannableString(sbbVar.d1.getText());
                sbbVar.x();
                sbbVar.w();
                c8b c8bVar3 = sbbVar.L1;
                if (c8bVar3 != null && c8bVar3.K) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                sbbVar.P1 = i2;
                sbbVar.L1 = (c8b) sbbVar.I1.get(i20);
                sbbVar.M(0, 1);
                sbbVar.L(0, 1);
                sbbVar.e1.b.g3.O(false);
                sbbVar.d1.setText(sbbVar.L1.C0);
                return;
            case 22:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
            case 23:
                b4c b4cVar = (b4c) this.c;
                int i22 = this.b;
                b4cVar.a1();
                b4cVar.b2 = i22;
                r3c.P0(b4cVar.a2);
                b4cVar.b1();
                return;
            case 24:
                Utilities.u(this.b + 1, (pcc[]) this.c);
                return;
            case 25:
                ((uic) this.c).w.A0(this.b);
                return;
            case 26:
                mkc mkcVar = (mkc) this.c;
                int i23 = this.b;
                mkcVar.G.setSignalBarCount(i23);
                wmc wmcVar = mkcVar.w;
                if (i23 <= 1) {
                    if (wmcVar.W != 3) {
                        wmcVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(wmcVar.I, 255);
                        wmcVar.P = ofInt;
                        ofInt.addUpdateListener(new umc(wmcVar, (byte) 2));
                        wmcVar.P.setDuration(500L);
                        wmcVar.P.start();
                    }
                    mkcVar.G.c(true);
                    return;
                }
                if (wmcVar.W != 2) {
                    wmcVar.W = 2;
                    wmcVar.c();
                    ValueAnimator valueAnimator = wmcVar.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        wmcVar.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(wmcVar.I, 0);
                    wmcVar.P = ofInt2;
                    ofInt2.addUpdateListener(new umc(wmcVar, (byte) 0));
                    wmcVar.P.setDuration(500L);
                    wmcVar.P.start();
                }
                mkcVar.G.c(false);
                return;
            case 27:
                vnc vncVar2 = (vnc) this.c;
                int i24 = this.b;
                snc sncVar = vncVar2.a;
                if (vncVar2.q0) {
                    if (i24 == 0) {
                        String trim = sncVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = sncVar.b;
                            sncVar.k("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i25 = ChatActivityEnterView.X7;
                            chatActivityEnterView.N2(trim, null);
                            return;
                        }
                        return;
                    } else if (i24 == 1) {
                        String trim2 = sncVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = sncVar.b;
                            sncVar.k("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i26 = ChatActivityEnterView.X7;
                            chatActivityEnterView2.N2(trim2, new mv1(chatActivityEnterView2, (byte) 21));
                            return;
                        }
                        return;
                    } else if (i24 == 3) {
                        if (sncVar.c == 3 && sncVar.h != null && sncVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            sncVar.n = sncVar.H;
                            sncVar.H = null;
                            sncVar.h.setStyleIcon(null);
                            sncVar.h.setStyleLabel(null);
                            sncVar.h.r(sncVar.n);
                            return;
                        }
                        return;
                    } else if (i24 == 4) {
                        if (sncVar.h != null && sncVar.c == 2) {
                            String[] I = DictationAsr.I();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ob6.M0(2131744990, null));
                            boolean y = DictationAsr.y();
                            if (y) {
                                i3 = 0;
                            }
                            int i27 = i3;
                            for (int i28 = 0; i28 < I.length; i28++) {
                                arrayList5.add(bn3.t(I[i28]));
                                if (!y && i27 < 0 && DictationAsr.A(I[i28])) {
                                    i27 = i28 + 1;
                                }
                            }
                            nnc nncVar = new nnc(sncVar, I, (byte) 1);
                            c cVar3 = sncVar.b;
                            vnc vncVar3 = sncVar.h;
                            ArrayList x = snc.x(I, y, nncVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar3.a;
                            if (chatActivityEnterView3.E3 != null) {
                                RectF rectF2 = new RectF();
                                rectF2.set(vncVar3.R);
                                if (!rectF2.isEmpty()) {
                                    tnc tncVar = new tnc(vncVar3, vncVar3.getContext(), (byte) 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF2.left + vncVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF2.top + vncVar3.getTop());
                                    tncVar.setAlpha(0.0f);
                                    chatActivityEnterView3.b2.addView(tncVar, layoutParams);
                                    tncVar.post(new st(cVar3, tncVar, new wz4(vncVar3), arrayList5, x, i27, nncVar));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i24 == 5) {
                        c cVar4 = sncVar.b;
                        if (sncVar.c == 2) {
                            cVar4.e();
                            zu1 zu1Var = cVar4.a.E3;
                            if (zu1Var != null) {
                                zu1Var.presentFragment(new woa());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF3 = vncVar2.g1;
                        float f = rectF3.left;
                        float f2 = rectF3.top;
                        float f3 = vncVar2.k1;
                        new RectF(f, f2 + f3, rectF3.right, rectF3.bottom + f3);
                        if (!sncVar.n.trim().isEmpty() && (vncVar = sncVar.h) != null) {
                            c cVar5 = sncVar.b;
                            mnc mncVar = new mnc(sncVar, (byte) 1);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.E3 != null) {
                                RectF rectF4 = new RectF();
                                vncVar.l(rectF4);
                                tnc tncVar2 = new tnc(vncVar, vncVar.getContext(), (byte) 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF4.left + vncVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF4.top + vncVar.getTop());
                                tncVar2.setAlpha(0.0f);
                                chatActivityEnterView4.b2.addView(tncVar2, layoutParams2);
                                tncVar2.post(new la7(cVar5, tncVar2, new zm9(vncVar, (byte) 18), mncVar, vncVar, (byte) 21));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 28:
                wqc wqcVar = (wqc) this.c;
                int i29 = this.b;
                hl.c3(new mpc(wqcVar, i29, wqc.h(wqcVar.R, i29), (byte) 2));
                return;
            default:
                yrc yrcVar = (yrc) this.c;
                int i30 = this.b;
                if (yrcVar.r && !yrcVar.y && i30 == yrcVar.l0) {
                    yrcVar.postDelayed(yrcVar.m0, 500L);
                    return;
                }
                return;
        }
    }

    public oe7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
