package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.a4;
import bi.c4;
import hi.b8;
import hi.k8;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.jc;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.pd;
import org.telegram.messenger.rr;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.j91;
import org.telegram.ui.mw;
import org.telegram.ui.na0;
import org.telegram.ui.u40;
public final class d0 implements f, RequestDelegateTimestamp, rr, jc, a5, na0, lr, j2.g, org.telegram.ui.ActionBar.q1, u40, p4.c1, v5.e {
    public final int f1141a;
    public final long f1142b;
    public final Object f1143c;

    public d0(long j3, o5.i iVar) {
        this.f1141a = 14;
        this.f1142b = j3;
        this.f1143c = iVar;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        ui uiVar = (ui) this.f1143c;
        mi miVar = uiVar.f40448w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40386e2;
        long j3 = this.f1142b;
        if (miVar != chatAttachAlertPhotoLayout && miVar != uiVar.f40406l2) {
            if (!miVar.M(z10, i7, i10, j3, uiVar.g1())) {
                uiVar.B4 = true;
                uiVar.dismiss();
            }
            v12 = false;
        } else {
            v12 = uiVar.v1(z10, i7, i10, j3, uiVar.g1());
        }
        df dfVar = uiVar.f40381c2;
        if (dfVar != null) {
            dfVar.h(!v12);
            uiVar.f40381c2 = null;
        }
    }

    @Override
    public void a(String str) {
        k8 k8Var = (k8) this.f1143c;
        mp.u1(k8Var.f14927a0.f30170a).R1().r(this.f1142b, str, new b8(k8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f1143c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1142b));
        String str = iVar.f21736a;
        l5.d dVar = iVar.f21738c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21736a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.f1141a;
        Object obj = this.f1143c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                zy.C(((pd) obj).h.K1).r0(xy.d(messageMedia, this.f1142b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                zy.C(((int[]) obj)[0]).r0(xy.d(messageMedia, this.f1142b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void c(TLRPC.TL_error tL_error, String str) {
        x10 x10Var = (x10) this.f1143c;
        if (str == null) {
            p0.G(tL_error);
        }
        org.telegram.messenger.g0.h3(new i0(x10Var, str), Math.max(0L, (this.f1142b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public j2.h createDataSource() {
        return new e61(((i61) this.f1143c).h.createDataSource(), this.f1142b);
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((b21) this.f1143c).f33722s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.f1142b, false);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f1141a) {
            case 8:
                nm0 nm0Var = ((cx) this.f1143c).D0.f40510e0;
                a0.h hVar = nm0Var.f17523y0;
                long j3 = this.f1142b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    nm0Var.f17523y0.l(j3);
                    nm0Var.f17516u0.remove(g0Var);
                    nm0Var.f17519w0.remove(g0Var);
                    nm0Var.f17517v0.remove(g0Var);
                    nm0Var.f();
                    tr.a0(nm0Var.f17515t0).f27080a.c(new c4(nm0Var, j3, 11));
                    return;
                }
                return;
            default:
                ((mw) this.f1143c).f49994a.getMediaDataController().S1(this.f1142b);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        j91 j91Var = (j91) this.f1143c;
        org.telegram.ui.ActionBar.g2 g2Var = j91Var.f48941b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            mp messagesController = g2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.f1142b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, g2Var, false, j2Var, null, new a4(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        return e0Var.q(vVar, h9.i0.u((e2.l0) this.f1143c), 0, this.f1142b);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.f0 f0Var = (oi.f0) this.f1143c;
        hc p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f24451c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            f0Var.onComplete(new Pair(Long.valueOf(this.f1142b), bitmap));
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.c1 c1Var = (fi.c1) this.f1143c;
        long j10 = 0;
        if (tL_error == null) {
            if (c1Var.F != null && !c1Var.f11842x) {
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
                    tL_groupCallParticipant.peer = mp.u1(c1Var.f11836e).B1(c1Var.f11834b);
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
            nativeInstance2.onRequestTimeComplete(this.f1142b, j10);
        }
    }

    public d0(p0 p0Var, long j3, x10 x10Var) {
        this.f1141a = 0;
        this.f1142b = j3;
        this.f1143c = x10Var;
    }

    public d0(Object obj, long j3, int i7) {
        this.f1141a = i7;
        this.f1143c = obj;
        this.f1142b = j3;
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
