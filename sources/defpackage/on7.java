package defpackage;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.webrtc.SurfaceTextureHelper;
public final class on7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public on7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        k98 k98Var;
        String str;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i2;
        jjc jjcVar;
        CharSequence text;
        int i3 = -1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((rn7) this.c).a(Integer.valueOf(this.b));
                return;
            case 1:
                ((iq7) this.c).F0(this.b);
                return;
            case 2:
                int i5 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", y6c.h(i5).n);
                ((ui5) this.c).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i6 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i7 = i6 + 1;
                if (i7 < 6 && (k98Var = photoViewer.f0) != null) {
                    k98Var.invalidate();
                    gl.d3(new on7(photoViewer, i7, (byte) 3), 100L);
                    return;
                }
                return;
            case 4:
                z98 z98Var = (z98) this.c;
                int i8 = this.b;
                x88 x88Var = z98Var.a;
                TextView textView = x88Var.e;
                sb sbVar = x88Var.h;
                RadialProgressView radialProgressView = x88Var.n;
                TextView textView2 = x88Var.d;
                textView.setVisibility(8);
                x88Var.f.setVisibility(8);
                LinearLayout linearLayout = x88Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new y98(z98Var, (byte) 0));
                }
                if (sbVar.getAlpha() == 1.0f) {
                    sbVar.animate().cancel();
                    sbVar.animate().alpha(0.0f).setDuration(150L).setListener(new y98(z98Var, (byte) 1));
                }
                if (i8 != 2) {
                    if (i8 != 5) {
                        if (i8 != 150) {
                            if (i8 != 100) {
                                if (i8 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(k96.M0(2131742568, null));
                                return;
                            }
                        }
                        textView2.setText(k96.M0(2131742569, null));
                        textView.setText(k96.M0(2131742567, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new fr7(z98Var, (byte) 16));
                        return;
                    }
                    textView2.setText(k96.M0(2131742571, null));
                    return;
                }
                textView2.setText(k96.M0(2131742570, null));
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i9 = this.b;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131746454, null);
                alertDialog$Builder.a.U = k96.M0(2131746455, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new jh(profileActivity, i9, (byte) 18));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 6:
                jo8 jo8Var = (jo8) this.c;
                int i10 = this.b;
                jo8Var.h.e.getNotificationCenter().n(jo8Var.h.e, 107);
                ProfileActivity profileActivity2 = jo8Var.h.e;
                if (i10 == 2) {
                    profileActivity2.getMessagesController().n4(0L, "PREMIUM_GRACE");
                    d01.t(jo8Var.getContext(), jo8Var.h.e.getMessagesController().k4.o2.f);
                } else {
                    na7 messagesController = profileActivity2.getMessagesController();
                    if (i10 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.n4(0L, str);
                }
                jo8Var.h.e.getNotificationCenter().b(jo8Var.h.e, 107);
                jo8Var.h.e.Y3(false, false);
                return;
            case 7:
                fu8 fu8Var = (fu8) this.c;
                int i11 = this.b;
                gl.t1(fu8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = fu8Var.a;
                    if (i4 < editTextBoldCursorArr.length) {
                        if (i4 != 0 && ((i11 != 3 || i4 != 4) && ((i11 != 2 || (i4 != 4 && i4 != 1)) && (i11 != 1 || (i4 != 1 && i4 != 2 && i4 != 3))))) {
                            editTextBoldCursorArr[i4].setText((CharSequence) null);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
                break;
            case 8:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 9:
                ny8 ny8Var = (ny8) this.c;
                int i12 = this.b;
                ny8Var.W0 = false;
                if (ny8Var.X0) {
                    ny8Var.x(true);
                    return;
                }
                ny8Var.b1 = i12;
                ny8Var.D();
                ny8Var.s();
                return;
            case 10:
                int i13 = this.b;
                l46 l46Var = ((t19) this.c).e;
                try {
                    if (l46Var.getLayout().getLineForOffset(i13) == 0) {
                        l46Var.getEditableText().insert(i13, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 11:
                mb9 mb9Var = (mb9) this.c;
                int i14 = this.b;
                pb9 pb9Var = mb9Var.f;
                if (mb9Var.c && pb9Var.F != null && pb9Var.a != null) {
                    mb9Var.d = true;
                    mb9Var.a.m(false);
                    try {
                        mb9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    nb9 nb9Var = pb9Var.F;
                    lk0 lk0Var = pb9Var.a;
                    ye9 ye9Var = ((qe9) nb9Var).a;
                    ye9Var.k3(false);
                    ye9Var.p3.P(new ve9(ye9Var, lk0Var, i14), mb9Var);
                    return;
                }
                return;
            case 12:
                int i15 = this.b;
                tk9 tk9Var = ((jk9) this.c).N;
                if (tk9Var != null && tk9Var.s != (i = ((i15 % 360) + 360) % 360)) {
                    tk9Var.s = i;
                    tk9Var.v();
                    return;
                }
                return;
            case 13:
                int i16 = this.b;
                j5 j5Var = (j5) this.c;
                try {
                    if (i16 == 1) {
                        kk7.e().k(295, 1, k96.M0(2131743594, null));
                    } else if (i16 == 2) {
                        kk7.f(j5Var.a).k(314, 6);
                    } else {
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.q0();
                g7a g7aVar = sessionsActivity.a;
                if (g7aVar != null) {
                    g7aVar.f();
                    return;
                }
                return;
            case 15:
                ConnectionsManager.getInstance(((gta) this.c).a).cancelRequest(this.b, true);
                return;
            case 16:
                kk7.f(this.b).k(217, Boolean.FALSE);
                ((mza) this.c).h();
                return;
            case 17:
                g2b g2bVar = (g2b) this.c;
                int i17 = this.b;
                ArrayList arrayList3 = g2bVar.g;
                g2bVar.u(arrayList3);
                bz0 bz0Var = g2bVar.J;
                Collections.sort(arrayList3, bz0Var);
                ArrayList arrayList4 = g2bVar.h;
                g2bVar.u(arrayList4);
                Collections.sort(arrayList4, bz0Var);
                kk7.f(i17).k(327, new Object[0]);
                return;
            case 18:
                t7b t7bVar = (t7b) this.c;
                int i18 = this.b;
                int i19 = t7bVar.c;
                t7bVar.j();
                t7bVar.Y1 = false;
                f4b f4bVar = t7bVar.L1;
                File file = f4bVar.O0;
                if (file != null) {
                    file.delete();
                    f4bVar = t7bVar.L1;
                    f4bVar.O0 = null;
                }
                t7bVar.V(f4bVar, true);
                CharSequence[] charSequenceArr = {t7bVar.d1.getText()};
                if (na7.q1(i19).d5()) {
                    arrayList = hq6.d0(i19).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {t7bVar.L1.C0};
                if (na7.q1(i19).d5()) {
                    arrayList2 = hq6.d0(i19).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                f4b f4bVar2 = t7bVar.L1;
                if (TextUtils.equals(f4bVar2.C0, charSequenceArr[0]) && hq6.M(arrayList, arrayList2)) {
                    z = false;
                } else {
                    z = true;
                }
                f4bVar2.k = z;
                t7bVar.L1.C0 = new SpannableString(t7bVar.d1.getText());
                t7bVar.x();
                t7bVar.w();
                f4b f4bVar3 = t7bVar.L1;
                if (f4bVar3 != null && f4bVar3.K) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                t7bVar.P1 = i2;
                t7bVar.L1 = (f4b) t7bVar.I1.get(i18);
                t7bVar.M(0, 1);
                t7bVar.L(0, 1);
                t7bVar.e1.b.g3.O(false);
                t7bVar.d1.setText(t7bVar.L1.C0);
                return;
            case 19:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
            case 20:
                c0c c0cVar = (c0c) this.c;
                int i20 = this.b;
                c0cVar.Z0();
                c0cVar.b2 = i20;
                rzb.O0(c0cVar.a2);
                c0cVar.a1();
                return;
            case 21:
                Utilities.u(this.b + 1, (p8c[]) this.c);
                return;
            case 22:
                ((vec) this.c).w.z0(this.b);
                return;
            case 23:
                hgc hgcVar = (hgc) this.c;
                int i21 = this.b;
                hgcVar.G.setSignalBarCount(i21);
                kic kicVar = hgcVar.w;
                if (i21 <= 1) {
                    if (kicVar.W != 3) {
                        kicVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(kicVar.I, 255);
                        kicVar.P = ofInt;
                        ofInt.addUpdateListener(new iic(kicVar, (byte) 2));
                        kicVar.P.setDuration(500L);
                        kicVar.P.start();
                    }
                    hgcVar.G.c(true);
                    return;
                }
                if (kicVar.W != 2) {
                    kicVar.W = 2;
                    kicVar.c();
                    ValueAnimator valueAnimator = kicVar.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        kicVar.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(kicVar.I, 0);
                    kicVar.P = ofInt2;
                    ofInt2.addUpdateListener(new iic(kicVar, (byte) 0));
                    kicVar.P.setDuration(500L);
                    kicVar.P.start();
                }
                hgcVar.G.c(false);
                return;
            case 24:
                jjc jjcVar2 = (jjc) this.c;
                int i22 = this.b;
                gjc gjcVar = jjcVar2.a;
                if (jjcVar2.p0) {
                    if (i22 == 0) {
                        String trim = gjcVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = gjcVar.b;
                            gjcVar.j("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i23 = ChatActivityEnterView.r7;
                            chatActivityEnterView.z2(trim, null);
                            return;
                        }
                        return;
                    } else if (i22 == 1) {
                        String trim2 = gjcVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = gjcVar.b;
                            gjcVar.j("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i24 = ChatActivityEnterView.r7;
                            chatActivityEnterView2.z2(trim2, new av1(chatActivityEnterView2, (byte) 20));
                            return;
                        }
                        return;
                    } else if (i22 == 3) {
                        if (gjcVar.c == 3 && gjcVar.h != null && gjcVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            gjcVar.n = gjcVar.H;
                            gjcVar.H = null;
                            gjcVar.h.setStyleIcon(null);
                            gjcVar.h.setStyleLabel(null);
                            gjcVar.h.r(gjcVar.n);
                            return;
                        }
                        return;
                    } else if (i22 == 4) {
                        if (gjcVar.h != null && gjcVar.c == 2) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(k96.M0(2131745072, null));
                            boolean x = DictationAsr.x();
                            if (x) {
                                i3 = 0;
                            }
                            int i25 = i3;
                            for (int i26 = 0; i26 < G.length; i26++) {
                                arrayList5.add(jm3.r(G[i26]));
                                if (!x && i25 < 0 && DictationAsr.z(G[i26])) {
                                    i25 = i26 + 1;
                                }
                            }
                            zic zicVar = new zic(gjcVar, G, (byte) 0);
                            c cVar3 = gjcVar.b;
                            jjc jjcVar3 = gjcVar.h;
                            ArrayList w = gjc.w(G, x, zicVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar3.a;
                            if (chatActivityEnterView3.F3 != null) {
                                RectF rectF2 = new RectF();
                                rectF2.set(jjcVar3.R);
                                if (!rectF2.isEmpty()) {
                                    hjc hjcVar = new hjc(jjcVar3, jjcVar3.getContext(), (byte) 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF2.left + jjcVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF2.top + jjcVar3.getTop());
                                    hjcVar.setAlpha(0.0f);
                                    chatActivityEnterView3.c2.addView(hjcVar, layoutParams);
                                    hjcVar.post(new qt(cVar3, hjcVar, new lj9(jjcVar3, (byte) 18), arrayList5, w, i25, zicVar));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i22 == 5) {
                        c cVar4 = gjcVar.b;
                        if (gjcVar.c == 2) {
                            cVar4.e();
                            mu1 mu1Var = cVar4.a.F3;
                            if (mu1Var != null) {
                                mu1Var.presentFragment(new zka());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF3 = jjcVar2.f1;
                        float f = rectF3.left;
                        float f2 = rectF3.top;
                        float f3 = jjcVar2.j1;
                        new RectF(f, f2 + f3, rectF3.right, rectF3.bottom + f3);
                        if (!gjcVar.n.trim().isEmpty() && (jjcVar = gjcVar.h) != null) {
                            c cVar5 = gjcVar.b;
                            ajc ajcVar = new ajc(gjcVar, (byte) 1);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF4 = new RectF();
                                jjcVar.l(rectF4);
                                hjc hjcVar2 = new hjc(jjcVar, jjcVar.getContext(), (byte) 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF4.left + jjcVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF4.top + jjcVar.getTop());
                                hjcVar2.setAlpha(0.0f);
                                chatActivityEnterView4.c2.addView(hjcVar2, layoutParams2);
                                hjcVar2.post(new b87(cVar5, hjcVar2, new i4d(jjcVar), ajcVar, jjcVar, (byte) 20));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 25:
                jmc jmcVar = (jmc) this.c;
                int i27 = this.b;
                gl.c3(new clc(jmcVar, i27, jmc.h(jmcVar.R, i27), (byte) 1));
                return;
            case 26:
                lnc lncVar = (lnc) this.c;
                int i28 = this.b;
                if (lncVar.r && !lncVar.y && i28 == lncVar.l0) {
                    lncVar.postDelayed(lncVar.m0, 500L);
                    return;
                }
                return;
            case 27:
                noc nocVar = (noc) this.c;
                int i29 = this.b;
                ArrayList arrayList6 = nocVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) nocVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i29 < arrayList6.size() && i4 < split.length) {
                            ((lqc) arrayList6.get(i29)).setText(split[i4]);
                            i29++;
                            i4++;
                        }
                        nocVar.c0();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 28:
                ypc ypcVar = (ypc) this.c;
                int i30 = this.b;
                if (!ypcVar.r && i30 == ypcVar.K) {
                    ypcVar.M = false;
                    ypcVar.a.g3.O(true);
                    return;
                }
                return;
            default:
                stc stcVar = (stc) this.c;
                int i31 = this.b;
                lbc lbcVar = stcVar.a;
                if (i31 == -1) {
                    if (lbcVar.c0()) {
                        lbcVar.f0();
                        stcVar.n();
                    }
                    stcVar.K = false;
                    return;
                } else if (i31 == 1) {
                    if (stcVar.L) {
                        stcVar.L = false;
                        lbcVar.g0();
                        return;
                    }
                    return;
                } else if (i31 != -3 && i31 == -2 && lbcVar.c0()) {
                    stcVar.L = true;
                    lbcVar.f0();
                    stcVar.n();
                    return;
                } else {
                    return;
                }
        }
    }

    public on7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
