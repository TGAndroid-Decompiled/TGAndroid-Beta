package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.p;
import org.webrtc.AudioSource;
import org.webrtc.IceCandidate;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SdpObserver;
import org.webrtc.StatsObserver;
import org.webrtc.VideoSource;
public final class rm6 implements vm6, nx, ot2, pz6, fd, gc7, s69, qd3, jy2, NativeLifecycleLock.NativeCallable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeRunnable, f9b {
    public final byte a;
    public final Object b;
    public final Object c;

    public rm6(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.a = (byte) 10;
        this.c = notificationsCustomSettingsActivity;
        this.b = context;
    }

    @Override
    public final void B(gy2 gy2Var) {
        b18 b18Var = (b18) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = b18Var.Z[intValue];
        String str = gy2Var.d;
        if (intValue == 5) {
            b18Var.s = str;
        } else {
            b18Var.w = str;
        }
        editTextBoldCursor.setText(gy2Var.a);
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final int a(Object obj) {
        Context context = (Context) this.b;
        ko4 ko4Var = (ko4) this.c;
        nm6 nm6Var = (nm6) obj;
        String str = nm6Var.b;
        if ((!str.equals(ko4Var.t) && !str.equals(wm6.c(ko4Var))) || !nm6Var.c(context, ko4Var, false) || !nm6Var.d(ko4Var)) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                sz6 sz6Var = (sz6) obj3;
                c2c c2cVar = (c2c) obj2;
                og8 og8Var = (og8) obj;
                to5 to5Var = c2cVar.H;
                if (!to5Var.isEmpty()) {
                    b2c c = c2cVar.a().c();
                    v9c n = to5Var.values().n();
                    while (n.hasNext()) {
                        z1c z1cVar = (z1c) n.next();
                        t1c t1cVar = (t1c) sz6Var.d.n.get(z1cVar.a.b);
                        if (t1cVar != null && z1cVar.a.a == t1cVar.a) {
                            c.a(new z1c(t1cVar, z1cVar.b));
                        } else {
                            c.a(z1cVar);
                        }
                    }
                    c2cVar = c.b();
                }
                og8Var.M(c2cVar);
                return;
            case 3:
                sz6 sz6Var2 = (sz6) obj3;
                Surface surface = (Surface) obj2;
                og8 og8Var2 = (og8) obj;
                ((yx6) sz6Var2.a.get()).getClass();
                if (surface == null) {
                    og8Var2.Q(null);
                    sz6Var2.n = null;
                    return;
                }
                qz6 qz6Var = new qz6(surface);
                sz6Var2.n = qz6Var;
                og8Var2.Q(qz6Var);
                return;
            case 4:
            case 5:
            default:
                lp lpVar = (lp) obj3;
                ((zz6) obj).j(lpVar.b, (vz6) lpVar.c, (jt6) obj2);
                return;
            case 6:
                xw6 xw6Var = (xw6) obj2;
                og8 og8Var3 = (og8) obj;
                yx6 yx6Var = (yx6) ((sz6) obj3).a.get();
                if (yx6Var != null && !yx6Var.i()) {
                    do5 c2 = fne.c(Boolean.TRUE);
                    ux6 ux6Var = new ux6(yx6Var, xw6Var, false);
                    c2.b(new xs4(c2, ux6Var, (byte) 0), new pe2(yx6Var, (byte) 3));
                    return;
                }
                return;
        }
    }

    @Override
    public final x76 apply(Object obj) {
        vw6 vw6Var = (vw6) obj;
        ((yx6) this.b).s((xw6) this.c, vw6Var);
        return fne.c(vw6Var);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        pt2 pt2Var = (pt2) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (pt2Var != null) {
            pt2Var.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(u9b u9bVar, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, z3b z3bVar, s8b s8bVar) {
        boolean z5;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 27:
                o68 o68Var = (o68) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = uc7.s1(o68Var.m2).j1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = u9bVar.b;
                ConnectionsManager.getInstance(o68Var.m2).sendRequest(tL_stories_editStory, new au0(o68Var, z3bVar, storyItem, u9bVar, (byte) 14));
                return;
            default:
                j68 j68Var = (j68) obj2;
                w9b w9bVar = (w9b) obj;
                o68 o68Var2 = j68Var.x;
                n68 n68Var = o68Var2.y1;
                TL_stories.StoryItem storyItem2 = n68Var.a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != z3) {
                    uc7.s1(o68Var2.m2).O1().r0(o68Var2.l1, o68Var2.f1, z3, null);
                }
                TL_stories.StoryItem storyItem3 = n68Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(o68Var2.m2).sendRequest(togglegroupcallsettings, new ol7(j68Var, w9bVar, (byte) 7));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$getStats$31;
        RtpSender lambda$addTrack$24;
        RtpTransceiver lambda$addTransceiver$28;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 18:
                lambda$getStats$31 = ((PeerConnection) obj2).lambda$getStats$31((StatsObserver) obj, j);
                return lambda$getStats$31;
            case 20:
                lambda$addTrack$24 = ((PeerConnection) obj2).lambda$addTrack$24((List) obj, j);
                return lambda$addTrack$24;
            case 23:
                lambda$addTransceiver$28 = ((PeerConnection) obj2).lambda$addTransceiver$28((RtpTransceiver.RtpTransceiverInit) obj, j);
                return lambda$addTransceiver$28;
            case 25:
                return PeerConnectionFactory.l((AudioSource) obj2, (String) obj, j);
            default:
                return PeerConnectionFactory.h((VideoSource) obj2, (String) obj, j);
        }
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ((NotificationsCustomSettingsActivity) this.c).j0((Context) this.b, view, i, f, f2);
    }

    @Override
    public final void f(vw8 vw8Var) {
        ((qd3) this.b).f(vw8Var);
        ((qd3) this.c).f(vw8Var);
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        byte b = this.a;
        Object obj = this.c;
        pz6 pz6Var = (pz6) this.b;
        switch (b) {
            case 4:
                hz6 hz6Var = (hz6) obj;
                if (yx6Var.i()) {
                    return fne.c(new gaa(-100));
                }
                return gcc.h0((x76) pz6Var.j(yx6Var, xw6Var, i), new fu2(yx6Var, xw6Var, hz6Var, (byte) 16));
            default:
                nz6 nz6Var = (nz6) obj;
                if (yx6Var.i()) {
                    return fne.c(new gaa(-100));
                }
                return gcc.h0((x76) pz6Var.j(yx6Var, xw6Var, i), new fu2(yx6Var, xw6Var, nz6Var, (byte) 17));
        }
    }

    @Override
    public final void run() {
        ((PeerConnection) this.b).lambda$setLocalDescription$6((SdpObserver) this.c);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((boolean[]) obj)[0] = true;
                ((r17) obj2).Q();
                return;
            case 9:
            case 10:
            case 11:
            case 14:
            default:
                j68 j68Var = (j68) obj2;
                w96 w96Var = ((lcb) obj).B0;
                if (w96Var != null) {
                    if (!w96Var.w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = w96Var.f;
                        ConnectionsManager.getInstance(w96Var.e).sendRequest(discardgroupcall, new t96(w96Var, (byte) 2));
                        w96Var.h();
                        return;
                    }
                    return;
                }
                j68Var.x.u0();
                return;
            case 12:
                b18 b18Var = (b18) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!b18Var.w0) {
                    b18Var.t1.clear();
                }
                b18Var.u1.clear();
                j08 j08Var = b18Var.C1;
                j08Var.d.c1(b18Var.F, b18Var.G, b18Var.H, zArr[0], null, null, j08Var.b);
                b18Var.finishFragment();
                return;
            case 13:
                int[] iArr = ((b18) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(ob6.M0(2131747221, null));
                return;
            case 15:
                ((b18) obj2).u1((TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 16:
                p pVar = (p) obj2;
                pVar.c0 = true;
                pVar.b0.email_unconfirmed_pattern = (String) obj;
                pVar.P0();
                return;
        }
    }

    public rm6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object call() {
        Boolean lambda$removeTrack$27;
        Boolean lambda$setConfiguration$12;
        Boolean lambda$removeIceCandidates$15;
        Boolean lambda$addIceCandidate$13;
        byte b = this.a;
        Object obj = this.c;
        PeerConnection peerConnection = (PeerConnection) this.b;
        switch (b) {
            case 17:
                lambda$removeTrack$27 = peerConnection.lambda$removeTrack$27((RtpSender) obj);
                return lambda$removeTrack$27;
            case 18:
            case 20:
            default:
                lambda$addIceCandidate$13 = peerConnection.lambda$addIceCandidate$13((IceCandidate) obj);
                return lambda$addIceCandidate$13;
            case 19:
                lambda$setConfiguration$12 = peerConnection.lambda$setConfiguration$12((PeerConnection.RTCConfiguration) obj);
                return lambda$setConfiguration$12;
            case 21:
                lambda$removeIceCandidates$15 = peerConnection.lambda$removeIceCandidates$15((IceCandidate[]) obj);
                return lambda$removeIceCandidates$15;
        }
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
