package oi;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.f60;
import org.telegram.ui.f9;
import org.telegram.ui.uy0;
import org.telegram.ui.w8;
import org.telegram.ui.x6;
public final class s2 implements Runnable {
    public final int f22315a;
    public final Object f22316b;
    public final Object f22317c;

    public s2(int i7, Object obj, Object obj2) {
        this.f22315a = i7;
        this.f22316b = obj;
        this.f22317c = obj2;
    }

    @Override
    public final void run() {
        View C1;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        int i7 = this.f22315a;
        int i10 = 0;
        Object obj = this.f22317c;
        Object obj2 = this.f22316b;
        switch (i7) {
            case 0:
                ((s3) obj2).f2((String) obj);
                return;
            case 1:
                s3 s3Var = (s3) obj2;
                b2 b2Var = (b2) obj;
                s3Var.getClass();
                long j3 = b2Var.f21946a;
                int i11 = b2Var.d;
                int i12 = b2Var.f21948c;
                ArrayList arrayList = s3Var.f22342t3;
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList.size()) {
                        if (((a) arrayList.get(i13)).f21906a != j3) {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                    }
                }
                if (i13 >= 0) {
                    View m10 = s3Var.f34606f3.m(i13);
                    if (m10 instanceof z5) {
                        z5 z5Var = (z5) m10;
                        z5Var.B();
                        e1 editText = z5Var.getEditText();
                        int length = editText.length();
                        editText.setSelection(Math.max(0, Math.min(i12, length)), Math.max(0, Math.min(i11, length)));
                        return;
                    } else if (m10 instanceof l5) {
                        l5 l5Var = (l5) m10;
                        e1 m11 = l5Var.m(b2Var.f21947b);
                        if (m11 == null) {
                            m11 = l5Var.m(0);
                        }
                        if (m11 != null) {
                            m11.O();
                            int length2 = m11.length();
                            m11.setSelection(Math.max(0, Math.min(i12, length2)), Math.max(0, Math.min(i11, length2)));
                            return;
                        }
                        return;
                    } else if (m10 instanceof i0) {
                        e1 captionEditText = ((i0) m10).getCaptionEditText();
                        captionEditText.O();
                        int length3 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i12, length3)), Math.max(0, Math.min(i11, length3)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                j3 j3Var = (j3) obj2;
                a aVar = (a) obj;
                if (aVar == null) {
                    j3Var.getClass();
                    C1 = null;
                } else {
                    C1 = j3Var.f22124e.C1(aVar);
                }
                if (C1 instanceof z5) {
                    z5 z5Var2 = (z5) C1;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(z5Var2.getEditText().length());
                    return;
                }
                return;
            case 3:
                x4 x4Var = (x4) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = x4Var.f22483e;
                boolean z11 = x4Var.d;
                w4 w4Var = x4Var.f22487s;
                if (!x4Var.f22489x) {
                    x4Var.E = 0;
                    if (!x4Var.f22482c && !z11 && !z10) {
                        if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                            x4Var.f22490y = true;
                            x4Var.e();
                            w4Var.c(photo);
                            return;
                        }
                    } else if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (z10) {
                            int i14 = x4Var.f22480a;
                            if (document.f28409id != 0 && document.access_hash != 0) {
                                x4Var.f22490y = true;
                                x4Var.e();
                                if (!TextUtils.isEmpty(x4Var.G) && fj.W2(document) && (w10 = w7.w(document.thumbs, 320, false, null, false)) != null) {
                                    w7.G(i14).e0(x4Var.G, w10);
                                    File file = new File(x4Var.G);
                                    w7.G(i14);
                                    org.telegram.messenger.g0.F(file, w7.J(w10, null, true, true));
                                }
                                w4Var.e(document);
                                return;
                            }
                            x4Var.f22490y = true;
                            x4Var.e();
                            w4Var.a();
                            return;
                        } else if (z11) {
                            x4Var.f22490y = true;
                            x4Var.e();
                            w4Var.f(document);
                            return;
                        } else {
                            x4Var.f22490y = true;
                            x4Var.e();
                            w4Var.d(document);
                            return;
                        }
                    }
                    x4Var.f22490y = true;
                    x4Var.e();
                    w4Var.a();
                    return;
                }
                return;
            case 4:
                x4 x4Var2 = (x4) obj2;
                String str = (String) obj;
                if (!x4Var2.f22489x && !x4Var2.f22490y) {
                    x4Var2.a(str);
                    return;
                }
                return;
            case 5:
                o5 m12 = ((l5) obj2).f22165w.m((TL_iv.pageTableCell) obj);
                if (m12 != null) {
                    e1 e1Var = m12.f22223a;
                    e1Var.O();
                    e1Var.setSelection(e1Var.length());
                    return;
                }
                return;
            case 6:
                ((VideoAds) obj2).lambda$showPremium$19((ug.z0) obj);
                return;
            case 7:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 8:
                ((VideoAds) obj2).lambda$show$16((x10) obj);
                return;
            case 9:
                uy0.e1((Context) obj2, null, false, (fi.h0) obj, null);
                return;
            case 10:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 12:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 13:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 14:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 15:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 16:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 17:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 18:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                return;
            case 19:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((q10) obj);
                return;
            case 20:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 21:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                vf.b bVar = (vf.b) obj;
                org.telegram.ui.t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.g4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 23:
                org.telegram.ui.e2.a((org.telegram.ui.e2) obj2, (SpannableString) obj);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) ((org.telegram.ui.m4) obj2).f49705b;
                if (!arrayList2.isEmpty()) {
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        p4Var.getMessagesController().T4(p4Var.Z() * 60, ((Long) arrayList2.get(i15)).longValue());
                    }
                    if (p4Var.Z() > 0) {
                        n10.u(gd.a0("AutodeleteTimerEnabledForChats", null, 2131753776, gd.c0(p4Var.Z() * 60), gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), lc.b0(p4Var), 2131624021, 36);
                        return;
                    } else {
                        lc.b0(p4Var).Q(2131624020, 36, gd.a0("AutodeleteTimerDisabledForChats", null, 2131753777, gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                        return;
                    }
                }
                return;
            case 25:
                org.telegram.ui.t5 t5Var = (org.telegram.ui.t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new org.telegram.ui.l5(t5Var, 0));
                }
                t5Var.f52170i0.animate().cancel();
                t5Var.f52170i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ki.n3(t5Var, 18));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                return;
            case 26:
                org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) obj2;
                org.telegram.messenger.t2 t2Var = (org.telegram.messenger.t2) obj;
                ArrayList arrayList3 = x5Var.f53589c;
                int i16 = 0;
                while (true) {
                    if (i16 < arrayList3.size()) {
                        if (((org.telegram.ui.w5) arrayList3.get(i16)).f52928c != null && ((org.telegram.ui.w5) arrayList3.get(i16)).f52928c.f26932a == t2Var.f26932a) {
                            i10 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                v4.f1 K = x5Var.f53588b.K(i10);
                if (K != null) {
                    View view = K.f59123a;
                    f60 f60Var = new f60(x5Var.getParentActivity(), x5Var);
                    f60Var.h(true);
                    f60Var.setParentWindow(org.telegram.ui.Components.b5.N(x5Var, f60Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    f60Var.setCallback(new org.telegram.ui.u5(x5Var, t2Var, 1));
                    return;
                }
                return;
            case 27:
                x6.c0((x6) obj2, (org.telegram.ui.ActionBar.u1) obj);
                return;
            case 28:
                yg0 yg0Var = new yg0((Context) obj2, gd.M0(2131748978, null), ((String[]) obj)[0], gd.M0(2131746314, null), false);
                yg0Var.J0();
                yg0Var.show();
                return;
            default:
                ((w8) obj2).f52967b.i0(((TLRPC.Message) i5.c.h(1, ((f9) obj).f47574c)).f28424id, 100);
                return;
        }
    }
}
