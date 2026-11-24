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
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.webrtc.SurfaceTextureHelper;
public final class ge7 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public ge7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        lb8 lb8Var;
        String str;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i2;
        jlc jlcVar;
        CharSequence text;
        int i3 = -1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((oo1) this.c).a(this.b);
                return;
            case 1:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.c;
                int i5 = this.b;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i5);
                return;
            case 2:
                ((up7) this.c).a(Integer.valueOf(this.b));
                return;
            case 3:
                ((ls7) this.c).F0(this.b);
                return;
            case 4:
                int i6 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(i6).n);
                ((tk5) this.c).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i7 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i8 = i7 + 1;
                if (i8 < 6 && (lb8Var = photoViewer.f0) != null) {
                    lb8Var.invalidate();
                    gm.d3(new ge7(photoViewer, i8, (byte) 5), 100L);
                    return;
                }
                return;
            case 6:
                ac8 ac8Var = (ac8) this.c;
                int i9 = this.b;
                ya8 ya8Var = ac8Var.a;
                TextView textView = ya8Var.e;
                sb sbVar = ya8Var.h;
                RadialProgressView radialProgressView = ya8Var.n;
                TextView textView2 = ya8Var.d;
                textView.setVisibility(8);
                ya8Var.f.setVisibility(8);
                LinearLayout linearLayout = ya8Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new zb8(ac8Var, (byte) 0));
                }
                if (sbVar.getAlpha() == 1.0f) {
                    sbVar.animate().cancel();
                    sbVar.animate().alpha(0.0f).setDuration(150L).setListener(new zb8(ac8Var, (byte) 1));
                }
                if (i9 != 2) {
                    if (i9 != 5) {
                        if (i9 != 150) {
                            if (i9 != 100) {
                                if (i9 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(jb6.M0(2131742494, null));
                                return;
                            }
                        }
                        textView2.setText(jb6.M0(2131742495, null));
                        textView.setText(jb6.M0(2131742493, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new m67(ac8Var, (byte) 19));
                        return;
                    }
                    textView2.setText(jb6.M0(2131742497, null));
                    return;
                }
                textView2.setText(jb6.M0(2131742496, null));
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i10 = this.b;
                RectF rectF = ProfileActivity.e7;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131746380, null);
                alertDialog$Builder.a.U = jb6.M0(2131746381, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new ji(profileActivity, i10, (byte) 18));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                kq8 kq8Var = (kq8) this.c;
                int i11 = this.b;
                kq8Var.h.e.getNotificationCenter().n(kq8Var.h.e, 108);
                ProfileActivity profileActivity2 = kq8Var.h.e;
                if (i11 == 2) {
                    profileActivity2.getMessagesController().p4(0L, "PREMIUM_GRACE");
                    l11.u(kq8Var.getContext(), kq8Var.h.e.getMessagesController().l4.o2.f);
                } else {
                    oc7 messagesController = profileActivity2.getMessagesController();
                    if (i11 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.p4(0L, str);
                }
                kq8Var.h.e.getNotificationCenter().b(kq8Var.h.e, 108);
                kq8Var.h.e.c4(false, false);
                return;
            case 9:
                gw8 gw8Var = (gw8) this.c;
                int i12 = this.b;
                gm.t1(gw8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = gw8Var.a;
                    if (i4 < editTextBoldCursorArr.length) {
                        if (i4 != 0 && ((i12 != 3 || i4 != 4) && ((i12 != 2 || (i4 != 4 && i4 != 1)) && (i12 != 1 || (i4 != 1 && i4 != 2 && i4 != 3))))) {
                            editTextBoldCursorArr[i4].setText((CharSequence) null);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
                break;
            case 10:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                return;
            case 11:
                o09 o09Var = (o09) this.c;
                int i13 = this.b;
                o09Var.W0 = false;
                if (o09Var.X0) {
                    o09Var.x(true);
                    return;
                }
                o09Var.b1 = i13;
                o09Var.D();
                o09Var.s();
                return;
            case 12:
                int i14 = this.b;
                l66 l66Var = ((x39) this.c).e;
                try {
                    if (l66Var.getLayout().getLineForOffset(i14) == 0) {
                        l66Var.getEditableText().insert(i14, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 13:
                md9 md9Var = (md9) this.c;
                int i15 = this.b;
                pd9 pd9Var = md9Var.f;
                if (md9Var.c && pd9Var.F != null && pd9Var.a != null) {
                    md9Var.d = true;
                    md9Var.a.n(false);
                    try {
                        md9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    nd9 nd9Var = pd9Var.F;
                    ll0 ll0Var = pd9Var.a;
                    ch9 ch9Var = ((ug9) nd9Var).a;
                    ch9Var.k3(false);
                    ch9Var.p3.I(new zg9(ch9Var, ll0Var, i15), md9Var);
                    return;
                }
                return;
            case 14:
                int i16 = this.b;
                um9 um9Var = ((km9) this.c).N;
                if (um9Var != null && um9Var.s != (i = ((i16 % 360) + 360) % 360)) {
                    um9Var.s = i;
                    um9Var.v();
                    return;
                }
                return;
            case 15:
                int i17 = this.b;
                j5 j5Var = (j5) this.c;
                try {
                    if (i17 == 1) {
                        nm7.e().k(297, 1, jb6.M0(2131743520, null));
                    } else if (i17 == 2) {
                        nm7.f(j5Var.a).k(316, 6);
                    } else {
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 16:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.r0();
                h9a h9aVar = sessionsActivity.a;
                if (h9aVar != null) {
                    h9aVar.f();
                    return;
                }
                return;
            case 17:
                ConnectionsManager.getInstance(((jva) this.c).a).cancelRequest(this.b, true);
                return;
            case 18:
                nm7.f(this.b).k(218, Boolean.FALSE);
                ((n1b) this.c).h();
                return;
            case 19:
                h4b h4bVar = (h4b) this.c;
                int i18 = this.b;
                ArrayList arrayList3 = h4bVar.g;
                h4bVar.u(arrayList3);
                i01 i01Var = h4bVar.J;
                Collections.sort(arrayList3, i01Var);
                ArrayList arrayList4 = h4bVar.h;
                h4bVar.u(arrayList4);
                Collections.sort(arrayList4, i01Var);
                nm7.f(i18).k(329, new Object[0]);
                return;
            case 20:
                v9b v9bVar = (v9b) this.c;
                int i19 = this.b;
                int i20 = v9bVar.c;
                v9bVar.j();
                v9bVar.Y1 = false;
                g6b g6bVar = v9bVar.L1;
                File file = g6bVar.O0;
                if (file != null) {
                    file.delete();
                    g6bVar = v9bVar.L1;
                    g6bVar.O0 = null;
                }
                v9bVar.V(g6bVar, true);
                CharSequence[] charSequenceArr = {v9bVar.d1.getText()};
                if (oc7.r1(i20).f5()) {
                    arrayList = hs6.d0(i20).Y(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {v9bVar.L1.C0};
                if (oc7.r1(i20).f5()) {
                    arrayList2 = hs6.d0(i20).Y(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                g6b g6bVar2 = v9bVar.L1;
                if (TextUtils.equals(g6bVar2.C0, charSequenceArr[0]) && hs6.M(arrayList, arrayList2)) {
                    z = false;
                } else {
                    z = true;
                }
                g6bVar2.k = z;
                v9bVar.L1.C0 = new SpannableString(v9bVar.d1.getText());
                v9bVar.x();
                v9bVar.w();
                g6b g6bVar3 = v9bVar.L1;
                if (g6bVar3 != null && g6bVar3.K) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                v9bVar.P1 = i2;
                v9bVar.L1 = (g6b) v9bVar.I1.get(i19);
                v9bVar.M(0, 1);
                v9bVar.L(0, 1);
                v9bVar.e1.b.g3.O(false);
                v9bVar.d1.setText(v9bVar.L1.C0);
                return;
            case 21:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
            case 22:
                c2c c2cVar = (c2c) this.c;
                int i21 = this.b;
                c2cVar.Z0();
                c2cVar.b2 = i21;
                s1c.O0(c2cVar.a2);
                c2cVar.a1();
                return;
            case 23:
                Utilities.u(this.b + 1, (qac[]) this.c);
                return;
            case 24:
                ((vgc) this.c).w.z0(this.b);
                return;
            case 25:
                iic iicVar = (iic) this.c;
                int i22 = this.b;
                iicVar.G.setSignalBarCount(i22);
                kkc kkcVar = iicVar.w;
                if (i22 <= 1) {
                    if (kkcVar.W != 3) {
                        kkcVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(kkcVar.I, 255);
                        kkcVar.P = ofInt;
                        ofInt.addUpdateListener(new ikc(kkcVar, (byte) 2));
                        kkcVar.P.setDuration(500L);
                        kkcVar.P.start();
                    }
                    iicVar.G.c(true);
                    return;
                }
                if (kkcVar.W != 2) {
                    kkcVar.W = 2;
                    kkcVar.c();
                    ValueAnimator valueAnimator = kkcVar.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        kkcVar.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(kkcVar.I, 0);
                    kkcVar.P = ofInt2;
                    ofInt2.addUpdateListener(new ikc(kkcVar, (byte) 0));
                    kkcVar.P.setDuration(500L);
                    kkcVar.P.start();
                }
                iicVar.G.c(false);
                return;
            case 26:
                jlc jlcVar2 = (jlc) this.c;
                int i23 = this.b;
                glc glcVar = jlcVar2.a;
                if (jlcVar2.p0) {
                    if (i23 == 0) {
                        String trim = glcVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = glcVar.b;
                            glcVar.j("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i24 = ChatActivityEnterView.z7;
                            chatActivityEnterView.E2(trim, null);
                            return;
                        }
                        return;
                    } else if (i23 == 1) {
                        String trim2 = glcVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = glcVar.b;
                            glcVar.j("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i25 = ChatActivityEnterView.z7;
                            chatActivityEnterView2.E2(trim2, new mw1(chatActivityEnterView2, (byte) 23));
                            return;
                        }
                        return;
                    } else if (i23 == 3) {
                        if (glcVar.c == 3 && glcVar.h != null && glcVar.H != null) {
                            Log.d("VoiceLive", "review: back to the text before the style");
                            glcVar.n = glcVar.H;
                            glcVar.H = null;
                            glcVar.h.setStyleIcon(null);
                            glcVar.h.setStyleLabel(null);
                            glcVar.h.r(glcVar.n);
                            return;
                        }
                        return;
                    } else if (i23 == 4) {
                        if (glcVar.h != null && glcVar.c == 2) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(jb6.M0(2131744998, null));
                            boolean x = DictationAsr.x();
                            if (x) {
                                i3 = 0;
                            }
                            int i26 = i3;
                            for (int i27 = 0; i27 < G.length; i27++) {
                                arrayList5.add(un3.r(G[i27]));
                                if (!x && i26 < 0 && DictationAsr.z(G[i27])) {
                                    i26 = i27 + 1;
                                }
                            }
                            zkc zkcVar = new zkc(glcVar, G, (byte) 0);
                            c cVar3 = glcVar.b;
                            jlc jlcVar3 = glcVar.h;
                            ArrayList w = glc.w(G, x, zkcVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar3.a;
                            if (chatActivityEnterView3.F3 != null) {
                                RectF rectF2 = new RectF();
                                rectF2.set(jlcVar3.R);
                                if (!rectF2.isEmpty()) {
                                    hlc hlcVar = new hlc(jlcVar3, jlcVar3.getContext(), (byte) 0);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                    layoutParams.gravity = 51;
                                    layoutParams.leftMargin = (int) (rectF2.left + jlcVar3.getLeft());
                                    layoutParams.topMargin = (int) (rectF2.top + jlcVar3.getTop());
                                    hlcVar.setAlpha(0.0f);
                                    chatActivityEnterView3.c2.addView(hlcVar, layoutParams);
                                    hlcVar.post(new qu(cVar3, hlcVar, new sz4(jlcVar3), arrayList5, w, i26, zkcVar));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i23 == 5) {
                        c cVar4 = glcVar.b;
                        if (glcVar.c == 2) {
                            cVar4.e();
                            yv1 yv1Var = cVar4.a.F3;
                            if (yv1Var != null) {
                                yv1Var.presentFragment(new ana());
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        RectF rectF3 = jlcVar2.f1;
                        float f = rectF3.left;
                        float f2 = rectF3.top;
                        float f3 = jlcVar2.j1;
                        new RectF(f, f2 + f3, rectF3.right, rectF3.bottom + f3);
                        if (!glcVar.n.trim().isEmpty() && (jlcVar = glcVar.h) != null) {
                            c cVar5 = glcVar.b;
                            alc alcVar = new alc(glcVar, (byte) 1);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF4 = new RectF();
                                jlcVar.l(rectF4);
                                hlc hlcVar2 = new hlc(jlcVar, jlcVar.getContext(), (byte) 1);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                layoutParams2.gravity = 51;
                                layoutParams2.leftMargin = (int) (rectF4.left + jlcVar.getLeft());
                                layoutParams2.topMargin = (int) (rectF4.top + jlcVar.getTop());
                                hlcVar2.setAlpha(0.0f);
                                chatActivityEnterView4.c2.addView(hlcVar2, layoutParams2);
                                hlcVar2.post(new da7(cVar5, hlcVar2, new nl9(jlcVar, (byte) 18), alcVar, jlcVar, (byte) 20));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 27:
                ioc iocVar = (ioc) this.c;
                int i28 = this.b;
                gm.c3(new bnc(iocVar, i28, ioc.h(iocVar.R, i28), (byte) 1));
                return;
            case 28:
                npc npcVar = (npc) this.c;
                int i29 = this.b;
                if (npcVar.r && !npcVar.y && i29 == npcVar.l0) {
                    npcVar.postDelayed(npcVar.m0, 500L);
                    return;
                }
                return;
            default:
                pqc pqcVar = (pqc) this.c;
                int i30 = this.b;
                ArrayList arrayList6 = pqcVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) pqcVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i30 < arrayList6.size() && i4 < split.length) {
                            ((nsc) arrayList6.get(i30)).setText(split[i4]);
                            i30++;
                            i4++;
                        }
                        pqcVar.d0();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    public ge7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
