package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.c4;
import bi.e4;
import hi.c8;
import hi.l8;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.messenger.ic;
import org.telegram.messenger.kc;
import org.telegram.messenger.mr;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.qd;
import org.telegram.messenger.sr;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.j91;
import org.telegram.ui.mw;
import org.telegram.ui.na0;
import org.telegram.ui.u40;
public final class y implements b, RequestDelegateTimestamp, sr, kc, a5, na0, mr, j2.g, org.telegram.ui.ActionBar.q1, u40, p4.c1, v5.e {
    public final int f1593a;
    public final long f1594b;
    public final Object f1595c;

    public y(long j3, o5.i iVar) {
        this.f1593a = 14;
        this.f1594b = j3;
        this.f1595c = iVar;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        ui uiVar = (ui) this.f1595c;
        mi miVar = uiVar.f40425w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40363e2;
        long j3 = this.f1594b;
        if (miVar != chatAttachAlertPhotoLayout && miVar != uiVar.f40383l2) {
            if (!miVar.M(z10, i7, i10, j3, uiVar.g1())) {
                uiVar.B4 = true;
                uiVar.dismiss();
            }
            v12 = false;
        } else {
            v12 = uiVar.v1(z10, i7, i10, j3, uiVar.g1());
        }
        df dfVar = uiVar.f40358c2;
        if (dfVar != null) {
            dfVar.h(!v12);
            uiVar.f40358c2 = null;
        }
    }

    @Override
    public void a(String str) {
        l8 l8Var = (l8) this.f1595c;
        np.u1(l8Var.f14942a0.f30139a).R1().r(this.f1594b, str, new c8(l8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f1595c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1594b));
        String str = iVar.f21705a;
        l5.d dVar = iVar.f21707c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21705a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.f1593a;
        Object obj = this.f1595c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                az.C(((qd) obj).h.K1).r0(yy.d(messageMedia, this.f1594b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                az.C(((int[]) obj)[0]).r0(yy.d(messageMedia, this.f1594b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void c(TLRPC.TL_error tL_error, String str) {
        y10 y10Var = (y10) this.f1595c;
        if (str == null) {
            k0.G(tL_error);
        }
        org.telegram.messenger.g0.h3(new d0(y10Var, str), Math.max(0L, (this.f1594b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public j2.h createDataSource() {
        return new e61(((i61) this.f1595c).h.createDataSource(), this.f1594b);
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((a21) this.f1595c).f33265s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.f1594b, false);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f1593a) {
            case 8:
                mm0 mm0Var = ((cx) this.f1595c).D0.f39905e0;
                a0.h hVar = mm0Var.f17492y0;
                long j3 = this.f1594b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    mm0Var.f17492y0.l(j3);
                    mm0Var.f17485u0.remove(g0Var);
                    mm0Var.f17488w0.remove(g0Var);
                    mm0Var.f17486v0.remove(g0Var);
                    mm0Var.f();
                    ur.a0(mm0Var.f17484t0).f27214a.c(new e4(mm0Var, j3, 11));
                    return;
                }
                return;
            default:
                ((mw) this.f1595c).f49972a.getMediaDataController().S1(this.f1594b);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        j91 j91Var = (j91) this.f1595c;
        org.telegram.ui.ActionBar.g2 g2Var = j91Var.f48945b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            np messagesController = g2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.f1594b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, g2Var, false, j2Var, null, new c4(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.f1595c), 0, this.f1594b);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.e0 e0Var = (oi.e0) this.f1595c;
        ic p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f24668c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            e0Var.onComplete(new Pair(Long.valueOf(this.f1594b), bitmap));
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.c1 c1Var = (fi.c1) this.f1595c;
        long j10 = 0;
        if (tL_error == null) {
            if (c1Var.F != null && !c1Var.f11794x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i7 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, 5));
                }
                if (c1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                    TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                    c1Var.H = tL_groupCallParticipant;
                    tL_groupCallParticipant.peer = np.u1(c1Var.f11788e).B1(c1Var.f11786b);
                    c1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                    tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                    ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                    int size = arrayList.size();
                    while (i7 < size) {
                        TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                        i7++;
                        tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                    }
                    c1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                    TLRPC.GroupCallParticipant groupCallParticipant = c1Var.H;
                    TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                    tL_groupCallParticipantVideo.endpoint = "unified";
                    groupCallParticipant.videoEndpoint = "unified";
                    NativeInstance nativeInstance = c1Var.F;
                    NativeInstance.SsrcGroup[] d = fi.c1.d(tL_groupCallParticipantVideo);
                    c1Var.r(d);
                    nativeInstance.addIncomingVideoOutput(2, "unified", d, c1Var.I, n5.o(c1Var.H.peer));
                }
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = c1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f1594b, j10);
        }
    }

    public y(k0 k0Var, long j3, y10 y10Var) {
        this.f1593a = 0;
        this.f1594b = j3;
        this.f1595c = y10Var;
    }

    public y(Object obj, long j3, int i7) {
        this.f1593a = i7;
        this.f1595c = obj;
        this.f1594b = j3;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
